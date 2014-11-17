package com.example.lol_cal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Champscreen extends Activity {
	ImageView Champion;
	TextView champName, champHealth, champHealthRegen, champMana, champManaRegen, champRange,
			 champAttackDam, champAttackSpeed, champArmor, champMagicRes, champMoveSpeed;
	Button dblade, dshield, dring, BothRK, Randuins, Visage;
	int Health, Mana, Move; 
	int Health_item = 0, Mana_item = 0, Move_item = 0, dblade_p = 0, dring_p = 0,
		dshield_p = 0, BothRK_p = 0, Randuins_p = 0, Visage_p = 0;
	double Health_reg, Mana_reg, Attack_dam, Attack_speed, Armor, Magic_res, base_as;
	double Health_reg_item = 0, Mana_reg_item = 0, Attack_dam_item = 0, 
	       Attack_speed_item = 0, Armor_item = 0, Magic_res_item = 0;
	String Champion_name;
	Activity champScreen = this;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_champscreen);
		Champion = (ImageView) findViewById(R.id.Champion);
		champName = (TextView) findViewById(R.id.Champ_name);
		champHealth = (TextView) findViewById(R.id.Heath);
		champHealthRegen = (TextView) findViewById(R.id.Health_Regen);
		champMana = (TextView) findViewById(R.id.Mana);
		champManaRegen = (TextView) findViewById(R.id.Mana_Regen);
		champRange = (TextView) findViewById(R.id.Range);
		champAttackDam = (TextView) findViewById(R.id.Attack_Dam);
		champAttackSpeed = (TextView) findViewById(R.id.Attack_Speed);
		champArmor = (TextView) findViewById(R.id.Armor);
		champMagicRes = (TextView) findViewById(R.id.Magic_res);
		champMoveSpeed = (TextView) findViewById(R.id.Move_Speed);
		dblade = (Button) findViewById(R.id.dblade);
		dring = (Button) findViewById(R.id.dring);
		dshield = (Button) findViewById(R.id.dshield);
		BothRK = (Button) findViewById(R.id.BotRK);
		Randuins = (Button) findViewById(R.id.Randuins);
		Visage = (Button) findViewById(R.id.Visage);
		Intent i = getIntent();
		Health = i.getIntExtra("Health",0);
		Health_reg = i.getDoubleExtra("Health_Reg", 0);
		Attack_dam = i.getDoubleExtra("Attack_Dam",0);
		Attack_speed = i.getDoubleExtra("Attack_Speed",0);
		base_as = i.getDoubleExtra("Attack_Speed",0);
		Armor = i.getDoubleExtra("Armor", 0);
		Magic_res = i.getDoubleExtra("Magic_Res",0);
		Move = i.getIntExtra("Mov_Speed", 0);
		Mana = i.getIntExtra("Mana", 0);
		Mana_reg = i.getDoubleExtra("Mana_Reg",0);
		Champion_name = i.getStringExtra("Champ");
		champName.setText(Champion_name);
		champHealth.setText("Helath: " + (Health+Health_item));
		champHealthRegen.setText("Health Regen: " + (Health_reg+Health_reg_item));
		champRange.setText("Range: "+i.getStringExtra("Range"));
		champAttackDam.setText("Attack Dam: " + (Attack_dam+Attack_dam_item));
		champAttackSpeed.setText("Attack Speed: " + (Attack_speed+Attack_speed_item) + "%");
		champArmor.setText("Armor: " + (Armor+Armor_item));
		champMagicRes.setText("Magic Res: " + (Magic_res+Magic_res_item));
		champMoveSpeed.setText("Move Speed: " + (Move+Move_item));
		if (Champion_name.toString().startsWith("Aatrox")){
			Champion.setImageResource(0x7f020000);
			champMana.setText(i.getStringExtra("Mana"));
			champManaRegen.setText(i.getStringExtra("Mana_Reg"));
		}
		
		else if (Champion_name.toString().startsWith("Karma")){
			Champion.setImageResource(0x7f020007);
			champMana.setText("Mana: "+ (Mana+Mana_item));
			champManaRegen.setText("Mana Regen: "+ (Mana_reg+Mana_reg_item));
		}
		
		else if (Champion_name.toString().startsWith("Kayle")){
			Champion.setImageResource(0x7f020009);
			champMana.setText("Mana: "+ (Mana+Mana_item));
			champManaRegen.setText("Mana Regen: "+ (Mana_reg+Mana_reg_item));
		}
		
		else if (Champion_name.toString().startsWith("Lee Sin")){
			Champion.setImageResource(0x7f02000b);
			champMana.setText(i.getStringExtra("Mana"));
			champManaRegen.setText(i.getStringExtra("Mana_Reg"));
		}
		
		else if (Champion_name.toString().startsWith("Lucian")){
			Champion.setImageResource(0x7f02000d);
			champMana.setText("Mana: "+ (Mana+Mana_item));
			champManaRegen.setText("Mana Regen: "+ (Mana_reg+Mana_reg_item));
		}
		
		else if (Champion_name.toString().startsWith("Lulu")){
			Champion.setImageResource(0x7f02000f);
			champMana.setText("Mana: "+ (Mana+Mana_item));
			champManaRegen.setText("Mana Regen: "+ (Mana_reg+Mana_reg_item));

		}
		
		else if (Champion_name.toString().startsWith("Syndra")){
			Champion.setImageResource(0x7f020012);
			champMana.setText("Mana: "+ (Mana+Mana_item));
			champManaRegen.setText("Mana Regen: "+ (Mana_reg+Mana_reg_item));
		}
		
		else if (Champion_name.toString().startsWith("Varus")){
			Champion.setImageResource(0x7f020014);
			champMana.setText("Mana: "+ (Mana+Mana_item));
			champManaRegen.setText("Mana Regen: "+ (Mana_reg+Mana_reg_item));
		}
		
		else if (Champion_name.toString().startsWith("Vladimir")){
			Champion.setImageResource(0x7f020016);
			champMana.setText(i.getStringExtra("Mana"));
			champManaRegen.setText(i.getStringExtra("Mana_Reg"));
		}
		dblade.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (dblade_p == 0){
					Health_item = Health_item + 70;
					Attack_dam_item = Attack_dam_item + 7;
					champHealth.setText("Helath: " + (Health+Health_item));
					champAttackDam.setText("Attack Dam: " + (Attack_dam+Attack_dam_item));
					dblade_p++;
				}
				else {
					Health_item = Health_item - 70;
					Attack_dam_item = Attack_dam_item - 7;
					champHealth.setText("Helath: " + (Health+Health_item));
					champAttackDam.setText("Attack Dam: " + (Attack_dam+Attack_dam_item));
					dblade_p--;
				}
			}});
		dring.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (dring_p == 0){
					Health_item = Health_item + 60;
					Mana_reg_item = Mana_reg_item + 3;
					champHealth.setText("Helath: " + (Health+Health_item));
					String hold = champMana.getText().toString();
					if (hold.startsWith("Mana")){
						champManaRegen.setText("Mana Regen: "+ (Mana_reg+Mana_reg_item));
					}
					dring_p++;
				}
				else {
					Health_item = Health_item - 60;
					Mana_reg_item = Mana_reg_item - 3;
					champHealth.setText("Helath: " + (Health+Health_item));
					String hold = champMana.getText().toString();
					if (hold.startsWith("Mana")){
						champManaRegen.setText("Mana Regen: "+ (Mana_reg+Mana_reg_item));
					}
					dring_p--;
				}
			}});
		dshield.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (dshield_p == 0){
					Health_item = Health_item + 80;
					Health_reg_item = Health_reg_item + 6;
					champHealth.setText("Helath: " + (Health+Health_item));
					champHealthRegen.setText("Health Regen: " + (Health_reg+Health_reg_item));
					dshield_p++;
				}
				else{
					Health_item = Health_item - 80;
					Health_reg_item = Health_reg_item - 6;
					champHealth.setText("Helath: " + (Health+Health_item));
					champHealthRegen.setText("Health Regen: " + (Health_reg+Health_reg_item));
					dshield_p--;
				}
			}});
		BothRK.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (BothRK_p == 0){
					Attack_dam_item = Attack_dam_item + 25;
					Attack_speed_item = Attack_speed_item + (base_as * 0.40);
					champAttackDam.setText("Attack Dam: " + (Attack_dam+Attack_dam_item));
					champAttackSpeed.setText("Attack Speed: " + (Attack_speed+Attack_speed_item) + "%");
					BothRK_p++;
				}
				else{
					Attack_dam_item = Attack_dam_item - 25;
					Attack_speed_item = Attack_speed_item - (base_as * 0.40);
					champAttackDam.setText("Attack Dam: " + (Attack_dam+Attack_dam_item));
					champAttackSpeed.setText("Attack Speed: " + (Attack_speed+Attack_speed_item) + "%");
					BothRK_p--;
				}
			}});
		Randuins.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (Randuins_p == 0){
					Health_item = Health_item + 500;
					Armor_item = Armor_item + 70;
					champHealth.setText("Helath: " + (Health+Health_item));
					champArmor.setText("Armor: " + (Armor+Armor_item));
					Randuins_p++;
				}
				else{
					Health_item = Health_item - 500;
					Armor_item = Armor_item - 70;
					champHealth.setText("Helath: " + (Health+Health_item));
					champArmor.setText("Armor: " + (Armor+Armor_item));
					Randuins_p--;
				}
			}});
		Visage.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (Visage_p == 0){
					Health_item = Health_item + 400;
					Magic_res_item = Magic_res_item + 55;
					Health_reg_item = Health_reg_item + 20;
					champHealth.setText("Helath: " + (Health+Health_item));
					champMagicRes.setText("Magic Res: " + (Magic_res+Magic_res_item));
					champHealthRegen.setText("Health Regen: " + (Health_reg+Health_reg_item));
					Visage_p++;
				}
				else{
					Health_item = Health_item - 400;
					Magic_res_item = Magic_res_item - 55;
					Health_reg_item = Health_reg_item - 20;
					champHealth.setText("Helath: " + (Health+Health_item));
					champMagicRes.setText("Magic Res: " + (Magic_res+Magic_res_item));
					champHealthRegen.setText("Health Regen: " + (Health_reg+Health_reg_item));
					Visage_p--;
				}
			}});
	}
}
