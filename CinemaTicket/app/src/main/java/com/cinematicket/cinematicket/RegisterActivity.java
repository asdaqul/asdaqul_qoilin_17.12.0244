package com.cinematicket.cinematicket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void backButton(View view){
        finish();
    }

    public void registerClick(View view){
        Toast.makeText(RegisterActivity.this, "Pendaftaran Sukses, Terima Kasih", Toast.LENGTH_LONG).show();
    }
}
