package com.example.amst5;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.CalendarView;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class CalendarActivity extends AppCompatActivity {
    private static final String TAG = "CalendarActivity";
    private CalendarView mCalendarView;
    private EditText mText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_layout);
        mCalendarView = (CalendarView) findViewById(R.id.calendarView);
        mText = (EditText) findViewById(R.id.text_event);

        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int year, int month, int dayOfMonth) {
                String date= dayOfMonth + "/" + (month + 1) + "/" + year;
                Log.d(TAG,"onSelectedDayChange: date: "+ date);

                Intent intent = new Intent(CalendarActivity.this, EventActivity.class);
                intent.putExtra("date", date);
                String event = mText.getText().toString();
                intent.putExtra("event", event);
                startActivity(intent);
            }
        });
    }
}