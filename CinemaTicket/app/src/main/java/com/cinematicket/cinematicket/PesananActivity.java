package com.cinematicket.cinematicket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class PesananActivity extends AppCompatActivity {

    private TextView textViewJudul;
    private TextView textViewTgl;
    private TextView textViewJam;
    private TextView textViewDurasi;
    private TextView textViewHarga;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan);

        textViewJudul = (TextView) findViewById(R.id.text_judul);
        textViewTgl = (TextView) findViewById(R.id.text_tgl);
        textViewJam = (TextView) findViewById(R.id.text_jam);
        textViewDurasi = (TextView) findViewById(R.id.text_durasi);
        textViewHarga = (TextView) findViewById(R.id.text_harga);

        Intent intent = getIntent();

        textViewJudul.setText(intent.getStringExtra("judul"));
        textViewTgl.setText(intent.getStringExtra("tgl"));
        textViewJam.setText(intent.getStringExtra("jam"));
        textViewDurasi.setText(intent.getStringExtra("durasi"));
        textViewHarga.setText(intent.getStringExtra("harga"));

        Toast.makeText(this, "Terima Kasih Atas Pesanan Anda", Toast.LENGTH_LONG).show();
    }

    public void logoutClick(View view){
        Intent intent = new Intent(PesananActivity.this, FirstActivity.class);
        startActivity(intent);
    }

    public void backButton(View view){
        finish();
    }
}
