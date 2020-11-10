package com.example.careu;

import android.content.Context;
import android.content.SharedPreferences;

public class sessionManagement {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    String SHARED_PREF_NAME =  "session";
    String SESSION_KEY = "session_user";

    public sessionManagement(Context context){
        sharedPreferences = context.getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void saveSession(User user){
        String name = user.getName();
        editor.putString(SESSION_KEY,name).commit();

    }

    public String getSession(){

       return sharedPreferences.getString(SESSION_KEY,"no");
        //return -1;
    }

    public void removeSession(){
        editor.putString(SESSION_KEY,"no").commit();
    }


}
