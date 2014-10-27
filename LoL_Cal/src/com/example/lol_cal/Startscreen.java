package com.example.lol_cal;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
		Aatrox =(Button)findViewById(R.id.button1);	
		Karma =(Button)findViewById(R.id.button2);	
		Kayle =(Button)findViewById(R.id.button3);	
		Lee =(Button)findViewById(R.id.button5);	
		Lucian =(Button)findViewById(R.id.button4);
		Lulu =(Button)findViewById(R.id.button6);
		Syndra =(Button)findViewById(R.id.button8);
		Varus =(Button)findViewById(R.id.button7);
		Vladimir =(Button)findViewById(R.id.button9);
				
		Champ = (ImageView)findViewById(R.id.currChamp);
		Aatrox.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(current_champ == "Aatrox"){
					Toast.makeText(Startscreen, "You press this befor", Toast.LENGTH_SHORT).show();
					
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
					Toast.makeText(Startscreen, "You press this befor", Toast.LENGTH_SHORT).show();
					
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
					Toast.makeText(Startscreen, "You press this befor", Toast.LENGTH_SHORT).show();
					
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
					Toast.makeText(Startscreen, "You press this befor", Toast.LENGTH_SHORT).show();
					
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
					Toast.makeText(Startscreen, "You press this befor", Toast.LENGTH_SHORT).show();
					
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
					Toast.makeText(Startscreen, "You press this befor", Toast.LENGTH_SHORT).show();
					
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
					Toast.makeText(Startscreen, "You press this befor", Toast.LENGTH_SHORT).show();
					
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
					Toast.makeText(Startscreen, "You press this befor", Toast.LENGTH_SHORT).show();
					
				}
				else{
					champName.setText("Varus");
					champTitle.setText("The Arrow of Retribution");
					Champ.setImageResource(0x7f020007);
					current_champ = "Varus";
					// TODO Auto-generated method stub
				}
			}
		});
		
		Vladimir.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(current_champ == "Vladimir"){
					Toast.makeText(Startscreen, "You press this befor", Toast.LENGTH_SHORT).show();
					
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
