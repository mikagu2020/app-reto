package com.example.appcursoandroidv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.example.appcursoandroidv2.dao.GastoDAOImpl;
import com.example.appcursoandroidv2.beans.Gasto;
import com.example.appcursoandroidv2.database.Conexion;
import com.example.appcursoandroidv2.ui.inicio.InicioActivity;
import com.example.appcursoandroidv2.utils.DateParser;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getControlViews();

        setEventListeners();

    }

    protected void getControlViews() {

    }

    protected void setEventListeners() {


    }

    @Override
    protected void onResume() {
        super.onResume();
        //listarGatos();
        intent = new Intent(this, InicioActivity.class);
        startActivity(intent);
    }


}
