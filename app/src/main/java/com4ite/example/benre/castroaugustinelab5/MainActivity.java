package com4ite.example.benre.castroaugustinelab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("LAB5", "onStart() has executed");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("LAB5", "onResume() has executed");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("LAB5", "onPause() has executed");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("LAB5", "onStop() has executed");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("LAB5", "onDestroy() has executed");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("LAB5", "onRestart() has executed");
    }

    public void onClick (View v){
        Intent i = null, chooser = null;
        if(v.getId() == R.id.button)
        {
            i = new Intent(MainActivity.this, Main2Activity.class);
            MainActivity.this.startActivity(i);
        }

        else if(v.getId() == R.id.button2)
        {
            Uri g = Uri.parse("geo: 14.618836, 121.001252");
            i = new Intent(Intent.ACTION_VIEW, g);
            chooser = Intent.createChooser(i, "Choose Map App");
            startActivity(chooser);
        }
    }


}
