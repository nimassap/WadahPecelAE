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

public class IpmActivity extends AppCompatActivity implements ValueEventListener {

    TextView IPM_tahun1, IPM_tahun2, IPM_tahun3, IPM_tahun4, IPM_tahun5, IPM_tahun6, IPM_tahun7, IPM_tahun8, IPM_tahun9, IPM_tahun10, IPM_tahun11,
            IPM_ipm1, IPM_ipm2, IPM_ipm3, IPM_ipm4, IPM_ipm5, IPM_ipm6, IPM_ipm7, IPM_ipm8, IPM_ipm9, IPM_ipm10, IPM_ipm11,
            IPM_ahh1, IPM_ahh2, IPM_ahh3, IPM_ahh4, IPM_ahh5, IPM_ahh6, IPM_ahh7, IPM_ahh8, IPM_ahh9, IPM_ahh10, IPM_ahh11,
            IPM_hls1, IPM_hls2, IPM_hls3, IPM_hls4, IPM_hls5, IPM_hls6, IPM_hls7, IPM_hls8, IPM_hls9, IPM_hls10, IPM_hls11,
            IPM_rls1, IPM_rls2, IPM_rls3, IPM_rls4, IPM_rls5, IPM_rls6, IPM_rls7, IPM_rls8, IPM_rls9, IPM_rls10, IPM_rls11,
            IPM_pengeluaran1, IPM_pengeluaran2, IPM_pengeluaran3, IPM_pengeluaran4, IPM_pengeluaran5, IPM_pengeluaran6, IPM_pengeluaran7, IPM_pengeluaran8, IPM_pengeluaran9, IPM_pengeluaran10, IPM_pengeluaran11,
            IPM_peringkat1, IPM_peringkat2, IPM_peringkat3, IPM_peringkat4, IPM_peringkat5, IPM_peringkat6, IPM_peringkat7, IPM_peringkat8, IPM_peringkat9, IPM_peringkat10, IPM_peringkat11;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference IPMData1 = databaseReference.child("IPM_tahun_2020");
    private DatabaseReference IPMData2 = databaseReference.child("IPM_ipm_2020");
    private DatabaseReference IPMData3 = databaseReference.child("IPM_ahh_2020");
    private DatabaseReference IPMData4 = databaseReference.child("IPM_hls_2020");
    private DatabaseReference IPMData5 = databaseReference.child("IPM_rls_2020");
    private DatabaseReference IPMData6 = databaseReference.child("IPM_pengeluaran_2020");
    private DatabaseReference IPMData7 = databaseReference.child("IPM_peringkat_2020");

    private DatabaseReference IPMData8 = databaseReference.child("IPM_tahun_2019");
    private DatabaseReference IPMData9 = databaseReference.child("IPM_ipm_2019");
    private DatabaseReference IPMData10 = databaseReference.child("IPM_ahh_2019");
    private DatabaseReference IPMData11 = databaseReference.child("IPM_hls_2019");
    private DatabaseReference IPMData12 = databaseReference.child("IPM_rls_2019");
    private DatabaseReference IPMData13 = databaseReference.child("IPM_pengeluaran_2019");
    private DatabaseReference IPMData14 = databaseReference.child("IPM_peringkat_2019");

    private DatabaseReference IPMData15 = databaseReference.child("IPM_tahun_2018");
    private DatabaseReference IPMData16 = databaseReference.child("IPM_ipm_2018");
    private DatabaseReference IPMData17 = databaseReference.child("IPM_ahh_2018");
    private DatabaseReference IPMData18 = databaseReference.child("IPM_hls_2018");
    private DatabaseReference IPMData19 = databaseReference.child("IPM_rls_2018");
    private DatabaseReference IPMData20 = databaseReference.child("IPM_pengeluaran_2018");
    private DatabaseReference IPMData21 = databaseReference.child("IPM_peringkat_2018");

