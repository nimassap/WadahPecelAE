package wadah.pecel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ApsActivity extends AppCompatActivity implements ValueEventListener {

    //untuk connect ke firebase
    //tidak perlu diubah
    //apabila ingin mengubah data bisa langsung ke firebase

    TextView APS1, APS2, APS3,
            APS1_tahun1, APS1_tahun2, APS1_tahun3, APS1_tahun4, APS1_tahun5, APS1_tahun6,APS1_tahun7,APS1_tahun8,
            APS2_tahun1, APS2_tahun2, APS2_tahun3, APS2_tahun4, APS2_tahun5, APS2_tahun6, APS2_tahun7,APS2_tahun8,
            APS3_tahun1, APS3_tahun2, APS3_tahun3, APS3_tahun4,APS3_tahun5,APS3_tahun6,APS3_tahun7,APS3_tahun8,
            APS1_laki1, APS1_laki2, APS1_laki3, APS1_laki4, APS1_laki5, APS1_laki6,APS1_laki7,APS1_laki8,
            APS2_laki1, APS2_laki2, APS2_laki3, APS2_laki4, APS2_laki5, APS2_laki6,APS2_laki7,APS2_laki8,
            APS3_laki1, APS3_laki2, APS3_laki3, APS3_laki4,APS3_laki5,APS3_laki6,APS3_laki7,APS3_laki8,
            APS1_prmpn1, APS1_prmpn2, APS1_prmpn3, APS1_prmpn4, APS1_prmpn5, APS1_prmpn6,APS1_prmpn7,APS1_prmpn8,
            APS2_prmpn1, APS2_prmpn2, APS2_prmpn3, APS2_prmpn4, APS2_prmpn5, APS2_prmpn6,APS2_prmpn7,APS2_prmpn8,
            APS3_prmpn1, APS3_prmpn2, APS3_prmpn3, APS3_prmpn4,APS3_prmpn5,APS3_prmpn6,APS3_prmpn7,APS3_prmpn8,
            APS1_lakpem1, APS1_lakpem2, APS1_lakpem3, APS1_lakpem4, APS1_lakpem5, APS1_lakpem6,APS1_lakpem7,APS1_lakpem8,
            APS2_lakpem1, APS2_lakpem2, APS2_lakpem3, APS2_lakpem4, APS2_lakpem5, APS2_lakpem6,APS2_lakpem7,APS2_lakpem8,
            APS3_lakpem1, APS3_lakpem2, APS3_lakpem3, APS3_lakpem4,APS3_lakpem5,APS3_lakpem6,APS3_lakpem7,APS3_lakpem8;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference APSData1 = databaseReference.child("APS 7-12");
    private DatabaseReference APSData2 = databaseReference.child("APS7-12_tahun_2019");
    private DatabaseReference APSData3 = databaseReference.child("APS7-12_laki_2019");
    private DatabaseReference APSData4 = databaseReference.child("APS7-12_perempuan_2019");
    private DatabaseReference APSData5 = databaseReference.child("APS7-12_laki_perempuan_2019");

    private DatabaseReference APSData6 = databaseReference.child("APS7-12_tahun_2018");
    private DatabaseReference APSData7 = databaseReference.child("APS7-12_laki_2018");
    private DatabaseReference APSData8 = databaseReference.child("APS7-12_perempuan_2018");
    private DatabaseReference APSData9 = databaseReference.child("APS7-12_laki_perempuan_2018");

    private DatabaseReference APSData10 = databaseReference.child("APS 13-15");
    private DatabaseReference APSData11 = databaseReference.child("APS13-15_tahun_2019");
    private DatabaseReference APSData12 = databaseReference.child("APS13-15_laki_2019");
    private DatabaseReference APSData13 = databaseReference.child("APS13-15_perempuan_2019");
    private DatabaseReference APSData14 = databaseReference.child("APS13-15_laki_perempuan_2019");

    private DatabaseReference APSData15 = databaseReference.child("APS13-15_tahun_2018");
    private DatabaseReference APSData16 = databaseReference.child("APS13-15_laki_2018");
    private DatabaseReference APSData17 = databaseReference.child("APS13-15_perempuan_2018");
    private DatabaseReference APSData18 = databaseReference.child("APS13-15_laki_perempuan_2018");

    private DatabaseReference APSData19 = databaseReference.child("APS 16-18");
    private DatabaseReference APSData20 = databaseReference.child("APS16-18_tahun_2019");
    private DatabaseReference APSData21 = databaseReference.child("APS16-18_laki_2019");
    private DatabaseReference APSData22 = databaseReference.child("APS16-18_perempuan_2019");
    private DatabaseReference APSData23 = databaseReference.child("APS16-18_laki_perempuan_2019");

    private DatabaseReference APSData24 = databaseReference.child("APS16-18_tahun_2018");
    private DatabaseReference APSData25 = databaseReference.child("APS16-18_laki_2018");
    private DatabaseReference APSData26 = databaseReference.child("APS16-18_perempuan_2018");
    private DatabaseReference APSData27 = databaseReference.child("APS16-18_laki_perempuan_2018");

    
    private DatabaseReference APSData28 = databaseReference.child("APS7-12_tahun_2020");
    private DatabaseReference APSData29 = databaseReference.child("APS7-12_laki_2020");
    private DatabaseReference APSData30 = databaseReference.child("APS7-12_perempuan_2020");
    private DatabaseReference APSData31 = databaseReference.child("APS7-12_laki_perempuan_2020");

    private DatabaseReference APSData32 = databaseReference.child("APS7-12_tahun_2021");
    private DatabaseReference APSData33 = databaseReference.child("APS7-12_laki_2021");
    private DatabaseReference APSData34 = databaseReference.child("APS7-12_perempuan_2021");
    private DatabaseReference APSData35 = databaseReference.child("APS7-12_laki_perempuan_2021");

    private DatabaseReference APSData36 = databaseReference.child("APS7-12_tahun_2022");
    private DatabaseReference APSData37 = databaseReference.child("APS7-12_laki_2022");
    private DatabaseReference APSData38 = databaseReference.child("APS7-12_perempuan_2022");
    private DatabaseReference APSData39 = databaseReference.child("APS7-12_laki_perempuan_2022");

    private DatabaseReference APSData40 = databaseReference.child("APS7-12_tahun_2023");
    private DatabaseReference APSData41 = databaseReference.child("APS7-12_laki_2023");
    private DatabaseReference APSData42 = databaseReference.child("APS7-12_perempuan_2023");
    private DatabaseReference APSData43 = databaseReference.child("APS7-12_laki_perempuan_2023");

    private DatabaseReference APSData44 = databaseReference.child("APS7-12_tahun_2024");
    private DatabaseReference APSData45 = databaseReference.child("APS7-12_laki_2024");
    private DatabaseReference APSData46 = databaseReference.child("APS7-12_perempuan_2024");
    private DatabaseReference APSData47 = databaseReference.child("APS7-12_laki_perempuan_2024");

    private DatabaseReference APSData48 = databaseReference.child("APS7-12_tahun_2025");
    private DatabaseReference APSData49 = databaseReference.child("APS7-12_laki_2025");
    private DatabaseReference APSData50 = databaseReference.child("APS7-12_perempuan_2025");
    private DatabaseReference APSData51 = databaseReference.child("APS7-12_laki_perempuan_2025");


    private DatabaseReference APSData52 = databaseReference.child("APS13-15_tahun_2020");
    private DatabaseReference APSData53 = databaseReference.child("APS13-15_laki_2020");
    private DatabaseReference APSData54 = databaseReference.child("APS13-15_perempuan_2020");
    private DatabaseReference APSData55 = databaseReference.child("APS13-15_laki_perempuan_2020");

    private DatabaseReference APSData56 = databaseReference.child("APS13-15_tahun_2021");
    private DatabaseReference APSData57 = databaseReference.child("APS13-15_laki_2021");
    private DatabaseReference APSData58 = databaseReference.child("APS13-15_perempuan_2021");
    private DatabaseReference APSData59 = databaseReference.child("APS13-15_laki_perempuan_2021");

    private DatabaseReference APSData60 = databaseReference.child("APS13-15_tahun_2022");
    private DatabaseReference APSData61 = databaseReference.child("APS13-15_laki_2022");
    private DatabaseReference APSData62 = databaseReference.child("APS13-15_perempuan_2022");
    private DatabaseReference APSData63 = databaseReference.child("APS13-15_laki_perempuan_2022");

    private DatabaseReference APSData64 = databaseReference.child("APS13-15_tahun_2023");
    private DatabaseReference APSData65 = databaseReference.child("APS13-15_laki_2023");
    private DatabaseReference APSData66 = databaseReference.child("APS13-15_perempuan_2023");
    private DatabaseReference APSData67 = databaseReference.child("APS13-15_laki_perempuan_2023");

    private DatabaseReference APSData68 = databaseReference.child("APS13-15_tahun_2024");
    private DatabaseReference APSData69 = databaseReference.child("APS13-15_laki_2024");
    private DatabaseReference APSData70 = databaseReference.child("APS13-15_perempuan_2024");
    private DatabaseReference APSData71 = databaseReference.child("APS13-15_laki_perempuan_2024");

    private DatabaseReference APSData72 = databaseReference.child("APS13-15_tahun_2025");
    private DatabaseReference APSData73 = databaseReference.child("APS13-15_laki_2025");
    private DatabaseReference APSData74 = databaseReference.child("APS13-15_perempuan_2025");
    private DatabaseReference APSData75 = databaseReference.child("APS13-15_laki_perempuan_2025");


    private DatabaseReference APSData76 = databaseReference.child("APS16-18_tahun_2020");
    private DatabaseReference APSData77 = databaseReference.child("APS16-18_laki_2020");
    private DatabaseReference APSData78 = databaseReference.child("APS16-18_perempuan_2020");
    private DatabaseReference APSData79 = databaseReference.child("APS16-18_laki_perempuan_2020");

    private DatabaseReference APSData80 = databaseReference.child("APS16-18_tahun_2021");
    private DatabaseReference APSData81 = databaseReference.child("APS16-18_laki_2021");
    private DatabaseReference APSData82 = databaseReference.child("APS16-18_perempuan_2021");
    private DatabaseReference APSData83 = databaseReference.child("APS16-18_laki_perempuan_2021");

    private DatabaseReference APSData84 = databaseReference.child("APS16-18_tahun_2022");
    private DatabaseReference APSData85 = databaseReference.child("APS16-18_laki_2022");
    private DatabaseReference APSData86 = databaseReference.child("APS16-18_perempuan_2022");
    private DatabaseReference APSData87 = databaseReference.child("APS16-18_laki_perempuan_2022");

    private DatabaseReference APSData88 = databaseReference.child("APS16-18_tahun_2023");
    private DatabaseReference APSData89 = databaseReference.child("APS16-18_laki_2023");
    private DatabaseReference APSData90 = databaseReference.child("APS16-18_perempuan_2023");
    private DatabaseReference APSData91 = databaseReference.child("APS16-18_laki_perempuan_2023");

    private DatabaseReference APSData92 = databaseReference.child("APS16-18_tahun_2024");
    private DatabaseReference APSData93 = databaseReference.child("APS16-18_laki_2024");
    private DatabaseReference APSData94 = databaseReference.child("APS16-18_perempuan_2024");
    private DatabaseReference APSData95 = databaseReference.child("APS16-18_laki_perempuan_2024");

    private DatabaseReference APSData96 = databaseReference.child("APS16-18_tahun_2025");
    private DatabaseReference APSData97 = databaseReference.child("APS16-18_laki_2025");
    private DatabaseReference APSData98 = databaseReference.child("APS16-18_perempuan_2025");
    private DatabaseReference APSData99 = databaseReference.child("APS16-18_laki_perempuan_2025");


    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aps);

        APS1 = (TextView)findViewById(R.id.APS1);
        APS1_tahun1 = (TextView)findViewById(R.id.APS1_tahun1);
        APS1_laki1 = (TextView)findViewById(R.id.APS1_laki1);
        APS1_prmpn1 = (TextView)findViewById(R.id.APS1_perempuan1);
        APS1_lakpem1 = (TextView)findViewById(R.id.APS1_lakpem1);

        APS1_tahun2 = (TextView)findViewById(R.id.APS1_tahun2);
        APS1_laki2 = (TextView)findViewById(R.id.APS1_laki2);
        APS1_prmpn2 = (TextView)findViewById(R.id.APS1_perempuan2);
        APS1_lakpem2 = (TextView)findViewById(R.id.APS1_lakpem2);

        APS1_tahun3 = (TextView)findViewById(R.id.APS1_tahunNew1);
        APS1_laki3 = (TextView)findViewById(R.id.APS1_lakiNew1);
        APS1_prmpn3 = (TextView)findViewById(R.id.APS1_perempuanNew1);
        APS1_lakpem3 = (TextView)findViewById(R.id.APS1_lakpemNew1);

        APS1_tahun4 = (TextView)findViewById(R.id.APS1_tahunNew2);
        APS1_laki4 = (TextView)findViewById(R.id.APS1_lakiNew2);
        APS1_prmpn4 = (TextView)findViewById(R.id.APS1_perempuanNew2);
        APS1_lakpem4 = (TextView)findViewById(R.id.APS1_lakpemNew2);

        APS1_tahun5 = (TextView)findViewById(R.id.APS1_tahunNew3);
        APS1_laki5 = (TextView)findViewById(R.id.APS1_lakiNew3);
        APS1_prmpn5 = (TextView)findViewById(R.id.APS1_perempuanNew3);
        APS1_lakpem5 = (TextView)findViewById(R.id.APS1_lakpemNew3);

        APS1_tahun6 = (TextView)findViewById(R.id.APS1_tahunNew4);
        APS1_laki6 = (TextView)findViewById(R.id.APS1_lakiNew4);
        APS1_prmpn6 = (TextView)findViewById(R.id.APS1_perempuanNew4);
        APS1_lakpem6 = (TextView)findViewById(R.id.APS1_lakpemNew4);

        APS1_tahun7 = (TextView)findViewById(R.id.APS1_tahunNew5);
        APS1_laki7 = (TextView)findViewById(R.id.APS1_lakiNew5);
        APS1_prmpn7 = (TextView)findViewById(R.id.APS1_perempuanNew5);
        APS1_lakpem7 = (TextView)findViewById(R.id.APS1_lakpemNew5);

        APS1_tahun8 = (TextView)findViewById(R.id.APS1_tahunNew6);
        APS1_laki8 = (TextView)findViewById(R.id.APS1_lakiNew6);
        APS1_prmpn8 = (TextView)findViewById(R.id.APS1_perempuanNew6);
        APS1_lakpem8 = (TextView)findViewById(R.id.APS1_lakpemNew6);


        APS2 = (TextView)findViewById(R.id.APS2);
        APS2_tahun1 = (TextView)findViewById(R.id.APS2_tahun1);
        APS2_laki1 = (TextView)findViewById(R.id.APS2_laki1);
        APS2_prmpn1 = (TextView)findViewById(R.id.APS2_perempuan1);
        APS2_lakpem1 = (TextView)findViewById(R.id.APS2_lakpem1);

        APS2_tahun2 = (TextView)findViewById(R.id.APS2_tahun2);
        APS2_laki2 = (TextView)findViewById(R.id.APS2_laki2);
        APS2_prmpn2 = (TextView)findViewById(R.id.APS2_perempuan2);
        APS2_lakpem2 = (TextView)findViewById(R.id.APS2_lakpem2);

        APS2_tahun3 = (TextView)findViewById(R.id.APS2_tahunNew1);
        APS2_laki3 = (TextView)findViewById(R.id.APS2_lakiNew1);
        APS2_prmpn3 = (TextView)findViewById(R.id.APS2_perempuanNew1);
        APS2_lakpem3 = (TextView)findViewById(R.id.APS2_lakpemNew1);

        APS2_tahun4 = (TextView)findViewById(R.id.APS2_tahunNew2);
        APS2_laki4 = (TextView)findViewById(R.id.APS2_lakiNew2);
        APS2_prmpn4 = (TextView)findViewById(R.id.APS2_perempuanNew2);
        APS2_lakpem4 = (TextView)findViewById(R.id.APS2_lakpemNew2);

        APS2_tahun5 = (TextView)findViewById(R.id.APS2_tahunNew3);
        APS2_laki5 = (TextView)findViewById(R.id.APS2_lakiNew3);
        APS2_prmpn5 = (TextView)findViewById(R.id.APS2_perempuanNew3);
        APS2_lakpem5 = (TextView)findViewById(R.id.APS2_lakpemNew3);

        APS2_tahun6 = (TextView)findViewById(R.id.APS2_tahunNew4);
        APS2_laki6 = (TextView)findViewById(R.id.APS2_lakiNew4);
        APS2_prmpn6 = (TextView)findViewById(R.id.APS2_perempuanNew4);
        APS2_lakpem6 = (TextView)findViewById(R.id.APS2_lakpemNew4);

        APS2_tahun7 = (TextView)findViewById(R.id.APS2_tahunNew5);
        APS2_laki7 = (TextView)findViewById(R.id.APS2_lakiNew5);
        APS2_prmpn7 = (TextView)findViewById(R.id.APS2_perempuanNew5);
        APS2_lakpem7 = (TextView)findViewById(R.id.APS2_lakpemNew5);

        APS2_tahun8 = (TextView)findViewById(R.id.APS2_tahunNew6);
        APS2_laki8 = (TextView)findViewById(R.id.APS2_lakiNew6);
        APS2_prmpn8 = (TextView)findViewById(R.id.APS2_perempuanNew6);
        APS2_lakpem8 = (TextView)findViewById(R.id.APS2_lakpemNew6);


        APS3 = (TextView)findViewById(R.id.APS3);
        APS3_tahun1 = (TextView)findViewById(R.id.APS3_tahun1);
        APS3_laki1 = (TextView)findViewById(R.id.APS3_laki1);
        APS3_prmpn1 = (TextView)findViewById(R.id.APS3_perempuan1);
        APS3_lakpem1 = (TextView)findViewById(R.id.APS3_lakpem1);

        APS3_tahun2 = (TextView)findViewById(R.id.APS3_tahun2);
        APS3_laki2 = (TextView)findViewById(R.id.APS3_laki2);
        APS3_prmpn2 = (TextView)findViewById(R.id.APS3_perempuan2);
        APS3_lakpem2 = (TextView)findViewById(R.id.APS3_lakpem2);

        APS3_tahun3 = (TextView)findViewById(R.id.APS3_tahunNew1);
        APS3_laki3 = (TextView)findViewById(R.id.APS3_lakiNew1);
        APS3_prmpn3 = (TextView)findViewById(R.id.APS3_perempuanNew1);
        APS3_lakpem3 = (TextView)findViewById(R.id.APS3_lakpemNew1);

        APS3_tahun4 = (TextView)findViewById(R.id.APS3_tahunNew2);
        APS3_laki4 = (TextView)findViewById(R.id.APS3_lakiNew2);
        APS3_prmpn4 = (TextView)findViewById(R.id.APS3_perempuanNew2);
        APS3_lakpem4 = (TextView)findViewById(R.id.APS3_lakpemNew2);

        APS3_tahun5 = (TextView)findViewById(R.id.APS3_tahunNew3);
        APS3_laki5 = (TextView)findViewById(R.id.APS3_lakiNew3);
        APS3_prmpn5 = (TextView)findViewById(R.id.APS3_perempuanNew3);
        APS3_lakpem5 = (TextView)findViewById(R.id.APS3_lakpemNew3);

        APS3_tahun6 = (TextView)findViewById(R.id.APS3_tahunNew4);
        APS3_laki6 = (TextView)findViewById(R.id.APS3_lakiNew4);
        APS3_prmpn6 = (TextView)findViewById(R.id.APS3_perempuanNew4);
        APS3_lakpem6 = (TextView)findViewById(R.id.APS3_lakpemNew4);

        APS3_tahun7 = (TextView)findViewById(R.id.APS3_tahunNew5);
        APS3_laki7 = (TextView)findViewById(R.id.APS3_lakiNew5);
        APS3_prmpn7 = (TextView)findViewById(R.id.APS3_perempuanNew5);
        APS3_lakpem7 = (TextView)findViewById(R.id.APS3_lakpemNew5);

        APS3_tahun8 = (TextView)findViewById(R.id.APS3_tahunNew6);
        APS3_laki8 = (TextView)findViewById(R.id.APS3_lakiNew6);
        APS3_prmpn8 = (TextView)findViewById(R.id.APS3_perempuanNew6);
        APS3_lakpem8 = (TextView)findViewById(R.id.APS3_lakpemNew6);



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.aps);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.search:
                        startActivity(new Intent(getApplicationContext(),SearchActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(),ProfileActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

    }

    public void Home(View view) {
        Intent intent = new Intent(ApsActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(ApsActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(ApsActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }


    public void back(View view) {
        Intent intent = new Intent(ApsActivity.this, SosialActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class) !=null) {

            String key = snapshot.getKey();
            if (key.equals("APS 7-12")) {

                String aps1 = snapshot.getValue(String.class);
                APS1.setText(aps1);
            }

            if (key.equals("APS7-12_tahun_2019")) {

                String aps2 = snapshot.getValue(String.class);
                APS1_tahun1.setText(aps2);
            }

            if (key.equals("APS7-12_laki_2019")) {

                String aps3 = snapshot.getValue(String.class);
                APS1_laki1.setText(aps3);
            }

            if (key.equals("APS7-12_perempuan_2019")) {

                String aps4 = snapshot.getValue(String.class);
                APS1_prmpn1.setText(aps4);
            }

            if (key.equals("APS7-12_laki_perempuan_2019")) {

                String aps5 = snapshot.getValue(String.class);
                APS1_lakpem1.setText(aps5);
            }




            if (key.equals("APS7-12_tahun_2018")) {

                String aps6 = snapshot.getValue(String.class);
                APS1_tahun2.setText(aps6);
            }

            if (key.equals("APS7-12_laki_2018")) {

                String aps7 = snapshot.getValue(String.class);
                APS1_laki2.setText(aps7);
            }

            if (key.equals("APS7-12_perempuan_2018")) {

                String aps8 = snapshot.getValue(String.class);
                APS1_prmpn2.setText(aps8);
            }

            if (key.equals("APS7-12_laki_perempuan_2018")) {

                String aps9 = snapshot.getValue(String.class);
                APS1_lakpem2.setText(aps9);
            }



            if (key.equals("APS 13-15")) {

                String aps10 = snapshot.getValue(String.class);
                APS2.setText(aps10);
            }

            if (key.equals("APS13-15_tahun_2019")) {

                String aps11 = snapshot.getValue(String.class);
                APS2_tahun1.setText(aps11);
            }

            if (key.equals("APS13-15_laki_2019")) {

                String aps12 = snapshot.getValue(String.class);
                APS2_laki1.setText(aps12);
            }

            if (key.equals("APS13-15_perempuan_2019")) {

                String aps13 = snapshot.getValue(String.class);
                APS2_prmpn1.setText(aps13);
            }

            if (key.equals("APS13-15_laki_perempuan_2019")) {

                String aps14 = snapshot.getValue(String.class);
                APS2_lakpem1.setText(aps14);
            }



            if (key.equals("APS13-15_tahun_2018")) {

                String aps15 = snapshot.getValue(String.class);
                APS2_tahun2.setText(aps15);
            }

            if (key.equals("APS13-15_laki_2018")) {

                String aps16 = snapshot.getValue(String.class);
                APS2_laki2.setText(aps16);
            }

            if (key.equals("APS13-15_perempuan_2018")) {

                String aps17 = snapshot.getValue(String.class);
                APS2_prmpn2.setText(aps17);
            }

            if (key.equals("APS13-15_laki_perempuan_2018")) {

                String aps18 = snapshot.getValue(String.class);
                APS2_lakpem2.setText(aps18);
            }



            if (key.equals("APS 16-18")) {

                String aps19 = snapshot.getValue(String.class);
                APS3.setText(aps19);
            }

            if (key.equals("APS16-18_tahun_2019")) {

                String aps20 = snapshot.getValue(String.class);
                APS3_tahun1.setText(aps20);
            }

            if (key.equals("APS16-18_laki_2019")) {

                String aps21 = snapshot.getValue(String.class);
                APS3_laki1.setText(aps21);
            }

            if (key.equals("APS16-18_perempuan_2019")) {

                String aps22 = snapshot.getValue(String.class);
                APS3_prmpn1.setText(aps22);
            }

            if (key.equals("APS16-18_laki_perempuan_2019")) {

                String aps23 = snapshot.getValue(String.class);
                APS3_lakpem1.setText(aps23);
            }



            if (key.equals("APS16-18_tahun_2018")) {

                String aps24 = snapshot.getValue(String.class);
                APS3_tahun2.setText(aps24);
            }

            if (key.equals("APS16-18_laki_2018")) {

                String aps25 = snapshot.getValue(String.class);
                APS3_laki2.setText(aps25);
            }

            if (key.equals("APS16-18_perempuan_2018")) {

                String aps26 = snapshot.getValue(String.class);
                APS3_prmpn2.setText(aps26);
            }

            if (key.equals("APS16-18_laki_perempuan_2018")) {

                String aps27 = snapshot.getValue(String.class);
                APS3_lakpem2.setText(aps27);
            }





            if (key.equals("APS7-12_tahun_2020")) {

                String aps28 = snapshot.getValue(String.class);
                APS1_tahun3.setText(aps28);
            }

            if (key.equals("APS7-12_laki_2020")) {

                String aps29 = snapshot.getValue(String.class);
                APS1_laki3.setText(aps29);
            }

            if (key.equals("APS7-12_perempuan_2020")) {

                String aps30 = snapshot.getValue(String.class);
                APS1_prmpn3.setText(aps30);
            }

            if (key.equals("APS7-12_laki_perempuan_2020")) {

                String aps31 = snapshot.getValue(String.class);
                APS1_lakpem3.setText(aps31);
            }





            if (key.equals("APS7-12_tahun_2021")) {

                String aps32 = snapshot.getValue(String.class);
                APS1_tahun4.setText(aps32);
            }

            if (key.equals("APS7-12_laki_2021")) {

                String aps33 = snapshot.getValue(String.class);
                APS1_laki4.setText(aps33);
            }

            if (key.equals("APS7-12_perempuan_2021")) {

                String aps34 = snapshot.getValue(String.class);
                APS1_prmpn4.setText(aps34);
            }

            if (key.equals("APS7-12_laki_perempuan_2021")) {

                String aps35 = snapshot.getValue(String.class);
                APS1_lakpem4.setText(aps35);
            }





            if (key.equals("APS7-12_tahun_2022")) {

                String aps36 = snapshot.getValue(String.class);
                APS1_tahun5.setText(aps36);
            }

            if (key.equals("APS7-12_laki_2022")) {

                String aps37 = snapshot.getValue(String.class);
                APS1_laki5.setText(aps37);
            }

            if (key.equals("APS7-12_perempuan_2022")) {

                String aps38 = snapshot.getValue(String.class);
                APS1_prmpn5.setText(aps38);
            }

            if (key.equals("APS7-12_laki_perempuan_2022")) {

                String aps39 = snapshot.getValue(String.class);
                APS1_lakpem5.setText(aps39);
            }






            if (key.equals("APS7-12_tahun_2023")) {

                String aps40 = snapshot.getValue(String.class);
                APS1_tahun6.setText(aps40);
            }

            if (key.equals("APS7-12_laki_2023")) {

                String aps41 = snapshot.getValue(String.class);
                APS1_laki6.setText(aps41);
            }

            if (key.equals("APS7-12_perempuan_2023")) {

                String aps42 = snapshot.getValue(String.class);
                APS1_prmpn6.setText(aps42);
            }

            if (key.equals("APS7-12_laki_perempuan_2023")) {

                String aps43 = snapshot.getValue(String.class);
                APS1_lakpem6.setText(aps43);
            }






            if (key.equals("APS7-12_tahun_2024")) {

                String aps44 = snapshot.getValue(String.class);
                APS1_tahun7.setText(aps44);
            }

            if (key.equals("APS7-12_laki_2024")) {

                String aps45 = snapshot.getValue(String.class);
                APS1_laki7.setText(aps45);
            }

            if (key.equals("APS7-12_perempuan_2024")) {

                String aps46 = snapshot.getValue(String.class);
                APS1_prmpn7.setText(aps46);
            }

            if (key.equals("APS7-12_laki_perempuan_2024")) {

                String aps47 = snapshot.getValue(String.class);
                APS1_lakpem7.setText(aps47);
            }






            if (key.equals("APS7-12_tahun_2025")) {

                String aps48 = snapshot.getValue(String.class);
                APS1_tahun8.setText(aps48);
            }

            if (key.equals("APS7-12_laki_2025")) {

                String aps49 = snapshot.getValue(String.class);
                APS1_laki8.setText(aps49);
            }

            if (key.equals("APS7-12_perempuan_2025")) {

                String aps50 = snapshot.getValue(String.class);
                APS1_prmpn8.setText(aps50);
            }

            if (key.equals("APS7-12_laki_perempuan_2025")) {

                String aps51 = snapshot.getValue(String.class);
                APS1_lakpem8.setText(aps51);
            }








            if (key.equals("APS13-15_tahun_2020")) {

                String aps52 = snapshot.getValue(String.class);
                APS2_tahun3.setText(aps52);
            }

            if (key.equals("APS13-15_laki_2020")) {

                String aps53 = snapshot.getValue(String.class);
                APS2_laki3.setText(aps53);
            }

            if (key.equals("APS13-15_perempuan_2020")) {

                String aps54 = snapshot.getValue(String.class);
                APS2_prmpn3.setText(aps54);
            }

            if (key.equals("APS13-15_laki_perempuan_2020")) {

                String aps55 = snapshot.getValue(String.class);
                APS2_lakpem3.setText(aps55);
            }





            if (key.equals("APS13-15_tahun_2021")) {

                String aps56 = snapshot.getValue(String.class);
                APS2_tahun4.setText(aps56);
            }

            if (key.equals("APS13-15_laki_2021")) {

                String aps57 = snapshot.getValue(String.class);
                APS2_laki4.setText(aps57);
            }

            if (key.equals("APS13-15_perempuan_2021")) {

                String aps58 = snapshot.getValue(String.class);
                APS2_prmpn4.setText(aps58);
            }

            if (key.equals("APS13-15_laki_perempuan_2021")) {

                String aps59 = snapshot.getValue(String.class);
                APS2_lakpem4.setText(aps59);
            }





            if (key.equals("APS13-15_tahun_2022")) {

                String aps60 = snapshot.getValue(String.class);
                APS2_tahun5.setText(aps60);
            }

            if (key.equals("APS13-15_laki_2022")) {

                String aps61 = snapshot.getValue(String.class);
                APS2_laki5.setText(aps61);
            }

            if (key.equals("APS13-15_perempuan_2022")) {

                String aps62 = snapshot.getValue(String.class);
                APS2_prmpn5.setText(aps62);
            }

            if (key.equals("APS13-15_laki_perempuan_2022")) {

                String aps63 = snapshot.getValue(String.class);
                APS2_lakpem5.setText(aps63);
            }






            if (key.equals("APS13-15_tahun_2023")) {

                String aps64 = snapshot.getValue(String.class);
                APS2_tahun6.setText(aps64);
            }

            if (key.equals("APS13-15_laki_2023")) {

                String aps65 = snapshot.getValue(String.class);
                APS2_laki6.setText(aps65);
            }

            if (key.equals("APS13-15_perempuan_2023")) {

                String aps66 = snapshot.getValue(String.class);
                APS2_prmpn6.setText(aps66);
            }

            if (key.equals("APS13-15_laki_perempuan_2023")) {

                String aps67 = snapshot.getValue(String.class);
                APS2_lakpem6.setText(aps67);
            }






            if (key.equals("APS13-15_tahun_2024")) {

                String aps68 = snapshot.getValue(String.class);
                APS2_tahun7.setText(aps68);
            }

            if (key.equals("APS13-15_laki_2024")) {

                String aps69 = snapshot.getValue(String.class);
                APS2_laki7.setText(aps69);
            }

            if (key.equals("APS13-15_perempuan_2024")) {

                String aps70 = snapshot.getValue(String.class);
                APS2_prmpn7.setText(aps70);
            }

            if (key.equals("APS13-15_laki_perempuan_2024")) {

                String aps71 = snapshot.getValue(String.class);
                APS2_lakpem7.setText(aps71);
            }






            if (key.equals("APS13-15_tahun_2025")) {

                String aps72 = snapshot.getValue(String.class);
                APS2_tahun8.setText(aps72);
            }

            if (key.equals("APS13-15_laki_2025")) {

                String aps73 = snapshot.getValue(String.class);
                APS2_laki8.setText(aps73);
            }

            if (key.equals("APS13-15_perempuan_2025")) {

                String aps74 = snapshot.getValue(String.class);
                APS2_prmpn8.setText(aps74);
            }

            if (key.equals("APS13-15_laki_perempuan_2025")) {

                String aps75 = snapshot.getValue(String.class);
                APS2_lakpem8.setText(aps75);
            }








            if (key.equals("APS16-18_tahun_2020")) {

                String aps76 = snapshot.getValue(String.class);
                APS3_tahun3.setText(aps76);
            }

            if (key.equals("APS16-18_laki_2020")) {

                String aps77 = snapshot.getValue(String.class);
                APS3_laki3.setText(aps77);
            }

            if (key.equals("APS16-18_perempuan_2020")) {

                String aps78 = snapshot.getValue(String.class);
                APS3_prmpn3.setText(aps78);
            }

            if (key.equals("APS16-18_laki_perempuan_2020")) {

                String aps79 = snapshot.getValue(String.class);
                APS3_lakpem3.setText(aps79);
            }





            if (key.equals("APS16-18_tahun_2021")) {

                String aps80 = snapshot.getValue(String.class);
                APS3_tahun4.setText(aps80);
            }

            if (key.equals("APS16-18_laki_2021")) {

                String aps81 = snapshot.getValue(String.class);
                APS3_laki4.setText(aps81);
            }

            if (key.equals("APS16-18_perempuan_2021")) {

                String aps82 = snapshot.getValue(String.class);
                APS3_prmpn4.setText(aps82);
            }

            if (key.equals("APS16-18_laki_perempuan_2021")) {

                String aps83 = snapshot.getValue(String.class);
                APS3_lakpem4.setText(aps83);
            }





            if (key.equals("APS16-18_tahun_2022")) {

                String aps84 = snapshot.getValue(String.class);
                APS3_tahun5.setText(aps84);
            }

            if (key.equals("APS16-18_laki_2022")) {

                String aps85 = snapshot.getValue(String.class);
                APS3_laki5.setText(aps85);
            }

            if (key.equals("APS16-18_perempuan_2022")) {

                String aps86 = snapshot.getValue(String.class);
                APS3_prmpn5.setText(aps86);
            }

            if (key.equals("APS16-18_laki_perempuan_2022")) {

                String aps87 = snapshot.getValue(String.class);
                APS3_lakpem5.setText(aps87);
            }






            if (key.equals("APS16-18_tahun_2023")) {

                String aps88 = snapshot.getValue(String.class);
                APS3_tahun6.setText(aps88);
            }

            if (key.equals("APS16-18_laki_2023")) {

                String aps89 = snapshot.getValue(String.class);
                APS3_laki6.setText(aps89);
            }

            if (key.equals("APS16-18_perempuan_2023")) {

                String aps90 = snapshot.getValue(String.class);
                APS3_prmpn6.setText(aps90);
            }

            if (key.equals("APS16-18_laki_perempuan_2023")) {

                String aps91 = snapshot.getValue(String.class);
                APS3_lakpem6.setText(aps91);
            }






            if (key.equals("APS16-18_tahun_2024")) {

                String aps92 = snapshot.getValue(String.class);
                APS3_tahun7.setText(aps92);
            }

            if (key.equals("APS16-18_laki_2024")) {

                String aps93 = snapshot.getValue(String.class);
                APS3_laki7.setText(aps93);
            }

            if (key.equals("APS16-18_perempuan_2024")) {

                String aps94 = snapshot.getValue(String.class);
                APS3_prmpn7.setText(aps94);
            }

            if (key.equals("APS16-18_laki_perempuan_2024")) {

                String aps95 = snapshot.getValue(String.class);
                APS3_lakpem7.setText(aps95);
            }






            if (key.equals("APS16-18_tahun_2025")) {

                String aps96 = snapshot.getValue(String.class);
                APS3_tahun8.setText(aps96);
            }

            if (key.equals("APS16-18_laki_2025")) {

                String aps97 = snapshot.getValue(String.class);
                APS3_laki8.setText(aps97);
            }

            if (key.equals("APS16-18_perempuan_2025")) {

                String aps98 = snapshot.getValue(String.class);
                APS3_prmpn8.setText(aps98);
            }

            if (key.equals("APS16-18_laki_perempuan_2025")) {

                String aps99 = snapshot.getValue(String.class);
                APS3_lakpem8.setText(aps99);
            }
        }
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        APSData1.addValueEventListener(this);
        APSData2.addValueEventListener(this);
        APSData3.addValueEventListener(this);
        APSData4.addValueEventListener(this);
        APSData5.addValueEventListener(this);

        APSData6.addValueEventListener(this);
        APSData7.addValueEventListener(this);
        APSData8.addValueEventListener(this);
        APSData9.addValueEventListener(this);

        APSData10.addValueEventListener(this);
        APSData11.addValueEventListener(this);
        APSData12.addValueEventListener(this);
        APSData13.addValueEventListener(this);
        APSData14.addValueEventListener(this);

        APSData15.addValueEventListener(this);
        APSData16.addValueEventListener(this);
        APSData17.addValueEventListener(this);
        APSData18.addValueEventListener(this);

        APSData19.addValueEventListener(this);
        APSData20.addValueEventListener(this);
        APSData21.addValueEventListener(this);
        APSData22.addValueEventListener(this);
        APSData23.addValueEventListener(this);

        APSData24.addValueEventListener(this);
        APSData25.addValueEventListener(this);
        APSData26.addValueEventListener(this);
        APSData27.addValueEventListener(this);


        APSData28.addValueEventListener(this);
        APSData29.addValueEventListener(this);
        APSData30.addValueEventListener(this);
        APSData31.addValueEventListener(this);

        APSData32.addValueEventListener(this);
        APSData33.addValueEventListener(this);
        APSData34.addValueEventListener(this);
        APSData35.addValueEventListener(this);

        APSData36.addValueEventListener(this);
        APSData37.addValueEventListener(this);
        APSData38.addValueEventListener(this);
        APSData39.addValueEventListener(this);

        APSData40.addValueEventListener(this);
        APSData41.addValueEventListener(this);
        APSData42.addValueEventListener(this);
        APSData43.addValueEventListener(this);

        APSData44.addValueEventListener(this);
        APSData45.addValueEventListener(this);
        APSData46.addValueEventListener(this);
        APSData47.addValueEventListener(this);

        APSData48.addValueEventListener(this);
        APSData49.addValueEventListener(this);
        APSData50.addValueEventListener(this);
        APSData51.addValueEventListener(this);


        APSData52.addValueEventListener(this);
        APSData53.addValueEventListener(this);
        APSData54.addValueEventListener(this);
        APSData55.addValueEventListener(this);

        APSData56.addValueEventListener(this);
        APSData57.addValueEventListener(this);
        APSData58.addValueEventListener(this);
        APSData59.addValueEventListener(this);

        APSData60.addValueEventListener(this);
        APSData61.addValueEventListener(this);
        APSData62.addValueEventListener(this);
        APSData63.addValueEventListener(this);

        APSData64.addValueEventListener(this);
        APSData65.addValueEventListener(this);
        APSData66.addValueEventListener(this);
        APSData67.addValueEventListener(this);

        APSData68.addValueEventListener(this);
        APSData69.addValueEventListener(this);
        APSData70.addValueEventListener(this);
        APSData71.addValueEventListener(this);

        APSData72.addValueEventListener(this);
        APSData73.addValueEventListener(this);
        APSData74.addValueEventListener(this);
        APSData75.addValueEventListener(this);


        APSData76.addValueEventListener(this);
        APSData77.addValueEventListener(this);
        APSData78.addValueEventListener(this);
        APSData79.addValueEventListener(this);

        APSData80.addValueEventListener(this);
        APSData81.addValueEventListener(this);
        APSData82.addValueEventListener(this);
        APSData83.addValueEventListener(this);

        APSData84.addValueEventListener(this);
        APSData85.addValueEventListener(this);
        APSData86.addValueEventListener(this);
        APSData87.addValueEventListener(this);

        APSData88.addValueEventListener(this);
        APSData89.addValueEventListener(this);
        APSData90.addValueEventListener(this);
        APSData91.addValueEventListener(this);

        APSData92.addValueEventListener(this);
        APSData93.addValueEventListener(this);
        APSData94.addValueEventListener(this);
        APSData95.addValueEventListener(this);

        APSData96.addValueEventListener(this);
        APSData97.addValueEventListener(this);
        APSData98.addValueEventListener(this);
        APSData99.addValueEventListener(this);
    }

}