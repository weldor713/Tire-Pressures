package com.gallagher.anthony.hour2application;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button dunlopButton = (Button) findViewById(R.id.buttonDunlop);
        dunlopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), SecondaryActivity.class);
                startIntent.putExtra("com.gallagher.anthony.MESSAGE", "Dunlop Tire Pressures");
                startActivity(startIntent);
            }
        });

        Button pirelliButton = (Button) findViewById(R.id.buttonPirelli);
        pirelliButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), ThirdActivity.class);
                startIntent.putExtra("com.gallagher.anthony.MESSAGE", "Pirelli Tire Pressures");
                startActivity(startIntent);
            }
        });

        Button metzelerButton = (Button) findViewById(R.id.buttonMetzeler);
        metzelerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), FourthActivity.class);
                startIntent.putExtra("com.gallagher.anthony.MESSAGE", "Metzeler Tire Pressures");
                startActivity(startIntent);
            }
        });

        Button michelinButton = (Button) findViewById(R.id.buttonMichelin);
        michelinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), FifthActivity.class);
                startIntent.putExtra("com.gallagher.anthony.MESSAGE", "Michelin Tire Pressures");
                startActivity(startIntent);
            }
        });

        Button continentalButton = (Button) findViewById(R.id.buttonContinental);
        continentalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), SixthActivity.class);
                startIntent.putExtra("com.gallagher.anthony.MESSAGE", "Continental Tire Pressures");
                startActivity(startIntent);
            }
        });

        Button bridgestoneButton = (Button) findViewById(R.id.buttonBridgestone);
        bridgestoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), SeventhActivity.class);
                startIntent.putExtra("com.gallagher.anthony.MESSAGE", "Bridgestone Tire Pressures");
                startActivity(startIntent);
            }
        });

        Button avonButton = (Button) findViewById(R.id.buttonAvon);
        avonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), EighthActivity.class);
                startIntent.putExtra("com.gallagher.anthony.MESSAGE", "Avon Tire Pressures");
                startActivity(startIntent);
            }
        });



       // FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
       // fab.setOnClickListener(new View.OnClickListener() {
       //     @Override
        //    public void onClick(View view) {
        //        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
         //               .setAction("Action", null).show();
        //    }
       // });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
