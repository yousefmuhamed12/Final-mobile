package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  //  public static final String EXTRA_MESSAGE= "mo7a";
    String message;
    private EditText Ex;
  //  private String message;
    public Button bu;
    public Button b;
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ex=findViewById(R.id.username);
        bu=findViewById(R.id.Loginbtn);
        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=Ex.getText().toString();
                Intent ii = new Intent(MainActivity.this,Home.class);
                ii.putExtra("KeyName",username);
                startActivity(ii);
            }
        });
      //  b=findViewById(R.id.Loginbtn);
      //  b.setOnClickListener(new View.OnClickListener() {
       //     @Override
       //     public void onClick(View view) {
       //         setContentView(R.layout.activity_home);
       //     }
      //   });

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

    public void signup(View v){
        Intent i = new Intent(this,Signup.class);
        startActivity(i);
    }
    public void Back(View view) {
        Intent i = new Intent(this,Home.class);
       // String message = Ex.getText().toString();
      //  i.putExtra("EX", message);
        startActivity(i);
    }
    //public void logout(View v){
     //   setContentView(R.layout.activity_main);
   // }






}