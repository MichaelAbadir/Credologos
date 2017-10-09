package edu.galileo.android.credologos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class Events extends AppCompatActivity {

    final String TAG2 = "Activity 2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.events);
        Log.d(TAG2, "STATUS: onCreate()");
    }

    public void goToActivity1(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG2, "STATUS: onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG2, "STATUS: onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG2, "STATUS: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG2, "STATUS: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG2, "STATUS: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG2, "STATUS: onDestroy()");
    }




}