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

public class emergencyNumbersFire extends AppCompatActivity {

    int request_call = 1;
    TextView fire1,fire2,fire3,fire4,fire5,fire6,fire7,fire8,fire9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_numbers_fire);

        fire1 = findViewById(R.id.txtfire1);
        fire2 = findViewById(R.id.txtfire2);
        fire3 = findViewById(R.id.txtfire3);
        fire4 = findViewById(R.id.txtfire4);
        fire5 = findViewById(R.id.txtfire5);
        fire6 = findViewById(R.id.txtfire6);
        fire7 = findViewById(R.id.txtfire7);
        fire8 = findViewById(R.id.txtfire8);
        fire9 = findViewById(R.id.txtfire9);
    }

    public void getNumber(View view) {
        String number;
        switch (view.getId()){
            case R.id.Fire1:
                number = fire1.getText().toString();
                getCall(number);
                break;

            case R.id.Fire2:
                number = fire2.getText().toString();
                getCall(number);
                break;

            case R.id.Fire3:
                number = fire3.getText().toString();
                getCall(number);
                break;

            case R.id.Fire4:
                number = fire4.getText().toString();
                getCall(number);
                break;

            case R.id.Fire5:
                number = fire5.getText().toString();
                getCall(number);
                break;

            case R.id.Fire6:
                number = fire7.getText().toString();
                getCall(number);
                break;

            case R.id.Fire8:
                number = fire8.getText().toString();
                getCall(number);
                break;

            case R.id.Fire9:
                number = fire9.getText().toString();
                getCall(number);
                break;
        }
    }

    public void getCall(String number){
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:"+number));
        //Toast.makeText(this,number, Toast.LENGTH_SHORT).show();
        if(ActivityCompat.checkSelfPermission(emergencyNumbersFire.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(emergencyNumbersFire.this,new String []{Manifest.permission.CALL_PHONE},request_call);

            //startActivity(intent);
            return;
        }
        startActivity(intent);
        //Toast.makeText(this,"sss", Toast.LENGTH_SHORT).show();
    }
}