package com.example.amst5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EventActivity extends AppCompatActivity {
    private static final String TAG = "Eventos";
    private TextView theDate;
    private TextView theEvent;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_layout);

        theDate= (TextView) findViewById(R.id.date);
        theEvent= (TextView) findViewById(R.id.event);

        Intent incomingIntent = getIntent();
        String date = incomingIntent.getStringExtra ("date");
        theDate.setText(date);
        String event = incomingIntent.getStringExtra ("event");
        theEvent.setText(event);

    }
}