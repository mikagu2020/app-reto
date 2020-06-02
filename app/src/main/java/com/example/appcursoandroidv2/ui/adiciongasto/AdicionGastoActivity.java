package com.example.appcursoandroidv2.ui.adiciongasto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.appcursoandroidv2.R;
import com.example.appcursoandroidv2.dao.PrecioDAOImpl;
import com.example.appcursoandroidv2.database.Conexion;
import com.example.appcursoandroidv2.ui.fragments.FormularioGastoFragment;
import com.example.appcursoandroidv2.ui.inicio.InicioActivity;

public class AdicionGastoActivity extends AppCompatActivity {

    Button btnEnviar;
    EditText etPrecioKm;
    FormularioGastoFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicion_gasto);

        getControlViews();

        setEventListeners();

        getPrecioKm();

        fragment = (FormularioGastoFragment) getSupportFragmentManager().findFragmentById(R.id.formulario_gasto_fragment);

    }

    private void getControlViews() {
       btnEnviar = findViewById(R.id.bt_create_gasto);
       etPrecioKm = findViewById(R.id.et_km_price);
    }

    private void setEventListeners() {
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment.registrar();
            }
        });
    }

    private void getPrecioKm() {
        //Conexion conn = new Conexion(this);
        SQLiteDatabase db = Conexion.getInstance(this);
        PrecioDAOImpl precioDAO = new PrecioDAOImpl(db);
        try {
            String precioKM = precioDAO.getPrecioKm();
            etPrecioKm.setText(precioKM);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, InicioActivity.class);
        startActivity(intent);
    }
}
