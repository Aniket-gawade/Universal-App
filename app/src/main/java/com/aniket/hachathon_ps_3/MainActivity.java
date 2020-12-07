package com.aniket.hachathon_ps_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void Login(View v){
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        String user = username.getText().toString();
        String pass = password.getText().toString();
        if(!user.equals("") && !pass.equals("")) {
            Intent intent = new Intent(this, Options.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "Enter valid Username and Password", Toast.LENGTH_SHORT).show();
        }
    }



    public void Register(View v){
        Intent intent = new Intent(this, activity_register.class);
        startActivity(intent);

    }

    public void Forgot_pass(View v){


    }
}