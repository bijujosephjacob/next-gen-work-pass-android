package jabs.nextgenworkpass;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
//        Context context  = this.getApplicationContext();
//		
//		Intent intent = getIntent();
//        String action = intent.getAction();
//        Toast.makeText(context, action, Toast.LENGTH_LONG).show();
//        if (NfcAdapter.ACTION_NDEF_DISCOVERED.equals(getIntent().getAction())) {
//        	Toast.makeText(context, "found nfc", Toast.LENGTH_LONG).show();
//        }
//        
//        if (NfcAdapter.ACTION_TAG_DISCOVERED.equals(getIntent().getAction())) {
//        	Toast.makeText(context, action+"found nfc", Toast.LENGTH_LONG).show();
//        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
//        Intent intent = getIntent();
//        String action = intent.getAction();
//        Toast.makeText(context, action, Toast.LENGTH_LONG).show();
//        if (NfcAdapter.ACTION_NDEF_DISCOVERED.equals(getIntent().getAction())) {
//        	Toast.makeText(context, "found nfc", Toast.LENGTH_LONG).show();
//        }
//        if (NfcAdapter.ACTION_TAG_DISCOVERED.equals(getIntent().getAction())) {
//        	Toast.makeText(context, action+"found nfc", Toast.LENGTH_LONG).show();
//        }
        
        //process the msgs array
    }
    
    public void continueButtonOnClick(View view) {
		Intent intent = new Intent(this, PageTwo.class);
		startActivity(intent);
	}
    
    
}
