package br.unirio.alarmclock;

import com.trigg.alarmclock.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		
		Button btnCreateAlarm = (Button) findViewById(R.id.btnCreateAlarm);
		btnCreateAlarm.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				startAlarmDetailsActivity(-1);
			}
		});
		
		Button btnListAlarm = (Button) findViewById(R.id.btnListAlarm);
		btnListAlarm.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(FirstActivity.this, AlarmListActivity.class);
			    startActivity(intent);
			}
		});
		
		Button btnDeleteAlarm= (Button) findViewById(R.id.btnDeleteAlarm);
		btnDeleteAlarm.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(FirstActivity.this, AlarmListActivity.class);
			    startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void startAlarmDetailsActivity(long id) {
		Intent intent = new Intent(this, AlarmDetailsActivity.class);
		intent.putExtra("id", id);
		startActivityForResult(intent, 0);
	}

}
