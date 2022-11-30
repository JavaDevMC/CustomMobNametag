package me.maximde.customnametag;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;

public class CustomMob {

    private String name;
    private EntityType entityType;
    private double maxHP;
    private int level;

    public LivingEntity getCustomEntity() {
        return customEntity;
    }

    private LivingEntity customEntity;

    public CustomMob(int level, String name, double maxHP, EntityType entityType) {
        this.name = name;
        this.entityType = entityType;
        this.maxHP = maxHP;
        this.level = level;
        Main.mobList.add(this);
    }

    public void spawnMob(Location location) {
        customEntity = (LivingEntity) Bukkit.getWorld(location.getWorld().getName()).spawnEntity(location, entityType);
        customEntity.setMaxHealth(maxHP);
        customEntity.setHealth(maxHP);
        customEntity.setCustomName(""+ ChatColor.GRAY+"Lv"+level+" "+name+" "+ ChatColor.YELLOW+customEntity.getHealth()+ChatColor.GREEN+"/"+maxHP+" "+ChatColor.RED+"\u2665");
        customEntity.setCustomNameVisible(true);
        customEntity.setRemoveWhenFarAway(false);
    }

    public void updateHP() {
        if(customEntity == null) return;
        customEntity.setCustomName(""+ ChatColor.GRAY+"Lv"+level+" "+name+" "+ ChatColor.YELLOW+customEntity.getHealth()+ChatColor.GREEN+"/"+maxHP+" "+ChatColor.RED+"\u2665");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public double getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(double maxHP) {
        this.maxHP = maxHP;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
