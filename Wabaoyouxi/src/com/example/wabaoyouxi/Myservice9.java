package com.example.wabaoyouxi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.TextView;

public class Myservice9 extends Activity {
	private TextView choose3;
	private Spinner spinner;
	private ArrayAdapter<String> adapter;
	private static final String [] baowu = {"家电","打折卡","门票"};
	
	

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.telvern);
		choose3 = (TextView) findViewById(R.id.choose3);
		spinner = (Spinner)findViewById(R.id.spinner1);
		adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,baowu);
		adapter.setDropDownViewResource(R.layout.dropdown);
		spinner.setAdapter(adapter);
		spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				
				String seleted = baowu[position];
				choose3.setText(seleted);
				 parent.setVisibility(View.VISIBLE);
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				choose3.setText("您没有选择");
			}
		});
		
	}
}