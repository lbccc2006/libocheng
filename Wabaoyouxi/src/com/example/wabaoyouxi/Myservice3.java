package com.example.wabaoyouxi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Myservice3 extends Activity {
	TextView ask;
	EditText answer;
	ImageView imageview;
	String str;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nine);
		ask = (TextView) findViewById(R.id.ask);
		imageview = (ImageView) findViewById(R.id.imageView1);
		answer = (EditText) findViewById(R.id.answer);
		answer.addTextChangedListener(new TextWatcher() {

			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1,
					int arg2, int arg3) {
				// TODO Auto-generated method stub

			}

			@Override
			public void afterTextChanged(Editable arg0) {
				String str = answer.getText().toString();
				if (str.contentEquals("bao"));
				
				Toast.makeText(Myservice3.this, "回答正确", Toast.LENGTH_LONG).show();
				

				Intent intent = new Intent(Myservice3.this, Myservice7.class);
				startActivity(intent);
				// TODO Auto-generated method stub
				if (!str.contentEquals("bao"));
				
				Toast.makeText(Myservice3.this, "答案错误请继续回答", Toast.LENGTH_LONG).show();
			}

			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				// TODO Auto-generated method stub

			}

		});

	}
}