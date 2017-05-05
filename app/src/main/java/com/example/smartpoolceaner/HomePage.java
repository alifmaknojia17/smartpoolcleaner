package com.example.smartpoolceaner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by alifmaknojia on 10/27/16.
 */

public class HomePage extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home_page) {
            Intent intent = new Intent(this, HomePage.class);
            startActivity(intent);
        } else if (id == R.id.battery_life) {
            Intent intent = new Intent(this, BatteryLife.class);
            startActivity(intent);
        } else if (id == R.id.temperature) {
            Intent intent = new Intent(this, Temperature.class);
            startActivity(intent);
        } else if (id == R.id.pH_level) {
            Intent intent = new Intent(this, pHLevel.class);
            startActivity(intent);
        } else if (id == R.id.average_time) {
            Intent intent = new Intent(this, AverageTime.class);
            startActivity(intent);
        } else if (id == R.id.debris_detection) {
            Intent intent = new Intent(this, DebrisDetection.class);
            startActivity(intent);
        } else if (id == R.id.cleaning_frequency) {
            Intent intent = new Intent(this, CleaningFrequency.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
