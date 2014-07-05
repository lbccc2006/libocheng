package com.example.wabaoyouxi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Myservice11 extends Activity {
	ImageButton baowu_imge;
	TextView dizhi_textView;
	EditText dizhi_editText;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sevent);
		baowu_imge = (ImageButton) findViewById(R.id.baowu_image);
		dizhi_textView = (TextView) findViewById(R.id.dizhi_textView);
		dizhi_editText = (EditText) findViewById(R.id.dizhi_editText);
		dizhi_editText.getContext().toString();

	}
}
