package com.example.mini_.android_oefening2_2048;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar ab= getActionBar();
        ab.setDisplayShowTitleEnabled(false);
        ab.setDisplayUseLogoEnabled(false);
        ab.setSubtitle("subtitel");
        ab.setTitle("Titel");
        ab.show();

        setContentView(R.layout.activity_main);

    }

    public void btncontinueClicked(View v)
    {

    }
    public void btnNewGameClicked(View v)
    {
        this.getClass().getSimpleName();
    }
    public void  btnAboutClicked(View v)
    {
        AlertDialog.Builder aboutBuilder = new AlertDialog.Builder(this);
        aboutBuilder.setMessage(getString(R.string.aboutPage));
        aboutBuilder.setCancelable(true);

        AlertDialog about = aboutBuilder.create();
        about.show();
    }

    public void btnExitClicked(View v)
    {
        this.finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
