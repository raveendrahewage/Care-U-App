package com.example.careu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
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

public class edit_prof extends AppCompatActivity {


    String apiurl ="http://10.0.2.2/careu-php/myprofile.php?userName=";
    EditText _fName,_lName,_email,_phoneNumber;
    TextView _userName,_nicNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//
        setContentView(R.layout.activity_edit_prof);
        sessionManagement sessionManagement1 = new sessionManagement(edit_prof.this);
        String user = sessionManagement1.getSession();
        apiurl ="http://10.0.2.2/careu-php/myprofile.php?userName="+user;
        _userName = findViewById(R.id.userName);
        _fName = findViewById(R.id.fName);
        _lName = findViewById(R.id.lName);
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
                    String username = myproObject.getString("userName");
                    _userName.setText(username);
                    String fname = myproObject.getString("firstName");
                    String lname = myproObject.getString("lastName");
                    _fName.setText(fname);
                    _lName.setText(lname);
                    String email = myproObject.getString("email");
                    _email.setText(email);
                    String phoneNumber = myproObject.getString("phoneNumber");
                    _phoneNumber.setText(phoneNumber);
                    String nicNumber= myproObject.getString("nicNumber");
                    _nicNumber.setText(nicNumber);
                    Toast.makeText(edit_prof.this, username, Toast.LENGTH_SHORT).show();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(edit_prof.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }){
        };

        Volley.newRequestQueue(this).add(stringRequest);

    }

    public void Cancel(View view) {


        Intent i = new Intent(this,myprofile.class);
        startActivity(i);
    }

    public void updateProfile(View view) {
        Intent i = new Intent(this,myprofile.class);
        startActivity(i);
    }
}
