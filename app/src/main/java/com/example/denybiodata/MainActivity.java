package com.example.denybiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cellphone (View view){
        Uri uri = Uri.parse("tel:0895397317309");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);

    }

    public void showMap(View view){
        Uri uri = Uri.parse("https://www.google.com/maps/place/Kota+Semarang,+Kalicari,+Kec.+Pedurungan,+Kota+Semarang,+Jawa+Tengah+50198/@-6.9970227,110.4562305,18z/data=!3m1!4b1!4m5!3m4!1s0x2e708ce9751769fd:0x2b50d77cb50c7003!8m2!3d-6.9968002!4d110.4575135");
        Intent it = new Intent(android.content.Intent.ACTION_VIEW,uri);
        startActivity(it);
    }

    public void email(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("teks/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"yohandeny.10@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Email dari aplikasi android");
        try {
            startActivity(Intent.createChooser(intent, "ingin mengirim email?"));
        }catch (android.content.ActivityNotFoundException ex){
        }
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(R.mipmap.ic_launcher)
                .setTitle(R.string.app_name)
                .setMessage("Apakah kamu yakin?")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                })
                .show();
    }

}