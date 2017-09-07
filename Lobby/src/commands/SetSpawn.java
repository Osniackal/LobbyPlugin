package commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class SetSpawn implements LobbyCommand {
    @Override
    public boolean execute(CommandSender sender, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Location playerLocation = player.getLocation();
            Plugin plugin = Bukkit.getPluginManager().getPlugin("lobby");
            plugin.getConfig().set("spawn.x", playerLocation.getBlockX());
            plugin.getConfig().set("spawn.y", playerLocation.getBlockY());
            plugin.getConfig().set("spawn.z", playerLocation.getBlockZ());
            plugin.getConfig().set("spawn.yaw", (double)playerLocation.getYaw());
            plugin.getConfig().set("spawn.pitch", (double)playerLocation.getPitch());
            plugin.saveConfig();
            return true;

        } else {
            return false;

        }

    }
}
