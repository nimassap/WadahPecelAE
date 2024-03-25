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

public class SppddkActivity extends AppCompatActivity implements ValueEventListener {

    TextView kelUmur_jmlpend_jk1, kelUmur_jmlpend_jk2, kelUmur_jmlpend_jk3, kelUmur_jmlpend_jk4, kelUmur_jmlpend_jk5, kelUmur_jmlpend_jk6, kelUmur_jmlpend_jk7, kelUmur_jmlpend_jk8, kelUmur_jmlpend_jk9, kelUmur_jmlpend_jk10, kelUmur_jmlpend_jk11, kelUmur_jmlpend_jk12, kelUmur_jmlpend_jk13, kelUmur_jmlpend_jk14, kelUmur_jmlpend_jk15, kelUmur_jmlpend_jk16,
            jmlLaki_jmlpend_jk1, jmlLaki_jmlpend_jk2, jmlLaki_jmlpend_jk3, jmlLaki_jmlpend_jk4, jmlLaki_jmlpend_jk5, jmlLaki_jmlpend_jk6, jmlLaki_jmlpend_jk7, jmlLaki_jmlpend_jk8, jmlLaki_jmlpend_jk9, jmlLaki_jmlpend_jk10, jmlLaki_jmlpend_jk11, jmlLaki_jmlpend_jk12, jmlLaki_jmlpend_jk13, jmlLaki_jmlpend_jk14, jmlLaki_jmlpend_jk15, jmlLaki_jmlpend_jk16,
            jmlPerem_jmlpend_jk1, jmlPerem_jmlpend_jk2, jmlPerem_jmlpend_jk3, jmlPerem_jmlpend_jk4, jmlPerem_jmlpend_jk5, jmlPerem_jmlpend_jk6, jmlPerem_jmlpend_jk7, jmlPerem_jmlpend_jk8, jmlPerem_jmlpend_jk9, jmlPerem_jmlpend_jk10, jmlPerem_jmlpend_jk11, jmlPerem_jmlpend_jk12, jmlPerem_jmlpend_jk13, jmlPerem_jmlpend_jk14, jmlPerem_jmlpend_jk15, jmlPerem_jmlpend_jk16,
            jmlTot_jmlpend_jk1, jmlTot_jmlpend_jk2, jmlTot_jmlpend_jk3, jmlTot_jmlpend_jk4, jmlTot_jmlpend_jk5, jmlTot_jmlpend_jk6, jmlTot_jmlpend_jk7, jmlTot_jmlpend_jk8, jmlTot_jmlpend_jk9, jmlTot_jmlpend_jk10, jmlTot_jmlpend_jk11, jmlTot_jmlpend_jk12, jmlTot_jmlpend_jk13, jmlTot_jmlpend_jk14, jmlTot_jmlpend_jk15, jmlTot_jmlpend_jk16,
            jmlTot_jmlpend_jkLaki, jmlTot_jmlpend_jkPerem, jmlTot_jmlpend_jk;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference jmlpend_jkData1 = databaseReference.child("SP2020_JmlPendJK_kelompokUmur(0-4)");
    private DatabaseReference jmlpend_jkData2 = databaseReference.child("SP2020_JmlPendJK_jumlahLaki(0-4)");
    private DatabaseReference jmlpend_jkData3 = databaseReference.child("SP2020_JmlPendJK_jumlahPerempuan(0-4)");
    private DatabaseReference jmlpend_jkData4 = databaseReference.child("SP2020_JmlPendJK_jumlahTotal(0-4)");

    private DatabaseReference jmlpend_jkData5 = databaseReference.child("SP2020_JmlPendJK_kelompokUmur(5-9)");
    private DatabaseReference jmlpend_jkData6 = databaseReference.child("SP2020_JmlPendJK_jumlahLaki(5-9)");
    private DatabaseReference jmlpend_jkData7 = databaseReference.child("SP2020_JmlPendJK_jumlahPerempuan(5-9)");
    private DatabaseReference jmlpend_jkData8 = databaseReference.child("SP2020_JmlPendJK_jumlahTotal(5-9)");

    private DatabaseReference jmlpend_jkData9 = databaseReference.child("SP2020_JmlPendJK_kelompokUmur(10-14)");
    private DatabaseReference jmlpend_jkData10 = databaseReference.child("SP2020_JmlPendJK_jumlahLaki(10-14)");
    private DatabaseReference jmlpend_jkData11 = databaseReference.child("SP2020_JmlPendJK_jumlahPerempuan(10-14)");
    private DatabaseReference jmlpend_jkData12 = databaseReference.child("SP2020_JmlPendJK_jumlahTotal(10-14)");

