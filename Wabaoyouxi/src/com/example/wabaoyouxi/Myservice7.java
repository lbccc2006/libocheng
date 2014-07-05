package com.example.wabaoyouxi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Myservice7 extends Activity {
	TextView answer2;

	ImageView imageview;
	Button dig2, continue_answer;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ten);
		answer2 = (TextView) findViewById(R.id.answer2);
		imageview = (ImageView) findViewById(R.id.imageView1);
		dig2 = (Button) findViewById(R.id.dig2);
		continue_answer = (Button) findViewById(R.id.continue_answer);
		dig2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				// TODO Auto-generated method stub
				Intent intent = new Intent(Myservice7.this, Myservice2.class);
				startActivity(intent);
			}
		});

	}

}
