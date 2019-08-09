package com.xyz.kalubo.ecare32;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PharmacyAddingMedicineAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacy_adding_medicine_admin);
    }
    public void addNewMedicine(View view){
        Intent intent= new Intent(this, PharmacyAddingMedicine.class);
        startActivity(intent);
    }
}
