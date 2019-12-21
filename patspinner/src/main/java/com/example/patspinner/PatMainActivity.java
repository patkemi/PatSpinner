package com.example.patspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PatMainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinnerState;
    Spinner spinnerLocal;

    List<String> listState;
    List<String> listLocal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pat_main);

        // Get spinners from XML file
        spinnerState = findViewById(R.id.spinner1);
        spinnerLocal = findViewById(R.id.spinner2);

        // Initialize array of states and local govts
        listState = new ArrayList<>();
        listLocal = new ArrayList<>();

        spinnerState.setOnItemSelectedListener(this);
        spinnerLocal.setOnItemSelectedListener(this);


        // Add states to array lists
        listState.add("Abia State");
        listState.add("Adamawa State");
        listState.add("Akwa Ibom State");
        listState.add("Anambra State");
        listState.add("Bauchi State");
        listState.add("Bayelsa State");
        listState.add("Benue State");
        listState.add("Borno State");
        listState.add("Cross River State");
        listState.add("Delta State");
        listState.add("Ebonyi State");
        listState.add("Edo State");
        listState.add("Ekiti State");
        listState.add("Enugu State");
        listState.add("Gombe State");
        listState.add("Imo State");
        listState.add("Jigawa State");
        listState.add("Kaduna State");
        listState.add("Kano State");
        listState.add("Katsina State");
        listState.add("Kebbi State");
        listState.add("Kogi State");
        listState.add("Kwara State");
        listState.add("Lagos State");
        listState.add("Nasarawa State");
        listState.add("Niger State");
        listState.add("Ogun State");
        listState.add("Ondo State");
        listState.add("Osun State");
        listState.add("Oyo State");
        listState.add("Plateau State");
        listState.add("Rivers State");
        listState.add("Sokoto State");
        listState.add("Taraba State");
        listState.add("Yobe State");
        listState.add("Zamfara State");

        //Add local govt to array lists
       listLocal.add("Abak");
        listLocal.add("Eastern Obolo");
        listLocal.add("Eket");
        listLocal.add("Esit-Eket");
        listLocal.add("Essien ");
        listLocal.add("Etim-Ekpo");
        listLocal.add("Etinan");
        listLocal.add("Ibeno");
        listLocal.add("Ibesikpo-Asutan");
        listLocal.add("Ibiono-Ibom");
        listLocal.add("Ika");
        listLocal.add("Ikono");
        listLocal.add("Ikot Abasi");
        listLocal.add("Ikot Ekpene");
        listLocal.add("Ini");
        listLocal.add("Itu");
        listLocal.add("Mbo");
        listLocal.add("Mkpat-Enin");
        listLocal.add("Nsit-Atai");
        listLocal.add("Nsit-Ibom");
        listLocal.add("Nsit-Ubium");
        listLocal.add("Obot-Akara");
        listLocal.add("Okobo");
        listLocal.add("Onna");
        listLocal.add("Oron");
        listLocal.add("Oruk Anam");
        listLocal.add("Ukanafun");
        listLocal.add("Udung-Uko");
        listLocal.add("Uruan");
        listLocal.add("Urue-Offong/Oruko");
        listLocal.add("Uyo");

        // Create array adapter for states
        ArrayAdapter<String> statesAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, listState);
        statesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerState.setAdapter(statesAdapter);

        // Create array adapter for local govts
        ArrayAdapter<String> localAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, listLocal);
        localAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerLocal.setAdapter(localAdapter);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

       String item = parent.getItemAtPosition(position).toString();
        Toast.makeText(this, "selected item:" + item, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
