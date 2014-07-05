package com.example.wabaoyouxi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Myservice5 extends Activity {

	private Button picture, word;
	private TextView intrduce2, greeting;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.six);
		greeting = (TextView) findViewById(R.id.greeting);
		picture = (Button) findViewById(R.id.picture);
		intrduce2 = (TextView) findViewById(R.id.intrduce2);
		word = (Button) findViewById(R.id.word);
		picture.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Myservice5.this, Myservice6.class);

				// TODO Auto-generated method stub

			}
		});
		word.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Myservice5.this, Myservice6.class);

				// TODO Auto-generated method stub

			}
		});
	}
}