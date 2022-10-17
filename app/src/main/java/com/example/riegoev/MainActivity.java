package com.example.riegoev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        TabLayout tl = (TabLayout) findViewById(R.id.tablayout);
        tl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //al presionar
                int position = tab.getPosition();
                switch (position){
                    case 0 :
                        //llamar al fragmento regar
                        Toast.makeText(getApplicationContext(), "regar", Toast.LENGTH_SHORT).show();
                        Riego r = new Riego();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,r).commit();
                        break;
                    case 1 :
                        //llamar al fragmento stats
                        Toast.makeText(getApplicationContext(), "stats", Toast.LENGTH_SHORT).show();
                        Estadisticas e = new Estadisticas();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,e).commit();
                        break;
                    case 2 :
                        //llamar al fragmento programar
                        Toast.makeText(getApplicationContext(), "programar", Toast.LENGTH_SHORT).show();
                        Programar p = new Programar();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,p).commit();
                        break;
                    case 3   :
                        //llamar al fragmento Historial
                        Toast.makeText(getApplicationContext(), "historial", Toast.LENGTH_SHORT).show();
                        Historial h = new Historial();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,h).commit();
                        break;

                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }

}