package com.example.galihariwanda.firstsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KasirActivity extends AppCompatActivity implements View.OnClickListener{

    EditText edtNama;
    Button btnMinus, btnPlus;
    TextView txtJumlah;

    int jumlah = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kasir);

        edtNama = (EditText) findViewById(R.id.edtNama);
        btnMinus = (Button) findViewById(R.id.btn_minus);
        btnPlus = (Button) findViewById(R.id.btn_plus);
        txtJumlah = (TextView) findViewById(R.id.txt_jumlah);

        btnMinus.setOnClickListener(this);
        btnPlus.setOnClickListener(this);

        txtJumlah.setText("" + jumlah);
    }

    @Override
    public void onClick(View view) {
        if (view == btnMinus){
            jumlah--;
            txtJumlah.setText("" + jumlah);
        }else if (view == btnPlus){
            jumlah++;
            txtJumlah.setText("" + jumlah);
        }
    }
}
