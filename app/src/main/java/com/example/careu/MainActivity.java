package com.example.careu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnlogin,btnreg;
    //SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        sharedPreferences=getSharedPreferences("logIn", MODE_PRIVATE);
//        if(sharedPreferences.contains("logInStatus"))
//        {
//            Intent intent=new Intent(getApplicationContext(),homePageDuplicate.class);
//           // startActivity(intent);
//        }

        btnlogin = findViewById(R.id.btnLog);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // sharedPreferences.edit().putBoolean("logged",true).apply();
                Intent i = new Intent(getApplicationContext(),loginPage.class);
                startActivity(i);
            }
        });
        btnreg = findViewById(R.id.btnReg);
        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toreg = new Intent(getApplicationContext(),registrationPage.class);
                startActivity(toreg);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();

        sessionManagement sessionManagement = new sessionManagement(MainActivity.this);
        String userName = sessionManagement.getSession();

        Toast.makeText(this, userName, Toast.LENGTH_LONG).show();
        if(!userName.equals("no")){
            Intent ne = new Intent(this,homePageDuplicate.class);
            ne.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(ne);
        }else{
//              Intent log = new Intent(this,loginPage.class);
//              log.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
//              startActivity(log);
        }
    }
}
