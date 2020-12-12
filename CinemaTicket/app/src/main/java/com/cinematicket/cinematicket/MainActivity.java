package com.cinematicket.cinematicket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setTitle("");
        setSupportActionBar(toolbar);
    }

    public void movie1Click(View view){
        Intent intent = new Intent(MainActivity.this, SelectTimeActivity.class);
        intent.putExtra("nama", "Avengers: Infinity Wars");
        intent.putExtra("tgl", "27 Juli 2018");
        intent.putExtra("harga", "50000");
        intent.putExtra("cover", "image1");
        intent.putExtra("durasi", "148 menit");
        startActivity(intent);
    }

    public void movie2Click(View view){
        Intent intent = new Intent(MainActivity.this, SelectTimeActivity.class);
        intent.putExtra("nama", "Para Pengabdi Setan");
        intent.putExtra("tgl", "26 Juli 2018");
        intent.putExtra("harga", "45000");
        intent.putExtra("cover", "image2");
        intent.putExtra("durasi", "101 menit");
        startActivity(intent);
    }

    public void movie3Click(View view){
        Intent intent = new Intent(MainActivity.this, SelectTimeActivity.class);
        intent.putExtra("nama", "Ant-Man And The Wasp");
        intent.putExtra("tgl", "25 Juli 2018");
        intent.putExtra("harga", "50000");
        intent.putExtra("cover", "image3");
        intent.putExtra("durasi", "105 menit");
        startActivity(intent);
    }

    public void movie4Click(View view){
        Intent intent = new Intent(MainActivity.this, SelectTimeActivity.class);
        intent.putExtra("nama", "The Greatest Snowman");
        intent.putExtra("tgl", "24 Juli 2018");
        intent.putExtra("harga", "40000");
        intent.putExtra("cover", "image4");
        intent.putExtra("durasi", "104 menit");
        startActivity(intent);
    }

    public void movie5Click(View view){
        Intent intent = new Intent(MainActivity.this, SelectTimeActivity.class);
        intent.putExtra("nama", "The Conjuring 2");
        intent.putExtra("tgl", "23 Juli 2018");
        intent.putExtra("harga", "45000");
        intent.putExtra("cover", "image5");
        intent.putExtra("durasi", "134 menit");
        startActivity(intent);
    }

    public void movie6Click(View view){
        Intent intent = new Intent(MainActivity.this, SelectTimeActivity.class);
        intent.putExtra("nama", "Transformers: The Last Knight");
        intent.putExtra("tgl", "22 Juli 2018");
        intent.putExtra("harga", "55000");
        intent.putExtra("cover", "image6");
        intent.putExtra("durasi", "154 menit");
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.logout:
                Intent intent = new Intent(MainActivity.this, FirstActivity.class);
                startActivity(intent);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
