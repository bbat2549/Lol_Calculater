package com.example.lol_cal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Champscreen extends Activity {
	ImageView Champion, item1, item2, item3, item4, item5, item6;
	TextView champName, champHealth, champHealthRegen, champMana, champManaRegen, champRange,
			 champAttackDam, champAttackSpeed, champArmor, champMagicRes, champMoveSpeed;
	int Health, Mana, Move, Health_item, Mana_item, Move_item, item_num;
	double Health_reg, Mana_reg, Attack_dam, Attack_speed, Armor, Magic_res, Health_reg_item,
		   Mana_reg_item, Attack_dam_item, Attack_speed_item, Armor_item, Magic_res_item;
	String Champion_name, item_name;
	Button add;
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
		item1 = (ImageView) findViewById(R.id.item1);
		item2 = (ImageView) findViewById(R.id.item2);
		item3 = (ImageView) findViewById(R.id.item3);
		item4 = (ImageView) findViewById(R.id.item4);
		item5 = (ImageView) findViewById(R.id.item5);
		item6 = (ImageView) findViewById(R.id.item6);
		add = (Button) findViewById(R.id.addItem);
		Intent i = getIntent();
		Health = i.getIntExtra("Health",0);
		Health_reg = i.getDoubleExtra("Health_Reg", 0);
		Attack_dam = i.getDoubleExtra("Attack_Dam",0);
		Attack_speed = i.getDoubleExtra("Attack_Speed",0);
		Armor = i.getDoubleExtra("Armor", 0);
		Magic_res = i.getDoubleExtra("Magic_Res",0);
		Move = i.getIntExtra("Mov_Speed", 0);
		Mana = i.getIntExtra("Mana", 0);
		Mana_reg = i.getDoubleExtra("Mana_Reg",0);
		Health_item = i.getIntExtra("Health_item",0);
		Health_reg_item = i.getDoubleExtra("Health_reg_item", 0);
		Attack_dam_item = i.getDoubleExtra("Attack_dam_item",0);
		Attack_speed_item = i.getDoubleExtra("Attack_speed_item",0);
		Armor_item = i.getDoubleExtra("Armor_item", 0);
		Magic_res_item = i.getDoubleExtra("Magic_res_itme",0);
		Move_item = i.getIntExtra("Move_item", 0);
		Mana_item = i.getIntExtra("Mana_item", 0);
		Mana_reg_item = i.getDoubleExtra("Mana_reg_item",0);
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
		add.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent ItemscreenIntent = new Intent(Champscreen.this, Itemscreen.class);
				ItemscreenIntent.putExtra("Health", Health);
				ItemscreenIntent.putExtra("Health_Reg", Health_reg);
				ItemscreenIntent.putExtra("Mana", Mana);
				ItemscreenIntent.putExtra("Mana_Reg", Mana_reg);
				ItemscreenIntent.putExtra("Attack_Dam", Attack_dam);
				ItemscreenIntent.putExtra("Attack_Speed", Attack_speed);
				ItemscreenIntent.putExtra("Armor", Armor);
				ItemscreenIntent.putExtra("Magic_Res", Magic_res);
				ItemscreenIntent.putExtra("Mov_Speed", Move);
				startActivityForResult(ItemscreenIntent, 0);
			}});
	}
}
