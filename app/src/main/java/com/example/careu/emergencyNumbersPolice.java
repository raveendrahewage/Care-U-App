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

public class emergencyNumbersPolice extends AppCompatActivity {

    int request_call = 1;
    TextView police1,police2,police3,police4,police5,police6,police7,police8,police9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_numbers_police);

        police1 = findViewById(R.id.txtpolice1);
        police2 = findViewById(R.id.txtpolice2);
        police3 = findViewById(R.id.txtpolice3);
        police4 = findViewById(R.id.txtpolice4);
        police5 = findViewById(R.id.txtpolice5);
        police6 = findViewById(R.id.txtpolice6);
        police7 = findViewById(R.id.txtpolice7);
        police8 = findViewById(R.id.txtpolice8);
        police9 = findViewById(R.id.txtpolice9);
    }

    public void getNumber(View view) {
        String number;
        switch (view.getId()){
            case R.id.Police1:
                number = police1.getText().toString();
                getCall(number);
                break;

            case R.id.Police2:
                number = police2.getText().toString();
                getCall(number);
                break;

            case R.id.Police3:
                number = police3.getText().toString();
                getCall(number);
                break;

            case R.id.Police4:
                number = police4.getText().toString();
                getCall(number);
                break;

            case R.id.Police5:
                number = police5.getText().toString();
                getCall(number);
                break;

            case R.id.Police6:
                number = police6.getText().toString();
                getCall(number);
                break;

            case R.id.Police7:
                number = police7.getText().toString();
                getCall(number);
                break;

            case R.id.Police8:
                number = police8.getText().toString();
                getCall(number);
                break;

            case R.id.Police9:
                number = police9.getText().toString();
                getCall(number);
                break;
        }
    }

    public void getCall(String number){
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:"+number));
        //Toast.makeText(this,number, Toast.LENGTH_SHORT).show();
        if(ActivityCompat.checkSelfPermission(emergencyNumbersPolice.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(emergencyNumbersPolice.this,new String []{Manifest.permission.CALL_PHONE},request_call);

            //startActivity(intent);
            return;
        }
        startActivity(intent);
        //Toast.makeText(this,"sss", Toast.LENGTH_SHORT).show();
    }
}