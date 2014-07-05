package com.example.wabaoyouxi;

import java.util.Random;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Myservice2 extends Activity {

	Button run;
	ImageView imageview;

	Intent intent;
	
	//

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.third_activity);

		run = (Button) findViewById(R.id.run);
		imageview = (ImageView) findViewById(R.id.imageView1);

		imageview.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi")
			public void onClick(View arg0) {
				int[] imgeSrcs = new int[] { R.drawable.baoxi,
						R.drawable.baozang, R.drawable.ic_launcher,
						R.drawable.wbtp1 };
				int size = imgeSrcs.length;
				Random randrom = new Random(4);
				int imge = imgeSrcs[randrom.nextInt(size)];
				imageview.setBackgroundResource(imge);
				if (imageview.getDisplay().equals(R.drawable.baozang)) {

					intent = new Intent(Myservice2.this, Myservice4.class);
					startActivity(intent);
					// TODO Auto-generated method stub
				} 
				else {
					intent = new Intent(Myservice2.this, Myservice10.class);
					startActivity(intent);
				}
			}

		});
	}
}