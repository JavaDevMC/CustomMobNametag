package me.maximde.customnametag;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;

public class SpawnMob {
    /*private double maxHP = 140;
    private String name = ChatColor.RED+"Zombie Bandit";
    private int level = 5;
    private EntityType entityType = EntityType.ZOMBIE;*/

    public void createMob(Location location, int level, String name, double maxHP, EntityType entityType) {
        LivingEntity customEntity = (LivingEntity) Bukkit.getWorld(location.getWorld().getName()).spawnEntity(location, entityType);
        customEntity.setCustomNameVisible(true);
        customEntity.setMaxHealth(maxHP);
        customEntity.setHealth(maxHP);
        customEntity.setCustomName(""+ChatColor.GRAY+"Lv"+level+" "+name+" "+ ChatColor.YELLOW+customEntity.getHealth()+ChatColor.GREEN+"/"+maxHP+" "+ChatColor.RED+"\u2665");
        customEntity.setRemoveWhenFarAway(false);
    }

}
