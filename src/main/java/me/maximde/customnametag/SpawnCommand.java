package me.maximde.customnametag;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;


public class SpawnCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
        if(!(sender instanceof Player)) return false;
        Player player = (Player) sender;
        if(args.length <= 3) {
            player.sendMessage(ChatColor.GREEN+"/spawnmob <level> <name> <maxHP> <mobType>");
        } else {
            new SpawnMob().createMob(player.getLocation(), Integer.parseInt(args[0]), args[1], Integer.parseInt(args[2]), EntityType.fromName(args[3]));
            player.sendMessage(ChatColor.GREEN+"Mob spawned");
        }
        return false;
    }
}


