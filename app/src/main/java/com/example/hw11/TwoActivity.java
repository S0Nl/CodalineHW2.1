package com.example.hw11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TwoActivity extends AppCompatActivity {

    private EditText loginTA;
    private EditText passwordTA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two_activity);

        loginTA = (EditText) findViewById(R.id.loginTA);
        passwordTA = (EditText) findViewById(R.id.passwordTA);
    }

    public void sendData(View v) {
        if (loginTA.getText().toString().equals("") | passwordTA.getText().toString().equals("") | (loginTA.getText().toString().equals("") & passwordTA.getText().toString().equals("")) ) {
            Toast.makeText(this, "Необхідно ввести всі дані", Toast.LENGTH_LONG).show();
        } else {
            Intent intent = new Intent(this, LastActivity.class);
            intent.putExtra("login", loginTA.getText().toString());
            intent.putExtra("password", passwordTA.getText().toString());
            startActivity(intent);
        }
    }
}
