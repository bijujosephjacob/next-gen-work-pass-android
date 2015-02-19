package jabs.nextgenworkpass;

import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainMenu extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nfc_reader);
		
//		Context context  = this.getApplicationContext();
//		
//		Intent intent = getIntent();
//        String action = intent.getAction();
//        Toast.makeText(context, action, Toast.LENGTH_LONG).show();
//        if (NfcAdapter.ACTION_NDEF_DISCOVERED.equals(getIntent().getAction())) {
//        	Toast.makeText(context, "found nfc", Toast.LENGTH_LONG).show();
//        }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.nfc_reader, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
    public void onResume() {
        super.onResume();
//        Context context  = this.getApplicationContext();
//        
//        Intent intent = getIntent();
//        
//        String action = intent.getAction();
//        Toast.makeText(context, action, Toast.LENGTH_LONG).show();
//        if (NfcAdapter.ACTION_NDEF_DISCOVERED.equals(getIntent().getAction())) {
//        	Toast.makeText(context, "found nfc", Toast.LENGTH_LONG).show();
//        }
        //process the msgs array
    }

	public void button1OnClick(View view) {
		Intent intent = new Intent(this, RedeemCredit.class);
		startActivity(intent);
	}
	
	public void button2OnClick(View view) {
		Intent intent = new Intent(this, Certificates.class);
		startActivity(intent);
	}
	
	public void button3OnClick(View view) {
		Intent intent = new Intent(this, Contact.class);
		startActivity(intent);
	}
}
