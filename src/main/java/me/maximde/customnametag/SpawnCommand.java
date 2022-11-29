package me.maximde.customnametag;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class SpawnCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
        if(!(sender instanceof Player)) return false;
        Player player = (Player) sender;
        new SpawnMob().createMob(player.getLocation());
        player.sendMessage("§aMob spawned!");
        return false;
    }
}


