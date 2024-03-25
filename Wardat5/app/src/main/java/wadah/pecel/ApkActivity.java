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

public class ApkActivity extends AppCompatActivity implements ValueEventListener {

    //untuk connect ke firebase
    //tidak perlu diubah
    //apabila ingin mengubah data bisa langsung ke firebase

    TextView APK1, APK2, APK3,
            APK1_tahun1, APK1_tahun2, APK1_tahun3,APK1_tahun4,APK1_tahun5,APK1_tahun6,APK1_tahun7,APK1_tahun8,
            APK2_tahun1, APK2_tahun2, APK2_tahun3,APK2_tahun4,APK2_tahun5,APK2_tahun6,APK2_tahun7,APK2_tahun8,
            APK3_tahun1, APK3_tahun2,APK3_tahun3,APK3_tahun4,APK3_tahun5,APK3_tahun6,APK3_tahun7,APK3_tahun8,
            APK1_laki1, APK1_laki2, APK1_laki3,APK1_laki4,APK1_laki5,APK1_laki6,APK1_laki7,APK1_laki8,
            APK2_laki1, APK2_laki2, APK2_laki3,APK2_laki4,APK2_laki5,APK2_laki6,APK2_laki7,APK2_laki8,
            APK3_laki1, APK3_laki2,APK3_laki3,APK3_laki4,APK3_laki5,APK3_laki6,APK3_laki7,APK3_laki8,
            APK1_prmpn1, APK1_prmpn2, APK1_prmpn3,APK1_prmpn4,APK1_prmpn5,APK1_prmpn6,APK1_prmpn7,APK1_prmpn8,
            APK2_prmpn1, APK2_prmpn2, APK2_prmpn3,APK2_prmpn4,APK2_prmpn5,APK2_prmpn6,APK2_prmpn7,APK2_prmpn8,
            APK3_prmpn1, APK3_prmpn2,APK3_prmpn3,APK3_prmpn4,APK3_prmpn5,APK3_prmpn6,APK3_prmpn7,APK3_prmpn8,
            APK1_lakpem1, APK1_lakpem2,APK1_lakpem3,APK1_lakpem4,APK1_lakpem5,APK1_lakpem6,APK1_lakpem7,APK1_lakpem8,
            APK2_lakpem1, APK2_lakpem2,APK2_lakpem3,APK2_lakpem4,APK2_lakpem5,APK2_lakpem6,APK2_lakpem7,APK2_lakpem8,
            APK3_lakpem1, APK3_lakpem2,APK3_lakpem3,APK3_lakpem4,APK3_lakpem5,APK3_lakpem6,APK3_lakpem7,APK3_lakpem8;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference APKData1 = databaseReference.child("APK SD");
    private DatabaseReference APKData2 = databaseReference.child("APK_SD_tahun_2019");
    private DatabaseReference APKData3 = databaseReference.child("APK_SD_laki_2019");
    private DatabaseReference APKData4 = databaseReference.child("APK_SD_perempuan_2019");
    private DatabaseReference APKData5 = databaseReference.child("APK_SD_laki_perempuan_2019");

    private DatabaseReference APKData6 = databaseReference.child("APK_SD_tahun_2018");
    private DatabaseReference APKData7 = databaseReference.child("APK_SD_laki_2018");
    private DatabaseReference APKData8 = databaseReference.child("APK_SD_perempuan_2018");
    private DatabaseReference APKData9 = databaseReference.child("APK_SD_laki_perempuan_2018");

    private DatabaseReference APKData10 = databaseReference.child("APK SMP");
    private DatabaseReference APKData11 = databaseReference.child("APK_SMP_tahun_2019");
    private DatabaseReference APKData12 = databaseReference.child("APK_SMP_laki_2019");
    private DatabaseReference APKData13 = databaseReference.child("APK_SMP_perempuan_2019");
    private DatabaseReference APKData14 = databaseReference.child("APK_SMP_laki_perempuan_2019");

    private DatabaseReference APKData15 = databaseReference.child("APK_SMP_tahun_2018");
    private DatabaseReference APKData16 = databaseReference.child("APK_SMP_laki_2018");
    private DatabaseReference APKData17 = databaseReference.child("APK_SMP_perempuan_2018");
    private DatabaseReference APKData18 = databaseReference.child("APK_SMP_laki_perempuan_2018");

    private DatabaseReference APKData19 = databaseReference.child("APK SMA");
    private DatabaseReference APKData20 = databaseReference.child("APK_SMA_tahun_2019");
    private DatabaseReference APKData21 = databaseReference.child("APK_SMA_laki_2019");
    private DatabaseReference APKData22 = databaseReference.child("APK_SMA_perempuan_2019");
    private DatabaseReference APKData23 = databaseReference.child("APK_SMA_laki_perempuan_2019");

    private DatabaseReference APKData24 = databaseReference.child("APK_SMA_tahun_2018");
    private DatabaseReference APKData25 = databaseReference.child("APK_SMA_laki_2018");
    private DatabaseReference APKData26 = databaseReference.child("APK_SMA_perempuan_2018");
    private DatabaseReference APKData27 = databaseReference.child("APK_SMA_laki_perempuan_2018");


