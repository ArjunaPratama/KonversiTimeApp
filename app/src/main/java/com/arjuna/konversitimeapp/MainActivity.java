package com.arjuna.konversitimeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etjam;
    TextView txthasil;
    Button btnhasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etjam = (EditText) findViewById(R.id.etjam);
        txthasil = (TextView) findViewById(R.id.txthasil);
        btnhasil = (Button) findViewById(R.id.btnhasil);


        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String njam = etjam.getText().toString();

                int ajam = Integer.parseInt(njam);

                int hasilmenit = (ajam*60);
                int hasildetika = (ajam*3600);

                txthasil.setText("Hasil Menit :" + hasilmenit +"\nHasil Detik :" + hasildetika);


            }
        });
    }
}
