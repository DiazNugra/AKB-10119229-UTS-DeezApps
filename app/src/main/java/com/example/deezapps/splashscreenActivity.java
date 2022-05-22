package com.example.deezapps;
/*Tanggal Pengerjaan : 07-05-2022
  NIM                : 10119229
  Nama               : Diaz Maulidzan Nugraha
  Kelas              : IF6
 */
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashscreenActivity extends AppCompatActivity {

    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashscreenActivity.this, walkthroughActivity1.class);
                startActivity(intent);
                finish();
            }
        }, 2000L);

    }
}