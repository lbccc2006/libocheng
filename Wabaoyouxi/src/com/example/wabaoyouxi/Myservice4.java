package com.example.wabaoyouxi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Myservice4 extends Activity {
	ImageView imageview;
	Button celebrate, exchange, take_off;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fourth_activity);
		imageview = (ImageView) findViewById(R.id.imageView1);
		celebrate = (Button) findViewById(R.id.celebrate);
		exchange = (Button) findViewById(R.id.exchange);
		take_off = (Button) findViewById(R.id.take_off);
		exchange.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Myservice4.this, Myservice8.class);
				startActivity(intent);

			}
		});
		take_off.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Myservice4.this, Myservice11.class);
				startActivity(intent);

				
				
				
				// TODO Auto-generated method stub
				
			}
		});

	}
}