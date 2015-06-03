package com.danielviveiros.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

/**
 * Activity that hosts the main layout for my app
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Handles the click on Spotify Streamer button
     */
    public void onMediaStreamerClick( View view ) {
        showToast( "This button will launch Spotify Streamer");
    }

    /**
     * Handles the click on Scores App button
     */
    public void onScoresAppClick( View view ) {
        showToast( "This button will launch Scores App");
    }

    /**
     * Handles the click on Library App button
     */
    public void onLibraryAppClick( View view ) {
        //changing
        showToast( "This button will launch Library App");
    }

    /**
     * Handles the click on Build It Bigger App button
     */
    public void onBuiltItBiggerClick( View view ) {
        showToast( "This button will launch Build It Bigger");
    }

    /**
     * Handles the click on XYZ Reader App button
     */
    public void onXYZReaderClick( View view ) {
        showToast( "This button will launch XYZReader");
    }

    /**
     * Handles the click on Capstone App button
     */
    public void onCapstoneClick( View view ) {
        showToast( "This button will launch Capstone");
    }

    /**
     * Show a toast
     */
    public void showToast( String message ) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }
}