    private DatabaseReference jmlpend_jkData13 = databaseReference.child("SP2020_JmlPendJK_kelompokUmur(15-19)");
    private DatabaseReference jmlpend_jkData14 = databaseReference.child("SP2020_JmlPendJK_jumlahLaki(15-19)");
    private DatabaseReference jmlpend_jkData15 = databaseReference.child("SP2020_JmlPendJK_jumlahPerempuan(15-19)");
    private DatabaseReference jmlpend_jkData16 = databaseReference.child("SP2020_JmlPendJK_jumlahTotal(15-19)");

    private DatabaseReference jmlpend_jkData17 = databaseReference.child("SP2020_JmlPendJK_kelompokUmur(20-24)");
    private DatabaseReference jmlpend_jkData18 = databaseReference.child("SP2020_JmlPendJK_jumlahLaki(20-24)");
    private DatabaseReference jmlpend_jkData19 = databaseReference.child("SP2020_JmlPendJK_jumlahPerempuan(20-24)");
    private DatabaseReference jmlpend_jkData20 = databaseReference.child("SP2020_JmlPendJK_jumlahTotal(20-24)");

    private DatabaseReference jmlpend_jkData21 = databaseReference.child("SP2020_JmlPendJK_kelompokUmur(25-29)");
    private DatabaseReference jmlpend_jkData22 = databaseReference.child("SP2020_JmlPendJK_jumlahLaki(25-29)");
    private DatabaseReference jmlpend_jkData23 = databaseReference.child("SP2020_JmlPendJK_jumlahPerempuan(25-29)");
    private DatabaseReference jmlpend_jkData24 = databaseReference.child("SP2020_JmlPendJK_jumlahTotal(25-29)");

    private DatabaseReference jmlpend_jkData25 = databaseReference.child("SP2020_JmlPendJK_kelompokUmur(30-34)");
    private DatabaseReference jmlpend_jkData26 = databaseReference.child("SP2020_JmlPendJK_jumlahLaki(30-34)");
    private DatabaseReference jmlpend_jkData27 = databaseReference.child("SP2020_JmlPendJK_jumlahPerempuan(30-34)");
    private DatabaseReference jmlpend_jkData28 = databaseReference.child("SP2020_JmlPendJK_jumlahTotal(30-34)");

    private DatabaseReference jmlpend_jkData29 = databaseReference.child("SP2020_JmlPendJK_kelompokUmur(35-39)");
    private DatabaseReference jmlpend_jkData30 = databaseReference.child("SP2020_JmlPendJK_jumlahLaki(35-39)");
    private DatabaseReference jmlpend_jkData31 = databaseReference.child("SP2020_JmlPendJK_jumlahPerempuan(35-39)");
    private DatabaseReference jmlpend_jkData32 = databaseReference.child("SP2020_JmlPendJK_jumlahTotal(35-39)");

    private DatabaseReference jmlpend_jkData33 = databaseReference.child("SP2020_JmlPendJK_kelompokUmur(40-44)");
    private DatabaseReference jmlpend_jkData34 = databaseReference.child("SP2020_JmlPendJK_jumlahLaki(40-44)");
    private DatabaseReference jmlpend_jkData35 = databaseReference.child("SP2020_JmlPendJK_jumlahPerempuan(40-44)");
    private DatabaseReference jmlpend_jkData36 = databaseReference.child("SP2020_JmlPendJK_jumlahTotal(40-44)");

    private DatabaseReference jmlpend_jkData37 = databaseReference.child("SP2020_JmlPendJK_kelompokUmur(45-49)");
    private DatabaseReference jmlpend_jkData38 = databaseReference.child("SP2020_JmlPendJK_jumlahLaki(45-49)");
    private DatabaseReference jmlpend_jkData39 = databaseReference.child("SP2020_JmlPendJK_jumlahPerempuan(45-49)");
    private DatabaseReference jmlpend_jkData40 = databaseReference.child("SP2020_JmlPendJK_jumlahTotal(45-49)");

    private DatabaseReference jmlpend_jkData41 = databaseReference.child("SP2020_JmlPendJK_kelompokUmur(50-54)");
    private DatabaseReference jmlpend_jkData42 = databaseReference.child("SP2020_JmlPendJK_jumlahLaki(50-54)");
    private DatabaseReference jmlpend_jkData43 = databaseReference.child("SP2020_JmlPendJK_jumlahPerempuan(50-54)");
    private DatabaseReference jmlpend_jkData44 = databaseReference.child("SP2020_JmlPendJK_jumlahTotal(50-54)");

