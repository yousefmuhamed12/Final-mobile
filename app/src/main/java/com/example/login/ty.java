package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ty extends AppCompatActivity {
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ty);
    }

    public void Back(View view) {
        Intent i = new Intent(this,Home.class);
        message = getIntent().getStringExtra("KeyName");
        // TextView textView = findViewById(R.id.text_message);
        i.putExtra("KeyName",message);
        startActivity(i);
    }
}