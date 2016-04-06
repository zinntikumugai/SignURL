/**
 *
 */
package com.github.zinntikumugai.signurl;

import java.io.File;
import java.util.List;
import java.util.logging.Logger;

import org.bukkit.configuration.file.FileConfiguration;

/**
 * @author zinntikumugai
 * @Licence GPL v3.0
 *
 */
public class SignURL_Config {

	private SignURL signurl;
	final private Logger log;

	private String prefixskipname;
	private String prefixname;
	private String prefixcoler;

	private List<String> urls;

	public FileConfiguration config = null;

	public SignURL_Config(final SignURL signurl) {
		this.signurl = signurl;
		this.log = signurl.getlog();

		reloadconfig();
	}

	public void reloadconfig() {

		//コンフィグファイルが無いならデフォからコピる
		if( !(new File(signurl.getDataFolder() + File.separator + "config.yml").exists())) {
			signurl.saveDefaultConfig();
			log.info("Load Default Config");
		}

		//コンフィグ読み込み
		config = signurl.getConfig();

		//各配列にコンフィグデータ読み取り
		prefixskipname = config.getString("Prefix.SkipName");
		prefixname = config.getString("Prefix.Name");
		prefixcoler = config.getString("Prefix.Coler");
		urls = config.getStringList("URLs");
	}

	public String prefixskipname() {
		return prefixskipname;
	}
	public String prefixname() {
		return prefixname;
	}
	public String prefixcoler() {
		return prefixcoler;
	}
	public List<String> urls() {
		return urls;
	}
}