    private DatabaseReference IPMData22 = databaseReference.child("IPM_tahun_2017");
    private DatabaseReference IPMData23 = databaseReference.child("IPM_ipm_2017");
    private DatabaseReference IPMData24 = databaseReference.child("IPM_ahh_2017");
    private DatabaseReference IPMData25 = databaseReference.child("IPM_hls_2017");
    private DatabaseReference IPMData26 = databaseReference.child("IPM_rls_2017");
    private DatabaseReference IPMData27 = databaseReference.child("IPM_pengeluaran_2017");
    private DatabaseReference IPMData28 = databaseReference.child("IPM_peringkat_2017");

    private DatabaseReference IPMData29 = databaseReference.child("IPM_tahun_2016");
    private DatabaseReference IPMData30 = databaseReference.child("IPM_ipm_2016");
    private DatabaseReference IPMData31 = databaseReference.child("IPM_ahh_2016");
    private DatabaseReference IPMData32 = databaseReference.child("IPM_hls_2016");
    private DatabaseReference IPMData33 = databaseReference.child("IPM_rls_2016");
    private DatabaseReference IPMData34 = databaseReference.child("IPM_pengeluaran_2016");
    private DatabaseReference IPMData35 = databaseReference.child("IPM_peringkat_2016");

    private DatabaseReference IPMData36 = databaseReference.child("IPM_tahun_2015");
    private DatabaseReference IPMData37 = databaseReference.child("IPM_ipm_2015");
    private DatabaseReference IPMData38 = databaseReference.child("IPM_ahh_2015");
    private DatabaseReference IPMData39 = databaseReference.child("IPM_hls_2015");
    private DatabaseReference IPMData40 = databaseReference.child("IPM_rls_2015");
    private DatabaseReference IPMData41 = databaseReference.child("IPM_pengeluaran_2015");
    private DatabaseReference IPMData42 = databaseReference.child("IPM_peringkat_2015");

    private DatabaseReference IPMData43 = databaseReference.child("IPM_tahun_2021");
    private DatabaseReference IPMData44 = databaseReference.child("IPM_ipm_2021");
    private DatabaseReference IPMData45 = databaseReference.child("IPM_ahh_2021");
    private DatabaseReference IPMData46 = databaseReference.child("IPM_hls_2021");
    private DatabaseReference IPMData47 = databaseReference.child("IPM_rls_2021");
    private DatabaseReference IPMData48 = databaseReference.child("IPM_pengeluaran_2021");
    private DatabaseReference IPMData49 = databaseReference.child("IPM_peringkat_2021");

    private DatabaseReference IPMData50 = databaseReference.child("IPM_tahun_2022");
    private DatabaseReference IPMData51 = databaseReference.child("IPM_ipm_2022");
    private DatabaseReference IPMData52 = databaseReference.child("IPM_ahh_2022");
    private DatabaseReference IPMData53 = databaseReference.child("IPM_hls_2022");
    private DatabaseReference IPMData54 = databaseReference.child("IPM_rls_2022");
    private DatabaseReference IPMData55 = databaseReference.child("IPM_pengeluaran_2022");
    private DatabaseReference IPMData56 = databaseReference.child("IPM_peringkat_2022");

    private DatabaseReference IPMData57 = databaseReference.child("IPM_tahun_2023");
    private DatabaseReference IPMData58 = databaseReference.child("IPM_ipm_2023");
    private DatabaseReference IPMData59 = databaseReference.child("IPM_ahh_2023");
    private DatabaseReference IPMData60 = databaseReference.child("IPM_hls_2023");
    private DatabaseReference IPMData61 = databaseReference.child("IPM_rls_2023");
    private DatabaseReference IPMData62 = databaseReference.child("IPM_pengeluaran_2023");
    private DatabaseReference IPMData63 = databaseReference.child("IPM_peringkat_2023");

    private DatabaseReference IPMData64 = databaseReference.child("IPM_tahun_2024");
    private DatabaseReference IPMData65 = databaseReference.child("IPM_ipm_2024");
    private DatabaseReference IPMData66 = databaseReference.child("IPM_ahh_2024");
    private DatabaseReference IPMData67 = databaseReference.child("IPM_hls_2024");
    private DatabaseReference IPMData68 = databaseReference.child("IPM_rls_2024");
    private DatabaseReference IPMData69 = databaseReference.child("IPM_pengeluaran_2024");
    private DatabaseReference IPMData70 = databaseReference.child("IPM_peringkat_2024");

