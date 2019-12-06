package com.example.getthecar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RentingActivity extends AppCompatActivity {
    TextView welcome;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renting);

        welcome =findViewById(R.id.welview);
        Intent act = getIntent();
        name = act.getStringExtra("Name");
        welcome.setText("welcome " + name);

    }
}
