package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Feedback extends AppCompatActivity {
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
    }
    public void dispfeedback(View view) {
        // setContentView(R.layout.activity_home);
        Toast.makeText(Feedback.this,"Feedback sent",Toast.LENGTH_SHORT).show();
        Intent i4 = new Intent(Feedback.this,FeedSum.class);
        message = getIntent().getStringExtra("KeyName");
        // TextView textView = findViewById(R.id.text_message);
        i4.putExtra("KeyName",message);

        startActivity(i4);

    }

}