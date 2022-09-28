package com.if3b.mahasiswabaru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNomorPendaftaran;
    EditText etNama;
    Button btnDaftar;
    String nomorPendaftaran, nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNomorPendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        etNama = findViewById(R.id.et_nama_mahasiswa);
        btnDaftar = findViewById(R.id.btn_daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nomorPendaftaran = etNomorPendaftaran.getText().toString();
                nama = etNama.getText().toString();

                if (nomorPendaftaran.trim().equals("")) {
                    etNomorPendaftaran.setError("Harus Diisi nomornya gan.");
                } else if(nama.trim().equals("")) {
                    etNama.setError("Harus diisi nama nya gan.");
                } else {
                    Toast.makeText(MainActivity.this, "Selamat, " + nama + "! anda bangun dari mimpi.", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}