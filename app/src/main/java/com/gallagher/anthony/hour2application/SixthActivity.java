package com.gallagher.anthony.hour2application;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SixthActivity extends AppCompatActivity implements OnItemSelectedListener {

    private Spinner spinner;
    private static final String[] paths = {"ContiTrack", "ContiRaceAttack Rain", "ContiRaceAttack Slick",
            "ContiSportAttack 3", "ContiSportAttack 2", "ContiSportAttack", "ContiRaceAttack Comp.End", "ContiRaceAttack Comp." };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

        TextView newtext = (TextView)findViewById(R.id.continentalColdPsi);
        newtext.setText("Cold Psi");

        spinner = (Spinner)findViewById(R.id.spinner5);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(SixthActivity.this,
                android.R.layout.simple_spinner_item, paths);

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

    public void onItemSelected(AdapterView<?>parent, View v, int position, long id) {
        TextView contitext = (TextView)findViewById(R.id.continentalColdPsi);

        switch (position) {
            case 0:
                //ContiTrack
                contitext.setText(R.string.contitrack);
                break;
            case 1:
                //ContiRaceAttack Rain
                contitext.setText(R.string.contiraceattackrain);
                break;
            case 2:
                //ContiRaceAttack Slick
                contitext.setText(R.string.contiraceattackslick);
                break;
            case 3:
                //ContiSportAttack 3
                contitext.setText(R.string.contisportattack3);
                break;
            case 4:
                //ContiSportAttack 2
                contitext.setText(R.string.contisportattack2);
                break;
            case 5:
                //ContiSportAttack
                contitext.setText(R.string.contisportattack);
                break;
            case 6:
                //ContiRaceAttack Comp.End
                contitext.setText(R.string.contiraceattackcompend);
                break;
            case 7:
                //ContiRaceAttack Comp.
                contitext.setText(R.string.contiraceattackcomp);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent){

    }

}
