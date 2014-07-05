package com.example.wabaoyouxi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import android.widget.TextView;

public class Myservice8 extends Activity {
	TextView textiew;

	ImageButton imageButton1;
	Button tiket;
	EditText intrduce;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.eleven);
		imageButton1 = (ImageButton)findViewById(R.id.imageButton1);
		tiket = (Button)findViewById(R.id.tiket);
		intrduce = (EditText)findViewById(R.id.intrduce);
		
		
		
	}
}