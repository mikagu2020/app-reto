package com.example.appcursoandroidv2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

import com.example.appcursoandroidv2.ui.inicio.InicioActivity;

public class MainActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getControlViews();

        setEventListeners();

        //TODO redirecciona a InicioActity, borrar cuando esté implementado el login
        Intent intent = new Intent(this, InicioActivity.class);
        startActivity(intent);

    }

    protected void getControlViews() {

    }

    protected void setEventListeners() {

    }

}
