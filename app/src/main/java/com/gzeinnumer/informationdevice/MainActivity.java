package com.gzeinnumer.informationdevice;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("TAG", "SERIAL: " +       Build.SERIAL);
        Log.d("TAG","MODEL: " +         Build.MODEL);
        Log.d("TAG","ID: " +            Build.ID);
        Log.d("TAG","Manufacture: " +   Build.MANUFACTURER);
        Log.d("TAG","brand: " +         Build.BRAND);
        Log.d("TAG","type: " +          Build.TYPE);
        Log.d("TAG","user: " +          Build.USER);
        Log.d("TAG","BASE: " +          Build.VERSION_CODES.BASE);
        Log.d("TAG","INCREMENTAL " +    Build.VERSION.INCREMENTAL);
        Log.d("TAG","SDK  " +           Build.VERSION.SDK);
        Log.d("TAG","BOARD: " +         Build.BOARD);
        Log.d("TAG","BRAND " +          Build.BRAND);
        Log.d("TAG","HOST " +           Build.HOST);
        Log.d("TAG","FINGERPRINT: "+    Build.FINGERPRINT);
        Log.d("TAG","Version Code: " +  Build.VERSION.RELEASE);

        TextView textView = findViewById(R.id.textView);
        textView.setText(Build.SERIAL);
    }
}
