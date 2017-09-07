package commands;

import org.bukkit.command.CommandSender;

interface Command {
    boolean execute(CommandSender sender, String[] args);

}
