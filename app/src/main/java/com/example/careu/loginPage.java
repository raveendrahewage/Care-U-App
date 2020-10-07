package com.example.careu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class loginPage extends AppCompatActivity {

    Button btnlogin;
    TextView forgetpw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

//        btnlogin = findViewById(R.id.btnLog);
//
//        btnlogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(getApplicationContext(),homePage.class);
//                startActivity(i);
//            }
//        });

        forgetpw = findViewById(R.id.txtfp);
        forgetpw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),forgetPassword.class);
                startActivity(intent);
            }
        });
    }



    public void homePage(View view) {
        Intent ne = new Intent(this,homePageDuplicate.class);
        startActivity(ne);
    }
}