    private DatabaseReference jmlpend_jkData45 = databaseReference.child("SP2020_JmlPendJK_kelompokUmur(55-59)");
    private DatabaseReference jmlpend_jkData46 = databaseReference.child("SP2020_JmlPendJK_jumlahLaki(55-59)");
    private DatabaseReference jmlpend_jkData47 = databaseReference.child("SP2020_JmlPendJK_jumlahPerempuan(55-59)");
    private DatabaseReference jmlpend_jkData48 = databaseReference.child("SP2020_JmlPendJK_jumlahTotal(55-59)");

    private DatabaseReference jmlpend_jkData49 = databaseReference.child("SP2020_JmlPendJK_kelompokUmur(60-64)");
    private DatabaseReference jmlpend_jkData50 = databaseReference.child("SP2020_JmlPendJK_jumlahLaki(60-64)");
    private DatabaseReference jmlpend_jkData51 = databaseReference.child("SP2020_JmlPendJK_jumlahPerempuan(60-64)");
    private DatabaseReference jmlpend_jkData52 = databaseReference.child("SP2020_JmlPendJK_jumlahTotal(60-64)");

    private DatabaseReference jmlpend_jkData53 = databaseReference.child("SP2020_JmlPendJK_kelompokUmur(65-69)");
    private DatabaseReference jmlpend_jkData54 = databaseReference.child("SP2020_JmlPendJK_jumlahLaki(65-69)");
    private DatabaseReference jmlpend_jkData55 = databaseReference.child("SP2020_JmlPendJK_jumlahPerempuan(65-69)");
    private DatabaseReference jmlpend_jkData56 = databaseReference.child("SP2020_JmlPendJK_jumlahTotal(65-69)");

    private DatabaseReference jmlpend_jkData57 = databaseReference.child("SP2020_JmlPendJK_kelompokUmur(70-74)");
    private DatabaseReference jmlpend_jkData58 = databaseReference.child("SP2020_JmlPendJK_jumlahLaki(70-74)");
    private DatabaseReference jmlpend_jkData59 = databaseReference.child("SP2020_JmlPendJK_jumlahPerempuan(70-74)");
    private DatabaseReference jmlpend_jkData60 = databaseReference.child("SP2020_JmlPendJK_jumlahTotal(70-74)");

    private DatabaseReference jmlpend_jkData61 = databaseReference.child("SP2020_JmlPendJK_kelompokUmur(75+)");
    private DatabaseReference jmlpend_jkData62 = databaseReference.child("SP2020_JmlPendJK_jumlahLaki(75+)");
    private DatabaseReference jmlpend_jkData63 = databaseReference.child("SP2020_JmlPendJK_jumlahPerempuan(75+)");
    private DatabaseReference jmlpend_jkData64 = databaseReference.child("SP2020_JmlPendJK_jumlahTotal(75+)");

