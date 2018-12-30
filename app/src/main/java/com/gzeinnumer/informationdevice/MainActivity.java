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

    /**

     2018-12-27 11:51:58.469 3698-3698/? D/TAG: SERIAL: 42002372cc53847b
     2018-12-27 11:51:58.469 3698-3698/? D/TAG: MODEL: SM-C710F
     2018-12-27 11:51:58.469 3698-3698/? D/TAG: ID: NMF26X
     2018-12-27 11:51:58.469 3698-3698/? D/TAG: Manufacture: samsung
     2018-12-27 11:51:58.469 3698-3698/? D/TAG: brand: samsung
     2018-12-27 11:51:58.469 3698-3698/? D/TAG: type: user
     2018-12-27 11:51:58.469 3698-3698/? D/TAG: user: dpi
     2018-12-27 11:51:58.469 3698-3698/? D/TAG: BASE: 1
     2018-12-27 11:51:58.469 3698-3698/? D/TAG: INCREMENTAL C710FDXU2ARJ1
     2018-12-27 11:51:58.469 3698-3698/? D/TAG: SDK  25
     2018-12-27 11:51:58.469 3698-3698/? D/TAG: BOARD: MT6757
     2018-12-27 11:51:58.470 3698-3698/? D/TAG: BRAND samsung
     2018-12-27 11:51:58.470 3698-3698/? D/TAG: HOST SWDG5316
     2018-12-27 11:51:58.470 3698-3698/? D/TAG: FINGERPRINT: samsung/jadeltedx/jadelte:7.1.1/NMF26X/C710FDXU2ARJ1:user/release-keys
     2018-12-27 11:51:58.470 3698-3698/? D/TAG: Version Code: 7.1.18

     */
}
