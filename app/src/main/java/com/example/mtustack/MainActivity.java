package com.example.mtustack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.activity_signup_page);
        Button mButton = (Button) findViewById(R.id.Button01);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, login_page.class));

                textView=(TextView)findViewById(R.id.txt1);
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this, login_page.class);
                        startActivity(intent);

                        Toast.makeText(MainActivity.this, "you clicked on text", Toast.LENGTH_SHORT).show();
                    }
                });





 {


                }


            }
        });
    }
}