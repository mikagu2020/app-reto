package com.example.appcursoandroidv2.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import com.example.appcursoandroidv2.beans.Dieta;

import java.util.ArrayList;
import java.util.List;

public class DietaDAOImpl implements DietaDAO {


    @Override
    public long add(Dieta dieta) throws Exception {
        return 0;
    }

    @Override
    public int remove(String id) throws Exception {
        return 0;
    }

    @Override
    public int modify(Dieta dieta) throws Exception {
        return 0;
    }

    @Override
    public Dieta findById(long id) throws Exception {
        return null;
    }

    @Override
    public List<Dieta> findAll() throws Exception {
        return null;
    }
}
