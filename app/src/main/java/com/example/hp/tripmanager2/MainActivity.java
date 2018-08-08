package com.example.hp.tripmanager2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.AutoCompleteTextView; // Importer l'élément AutoCompleteTextView pour utilisation Java.
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Déclaration des éléments de la palette dans des variables.

    AutoCompleteTextView Nom,Prenoms, Adresse, Date, Telephone, Mail, NumVol, Vildepar, Vilarriv,ObjeVoyage, Hebergement, NomHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Récupérer la valeur de l'AutoCompleteTextView suivie d'une sauvegarde.

        Nom =(AutoCompleteTextView)findViewById(R.id.actnom);
        Prenoms =(AutoCompleteTextView)findViewById(R.id.actprenom);
        Adresse =(AutoCompleteTextView)findViewById(R.id.actadresse);
        Date =(AutoCompleteTextView)findViewById(R.id.actdate);
        Telephone =(AutoCompleteTextView)findViewById(R.id.acttelephone);
        Mail =(AutoCompleteTextView)findViewById(R.id.actemail);
        NumVol =(AutoCompleteTextView)findViewById(R.id.actnumerovol);
        Vildepar =(AutoCompleteTextView)findViewById(R.id.actdepartvile);
        Vilarriv =(AutoCompleteTextView)findViewById(R.id.actarriveevile);
        ObjeVoyage =(AutoCompleteTextView)findViewById(R.id.actobjetVoyage);
        Hebergement =(AutoCompleteTextView)findViewById(R.id.acthebergement);
        NomHotel =(AutoCompleteTextView)findViewById(R.id.actnomhotel);
    }

    public void ajouter (View view){

        //Récupération et conversion de la saisie en chaine de caractère suivie d'une sauvegarde dans une variable t.

        String t1 = Nom.getText().toString();
        String t2 = Prenoms.getText().toString();
        String t3= Adresse.getText().toString();
        String t4= Date.getText().toString();
        String t5= Telephone.getText().toString();
        String t6= Mail.getText().toString();
        String t7= NumVol.getText().toString();
        String t8= Vildepar.getText().toString();
        String t9= Vilarriv.getText().toString();
        String t10= ObjeVoyage.getText().toString();
        String t11= Hebergement.getText().toString();
        String t12= NomHotel.getText().toString();

        //Tester les variables t pour verifier si l'utilisateur a bien rempli tous les champs de saisie.

        if (t1.isEmpty()|| t2.isEmpty()|| t3.isEmpty()|| t4.isEmpty()|| t5.isEmpty()|| t6.isEmpty()|| t7.isEmpty()|| t8.isEmpty()|| t9.isEmpty()|| t10.isEmpty()|| t11.isEmpty()|| t12.isEmpty())
        {
            Message.message(getApplicationContext(),"Veuillez remplir tous les champs SVP!");
        }
        else {
            long id = helper.insertData(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12);

            if (id<0){//Au cas où l'identifiant est négatif.
                Message.message(getApplicationContext(),"L'enregistrement a échoué");

                // Vider tous les champs.

                Nom.setText("");
                Prenoms.setText("");
                Adresse.setText("");
                Date.setText("");
                Telephone.setText("");
                Mail.setText("");
                NumVol.setText("");
                Vildepar.setText("");
                Vilarriv.setText("");
                ObjeVoyage.setText("");
                Hebergement.setText("");
                NomHotel.setText("");
            }
            else{

                // Vider tous les champs.

                Message.message(getApplicationContext(),"L'élément a été enregistré avec succès");
                Nom.setText("");
                Prenoms.setText("");
                Adresse.setText("");
                Date.setText("");
                Telephone.setText("");
                Mail.setText("");
                NumVol.setText("");
                Vildepar.setText("");
                Vilarriv.setText("");
                ObjeVoyage.setText("");
                Hebergement.setText("");
                NomHotel.setText("");
            }
            //Si les champs sont correctement remplis
        }
    }
    public void Bouton1(View view){
        Button btn1 = (Button) findViewById(R.id.btn1);
        TranslateAnimation Translate = new TranslateAnimation(0, 100, 0, 0);
        Translate.setDuration(200);
        btn1.startAnimation(Translate);

        Intent identite = new Intent (MainActivity.this, second.class);
        startActivity(identite);
    }
    
    public void Bouton2(View view){
        Button btn2 = (Button) findViewById(R.id.btn2);
        TranslateAnimation Translate = new TranslateAnimation(0, 100, 0, 0);
        Translate.setDuration(200);
        btn2.startAnimation(Translate);

        Intent check = new Intent (MainActivity.this, third.class);
        startActivity(check);
    }
}
