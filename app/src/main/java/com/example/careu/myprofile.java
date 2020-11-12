package com.example.careu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class myprofile extends AppCompatActivity {
//    sessionManagement sessionManagement1 = new sessionManagement(myprofile.this);
//    String user = sessionManagement1.getSession();
    String username= null;

//    String user= "limal";
    String apiurl ="http://10.0.2.2/careuAppWeb/careu-php/myprofile.php?userName=";
    TextView _userName,_fullName,_email,_phoneNumber,_nicNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//
        setContentView(R.layout.activity_my_profile);


        sessionManagement sessionManagement1 = new sessionManagement(myprofile.this);
        String user = sessionManagement1.getSession();
        apiurl ="http://10.0.2.2/careuAppWeb/careu-php/myprofile.php?userName="+user;
        _userName = findViewById(R.id.userName);
        _fullName = findViewById(R.id.fullName);
        _email =findViewById(R.id.email);
        _phoneNumber = findViewById(R.id.phoneNumber);
        _nicNumber = findViewById(R.id.nicNumber);

        viewprofile();


    }

    private void viewprofile() {
        StringRequest stringRequest = new StringRequest(Request.Method.GET, apiurl, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONArray mypro =  new JSONArray(response);
                    JSONObject myproObject = mypro.getJSONObject(0);
                    username = myproObject.getString("userName");
                    _userName.setText(username);
                    String fname = myproObject.getString("firstName");
                    String lname = myproObject.getString("lastName");
                    String fullName = fname + " " +lname;
                    _fullName.setText(fullName);
                    String email = myproObject.getString("email");
                    _email.setText(email);
                    String phoneNumber = myproObject.getString("phoneNumber");
                    _phoneNumber.setText(phoneNumber);
                    String nicNumber= myproObject.getString("nicNumber");
                    _nicNumber.setText(nicNumber);
                    Toast.makeText(myprofile.this, username, Toast.LENGTH_SHORT).show();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(myprofile.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }){
        };

        Volley.newRequestQueue(this).add(stringRequest);

    }



    public void my_requests(View view) {
        Intent i= new Intent(this, myrequests.class);
        startActivity(i);
    }

    public void edit_profile(View view) {
        Intent i= new Intent(this,edit_prof.class);
        startActivity(i);
    }
}
