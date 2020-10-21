package com.example.careu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class emergencyNumbersHealth extends AppCompatActivity {

    int request_call = 1;
    TextView health1,health2,health3,health4,health5,health6,health7,health8,health9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_numbers_health);

        health1 = findViewById(R.id.txtHealth1);
        health2 = findViewById(R.id.txtHealth2);
        health3 = findViewById(R.id.txtHealth3);
        health4 = findViewById(R.id.txtHealth4);
        health5 = findViewById(R.id.txtHealth5);
        health6 = findViewById(R.id.txtHealth6);
        health7 = findViewById(R.id.txtHealth7);
        health8 = findViewById(R.id.txtHealth8);
        health9 = findViewById(R.id.txtHealth9);

    }


    public void getNumber(View view) {
        String number;
        switch (view.getId()){
            case R.id.Health1 :
                //Toast.makeText(this,"aaa", Toast.LENGTH_SHORT).show();
                number = health1.getText().toString();
                getCall(number);
                break;

            case R.id.Health2:
                number = health2.getText().toString();
                getCall(number);
                break;

            case R.id.Health3:
                number = health3.getText().toString();
                getCall(number);
                break;

            case R.id.Health4:
                number = health4.getText().toString();
                getCall(number);
                break;

            case R.id.Health5:
                number = health5.getText().toString();
                getCall(number);
                break;

            case R.id.Health6:
                number = health6.getText().toString();
                getCall(number);
                break;

            case R.id.Health7:
                number = health7.getText().toString();
                getCall(number);
                break;

            case R.id.Health8:
                number = health8.getText().toString();
                getCall(number);
                break;

            case R.id.Health9:
                number = health9.getText().toString();
                getCall(number);
                break;
        }

    }

    public void getCall (String number) {
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:"+number));
        //Toast.makeText(this,number, Toast.LENGTH_SHORT).show();
        if(ActivityCompat.checkSelfPermission(emergencyNumbersHealth.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(emergencyNumbersHealth.this,new String []{Manifest.permission.CALL_PHONE},request_call);

            //startActivity(intent);
            return;
        }
        startActivity(intent);
        //Toast.makeText(this,"sss", Toast.LENGTH_SHORT).show();
    }

}