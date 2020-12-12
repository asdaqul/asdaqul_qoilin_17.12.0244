package com.cinematicket.cinematicket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatRadioButton;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SelectTimeActivity extends AppCompatActivity {

    private TextView textViewNama;
    private TextView textViewTgl;
    private TextView textViewDurasi;
    private TextView textViewHarga;
    private ImageView imageViewCover;
    private AppCompatRadioButton radioButton1;
    private AppCompatRadioButton radioButton2;
    private AppCompatRadioButton radioButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_time);

        textViewNama = (TextView) findViewById(R.id.text_judul);
        textViewTgl = (TextView) findViewById(R.id.text_tgl);
        textViewDurasi = (TextView) findViewById(R.id.text_durasi);
        textViewHarga = (TextView) findViewById(R.id.text_harga);
        imageViewCover = (ImageView) findViewById(R.id.image_cover);
        radioButton1 = (AppCompatRadioButton) findViewById(R.id.radio_1);
        radioButton2 = (AppCompatRadioButton) findViewById(R.id.radio_2);
        radioButton3 = (AppCompatRadioButton) findViewById(R.id.radio_3);

        Intent intent = getIntent();

        textViewNama.setText(intent.getStringExtra("nama"));
        textViewTgl.setText(intent.getStringExtra("tgl"));
        textViewDurasi.setText(intent.getStringExtra("durasi"));
        textViewHarga.setText("IDR " + intent.getStringExtra("harga"));

        if(intent.getStringExtra("cover").equals("image1")){
            imageViewCover.setImageResource(R.drawable.avengers);
        }else if(intent.getStringExtra("cover").equals("image2")){
            imageViewCover.setImageResource(R.drawable.pengabdi_setan);
        }else if(intent.getStringExtra("cover").equals("image3")){
            imageViewCover.setImageResource(R.drawable.ant_man);
        }else if(intent.getStringExtra("cover").equals("image4")){
            imageViewCover.setImageResource(R.drawable.greatest_snowman);
        }else if(intent.getStringExtra("cover").equals("image5")){
            imageViewCover.setImageResource(R.drawable.conjuring2);
        }else{
            imageViewCover.setImageResource(R.drawable.transformers);
        }
    }

    public void nextClick(View view){
        Intent intent = new Intent(SelectTimeActivity.this, PesananActivity.class);
        intent.putExtra("judul", textViewNama.getText().toString());
        intent.putExtra("tgl", textViewTgl.getText().toString());
        intent.putExtra("durasi", textViewDurasi.getText().toString());
        intent.putExtra("harga", textViewHarga.getText().toString());
        if(radioButton1.isChecked()){
            intent.putExtra("jam", "11:00 WIB");
        }else if(radioButton2.isChecked()){
            intent.putExtra("jam", "16:45 WIB");
        }else{
            intent.putExtra("jam", "20:00 WIB");
        }

        startActivity(intent);
    }

    public void backButton(View view){
        finish();
    }
}
