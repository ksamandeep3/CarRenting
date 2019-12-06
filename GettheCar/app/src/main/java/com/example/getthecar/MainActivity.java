package com.example.getthecar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etName,etUsername,etPassword;
    Spinner carSpin;
    Button LoginBtn,CancelBtn;
     String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etname);
        etUsername = findViewById(R.id.etusername);
        etPassword = findViewById(R.id.etpassword);
        carSpin = findViewById(R.id.spinnercar);
        LoginBtn = findViewById(R.id.loginBtn);
        CancelBtn = findViewById(R.id.cancelBtn);

        LoginBtn.setOnClickListener(this);
        CancelBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {

        if (!etName.getText().toString().equals("") && (etUsername.getText().toString().equals("admin") && etPassword.getText().toString().equals("admin")) ){
            Intent act = new Intent(getApplicationContext(),RentingActivity.class);

            String customername = etName.getText().toString();
            act.putExtra("Name",customername);
            //starting an intent
            startActivity(act);

            //correcct password
        } else {
            Toast.makeText(getApplicationContext(), "Please fill all the fields", Toast.LENGTH_SHORT).show();
            //wrong password
        }
    }
}
