package com.example.lol_cal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Champscreen extends Activity {
	ImageView Champion;
	TextView champName, champHealth, champHealthRegen, champMana, champManaRegen, champRange,
			 champAttackDam, champAttackSpeed, champArmor, champMagicRes, champMoveSpeed;
	Button item1, item2, item3, item4, item5, item6;
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
		item1 = (Button) findViewById(R.id.button1);
		item2 = (Button) findViewById(R.id.button2);
		item3 = (Button) findViewById(R.id.button3);
		item4 = (Button) findViewById(R.id.button4);
		item5 = (Button) findViewById(R.id.button5);
		item6 = (Button) findViewById(R.id.button6);
		Intent i = getIntent();
		Champion_name = i.getStringExtra("Champ");
		champName.setText(Champion_name);
		champHealth.setText("Helath: "+i.getIntExtra("Health",0));
		champHealthRegen.setText("Health Regen: "+i.getDoubleExtra("Health_Reg", 0));
		champRange.setText("Range: "+i.getStringExtra("Range"));
		champAttackDam.setText("Attack Dam: "+i.getDoubleExtra("Attack_Dam",0));
		champAttackSpeed.setText("Attack Speed: "+i.getDoubleExtra("Attack_Speed",0)+"%");
		champArmor.setText("Armor: "+i.getDoubleExtra("Armor", 18));
		champMagicRes.setText("Magic Res: "+i.getDoubleExtra("Magic_Res",0));
		champMoveSpeed.setText("Move Speed: "+i.getIntExtra("Mov_Speed", 0));
		if (Champion_name.toString().startsWith("Aatrox")){
			Champion.setImageResource(0x7f020000);
			champMana.setText(i.getStringExtra("Mana"));
			champManaRegen.setText(i.getStringExtra("Mana_Reg"));
		}
		
		else if (Champion_name.toString().startsWith("Karma")){
			Champion.setImageResource(0x7f020003);
			champMana.setText("Mana: "+i.getIntExtra("Mana", 0));
			champManaRegen.setText("Mana Regen: "+i.getDoubleExtra("Mana_Reg",0));
		}
		
		else if (Champion_name.toString().startsWith("Kayle")){
			Champion.setImageResource(0x7f020005);
			champMana.setText("Mana: "+i.getIntExtra("Mana", 0));
			champManaRegen.setText("Mana Regen: "+i.getDoubleExtra("Mana_Reg",0));
		}
		
		else if (Champion_name.toString().startsWith("Lee Sin")){
			Champion.setImageResource(0x7f020007);
			champMana.setText(i.getStringExtra("Mana"));
			champManaRegen.setText(i.getStringExtra("Mana_Reg"));
		}
		
		else if (Champion_name.toString().startsWith("Lucian")){
			Champion.setImageResource(0x7f020009);
			champMana.setText("Mana: "+i.getIntExtra("Mana", 0));
			champManaRegen.setText("Mana Regen: "+i.getDoubleExtra("Mana_Reg",0));
		}
		
		else if (Champion_name.toString().startsWith("Lulu")){
			Champion.setImageResource(0x7f02000b);
			champMana.setText("Mana: "+i.getIntExtra("Mana", 0));
			champManaRegen.setText("Mana Regen: "+i.getDoubleExtra("Mana_Reg",0));
		}
		
		else if (Champion_name.toString().startsWith("Syndra")){
			Champion.setImageResource(0x7f02000d);
			champMana.setText("Mana: "+i.getIntExtra("Mana", 0));
			champManaRegen.setText("Mana Regen: "+i.getDoubleExtra("Mana_Reg",0));
		}
		
		else if (Champion_name.toString().startsWith("Varus")){
			Champion.setImageResource(0x7f02000f);
			champMana.setText("Mana: "+i.getIntExtra("Mana", 0));
			champManaRegen.setText("Mana Regen: "+i.getDoubleExtra("Mana_Reg",0));
		}
		
		else if (Champion_name.toString().startsWith("Vladimir")){
			Champion.setImageResource(0x7f020011);
			champMana.setText(i.getStringExtra("Mana"));
			champManaRegen.setText(i.getStringExtra("Mana_Reg"));
		}
	}
}