    private DatabaseReference APKData28 = databaseReference.child("APK_SD_tahun_2020");
    private DatabaseReference APKData29 = databaseReference.child("APK_SD_laki_2020");
    private DatabaseReference APKData30 = databaseReference.child("APK_SD_perempuan_2020");
    private DatabaseReference APKData31 = databaseReference.child("APK_SD_laki_perempuan_2020");

    private DatabaseReference APKData32 = databaseReference.child("APK_SD_tahun_2021");
    private DatabaseReference APKData33 = databaseReference.child("APK_SD_laki_2021");
    private DatabaseReference APKData34 = databaseReference.child("APK_SD_perempuan_2021");
    private DatabaseReference APKData35 = databaseReference.child("APK_SD_laki_perempuan_2021");

    private DatabaseReference APKData36 = databaseReference.child("APK_SD_tahun_2022");
    private DatabaseReference APKData37 = databaseReference.child("APK_SD_laki_2022");
    private DatabaseReference APKData38 = databaseReference.child("APK_SD_perempuan_2022");
    private DatabaseReference APKData39 = databaseReference.child("APK_SD_laki_perempuan_2022");

    private DatabaseReference APKData40 = databaseReference.child("APK_SD_tahun_2023");
    private DatabaseReference APKData41 = databaseReference.child("APK_SD_laki_2023");
    private DatabaseReference APKData42 = databaseReference.child("APK_SD_perempuan_2023");
    private DatabaseReference APKData43 = databaseReference.child("APK_SD_laki_perempuan_2023");

    private DatabaseReference APKData44 = databaseReference.child("APK_SD_tahun_2024");
    private DatabaseReference APKData45 = databaseReference.child("APK_SD_laki_2024");
    private DatabaseReference APKData46 = databaseReference.child("APK_SD_perempuan_2024");
    private DatabaseReference APKData47 = databaseReference.child("APK_SD_laki_perempuan_2024");

    private DatabaseReference APKData48 = databaseReference.child("APK_SD_tahun_2025");
    private DatabaseReference APKData49 = databaseReference.child("APK_SD_laki_2025");
    private DatabaseReference APKData50 = databaseReference.child("APK_SD_perempuan_2025");
    private DatabaseReference APKData51 = databaseReference.child("APK_SD_laki_perempuan_2025");


    private DatabaseReference APKData52 = databaseReference.child("APK_SMP_tahun_2020");
    private DatabaseReference APKData53 = databaseReference.child("APK_SMP_laki_2020");
    private DatabaseReference APKData54 = databaseReference.child("APK_SMP_perempuan_2020");
    private DatabaseReference APKData55 = databaseReference.child("APK_SMP_laki_perempuan_2020");

    private DatabaseReference APKData56 = databaseReference.child("APK_SMP_tahun_2021");
    private DatabaseReference APKData57 = databaseReference.child("APK_SMP_laki_2021");
    private DatabaseReference APKData58 = databaseReference.child("APK_SMP_perempuan_2021");
    private DatabaseReference APKData59 = databaseReference.child("APK_SMP_laki_perempuan_2021");

    private DatabaseReference APKData60 = databaseReference.child("APK_SMP_tahun_2022");
    private DatabaseReference APKData61 = databaseReference.child("APK_SMP_laki_2022");
    private DatabaseReference APKData62 = databaseReference.child("APK_SMP_perempuan_2022");
    private DatabaseReference APKData63 = databaseReference.child("APK_SMP_laki_perempuan_2022");

    private DatabaseReference APKData64 = databaseReference.child("APK_SMP_tahun_2023");
    private DatabaseReference APKData65 = databaseReference.child("APK_SMP_laki_2023");
    private DatabaseReference APKData66 = databaseReference.child("APK_SMP_perempuan_2023");
    private DatabaseReference APKData67 = databaseReference.child("APK_SMP_laki_perempuan_2023");

    private DatabaseReference APKData68 = databaseReference.child("APK_SMP_tahun_2024");
    private DatabaseReference APKData69 = databaseReference.child("APK_SMP_laki_2024");
    private DatabaseReference APKData70 = databaseReference.child("APK_SMP_perempuan_2024");
    private DatabaseReference APKData71 = databaseReference.child("APK_SMP_laki_perempuan_2024");

    private DatabaseReference APKData72 = databaseReference.child("APK_SMP_tahun_2025");
    private DatabaseReference APKData73 = databaseReference.child("APK_SMP_laki_2025");
    private DatabaseReference APKData74 = databaseReference.child("APK_SMP_perempuan_2025");
    private DatabaseReference APKData75 = databaseReference.child("APK_SMP_laki_perempuan_2025");


    private DatabaseReference APKData76 = databaseReference.child("APK_SMA_tahun_2020");
    private DatabaseReference APKData77 = databaseReference.child("APK_SMA_laki_2020");
    private DatabaseReference APKData78 = databaseReference.child("APK_SMA_perempuan_2020");
    private DatabaseReference APKData79 = databaseReference.child("APK_SMA_laki_perempuan_2020");

    private DatabaseReference APKData80 = databaseReference.child("APK_SMA_tahun_2021");
    private DatabaseReference APKData81 = databaseReference.child("APK_SMA_laki_2021");
    private DatabaseReference APKData82 = databaseReference.child("APK_SMA_perempuan_2021");
    private DatabaseReference APKData83 = databaseReference.child("APK_SMA_laki_perempuan_2021");

