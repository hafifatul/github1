package com.example.labpoltek1.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnTambah, btnMinus, btnKali, btnBagi;
    TextView result;
    EditText edt1, edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialisasi
        //buton
        btnTambah = findViewById(R.id.btn_tambah);
        btnMinus = findViewById(R.id.btn_minus);
        btnKali = findViewById(R.id.btn_kali);
        btnBagi = findViewById(R.id.btn_bagi);

        //textview
        result = findViewById(R.id.hasil);

        //edittext
        edt1= findViewById(R.id.edt_1);
        edt2= findViewById(R.id.edt_2);

        //kasih event clik
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    //bikin variabel
                    int nilai1, nilai2, hasil;
                    //mengambil nilai dari edittext
                    nilai1 = Integer.parseInt(edt1.getText().toString());
                    nilai2 = Integer.parseInt(edt2.getText().toString());

                    hasil = nilai1 + nilai2;
                    result.setText("hasil :" + hasil);
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "nilai yang anda masukkan salah!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    //bikin variabel
                    int nilai1, nilai2, hasil;
                    //mengambil nilai dari edittext
                    nilai1 = Integer.parseInt(edt1.getText().toString());
                    nilai2 = Integer.parseInt(edt2.getText().toString());

                    hasil = nilai1 - nilai2;
                    result.setText("hasil :" + hasil);
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "nilai yang anda masukkan salah!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    //bikin variabel
                    int nilai1, nilai2, hasil;
                    //mengambil nilai dari edittext
                    nilai1 = Integer.parseInt(edt1.getText().toString());
                    nilai2 = Integer.parseInt(edt2.getText().toString());

                    hasil = nilai1 * nilai2;
                    result.setText("hasil :" + hasil);
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "nilai yang anda masukkan salah!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    //bikin variabel
                    int nilai1, nilai2, hasil;
                    //mengambil nilai dari edittext
                    nilai1 = Integer.parseInt(edt1.getText().toString());
                    nilai2 = Integer.parseInt(edt2.getText().toString());

                    hasil = nilai1 / nilai2;
                    result.setText("hasil :" + hasil);
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "nilai yang anda masukkan salah!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
