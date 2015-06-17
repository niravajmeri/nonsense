package com.dhaasu.nonsense;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		
		final Button buttonNonsense = (Button) findViewById(R.id.sendNonsenseButton);
        buttonNonsense.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                
            	Intent sendIntent = new Intent();
        		sendIntent.setAction(Intent.ACTION_SEND);
        		sendIntent.putExtra(Intent.EXTRA_TEXT, "      ");
        		sendIntent.setType("text/plain");
        		sendIntent.setPackage("com.whatsapp");
        		startActivity(sendIntent);
            	
            }
        });

		final Button buttonBigNonsense = (Button) findViewById(R.id.sendBigNonsenseButton);
        buttonBigNonsense.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                
            	Intent sendIntent = new Intent();
        		sendIntent.setAction(Intent.ACTION_SEND);
        		sendIntent.putExtra(Intent.EXTRA_TEXT, "      \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n      ");
        		sendIntent.setType("text/plain");
        		sendIntent.setPackage("com.whatsapp");
        		startActivity(sendIntent);
            	
            }
        });
        
        final Button buttonSpreadNonsense = (Button) findViewById(R.id.spreadNonsense);
        buttonSpreadNonsense.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                
            	Intent sendIntent = new Intent();
        		sendIntent.setAction(Intent.ACTION_SEND);
        		sendIntent.putExtra(Intent.EXTRA_TEXT, "Hey! Checkout this cool application and surprise your friends with blank messages.\n http://dhaasu.com/nonsense");
        		sendIntent.setType("text/plain");
        		startActivity(sendIntent);
            	
            }
        });
	}
}
