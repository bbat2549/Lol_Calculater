package com.example.lol_cal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
//import android.widget.Toast;

public class Startscreen extends Activity {
	ImageView Champ;
	TextView champName, champTitle;
	Button Aatrox, Karma, Kayle, Lee, Lucian, Lulu, Syndra,
	Varus, Vladimir;
	String current_champ;
	Activity Startscreen = this;
	@Override
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_startscreen);
		champName = (TextView) findViewById(R.id.textView1);
		champTitle = (TextView) findViewById(R.id.textView2);
		Champ =(ImageView) findViewById(R.id.currChamp);
		Aatrox =(Button)findViewById(R.id.Champ1);	
		Karma =(Button)findViewById(R.id.Champ2);	
		Kayle =(Button)findViewById(R.id.Champ3);	
		Lee =(Button)findViewById(R.id.Champ5);	
		Lucian =(Button)findViewById(R.id.Champ4);
		Lulu =(Button)findViewById(R.id.Champ6);
		Syndra =(Button)findViewById(R.id.Champ8);
		Varus =(Button)findViewById(R.id.Champ7);
		Vladimir =(Button)findViewById(R.id.Champ9);
				
		Champ = (ImageView)findViewById(R.id.currChamp);
		Aatrox.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(current_champ == "Aatrox"){
					Intent ChampscreenIntent = new Intent(Startscreen.this, Champscreen.class);
					int Health = 395;
					double Health_reg = 5.75;
					String Mana = "Uses Health";
					String Mana_reg = "";
					String Range = "150(Melee)";
					double Attack_dam = 55;
					double Attack_speed = 0.651;
					double Armor = 18;
					double Magic_res = 30;
					int Move = 345;
					ChampscreenIntent.putExtra("Champ", "Aatrox");
					ChampscreenIntent.putExtra("Health", Health);
					ChampscreenIntent.putExtra("Health_Reg", Health_reg);
					ChampscreenIntent.putExtra("Mana", Mana);
					ChampscreenIntent.putExtra("Mana_Reg", Mana_reg);
					ChampscreenIntent.putExtra("Range", Range);
					ChampscreenIntent.putExtra("Attack_Dam", Attack_dam);
					ChampscreenIntent.putExtra("Attack_Speed", Attack_speed);
					ChampscreenIntent.putExtra("Armor", Armor);
					ChampscreenIntent.putExtra("Magic_Res", Magic_res);
					ChampscreenIntent.putExtra("Mov_Speed", Move);
					startActivity(ChampscreenIntent);
					
				}
				else{
					champName.setText("Aatrox");
					champTitle.setText("The Darkin Blade");
					Champ.setImageResource(0x7f020000);
					current_champ = "Aatrox";
					// TODO Auto-generated method stub
				}
			}
		});
		
		Karma.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(current_champ == "Karma"){
					Intent ChampscreenIntent = new Intent(Startscreen.this, Champscreen.class);
					int Health = 383;
					double Health_reg = 4.7;
					int Mana = 290;
					double Mana_reg = 6.8;
					String Range = "525(Ranged)";
					double Attack_dam = 50;
					double Attack_speed = 0.625;
					double Armor = 14;
					double Magic_res = 30;
					int Move = 335;
					ChampscreenIntent.putExtra("Champ", "Karma");
					ChampscreenIntent.putExtra("Health", Health);
					ChampscreenIntent.putExtra("Health_Reg", Health_reg);
					ChampscreenIntent.putExtra("Mana", Mana);
					ChampscreenIntent.putExtra("Mana_Reg", Mana_reg);
					ChampscreenIntent.putExtra("Range", Range);
					ChampscreenIntent.putExtra("Attack_Dam", Attack_dam);
					ChampscreenIntent.putExtra("Attack_Speed", Attack_speed);
					ChampscreenIntent.putExtra("Armor", Armor);
					ChampscreenIntent.putExtra("Magic_Res", Magic_res);
					ChampscreenIntent.putExtra("Mov_Speed", Move);
					 
					startActivity(ChampscreenIntent);
				}
				else{
					champName.setText("Karma");
					champTitle.setText("The Enlightened One");
					Champ.setImageResource(0x7f020003);
					current_champ = "Karma";
					// TODO Auto-generated method stub
				}
			}
		});
		
		Kayle.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(current_champ == "Kayle"){
					Intent ChampscreenIntent = new Intent(Startscreen.this, Champscreen.class);
					int Health = 418;
					double Health_reg = 7;
					int Mana = 255;
					double Mana_reg = 6.9;
					String Range = "125(Melee)";
					double Attack_dam = 53.3;
					double Attack_speed = 0.638;
					double Armor = 21;
					double Magic_res = 30;
					int Move = 335;
					ChampscreenIntent.putExtra("Champ", "Kayle");
					ChampscreenIntent.putExtra("Health", Health);
					ChampscreenIntent.putExtra("Health_Reg", Health_reg);
					ChampscreenIntent.putExtra("Mana", Mana);
					ChampscreenIntent.putExtra("Mana_Reg", Mana_reg);
					ChampscreenIntent.putExtra("Range", Range);
					ChampscreenIntent.putExtra("Attack_Dam", Attack_dam);
					ChampscreenIntent.putExtra("Attack_Speed", Attack_speed);
					ChampscreenIntent.putExtra("Armor", Armor);
					ChampscreenIntent.putExtra("Magic_Res", Magic_res);
					ChampscreenIntent.putExtra("Mov_Speed", Move);
					startActivity(ChampscreenIntent);
				}
				else{
					champName.setText("Kayle");
					champTitle.setText("The Judicator");
					Champ.setImageResource(0x7f020005);
					current_champ = "Kayle";
					// TODO Auto-generated method stub
				}
			}
		});
		
		Lee.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(current_champ == "Lee Sin"){
					Intent ChampscreenIntent = new Intent(Startscreen.this, Champscreen.class);
					int Health = 428;
					double Health_reg = 8.95;
					String Mana = "Energy: 200";
					String Mana_reg = "Energy Regen:";
					String Range = "125(Melee)";
					double Attack_dam = 55.8;
					double Attack_speed = 0.651;
					double Armor = 14;
					double Magic_res = 30;
					int Move = 335;
					ChampscreenIntent.putExtra("Champ", "Lee Sin");
					ChampscreenIntent.putExtra("Health", Health);
					ChampscreenIntent.putExtra("Health_Reg", Health_reg);
					ChampscreenIntent.putExtra("Mana", Mana);
					ChampscreenIntent.putExtra("Mana_Reg", Mana_reg);
					ChampscreenIntent.putExtra("Range", Range);
					ChampscreenIntent.putExtra("Attack_Dam", Attack_dam);
					ChampscreenIntent.putExtra("Attack_Speed", Attack_speed);
					ChampscreenIntent.putExtra("Armor", Armor);
					ChampscreenIntent.putExtra("Magic_Res", Magic_res);
					ChampscreenIntent.putExtra("Mov_Speed", Move);
					startActivity(ChampscreenIntent);
				}
				else{
					champName.setText("Lee Sin");
					champTitle.setText("The Blind Monk");
					Champ.setImageResource(0x7f020007);
					current_champ = "Lee Sin";
					// TODO Auto-generated method stub
				}
			}
		});
		
		Lucian.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(current_champ == "Lucian"){
					Intent ChampscreenIntent = new Intent(Startscreen.this, Champscreen.class);
					int Health = 420;
					double Health_reg = 5.1;
					int Mana = 230;
					double Mana_reg = 7;
					String Range = "500(Ranged)";
					int Attack_dam = 49;
					double Attack_speed = 0.638;
					double Armor = 19;
					double Magic_res = 30;
					int Move = 335;
					ChampscreenIntent.putExtra("Champ", "Lucian");
					ChampscreenIntent.putExtra("Health", Health);
					ChampscreenIntent.putExtra("Health_Reg", Health_reg);
					ChampscreenIntent.putExtra("Mana", Mana);
					ChampscreenIntent.putExtra("Mana_Reg", Mana_reg);
					ChampscreenIntent.putExtra("Range", Range);
					ChampscreenIntent.putExtra("Attack_Dam", Attack_dam);
					ChampscreenIntent.putExtra("Attack_Speed", Attack_speed);
					ChampscreenIntent.putExtra("Armor", Armor);
					ChampscreenIntent.putExtra("Magic_Res", Magic_res);
					ChampscreenIntent.putExtra("Mov_Speed", Move);
					startActivity(ChampscreenIntent);
					
				}
				else{
					champName.setText("Lucian");
					champTitle.setText("The Purifier");
					Champ.setImageResource(0x7f020009);
					current_champ = "Lucian";
					// TODO Auto-generated method stub
				}
			}
		});
		
		Lulu.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(current_champ == "Lulu"){
					Intent ChampscreenIntent = new Intent(Startscreen.this, Champscreen.class);
					int Health = 415;
					double Health_reg = 5;
					int Mana = 200;
					double Mana_reg = 5;
					String Range = "550(Ranged)";
					double Attack_dam = 44;
					double Attack_speed = 0.625;
					double Armor = 13;
					double Magic_res = 30;
					int Move = 325;
					ChampscreenIntent.putExtra("Champ", "Lulu");
					ChampscreenIntent.putExtra("Health", Health);
					ChampscreenIntent.putExtra("Health_Reg", Health_reg);
					ChampscreenIntent.putExtra("Mana", Mana);
					ChampscreenIntent.putExtra("Mana_Reg", Mana_reg);
					ChampscreenIntent.putExtra("Range", Range);
					ChampscreenIntent.putExtra("Attack_Dam", Attack_dam);
					ChampscreenIntent.putExtra("Attack_Speed", Attack_speed);
					ChampscreenIntent.putExtra("Armor", Armor);
					ChampscreenIntent.putExtra("Magic_Res", Magic_res);
					ChampscreenIntent.putExtra("Mov_Speed", Move);
					startActivity(ChampscreenIntent);
					
				}
				else{
					champName.setText("Lulu");
					champTitle.setText("The Fae Sorceress");
					Champ.setImageResource(0x7f02000b);
					current_champ = "Lulu";
					// TODO Auto-generated method stub
				}
			}
		});
		
		Syndra.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(current_champ == "Syndra"){
					Intent ChampscreenIntent = new Intent(Startscreen.this, Champscreen.class);
					int Health = 380;
					double Health_reg = 5.5;
					int Mana = 250;
					double Mana_reg = 6.9;
					String Range = "550(Ranged)";
					double Attack_dam = 51;
					double Attack_speed = 0.625;
					double Armor = 19;
					double Magic_res = 30;
					int Move = 330;
					ChampscreenIntent.putExtra("Champ", "Syndra");
					ChampscreenIntent.putExtra("Health", Health);
					ChampscreenIntent.putExtra("Health_Reg", Health_reg);
					ChampscreenIntent.putExtra("Mana", Mana);
					ChampscreenIntent.putExtra("Mana_Reg", Mana_reg);
					ChampscreenIntent.putExtra("Range", Range);
					ChampscreenIntent.putExtra("Attack_Dam", Attack_dam);
					ChampscreenIntent.putExtra("Attack_Speed", Attack_speed);
					ChampscreenIntent.putExtra("Armor", Armor);
					ChampscreenIntent.putExtra("Magic_Res", Magic_res);
					ChampscreenIntent.putExtra("Mov_Speed", Move);
					startActivity(ChampscreenIntent);
					
				}
				else{
					champName.setText("Syndra");
					champTitle.setText("The Dark Sovereign");
					Champ.setImageResource(0x7f02000d);
					current_champ = "Syndra";
					// TODO Auto-generated method stub
				}
			}
		});
		
		Varus.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(current_champ == "Varus"){
					Intent ChampscreenIntent = new Intent(Startscreen.this, Champscreen.class);
					int Health = 400;
					double Health_reg = 4.5;
					int Mana = 250;
					double Mana_reg = 6.5;
					String Range = "575(Ranged)";
					double Attack_dam = 46;
					double Attack_speed = 0.658;
					double Armor = 17.5;
					double Magic_res = 30;
					int Move = 330;
					ChampscreenIntent.putExtra("Champ", "Varus");
					ChampscreenIntent.putExtra("Health", Health);
					ChampscreenIntent.putExtra("Health_Reg", Health_reg);
					ChampscreenIntent.putExtra("Mana", Mana);
					ChampscreenIntent.putExtra("Mana_Reg", Mana_reg);
					ChampscreenIntent.putExtra("Range", Range);
					ChampscreenIntent.putExtra("Attack_Dam", Attack_dam);
					ChampscreenIntent.putExtra("Attack_Speed", Attack_speed);
					ChampscreenIntent.putExtra("Armor", Armor);
					ChampscreenIntent.putExtra("Magic_Res", Magic_res);
					ChampscreenIntent.putExtra("Mov_Speed", Move);
					startActivity(ChampscreenIntent);
					
				}
				else{
					champName.setText("Varus");
					champTitle.setText("The Arrow" +'\n'+"of Retribution");
					Champ.setImageResource(0x7f02000f);
					current_champ = "Varus";
					// TODO Auto-generated method stub
				}
			}
		});
		
		Vladimir.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(current_champ == "Vladimir"){
					Intent ChampscreenIntent = new Intent(Startscreen.this, Champscreen.class);
					int Health = 400;
					double Health_reg = 6;
					String Mana = "Uses Health";
					String Mana_reg = "";
					String Range = "450(Ranged)";
					double Attack_dam = 45;
					double Attack_speed = 0.658;
					double Armor = 16;
					double Magic_res = 30;
					int Move = 335;
					ChampscreenIntent.putExtra("Champ", "Vladimir");
					ChampscreenIntent.putExtra("Health", Health);
					ChampscreenIntent.putExtra("Health_Reg", Health_reg);
					ChampscreenIntent.putExtra("Mana", Mana);
					ChampscreenIntent.putExtra("Mana_Reg", Mana_reg);
					ChampscreenIntent.putExtra("Range", Range);
					ChampscreenIntent.putExtra("Attack_Dam", Attack_dam);
					ChampscreenIntent.putExtra("Attack_Speed", Attack_speed);
					ChampscreenIntent.putExtra("Armor", Armor);
					ChampscreenIntent.putExtra("Magic_Res", Magic_res);
					ChampscreenIntent.putExtra("Mov_Speed", Move);
					startActivity(ChampscreenIntent);
					
				}
				else{
					champName.setText("Vladimir");
					champTitle.setText("The Crimson Reaper");
					Champ.setImageResource(0x7f020011);
					current_champ = "Vladimir";
					// TODO Auto-generated method stub
				}
			}
		});
	}
}
