package com.anugrah.prj11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtNama,txtNpm,txtProdi,txtjk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNama = (TextView) findViewById(R.id.txtNama);
        txtNpm = (TextView) findViewById(R.id.txtNpm);
        txtProdi = (TextView) findViewById(R.id.txtProdi);
        txtjk = (TextView) findViewById(R.id.txtjk);
        txtNama.setText("Muhammad Anugrah Rizky");
        txtNpm.setText("18425009");
        txtjk.setText("Laki-Laki");
        txtProdi.setText("Informatika");
    }
}