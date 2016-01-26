package com.gallagher.anthony.hour2application;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;



public class FourthActivity extends AppCompatActivity implements OnItemSelectedListener {

    private Spinner spinner;
    private static final String[] paths = {"Racetec RR", "Sportec M5", "Sportec M3", "Sportec M7 RR",
            "Roadtec Z6", "Roadtec Z6 Interact", "ME Z4", "ME Z2" };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        TextView newtext = (TextView)findViewById(R.id.metzelerColdPsi);
        newtext.setText("Cold");

        spinner = (Spinner) findViewById(R.id.spinner3);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(FourthActivity.this,
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

        TextView metzext = (TextView)findViewById(R.id.metzelerColdPsi);

        switch (position) {
            case 0:
                //Racetec RR
                metzext.setText(R.string.racetecrr);
                break;
            case 1:
                //Sportec M5
                metzext.setText(R.string.sportecm5);
                break;
            case 2:
                //Sportec M3
                metzext.setText(R.string.sportecm3);
                break;
            case 3:
                //Sportec M7 RR
                metzext.setText(R.string.sportecm7rr);
                break;
            case 4:
                //Roadtec Z6
                metzext.setText(R.string.roadtecz6);
                break;
            case 5:
                //Roadtec Z6 Interact
                metzext.setText(R.string.roadtecz6interact);
                break;
            case 6:
                //ME Z4
                metzext.setText(R.string.mez4);
                break;
            case 7:
                //ME Z2
                metzext.setText(R.string.mez2);
                break;


        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
