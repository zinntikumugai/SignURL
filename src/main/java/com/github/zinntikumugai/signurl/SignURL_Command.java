/**
 *
 */
package com.github.zinntikumugai.signurl;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * @author zinntikumugai
 * @Licence GPL v3.0
 *
 */
public class SignURL_Command implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		Player player = null;

		//対応コマンド以外終了
		if( !command.getName().equalsIgnoreCase("signurl") ) {
			if( !command.getName().equalsIgnoreCase("su") ) {
				return false;
			}
		}


		if(sender instanceof Player) {
			player = (Player)sender;
		}else {

		}

		return false;
	}

}
