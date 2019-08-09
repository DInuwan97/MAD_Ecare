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

    Spinner spinner;

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
    }
}

        //creating alender instance

        /*Calendar calendar = Calendar.getInstance();
        int Day = calendar.get(Calendar.DAY_OF_MONTH);
        int Month = calendar.get(Calendar.MONTH);
        int Year = calendar.get(Calendar.YEAR);

        TextView textView = findViewById(R.id.displayDate);
        textView.setOnClickListener(new View.OnClickListener(){*/

           /* public void onClick(View view) {
                //Take DatePicker library instance..
                DatePickerDialog dialog = DatePickerDialog.newInstance(new DatePickerDialog.onDateSetListner(){

                    public void onDateSet(DatePickerDialog view,int year,int monthOfYear, int dayOfMonath){
                        String srtDate = dayOfMonath + "/" +(monthOfYear + 1)+ "/" +year;
                    }

                });
            }
        });*/




