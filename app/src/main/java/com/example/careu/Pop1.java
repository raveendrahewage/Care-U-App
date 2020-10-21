package com.example.careu;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

import androidx.annotation.Nullable;

import org.w3c.dom.Text;


public class Pop1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pop1_window);


        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width =dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.7));
    }

    /* @Override
        public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
            super.onCreate(savedInstanceState, persistentState);
            setContentView(R.layout.pop1_window);

            Text view txt = (TextView) findViewById(R.id.t1);
            txt.setMovement
        }*/

}
