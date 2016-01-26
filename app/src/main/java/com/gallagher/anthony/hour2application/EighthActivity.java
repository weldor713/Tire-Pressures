package com.gallagher.anthony.hour2application;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class EighthActivity extends AppCompatActivity implements OnItemSelectedListener{

    private Spinner spinner;
    private static final String[] paths = {"3D Ultra Sport", "3D Ultra Xtreme", "3D Ultra Supersport"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);

        TextView newtext = (TextView)findViewById(R.id.avonColdPsi);
        newtext.setText("Cold Psi");

        spinner = (Spinner) findViewById(R.id.spinner7);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(EighthActivity.this,
                android.R.layout.simple_spinner_dropdown_item, paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent= getIntent();
        String message = intent.getStringExtra("com.gallagher.anthony.MESSAGE");
        TextView messageTextView = (TextView) findViewById(R.id.message);
        messageTextView.setText(message);

    }

    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

        TextView avontext = (TextView)findViewById(R.id.avonColdPsi);

        switch (position) {
            case 0:
                //3D Ultra Sport Xtreme
                avontext.setText(R.string.ultraxtreme3d);
                break;
            case 1:
                //3D Ultra Sport
                avontext.setText(R.string.ultrasport3d);
                break;
            case 2:
                //3D Ultra SuperSport
                avontext.setText(R.string.ultrasupersport3d);
                break;

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