    private DatabaseReference jmlpend_jkData65 = databaseReference.child("SP2020_JmlPendJK_jumlahTotalLaki");
    private DatabaseReference jmlpend_jkData66 = databaseReference.child("SP2020_JmlPendJK_jumlahTotalPerempuan");
    private DatabaseReference jmlpend_jkData67 = databaseReference.child("SP2020_JmlPendJK_jumlahTotalPenduduk");


    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sppddk);

        kelUmur_jmlpend_jk1 = (TextView)findViewById(R.id.kel_umur1);
        jmlLaki_jmlpend_jk1 = (TextView)findViewById(R.id.jml_laki1);
        jmlPerem_jmlpend_jk1 = (TextView)findViewById(R.id.jml_perem1);
        jmlTot_jmlpend_jk1 = (TextView)findViewById(R.id.jml_pend1);

        kelUmur_jmlpend_jk2 = (TextView)findViewById(R.id.kel_umur2);
        jmlLaki_jmlpend_jk2 = (TextView)findViewById(R.id.jml_laki2);
        jmlPerem_jmlpend_jk2 = (TextView)findViewById(R.id.jml_perem2);
        jmlTot_jmlpend_jk2 = (TextView)findViewById(R.id.jml_pend2);

        kelUmur_jmlpend_jk3 = (TextView)findViewById(R.id.kel_umur3);
        jmlLaki_jmlpend_jk3 = (TextView)findViewById(R.id.jml_laki3);
        jmlPerem_jmlpend_jk3 = (TextView)findViewById(R.id.jml_perem3);
        jmlTot_jmlpend_jk3 = (TextView)findViewById(R.id.jml_pend3);

        kelUmur_jmlpend_jk4 = (TextView)findViewById(R.id.kel_umur4);
        jmlLaki_jmlpend_jk4 = (TextView)findViewById(R.id.jml_laki4);
        jmlPerem_jmlpend_jk4 = (TextView)findViewById(R.id.jml_perem4);
        jmlTot_jmlpend_jk4 = (TextView)findViewById(R.id.jml_pend4);

        kelUmur_jmlpend_jk5 = (TextView)findViewById(R.id.kel_umur5);
        jmlLaki_jmlpend_jk5 = (TextView)findViewById(R.id.jml_laki5);
        jmlPerem_jmlpend_jk5 = (TextView)findViewById(R.id.jml_perem5);
        jmlTot_jmlpend_jk5 = (TextView)findViewById(R.id.jml_pend5);

        kelUmur_jmlpend_jk6 = (TextView)findViewById(R.id.kel_umur6);
        jmlLaki_jmlpend_jk6 = (TextView)findViewById(R.id.jml_laki6);
        jmlPerem_jmlpend_jk6 = (TextView)findViewById(R.id.jml_perem6);
        jmlTot_jmlpend_jk6 = (TextView)findViewById(R.id.jml_pend6);

        kelUmur_jmlpend_jk7 = (TextView)findViewById(R.id.kel_umur7);
        jmlLaki_jmlpend_jk7 = (TextView)findViewById(R.id.jml_laki7);
        jmlPerem_jmlpend_jk7 = (TextView)findViewById(R.id.jml_perem7);
        jmlTot_jmlpend_jk7 = (TextView)findViewById(R.id.jml_pend7);

        kelUmur_jmlpend_jk8 = (TextView)findViewById(R.id.kel_umur8);
        jmlLaki_jmlpend_jk8 = (TextView)findViewById(R.id.jml_laki8);
        jmlPerem_jmlpend_jk8 = (TextView)findViewById(R.id.jml_perem8);
        jmlTot_jmlpend_jk8 = (TextView)findViewById(R.id.jml_pend8);

        kelUmur_jmlpend_jk9 = (TextView)findViewById(R.id.kel_umur9);
        jmlLaki_jmlpend_jk9 = (TextView)findViewById(R.id.jml_laki9);
        jmlPerem_jmlpend_jk9 = (TextView)findViewById(R.id.jml_perem9);
        jmlTot_jmlpend_jk9 = (TextView)findViewById(R.id.jml_pend9);

        kelUmur_jmlpend_jk10 = (TextView)findViewById(R.id.kel_umur10);
        jmlLaki_jmlpend_jk10 = (TextView)findViewById(R.id.jml_laki10);
        jmlPerem_jmlpend_jk10 = (TextView)findViewById(R.id.jml_perem10);
        jmlTot_jmlpend_jk10 = (TextView)findViewById(R.id.jml_pend10);

        kelUmur_jmlpend_jk11 = (TextView)findViewById(R.id.kel_umur11);
        jmlLaki_jmlpend_jk11 = (TextView)findViewById(R.id.jml_laki11);
        jmlPerem_jmlpend_jk11 = (TextView)findViewById(R.id.jml_perem11);
        jmlTot_jmlpend_jk11 = (TextView)findViewById(R.id.jml_pend11);

        kelUmur_jmlpend_jk12 = (TextView)findViewById(R.id.kel_umur12);
        jmlLaki_jmlpend_jk12 = (TextView)findViewById(R.id.jml_laki12);
        jmlPerem_jmlpend_jk12 = (TextView)findViewById(R.id.jml_perem12);
        jmlTot_jmlpend_jk12 = (TextView)findViewById(R.id.jml_pend12);

        kelUmur_jmlpend_jk13 = (TextView)findViewById(R.id.kel_umur13);
        jmlLaki_jmlpend_jk13 = (TextView)findViewById(R.id.jml_laki13);
        jmlPerem_jmlpend_jk13 = (TextView)findViewById(R.id.jml_perem13);
        jmlTot_jmlpend_jk13 = (TextView)findViewById(R.id.jml_pend13);

        kelUmur_jmlpend_jk14 = (TextView)findViewById(R.id.kel_umur14);
        jmlLaki_jmlpend_jk14 = (TextView)findViewById(R.id.jml_laki14);
        jmlPerem_jmlpend_jk14 = (TextView)findViewById(R.id.jml_perem14);
        jmlTot_jmlpend_jk14 = (TextView)findViewById(R.id.jml_pend14);

        kelUmur_jmlpend_jk15 = (TextView)findViewById(R.id.kel_umur15);
        jmlLaki_jmlpend_jk15 = (TextView)findViewById(R.id.jml_laki15);
        jmlPerem_jmlpend_jk15 = (TextView)findViewById(R.id.jml_perem15);
        jmlTot_jmlpend_jk15 = (TextView)findViewById(R.id.jml_pend15);

        kelUmur_jmlpend_jk16 = (TextView)findViewById(R.id.kel_umur16);
        jmlLaki_jmlpend_jk16 = (TextView)findViewById(R.id.jml_laki16);
        jmlPerem_jmlpend_jk16 = (TextView)findViewById(R.id.jml_perem16);
        jmlTot_jmlpend_jk16 = (TextView)findViewById(R.id.jml_pend16);

        jmlTot_jmlpend_jkLaki = (TextView)findViewById(R.id.total_jml_laki);
        jmlTot_jmlpend_jkPerem = (TextView)findViewById(R.id.total_jml_perem);
        jmlTot_jmlpend_jk = (TextView)findViewById(R.id.total_jml_pend);
        

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.sppddk);
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
        Intent intent = new Intent(SppddkActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(SppddkActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(SppddkActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }


    public void back(View view) {
        Intent intent = new Intent(SppddkActivity.this, Sp2020Activity.class);
        startActivity(intent);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class) !=null) {

            String key = snapshot.getKey();
            if (key.equals("SP2020_JmlPendJK_kelompokUmur(0-4)")) {

                String jmlpend_jk1 = snapshot.getValue(String.class);
                kelUmur_jmlpend_jk1.setText(jmlpend_jk1);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahLaki(0-4)")) {

                String jmlpend_jk2 = snapshot.getValue(String.class);
                jmlLaki_jmlpend_jk1.setText(jmlpend_jk2);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahPerempuan(0-4)")) {

                String jmlpend_jk3 = snapshot.getValue(String.class);
                jmlPerem_jmlpend_jk1.setText(jmlpend_jk3);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahTotal(0-4)")) {

                String jmlpend_jk4 = snapshot.getValue(String.class);
                jmlTot_jmlpend_jk1.setText(jmlpend_jk4);
            }




            if (key.equals("SP2020_JmlPendJK_kelompokUmur(5-9)")) {

                String jmlpend_jk5 = snapshot.getValue(String.class);
                kelUmur_jmlpend_jk2.setText(jmlpend_jk5);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahLaki(5-9)")) {

                String jmlpend_jk6 = snapshot.getValue(String.class);
                jmlLaki_jmlpend_jk2.setText(jmlpend_jk6);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahPerempuan(5-9)")) {

                String jmlpend_jk7 = snapshot.getValue(String.class);
                jmlPerem_jmlpend_jk2.setText(jmlpend_jk7);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahTotal(5-9)")) {

                String jmlpend_jk8 = snapshot.getValue(String.class);
                jmlTot_jmlpend_jk2.setText(jmlpend_jk8);
            }



            if (key.equals("SP2020_JmlPendJK_kelompokUmur(10-14)")) {

                String jmlpend_jk9 = snapshot.getValue(String.class);
                kelUmur_jmlpend_jk3.setText(jmlpend_jk9);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahLaki(10-14)")) {

                String jmlpend_jk10 = snapshot.getValue(String.class);
                jmlLaki_jmlpend_jk3.setText(jmlpend_jk10);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahPerempuan(10-14)")) {

                String jmlpend_jk11 = snapshot.getValue(String.class);
                jmlPerem_jmlpend_jk3.setText(jmlpend_jk11);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahTotal(10-14)")) {

                String jmlpend_jk12 = snapshot.getValue(String.class);
                jmlTot_jmlpend_jk3.setText(jmlpend_jk12);
            }



            if (key.equals("SP2020_JmlPendJK_kelompokUmur(15-19)")) {

                String jmlpend_jk13 = snapshot.getValue(String.class);
                kelUmur_jmlpend_jk4.setText(jmlpend_jk13);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahLaki(15-19)")) {

                String jmlpend_jk14 = snapshot.getValue(String.class);
                jmlLaki_jmlpend_jk4.setText(jmlpend_jk14);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahPerempuan(15-19)")) {

                String jmlpend_jk15 = snapshot.getValue(String.class);
                jmlPerem_jmlpend_jk4.setText(jmlpend_jk15);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahTotal(15-19)")) {

                String jmlpend_jk16 = snapshot.getValue(String.class);
                jmlTot_jmlpend_jk4.setText(jmlpend_jk16);
            }




            if (key.equals("SP2020_JmlPendJK_kelompokUmur(20-24)")) {

                String jmlpend_jk17 = snapshot.getValue(String.class);
                kelUmur_jmlpend_jk5.setText(jmlpend_jk17);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahLaki(20-24)")) {

                String jmlpend_jk18 = snapshot.getValue(String.class);
                jmlLaki_jmlpend_jk5.setText(jmlpend_jk18);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahPerempuan(20-24)")) {

                String jmlpend_jk19 = snapshot.getValue(String.class);
                jmlPerem_jmlpend_jk5.setText(jmlpend_jk19);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahTotal(20-24)")) {

                String jmlpend_jk20 = snapshot.getValue(String.class);
                jmlTot_jmlpend_jk5.setText(jmlpend_jk20);
            }




            if (key.equals("SP2020_JmlPendJK_kelompokUmur(25-29)")) {

                String jmlpend_jk21 = snapshot.getValue(String.class);
                kelUmur_jmlpend_jk6.setText(jmlpend_jk21);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahLaki(25-29)")) {

                String jmlpend_jk22 = snapshot.getValue(String.class);
                jmlLaki_jmlpend_jk6.setText(jmlpend_jk22);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahPerempuan(25-29)")) {

                String jmlpend_jk23 = snapshot.getValue(String.class);
                jmlPerem_jmlpend_jk6.setText(jmlpend_jk23);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahTotal(25-29)")) {

                String jmlpend_jk24 = snapshot.getValue(String.class);
                jmlTot_jmlpend_jk6.setText(jmlpend_jk24);
            }




            if (key.equals("SP2020_JmlPendJK_kelompokUmur(30-34)")) {

                String jmlpend_jk25 = snapshot.getValue(String.class);
                kelUmur_jmlpend_jk7.setText(jmlpend_jk25);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahLaki(30-34)")) {

                String jmlpend_jk26 = snapshot.getValue(String.class);
                jmlLaki_jmlpend_jk7.setText(jmlpend_jk26);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahPerempuan(30-34)")) {

                String jmlpend_jk27 = snapshot.getValue(String.class);
                jmlPerem_jmlpend_jk7.setText(jmlpend_jk27);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahTotal(30-34)")) {

                String jmlpend_jk28 = snapshot.getValue(String.class);
                jmlTot_jmlpend_jk7.setText(jmlpend_jk28);
            }




            if (key.equals("SP2020_JmlPendJK_kelompokUmur(35-39)")) {

                String jmlpend_jk29 = snapshot.getValue(String.class);
                kelUmur_jmlpend_jk8.setText(jmlpend_jk29);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahLaki(35-39)")) {

                String jmlpend_jk30 = snapshot.getValue(String.class);
                jmlLaki_jmlpend_jk8.setText(jmlpend_jk30);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahPerempuan(35-39)")) {

                String jmlpend_jk31 = snapshot.getValue(String.class);
                jmlPerem_jmlpend_jk8.setText(jmlpend_jk31);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahTotal(35-39)")) {

                String jmlpend_jk32 = snapshot.getValue(String.class);
                jmlTot_jmlpend_jk8.setText(jmlpend_jk32);
            }




            if (key.equals("SP2020_JmlPendJK_kelompokUmur(40-44)")) {

                String jmlpend_jk33 = snapshot.getValue(String.class);
                kelUmur_jmlpend_jk9.setText(jmlpend_jk33);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahLaki(40-44)")) {

                String jmlpend_jk34 = snapshot.getValue(String.class);
                jmlLaki_jmlpend_jk9.setText(jmlpend_jk34);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahPerempuan(40-44)")) {

                String jmlpend_jk35 = snapshot.getValue(String.class);
                jmlPerem_jmlpend_jk9.setText(jmlpend_jk35);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahTotal(40-44)")) {

                String jmlpend_jk36 = snapshot.getValue(String.class);
                jmlTot_jmlpend_jk9.setText(jmlpend_jk36);
            }




            if (key.equals("SP2020_JmlPendJK_kelompokUmur(45-49)")) {

                String jmlpend_jk37 = snapshot.getValue(String.class);
                kelUmur_jmlpend_jk10.setText(jmlpend_jk37);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahLaki(45-49)")) {

                String jmlpend_jk38 = snapshot.getValue(String.class);
                jmlLaki_jmlpend_jk10.setText(jmlpend_jk38);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahPerempuan(45-49)")) {

                String jmlpend_jk39 = snapshot.getValue(String.class);
                jmlPerem_jmlpend_jk10.setText(jmlpend_jk39);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahTotal(45-49)")) {

                String jmlpend_jk40 = snapshot.getValue(String.class);
                jmlTot_jmlpend_jk10.setText(jmlpend_jk40);
            }




            if (key.equals("SP2020_JmlPendJK_kelompokUmur(50-54)")) {

                String jmlpend_jk41 = snapshot.getValue(String.class);
                kelUmur_jmlpend_jk11.setText(jmlpend_jk41);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahLaki(50-54)")) {

                String jmlpend_jk42 = snapshot.getValue(String.class);
                jmlLaki_jmlpend_jk11.setText(jmlpend_jk42);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahPerempuan(50-54)")) {

                String jmlpend_jk43 = snapshot.getValue(String.class);
                jmlPerem_jmlpend_jk11.setText(jmlpend_jk43);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahTotal(50-54)")) {

                String jmlpend_jk44 = snapshot.getValue(String.class);
                jmlTot_jmlpend_jk11.setText(jmlpend_jk44);
            }




            if (key.equals("SP2020_JmlPendJK_kelompokUmur(55-59)")) {

                String jmlpend_jk45 = snapshot.getValue(String.class);
                kelUmur_jmlpend_jk12.setText(jmlpend_jk45);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahLaki(55-59)")) {

                String jmlpend_jk46 = snapshot.getValue(String.class);
                jmlLaki_jmlpend_jk12.setText(jmlpend_jk46);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahPerempuan(55-59)")) {

                String jmlpend_jk47 = snapshot.getValue(String.class);
                jmlPerem_jmlpend_jk12.setText(jmlpend_jk47);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahTotal(55-59)")) {

                String jmlpend_jk48 = snapshot.getValue(String.class);
                jmlTot_jmlpend_jk12.setText(jmlpend_jk48);
            }




            if (key.equals("SP2020_JmlPendJK_kelompokUmur(60-64)")) {

                String jmlpend_jk49 = snapshot.getValue(String.class);
                kelUmur_jmlpend_jk13.setText(jmlpend_jk49);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahLaki(60-64)")) {

                String jmlpend_jk50 = snapshot.getValue(String.class);
                jmlLaki_jmlpend_jk13.setText(jmlpend_jk50);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahPerempuan(60-64)")) {

                String jmlpend_jk51 = snapshot.getValue(String.class);
                jmlPerem_jmlpend_jk13.setText(jmlpend_jk51);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahTotal(60-64)")) {

                String jmlpend_jk52 = snapshot.getValue(String.class);
                jmlTot_jmlpend_jk13.setText(jmlpend_jk52);
            }




            if (key.equals("SP2020_JmlPendJK_kelompokUmur(65-69)")) {

                String jmlpend_jk53 = snapshot.getValue(String.class);
                kelUmur_jmlpend_jk14.setText(jmlpend_jk53);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahLaki(65-69)")) {

                String jmlpend_jk54 = snapshot.getValue(String.class);
                jmlLaki_jmlpend_jk14.setText(jmlpend_jk54);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahPerempuan(65-69)")) {

                String jmlpend_jk55 = snapshot.getValue(String.class);
                jmlPerem_jmlpend_jk14.setText(jmlpend_jk55);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahTotal(65-69)")) {

                String jmlpend_jk56 = snapshot.getValue(String.class);
                jmlTot_jmlpend_jk14.setText(jmlpend_jk56);
            }




            if (key.equals("SP2020_JmlPendJK_kelompokUmur(70-74)")) {

                String jmlpend_jk57 = snapshot.getValue(String.class);
                kelUmur_jmlpend_jk15.setText(jmlpend_jk57);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahLaki(70-74)")) {

                String jmlpend_jk58 = snapshot.getValue(String.class);
                jmlLaki_jmlpend_jk15.setText(jmlpend_jk58);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahPerempuan(70-74)")) {

                String jmlpend_jk59 = snapshot.getValue(String.class);
                jmlPerem_jmlpend_jk15.setText(jmlpend_jk59);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahTotal(70-74)")) {

                String jmlpend_jk60 = snapshot.getValue(String.class);
                jmlTot_jmlpend_jk15.setText(jmlpend_jk60);
            }




            if (key.equals("SP2020_JmlPendJK_kelompokUmur(75+)")) {

                String jmlpend_jk61 = snapshot.getValue(String.class);
                kelUmur_jmlpend_jk16.setText(jmlpend_jk61);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahLaki(75+)")) {

                String jmlpend_jk62 = snapshot.getValue(String.class);
                jmlLaki_jmlpend_jk16.setText(jmlpend_jk62);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahPerempuan(75+)")) {

                String jmlpend_jk63 = snapshot.getValue(String.class);
                jmlPerem_jmlpend_jk16.setText(jmlpend_jk63);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahTotal(75+)")) {

                String jmlpend_jk64 = snapshot.getValue(String.class);
                jmlTot_jmlpend_jk16.setText(jmlpend_jk64);
            }




            if (key.equals("SP2020_JmlPendJK_jumlahTotalLaki")) {

                String jmlpend_jk65 = snapshot.getValue(String.class);
                jmlTot_jmlpend_jkLaki.setText(jmlpend_jk65);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahTotalPerempuan")) {

                String jmlpend_jk66 = snapshot.getValue(String.class);
                jmlTot_jmlpend_jkPerem.setText(jmlpend_jk66);
            }

            if (key.equals("SP2020_JmlPendJK_jumlahTotalPenduduk")) {

                String jmlpend_jk67 = snapshot.getValue(String.class);
                jmlTot_jmlpend_jk.setText(jmlpend_jk67);
            }

        }
        
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        jmlpend_jkData1.addValueEventListener(this);
        jmlpend_jkData2.addValueEventListener(this);
        jmlpend_jkData3.addValueEventListener(this);
        jmlpend_jkData4.addValueEventListener(this);
        
        jmlpend_jkData5.addValueEventListener(this);
        jmlpend_jkData6.addValueEventListener(this);
        jmlpend_jkData7.addValueEventListener(this);
        jmlpend_jkData8.addValueEventListener(this);
        
        jmlpend_jkData9.addValueEventListener(this);
        jmlpend_jkData10.addValueEventListener(this);
        jmlpend_jkData11.addValueEventListener(this);
        jmlpend_jkData12.addValueEventListener(this);
        
        jmlpend_jkData13.addValueEventListener(this);
        jmlpend_jkData14.addValueEventListener(this);
        jmlpend_jkData15.addValueEventListener(this);
        jmlpend_jkData16.addValueEventListener(this);
        
        jmlpend_jkData17.addValueEventListener(this);
        jmlpend_jkData18.addValueEventListener(this);
        jmlpend_jkData19.addValueEventListener(this);
        jmlpend_jkData20.addValueEventListener(this);
        
        jmlpend_jkData21.addValueEventListener(this);
        jmlpend_jkData22.addValueEventListener(this);
        jmlpend_jkData23.addValueEventListener(this);
        jmlpend_jkData24.addValueEventListener(this);
        
        jmlpend_jkData25.addValueEventListener(this);
        jmlpend_jkData26.addValueEventListener(this);
        jmlpend_jkData27.addValueEventListener(this);
        jmlpend_jkData28.addValueEventListener(this);

        jmlpend_jkData29.addValueEventListener(this);
        jmlpend_jkData30.addValueEventListener(this);
        jmlpend_jkData31.addValueEventListener(this);
        jmlpend_jkData32.addValueEventListener(this);

        jmlpend_jkData33.addValueEventListener(this);
        jmlpend_jkData34.addValueEventListener(this);
        jmlpend_jkData35.addValueEventListener(this);
        jmlpend_jkData36.addValueEventListener(this);

        jmlpend_jkData37.addValueEventListener(this);
        jmlpend_jkData38.addValueEventListener(this);
        jmlpend_jkData39.addValueEventListener(this);
        jmlpend_jkData40.addValueEventListener(this);

        jmlpend_jkData41.addValueEventListener(this);
        jmlpend_jkData42.addValueEventListener(this);
        jmlpend_jkData43.addValueEventListener(this);
        jmlpend_jkData44.addValueEventListener(this);

        jmlpend_jkData45.addValueEventListener(this);
        jmlpend_jkData46.addValueEventListener(this);
        jmlpend_jkData47.addValueEventListener(this);
        jmlpend_jkData48.addValueEventListener(this);

        jmlpend_jkData49.addValueEventListener(this);
        jmlpend_jkData50.addValueEventListener(this);
        jmlpend_jkData51.addValueEventListener(this);
        jmlpend_jkData52.addValueEventListener(this);

        jmlpend_jkData53.addValueEventListener(this);
        jmlpend_jkData54.addValueEventListener(this);
        jmlpend_jkData55.addValueEventListener(this);
        jmlpend_jkData56.addValueEventListener(this);

        jmlpend_jkData57.addValueEventListener(this);
        jmlpend_jkData58.addValueEventListener(this);
        jmlpend_jkData59.addValueEventListener(this);
        jmlpend_jkData60.addValueEventListener(this);

        jmlpend_jkData61.addValueEventListener(this);
        jmlpend_jkData62.addValueEventListener(this);
        jmlpend_jkData63.addValueEventListener(this);
        jmlpend_jkData64.addValueEventListener(this);

        jmlpend_jkData65.addValueEventListener(this);
        jmlpend_jkData66.addValueEventListener(this);
        jmlpend_jkData67.addValueEventListener(this);
    }
    
}