package com.cinematicket.cinematicket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextUser;
    private EditText editTextPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextUser = (EditText) findViewById(R.id.edit_username);
        editTextPass = (EditText) findViewById(R.id.edit_password);
    }

    public void backButton(View view){
        finish();
    }

    public void loginClick(View view){
        String user = editTextUser.getText().toString();
        String pass = editTextPass.getText().toString();

        if(user.equals("user") && pass.equals("user") || user.equals("anis") && pass.equals("anis") || user.equals("vian") && pass.equals("vian")
                || user.equals("icha") && pass.equals("icha") || user.equals("zidan") && pass.equals("zidan")){
            Toast.makeText(LoginActivity.this, "Selamat Datang", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(LoginActivity.this, "Periksa Kembali Username atau Password Anda", Toast.LENGTH_LONG).show();
        }
    }
}
