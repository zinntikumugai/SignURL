/**
 *
 */
package com.github.zinntikumugai.signurl;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.zinntikumugai.signurl.commands.SignURL_Commands_help;

/**
 * @author zinntikumugai
 * @Licence GPL v3.0
 *
 */
public class SignURL_Command implements CommandExecutor {

	private SignURL_Commands_help command_help;

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		Player player = null;

		//対応コマンド以外終了
		if( !command.getName().equalsIgnoreCase("signurl") ) {
			if( !command.getName().equalsIgnoreCase("su") ) {
				return false;
			}
		}
		switch(args[0]) {
			case "help":
			case "?":
				command_help.onCommand(sender, command, label, args);
				break;

			case "list":
			case "add":
			case "set":
			case "view":
			case "remove":

		}

		return false;
	}

}
