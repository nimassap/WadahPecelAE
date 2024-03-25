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

public class PendudukActivity extends AppCompatActivity implements ValueEventListener {

    TextView pend_tahun1, pend_tahun2, pend_tahun3, pend_tahun4, pend_tahun5, pend_tahun6, pend_tahun7, pend_tahun8,pend_tahun9,pend_tahun10,pend_tahun11,
            pend_jumlahlaki1, pend_jumlahlaki2, pend_jumlahlaki3, pend_jumlahlaki4, pend_jumlahlaki5, pend_jumlahlaki6, pend_jumlahlaki7, pend_jumlahlaki8,pend_jumlahlaki9,pend_jumlahlaki10,pend_jumlahlaki11,
            pend_jumlahprmpn1, pend_jumlahprmpn2, pend_jumlahprmpn3, pend_jumlahprmpn4, pend_jumlahprmpn5, pend_jumlahprmpn6, pend_jumlahprmpn7, pend_jumlahprmpn8,pend_jumlahprmpn9,pend_jumlahprmpn10,pend_jumlahprmpn11,
            pend_jumlah1, pend_jumlah2, pend_jumlah3, pend_jumlah4, pend_jumlah5, pend_jumlah6, pend_jumlah7, pend_jumlah8, pend_jumlah9,pend_jumlah10,pend_jumlah11,
            pend_ket1, pend_ket2;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference pendudukData1 = databaseReference.child("PendudukJK_tahun_2020");
    private DatabaseReference pendudukData2 = databaseReference.child("PendudukJK_jumlahlaki_2020");
    private DatabaseReference pendudukData3 = databaseReference.child("PendudukJK_jumlahperempuan_2020");
    private DatabaseReference pendudukData4 = databaseReference.child("PendudukJK_jumlah_2020");

    private DatabaseReference pendudukData5 = databaseReference.child("PendudukJK_tahun_2019");
    private DatabaseReference pendudukData6 = databaseReference.child("PendudukJK_jumlahlaki_2019");
    private DatabaseReference pendudukData7 = databaseReference.child("PendudukJK_jumlahperempuan_2019");
    private DatabaseReference pendudukData8 = databaseReference.child("PendudukJK_jumlah_2019");

    private DatabaseReference pendudukData9 = databaseReference.child("PendudukJK_tahun_2018");
    private DatabaseReference pendudukData10 = databaseReference.child("PendudukJK_jumlahlaki_2018");
    private DatabaseReference pendudukData11 = databaseReference.child("PendudukJK_jumlahperempuan_2018");
    private DatabaseReference pendudukData12 = databaseReference.child("PendudukJK_jumlah_2018");

    private DatabaseReference pendudukData13 = databaseReference.child("PendudukJK_tahun_2017");
    private DatabaseReference pendudukData14 = databaseReference.child("PendudukJK_jumlahlaki_2017");
    private DatabaseReference pendudukData15 = databaseReference.child("PendudukJK_jumlahperempuan_2017");
    private DatabaseReference pendudukData16 = databaseReference.child("PendudukJK_jumlah_2017");

    private DatabaseReference pendudukData17 = databaseReference.child("PendudukJK_tahun_2016");
    private DatabaseReference pendudukData18 = databaseReference.child("PendudukJK_jumlahlaki_2016");
    private DatabaseReference pendudukData19 = databaseReference.child("PendudukJK_jumlahperempuan_2016");
    private DatabaseReference pendudukData20 = databaseReference.child("PendudukJK_jumlah_2016");

    private DatabaseReference pendudukData21 = databaseReference.child("PendudukJK_tahun_2015");
    private DatabaseReference pendudukData22 = databaseReference.child("PendudukJK_jumlahlaki_2015");
    private DatabaseReference pendudukData23 = databaseReference.child("PendudukJK_jumlahperempuan_2015");
    private DatabaseReference pendudukData24 = databaseReference.child("PendudukJK_jumlah_2015");

    private DatabaseReference pendudukData25 = databaseReference.child("PendudukJK_keterangan1");
    private DatabaseReference pendudukData26 = databaseReference.child("PendudukJK_keterangan2");

    private DatabaseReference pendudukData27 = databaseReference.child("PendudukJK_tahun_2021");
    private DatabaseReference pendudukData28 = databaseReference.child("PendudukJK_jumlahlaki_2021");
    private DatabaseReference pendudukData29 = databaseReference.child("PendudukJK_jumlahperempuan_2021");
    private DatabaseReference pendudukData30 = databaseReference.child("PendudukJK_jumlah_2021");

