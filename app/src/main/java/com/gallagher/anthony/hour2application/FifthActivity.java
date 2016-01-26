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

public class FifthActivity extends AppCompatActivity implements OnItemSelectedListener {

    private Spinner spinner;
    private static final String[] paths ={"Power Slick evo", "Power Cup evo", "Power Rain", "Power SuperSport evo", "Power SuperSport", "Power SuperMoto"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

       // TextView newtext = (TextView)findViewById(R.id.coldPsi);
      //  newtext.setText("Cold Psi:");

        spinner = (Spinner)findViewById(R.id.spinner4);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(FifthActivity.this,
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

        TextView michtext = (TextView)findViewById(R.id.michelinColdPsi);

        switch (position) {
            case 0:
                //Power Slick evo
                michtext.setText(R.string.powerslickevo);
                break;
            case 1:
                //Power Cup evo
                michtext.setText(R.string.powercupevo);
                break;
            case 2:
                //Power Rain
                michtext.setText(R.string.powerrain);
                break;
            case 3:
                //Power SuperSport evo
                michtext.setText(R.string.powersupersportevo);
                break;
            case 4:
                //Power SuperSport
                michtext.setText(R.string.powersupersport);
                break;
            case 5:
                //Power SuperMoto
                michtext.setText(R.string.powersupermoto);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent){

    }

}
