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

public class emergencyNumbersOthers extends AppCompatActivity {

    int request_call = 1;
    TextView other1,other2,other3,other4,other5,other6,other7,other8,other9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_numbers_others);

        other1 = findViewById(R.id.txtother1);
        other2 = findViewById(R.id.txtother2);
        other3 = findViewById(R.id.txtother3);
        other4 = findViewById(R.id.txtother4);
        other5 = findViewById(R.id.txtother5);
        other6 = findViewById(R.id.txtother6);
        other7 = findViewById(R.id.txtother7);
        other8 = findViewById(R.id.txtother8);
        other9 = findViewById(R.id.txtother9);
    }

    public void getNumber(View view) {
        String number;
        switch (view.getId()){
            case R.id.Other1:
                number = other1.getText().toString();
                getCall(number);
                break;

            case R.id.Other2:
                number = other2.getText().toString();
                getCall(number);
                break;

            case R.id.Other3:
                number = other3.getText().toString();
                getCall(number);
                break;

            case R.id.Other4:
                number = other4.getText().toString();
                getCall(number);
                break;

            case R.id.Other5:
                number = other5.getText().toString();
                getCall(number);
                break;

            case R.id.Other6:
                number = other6.getText().toString();
                getCall(number);
                break;

            case R.id.Other7:
                number = other7.getText().toString();
                getCall(number);
                break;

            case R.id.Other8:
                number = other8.getText().toString();
                getCall(number);
                break;

            case R.id.Other9:
                number = other9.getText().toString();
                getCall(number);
                break;
        }
    }

    public void getCall(String number){

        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:"+number));
        //Toast.makeText(this,number, Toast.LENGTH_SHORT).show();
        if(ActivityCompat.checkSelfPermission(emergencyNumbersOthers.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(emergencyNumbersOthers.this,new String []{Manifest.permission.CALL_PHONE},request_call);

            //startActivity(intent);
            return;
        }
        startActivity(intent);
        //Toast.makeText(this,"sss", Toast.LENGTH_SHORT).show();
    }
}