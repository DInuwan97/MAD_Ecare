package com.xyz.kalubo.ecare32;

import android.app.DatePickerDialog;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class ChnnelDoctorActivity extends AppCompatActivity {

    Spinner spinner,spinner2,spinner3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chnnel_doctor);

        spinner = (Spinner) findViewById(R.id.spinner1);

        ArrayList<String> list = new ArrayList<>();
        list.add("Select Your Doctor...");
        list.add("Dr.Anura Banagala");
        list.add("Dr.Jayantha Thisera");
        list.add("Dr(Mrs).Aruni Rajapakshe");
        list.add("Dr.Priyantha Jayalath");
        list.add("Dr(Mrs)Samanthi Perera");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, list);

        spinner.setAdapter(adapter);



        spinner2 = (Spinner) findViewById(R.id.spinner2);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Select Date..");
        list1.add("10/02/2019 - Thursday");
        list1.add("13/02/2019 - Friday");
        list1.add("14/02/2019 - Sunday");
        list1.add("17/02/2019 - Tuesday");

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, list1);

        spinner.setAdapter(adapter2);


        spinner3 = (Spinner) findViewById(R.id.spinner3);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Select Time..");
        list3.add("5.00 PM - 7.30 PM");
        list3.add("5.00 PM - 7.30 PM");
        list3.add("14/02/2019 - Sunday");
        list3.add("17/02/2019 - Tuesday");

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, list3);

        spinner.setAdapter(adapter3);




    }
}