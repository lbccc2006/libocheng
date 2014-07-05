package com.example.wabaoyouxi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

	private Button digButton, payButton;
	private ImageView imageview1;
	private TextView choose2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		digButton = (Button) findViewById(R.id.digbutton);
		payButton = (Button) findViewById(R.id.paybutton);
		imageview1 = (ImageView)findViewById(R.id.imageView1);
		choose2 = (TextView)findViewById(R.id.choose2);
		
		digButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, Myservice.class);
				startActivity(intent);
			}
		});

		payButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, Myservice5.class);
				startActivity(intent);
			}
		});
	}
}
