package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    public Button o;
    String message;
    public Button l;
    RecyclerView rv;
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        o=findViewById(R.id.Order);
        l=findViewById(R.id.Logout);
        txt=findViewById(R.id.text_message);
       // Intent intent = getIntent();
        message = getIntent().getStringExtra("KeyName");
       // TextView textView = findViewById(R.id.text_message);
        txt.setText(message);


    }
    public void move(View v){
       setContentView(R.layout.activity_menu);

        String[] s1,s2;

        int[] images ={R.drawable.dp,R.drawable.mup,R.drawable.marpizza,R.drawable.vp};
        rv=findViewById(R.id.rv);
        s1= getResources().getStringArray(R.array.pizzas);
        s2= getResources().getStringArray(R.array.description);
        com.example.login.MyAdapter myAdapter=new com.example.login.MyAdapter(this,s1,s2,images);
        rv.setAdapter(myAdapter);
        rv.setLayoutManager(new LinearLayoutManager(this));





    }
    public void display(View v){
        // final Toast toast;
        // shows message to the user
        Toast.makeText(Home.this,"Added!",Toast.LENGTH_SHORT).show();
        Intent i4 = new Intent(Home.this,ty.class);
        message = getIntent().getStringExtra("KeyName");
        // TextView textView = findViewById(R.id.text_message);
        i4.putExtra("KeyName",message);

        startActivity(i4);

    }
    public void logout(View v){
        setContentView(R.layout.activity_main);
    }
    public void feed(View v){
        //setContentView(R.layout.activity_feedback);
        Intent i = new Intent(this,Feedback.class);
        startActivity(i);
    }


}