    private DatabaseReference IPMData71 = databaseReference.child("IPM_tahun_2025");
    private DatabaseReference IPMData72 = databaseReference.child("IPM_ipm_2025");
    private DatabaseReference IPMData73 = databaseReference.child("IPM_ahh_2025");
    private DatabaseReference IPMData74 = databaseReference.child("IPM_hls_2025");
    private DatabaseReference IPMData75 = databaseReference.child("IPM_rls_2025");
    private DatabaseReference IPMData76 = databaseReference.child("IPM_pengeluaran_2025");
    private DatabaseReference IPMData77 = databaseReference.child("IPM_peringkat_2025");



    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipm);

        IPM_tahun1 = (TextView)findViewById(R.id.ipm_tahun1);
        IPM_ipm1 = (TextView)findViewById(R.id.ipm_ipm1);
        IPM_ahh1 = (TextView)findViewById(R.id.ipm_ahh1);
        IPM_hls1 = (TextView)findViewById(R.id.ipm_hls1);
        IPM_rls1 = (TextView)findViewById(R.id.ipm_rls1);
        IPM_pengeluaran1 = (TextView)findViewById(R.id.ipm_pengeluaran1);
        IPM_peringkat1 = (TextView)findViewById(R.id.ipm_peringkat1);

        IPM_tahun2 = (TextView)findViewById(R.id.ipm_tahun2);
        IPM_ipm2 = (TextView)findViewById(R.id.ipm_ipm2);
        IPM_ahh2 = (TextView)findViewById(R.id.ipm_ahh2);
        IPM_hls2 = (TextView)findViewById(R.id.ipm_hls2);
        IPM_rls2 = (TextView)findViewById(R.id.ipm_rls2);
        IPM_pengeluaran2 = (TextView)findViewById(R.id.ipm_pengeluaran2);
        IPM_peringkat2 = (TextView)findViewById(R.id.ipm_peringkat2);

        IPM_tahun3 = (TextView)findViewById(R.id.ipm_tahun3);
        IPM_ipm3 = (TextView)findViewById(R.id.ipm_ipm3);
        IPM_ahh3 = (TextView)findViewById(R.id.ipm_ahh3);
        IPM_hls3 = (TextView)findViewById(R.id.ipm_hls3);
        IPM_rls3 = (TextView)findViewById(R.id.ipm_rls3);
        IPM_pengeluaran3 = (TextView)findViewById(R.id.ipm_pengeluaran3);
        IPM_peringkat3 = (TextView)findViewById(R.id.ipm_peringkat3);

        IPM_tahun4 = (TextView)findViewById(R.id.ipm_tahun4);
        IPM_ipm4 = (TextView)findViewById(R.id.ipm_ipm4);
        IPM_ahh4 = (TextView)findViewById(R.id.ipm_ahh4);
        IPM_hls4 = (TextView)findViewById(R.id.ipm_hls4);
        IPM_rls4 = (TextView)findViewById(R.id.ipm_rls4);
        IPM_pengeluaran4 = (TextView)findViewById(R.id.ipm_pengeluaran4);
        IPM_peringkat4 = (TextView)findViewById(R.id.ipm_peringkat4);

        IPM_tahun5 = (TextView)findViewById(R.id.ipm_tahun5);
        IPM_ipm5 = (TextView)findViewById(R.id.ipm_ipm5);
        IPM_ahh5 = (TextView)findViewById(R.id.ipm_ahh5);
        IPM_hls5 = (TextView)findViewById(R.id.ipm_hls5);
        IPM_rls5 = (TextView)findViewById(R.id.ipm_rls5);
        IPM_pengeluaran5 = (TextView)findViewById(R.id.ipm_pengeluaran5);
        IPM_peringkat5 = (TextView)findViewById(R.id.ipm_peringkat5);

        IPM_tahun6 = (TextView)findViewById(R.id.ipm_tahun6);
        IPM_ipm6 = (TextView)findViewById(R.id.ipm_ipm6);
        IPM_ahh6 = (TextView)findViewById(R.id.ipm_ahh6);
        IPM_hls6 = (TextView)findViewById(R.id.ipm_hls6);
        IPM_rls6 = (TextView)findViewById(R.id.ipm_rls6);
        IPM_pengeluaran6 = (TextView)findViewById(R.id.ipm_pengeluaran6);
        IPM_peringkat6 = (TextView)findViewById(R.id.ipm_peringkat6);

        IPM_tahun7 = (TextView)findViewById(R.id.ipm_tahunNew1);
        IPM_ipm7 = (TextView)findViewById(R.id.ipm_ipmNew1);
        IPM_ahh7 = (TextView)findViewById(R.id.ipm_ahhNew1);
        IPM_hls7 = (TextView)findViewById(R.id.ipm_hlsNew1);
        IPM_rls7 = (TextView)findViewById(R.id.ipm_rlsNew1);
        IPM_pengeluaran7 = (TextView)findViewById(R.id.ipm_pengeluaranNew1);
        IPM_peringkat7 = (TextView)findViewById(R.id.ipm_peringkatNew1);

        IPM_tahun8 = (TextView)findViewById(R.id.ipm_tahunNew2);
        IPM_ipm8 = (TextView)findViewById(R.id.ipm_ipmNew2);
        IPM_ahh8 = (TextView)findViewById(R.id.ipm_ahhNew2);
        IPM_hls8 = (TextView)findViewById(R.id.ipm_hlsNew2);
        IPM_rls8 = (TextView)findViewById(R.id.ipm_rlsNew2);
        IPM_pengeluaran8 = (TextView)findViewById(R.id.ipm_pengeluaranNew2);
        IPM_peringkat8 = (TextView)findViewById(R.id.ipm_peringkatNew2);

        IPM_tahun9 = (TextView)findViewById(R.id.ipm_tahunNew3);
        IPM_ipm9 = (TextView)findViewById(R.id.ipm_ipmNew3);
        IPM_ahh9 = (TextView)findViewById(R.id.ipm_ahhNew3);
        IPM_hls9 = (TextView)findViewById(R.id.ipm_hlsNew3);
        IPM_rls9 = (TextView)findViewById(R.id.ipm_rlsNew3);
        IPM_pengeluaran9 = (TextView)findViewById(R.id.ipm_pengeluaranNew3);
        IPM_peringkat9 = (TextView)findViewById(R.id.ipm_peringkatNew3);

        IPM_tahun10 = (TextView)findViewById(R.id.ipm_tahunNew4);
        IPM_ipm10 = (TextView)findViewById(R.id.ipm_ipmNew4);
        IPM_ahh10 = (TextView)findViewById(R.id.ipm_ahhNew4);
        IPM_hls10 = (TextView)findViewById(R.id.ipm_hlsNew4);
        IPM_rls10 = (TextView)findViewById(R.id.ipm_rlsNew4);
        IPM_pengeluaran10 = (TextView)findViewById(R.id.ipm_pengeluaranNew4);
        IPM_peringkat10 = (TextView)findViewById(R.id.ipm_peringkatNew4);

        IPM_tahun11 = (TextView)findViewById(R.id.ipm_tahunNew5);
        IPM_ipm11 = (TextView)findViewById(R.id.ipm_ipmNew5);
        IPM_ahh11 = (TextView)findViewById(R.id.ipm_ahhNew5);
        IPM_hls11 = (TextView)findViewById(R.id.ipm_hlsNew5);
        IPM_rls11 = (TextView)findViewById(R.id.ipm_rlsNew5);
        IPM_pengeluaran11 = (TextView)findViewById(R.id.ipm_pengeluaranNew5);
        IPM_peringkat11 = (TextView)findViewById(R.id.ipm_peringkatNew5);



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.ipm);
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
        Intent intent = new Intent(IpmActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(IpmActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(IpmActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }


    public void back(View view) {
        Intent intent = new Intent(IpmActivity.this, EkonomiActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class) !=null) {

            String key = snapshot.getKey();
            if (key.equals("IPM_tahun_2020")) {

                String IPM1 = snapshot.getValue(String.class);
                IPM_tahun1.setText(IPM1);
            }

            if (key.equals("IPM_ipm_2020")) {

                String IPM2 = snapshot.getValue(String.class);
                IPM_ipm1.setText(IPM2);
            }

            if (key.equals("IPM_ahh_2020")) {

                String IPM3 = snapshot.getValue(String.class);
                IPM_ahh1.setText(IPM3);
            }

            if (key.equals("IPM_hls_2020")) {

                String IPM4 = snapshot.getValue(String.class);
                IPM_hls1.setText(IPM4);
            }

            if (key.equals("IPM_rls_2020")) {

                String IPM5 = snapshot.getValue(String.class);
                IPM_rls1.setText(IPM5);
            }

            if (key.equals("IPM_pengeluaran_2020")) {

                String IPM6 = snapshot.getValue(String.class);
                IPM_pengeluaran1.setText(IPM6);
            }

            if (key.equals("IPM_peringkat_2020")) {

                String IPM7 = snapshot.getValue(String.class);
                IPM_peringkat1.setText(IPM7);
            }


            if (key.equals("IPM_tahun_2019")) {

                String IPM8 = snapshot.getValue(String.class);
                IPM_tahun2.setText(IPM8);
            }

            if (key.equals("IPM_ipm_2019")) {

                String IPM9 = snapshot.getValue(String.class);
                IPM_ipm2.setText(IPM9);
            }

            if (key.equals("IPM_ahh_2019")) {

                String IPM10 = snapshot.getValue(String.class);
                IPM_ahh2.setText(IPM10);
            }

            if (key.equals("IPM_hls_2019")) {

                String IPM11 = snapshot.getValue(String.class);
                IPM_hls2.setText(IPM11);
            }

            if (key.equals("IPM_rls_2019")) {

                String IPM12 = snapshot.getValue(String.class);
                IPM_rls2.setText(IPM12);
            }

            if (key.equals("IPM_pengeluaran_2019")) {

                String IPM13 = snapshot.getValue(String.class);
                IPM_pengeluaran2.setText(IPM13);
            }

            if (key.equals("IPM_peringkat_2019")) {

                String IPM14 = snapshot.getValue(String.class);
                IPM_peringkat2.setText(IPM14);
            }


            if (key.equals("IPM_tahun_2018")) {

                String IPM15 = snapshot.getValue(String.class);
                IPM_tahun3.setText(IPM15);
            }

            if (key.equals("IPM_ipm_2018")) {

                String IPM16 = snapshot.getValue(String.class);
                IPM_ipm3.setText(IPM16);
            }

            if (key.equals("IPM_ahh_2018")) {

                String IPM17 = snapshot.getValue(String.class);
                IPM_ahh3.setText(IPM17);
            }

            if (key.equals("IPM_hls_2018")) {

                String IPM18 = snapshot.getValue(String.class);
                IPM_hls3.setText(IPM18);
            }

            if (key.equals("IPM_rls_2018")) {

                String IPM19 = snapshot.getValue(String.class);
                IPM_rls3.setText(IPM19);
            }

            if (key.equals("IPM_pengeluaran_2018")) {

                String IPM20 = snapshot.getValue(String.class);
                IPM_pengeluaran3.setText(IPM20);
            }

            if (key.equals("IPM_peringkat_2018")) {

                String IPM21 = snapshot.getValue(String.class);
                IPM_peringkat3.setText(IPM21);
            }


            if (key.equals("IPM_tahun_2017")) {

                String IPM22 = snapshot.getValue(String.class);
                IPM_tahun4.setText(IPM22);
            }

            if (key.equals("IPM_ipm_2017")) {

                String IPM23 = snapshot.getValue(String.class);
                IPM_ipm4.setText(IPM23);
            }

            if (key.equals("IPM_ahh_2017")) {

                String IPM24 = snapshot.getValue(String.class);
                IPM_ahh4.setText(IPM24);
            }

            if (key.equals("IPM_hls_2017")) {

                String IPM25 = snapshot.getValue(String.class);
                IPM_hls4.setText(IPM25);
            }

            if (key.equals("IPM_rls_2017")) {

                String IPM26 = snapshot.getValue(String.class);
                IPM_rls4.setText(IPM26);
            }

            if (key.equals("IPM_pengeluaran_2017")) {

                String IPM27 = snapshot.getValue(String.class);
                IPM_pengeluaran4.setText(IPM27);
            }

            if (key.equals("IPM_peringkat_2017")) {

                String IPM28 = snapshot.getValue(String.class);
                IPM_peringkat4.setText(IPM28);
            }


            if (key.equals("IPM_tahun_2016")) {

                String IPM29 = snapshot.getValue(String.class);
                IPM_tahun5.setText(IPM29);
            }

            if (key.equals("IPM_ipm_2016")) {

                String IPM30 = snapshot.getValue(String.class);
                IPM_ipm5.setText(IPM30);
            }

            if (key.equals("IPM_ahh_2016")) {

                String IPM31 = snapshot.getValue(String.class);
                IPM_ahh5.setText(IPM31);
            }

            if (key.equals("IPM_hls_2016")) {

                String IPM32 = snapshot.getValue(String.class);
                IPM_hls5.setText(IPM32);
            }

            if (key.equals("IPM_rls_2016")) {

                String IPM33 = snapshot.getValue(String.class);
                IPM_rls5.setText(IPM33);
            }

            if (key.equals("IPM_pengeluaran_2016")) {

                String IPM34 = snapshot.getValue(String.class);
                IPM_pengeluaran5.setText(IPM34);
            }

            if (key.equals("IPM_peringkat_2016")) {

                String IPM35 = snapshot.getValue(String.class);
                IPM_peringkat5.setText(IPM35);
            }


            if (key.equals("IPM_tahun_2015")) {

                String IPM36 = snapshot.getValue(String.class);
                IPM_tahun6.setText(IPM36);
            }

            if (key.equals("IPM_ipm_2015")) {

                String IPM37 = snapshot.getValue(String.class);
                IPM_ipm6.setText(IPM37);
            }

            if (key.equals("IPM_ahh_2015")) {

                String IPM38 = snapshot.getValue(String.class);
                IPM_ahh6.setText(IPM38);
            }

            if (key.equals("IPM_hls_2015")) {

                String IPM39 = snapshot.getValue(String.class);
                IPM_hls6.setText(IPM39);
            }

            if (key.equals("IPM_rls_2015")) {

                String IPM40 = snapshot.getValue(String.class);
                IPM_rls6.setText(IPM40);
            }

            if (key.equals("IPM_pengeluaran_2015")) {

                String IPM41 = snapshot.getValue(String.class);
                IPM_pengeluaran6.setText(IPM41);
            }

            if (key.equals("IPM_peringkat_2015")) {

                String IPM42 = snapshot.getValue(String.class);
                IPM_peringkat6.setText(IPM42);
            }



            if (key.equals("IPM_tahun_2021")) {

                String IPM43 = snapshot.getValue(String.class);
                IPM_tahun7.setText(IPM43);
            }

            if (key.equals("IPM_ipm_2021")) {

                String IPM44 = snapshot.getValue(String.class);
                IPM_ipm7.setText(IPM44);
            }

            if (key.equals("IPM_ahh_2021")) {

                String IPM45 = snapshot.getValue(String.class);
                IPM_ahh7.setText(IPM45);
            }

            if (key.equals("IPM_hls_2021")) {

                String IPM46 = snapshot.getValue(String.class);
                IPM_hls7.setText(IPM46);
            }

            if (key.equals("IPM_rls_2021")) {

                String IPM47 = snapshot.getValue(String.class);
                IPM_rls7.setText(IPM47);
            }

            if (key.equals("IPM_pengeluaran_2021")) {

                String IPM48 = snapshot.getValue(String.class);
                IPM_pengeluaran7.setText(IPM48);
            }

            if (key.equals("IPM_peringkat_2021")) {

                String IPM49 = snapshot.getValue(String.class);
                IPM_peringkat7.setText(IPM49);
            }



            if (key.equals("IPM_tahun_2022")) {

                String IPM50 = snapshot.getValue(String.class);
                IPM_tahun8.setText(IPM50);
            }

            if (key.equals("IPM_ipm_2022")) {

                String IPM51 = snapshot.getValue(String.class);
                IPM_ipm8.setText(IPM51);
            }

            if (key.equals("IPM_ahh_2022")) {

                String IPM52 = snapshot.getValue(String.class);
                IPM_ahh8.setText(IPM52);
            }

            if (key.equals("IPM_hls_2022")) {

                String IPM53 = snapshot.getValue(String.class);
                IPM_hls8.setText(IPM53);
            }

            if (key.equals("IPM_rls_2022")) {

                String IPM54 = snapshot.getValue(String.class);
                IPM_rls8.setText(IPM54);
            }

            if (key.equals("IPM_pengeluaran_2022")) {

                String IPM55 = snapshot.getValue(String.class);
                IPM_pengeluaran8.setText(IPM55);
            }

            if (key.equals("IPM_peringkat_2022")) {

                String IPM56 = snapshot.getValue(String.class);
                IPM_peringkat8.setText(IPM56);
            }




            if (key.equals("IPM_tahun_2023")) {

                String IPM57 = snapshot.getValue(String.class);
                IPM_tahun9.setText(IPM57);
            }

            if (key.equals("IPM_ipm_2023")) {

                String IPM58 = snapshot.getValue(String.class);
                IPM_ipm9.setText(IPM58);
            }

            if (key.equals("IPM_ahh_2023")) {

                String IPM59 = snapshot.getValue(String.class);
                IPM_ahh9.setText(IPM59);
            }

            if (key.equals("IPM_hls_2023")) {

                String IPM60 = snapshot.getValue(String.class);
                IPM_hls9.setText(IPM60);
            }

            if (key.equals("IPM_rls_2023")) {

                String IPM61 = snapshot.getValue(String.class);
                IPM_rls9.setText(IPM61);
            }

            if (key.equals("IPM_pengeluaran_2023")) {

                String IPM62 = snapshot.getValue(String.class);
                IPM_pengeluaran9.setText(IPM62);
            }

            if (key.equals("IPM_peringkat_2023")) {

                String IPM63 = snapshot.getValue(String.class);
                IPM_peringkat9.setText(IPM63);
            }




            if (key.equals("IPM_tahun_2024")) {

                String IPM64 = snapshot.getValue(String.class);
                IPM_tahun10.setText(IPM64);
            }

            if (key.equals("IPM_ipm_2024")) {

                String IPM65 = snapshot.getValue(String.class);
                IPM_ipm10.setText(IPM65);
            }

            if (key.equals("IPM_ahh_2024")) {

                String IPM66 = snapshot.getValue(String.class);
                IPM_ahh10.setText(IPM66);
            }

            if (key.equals("IPM_hls_2024")) {

                String IPM67 = snapshot.getValue(String.class);
                IPM_hls10.setText(IPM67);
            }

            if (key.equals("IPM_rls_2024")) {

                String IPM68 = snapshot.getValue(String.class);
                IPM_rls10.setText(IPM68);
            }

            if (key.equals("IPM_pengeluaran_2024")) {

                String IPM69 = snapshot.getValue(String.class);
                IPM_pengeluaran10.setText(IPM69);
            }

            if (key.equals("IPM_peringkat_2024")) {

                String IPM70 = snapshot.getValue(String.class);
                IPM_peringkat10.setText(IPM70);
            }




            if (key.equals("IPM_tahun_2025")) {

                String IPM71 = snapshot.getValue(String.class);
                IPM_tahun11.setText(IPM71);
            }

            if (key.equals("IPM_ipm_2025")) {

                String IPM72 = snapshot.getValue(String.class);
                IPM_ipm11.setText(IPM72);
            }

            if (key.equals("IPM_ahh_2025")) {

                String IPM73 = snapshot.getValue(String.class);
                IPM_ahh11.setText(IPM73);
            }

            if (key.equals("IPM_hls_2025")) {

                String IPM74 = snapshot.getValue(String.class);
                IPM_hls11.setText(IPM74);
            }

            if (key.equals("IPM_rls_2025")) {

                String IPM75 = snapshot.getValue(String.class);
                IPM_rls11.setText(IPM75);
            }

            if (key.equals("IPM_pengeluaran_2025")) {

                String IPM76 = snapshot.getValue(String.class);
                IPM_pengeluaran11.setText(IPM76);
            }

            if (key.equals("IPM_peringkat_2025")) {

                String IPM77 = snapshot.getValue(String.class);
                IPM_peringkat11.setText(IPM77);
            }
        }
        
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        IPMData1.addValueEventListener(this);
        IPMData2.addValueEventListener(this);
        IPMData3.addValueEventListener(this);
        IPMData4.addValueEventListener(this);

        IPMData5.addValueEventListener(this);
        IPMData6.addValueEventListener(this);
        IPMData7.addValueEventListener(this);
        IPMData8.addValueEventListener(this);

        IPMData9.addValueEventListener(this);
        IPMData10.addValueEventListener(this);
        IPMData11.addValueEventListener(this);
        IPMData12.addValueEventListener(this);

        IPMData13.addValueEventListener(this);
        IPMData14.addValueEventListener(this);
        IPMData15.addValueEventListener(this);
        IPMData16.addValueEventListener(this);

        IPMData17.addValueEventListener(this);
        IPMData18.addValueEventListener(this);
        IPMData19.addValueEventListener(this);
        IPMData20.addValueEventListener(this);

        IPMData21.addValueEventListener(this);
        IPMData22.addValueEventListener(this);
        IPMData23.addValueEventListener(this);
        IPMData24.addValueEventListener(this);

        IPMData25.addValueEventListener(this);
        IPMData26.addValueEventListener(this);
        IPMData27.addValueEventListener(this);
        IPMData28.addValueEventListener(this);
        IPMData29.addValueEventListener(this);
        IPMData30.addValueEventListener(this);
        IPMData31.addValueEventListener(this);
        IPMData32.addValueEventListener(this);
        IPMData33.addValueEventListener(this);
        IPMData34.addValueEventListener(this);
        IPMData35.addValueEventListener(this);
        IPMData36.addValueEventListener(this);
        IPMData37.addValueEventListener(this);
        IPMData38.addValueEventListener(this);
        IPMData39.addValueEventListener(this);
        IPMData40.addValueEventListener(this);
        IPMData41.addValueEventListener(this);
        IPMData42.addValueEventListener(this);

        IPMData43.addValueEventListener(this);
        IPMData44.addValueEventListener(this);
        IPMData45.addValueEventListener(this);
        IPMData46.addValueEventListener(this);
        IPMData47.addValueEventListener(this);
        IPMData48.addValueEventListener(this);
        IPMData49.addValueEventListener(this);

        IPMData50.addValueEventListener(this);
        IPMData51.addValueEventListener(this);
        IPMData52.addValueEventListener(this);
        IPMData53.addValueEventListener(this);
        IPMData54.addValueEventListener(this);
        IPMData55.addValueEventListener(this);
        IPMData56.addValueEventListener(this);

        IPMData57.addValueEventListener(this);
        IPMData58.addValueEventListener(this);
        IPMData59.addValueEventListener(this);
        IPMData60.addValueEventListener(this);
        IPMData61.addValueEventListener(this);
        IPMData62.addValueEventListener(this);
        IPMData63.addValueEventListener(this);

        IPMData64.addValueEventListener(this);
        IPMData65.addValueEventListener(this);
        IPMData66.addValueEventListener(this);
        IPMData67.addValueEventListener(this);
        IPMData68.addValueEventListener(this);
        IPMData69.addValueEventListener(this);
        IPMData70.addValueEventListener(this);

        IPMData71.addValueEventListener(this);
        IPMData72.addValueEventListener(this);
        IPMData73.addValueEventListener(this);
        IPMData74.addValueEventListener(this);
        IPMData75.addValueEventListener(this);
        IPMData76.addValueEventListener(this);
        IPMData77.addValueEventListener(this);
    }


}