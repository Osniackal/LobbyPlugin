package listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.plugin.Plugin;

public class SpawnListener implements Listener{
    @EventHandler
    public void onRespawn(PlayerRespawnEvent respawnEvent) {
        Plugin plugin = Bukkit.getPluginManager().getPlugin("lobby");
        double x = plugin.getConfig().getInt("spawn.x");
        double y = plugin.getConfig().getInt("spawn.y");
        double z = plugin.getConfig().getInt("spawn.z");
        float yaw = (float) plugin.getConfig().getDouble("spawn.yaw");
        float pitch = (float) plugin.getConfig().getDouble("spawn.pitch");
        respawnEvent.setRespawnLocation(new Location(respawnEvent.getRespawnLocation().getWorld(), x, y, z, yaw, pitch));

    }

}
