package com.example.rndtest;

import android.support.v7.app.ActionBarActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class SecondActivity extends ActionBarActivity {
	
	 boolean mboolean = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_main);
        
     
      // 
       
        Log.e("Hrishi", "mboolean 1st = "+mboolean);
        
        SharedPreferences settings = getSharedPreferences("PREFS_NAME", 0);
        mboolean = settings.getBoolean("RFIRST_UN", false);
        
        Log.e("Hrishi", "mboolean before loop = "+mboolean);
        
        if (!mboolean) {
         // do the thing for the first time 
          settings = getSharedPreferences("PREFS_NAME", 0);
                            SharedPreferences.Editor editor = settings.edit();
                            editor.putBoolean("FIRST_RUN", true);
                            editor.commit();    
                            
                            Log.e("Hrishi", "mboolean in if = "+mboolean);
                            
                            doSomething();
                            
        } else {
         // other time your app loads
        	Log.e("Hrishi", "mboolean in else = "+mboolean);
        }
        
        
        
        
    }
    
     public void doSomething(){
    	 
    	 Log.e("Hrishi", "doSomething method has been called ~");
    	 Log.e("Hrishi", "doSomething method has been called ~");
    	 Log.e("Hrishi", "doSomething method has been called ~");
    	 Log.e("Hrishi", "doSomething method has been called ~");
    	 Log.e("Hrishi", "doSomething method has been called ~");
    	 Log.e("Hrishi", "doSomething method has been called ~");
    	 
     }
     
     


}
