package com.example.sarathreddyvaddhi.jokesapplication;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {

    public static String JOKES_TEXT_INTENT_EXTRA = "jokesTextIntentExtra";

    @RequiresApi(api = Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jokes_activity);
        TextView jokesTextView = (TextView) findViewById(R.id.jokesText);
        jokesTextView.setText(getIntent().getStringExtra(JOKES_TEXT_INTENT_EXTRA));
    }
}
