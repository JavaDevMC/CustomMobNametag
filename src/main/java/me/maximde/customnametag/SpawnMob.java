package me.maximde.customnametag;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;

public class SpawnMob {
    private double maxHP = 140;
    private String name = ChatColor.RED+"Zombie Bandit";
    private int level = 5;
    private EntityType entityType = EntityType.ZOMBIE;

    public void createMob(Location location) {
        LivingEntity customEntity = (LivingEntity) Bukkit.getWorld(location.getWorld().getName()).spawnEntity(location, entityType);
        customEntity.setCustomName(""+ChatColor.GRAY+level+" "+name+" "+ ChatColor.YELLOW+customEntity.getHealth()+ChatColor.GREEN+"/"+maxHP+" "+ChatColor.RED+"♥");
        customEntity.setCustomNameVisible(true);
        customEntity.setMaxHealth(maxHP);
        customEntity.setHealth(maxHP);
        customEntity.setRemoveWhenFarAway(false);
    }

}