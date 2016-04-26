package fr.ig2i.localwaves;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OfflineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline);
    }

    public void goToLoad(View v)
    {
        Intent myIntent = new Intent(this, MainActivity.class);
        myIntent.putExtra("buttonTag",v.getTag().toString());
        this.startActivity(myIntent);
    }

    public void deleteFavoris(View v)
    {

    }

    public void addFavoris(View v)
    {

    }

    public void launchEcoute(View v)
    {
        //kill l'application OU changer le parametre

        //lancer application Radio FM en parametre la station a écouter.
        //choix selon le téléphone de l'application radio automatique
    }
}
