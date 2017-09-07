package plugin;

import commands.LobbyCommand;
import commands.SetSpawn;
import commands.Spawn;
import listeners.SpawnListener;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public class LobbyMain extends JavaPlugin {

    HashMap<String, LobbyCommand> commands;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return commands.get(command.getName().toLowerCase()).execute(sender, args);

    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new SpawnListener(), this);
        commands = new HashMap<>();
        commands.put("spawn", new Spawn());
        commands.put("setspawn", new SetSpawn());

    }
}
