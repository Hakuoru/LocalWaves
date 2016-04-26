package fr.ig2i.localwaves;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PreferencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);
    }

    public void goToLoad(View v)
    {
        Intent myIntent = new Intent(this, MainActivity.class);
        myIntent.putExtra("buttonTag", v.getTag().toString());
        this.startActivity(myIntent);
    }

    public void deleteFavoris()
    {

    }

    public void changerOrdreFavoris()
    {

    }
}
