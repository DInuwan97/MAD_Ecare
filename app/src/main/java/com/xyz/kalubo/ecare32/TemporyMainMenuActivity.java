package com.xyz.kalubo.ecare32;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TemporyMainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempory_main_menu);
    }


    public void showDoctorPortal(View view){
        Intent intent = new Intent(this,NavigationDrawerActivity.class);
        startActivity(intent);
    }

    public void showPatinetPortal(View view){
        Intent intent = new Intent(this,PatientPortal.class);
        startActivity(intent);
    }

    public void showPharmacy(View view){
        Intent intent1 = new Intent(this,PharmacyHome.class);
        startActivity(intent1);
    }
    public void PharmacyAdmin(View view){
        Intent intent1 = new Intent(this,PharmacyAddingMedicineAdmin.class);
        startActivity(intent1);
    }

}
