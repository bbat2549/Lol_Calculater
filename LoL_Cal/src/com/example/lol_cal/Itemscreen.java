package com.example.lol_cal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Itemscreen extends Activity {
	Button dblade, dring, dshield, BotRK, Randuin, Visage;
	int Health, Mana, Move;
	double Health_reg, Mana_reg, Attack_dam, Attack_speed, Armor, Magic_res;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_itemselect);
		dblade = (Button) findViewById(R.id.dblade);
		dring = (Button) findViewById(R.id.dring);
		dshield = (Button) findViewById(R.id.dshield);
		BotRK = (Button) findViewById(R.id.BotRK);
		Randuin = (Button) findViewById(R.id.Randuin);
		Visage = (Button) findViewById(R.id.Visage);
		dblade.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent ChampscreenIntent = new Intent();
				ChampscreenIntent.putExtra("Health", Health);
				ChampscreenIntent.putExtra("Health_Reg", Health_reg);
				ChampscreenIntent.putExtra("Mana", Mana);
				ChampscreenIntent.putExtra("Mana_Reg", Mana_reg);
				ChampscreenIntent.putExtra("Attack_Dam", Attack_dam);
				ChampscreenIntent.putExtra("Attack_Speed", Attack_speed);
				ChampscreenIntent.putExtra("Armor", Armor);
				ChampscreenIntent.putExtra("Magic_Res", Magic_res);
				ChampscreenIntent.putExtra("Mov_Speed", Move);
				ChampscreenIntent.putExtra("Health_item", 70);
				ChampscreenIntent.putExtra("Health_reg_item", 0);
				ChampscreenIntent.putExtra("Mana_item", 0);
				ChampscreenIntent.putExtra("Mana_reg_item", 0);
				ChampscreenIntent.putExtra("Attack_dam_item", 7);
				ChampscreenIntent.putExtra("Attack_speed_item", 0);
				ChampscreenIntent.putExtra("Armor_item", 0);
				ChampscreenIntent.putExtra("Magic_res_item", 0);
				ChampscreenIntent.putExtra("Move_speed_item", 0);
				ChampscreenIntent.putExtra("item", "dblade");
				ChampscreenIntent.putExtra("item_num", 1);
				setResult(0, ChampscreenIntent);
				finish();
			}});
		dshield.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent ChampscreenIntent = new Intent();
				ChampscreenIntent.putExtra("Health", Health);
				ChampscreenIntent.putExtra("Health_Reg", Health_reg);
				ChampscreenIntent.putExtra("Mana", Mana);
				ChampscreenIntent.putExtra("Mana_Reg", Mana_reg);
				ChampscreenIntent.putExtra("Attack_Dam", Attack_dam);
				ChampscreenIntent.putExtra("Attack_Speed", Attack_speed);
				ChampscreenIntent.putExtra("Armor", Armor);
				ChampscreenIntent.putExtra("Magic_Res", Magic_res);
				ChampscreenIntent.putExtra("Mov_Speed", Move);
				ChampscreenIntent.putExtra("Health_item", 80);
				ChampscreenIntent.putExtra("Health_reg_item", 6);
				ChampscreenIntent.putExtra("Mana_item", 0);
				ChampscreenIntent.putExtra("Mana_reg_item", 0);
				ChampscreenIntent.putExtra("Attack_dam_item", 0);
				ChampscreenIntent.putExtra("Attack_speed_item", 0);
				ChampscreenIntent.putExtra("Armor_item", 0);
				ChampscreenIntent.putExtra("Magic_res_item", 0);
				ChampscreenIntent.putExtra("Move_speed_item", 0);
				ChampscreenIntent.putExtra("item", "dshield");
				ChampscreenIntent.putExtra("item_num", 1);
				setResult(0, ChampscreenIntent);
				finish();
			}});
		dring.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent ChampscreenIntent = new Intent();
				ChampscreenIntent.putExtra("Health", Health);
				ChampscreenIntent.putExtra("Health_Reg", Health_reg);
				ChampscreenIntent.putExtra("Mana", Mana);
				ChampscreenIntent.putExtra("Mana_Reg", Mana_reg);
				ChampscreenIntent.putExtra("Attack_Dam", Attack_dam);
				ChampscreenIntent.putExtra("Attack_Speed", Attack_speed);
				ChampscreenIntent.putExtra("Armor", Armor);
				ChampscreenIntent.putExtra("Magic_Res", Magic_res);
				ChampscreenIntent.putExtra("Mov_Speed", Move);
				ChampscreenIntent.putExtra("Health_item", 60);
				ChampscreenIntent.putExtra("Health_reg_item", 0);
				ChampscreenIntent.putExtra("Mana_item", 0);
				ChampscreenIntent.putExtra("Mana_reg_item", 3);
				ChampscreenIntent.putExtra("Attack_dam_item", 0);
				ChampscreenIntent.putExtra("Attack_speed_item", 0);
				ChampscreenIntent.putExtra("Armor_item", 0);
				ChampscreenIntent.putExtra("Magic_res_item", 0);
				ChampscreenIntent.putExtra("Move_speed_item", 0);
				ChampscreenIntent.putExtra("item", "dring");
				ChampscreenIntent.putExtra("item_num", 1);
				setResult(0, ChampscreenIntent);
				finish();
			}});
		BotRK.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent ChampscreenIntent = new Intent();
				ChampscreenIntent.putExtra("Health", Health);
				ChampscreenIntent.putExtra("Health_Reg", Health_reg);
				ChampscreenIntent.putExtra("Mana", Mana);
				ChampscreenIntent.putExtra("Mana_Reg", Mana_reg);
				ChampscreenIntent.putExtra("Attack_Dam", Attack_dam);
				ChampscreenIntent.putExtra("Attack_Speed", Attack_speed);
				ChampscreenIntent.putExtra("Armor", Armor);
				ChampscreenIntent.putExtra("Magic_Res", Magic_res);
				ChampscreenIntent.putExtra("Mov_Speed", Move);
				ChampscreenIntent.putExtra("Health_item", 0);
				ChampscreenIntent.putExtra("Health_reg_item", 0);
				ChampscreenIntent.putExtra("Mana_item", 0);
				ChampscreenIntent.putExtra("Mana_reg_item", 0);
				ChampscreenIntent.putExtra("Attack_dam_item", 25);
				ChampscreenIntent.putExtra("Attack_speed_item", .40);
				ChampscreenIntent.putExtra("Armor_item", 0);
				ChampscreenIntent.putExtra("Magic_res_item", 0);
				ChampscreenIntent.putExtra("Move_speed_item", 0);
				ChampscreenIntent.putExtra("item", "BotRK");
				ChampscreenIntent.putExtra("item_num", 1);
				setResult(0, ChampscreenIntent);
				finish();
			}});
		Randuin.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent ChampscreenIntent = new Intent();
				ChampscreenIntent.putExtra("Health", Health);
				ChampscreenIntent.putExtra("Health_Reg", Health_reg);
				ChampscreenIntent.putExtra("Mana", Mana);
				ChampscreenIntent.putExtra("Mana_Reg", Mana_reg);
				ChampscreenIntent.putExtra("Attack_Dam", Attack_dam);
				ChampscreenIntent.putExtra("Attack_Speed", Attack_speed);
				ChampscreenIntent.putExtra("Armor", Armor);
				ChampscreenIntent.putExtra("Magic_Res", Magic_res);
				ChampscreenIntent.putExtra("Mov_Speed", Move);
				ChampscreenIntent.putExtra("Health_item", 500);
				ChampscreenIntent.putExtra("Health_reg_item", 0);
				ChampscreenIntent.putExtra("Mana_item", 0);
				ChampscreenIntent.putExtra("Mana_reg_item", 0);
				ChampscreenIntent.putExtra("Attack_dam_item", 0);
				ChampscreenIntent.putExtra("Attack_speed_item", 0);
				ChampscreenIntent.putExtra("Armor_item", 70);
				ChampscreenIntent.putExtra("Magic_res_item", 0);
				ChampscreenIntent.putExtra("Move_speed_item", 0);
				ChampscreenIntent.putExtra("item", "Randuin");
				ChampscreenIntent.putExtra("item_num", 1);
				setResult(0, ChampscreenIntent);
				finish();
			}});
		Visage.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent ChampscreenIntent = new Intent();
				ChampscreenIntent.putExtra("Health", Health);
				ChampscreenIntent.putExtra("Health_Reg", Health_reg);
				ChampscreenIntent.putExtra("Mana", Mana);
				ChampscreenIntent.putExtra("Mana_Reg", Mana_reg);
				ChampscreenIntent.putExtra("Attack_Dam", Attack_dam);
				ChampscreenIntent.putExtra("Attack_Speed", Attack_speed);
				ChampscreenIntent.putExtra("Armor", Armor);
				ChampscreenIntent.putExtra("Magic_Res", Magic_res);
				ChampscreenIntent.putExtra("Mov_Speed", Move);
				ChampscreenIntent.putExtra("Health_item", 400);
				ChampscreenIntent.putExtra("Health_reg_item", 20);
				ChampscreenIntent.putExtra("Mana_item", 0);
				ChampscreenIntent.putExtra("Mana_reg_item", 0);
				ChampscreenIntent.putExtra("Attack_dam_item", 7);
				ChampscreenIntent.putExtra("Attack_speed_item", 0);
				ChampscreenIntent.putExtra("Armor_item", 0);
				ChampscreenIntent.putExtra("Magic_res_item", 55);
				ChampscreenIntent.putExtra("Move_speed_item", 0);
				ChampscreenIntent.putExtra("item", "Visage");
				ChampscreenIntent.putExtra("item_num", 1);
				setResult(0, ChampscreenIntent);
				finish();
			}});
	}
}