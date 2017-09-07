package commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Spawn implements LobbyCommand {

    @Override
    public boolean execute(CommandSender sender, String[] args) {
        if ((sender instanceof Player)) {

            Plugin plugin = Bukkit.getPluginManager().getPlugin("lobby");
            double x = plugin.getConfig().getInt("spawn.x");
            double y = plugin.getConfig().getInt("spawn.y");
            double z = plugin.getConfig().getInt("spawn.z");
            float yaw = (float) plugin.getConfig().getDouble("spawn.yaw");
            float pitch = (float) plugin.getConfig().getDouble("spawn.pitch");
            Player player = (Player) sender;
            player.teleport(new Location(player.getWorld(), x, y, z, yaw, pitch));

            return true;
        } else {
            return false;

        }

    }

}
