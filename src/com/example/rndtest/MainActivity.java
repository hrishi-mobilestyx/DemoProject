package com.example.rndtest;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {
	
	Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        //this is my second commit!!!!
        //this wil be shown  only after i commit!!!!!
        
        next = (Button) findViewById(R.id.button1);
        
        
        next.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent (MainActivity.this, SecondActivity.class);
				startActivity(i);
				
				
				
			}
		});
        		
        
        
    }


}
