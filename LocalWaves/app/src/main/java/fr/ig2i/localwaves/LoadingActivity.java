package fr.ig2i.localwaves;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        if(this.getIntent().getStringExtra("buttonTag") != null)
        {
            afficherActivity(this.getIntent().getStringExtra("buttonTag"));
        }

    }

    public void afficherActivity(String buttonTag)
    //param: String: le nom de l'activité
    {
            switch (buttonTag)
                {
                    case "main":
                        goToMain();
                        break;

                    case "online":
                        goToOnline();
                        break;

                    case "offline":
                        goToOffline();
                        break;

                    case "preferences":
                        goToPreferences();
                        break;

                    default:
                    //Affiche un message d'erreur comme quoi il connait pas.
                    //Toast t = new Toast();
                }
    }

    public void buttonListener(View v)
    {
        goToMain();
    }

    public void goToMain()
    {
        Intent myIntent = new Intent(this, MainActivity.class);
        this.startActivity(myIntent);
    }

    public void goToOnline()
    {
        Intent myIntent = new Intent(this, OnlineActivity.class);
        this.startActivity(myIntent);
    }

    public void goToOffline()
    {
        Intent myIntent = new Intent(this, OfflineActivity.class);
        this.startActivity(myIntent);
    }
    public void goToPreferences()
    {
        Intent myIntent = new Intent(this, PreferencesActivity.class);
        this.startActivity(myIntent);
    }



}
