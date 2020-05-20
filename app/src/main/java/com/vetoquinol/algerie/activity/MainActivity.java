package com.vetoquinol.algerie.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import com.vetoquinol.algerie.ProductFragment;
import com.vetoquinol.algerie.R;
import com.vetoquinol.algerie.fragments.ContactFragment;
import com.vetoquinol.algerie.fragments.HomeFragment;
import com.vetoquinol.algerie.fragments.PartnerFragment;
import com.vetoquinol.algerie.fragments.PresentationFragment;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.z_activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //initialising views :
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);

        //action bar changes :
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        //set default page to HomeFragment :
        getSupportFragmentManager().beginTransaction().replace(R.id.container,
                new HomeFragment(),"home").addToBackStack("home").commit();

        getSupportActionBar().setTitle("Accueil");

        //back button :





    }

    //dialog to exit the app Start :
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);


        } else {

            getSupportFragmentManager().popBackStack();
            /*
            //dialog to quit the app
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Voulez-vous fermer l'application?")
                    .setCancelable(false)
                    .setPositiveButton("Oui", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            MainActivity.this.finish();
                        }
                    })
                    .setNegativeButton("Non", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });

            final AlertDialog alert = builder.create();
            alert.show();
            alert.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(getResources().getColor(R.color.green));
            alert.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(getResources().getColor(R.color.green));
            //dialog to exit the app --END
            */
        }
    }

    //method to move to another Page according to menu item selected :
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if (id == R.id.nav_product) {


            getSupportFragmentManager().beginTransaction().replace(R.id.container,
                    new ProductFragment()).commit();
            getSupportActionBar().setTitle("Produit");

        }


        //move to another Page according to menu item selected :


        if (id == R.id.nav_presentation) {

            getSupportFragmentManager().beginTransaction().replace(R.id.container,
                    new PresentationFragment()).commit();
            getSupportActionBar().setTitle("Présentation");


        }

        if (id == R.id.nav_home) {

            getSupportFragmentManager().beginTransaction().replace(R.id.container,
                    new HomeFragment()).commit();

            getSupportActionBar().setTitle("Accueil");


        }

        else if (id == R.id.nav_presentation) {

            getSupportFragmentManager().beginTransaction().replace(R.id.container,
                    new PresentationFragment()).commit();
            getSupportActionBar().setTitle("Présentation");


        }


        else if (id == R.id.nav_partner) {

            getSupportFragmentManager().beginTransaction().replace(R.id.container,
                    new PartnerFragment()).commit();
            getSupportActionBar().setTitle("Partenaire");


        }

        else if (id == R.id.nav_contact) {

            getSupportFragmentManager().beginTransaction().replace(R.id.container,
                    new ContactFragment()).commit();
            getSupportActionBar().setTitle("Contact");


        }



        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle item selection
        switch (item.getItemId()) {
            case R.id.back:

                getSupportFragmentManager().popBackStack();

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}