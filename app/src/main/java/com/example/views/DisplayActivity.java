package com.example.views;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    TextView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        view = findViewById(R.id.textView);
        Intent received = getIntent();
        String displayMessage = received.getStringExtra(MainActivity.EXTRA_MESSAGE);
        view.setText(displayMessage);
    }
}
