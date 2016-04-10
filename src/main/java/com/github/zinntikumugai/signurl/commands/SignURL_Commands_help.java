/**
 *
 */
package com.github.zinntikumugai.signurl.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * @author zinntikumugai
 * @Licence GPL v3.0
 */
public class SignURL_Commands_help {
	
	private String message = "======== SignURL ========\n"
							+ "";
	

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
	
		Player player = null;
		Command s = command;
		
		
		if(sender instanceof Player) {
			player = (Player)sender;
			
			player.sendMessage("");
			
		}else {
			
			sender.sendMessage("");
			
		}
		
		return false;

	}
}
