/**
 *
 */
package com.github.zinntikumugai.signurl;

import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 * @author zinntikumugai
 * @Licence GPL v3.0
 *
 */
public class SignURL_Listerer implements Listener {
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event) {

		//右クリック以外終了
		if( !(event.getAction().equals(Action.RIGHT_CLICK_BLOCK)))
			return;

		//立て看板と張り付き看板以外をクリックしたなら終了
		if( !(event.getClickedBlock().equals(Material.WALL_SIGN)) && !(event.getClickedBlock().equals(Material.SIGN_POST)) )
			return;

		//看板としてクリックしたブロックを取得
		Sign sign = (Sign)event.getClickedBlock();
		//看板に書かれている文字を取得
		String[] line = sign.getLines();

		//一行目に書かれている文字が[URL]"以外だったら終了
		if( !(line[0].equals("[URL]")) )
			return;

		//プレイヤーに対して出力
		Player player = event.getPlayer();
		player.sendMessage("");

	}

	public void onPestSign(SignChangeEvent event) {
		//看板に書かれた文字列を取得
		String[] line = event.getLines();


	}
}
