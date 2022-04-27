package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    public Button o;
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        o=findViewById(R.id.Order);

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

    }
}