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

    public void showTesterPortal(View view){
        Intent intent = new Intent(this,TesterPortalActivity.class);
        startActivity(intent);
    }

    public void showAdminPortal(View view){
        Intent intent = new Intent(this,AdminActivity.class);
        startActivity(intent);
    }
}
