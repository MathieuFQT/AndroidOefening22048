package com.example.mini_.android_oefening2_2048;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.about)
    Button btnAbout;
    @Bind(R.id.newGame)
    Button btnNew;
    @Bind(R.id.exit)
    Button btnExit;
    @Bind(R.id.cont)
    Button btnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.actions_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_restart:
                Log.i("Restart", "Restarting");
                gameStartNew();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void gameStartNew()
    {
        startActivity(new Intent(this, GameActivity.class));
    }
    @OnClick(R.id.cont)
    public void btncontinueClicked()
    {

    }
    @OnClick(R.id.newGame)
    public void btnNewGameClicked()
    {
        gameStartNew();
    }

    @OnClick(R.id.about)
    public void  btnAboutClicked()
    {
        AlertDialog.Builder aboutBuilder = new AlertDialog.Builder(this);
        aboutBuilder.setMessage(getString(R.string.aboutPage));
        aboutBuilder.setCancelable(true);

        AlertDialog about = aboutBuilder.create();
        about.show();
    }

    @OnClick(R.id.exit)
    public void btnExitClicked()
    {
        this.finish();
    }
}
