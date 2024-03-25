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

public class ApmActivity extends AppCompatActivity implements ValueEventListener {

    //untuk connect ke firebase
    //tidak perlu diubah
    //apabila ingin mengubah data bisa langsung ke firebase

    TextView APM1, APM2, APM3,
            APM1_tahun1, APM1_tahun2, APM1_tahun3,APM1_tahun4,APM1_tahun5,APM1_tahun6,APM1_tahun7,APM1_tahun8,
            APM2_tahun1, APM2_tahun2, APM2_tahun3,APM2_tahun4,APM2_tahun5,APM2_tahun6,APM2_tahun7,APM2_tahun8,
            APM3_tahun1, APM3_tahun2,APM3_tahun3,APM3_tahun4,APM3_tahun5,APM3_tahun6,APM3_tahun7,APM3_tahun8,
            APM1_laki1, APM1_laki2,APM1_laki3,APM1_laki4,APM1_laki5,APM1_laki6,APM1_laki7,APM1_laki8,
            APM2_laki1, APM2_laki2,APM2_laki3,APM2_laki4,APM2_laki5,APM2_laki6,APM2_laki7,APM2_laki8,
            APM3_laki1, APM3_laki2,APM3_laki3,APM3_laki4,APM3_laki5,APM3_laki6,APM3_laki7,APM3_laki8,
            APM1_prmpn1, APM1_prmpn2,APM1_prmpn3,APM1_prmpn4,APM1_prmpn5,APM1_prmpn6,APM1_prmpn7,APM1_prmpn8,
            APM2_prmpn1, APM2_prmpn2,APM2_prmpn3,APM2_prmpn4,APM2_prmpn5,APM2_prmpn6,APM2_prmpn7,APM2_prmpn8,
            APM3_prmpn1, APM3_prmpn2,APM3_prmpn3,APM3_prmpn4,APM3_prmpn5,APM3_prmpn6,APM3_prmpn7,APM3_prmpn8,
            APM1_lakpem1, APM1_lakpem2,APM1_lakpem3,APM1_lakpem4,APM1_lakpem5,APM1_lakpem6,APM1_lakpem7,APM1_lakpem8,
            APM2_lakpem1, APM2_lakpem2,APM2_lakpem3,APM2_lakpem4,APM2_lakpem5,APM2_lakpem6,APM2_lakpem7,APM2_lakpem8,
            APM3_lakpem1, APM3_lakpem2,APM3_lakpem3,APM3_lakpem4,APM3_lakpem5,APM3_lakpem6,APM3_lakpem7,APM3_lakpem8;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference APMData1 = databaseReference.child("APM SD");
    private DatabaseReference APMData2 = databaseReference.child("APM_SD_tahun_2019");
    private DatabaseReference APMData3 = databaseReference.child("APM_SD_laki_2019");
    private DatabaseReference APMData4 = databaseReference.child("APM_SD_perempuan_2019");
    private DatabaseReference APMData5 = databaseReference.child("APM_SD_laki_perempuan_2019");

    private DatabaseReference APMData6 = databaseReference.child("APM_SD_tahun_2018");
    private DatabaseReference APMData7 = databaseReference.child("APM_SD_laki_2018");
    private DatabaseReference APMData8 = databaseReference.child("APM_SD_perempuan_2018");
    private DatabaseReference APMData9 = databaseReference.child("APM_SD_laki_perempuan_2018");

    private DatabaseReference APMData10 = databaseReference.child("APM SMP");
    private DatabaseReference APMData11 = databaseReference.child("APM_SMP_tahun_2019");
    private DatabaseReference APMData12 = databaseReference.child("APM_SMP_laki_2019");
    private DatabaseReference APMData13 = databaseReference.child("APM_SMP_perempuan_2019");
    private DatabaseReference APMData14 = databaseReference.child("APM_SMP_laki_perempuan_2019");

    private DatabaseReference APMData15 = databaseReference.child("APM_SMP_tahun_2018");
    private DatabaseReference APMData16 = databaseReference.child("APM_SMP_laki_2018");
    private DatabaseReference APMData17 = databaseReference.child("APM_SMP_perempuan_2018");
    private DatabaseReference APMData18 = databaseReference.child("APM_SMP_laki_perempuan_2018");

    private DatabaseReference APMData19 = databaseReference.child("APM SMA");
    private DatabaseReference APMData20 = databaseReference.child("APM_SMA_tahun_2019");
    private DatabaseReference APMData21 = databaseReference.child("APM_SMA_laki_2019");
    private DatabaseReference APMData22 = databaseReference.child("APM_SMA_perempuan_2019");
    private DatabaseReference APMData23 = databaseReference.child("APM_SMA_laki_perempuan_2019");

    private DatabaseReference APMData24 = databaseReference.child("APM_SMA_tahun_2018");
    private DatabaseReference APMData25 = databaseReference.child("APM_SMA_laki_2018");
    private DatabaseReference APMData26 = databaseReference.child("APM_SMA_perempuan_2018");
    private DatabaseReference APMData27 = databaseReference.child("APM_SMA_laki_perempuan_2018");


    private DatabaseReference APMData28 = databaseReference.child("APM_SD_tahun_2020");
    private DatabaseReference APMData29 = databaseReference.child("APM_SD_laki_2020");
    private DatabaseReference APMData30 = databaseReference.child("APM_SD_perempuan_2020");
    private DatabaseReference APMData31 = databaseReference.child("APM_SD_laki_perempuan_2020");

