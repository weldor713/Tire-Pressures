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

public class SeventhActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinner;
    private static final String[] paths = {"Battleax V02", "BT003", "GP Slick", "BT011", "BT012",
            "BT014", "BT015", "BT016", "BT016pro", "BT020", "BT021", "BT023", "BT028", "BT090"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

      //  TextView newtext = (TextView)findViewById(R.id.coldPsi);
      //  newtext.setText("Cold Psi");

        spinner = (Spinner)findViewById(R.id.spinner6); //maybe change spinner5 to spinner um changed to 6
        ArrayAdapter<String> adapter = new ArrayAdapter<>(SeventhActivity.this,
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

    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

        TextView bridgetext = (TextView)findViewById(R.id.bridgestoneColdPsi);

        switch (position) {
            case 0:
                //Battleax V02
                bridgetext.setText(R.string.battleaxv02);
                break;
            case 1:
                //BT003
                bridgetext.setText(R.string.bt003);
                break;
            case 2:
                //BT016
                bridgetext.setText(R.string.bt016);
                break;
            case 3:
                //BT016pro
                bridgetext.setText(R.string.bt016pro);
                break;
            case 4:
                //BT020
                bridgetext.setText(R.string.bt020);
                break;
            case 5:
                //BT021
                bridgetext.setText(R.string.bt021);
                break;
            case 6:
                //BT023
                bridgetext.setText(R.string.bt023);
                break;
            case 7:
                //BT028
                bridgetext.setText(R.string.bt028);
                break;
            case 8:
                //BT090
                bridgetext.setText(R.string.bt090);
                break;
        }
    }

        @Override
        public void onNothingSelected(AdapterView<?> parent){

        }
}
