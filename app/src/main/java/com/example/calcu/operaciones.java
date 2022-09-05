package com.example.calcu;

import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.text.DecimalFormat;

public class operaciones{

    public RadioGroup grp_funciones,grp_grados;
    public ImageView imageview;
    public TextView result;
    public String savedResult;
    double ang;
    int idImage,idGrd,idFunciones;
    DecimalFormat f = new DecimalFormat("#.######");

    public void operacion(){

        int grd = Integer.parseInt((
                (RadioButton) grp_grados.getChildAt
                        (grp_grados.indexOfChild(
                                (View)grp_grados.findViewById(grp_grados.getCheckedRadioButtonId())))
        ).getText().toString());

        if (grp_grados.getCheckedRadioButtonId()==R.id.rdB45){
            imageview.setImageResource(R.drawable._45);
            idImage=R.drawable._45;
        }else if(grp_grados.getCheckedRadioButtonId()==R.id.rdB90){
            imageview.setImageResource(R.drawable._90);
            idImage=R.drawable._90;
        }else if(grp_grados.getCheckedRadioButtonId()==R.id.rdB180){
            imageview.setImageResource(R.drawable._180);
            idImage=R.drawable._180;
        }

        if (grp_funciones.getCheckedRadioButtonId()==R.id.rdBSIN)
            ang = Math.sin(grd);
        if (grp_funciones.getCheckedRadioButtonId()==R.id.rdBCOS)
            ang = Math.cos(grd);
        if (grp_funciones.getCheckedRadioButtonId()==R.id.rdBTAN)
            ang = Math.tan(grd);


        result.setText((f.format(ang))+" rad");
        savedResult = result.getText().toString();
        idGrd = grp_grados.getCheckedRadioButtonId();
        idFunciones = grp_funciones.getCheckedRadioButtonId();
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
