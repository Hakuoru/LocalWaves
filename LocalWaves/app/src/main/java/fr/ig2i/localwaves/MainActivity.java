package fr.ig2i.localwaves;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void goToLoad(View v)
    {
        Intent myIntent = new Intent(this, LoadingActivity.class);
        myIntent.putExtra("buttonTag",v.getTag().toString());
        this.startActivity(myIntent);
    }

}
