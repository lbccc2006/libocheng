package com.example.wabaoyouxi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Myservice10 extends Activity {
	
	TextView no_giveup;
	ImageView imageView;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.eight);
		no_giveup = (TextView)findViewById(R.id.no_giveup);
		imageView = (ImageView)findViewById(R.id.imageView1);
	}

}
