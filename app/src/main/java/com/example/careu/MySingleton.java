package com.example.careu;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class MySingleton {
    static MySingleton mInstance;
    RequestQueue requestQueue;
    Context mctx;

    private MySingleton(Context context){
        mctx = context;
        requestQueue = getRequestQueue();
    }



    public <T> void addToRequestQue(Request<T> request){
        getRequestQueue().add(request);
    }
}
