package com.example.cardiffbayflooring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Define Vars
    EditText et_email, et_password;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //hides the title bar of the app for this activity
        setContentView(R.layout.activity_main);

        //Reference my ID layouts with my Define Vars
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        btn_login = findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This is a button being clicked", Toast.LENGTH_SHORT).show();

                Intent LoginIntent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(LoginIntent);

            }
        });




    }
}