    private DatabaseReference APKData84 = databaseReference.child("APK_SMA_tahun_2022");
    private DatabaseReference APKData85 = databaseReference.child("APK_SMA_laki_2022");
    private DatabaseReference APKData86 = databaseReference.child("APK_SMA_perempuan_2022");
    private DatabaseReference APKData87 = databaseReference.child("APK_SMA_laki_perempuan_2022");

    private DatabaseReference APKData88 = databaseReference.child("APK_SMA_tahun_2023");
    private DatabaseReference APKData89 = databaseReference.child("APK_SMA_laki_2023");
    private DatabaseReference APKData90 = databaseReference.child("APK_SMA_perempuan_2023");
    private DatabaseReference APKData91 = databaseReference.child("APK_SMA_laki_perempuan_2023");

    private DatabaseReference APKData92 = databaseReference.child("APK_SMA_tahun_2024");
    private DatabaseReference APKData93 = databaseReference.child("APK_SMA_laki_2024");
    private DatabaseReference APKData94 = databaseReference.child("APK_SMA_perempuan_2024");
    private DatabaseReference APKData95 = databaseReference.child("APK_SMA_laki_perempuan_2024");

    private DatabaseReference APKData96 = databaseReference.child("APK_SMA_tahun_2025");
    private DatabaseReference APKData97 = databaseReference.child("APK_SMA_laki_2025");
    private DatabaseReference APKData98 = databaseReference.child("APK_SMA_perempuan_2025");
    private DatabaseReference APKData99 = databaseReference.child("APK_SMA_laki_perempuan_2025");

    
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apk);

        APK1 = (TextView)findViewById(R.id.APK1);
        APK1_tahun1 = (TextView)findViewById(R.id.APK1_tahun1);
        APK1_laki1 = (TextView)findViewById(R.id.APK1_laki1);
        APK1_prmpn1 = (TextView)findViewById(R.id.APK1_perempuan1);
        APK1_lakpem1 = (TextView)findViewById(R.id.APK1_lakpem1);

        APK1_tahun2 = (TextView)findViewById(R.id.APK1_tahun2);
        APK1_laki2 = (TextView)findViewById(R.id.APK1_laki2);
        APK1_prmpn2 = (TextView)findViewById(R.id.APK1_perempuan2);
        APK1_lakpem2 = (TextView)findViewById(R.id.APK1_lakpem2);

        APK2 = (TextView)findViewById(R.id.APK2);
        APK2_tahun1 = (TextView)findViewById(R.id.APK2_tahun1);
        APK2_laki1 = (TextView)findViewById(R.id.APK2_laki1);
        APK2_prmpn1 = (TextView)findViewById(R.id.APK2_perempuan1);
        APK2_lakpem1 = (TextView)findViewById(R.id.APK2_lakpem1);

        APK2_tahun2 = (TextView)findViewById(R.id.APK2_tahun2);
        APK2_laki2 = (TextView)findViewById(R.id.APK2_laki2);
        APK2_prmpn2 = (TextView)findViewById(R.id.APK2_perempuan2);
        APK2_lakpem2 = (TextView)findViewById(R.id.APK2_lakpem2);

        APK3 = (TextView)findViewById(R.id.APK3);
        APK3_tahun1 = (TextView)findViewById(R.id.APK3_tahun1);
        APK3_laki1 = (TextView)findViewById(R.id.APK3_laki1);
        APK3_prmpn1 = (TextView)findViewById(R.id.APK3_perempuan1);
        APK3_lakpem1 = (TextView)findViewById(R.id.APK3_lakpem1);

        APK3_tahun2 = (TextView)findViewById(R.id.APK3_tahun2);
        APK3_laki2 = (TextView)findViewById(R.id.APK3_laki2);
        APK3_prmpn2 = (TextView)findViewById(R.id.APK3_perempuan2);
        APK3_lakpem2 = (TextView)findViewById(R.id.APK3_lakpem2);


        APK1_tahun3 = (TextView)findViewById(R.id.APK1_tahunNew1);
        APK1_laki3 = (TextView)findViewById(R.id.APK1_lakiNew1);
        APK1_prmpn3 = (TextView)findViewById(R.id.APK1_perempuanNew1);
        APK1_lakpem3 = (TextView)findViewById(R.id.APK1_lakpemNew1);

        APK1_tahun4 = (TextView)findViewById(R.id.APK1_tahunNew2);
        APK1_laki4 = (TextView)findViewById(R.id.APK1_lakiNew2);
        APK1_prmpn4 = (TextView)findViewById(R.id.APK1_perempuanNew2);
        APK1_lakpem4 = (TextView)findViewById(R.id.APK1_lakpemNew2);

        APK1_tahun5 = (TextView)findViewById(R.id.APK1_tahunNew3);
        APK1_laki5 = (TextView)findViewById(R.id.APK1_lakiNew3);
        APK1_prmpn5 = (TextView)findViewById(R.id.APK1_perempuanNew3);
        APK1_lakpem5 = (TextView)findViewById(R.id.APK1_lakpemNew3);

        APK1_tahun6 = (TextView)findViewById(R.id.APK1_tahunNew4);
        APK1_laki6 = (TextView)findViewById(R.id.APK1_lakiNew4);
        APK1_prmpn6 = (TextView)findViewById(R.id.APK1_perempuanNew4);
        APK1_lakpem6 = (TextView)findViewById(R.id.APK1_lakpemNew4);

        APK1_tahun7 = (TextView)findViewById(R.id.APK1_tahunNew5);
        APK1_laki7 = (TextView)findViewById(R.id.APK1_lakiNew5);
        APK1_prmpn7 = (TextView)findViewById(R.id.APK1_perempuanNew5);
        APK1_lakpem7 = (TextView)findViewById(R.id.APK1_lakpemNew5);

        APK1_tahun8 = (TextView)findViewById(R.id.APK1_tahunNew6);
        APK1_laki8 = (TextView)findViewById(R.id.APK1_lakiNew6);
        APK1_prmpn8 = (TextView)findViewById(R.id.APK1_perempuanNew6);
        APK1_lakpem8 = (TextView)findViewById(R.id.APK1_lakpemNew6);


        APK2_tahun3 = (TextView)findViewById(R.id.APK2_tahunNew1);
        APK2_laki3 = (TextView)findViewById(R.id.APK2_lakiNew1);
        APK2_prmpn3 = (TextView)findViewById(R.id.APK2_perempuanNew1);
        APK2_lakpem3 = (TextView)findViewById(R.id.APK2_lakpemNew1);

        APK2_tahun4 = (TextView)findViewById(R.id.APK2_tahunNew2);
        APK2_laki4 = (TextView)findViewById(R.id.APK2_lakiNew2);
        APK2_prmpn4 = (TextView)findViewById(R.id.APK2_perempuanNew2);
        APK2_lakpem4 = (TextView)findViewById(R.id.APK2_lakpemNew2);

        APK2_tahun5 = (TextView)findViewById(R.id.APK2_tahunNew3);
        APK2_laki5 = (TextView)findViewById(R.id.APK2_lakiNew3);
        APK2_prmpn5 = (TextView)findViewById(R.id.APK2_perempuanNew3);
        APK2_lakpem5 = (TextView)findViewById(R.id.APK2_lakpemNew3);

        APK2_tahun6 = (TextView)findViewById(R.id.APK2_tahunNew4);
        APK2_laki6 = (TextView)findViewById(R.id.APK2_lakiNew4);
        APK2_prmpn6 = (TextView)findViewById(R.id.APK2_perempuanNew4);
        APK2_lakpem6 = (TextView)findViewById(R.id.APK2_lakpemNew4);

        APK2_tahun7 = (TextView)findViewById(R.id.APK2_tahunNew5);
        APK2_laki7 = (TextView)findViewById(R.id.APK2_lakiNew5);
        APK2_prmpn7 = (TextView)findViewById(R.id.APK2_perempuanNew5);
        APK2_lakpem7 = (TextView)findViewById(R.id.APK2_lakpemNew5);

        APK2_tahun8 = (TextView)findViewById(R.id.APK2_tahunNew6);
        APK2_laki8 = (TextView)findViewById(R.id.APK2_lakiNew6);
        APK2_prmpn8 = (TextView)findViewById(R.id.APK2_perempuanNew6);
        APK2_lakpem8 = (TextView)findViewById(R.id.APK2_lakpemNew6);


        APK3_tahun3 = (TextView)findViewById(R.id.APK3_tahunNew1);
        APK3_laki3 = (TextView)findViewById(R.id.APK3_lakiNew1);
        APK3_prmpn3 = (TextView)findViewById(R.id.APK3_perempuanNew1);
        APK3_lakpem3 = (TextView)findViewById(R.id.APK3_lakpemNew1);

        APK3_tahun4 = (TextView)findViewById(R.id.APK3_tahunNew2);
        APK3_laki4 = (TextView)findViewById(R.id.APK3_lakiNew2);
        APK3_prmpn4 = (TextView)findViewById(R.id.APK3_perempuanNew2);
        APK3_lakpem4 = (TextView)findViewById(R.id.APK3_lakpemNew2);

        APK3_tahun5 = (TextView)findViewById(R.id.APK3_tahunNew3);
        APK3_laki5 = (TextView)findViewById(R.id.APK3_lakiNew3);
        APK3_prmpn5 = (TextView)findViewById(R.id.APK3_perempuanNew3);
        APK3_lakpem5 = (TextView)findViewById(R.id.APK3_lakpemNew3);

        APK3_tahun6 = (TextView)findViewById(R.id.APK3_tahunNew4);
        APK3_laki6 = (TextView)findViewById(R.id.APK3_lakiNew4);
        APK3_prmpn6 = (TextView)findViewById(R.id.APK3_perempuanNew4);
        APK3_lakpem6 = (TextView)findViewById(R.id.APK3_lakpemNew4);

        APK3_tahun7 = (TextView)findViewById(R.id.APK3_tahunNew5);
        APK3_laki7 = (TextView)findViewById(R.id.APK3_lakiNew5);
        APK3_prmpn7 = (TextView)findViewById(R.id.APK3_perempuanNew5);
        APK3_lakpem7 = (TextView)findViewById(R.id.APK3_lakpemNew5);

        APK3_tahun8 = (TextView)findViewById(R.id.APK3_tahunNew6);
        APK3_laki8 = (TextView)findViewById(R.id.APK3_lakiNew6);
        APK3_prmpn8 = (TextView)findViewById(R.id.APK3_perempuanNew6);
        APK3_lakpem8 = (TextView)findViewById(R.id.APK3_lakpemNew6);
        
        


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.apk);
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
        Intent intent = new Intent(ApkActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(ApkActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(ApkActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(ApkActivity.this, SosialActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class) !=null) {

            String key = snapshot.getKey();
            if (key.equals("APK SD")) {

                String apk1 = snapshot.getValue(String.class);
                APK1.setText(apk1);
            }

            if (key.equals("APK_SD_tahun_2019")) {

                String apk2 = snapshot.getValue(String.class);
                APK1_tahun1.setText(apk2);
            }

            if (key.equals("APK_SD_laki_2019")) {

                String apk3 = snapshot.getValue(String.class);
                APK1_laki1.setText(apk3);
            }

            if (key.equals("APK_SD_perempuan_2019")) {

                String apk4 = snapshot.getValue(String.class);
                APK1_prmpn1.setText(apk4);
            }

            if (key.equals("APK_SD_laki_perempuan_2019")) {

                String apk5 = snapshot.getValue(String.class);
                APK1_lakpem1.setText(apk5);
            }




            if (key.equals("APK_SD_tahun_2018")) {

                String apk6 = snapshot.getValue(String.class);
                APK1_tahun2.setText(apk6);
            }

            if (key.equals("APK_SD_laki_2018")) {

                String apk7 = snapshot.getValue(String.class);
                APK1_laki2.setText(apk7);
            }

            if (key.equals("APK_SD_perempuan_2018")) {

                String apk8 = snapshot.getValue(String.class);
                APK1_prmpn2.setText(apk8);
            }

            if (key.equals("APK_SD_laki_perempuan_2018")) {

                String apk9 = snapshot.getValue(String.class);
                APK1_lakpem2.setText(apk9);
            }



            if (key.equals("APK SMP")) {

                String apk10 = snapshot.getValue(String.class);
                APK2.setText(apk10);
            }

            if (key.equals("APK_SMP_tahun_2019")) {

                String apk11 = snapshot.getValue(String.class);
                APK2_tahun1.setText(apk11);
            }

            if (key.equals("APK_SMP_laki_2019")) {

                String apk12 = snapshot.getValue(String.class);
                APK2_laki1.setText(apk12);
            }

            if (key.equals("APK_SMP_perempuan_2019")) {

                String apk13 = snapshot.getValue(String.class);
                APK2_prmpn1.setText(apk13);
            }

            if (key.equals("APK_SMP_laki_perempuan_2019")) {

                String apk14 = snapshot.getValue(String.class);
                APK2_lakpem1.setText(apk14);
            }



            if (key.equals("APK_SMP_tahun_2018")) {

                String apk15 = snapshot.getValue(String.class);
                APK2_tahun2.setText(apk15);
            }

            if (key.equals("APK_SMP_laki_2018")) {

                String apk16 = snapshot.getValue(String.class);
                APK2_laki2.setText(apk16);
            }

            if (key.equals("APK_SMP_perempuan_2018")) {

                String apk17 = snapshot.getValue(String.class);
                APK2_prmpn2.setText(apk17);
            }

            if (key.equals("APK_SMP_laki_perempuan_2018")) {

                String apk18 = snapshot.getValue(String.class);
                APK2_lakpem2.setText(apk18);
            }



            if (key.equals("APK SMA")) {

                String apk19 = snapshot.getValue(String.class);
                APK3.setText(apk19);
            }

            if (key.equals("APK_SMA_tahun_2019")) {

                String apk20 = snapshot.getValue(String.class);
                APK3_tahun1.setText(apk20);
            }

            if (key.equals("APK_SMA_laki_2019")) {

                String apk21 = snapshot.getValue(String.class);
                APK3_laki1.setText(apk21);
            }

            if (key.equals("APK_SMA_perempuan_2019")) {

                String apk22 = snapshot.getValue(String.class);
                APK3_prmpn1.setText(apk22);
            }

            if (key.equals("APK_SMA_laki_perempuan_2019")) {

                String apk23 = snapshot.getValue(String.class);
                APK3_lakpem1.setText(apk23);
            }



            if (key.equals("APK_SMA_tahun_2018")) {

                String apk24 = snapshot.getValue(String.class);
                APK3_tahun2.setText(apk24);
            }

            if (key.equals("APK_SMA_laki_2018")) {

                String apk25 = snapshot.getValue(String.class);
                APK3_laki2.setText(apk25);
            }

            if (key.equals("APK_SMA_perempuan_2018")) {

                String apk26 = snapshot.getValue(String.class);
                APK3_prmpn2.setText(apk26);
            }

            if (key.equals("APK_SMA_laki_perempuan_2018")) {

                String apk27 = snapshot.getValue(String.class);
                APK3_lakpem2.setText(apk27);
            }








            if (key.equals("APK_SD_tahun_2020")) {

                String apk28 = snapshot.getValue(String.class);
                APK1_tahun3.setText(apk28);
            }

            if (key.equals("APK_SD_laki_2020")) {

                String apk29 = snapshot.getValue(String.class);
                APK1_laki3.setText(apk29);
            }

            if (key.equals("APK_SD_perempuan_2020")) {

                String apk30 = snapshot.getValue(String.class);
                APK1_prmpn3.setText(apk30);
            }

            if (key.equals("APK_SD_laki_perempuan_2020")) {

                String apk31 = snapshot.getValue(String.class);
                APK1_lakpem3.setText(apk31);
            }



            if (key.equals("APK_SD_tahun_2021")) {

                String apk32 = snapshot.getValue(String.class);
                APK1_tahun4.setText(apk32);
            }

            if (key.equals("APK_SD_laki_2021")) {

                String apk33 = snapshot.getValue(String.class);
                APK1_laki4.setText(apk33);
            }

            if (key.equals("APK_SD_perempuan_2021")) {

                String apk34 = snapshot.getValue(String.class);
                APK1_prmpn4.setText(apk34);
            }

            if (key.equals("APK_SD_laki_perempuan_2021")) {

                String apk35 = snapshot.getValue(String.class);
                APK1_lakpem4.setText(apk35);
            }



            if (key.equals("APK_SD_tahun_2022")) {

                String apk36 = snapshot.getValue(String.class);
                APK1_tahun5.setText(apk36);
            }

            if (key.equals("APK_SD_laki_2022")) {

                String apk37 = snapshot.getValue(String.class);
                APK1_laki5.setText(apk37);
            }

            if (key.equals("APK_SD_perempuan_2022")) {

                String apk38 = snapshot.getValue(String.class);
                APK1_prmpn5.setText(apk38);
            }

            if (key.equals("APK_SD_laki_perempuan_2022")) {

                String apk39 = snapshot.getValue(String.class);
                APK1_lakpem5.setText(apk39);
            }



            if (key.equals("APK_SD_tahun_2023")) {

                String apk40 = snapshot.getValue(String.class);
                APK1_tahun6.setText(apk40);
            }

            if (key.equals("APK_SD_laki_2023")) {

                String apk41 = snapshot.getValue(String.class);
                APK1_laki6.setText(apk41);
            }

            if (key.equals("APK_SD_perempuan_2023")) {

                String apk42 = snapshot.getValue(String.class);
                APK1_prmpn6.setText(apk42);
            }

            if (key.equals("APK_SD_laki_perempuan_2023")) {

                String apk43 = snapshot.getValue(String.class);
                APK1_lakpem6.setText(apk43);
            }



            if (key.equals("APK_SD_tahun_2024")) {

                String apk44 = snapshot.getValue(String.class);
                APK1_tahun7.setText(apk44);
            }

            if (key.equals("APK_SD_laki_2024")) {

                String apk45 = snapshot.getValue(String.class);
                APK1_laki7.setText(apk45);
            }

            if (key.equals("APK_SD_perempuan_2024")) {

                String apk46 = snapshot.getValue(String.class);
                APK1_prmpn7.setText(apk46);
            }

            if (key.equals("APK_SD_laki_perempuan_2024")) {

                String apk47 = snapshot.getValue(String.class);
                APK1_lakpem7.setText(apk47);
            }



            if (key.equals("APK_SD_tahun_2025")) {

                String apk48 = snapshot.getValue(String.class);
                APK1_tahun8.setText(apk48);
            }

            if (key.equals("APK_SD_laki_2025")) {

                String apk49 = snapshot.getValue(String.class);
                APK1_laki8.setText(apk49);
            }

            if (key.equals("APK_SD_perempuan_2025")) {

                String apk50 = snapshot.getValue(String.class);
                APK1_prmpn8.setText(apk50);
            }

            if (key.equals("APK_SD_laki_perempuan_2025")) {

                String apk51 = snapshot.getValue(String.class);
                APK1_lakpem8.setText(apk51);
            }






            if (key.equals("APK_SMP_tahun_2020")) {

                String apk52 = snapshot.getValue(String.class);
                APK2_tahun3.setText(apk52);
            }

            if (key.equals("APK_SMP_laki_2020")) {

                String apk53 = snapshot.getValue(String.class);
                APK2_laki3.setText(apk53);
            }

            if (key.equals("APK_SMP_perempuan_2020")) {

                String apk54 = snapshot.getValue(String.class);
                APK2_prmpn3.setText(apk54);
            }

            if (key.equals("APK_SMP_laki_perempuan_2020")) {

                String apk55 = snapshot.getValue(String.class);
                APK2_lakpem3.setText(apk55);
            }



            if (key.equals("APK_SMP_tahun_2021")) {

                String apk56 = snapshot.getValue(String.class);
                APK2_tahun4.setText(apk56);
            }

            if (key.equals("APK_SMP_laki_2021")) {

                String apk57 = snapshot.getValue(String.class);
                APK2_laki4.setText(apk57);
            }

            if (key.equals("APK_SMP_perempuan_2021")) {

                String apk58 = snapshot.getValue(String.class);
                APK2_prmpn4.setText(apk58);
            }

            if (key.equals("APK_SMP_laki_perempuan_2021")) {

                String apk59 = snapshot.getValue(String.class);
                APK2_lakpem4.setText(apk59);
            }




            if (key.equals("APK_SMP_tahun_2022")) {

                String apk60 = snapshot.getValue(String.class);
                APK2_tahun5.setText(apk60);
            }

            if (key.equals("APK_SMP_laki_2022")) {

                String apk61 = snapshot.getValue(String.class);
                APK2_laki5.setText(apk61);
            }

            if (key.equals("APK_SMP_perempuan_2022")) {

                String apk62 = snapshot.getValue(String.class);
                APK2_prmpn5.setText(apk62);
            }

            if (key.equals("APK_SMP_laki_perempuan_2022")) {

                String apk63 = snapshot.getValue(String.class);
                APK2_lakpem5.setText(apk63);
            }



            if (key.equals("APK_SMP_tahun_2023")) {

                String apk64 = snapshot.getValue(String.class);
                APK2_tahun6.setText(apk64);
            }

            if (key.equals("APK_SMP_laki_2023")) {

                String apk65 = snapshot.getValue(String.class);
                APK2_laki6.setText(apk65);
            }

            if (key.equals("APK_SMP_perempuan_2023")) {

                String apk66 = snapshot.getValue(String.class);
                APK2_prmpn6.setText(apk66);
            }

            if (key.equals("APK_SMP_laki_perempuan_2023")) {

                String apk67 = snapshot.getValue(String.class);
                APK2_lakpem6.setText(apk67);
            }



            if (key.equals("APK_SMP_tahun_2024")) {

                String apk68 = snapshot.getValue(String.class);
                APK2_tahun7.setText(apk68);
            }

            if (key.equals("APK_SMP_laki_2024")) {

                String apk69 = snapshot.getValue(String.class);
                APK2_laki7.setText(apk69);
            }

            if (key.equals("APK_SMP_perempuan_2024")) {

                String apk70 = snapshot.getValue(String.class);
                APK2_prmpn7.setText(apk70);
            }

            if (key.equals("APK_SMP_laki_perempuan_2024")) {

                String apk71 = snapshot.getValue(String.class);
                APK2_lakpem7.setText(apk71);
            }



            if (key.equals("APK_SMP_tahun_2025")) {

                String apk72 = snapshot.getValue(String.class);
                APK2_tahun8.setText(apk72);
            }

            if (key.equals("APK_SMP_laki_2025")) {

                String apk73 = snapshot.getValue(String.class);
                APK2_laki8.setText(apk73);
            }

            if (key.equals("APK_SMP_perempuan_2025")) {

                String apk74 = snapshot.getValue(String.class);
                APK2_prmpn8.setText(apk74);
            }

            if (key.equals("APK_SMP_laki_perempuan_2025")) {

                String apk75 = snapshot.getValue(String.class);
                APK2_lakpem8.setText(apk75);
            }






            if (key.equals("APK_SMA_tahun_2020")) {

                String apk76 = snapshot.getValue(String.class);
                APK3_tahun3.setText(apk76);
            }

            if (key.equals("APK_SMA_laki_2020")) {

                String apk77 = snapshot.getValue(String.class);
                APK3_laki3.setText(apk77);
            }

            if (key.equals("APK_SMA_perempuan_2020")) {

                String apk78 = snapshot.getValue(String.class);
                APK3_prmpn3.setText(apk78);
            }

            if (key.equals("APK_SMA_laki_perempuan_2020")) {

                String apk79 = snapshot.getValue(String.class);
                APK3_lakpem3.setText(apk79);
            }



            if (key.equals("APK_SMA_tahun_2021")) {

                String apk80 = snapshot.getValue(String.class);
                APK3_tahun4.setText(apk80);
            }

            if (key.equals("APK_SMA_laki_2021")) {

                String apk81 = snapshot.getValue(String.class);
                APK3_laki4.setText(apk81);
            }

            if (key.equals("APK_SMA_perempuan_2021")) {

                String apk82 = snapshot.getValue(String.class);
                APK3_prmpn4.setText(apk82);
            }

            if (key.equals("APK_SMA_laki_perempuan_2021")) {

                String apk83 = snapshot.getValue(String.class);
                APK3_lakpem4.setText(apk83);
            }



            if (key.equals("APK_SMA_tahun_2022")) {

                String apk84 = snapshot.getValue(String.class);
                APK3_tahun5.setText(apk84);
            }

            if (key.equals("APK_SMA_laki_2022")) {

                String apk85 = snapshot.getValue(String.class);
                APK3_laki5.setText(apk85);
            }

            if (key.equals("APK_SMA_perempuan_2022")) {

                String apk86 = snapshot.getValue(String.class);
                APK3_prmpn5.setText(apk86);
            }

            if (key.equals("APK_SMA_laki_perempuan_2022")) {

                String apk87 = snapshot.getValue(String.class);
                APK3_lakpem5.setText(apk87);
            }



            if (key.equals("APK_SMA_tahun_2023")) {

                String apk88 = snapshot.getValue(String.class);
                APK3_tahun6.setText(apk88);
            }

            if (key.equals("APK_SMA_laki_2023")) {

                String apk89 = snapshot.getValue(String.class);
                APK3_laki6.setText(apk89);
            }

            if (key.equals("APK_SMA_perempuan_2023")) {

                String apk90 = snapshot.getValue(String.class);
                APK3_prmpn6.setText(apk90);
            }

            if (key.equals("APK_SMA_laki_perempuan_2023")) {

                String apk91 = snapshot.getValue(String.class);
                APK3_lakpem6.setText(apk91);
            }



            if (key.equals("APK_SMA_tahun_2024")) {

                String apk92 = snapshot.getValue(String.class);
                APK3_tahun7.setText(apk92);
            }

            if (key.equals("APK_SMA_laki_2024")) {

                String apk93 = snapshot.getValue(String.class);
                APK3_laki7.setText(apk93);
            }

            if (key.equals("APK_SMA_perempuan_2024")) {

                String apk94 = snapshot.getValue(String.class);
                APK3_prmpn7.setText(apk94);
            }

            if (key.equals("APK_SMA_laki_perempuan_2024")) {

                String apk95 = snapshot.getValue(String.class);
                APK3_lakpem7.setText(apk95);
            }



            if (key.equals("APK_SMA_tahun_2025")) {

                String apk96 = snapshot.getValue(String.class);
                APK3_tahun8.setText(apk96);
            }

            if (key.equals("APK_SMA_laki_2025")) {

                String apk97 = snapshot.getValue(String.class);
                APK3_laki8.setText(apk97);
            }

            if (key.equals("APK_SMA_perempuan_2025")) {

                String apk98 = snapshot.getValue(String.class);
                APK3_prmpn8.setText(apk98);
            }

            if (key.equals("APK_SMA_laki_perempuan_2025")) {

                String apk99 = snapshot.getValue(String.class);
                APK3_lakpem8.setText(apk99);
            }
        }

    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        APKData1.addValueEventListener(this);
        APKData2.addValueEventListener(this);
        APKData3.addValueEventListener(this);
        APKData4.addValueEventListener(this);
        APKData5.addValueEventListener(this);

        APKData6.addValueEventListener(this);
        APKData7.addValueEventListener(this);
        APKData8.addValueEventListener(this);
        APKData9.addValueEventListener(this);

        APKData10.addValueEventListener(this);
        APKData11.addValueEventListener(this);
        APKData12.addValueEventListener(this);
        APKData13.addValueEventListener(this);
        APKData14.addValueEventListener(this);

        APKData15.addValueEventListener(this);
        APKData16.addValueEventListener(this);
        APKData17.addValueEventListener(this);
        APKData18.addValueEventListener(this);

        APKData19.addValueEventListener(this);
        APKData20.addValueEventListener(this);
        APKData21.addValueEventListener(this);
        APKData22.addValueEventListener(this);
        APKData23.addValueEventListener(this);

        APKData24.addValueEventListener(this);
        APKData25.addValueEventListener(this);
        APKData26.addValueEventListener(this);
        APKData27.addValueEventListener(this);


        APKData28.addValueEventListener(this);
        APKData29.addValueEventListener(this);
        APKData30.addValueEventListener(this);
        APKData31.addValueEventListener(this);

        APKData32.addValueEventListener(this);
        APKData33.addValueEventListener(this);
        APKData34.addValueEventListener(this);
        APKData35.addValueEventListener(this);

        APKData36.addValueEventListener(this);
        APKData37.addValueEventListener(this);
        APKData38.addValueEventListener(this);
        APKData39.addValueEventListener(this);

        APKData40.addValueEventListener(this);
        APKData41.addValueEventListener(this);
        APKData42.addValueEventListener(this);
        APKData43.addValueEventListener(this);

        APKData44.addValueEventListener(this);
        APKData45.addValueEventListener(this);
        APKData46.addValueEventListener(this);
        APKData47.addValueEventListener(this);

        APKData48.addValueEventListener(this);
        APKData49.addValueEventListener(this);
        APKData50.addValueEventListener(this);
        APKData51.addValueEventListener(this);


        APKData52.addValueEventListener(this);
        APKData53.addValueEventListener(this);
        APKData54.addValueEventListener(this);
        APKData55.addValueEventListener(this);

        APKData56.addValueEventListener(this);
        APKData57.addValueEventListener(this);
        APKData58.addValueEventListener(this);
        APKData59.addValueEventListener(this);

        APKData60.addValueEventListener(this);
        APKData61.addValueEventListener(this);
        APKData62.addValueEventListener(this);
        APKData63.addValueEventListener(this);

        APKData64.addValueEventListener(this);
        APKData65.addValueEventListener(this);
        APKData66.addValueEventListener(this);
        APKData67.addValueEventListener(this);

        APKData68.addValueEventListener(this);
        APKData69.addValueEventListener(this);
        APKData70.addValueEventListener(this);
        APKData71.addValueEventListener(this);

        APKData72.addValueEventListener(this);
        APKData73.addValueEventListener(this);
        APKData74.addValueEventListener(this);
        APKData75.addValueEventListener(this);


        APKData76.addValueEventListener(this);
        APKData77.addValueEventListener(this);
        APKData78.addValueEventListener(this);
        APKData79.addValueEventListener(this);

        APKData80.addValueEventListener(this);
        APKData81.addValueEventListener(this);
        APKData82.addValueEventListener(this);
        APKData83.addValueEventListener(this);

        APKData84.addValueEventListener(this);
        APKData85.addValueEventListener(this);
        APKData86.addValueEventListener(this);
        APKData87.addValueEventListener(this);

        APKData88.addValueEventListener(this);
        APKData89.addValueEventListener(this);
        APKData90.addValueEventListener(this);
        APKData91.addValueEventListener(this);

        APKData92.addValueEventListener(this);
        APKData93.addValueEventListener(this);
        APKData94.addValueEventListener(this);
        APKData95.addValueEventListener(this);

        APKData96.addValueEventListener(this);
        APKData97.addValueEventListener(this);
        APKData98.addValueEventListener(this);
        APKData99.addValueEventListener(this);
    }

}