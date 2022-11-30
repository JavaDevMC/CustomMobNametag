package me.maximde.customnametag;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.plugin.java.JavaPlugin;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Main extends JavaPlugin implements Listener {

    public static List<CustomMob> mobList = new ArrayList<>();

    @Override
    public void onEnable() {
        Bukkit.getPluginCommand("spawnmob").setExecutor(new SpawnCommand());
    }

    @EventHandler
    public void onDamage(EntityDamageEvent e) {
        if(!(e.getEntity() instanceof LivingEntity)) return;
        LivingEntity entity = (LivingEntity) e.getEntity();
        for(CustomMob m : mobList) {
            if(entity == m) {
                m.updateHP();
            }
        }
    }

}
