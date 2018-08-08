package com.example.hp.tripmanager2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class myDbAdapter {

    myDbHelper myhelper;
    public myDbAdapter(Context context)
    {
        myhelper = new myDbHelper(context);
    }
    public long ajoutDonnee(String Nom,String Prenoms, String Adresse,String Date,String Telephone,String Mail,String NumVol,String Vildepar,String Vilarriv,String ObjeVoyage,String Hebergement,String NomHotel){

        SQLiteDatabase dbb = myhelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(myDbHelper.NOM, nom);
        contentValues.put(myDbHelper.PRENOMS, prenoms);
        contentValues.put(myDbHelper.ADRESSE, adresse);
        contentValues.put(myDbHelper.DATE, date);
        contentValues.put(myDbHelper.TELEPHONE, telephone);
        contentValues.put(myDbHelper.MAIL, mail);
        contentValues.put(myDbHelper.NUMVOL, numvol);
        contentValues.put(myDbHelper.VILDEPAR, vildepar);
        contentValues.put(myDbHelper.VILARRIV, vilarriv);
        contentValues.put(myDbHelper.OBJEVOYAGE, objevoyage);
        contentValues.put(myDbHelper.HEBERGEMENT, hebergement);
        contentValues.put(myDbHelper.NOMHOTEL, nomhotel);

        long id = dbb.insert(myDbHelper.TABLE_NAME, null , contentValues);
        return id;
    }

    public void obtenirDonnee(){
        SQLiteDatabase db = myhelper.getWritableDatabase();
    }
}
