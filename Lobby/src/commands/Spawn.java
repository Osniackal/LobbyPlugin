package commands;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Spawn implements Command{

    @Override
    public boolean execute(CommandSender sender, String[] args) {
        if (sender instanceof Player) {
            return false;

        }
        ((Player) sender).teleport(Bukkit.getServer().getWorld("lobby").getSpawnLocation());
        return true;

    }

}
