package com.example.careu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class my_requests extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_requests);
    }

    public void req_1(View view) {
        Intent i= new Intent(this,request_1.class);
        startActivity(i);
    }

    public void req_2(View view) {
        Intent i= new Intent(this,request_2.class);
        startActivity(i);
    }


}
