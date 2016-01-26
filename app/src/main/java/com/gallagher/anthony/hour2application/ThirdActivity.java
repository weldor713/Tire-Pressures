package com.gallagher.anthony.hour2application;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity implements OnItemSelectedListener {

    private Spinner spinner2;
    private static final String[] paths = {"Diablo Superbike", "Diablo Supercorsa", "Diablo Rosso Corsa", "Diablo Rain" };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        TextView newtext = (TextView)findViewById(R.id.coldPsi);
        newtext.setText("Cold Psi");

        spinner2 = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ThirdActivity.this,
                android.R.layout.simple_spinner_item, paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);
        spinner2.setOnItemSelectedListener(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent= getIntent();
        String message = intent.getStringExtra("com.gallagher.anthony.MESSAGE");
        TextView messageTextView = (TextView) findViewById(R.id.message);
        messageTextView.setText(message);


    }

    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

        TextView newtext = (TextView)findViewById(R.id.coldPsi);

        switch (position) {
            case 0:
                //Diablo Superbike
                newtext.setText(R.string.diablosuperbike);
                break;
            case 1:
                //Diablo Supercorsa
                newtext.setText(R.string.diablosupercorsa);
                break;
            case 2:
                //Diablo Rosso Corsa
                newtext.setText(R.string.diablorossocorsa);
                break;
            case 3:
                //Diablo Rain
                newtext.setText(R.string.diablorain);
                break;


        }

    }



    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