    private DatabaseReference pendudukData31 = databaseReference.child("PendudukJK_tahun_2022");
    private DatabaseReference pendudukData32 = databaseReference.child("PendudukJK_jumlahlaki_2022");
    private DatabaseReference pendudukData33 = databaseReference.child("PendudukJK_jumlahperempuan_2022");
    private DatabaseReference pendudukData34 = databaseReference.child("PendudukJK_jumlah_2022");

    private DatabaseReference pendudukData35 = databaseReference.child("PendudukJK_tahun_2023");
    private DatabaseReference pendudukData36 = databaseReference.child("PendudukJK_jumlahlaki_2023");
    private DatabaseReference pendudukData37 = databaseReference.child("PendudukJK_jumlahperempuan_2023");
    private DatabaseReference pendudukData38 = databaseReference.child("PendudukJK_jumlah_2023");

    private DatabaseReference pendudukData39 = databaseReference.child("PendudukJK_tahun_2024");
    private DatabaseReference pendudukData40 = databaseReference.child("PendudukJK_jumlahlaki_2024");
    private DatabaseReference pendudukData41 = databaseReference.child("PendudukJK_jumlahperempuan_2024");
    private DatabaseReference pendudukData42 = databaseReference.child("PendudukJK_jumlah_2024");

    private DatabaseReference pendudukData43 = databaseReference.child("PendudukJK_tahun_2025");
    private DatabaseReference pendudukData44 = databaseReference.child("PendudukJK_jumlahlaki_2025");
    private DatabaseReference pendudukData45 = databaseReference.child("PendudukJK_jumlahperempuan_2025");
    private DatabaseReference pendudukData46 = databaseReference.child("PendudukJK_jumlah_2025");

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penduduk);

        pend_tahun1 = (TextView)findViewById(R.id.pend_jk_tahun1);
        pend_jumlahlaki1 = (TextView)findViewById(R.id.jml_pend_laki1);
        pend_jumlahprmpn1 = (TextView)findViewById(R.id.jml_pend_prmpn1);
        pend_jumlah1 = (TextView)findViewById(R.id.jml_pend1);

        pend_tahun2 = (TextView)findViewById(R.id.pend_jk_tahun2);
        pend_jumlahlaki2 = (TextView)findViewById(R.id.jml_pend_laki2);
        pend_jumlahprmpn2 = (TextView)findViewById(R.id.jml_pend_prmpn2);
        pend_jumlah2 = (TextView)findViewById(R.id.jml_pend2);

        pend_tahun3 = (TextView)findViewById(R.id.pend_jk_tahun3);
        pend_jumlahlaki3 = (TextView)findViewById(R.id.jml_pend_laki3);
        pend_jumlahprmpn3 = (TextView)findViewById(R.id.jml_pend_prmpn3);
        pend_jumlah3 = (TextView)findViewById(R.id.jml_pend3);

        pend_tahun4 = (TextView)findViewById(R.id.pend_jk_tahun4);
        pend_jumlahlaki4 = (TextView)findViewById(R.id.jml_pend_laki4);
        pend_jumlahprmpn4 = (TextView)findViewById(R.id.jml_pend_prmpn4);
        pend_jumlah4 = (TextView)findViewById(R.id.jml_pend4);

        pend_tahun5 = (TextView)findViewById(R.id.pend_jk_tahun5);
        pend_jumlahlaki5 = (TextView)findViewById(R.id.jml_pend_laki5);
        pend_jumlahprmpn5 = (TextView)findViewById(R.id.jml_pend_prmpn5);
        pend_jumlah5 = (TextView)findViewById(R.id.jml_pend5);

        pend_tahun6 = (TextView)findViewById(R.id.pend_jk_tahun6);
        pend_jumlahlaki6 = (TextView)findViewById(R.id.jml_pend_laki6);
        pend_jumlahprmpn6 = (TextView)findViewById(R.id.jml_pend_prmpn6);
        pend_jumlah6 = (TextView)findViewById(R.id.jml_pend6);

        pend_ket1 = (TextView)findViewById(R.id.ket_pend1);
        pend_ket2 = (TextView)findViewById(R.id.ket_pend2);

        pend_tahun7 = (TextView)findViewById(R.id.pend_jk_tahunNew1);
        pend_jumlahlaki7 = (TextView)findViewById(R.id.jml_pend_lakiNew1);
        pend_jumlahprmpn7 = (TextView)findViewById(R.id.jml_pend_prmpnNew1);
        pend_jumlah7 = (TextView)findViewById(R.id.jml_pendNew1);

        pend_tahun8 = (TextView)findViewById(R.id.pend_jk_tahunNew2);
        pend_jumlahlaki8 = (TextView)findViewById(R.id.jml_pend_lakiNew2);
        pend_jumlahprmpn8 = (TextView)findViewById(R.id.jml_pend_prmpnNew2);
        pend_jumlah8 = (TextView)findViewById(R.id.jml_pendNew2);

        pend_tahun9 = (TextView)findViewById(R.id.pend_jk_tahunNew3);
        pend_jumlahlaki9 = (TextView)findViewById(R.id.jml_pend_lakiNew3);
        pend_jumlahprmpn9 = (TextView)findViewById(R.id.jml_pend_prmpnNew3);
        pend_jumlah9 = (TextView)findViewById(R.id.jml_pendNew3);

        pend_tahun10 = (TextView)findViewById(R.id.pend_jk_tahunNew4);
        pend_jumlahlaki10 = (TextView)findViewById(R.id.jml_pend_lakiNew4);
        pend_jumlahprmpn10 = (TextView)findViewById(R.id.jml_pend_prmpnNew4);
        pend_jumlah10 = (TextView)findViewById(R.id.jml_pendNew4);

        pend_tahun11 = (TextView)findViewById(R.id.pend_jk_tahunNew5);
        pend_jumlahlaki11 = (TextView)findViewById(R.id.jml_pend_lakiNew5);
        pend_jumlahprmpn11 = (TextView)findViewById(R.id.jml_pend_prmpnNew5);
        pend_jumlah11 = (TextView)findViewById(R.id.jml_pendNew5);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.penduduk);
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
        Intent intent = new Intent(PendudukActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(PendudukActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(PendudukActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }


    public void back(View view) {
        Intent intent = new Intent(PendudukActivity.this, SosialActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class) !=null) {

            String key = snapshot.getKey();
            if (key.equals("PendudukJK_tahun_2020")) {

                String penduduk1 = snapshot.getValue(String.class);
                pend_tahun1.setText(penduduk1);
            }

            if (key.equals("PendudukJK_jumlahlaki_2020")) {

                String penduduk2 = snapshot.getValue(String.class);
                pend_jumlahlaki1.setText(penduduk2);
            }

            if (key.equals("PendudukJK_jumlahperempuan_2020")) {

                String penduduk3 = snapshot.getValue(String.class);
                pend_jumlahprmpn1.setText(penduduk3);
            }

            if (key.equals("PendudukJK_jumlah_2020")) {

                String penduduk4 = snapshot.getValue(String.class);
                pend_jumlah1.setText(penduduk4);
            }



            if (key.equals("PendudukJK_tahun_2019")) {

                String penduduk5 = snapshot.getValue(String.class);
                pend_tahun2.setText(penduduk5);
            }

            if (key.equals("PendudukJK_jumlahlaki_2019")) {

                String penduduk6 = snapshot.getValue(String.class);
                pend_jumlahlaki2.setText(penduduk6);
            }

            if (key.equals("PendudukJK_jumlahperempuan_2019")) {

                String penduduk7 = snapshot.getValue(String.class);
                pend_jumlahprmpn2.setText(penduduk7);
            }

            if (key.equals("PendudukJK_jumlah_2019")) {

                String penduduk8 = snapshot.getValue(String.class);
                pend_jumlah2.setText(penduduk8);
            }



            if (key.equals("PendudukJK_tahun_2018")) {

                String penduduk9 = snapshot.getValue(String.class);
                pend_tahun3.setText(penduduk9);
            }

            if (key.equals("PendudukJK_jumlahlaki_2018")) {

                String penduduk10 = snapshot.getValue(String.class);
                pend_jumlahlaki3.setText(penduduk10);
            }

            if (key.equals("PendudukJK_jumlahperempuan_2018")) {

                String penduduk11 = snapshot.getValue(String.class);
                pend_jumlahprmpn3.setText(penduduk11);
            }

            if (key.equals("PendudukJK_jumlah_2018")) {

                String penduduk12 = snapshot.getValue(String.class);
                pend_jumlah3.setText(penduduk12);
            }



            if (key.equals("PendudukJK_tahun_2017")) {

                String penduduk13 = snapshot.getValue(String.class);
                pend_tahun4.setText(penduduk13);
            }

            if (key.equals("PendudukJK_jumlahlaki_2017")) {

                String penduduk14 = snapshot.getValue(String.class);
                pend_jumlahlaki4.setText(penduduk14);
            }

            if (key.equals("PendudukJK_jumlahperempuan_2017")) {

                String penduduk15 = snapshot.getValue(String.class);
                pend_jumlahprmpn4.setText(penduduk15);
            }

            if (key.equals("PendudukJK_jumlah_2017")) {

                String penduduk16 = snapshot.getValue(String.class);
                pend_jumlah4.setText(penduduk16);
            }



            if (key.equals("PendudukJK_tahun_2016")) {

                String penduduk17 = snapshot.getValue(String.class);
                pend_tahun5.setText(penduduk17);
            }

            if (key.equals("PendudukJK_jumlahlaki_2016")) {

                String penduduk18 = snapshot.getValue(String.class);
                pend_jumlahlaki5.setText(penduduk18);
            }

            if (key.equals("PendudukJK_jumlahperempuan_2016")) {

                String penduduk19 = snapshot.getValue(String.class);
                pend_jumlahprmpn5.setText(penduduk19);
            }

            if (key.equals("PendudukJK_jumlah_2016")) {

                String penduduk20 = snapshot.getValue(String.class);
                pend_jumlah5.setText(penduduk20);
            }



            if (key.equals("PendudukJK_tahun_2015")) {

                String penduduk21 = snapshot.getValue(String.class);
                pend_tahun6.setText(penduduk21);
            }

            if (key.equals("PendudukJK_jumlahlaki_2015")) {

                String penduduk22 = snapshot.getValue(String.class);
                pend_jumlahlaki6.setText(penduduk22);
            }

            if (key.equals("PendudukJK_jumlahperempuan_2015")) {

                String penduduk23 = snapshot.getValue(String.class);
                pend_jumlahprmpn6.setText(penduduk23);
            }

            if (key.equals("PendudukJK_jumlah_2015")) {

                String penduduk24 = snapshot.getValue(String.class);
                pend_jumlah6.setText(penduduk24);
            }



            if (key.equals("PendudukJK_keterangan1")) {

                String penduduk25 = snapshot.getValue(String.class);
                pend_ket1.setText(penduduk25);
            }

            if (key.equals("PendudukJK_keterangan2")) {

                String penduduk26 = snapshot.getValue(String.class);
                pend_ket2.setText(penduduk26);
            }




            if (key.equals("PendudukJK_tahun_2021")) {

                String penduduk27 = snapshot.getValue(String.class);
                pend_tahun7.setText(penduduk27);
            }

            if (key.equals("PendudukJK_jumlahlaki_2021")) {

                String penduduk28 = snapshot.getValue(String.class);
                pend_jumlahlaki7.setText(penduduk28);
            }

            if (key.equals("PendudukJK_jumlahperempuan_2021")) {

                String penduduk29 = snapshot.getValue(String.class);
                pend_jumlahprmpn7.setText(penduduk29);
            }

            if (key.equals("PendudukJK_jumlah_2021")) {

                String penduduk30 = snapshot.getValue(String.class);
                pend_jumlah7.setText(penduduk30);
            }




            if (key.equals("PendudukJK_tahun_2022")) {

                String penduduk31 = snapshot.getValue(String.class);
                pend_tahun8.setText(penduduk31);
            }

            if (key.equals("PendudukJK_jumlahlaki_2022")) {

                String penduduk32 = snapshot.getValue(String.class);
                pend_jumlahlaki8.setText(penduduk32);
            }

            if (key.equals("PendudukJK_jumlahperempuan_2022")) {

                String penduduk33 = snapshot.getValue(String.class);
                pend_jumlahprmpn8.setText(penduduk33);
            }

            if (key.equals("PendudukJK_jumlah_2022")) {

                String penduduk34 = snapshot.getValue(String.class);
                pend_jumlah8.setText(penduduk34);
            }




            if (key.equals("PendudukJK_tahun_2023")) {

                String penduduk35 = snapshot.getValue(String.class);
                pend_tahun9.setText(penduduk35);
            }

            if (key.equals("PendudukJK_jumlahlaki_2023")) {

                String penduduk36 = snapshot.getValue(String.class);
                pend_jumlahlaki9.setText(penduduk36);
            }

            if (key.equals("PendudukJK_jumlahperempuan_2023")) {

                String penduduk37 = snapshot.getValue(String.class);
                pend_jumlahprmpn9.setText(penduduk37);
            }

            if (key.equals("PendudukJK_jumlah_2023")) {

                String penduduk38 = snapshot.getValue(String.class);
                pend_jumlah9.setText(penduduk38);
            }




            if (key.equals("PendudukJK_tahun_2024")) {

                String penduduk39 = snapshot.getValue(String.class);
                pend_tahun10.setText(penduduk39);
            }

            if (key.equals("PendudukJK_jumlahlaki_2024")) {

                String penduduk40 = snapshot.getValue(String.class);
                pend_jumlahlaki10.setText(penduduk40);
            }

            if (key.equals("PendudukJK_jumlahperempuan_2024")) {

                String penduduk41 = snapshot.getValue(String.class);
                pend_jumlahprmpn10.setText(penduduk41);
            }

            if (key.equals("PendudukJK_jumlah_2024")) {

                String penduduk42 = snapshot.getValue(String.class);
                pend_jumlah10.setText(penduduk42);
            }




            if (key.equals("PendudukJK_tahun_2025")) {

                String penduduk43 = snapshot.getValue(String.class);
                pend_tahun11.setText(penduduk43);
            }

            if (key.equals("PendudukJK_jumlahlaki_2025")) {

                String penduduk44 = snapshot.getValue(String.class);
                pend_jumlahlaki11.setText(penduduk44);
            }

            if (key.equals("PendudukJK_jumlahperempuan_2025")) {

                String penduduk45 = snapshot.getValue(String.class);
                pend_jumlahprmpn11.setText(penduduk45);
            }

            if (key.equals("PendudukJK_jumlah_2025")) {

                String penduduk46 = snapshot.getValue(String.class);
                pend_jumlah11.setText(penduduk46);
            }
        }
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        pendudukData1.addValueEventListener(this);
        pendudukData2.addValueEventListener(this);
        pendudukData3.addValueEventListener(this);
        pendudukData4.addValueEventListener(this);

        pendudukData5.addValueEventListener(this);
        pendudukData6.addValueEventListener(this);
        pendudukData7.addValueEventListener(this);
        pendudukData8.addValueEventListener(this);

        pendudukData9.addValueEventListener(this);
        pendudukData10.addValueEventListener(this);
        pendudukData11.addValueEventListener(this);
        pendudukData12.addValueEventListener(this);

        pendudukData13.addValueEventListener(this);
        pendudukData14.addValueEventListener(this);
        pendudukData15.addValueEventListener(this);
        pendudukData16.addValueEventListener(this);

        pendudukData17.addValueEventListener(this);
        pendudukData18.addValueEventListener(this);
        pendudukData19.addValueEventListener(this);
        pendudukData20.addValueEventListener(this);

        pendudukData21.addValueEventListener(this);
        pendudukData22.addValueEventListener(this);
        pendudukData23.addValueEventListener(this);
        pendudukData24.addValueEventListener(this);

        pendudukData25.addValueEventListener(this);
        pendudukData26.addValueEventListener(this);

        pendudukData27.addValueEventListener(this);
        pendudukData28.addValueEventListener(this);
        pendudukData29.addValueEventListener(this);
        pendudukData30.addValueEventListener(this);

        pendudukData31.addValueEventListener(this);
        pendudukData32.addValueEventListener(this);
        pendudukData33.addValueEventListener(this);
        pendudukData34.addValueEventListener(this);

        pendudukData35.addValueEventListener(this);
        pendudukData36.addValueEventListener(this);
        pendudukData37.addValueEventListener(this);
        pendudukData38.addValueEventListener(this);

        pendudukData39.addValueEventListener(this);
        pendudukData40.addValueEventListener(this);
        pendudukData41.addValueEventListener(this);
        pendudukData42.addValueEventListener(this);

        pendudukData43.addValueEventListener(this);
        pendudukData44.addValueEventListener(this);
        pendudukData45.addValueEventListener(this);
        pendudukData46.addValueEventListener(this);
    }

}