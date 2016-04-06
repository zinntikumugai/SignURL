/**
 *
 */
package com.github.zinntikumugai.signurl;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author zinntikumugai
 * @Licence GPL v3.0
 *
 */
public class SignURL extends JavaPlugin {

	private SignURL_Command command;

	public void onEnable() {

		//コマンド宣言
		getCommand("signurl").setExecutor(command);
		getCommand("su").setExecutor(command);

		getServer().getPluginManager().registerEvents(new SignURL_Listerer(), this);
	}

	public Logger getlog() {
		return getlog();
	}

	public SignURL_Config reload() {
		return reload();
	}

	public void onDisable() {

	}
}
