package com.example.calcu;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    operaciones op = new operaciones();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView (R.layout.activity_main);
        op.grp_funciones = findViewById(R.id.grp_funciones);
        op.grp_grados = findViewById(R.id.grp_grados);
        op.imageview = findViewById(R.id.imageAngulo);
        op.result = findViewById(R.id.result);
    }

    public void calculadora(View v){
        op.operacion();
    }

    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("savedResult",op.savedResult);
        outState.putInt("savedImage",op.idImage);
        outState.putInt("savedGrd",op.idGrd);
        outState.putInt("savedFunc",op.idFunciones);
    }
    protected void onRestoreInstanceState(Bundle savedInstanceState) {

        op.savedResult=savedInstanceState.getString("savedResult");
        op.idImage=savedInstanceState.getInt("savedImage");
        op.idGrd=savedInstanceState.getInt("savedGrd");
        op.idFunciones=savedInstanceState.getInt("savedFunc");

        op.result.setText(op.savedResult);
        op.imageview.setImageResource(op.idImage);
        op.grp_grados.check(op.idGrd);
        op.grp_funciones.check(op.idFunciones);
    }
}


/*

    ELABORADO POR:

    - Tapia Vazquez Alan Eduardo @TaponTV
    - Sixtega Escribano Miguel Angel
    - Medina Zarate Alan Emmanuel

    Github:
        @TaponTV
        @Makarotk
        @Mignatech

    Copyright 2022
 */