package com.example.haha.mysecondapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MessageShow(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("请输入");
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setView(new EditText(MainActivity.this));
        builder.setPositiveButton("是" ,  null );
        builder.setNegativeButton("否", null);
        builder.show();

    }
}
