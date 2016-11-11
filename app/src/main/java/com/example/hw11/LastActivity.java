package com.example.hw11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class LastActivity extends AppCompatActivity {

    private TextView txtlog;
    private TextView txtpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.last_activity);

        txtlog = (TextView) findViewById(R.id.txtlog);
        txtpass = (TextView) findViewById(R.id.txtpass);

        txtlog.setText(getIntent().getStringExtra("login"));
        txtpass.setText(getIntent().getStringExtra("password"));

    }

    public void goToTA(View v) {
        Intent intent = new Intent(this, TwoActivity.class);
        startActivity(intent);
    }
}