    private DatabaseReference APMData32 = databaseReference.child("APM_SD_tahun_2021");
    private DatabaseReference APMData33 = databaseReference.child("APM_SD_laki_2021");
    private DatabaseReference APMData34 = databaseReference.child("APM_SD_perempuan_2021");
    private DatabaseReference APMData35 = databaseReference.child("APM_SD_laki_perempuan_2021");

    private DatabaseReference APMData36 = databaseReference.child("APM_SD_tahun_2022");
    private DatabaseReference APMData37 = databaseReference.child("APM_SD_laki_2022");
    private DatabaseReference APMData38 = databaseReference.child("APM_SD_perempuan_2022");
    private DatabaseReference APMData39 = databaseReference.child("APM_SD_laki_perempuan_2022");

    private DatabaseReference APMData40 = databaseReference.child("APM_SD_tahun_2023");
    private DatabaseReference APMData41 = databaseReference.child("APM_SD_laki_2023");
    private DatabaseReference APMData42 = databaseReference.child("APM_SD_perempuan_2023");
    private DatabaseReference APMData43 = databaseReference.child("APM_SD_laki_perempuan_2023");

    private DatabaseReference APMData44 = databaseReference.child("APM_SD_tahun_2024");
    private DatabaseReference APMData45 = databaseReference.child("APM_SD_laki_2024");
    private DatabaseReference APMData46 = databaseReference.child("APM_SD_perempuan_2024");
    private DatabaseReference APMData47 = databaseReference.child("APM_SD_laki_perempuan_2024");

    private DatabaseReference APMData48 = databaseReference.child("APM_SD_tahun_2025");
    private DatabaseReference APMData49 = databaseReference.child("APM_SD_laki_2025");
    private DatabaseReference APMData50 = databaseReference.child("APM_SD_perempuan_2025");
    private DatabaseReference APMData51 = databaseReference.child("APM_SD_laki_perempuan_2025");


    private DatabaseReference APMData52 = databaseReference.child("APM_SMP_tahun_2020");
    private DatabaseReference APMData53 = databaseReference.child("APM_SMP_laki_2020");
    private DatabaseReference APMData54 = databaseReference.child("APM_SMP_perempuan_2020");
    private DatabaseReference APMData55 = databaseReference.child("APM_SMP_laki_perempuan_2020");

    private DatabaseReference APMData56 = databaseReference.child("APM_SMP_tahun_2021");
    private DatabaseReference APMData57 = databaseReference.child("APM_SMP_laki_2021");
    private DatabaseReference APMData58 = databaseReference.child("APM_SMP_perempuan_2021");
    private DatabaseReference APMData59 = databaseReference.child("APM_SMP_laki_perempuan_2021");

    private DatabaseReference APMData60 = databaseReference.child("APM_SMP_tahun_2022");
    private DatabaseReference APMData61 = databaseReference.child("APM_SMP_laki_2022");
    private DatabaseReference APMData62 = databaseReference.child("APM_SMP_perempuan_2022");
    private DatabaseReference APMData63 = databaseReference.child("APM_SMP_laki_perempuan_2022");

    private DatabaseReference APMData64 = databaseReference.child("APM_SMP_tahun_2023");
    private DatabaseReference APMData65 = databaseReference.child("APM_SMP_laki_2023");
    private DatabaseReference APMData66 = databaseReference.child("APM_SMP_perempuan_2023");
    private DatabaseReference APMData67 = databaseReference.child("APM_SMP_laki_perempuan_2023");

    private DatabaseReference APMData68 = databaseReference.child("APM_SMP_tahun_2024");
    private DatabaseReference APMData69 = databaseReference.child("APM_SMP_laki_2024");
    private DatabaseReference APMData70 = databaseReference.child("APM_SMP_perempuan_2024");
    private DatabaseReference APMData71 = databaseReference.child("APM_SMP_laki_perempuan_2024");

    private DatabaseReference APMData72 = databaseReference.child("APM_SMP_tahun_2025");
    private DatabaseReference APMData73 = databaseReference.child("APM_SMP_laki_2025");
    private DatabaseReference APMData74 = databaseReference.child("APM_SMP_perempuan_2025");
    private DatabaseReference APMData75 = databaseReference.child("APM_SMP_laki_perempuan_2025");


    private DatabaseReference APMData76 = databaseReference.child("APM_SMA_tahun_2020");
    private DatabaseReference APMData77 = databaseReference.child("APM_SMA_laki_2020");
    private DatabaseReference APMData78 = databaseReference.child("APM_SMA_perempuan_2020");
    private DatabaseReference APMData79 = databaseReference.child("APM_SMA_laki_perempuan_2020");

    private DatabaseReference APMData80 = databaseReference.child("APM_SMA_tahun_2021");
    private DatabaseReference APMData81 = databaseReference.child("APM_SMA_laki_2021");
    private DatabaseReference APMData82 = databaseReference.child("APM_SMA_perempuan_2021");
    private DatabaseReference APMData83 = databaseReference.child("APM_SMA_laki_perempuan_2021");

