package com.example.wabaoyouxi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Myservice extends Activity {

	Button low,high,greeting,choose;
	TextView textView;
	ImageView imageview;
	

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sencent_activity);
		low = (Button) findViewById(R.id.low);
		high = (Button) findViewById(R.id.high);
		greeting = (Button) findViewById(R.id.greeting);
		choose = (Button) findViewById(R.id.choose);
		textView =(TextView)findViewById(R.id.TextView1);
		imageview = (ImageView)findViewById(R.id.imageView1);

		high.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				
				Intent intent = new Intent(Myservice.this,Myservice3.class); 
			       startActivity(intent);
				// TODO Auto-generated method stub

			}
		});
		low.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				
				Intent intent = new Intent(Myservice.this,Myservice2.class); 
			       startActivity(intent);
				// TODO Auto-generated method stub

			}
		});
	}

}
