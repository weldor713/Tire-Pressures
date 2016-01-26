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

public class SecondaryActivity extends AppCompatActivity implements OnItemSelectedListener {

    private Spinner spinner;
    private static final String[] paths = {"Alpha13", "D209GP", "D211GP-A", "D212GP",
            "GP-A Pro", "KR106", "KR108", "KR189", "KR393", "KR448", "KR449", "KR451", "Unbeaten 02"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        TextView newtext = (TextView)findViewById(R.id.coldPsi);
        newtext.setText("Cold Psi");

        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(SecondaryActivity.this,
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

        TextView newtext = (TextView)findViewById(R.id.coldPsi);

        switch (position) {
            case 0:
                //Alapha13
                newtext.setText(R.string.alpha13);
                break;
            case 1:
                //D209GP
                newtext.setText(R.string.d209gp);
                break;
            case 2:
                //D211GPA
                newtext.setText(R.string.d211gpa);
                break;
            case 3:
                //D212GP
                newtext.setText(R.string.d212gp);
                break;
            case 4:
                //GP-A Pro
                newtext.setText(R.string.gpapro);
                break;
            case 5:
                //KR106
                newtext.setText(R.string.kr106);
                break;
            case 6:
                //KR108
                newtext.setText(R.string.kr108);
                break;
            case 7:
                //KR189
                newtext.setText(R.string.kr189);
                break;
            case 8:
                //KR393
                newtext.setText(R.string.kr393);
                break;
            case 9:
                //KR448
                newtext.setText(R.string.kr448);
                break;
            case 10:
                //KR449
                newtext.setText(R.string.kr449);
                break;
            case 11:
                //KR451
                newtext.setText(R.string.kr451);
                break;
            case 12:
                //Unbeaten02
                newtext.setText(R.string.unbeaten02);
                break;

        }

}

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
