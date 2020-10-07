package com.example.careu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class homePageDuplicate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_duplicate);
    }


    public void Police_Emergency_Service(View view) {
        Intent i = new Intent(this,policeEcomplain.class);
        startActivity(i);
    }

    public void Suwasariya_Ambulance_Srevice(View view) {
        Intent i = new Intent(this,ambulance.class);
        startActivity(i);
    }

    public void profile(View view) {
        Intent i = new Intent(this,my_profile.class);
        startActivity(i);
    }

    public void emgency_Numbers(View view) {
        Intent i = new Intent(this,emergencyNumbers.class);
        startActivity(i);
    }
}