    private DatabaseReference APMData84 = databaseReference.child("APM_SMA_tahun_2022");
    private DatabaseReference APMData85 = databaseReference.child("APM_SMA_laki_2022");
    private DatabaseReference APMData86 = databaseReference.child("APM_SMA_perempuan_2022");
    private DatabaseReference APMData87 = databaseReference.child("APM_SMA_laki_perempuan_2022");

    private DatabaseReference APMData88 = databaseReference.child("APM_SMA_tahun_2023");
    private DatabaseReference APMData89 = databaseReference.child("APM_SMA_laki_2023");
    private DatabaseReference APMData90 = databaseReference.child("APM_SMA_perempuan_2023");
    private DatabaseReference APMData91 = databaseReference.child("APM_SMA_laki_perempuan_2023");

    private DatabaseReference APMData92 = databaseReference.child("APM_SMA_tahun_2024");
    private DatabaseReference APMData93 = databaseReference.child("APM_SMA_laki_2024");
    private DatabaseReference APMData94 = databaseReference.child("APM_SMA_perempuan_2024");
    private DatabaseReference APMData95 = databaseReference.child("APM_SMA_laki_perempuan_2024");

    private DatabaseReference APMData96 = databaseReference.child("APM_SMA_tahun_2025");
    private DatabaseReference APMData97 = databaseReference.child("APM_SMA_laki_2025");
    private DatabaseReference APMData98 = databaseReference.child("APM_SMA_perempuan_2025");
    private DatabaseReference APMData99 = databaseReference.child("APM_SMA_laki_perempuan_2025");



    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apm);

        APM1 = (TextView)findViewById(R.id.APM1);
        APM1_tahun1 = (TextView)findViewById(R.id.APM1_tahun1);
        APM1_laki1 = (TextView)findViewById(R.id.APM1_laki1);
        APM1_prmpn1 = (TextView)findViewById(R.id.APM1_perempuan1);
        APM1_lakpem1 = (TextView)findViewById(R.id.APM1_lakpem1);

        APM1_tahun2 = (TextView)findViewById(R.id.APM1_tahun2);
        APM1_laki2 = (TextView)findViewById(R.id.APM1_laki2);
        APM1_prmpn2 = (TextView)findViewById(R.id.APM1_perempuan2);
        APM1_lakpem2 = (TextView)findViewById(R.id.APM1_lakpem2);

        APM2 = (TextView)findViewById(R.id.APM2);
        APM2_tahun1 = (TextView)findViewById(R.id.APM2_tahun1);
        APM2_laki1 = (TextView)findViewById(R.id.APM2_laki1);
        APM2_prmpn1 = (TextView)findViewById(R.id.APM2_perempuan1);
        APM2_lakpem1 = (TextView)findViewById(R.id.APM2_lakpem1);

        APM2_tahun2 = (TextView)findViewById(R.id.APM2_tahun2);
        APM2_laki2 = (TextView)findViewById(R.id.APM2_laki2);
        APM2_prmpn2 = (TextView)findViewById(R.id.APM2_perempuan2);
        APM2_lakpem2 = (TextView)findViewById(R.id.APM2_lakpem2);

        APM3 = (TextView)findViewById(R.id.APM3);
        APM3_tahun1 = (TextView)findViewById(R.id.APM3_tahun1);
        APM3_laki1 = (TextView)findViewById(R.id.APM3_laki1);
        APM3_prmpn1 = (TextView)findViewById(R.id.APM3_perempuan1);
        APM3_lakpem1 = (TextView)findViewById(R.id.APM3_lakpem1);

        APM3_tahun2 = (TextView)findViewById(R.id.APM3_tahun2);
        APM3_laki2 = (TextView)findViewById(R.id.APM3_laki2);
        APM3_prmpn2 = (TextView)findViewById(R.id.APM3_perempuan2);
        APM3_lakpem2 = (TextView)findViewById(R.id.APM3_lakpem2);


        APM1_tahun3 = (TextView)findViewById(R.id.APM1_tahunNew1);
        APM1_laki3 = (TextView)findViewById(R.id.APM1_lakiNew1);
        APM1_prmpn3 = (TextView)findViewById(R.id.APM1_perempuanNew1);
        APM1_lakpem3 = (TextView)findViewById(R.id.APM1_lakpemNew1);

        APM1_tahun4 = (TextView)findViewById(R.id.APM1_tahunNew2);
        APM1_laki4 = (TextView)findViewById(R.id.APM1_lakiNew2);
        APM1_prmpn4 = (TextView)findViewById(R.id.APM1_perempuanNew2);
        APM1_lakpem4 = (TextView)findViewById(R.id.APM1_lakpemNew2);

        APM1_tahun5 = (TextView)findViewById(R.id.APM1_tahunNew3);
        APM1_laki5 = (TextView)findViewById(R.id.APM1_lakiNew3);
        APM1_prmpn5 = (TextView)findViewById(R.id.APM1_perempuanNew3);
        APM1_lakpem5 = (TextView)findViewById(R.id.APM1_lakpemNew3);

        APM1_tahun6 = (TextView)findViewById(R.id.APM1_tahunNew4);
        APM1_laki6 = (TextView)findViewById(R.id.APM1_lakiNew4);
        APM1_prmpn6 = (TextView)findViewById(R.id.APM1_perempuanNew4);
        APM1_lakpem6 = (TextView)findViewById(R.id.APM1_lakpemNew4);

        APM1_tahun7 = (TextView)findViewById(R.id.APM1_tahunNew5);
        APM1_laki7 = (TextView)findViewById(R.id.APM1_lakiNew5);
        APM1_prmpn7 = (TextView)findViewById(R.id.APM1_perempuanNew5);
        APM1_lakpem7 = (TextView)findViewById(R.id.APM1_lakpemNew5);

        APM1_tahun8 = (TextView)findViewById(R.id.APM1_tahunNew6);
        APM1_laki8 = (TextView)findViewById(R.id.APM1_lakiNew6);
        APM1_prmpn8 = (TextView)findViewById(R.id.APM1_perempuanNew6);
        APM1_lakpem8 = (TextView)findViewById(R.id.APM1_lakpemNew6);


        APM2_tahun3 = (TextView)findViewById(R.id.APM2_tahunNew1);
        APM2_laki3 = (TextView)findViewById(R.id.APM2_lakiNew1);
        APM2_prmpn3 = (TextView)findViewById(R.id.APM2_perempuanNew1);
        APM2_lakpem3 = (TextView)findViewById(R.id.APM2_lakpemNew1);

        APM2_tahun4 = (TextView)findViewById(R.id.APM2_tahunNew2);
        APM2_laki4 = (TextView)findViewById(R.id.APM2_lakiNew2);
        APM2_prmpn4 = (TextView)findViewById(R.id.APM2_perempuanNew2);
        APM2_lakpem4 = (TextView)findViewById(R.id.APM2_lakpemNew2);

        APM2_tahun5 = (TextView)findViewById(R.id.APM2_tahunNew3);
        APM2_laki5 = (TextView)findViewById(R.id.APM2_lakiNew3);
        APM2_prmpn5 = (TextView)findViewById(R.id.APM2_perempuanNew3);
        APM2_lakpem5 = (TextView)findViewById(R.id.APM2_lakpemNew3);

        APM2_tahun6 = (TextView)findViewById(R.id.APM2_tahunNew4);
        APM2_laki6 = (TextView)findViewById(R.id.APM2_lakiNew4);
        APM2_prmpn6 = (TextView)findViewById(R.id.APM2_perempuanNew4);
        APM2_lakpem6 = (TextView)findViewById(R.id.APM2_lakpemNew4);

        APM2_tahun7 = (TextView)findViewById(R.id.APM2_tahunNew5);
        APM2_laki7 = (TextView)findViewById(R.id.APM2_lakiNew5);
        APM2_prmpn7 = (TextView)findViewById(R.id.APM2_perempuanNew5);
        APM2_lakpem7 = (TextView)findViewById(R.id.APM2_lakpemNew5);

        APM2_tahun8 = (TextView)findViewById(R.id.APM2_tahunNew6);
        APM2_laki8 = (TextView)findViewById(R.id.APM2_lakiNew6);
        APM2_prmpn8 = (TextView)findViewById(R.id.APM2_perempuanNew6);
        APM2_lakpem8 = (TextView)findViewById(R.id.APM2_lakpemNew6);


        APM3_tahun3 = (TextView)findViewById(R.id.APM3_tahunNew1);
        APM3_laki3 = (TextView)findViewById(R.id.APM3_lakiNew1);
        APM3_prmpn3 = (TextView)findViewById(R.id.APM3_perempuanNew1);
        APM3_lakpem3 = (TextView)findViewById(R.id.APM3_lakpemNew1);

        APM3_tahun4 = (TextView)findViewById(R.id.APM3_tahunNew2);
        APM3_laki4 = (TextView)findViewById(R.id.APM3_lakiNew2);
        APM3_prmpn4 = (TextView)findViewById(R.id.APM3_perempuanNew2);
        APM3_lakpem4 = (TextView)findViewById(R.id.APM3_lakpemNew2);

        APM3_tahun5 = (TextView)findViewById(R.id.APM3_tahunNew3);
        APM3_laki5 = (TextView)findViewById(R.id.APM3_lakiNew3);
        APM3_prmpn5 = (TextView)findViewById(R.id.APM3_perempuanNew3);
        APM3_lakpem5 = (TextView)findViewById(R.id.APM3_lakpemNew3);

        APM3_tahun6 = (TextView)findViewById(R.id.APM3_tahunNew4);
        APM3_laki6 = (TextView)findViewById(R.id.APM3_lakiNew4);
        APM3_prmpn6 = (TextView)findViewById(R.id.APM3_perempuanNew4);
        APM3_lakpem6 = (TextView)findViewById(R.id.APM3_lakpemNew4);

        APM3_tahun7 = (TextView)findViewById(R.id.APM3_tahunNew5);
        APM3_laki7 = (TextView)findViewById(R.id.APM3_lakiNew5);
        APM3_prmpn7 = (TextView)findViewById(R.id.APM3_perempuanNew5);
        APM3_lakpem7 = (TextView)findViewById(R.id.APM3_lakpemNew5);

        APM3_tahun8 = (TextView)findViewById(R.id.APM3_tahunNew6);
        APM3_laki8 = (TextView)findViewById(R.id.APM3_lakiNew6);
        APM3_prmpn8 = (TextView)findViewById(R.id.APM3_perempuanNew6);
        APM3_lakpem8 = (TextView)findViewById(R.id.APM3_lakpemNew6);
        


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.apm);
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
        Intent intent = new Intent(ApmActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(ApmActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(ApmActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(ApmActivity.this, SosialActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class) !=null) {

            String key = snapshot.getKey();
            if (key.equals("APM SD")) {

                String apm1 = snapshot.getValue(String.class);
                APM1.setText(apm1);
            }

            if (key.equals("APM_SD_tahun_2019")) {

                String apm2 = snapshot.getValue(String.class);
                APM1_tahun1.setText(apm2);
            }

            if (key.equals("APM_SD_laki_2019")) {

                String apm3 = snapshot.getValue(String.class);
                APM1_laki1.setText(apm3);
            }

            if (key.equals("APM_SD_perempuan_2019")) {

                String apm4 = snapshot.getValue(String.class);
                APM1_prmpn1.setText(apm4);
            }

            if (key.equals("APM_SD_laki_perempuan_2019")) {

                String apm5 = snapshot.getValue(String.class);
                APM1_lakpem1.setText(apm5);
            }




            if (key.equals("APM_SD_tahun_2018")) {

                String apm6 = snapshot.getValue(String.class);
                APM1_tahun2.setText(apm6);
            }

            if (key.equals("APM_SD_laki_2018")) {

                String apm7 = snapshot.getValue(String.class);
                APM1_laki2.setText(apm7);
            }

            if (key.equals("APM_SD_perempuan_2018")) {

                String apm8 = snapshot.getValue(String.class);
                APM1_prmpn2.setText(apm8);
            }

            if (key.equals("APM_SD_laki_perempuan_2018")) {

                String apm9 = snapshot.getValue(String.class);
                APM1_lakpem2.setText(apm9);
            }



            if (key.equals("APM SMP")) {

                String apm10 = snapshot.getValue(String.class);
                APM2.setText(apm10);
            }

            if (key.equals("APM_SMP_tahun_2019")) {

                String apm11 = snapshot.getValue(String.class);
                APM2_tahun1.setText(apm11);
            }

            if (key.equals("APM_SMP_laki_2019")) {

                String apm12 = snapshot.getValue(String.class);
                APM2_laki1.setText(apm12);
            }

            if (key.equals("APM_SMP_perempuan_2019")) {

                String apm13 = snapshot.getValue(String.class);
                APM2_prmpn1.setText(apm13);
            }

            if (key.equals("APM_SMP_laki_perempuan_2019")) {

                String apm14 = snapshot.getValue(String.class);
                APM2_lakpem1.setText(apm14);
            }



            if (key.equals("APM_SMP_tahun_2018")) {

                String apm15 = snapshot.getValue(String.class);
                APM2_tahun2.setText(apm15);
            }

            if (key.equals("APM_SMP_laki_2018")) {

                String apm16 = snapshot.getValue(String.class);
                APM2_laki2.setText(apm16);
            }

            if (key.equals("APM_SMP_perempuan_2018")) {

                String apm17 = snapshot.getValue(String.class);
                APM2_prmpn2.setText(apm17);
            }

            if (key.equals("APM_SMP_laki_perempuan_2018")) {

                String apm18 = snapshot.getValue(String.class);
                APM2_lakpem2.setText(apm18);
            }



            if (key.equals("APM SMA")) {

                String apm19 = snapshot.getValue(String.class);
                APM3.setText(apm19);
            }

            if (key.equals("APM_SMA_tahun_2019")) {

                String apm20 = snapshot.getValue(String.class);
                APM3_tahun1.setText(apm20);
            }

            if (key.equals("APM_SMA_laki_2019")) {

                String apm21 = snapshot.getValue(String.class);
                APM3_laki1.setText(apm21);
            }

            if (key.equals("APM_SMA_perempuan_2019")) {

                String apm22 = snapshot.getValue(String.class);
                APM3_prmpn1.setText(apm22);
            }

            if (key.equals("APM_SMA_laki_perempuan_2019")) {

                String apm23 = snapshot.getValue(String.class);
                APM3_lakpem1.setText(apm23);
            }



            if (key.equals("APM_SMA_tahun_2018")) {

                String apm24 = snapshot.getValue(String.class);
                APM3_tahun2.setText(apm24);
            }

            if (key.equals("APM_SMA_laki_2018")) {

                String apm25 = snapshot.getValue(String.class);
                APM3_laki2.setText(apm25);
            }

            if (key.equals("APM_SMA_perempuan_2018")) {

                String apm26 = snapshot.getValue(String.class);
                APM3_prmpn2.setText(apm26);
            }

            if (key.equals("APM_SMA_laki_perempuan_2018")) {

                String apm27 = snapshot.getValue(String.class);
                APM3_lakpem2.setText(apm27);
            }







            if (key.equals("APM_SD_tahun_2020")) {

                String apm28 = snapshot.getValue(String.class);
                APM1_tahun3.setText(apm28);
            }

            if (key.equals("APM_SD_laki_2020")) {

                String apm29 = snapshot.getValue(String.class);
                APM1_laki3.setText(apm29);
            }

            if (key.equals("APM_SD_perempuan_2020")) {

                String apm30 = snapshot.getValue(String.class);
                APM1_prmpn3.setText(apm30);
            }

            if (key.equals("APM_SD_laki_perempuan_2020")) {

                String apm31 = snapshot.getValue(String.class);
                APM1_lakpem3.setText(apm31);
            }



            if (key.equals("APM_SD_tahun_2021")) {

                String apm32 = snapshot.getValue(String.class);
                APM1_tahun4.setText(apm32);
            }

            if (key.equals("APM_SD_laki_2021")) {

                String apm33 = snapshot.getValue(String.class);
                APM1_laki4.setText(apm33);
            }

            if (key.equals("APM_SD_perempuan_2021")) {

                String apm34 = snapshot.getValue(String.class);
                APM1_prmpn4.setText(apm34);
            }

            if (key.equals("APM_SD_laki_perempuan_2021")) {

                String apm35 = snapshot.getValue(String.class);
                APM1_lakpem4.setText(apm35);
            }


            if (key.equals("APM_SD_tahun_2022")) {

                String apm36 = snapshot.getValue(String.class);
                APM1_tahun5.setText(apm36);
            }

            if (key.equals("APM_SD_laki_2022")) {

                String apm37 = snapshot.getValue(String.class);
                APM1_laki5.setText(apm37);
            }

            if (key.equals("APM_SD_perempuan_2022")) {

                String apm38 = snapshot.getValue(String.class);
                APM1_prmpn5.setText(apm38);
            }

            if (key.equals("APM_SD_laki_perempuan_2022")) {

                String apm39 = snapshot.getValue(String.class);
                APM1_lakpem5.setText(apm39);
            }



            if (key.equals("APM_SD_tahun_2023")) {

                String apm40 = snapshot.getValue(String.class);
                APM1_tahun6.setText(apm40);
            }

            if (key.equals("APM_SD_laki_2023")) {

                String apm41 = snapshot.getValue(String.class);
                APM1_laki6.setText(apm41);
            }

            if (key.equals("APM_SD_perempuan_2023")) {

                String apm42 = snapshot.getValue(String.class);
                APM1_prmpn6.setText(apm42);
            }

            if (key.equals("APM_SD_laki_perempuan_2023")) {

                String apm43 = snapshot.getValue(String.class);
                APM1_lakpem6.setText(apm43);
            }



            if (key.equals("APM_SD_tahun_2024")) {

                String apm44 = snapshot.getValue(String.class);
                APM1_tahun7.setText(apm44);
            }

            if (key.equals("APM_SD_laki_2024")) {

                String apm45 = snapshot.getValue(String.class);
                APM1_laki7.setText(apm45);
            }

            if (key.equals("APM_SD_perempuan_2024")) {

                String apm46 = snapshot.getValue(String.class);
                APM1_prmpn7.setText(apm46);
            }

            if (key.equals("APM_SD_laki_perempuan_2024")) {

                String apm47 = snapshot.getValue(String.class);
                APM1_lakpem7.setText(apm47);
            }



            if (key.equals("APM_SD_tahun_2025")) {

                String apm48 = snapshot.getValue(String.class);
                APM1_tahun8.setText(apm48);
            }

            if (key.equals("APM_SD_laki_2025")) {

                String apm49 = snapshot.getValue(String.class);
                APM1_laki8.setText(apm49);
            }

            if (key.equals("APM_SD_perempuan_2025")) {

                String apm50 = snapshot.getValue(String.class);
                APM1_prmpn8.setText(apm50);
            }

            if (key.equals("APM_SD_laki_perempuan_2025")) {

                String apm51 = snapshot.getValue(String.class);
                APM1_lakpem8.setText(apm51);
            }









            if (key.equals("APM_SMP_tahun_2020")) {

                String apm52 = snapshot.getValue(String.class);
                APM2_tahun3.setText(apm52);
            }

            if (key.equals("APM_SMP_laki_2020")) {

                String apm53 = snapshot.getValue(String.class);
                APM2_laki3.setText(apm53);
            }

            if (key.equals("APM_SMP_perempuan_2020")) {

                String apm54 = snapshot.getValue(String.class);
                APM2_prmpn3.setText(apm54);
            }

            if (key.equals("APM_SMP_laki_perempuan_2020")) {

                String apm55 = snapshot.getValue(String.class);
                APM2_lakpem3.setText(apm55);
            }



            if (key.equals("APM_SMP_tahun_2021")) {

                String apm56 = snapshot.getValue(String.class);
                APM2_tahun4.setText(apm56);
            }

            if (key.equals("APM_SMP_laki_2021")) {

                String apm57 = snapshot.getValue(String.class);
                APM2_laki4.setText(apm57);
            }

            if (key.equals("APM_SMP_perempuan_2021")) {

                String apm58 = snapshot.getValue(String.class);
                APM2_prmpn4.setText(apm58);
            }

            if (key.equals("APM_SMP_laki_perempuan_2021")) {

                String apm59 = snapshot.getValue(String.class);
                APM2_lakpem4.setText(apm59);
            }


            if (key.equals("APM_SMP_tahun_2022")) {

                String apm60 = snapshot.getValue(String.class);
                APM2_tahun5.setText(apm60);
            }

            if (key.equals("APM_SMP_laki_2022")) {

                String apm61 = snapshot.getValue(String.class);
                APM2_laki5.setText(apm61);
            }

            if (key.equals("APM_SMP_perempuan_2022")) {

                String apm62 = snapshot.getValue(String.class);
                APM2_prmpn5.setText(apm62);
            }

            if (key.equals("APM_SMP_laki_perempuan_2022")) {

                String apm63 = snapshot.getValue(String.class);
                APM2_lakpem5.setText(apm63);
            }



            if (key.equals("APM_SMP_tahun_2023")) {

                String apm64 = snapshot.getValue(String.class);
                APM2_tahun6.setText(apm64);
            }

            if (key.equals("APM_SMP_laki_2023")) {

                String apm65 = snapshot.getValue(String.class);
                APM2_laki6.setText(apm65);
            }

            if (key.equals("APM_SMP_perempuan_2023")) {

                String apm66 = snapshot.getValue(String.class);
                APM2_prmpn6.setText(apm66);
            }

            if (key.equals("APM_SMP_laki_perempuan_2023")) {

                String apm67 = snapshot.getValue(String.class);
                APM2_lakpem6.setText(apm67);
            }



            if (key.equals("APM_SMP_tahun_2024")) {

                String apm68 = snapshot.getValue(String.class);
                APM2_tahun7.setText(apm68);
            }

            if (key.equals("APM_SMP_laki_2024")) {

                String apm69 = snapshot.getValue(String.class);
                APM2_laki7.setText(apm69);
            }

            if (key.equals("APM_SMP_perempuan_2024")) {

                String apm70 = snapshot.getValue(String.class);
                APM2_prmpn7.setText(apm70);
            }

            if (key.equals("APM_SMP_laki_perempuan_2024")) {

                String apm71 = snapshot.getValue(String.class);
                APM2_lakpem7.setText(apm71);
            }



            if (key.equals("APM_SMP_tahun_2025")) {

                String apm72 = snapshot.getValue(String.class);
                APM2_tahun8.setText(apm72);
            }

            if (key.equals("APM_SMP_laki_2025")) {

                String apm73 = snapshot.getValue(String.class);
                APM2_laki8.setText(apm73);
            }

            if (key.equals("APM_SMP_perempuan_2025")) {

                String apm74 = snapshot.getValue(String.class);
                APM2_prmpn8.setText(apm74);
            }

            if (key.equals("APM_SMP_laki_perempuan_2025")) {

                String apm75 = snapshot.getValue(String.class);
                APM2_lakpem8.setText(apm75);
            }








            if (key.equals("APM_SMA_tahun_2020")) {

                String apm76 = snapshot.getValue(String.class);
                APM3_tahun3.setText(apm76);
            }

            if (key.equals("APM_SMA_laki_2020")) {

                String apm77 = snapshot.getValue(String.class);
                APM3_laki3.setText(apm77);
            }

            if (key.equals("APM_SMA_perempuan_2020")) {

                String apm78 = snapshot.getValue(String.class);
                APM3_prmpn3.setText(apm78);
            }

            if (key.equals("APM_SMA_laki_perempuan_2020")) {

                String apm79 = snapshot.getValue(String.class);
                APM3_lakpem3.setText(apm79);
            }



            if (key.equals("APM_SMA_tahun_2021")) {

                String apm80 = snapshot.getValue(String.class);
                APM3_tahun4.setText(apm80);
            }

            if (key.equals("APM_SMA_laki_2021")) {

                String apm81 = snapshot.getValue(String.class);
                APM3_laki4.setText(apm81);
            }

            if (key.equals("APM_SMA_perempuan_2021")) {

                String apm82 = snapshot.getValue(String.class);
                APM3_prmpn4.setText(apm82);
            }

            if (key.equals("APM_SMA_laki_perempuan_2021")) {

                String apm83 = snapshot.getValue(String.class);
                APM3_lakpem4.setText(apm83);
            }


            if (key.equals("APM_SMA_tahun_2022")) {

                String apm84 = snapshot.getValue(String.class);
                APM3_tahun5.setText(apm84);
            }

            if (key.equals("APM_SMA_laki_2022")) {

                String apm85 = snapshot.getValue(String.class);
                APM3_laki5.setText(apm85);
            }

            if (key.equals("APM_SMA_perempuan_2022")) {

                String apm86 = snapshot.getValue(String.class);
                APM3_prmpn5.setText(apm86);
            }

            if (key.equals("APM_SMA_laki_perempuan_2022")) {

                String apm87 = snapshot.getValue(String.class);
                APM3_lakpem5.setText(apm87);
            }



            if (key.equals("APM_SMA_tahun_2023")) {

                String apm88 = snapshot.getValue(String.class);
                APM3_tahun6.setText(apm88);
            }

            if (key.equals("APM_SMA_laki_2023")) {

                String apm89 = snapshot.getValue(String.class);
                APM3_laki6.setText(apm89);
            }

            if (key.equals("APM_SMA_perempuan_2023")) {

                String apm90 = snapshot.getValue(String.class);
                APM3_prmpn6.setText(apm90);
            }

            if (key.equals("APM_SMA_laki_perempuan_2023")) {

                String apm91 = snapshot.getValue(String.class);
                APM3_lakpem6.setText(apm91);
            }



            if (key.equals("APM_SMA_tahun_2024")) {

                String apm92 = snapshot.getValue(String.class);
                APM3_tahun7.setText(apm92);
            }

            if (key.equals("APM_SMA_laki_2024")) {

                String apm93 = snapshot.getValue(String.class);
                APM3_laki7.setText(apm93);
            }

            if (key.equals("APM_SMA_perempuan_2024")) {

                String apm94 = snapshot.getValue(String.class);
                APM3_prmpn7.setText(apm94);
            }

            if (key.equals("APM_SMA_laki_perempuan_2024")) {

                String apm95 = snapshot.getValue(String.class);
                APM3_lakpem7.setText(apm95);
            }



            if (key.equals("APM_SMA_tahun_2025")) {

                String apm96 = snapshot.getValue(String.class);
                APM3_tahun8.setText(apm96);
            }

            if (key.equals("APM_SMA_laki_2025")) {

                String apm97 = snapshot.getValue(String.class);
                APM3_laki8.setText(apm97);
            }

            if (key.equals("APM_SMA_perempuan_2025")) {

                String apm98 = snapshot.getValue(String.class);
                APM3_prmpn8.setText(apm98);
            }

            if (key.equals("APM_SMA_laki_perempuan_2025")) {

                String apm99 = snapshot.getValue(String.class);
                APM3_lakpem8.setText(apm99);
            }
        }
        
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        APMData1.addValueEventListener(this);
        APMData2.addValueEventListener(this);
        APMData3.addValueEventListener(this);
        APMData4.addValueEventListener(this);

        APMData5.addValueEventListener(this);
        APMData6.addValueEventListener(this);
        APMData7.addValueEventListener(this);
        APMData8.addValueEventListener(this);

        APMData9.addValueEventListener(this);
        APMData10.addValueEventListener(this);
        APMData11.addValueEventListener(this);
        APMData12.addValueEventListener(this);

        APMData13.addValueEventListener(this);
        APMData14.addValueEventListener(this);
        APMData15.addValueEventListener(this);
        APMData16.addValueEventListener(this);

        APMData17.addValueEventListener(this);
        APMData18.addValueEventListener(this);
        APMData19.addValueEventListener(this);
        APMData20.addValueEventListener(this);

        APMData21.addValueEventListener(this);
        APMData22.addValueEventListener(this);
        APMData23.addValueEventListener(this);
        APMData24.addValueEventListener(this);

        APMData25.addValueEventListener(this);
        APMData26.addValueEventListener(this);
        APMData27.addValueEventListener(this);


        APMData28.addValueEventListener(this);
        APMData29.addValueEventListener(this);
        APMData30.addValueEventListener(this);
        APMData31.addValueEventListener(this);

        APMData32.addValueEventListener(this);
        APMData33.addValueEventListener(this);
        APMData34.addValueEventListener(this);
        APMData35.addValueEventListener(this);

        APMData36.addValueEventListener(this);
        APMData37.addValueEventListener(this);
        APMData38.addValueEventListener(this);
        APMData39.addValueEventListener(this);

        APMData40.addValueEventListener(this);
        APMData41.addValueEventListener(this);
        APMData42.addValueEventListener(this);
        APMData43.addValueEventListener(this);

        APMData44.addValueEventListener(this);
        APMData45.addValueEventListener(this);
        APMData46.addValueEventListener(this);
        APMData47.addValueEventListener(this);

        APMData48.addValueEventListener(this);
        APMData49.addValueEventListener(this);
        APMData50.addValueEventListener(this);
        APMData51.addValueEventListener(this);


        APMData52.addValueEventListener(this);
        APMData53.addValueEventListener(this);
        APMData54.addValueEventListener(this);
        APMData55.addValueEventListener(this);

        APMData56.addValueEventListener(this);
        APMData57.addValueEventListener(this);
        APMData58.addValueEventListener(this);
        APMData59.addValueEventListener(this);

        APMData60.addValueEventListener(this);
        APMData61.addValueEventListener(this);
        APMData62.addValueEventListener(this);
        APMData63.addValueEventListener(this);

        APMData64.addValueEventListener(this);
        APMData65.addValueEventListener(this);
        APMData66.addValueEventListener(this);
        APMData67.addValueEventListener(this);

        APMData68.addValueEventListener(this);
        APMData69.addValueEventListener(this);
        APMData70.addValueEventListener(this);
        APMData71.addValueEventListener(this);

        APMData72.addValueEventListener(this);
        APMData73.addValueEventListener(this);
        APMData74.addValueEventListener(this);
        APMData75.addValueEventListener(this);


        APMData76.addValueEventListener(this);
        APMData77.addValueEventListener(this);
        APMData78.addValueEventListener(this);
        APMData79.addValueEventListener(this);

        APMData80.addValueEventListener(this);
        APMData81.addValueEventListener(this);
        APMData82.addValueEventListener(this);
        APMData83.addValueEventListener(this);

        APMData84.addValueEventListener(this);
        APMData85.addValueEventListener(this);
        APMData86.addValueEventListener(this);
        APMData87.addValueEventListener(this);

        APMData88.addValueEventListener(this);
        APMData89.addValueEventListener(this);
        APMData90.addValueEventListener(this);
        APMData91.addValueEventListener(this);

        APMData92.addValueEventListener(this);
        APMData93.addValueEventListener(this);
        APMData94.addValueEventListener(this);
        APMData95.addValueEventListener(this);

        APMData96.addValueEventListener(this);
        APMData97.addValueEventListener(this);
        APMData98.addValueEventListener(this);
        APMData99.addValueEventListener(this);
    }
    
}