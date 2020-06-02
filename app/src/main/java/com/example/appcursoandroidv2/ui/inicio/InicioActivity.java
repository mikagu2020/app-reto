package com.example.appcursoandroidv2.ui.inicio;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.example.appcursoandroidv2.R;
import com.example.appcursoandroidv2.beans.Gasto;
import com.example.appcursoandroidv2.beans.Usuario;
import com.example.appcursoandroidv2.dao.GastoDAOImpl;
import com.example.appcursoandroidv2.dao.UsuarioDAOImpl;
import com.example.appcursoandroidv2.database.Conexion;
import com.example.appcursoandroidv2.utils.DateParser;

import java.util.List;

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);


    }

    @Override
    protected void onResume() {
        super.onResume();
        //listarGatos();
        //burcarUsuario("Mikel Oceja");

    }

    protected void listarGatos() {
        super.onResume();
        SQLiteDatabase db = Conexion.getInstance(this);
        GastoDAOImpl gastoDAO = new GastoDAOImpl(db);
        try {
            List<Gasto> listGastos = gastoDAO.findAll();
            System.out.println("====================");
            for ( Gasto gasto : listGastos ) {
                DateParser dp = new DateParser();
                String fecha = dp.toText(new java.util.Date(gasto.getFecha()));
                Double transporte =  gasto.getTransporte();
                System.out.println("Rec " + gasto.getId() + ":");
                System.out.println("fecha: " + fecha);
                System.out.println("transporte: " + gasto.getTransporte());
                System.out.println("kilometraje: " + gasto.getKilometraje());
                System.out.println("precio km: " + gasto.getPrecioKm());
                System.out.println("peaje: " + gasto.getPeaje());
                System.out.println("parking: " + gasto.getParking());
                System.out.println("comida: " + gasto.getRestaurante());
                System.out.println("otros conceptos: " + gasto.getOtros());
                System.out.println("proyecto: " + gasto.getPro());
                System.out.println("departamento: " + gasto.getDep());
                System.out.println("total: " + gasto.getTotal());
                System.out.println("====================");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void burcarUsuario(String nombre) {
        SQLiteDatabase db = Conexion.getInstance(this);
        UsuarioDAOImpl usuarioDAO = new UsuarioDAOImpl(db);
        try {
            Usuario usuario = usuarioDAO.findByName(nombre);
            System.out.println(usuario.getNombre());
            System.out.println(usuario.getPassword());
            System.out.println(usuario.getLastConn());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
