package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }



    public void login(View view) {
        Intent i2 = new Intent(this,MainActivity.class);
        startActivity(i2);
    }
    public void disp(View v) {
        // final Toast toast;
        // shows message to the user
        Intent i1 = new Intent(this,MainActivity.class);
        startActivity(i1);
        Toast.makeText(Signup.this, "Request submitted", Toast.LENGTH_SHORT).show();

    }

}