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

public class RasiojkActivity extends AppCompatActivity implements ValueEventListener {

    TextView kec_jmlLaki1, kec_jmlLaki2, kec_jmlLaki3, kec_jmlLaki4, kec_jmlLaki5, kec_jmlLaki6, kec_jmlLaki7, kec_jmlLaki8, kec_jmlLaki9, kec_jmlLaki10, kec_jmlLaki11, kec_jmlLaki12, kec_jmlLaki13, kec_jmlLaki14, kec_jmlLaki15, 
            kec_jmlPerem1, kec_jmlPerem2, kec_jmlPerem3, kec_jmlPerem4, kec_jmlPerem5, kec_jmlPerem6, kec_jmlPerem7, kec_jmlPerem8, kec_jmlPerem9, kec_jmlPerem10, kec_jmlPerem11, kec_jmlPerem12, kec_jmlPerem13, kec_jmlPerem14, kec_jmlPerem15, 
            kec_jmlTot1, kec_jmlTot2, kec_jmlTot3, kec_jmlTot4, kec_jmlTot5, kec_jmlTot6, kec_jmlTot7, kec_jmlTot8, kec_jmlTot9, kec_jmlTot10, kec_jmlTot11, kec_jmlTot12, kec_jmlTot13, kec_jmlTot14, kec_jmlTot15, 
            kec_persentase1, kec_persentase2, kec_persentase3, kec_persentase4, kec_persentase5, kec_persentase6, kec_persentase7, kec_persentase8, kec_persentase9, kec_persentase10, kec_persentase11, kec_persentase12, kec_persentase13, kec_persentase14, kec_persentase15,
            kec_rasio1, kec_rasio2, kec_rasio3, kec_rasio4, kec_rasio5, kec_rasio6, kec_rasio7, kec_rasio8, kec_rasio9, kec_rasio10, kec_rasio11, kec_rasio12, kec_rasio13, kec_rasio14, kec_rasio15,
            kabMadiun_jmlLaki, kabMadiun_jmlPerem, kabMadiun_jmlTot, kabMadiun_persentase, kabMadiun_rasio;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference jmlpend_rasioData1 = databaseReference.child("SP2020_JmlPendRasio_JumlahLaki_Kebonsari");
    private DatabaseReference jmlpend_rasioData2 = databaseReference.child("SP2020_JmlPendRasio_JumlahPerempuan_Kebonsari");
    private DatabaseReference jmlpend_rasioData3 = databaseReference.child("SP2020_JmlPendRasio_JumlahTotal_Kebonsari");
    private DatabaseReference jmlpend_rasioData4 = databaseReference.child("SP2020_JmlPendRasio_Persentase_Kebonsari");
    private DatabaseReference jmlpend_rasioData5 = databaseReference.child("SP2020_JmlPendRasio_Rasio_Kebonsari");

    private DatabaseReference jmlpend_rasioData6 = databaseReference.child("SP2020_JmlPendRasio_JumlahLaki_Geger");
    private DatabaseReference jmlpend_rasioData7 = databaseReference.child("SP2020_JmlPendRasio_JumlahPerempuan_Geger");
    private DatabaseReference jmlpend_rasioData8 = databaseReference.child("SP2020_JmlPendRasio_JumlahTotal_Geger");
    private DatabaseReference jmlpend_rasioData9 = databaseReference.child("SP2020_JmlPendRasio_Persentase_Geger");
    private DatabaseReference jmlpend_rasioData10 = databaseReference.child("SP2020_JmlPendRasio_Rasio_Geger");

    private DatabaseReference jmlpend_rasioData11 = databaseReference.child("SP2020_JmlPendRasio_JumlahLaki_Dolopo");
    private DatabaseReference jmlpend_rasioData12 = databaseReference.child("SP2020_JmlPendRasio_JumlahPerempuan_Dolopo");
    private DatabaseReference jmlpend_rasioData13 = databaseReference.child("SP2020_JmlPendRasio_JumlahTotal_Dolopo");
    private DatabaseReference jmlpend_rasioData14 = databaseReference.child("SP2020_JmlPendRasio_Persentase_Dolopo");
    private DatabaseReference jmlpend_rasioData15 = databaseReference.child("SP2020_JmlPendRasio_Rasio_Dolopo");

    private DatabaseReference jmlpend_rasioData16 = databaseReference.child("SP2020_JmlPendRasio_JumlahLaki_Dagangan");
    private DatabaseReference jmlpend_rasioData17 = databaseReference.child("SP2020_JmlPendRasio_JumlahPerempuan_Dagangan");
    private DatabaseReference jmlpend_rasioData18 = databaseReference.child("SP2020_JmlPendRasio_JumlahTotal_Dagangan");
    private DatabaseReference jmlpend_rasioData19 = databaseReference.child("SP2020_JmlPendRasio_Persentase_Dagangan");
    private DatabaseReference jmlpend_rasioData20 = databaseReference.child("SP2020_JmlPendRasio_Rasio_Dagangan");

    private DatabaseReference jmlpend_rasioData21 = databaseReference.child("SP2020_JmlPendRasio_JumlahLaki_Wungu");
    private DatabaseReference jmlpend_rasioData22 = databaseReference.child("SP2020_JmlPendRasio_JumlahPerempuan_Wungu");
    private DatabaseReference jmlpend_rasioData23 = databaseReference.child("SP2020_JmlPendRasio_JumlahTotal_Wungu");
    private DatabaseReference jmlpend_rasioData24 = databaseReference.child("SP2020_JmlPendRasio_Persentase_Wungu");
    private DatabaseReference jmlpend_rasioData25 = databaseReference.child("SP2020_JmlPendRasio_Rasio_Wungu");

    private DatabaseReference jmlpend_rasioData26 = databaseReference.child("SP2020_JmlPendRasio_JumlahLaki_Kare");
    private DatabaseReference jmlpend_rasioData27 = databaseReference.child("SP2020_JmlPendRasio_JumlahPerempuan_Kare");
    private DatabaseReference jmlpend_rasioData28 = databaseReference.child("SP2020_JmlPendRasio_JumlahTotal_Kare");
    private DatabaseReference jmlpend_rasioData29 = databaseReference.child("SP2020_JmlPendRasio_Persentase_Kare");
    private DatabaseReference jmlpend_rasioData30 = databaseReference.child("SP2020_JmlPendRasio_Rasio_Kare");

    private DatabaseReference jmlpend_rasioData31 = databaseReference.child("SP2020_JmlPendRasio_JumlahLaki_Gemarang");
    private DatabaseReference jmlpend_rasioData32 = databaseReference.child("SP2020_JmlPendRasio_JumlahPerempuan_Gemarang");
    private DatabaseReference jmlpend_rasioData33 = databaseReference.child("SP2020_JmlPendRasio_JumlahTotal_Gemarang");
    private DatabaseReference jmlpend_rasioData34 = databaseReference.child("SP2020_JmlPendRasio_Persentase_Gemarang");
    private DatabaseReference jmlpend_rasioData35 = databaseReference.child("SP2020_JmlPendRasio_Rasio_Gemarang");

    private DatabaseReference jmlpend_rasioData36 = databaseReference.child("SP2020_JmlPendRasio_JumlahLaki_Saradan");
    private DatabaseReference jmlpend_rasioData37 = databaseReference.child("SP2020_JmlPendRasio_JumlahPerempuan_Saradan");
    private DatabaseReference jmlpend_rasioData38 = databaseReference.child("SP2020_JmlPendRasio_JumlahTotal_Saradan");
    private DatabaseReference jmlpend_rasioData39 = databaseReference.child("SP2020_JmlPendRasio_Persentase_Saradan");
    private DatabaseReference jmlpend_rasioData40 = databaseReference.child("SP2020_JmlPendRasio_Rasio_Saradan");

    private DatabaseReference jmlpend_rasioData41 = databaseReference.child("SP2020_JmlPendRasio_JumlahLaki_Pilangkenceng");
    private DatabaseReference jmlpend_rasioData42 = databaseReference.child("SP2020_JmlPendRasio_JumlahPerempuan_Pilangkenceng");
    private DatabaseReference jmlpend_rasioData43 = databaseReference.child("SP2020_JmlPendRasio_JumlahTotal_Pilangkenceng");
    private DatabaseReference jmlpend_rasioData44 = databaseReference.child("SP2020_JmlPendRasio_Persentase_Pilangkenceng");
    private DatabaseReference jmlpend_rasioData45 = databaseReference.child("SP2020_JmlPendRasio_Rasio_Pilangkenceng");

    private DatabaseReference jmlpend_rasioData46 = databaseReference.child("SP2020_JmlPendRasio_JumlahLaki_Mejayan");
    private DatabaseReference jmlpend_rasioData47 = databaseReference.child("SP2020_JmlPendRasio_JumlahPerempuan_Mejayan");
    private DatabaseReference jmlpend_rasioData48 = databaseReference.child("SP2020_JmlPendRasio_JumlahTotal_Mejayan");
    private DatabaseReference jmlpend_rasioData49 = databaseReference.child("SP2020_JmlPendRasio_Persentase_Mejayan");
    private DatabaseReference jmlpend_rasioData50 = databaseReference.child("SP2020_JmlPendRasio_Rasio_Mejayan");

    private DatabaseReference jmlpend_rasioData51 = databaseReference.child("SP2020_JmlPendRasio_JumlahLaki_Wonoasri");
    private DatabaseReference jmlpend_rasioData52 = databaseReference.child("SP2020_JmlPendRasio_JumlahPerempuan_Wonoasri");
    private DatabaseReference jmlpend_rasioData53 = databaseReference.child("SP2020_JmlPendRasio_JumlahTotal_Wonoasri");
    private DatabaseReference jmlpend_rasioData54 = databaseReference.child("SP2020_JmlPendRasio_Persentase_Wonoasri");
    private DatabaseReference jmlpend_rasioData55 = databaseReference.child("SP2020_JmlPendRasio_Rasio_Wonoasri");

    private DatabaseReference jmlpend_rasioData56 = databaseReference.child("SP2020_JmlPendRasio_JumlahLaki_Balerejo");
    private DatabaseReference jmlpend_rasioData57 = databaseReference.child("SP2020_JmlPendRasio_JumlahPerempuan_Balerejo");
    private DatabaseReference jmlpend_rasioData58 = databaseReference.child("SP2020_JmlPendRasio_JumlahTotal_Balerejo");
    private DatabaseReference jmlpend_rasioData59 = databaseReference.child("SP2020_JmlPendRasio_Persentase_Balerejo");
    private DatabaseReference jmlpend_rasioData60 = databaseReference.child("SP2020_JmlPendRasio_Rasio_Balerejo");

    private DatabaseReference jmlpend_rasioData61 = databaseReference.child("SP2020_JmlPendRasio_JumlahLaki_Madiun");
    private DatabaseReference jmlpend_rasioData62 = databaseReference.child("SP2020_JmlPendRasio_JumlahPerempuan_Madiun");
    private DatabaseReference jmlpend_rasioData63 = databaseReference.child("SP2020_JmlPendRasio_JumlahTotal_Madiun");
    private DatabaseReference jmlpend_rasioData64 = databaseReference.child("SP2020_JmlPendRasio_Persentase_Madiun");
    private DatabaseReference jmlpend_rasioData65 = databaseReference.child("SP2020_JmlPendRasio_Rasio_Madiun");

    private DatabaseReference jmlpend_rasioData66 = databaseReference.child("SP2020_JmlPendRasio_JumlahLaki_Sawahan");
    private DatabaseReference jmlpend_rasioData67 = databaseReference.child("SP2020_JmlPendRasio_JumlahPerempuan_Sawahan");
    private DatabaseReference jmlpend_rasioData68 = databaseReference.child("SP2020_JmlPendRasio_JumlahTotal_Sawahan");
    private DatabaseReference jmlpend_rasioData69 = databaseReference.child("SP2020_JmlPendRasio_Persentase_Sawahan");
    private DatabaseReference jmlpend_rasioData70 = databaseReference.child("SP2020_JmlPendRasio_Rasio_Sawahan");

    private DatabaseReference jmlpend_rasioData71 = databaseReference.child("SP2020_JmlPendRasio_JumlahLaki_Jiwan");
    private DatabaseReference jmlpend_rasioData72 = databaseReference.child("SP2020_JmlPendRasio_JumlahPerempuan_Jiwan");
    private DatabaseReference jmlpend_rasioData73 = databaseReference.child("SP2020_JmlPendRasio_JumlahTotal_Jiwan");
    private DatabaseReference jmlpend_rasioData74 = databaseReference.child("SP2020_JmlPendRasio_Persentase_Jiwan");
    private DatabaseReference jmlpend_rasioData75 = databaseReference.child("SP2020_JmlPendRasio_Rasio_Jiwan");

    private DatabaseReference jmlpend_rasioData76 = databaseReference.child("SP2020_JmlPendRasio_TotalLaki");
    private DatabaseReference jmlpend_rasioData77 = databaseReference.child("SP2020_JmlPendRasio_TotalPerempuan");
    private DatabaseReference jmlpend_rasioData78 = databaseReference.child("SP2020_JmlPendRasio_TotalPenduduk");
    private DatabaseReference jmlpend_rasioData79 = databaseReference.child("SP2020_JmlPendRasio_TotalPersentase");
    private DatabaseReference jmlpend_rasioData80 = databaseReference.child("SP2020_JmlPendRasio_TotalRasio");
    
    
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rasiojk);

        kec_jmlLaki1 = (TextView)findViewById(R.id.kebonsari_laki);
        kec_jmlPerem1 = (TextView)findViewById(R.id.kebonsari_perempuan);
        kec_jmlTot1 = (TextView)findViewById(R.id.kebonsari_jumlahtot);
        kec_persentase1 = (TextView)findViewById(R.id.kebonsari_presentase);
        kec_rasio1 = (TextView)findViewById(R.id.kebonsari_rasio);

        kec_jmlLaki2 = (TextView)findViewById(R.id.geger_laki);
        kec_jmlPerem2 = (TextView)findViewById(R.id.geger_perempuan);
        kec_jmlTot2 = (TextView)findViewById(R.id.geger_jumlahtot);
        kec_persentase2 = (TextView)findViewById(R.id.geger_presentase);
        kec_rasio2 = (TextView)findViewById(R.id.geger_rasio);

        kec_jmlLaki3 = (TextView)findViewById(R.id.dolopo_laki);
        kec_jmlPerem3 = (TextView)findViewById(R.id.dolopo_perempuan);
        kec_jmlTot3 = (TextView)findViewById(R.id.dolopo_jumlahtot);
        kec_persentase3 = (TextView)findViewById(R.id.dolopo_persentase);
        kec_rasio3 = (TextView)findViewById(R.id.dolopo_rasio);

        kec_jmlLaki4 = (TextView)findViewById(R.id.dagangan_laki);
        kec_jmlPerem4 = (TextView)findViewById(R.id.dagangan_perempuan);
        kec_jmlTot4 = (TextView)findViewById(R.id.dagangan_jumlahtot);
        kec_persentase4 = (TextView)findViewById(R.id.dagangan_persentase);
        kec_rasio4 = (TextView)findViewById(R.id.dagangan_rasio);

        kec_jmlLaki5 = (TextView)findViewById(R.id.wungu_laki);
        kec_jmlPerem5 = (TextView)findViewById(R.id.wungu_perempuan);
        kec_jmlTot5 = (TextView)findViewById(R.id.wungu_jumlahtot);
        kec_persentase5 = (TextView)findViewById(R.id.wungu_persentase);
        kec_rasio5 = (TextView)findViewById(R.id.wungu_rasio);

        kec_jmlLaki6 = (TextView)findViewById(R.id.kare_laki);
        kec_jmlPerem6 = (TextView)findViewById(R.id.kare_perempuan);
        kec_jmlTot6 = (TextView)findViewById(R.id.kare_jumlahtot);
        kec_persentase6 = (TextView)findViewById(R.id.kare_persentase);
        kec_rasio6 = (TextView)findViewById(R.id.kare_rasio);

        kec_jmlLaki7 = (TextView)findViewById(R.id.gemarang_laki);
        kec_jmlPerem7 = (TextView)findViewById(R.id.gemarang_perempuan);
        kec_jmlTot7 = (TextView)findViewById(R.id.gemarang_jumlahtot);
        kec_persentase7 = (TextView)findViewById(R.id.gemarang_persentase);
        kec_rasio7 = (TextView)findViewById(R.id.gemarang_rasio);

        kec_jmlLaki8 = (TextView)findViewById(R.id.saradan_laki);
        kec_jmlPerem8 = (TextView)findViewById(R.id.saradan_perempuan);
        kec_jmlTot8 = (TextView)findViewById(R.id.saradan_jumlahtot);
        kec_persentase8 = (TextView)findViewById(R.id.saradan_persentase);
        kec_rasio8 = (TextView)findViewById(R.id.saradan_rasio);

        kec_jmlLaki9 = (TextView)findViewById(R.id.pilangkenceng_laki);
        kec_jmlPerem9 = (TextView)findViewById(R.id.pilangkenceng_perempuan);
        kec_jmlTot9 = (TextView)findViewById(R.id.pilangkenceng_jumlahtot);
        kec_persentase9 = (TextView)findViewById(R.id.pilangkenceng_presentase);
        kec_rasio9 = (TextView)findViewById(R.id.pilangkenceng_rasio);

        kec_jmlLaki10 = (TextView)findViewById(R.id.mejayan_laki);
        kec_jmlPerem10 = (TextView)findViewById(R.id.mejayan_perempuan);
        kec_jmlTot10 = (TextView)findViewById(R.id.mejayan_jumlahtot);
        kec_persentase10 = (TextView)findViewById(R.id.mejayan_presentase);
        kec_rasio10 = (TextView)findViewById(R.id.mejayan_rasio);

        kec_jmlLaki11 = (TextView)findViewById(R.id.wonoasri_laki);
        kec_jmlPerem11 = (TextView)findViewById(R.id.wonoasri_perempuan);
        kec_jmlTot11 = (TextView)findViewById(R.id.wonoasri_jumlahtot);
        kec_persentase11 = (TextView)findViewById(R.id.wonoasri_presentase);
        kec_rasio11 = (TextView)findViewById(R.id.wonoasri_rasio);

        kec_jmlLaki12 = (TextView)findViewById(R.id.balerejo_laki);
        kec_jmlPerem12 = (TextView)findViewById(R.id.balerejo_perempuan);
        kec_jmlTot12 = (TextView)findViewById(R.id.balerejo_jumlahtot);
        kec_persentase12 = (TextView)findViewById(R.id.balerejo_presentase);
        kec_rasio12 = (TextView)findViewById(R.id.balerejo_rasio);

        kec_jmlLaki13 = (TextView)findViewById(R.id.madiun_laki);
        kec_jmlPerem13 = (TextView)findViewById(R.id.madiun_perempuan);
        kec_jmlTot13 = (TextView)findViewById(R.id.madiun_jumlahtot);
        kec_persentase13 = (TextView)findViewById(R.id.madiun_presentase);
        kec_rasio13 = (TextView)findViewById(R.id.madiun_rasio);

        kec_jmlLaki14 = (TextView)findViewById(R.id.sawahan_laki);
        kec_jmlPerem14 = (TextView)findViewById(R.id.sawahan_perempuan);
        kec_jmlTot14 = (TextView)findViewById(R.id.sawahan_jumlahtot);
        kec_persentase14 = (TextView)findViewById(R.id.sawahan_presentase);
        kec_rasio14 = (TextView)findViewById(R.id.sawahan_rasio);

        kec_jmlLaki15 = (TextView)findViewById(R.id.jiwan_laki);
        kec_jmlPerem15 = (TextView)findViewById(R.id.jiwan_perempuan);
        kec_jmlTot15 = (TextView)findViewById(R.id.jiwan_jumlahtot);
        kec_persentase15 = (TextView)findViewById(R.id.jiwan_presentase);
        kec_rasio15 = (TextView)findViewById(R.id.jiwan_rasio);

        kabMadiun_jmlLaki = (TextView)findViewById(R.id.kabmadiun_laki);
        kabMadiun_jmlPerem = (TextView)findViewById(R.id.kabmadiun_perempuan);
        kabMadiun_jmlTot = (TextView)findViewById(R.id.kabmadiun_jumlahtot);
        kabMadiun_persentase = (TextView)findViewById(R.id.kabmadiun_presentase);
        kabMadiun_rasio = (TextView)findViewById(R.id.kabmadiun_rasio);
        

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.rasiojk);
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
        Intent intent = new Intent(RasiojkActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(RasiojkActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(RasiojkActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }


    public void back(View view) {
        Intent intent = new Intent(RasiojkActivity.this, Sp2020Activity.class);
        startActivity(intent);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class) !=null) {

            String key = snapshot.getKey();
            if (key.equals("SP2020_JmlPendRasio_JumlahLaki_Kebonsari")) {

                String jmlpend_rasio1 = snapshot.getValue(String.class);
                kec_jmlLaki1.setText(jmlpend_rasio1);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahPerempuan_Kebonsari")) {

                String jmlpend_rasio2 = snapshot.getValue(String.class);
                kec_jmlPerem1.setText(jmlpend_rasio2);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahTotal_Kebonsari")) {

                String jmlpend_rasio3 = snapshot.getValue(String.class);
                kec_jmlTot1.setText(jmlpend_rasio3);
            }

            if (key.equals("SP2020_JmlPendRasio_Persentase_Kebonsari")) {

                String jmlpend_rasio4 = snapshot.getValue(String.class);
                kec_persentase1.setText(jmlpend_rasio4);
            }

            if (key.equals("SP2020_JmlPendRasio_Rasio_Kebonsari")) {

                String jmlpend_rasio5 = snapshot.getValue(String.class);
                kec_rasio1.setText(jmlpend_rasio5);
            }




            if (key.equals("SP2020_JmlPendRasio_JumlahLaki_Geger")) {

                String jmlpend_rasio6 = snapshot.getValue(String.class);
                kec_jmlLaki2.setText(jmlpend_rasio6);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahPerempuan_Geger")) {

                String jmlpend_rasio7 = snapshot.getValue(String.class);
                kec_jmlPerem2.setText(jmlpend_rasio7);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahTotal_Geger")) {

                String jmlpend_rasio8 = snapshot.getValue(String.class);
                kec_jmlTot2.setText(jmlpend_rasio8);
            }

            if (key.equals("SP2020_JmlPendRasio_Persentase_Geger")) {

                String jmlpend_rasio9 = snapshot.getValue(String.class);
                kec_persentase2.setText(jmlpend_rasio9);
            }

            if (key.equals("SP2020_JmlPendRasio_Rasio_Geger")) {

                String jmlpend_rasio10 = snapshot.getValue(String.class);
                kec_rasio2.setText(jmlpend_rasio10);
            }



            if (key.equals("SP2020_JmlPendRasio_JumlahLaki_Dolopo")) {

                String jmlpend_rasio11 = snapshot.getValue(String.class);
                kec_jmlLaki3.setText(jmlpend_rasio11);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahPerempuan_Dolopo")) {

                String jmlpend_rasio12 = snapshot.getValue(String.class);
                kec_jmlPerem3.setText(jmlpend_rasio12);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahTotal_Dolopo")) {

                String jmlpend_rasio13 = snapshot.getValue(String.class);
                kec_jmlTot3.setText(jmlpend_rasio13);
            }

            if (key.equals("SP2020_JmlPendRasio_Persentase_Dolopo")) {

                String jmlpend_rasio14 = snapshot.getValue(String.class);
                kec_persentase3.setText(jmlpend_rasio14);
            }

            if (key.equals("SP2020_JmlPendRasio_Rasio_Dolopo")) {

                String jmlpend_rasio15 = snapshot.getValue(String.class);
                kec_rasio3.setText(jmlpend_rasio15);
            }



            if (key.equals("SP2020_JmlPendRasio_JumlahLaki_Dagangan")) {

                String jmlpend_rasio16 = snapshot.getValue(String.class);
                kec_jmlLaki4.setText(jmlpend_rasio16);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahPerempuan_Dagangan")) {

                String jmlpend_rasio17 = snapshot.getValue(String.class);
                kec_jmlPerem4.setText(jmlpend_rasio17);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahTotal_Dagangan")) {

                String jmlpend_rasio18 = snapshot.getValue(String.class);
                kec_jmlTot4.setText(jmlpend_rasio18);
            }

            if (key.equals("SP2020_JmlPendRasio_Persentase_Dagangan")) {

                String jmlpend_rasio19 = snapshot.getValue(String.class);
                kec_persentase4.setText(jmlpend_rasio19);
            }

            if (key.equals("SP2020_JmlPendRasio_Rasio_Dagangan")) {

                String jmlpend_rasio20 = snapshot.getValue(String.class);
                kec_rasio4.setText(jmlpend_rasio20);
            }




            if (key.equals("SP2020_JmlPendRasio_JumlahLaki_Wungu")) {

                String jmlpend_rasio21 = snapshot.getValue(String.class);
                kec_jmlLaki5.setText(jmlpend_rasio21);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahPerempuan_Wungu")) {

                String jmlpend_rasio22 = snapshot.getValue(String.class);
                kec_jmlPerem5.setText(jmlpend_rasio22);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahTotal_Wungu")) {

                String jmlpend_rasio23 = snapshot.getValue(String.class);
                kec_jmlTot5.setText(jmlpend_rasio23);
            }

            if (key.equals("SP2020_JmlPendRasio_Persentase_Wungu")) {

                String jmlpend_rasio24 = snapshot.getValue(String.class);
                kec_persentase5.setText(jmlpend_rasio24);
            }

            if (key.equals("SP2020_JmlPendRasio_Rasio_Wungu")) {

                String jmlpend_rasio25 = snapshot.getValue(String.class);
                kec_rasio5.setText(jmlpend_rasio25);
            }




            if (key.equals("SP2020_JmlPendRasio_JumlahLaki_Kare")) {

                String jmlpend_rasio26 = snapshot.getValue(String.class);
                kec_jmlLaki6.setText(jmlpend_rasio26);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahPerempuan_Kare")) {

                String jmlpend_rasio27 = snapshot.getValue(String.class);
                kec_jmlPerem6.setText(jmlpend_rasio27);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahTotal_Kare")) {

                String jmlpend_rasio28 = snapshot.getValue(String.class);
                kec_jmlTot6.setText(jmlpend_rasio28);
            }

            if (key.equals("SP2020_JmlPendRasio_Persentase_Kare")) {

                String jmlpend_rasio29 = snapshot.getValue(String.class);
                kec_persentase6.setText(jmlpend_rasio29);
            }

            if (key.equals("SP2020_JmlPendRasio_Rasio_Kare")) {

                String jmlpend_rasio30 = snapshot.getValue(String.class);
                kec_rasio6.setText(jmlpend_rasio30);
            }




            if (key.equals("SP2020_JmlPendRasio_JumlahLaki_Gemarang")) {

                String jmlpend_rasio31 = snapshot.getValue(String.class);
                kec_jmlLaki7.setText(jmlpend_rasio31);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahPerempuan_Gemarang")) {

                String jmlpend_rasio32 = snapshot.getValue(String.class);
                kec_jmlPerem7.setText(jmlpend_rasio32);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahTotal_Gemarang")) {

                String jmlpend_rasio33 = snapshot.getValue(String.class);
                kec_jmlTot7.setText(jmlpend_rasio33);
            }

            if (key.equals("SP2020_JmlPendRasio_Persentase_Gemarang")) {

                String jmlpend_rasio34 = snapshot.getValue(String.class);
                kec_persentase7.setText(jmlpend_rasio34);
            }

            if (key.equals("SP2020_JmlPendRasio_Rasio_Gemarang")) {

                String jmlpend_rasio35 = snapshot.getValue(String.class);
                kec_rasio7.setText(jmlpend_rasio35);
            }




            if (key.equals("SP2020_JmlPendRasio_JumlahLaki_Saradan")) {

                String jmlpend_rasio36 = snapshot.getValue(String.class);
                kec_jmlLaki8.setText(jmlpend_rasio36);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahPerempuan_Saradan")) {

                String jmlpend_rasio37 = snapshot.getValue(String.class);
                kec_jmlPerem8.setText(jmlpend_rasio37);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahTotal_Saradan")) {

                String jmlpend_rasio38 = snapshot.getValue(String.class);
                kec_jmlTot8.setText(jmlpend_rasio38);
            }

            if (key.equals("SP2020_JmlPendRasio_Persentase_Saradan")) {

                String jmlpend_rasio39 = snapshot.getValue(String.class);
                kec_persentase8.setText(jmlpend_rasio39);
            }

            if (key.equals("SP2020_JmlPendRasio_Rasio_Saradan")) {

                String jmlpend_rasio40 = snapshot.getValue(String.class);
                kec_rasio8.setText(jmlpend_rasio40);
            }




            if (key.equals("SP2020_JmlPendRasio_JumlahLaki_Pilangkenceng")) {

                String jmlpend_rasio41 = snapshot.getValue(String.class);
                kec_jmlLaki9.setText(jmlpend_rasio41);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahPerempuan_Pilangkenceng")) {

                String jmlpend_rasio42 = snapshot.getValue(String.class);
                kec_jmlPerem9.setText(jmlpend_rasio42);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahTotal_Pilangkenceng")) {

                String jmlpend_rasio43 = snapshot.getValue(String.class);
                kec_jmlTot9.setText(jmlpend_rasio43);
            }

            if (key.equals("SP2020_JmlPendRasio_Persentase_Pilangkenceng")) {

                String jmlpend_rasio44 = snapshot.getValue(String.class);
                kec_persentase9.setText(jmlpend_rasio44);
            }

            if (key.equals("SP2020_JmlPendRasio_Rasio_Pilangkenceng")) {

                String jmlpend_rasio45 = snapshot.getValue(String.class);
                kec_rasio9.setText(jmlpend_rasio45);
            }




            if (key.equals("SP2020_JmlPendRasio_JumlahLaki_Mejayan")) {

                String jmlpend_rasio46 = snapshot.getValue(String.class);
                kec_jmlLaki10.setText(jmlpend_rasio46);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahPerempuan_Mejayan")) {

                String jmlpend_rasio47 = snapshot.getValue(String.class);
                kec_jmlPerem10.setText(jmlpend_rasio47);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahTotal_Mejayan")) {

                String jmlpend_rasio48 = snapshot.getValue(String.class);
                kec_jmlTot10.setText(jmlpend_rasio48);
            }

            if (key.equals("SP2020_JmlPendRasio_Persentase_Mejayan")) {

                String jmlpend_rasio49 = snapshot.getValue(String.class);
                kec_persentase10.setText(jmlpend_rasio49);
            }

            if (key.equals("SP2020_JmlPendRasio_Rasio_Mejayan")) {

                String jmlpend_rasio50 = snapshot.getValue(String.class);
                kec_rasio10.setText(jmlpend_rasio50);
            }




            if (key.equals("SP2020_JmlPendRasio_JumlahLaki_Wonoasri")) {

                String jmlpend_rasio51 = snapshot.getValue(String.class);
                kec_jmlLaki11.setText(jmlpend_rasio51);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahPerempuan_Wonoasri")) {

                String jmlpend_rasio52 = snapshot.getValue(String.class);
                kec_jmlPerem11.setText(jmlpend_rasio52);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahTotal_Wonoasri")) {

                String jmlpend_rasio53 = snapshot.getValue(String.class);
                kec_jmlTot11.setText(jmlpend_rasio53);
            }

            if (key.equals("SP2020_JmlPendRasio_Persentase_Wonoasri")) {

                String jmlpend_rasio54 = snapshot.getValue(String.class);
                kec_persentase11.setText(jmlpend_rasio54);
            }

            if (key.equals("SP2020_JmlPendRasio_Rasio_Wonoasri")) {

                String jmlpend_rasio55 = snapshot.getValue(String.class);
                kec_rasio11.setText(jmlpend_rasio55);
            }




            if (key.equals("SP2020_JmlPendRasio_JumlahLaki_Balerejo")) {

                String jmlpend_rasio56 = snapshot.getValue(String.class);
                kec_jmlLaki12.setText(jmlpend_rasio56);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahPerempuan_Balerejo")) {

                String jmlpend_rasio57 = snapshot.getValue(String.class);
                kec_jmlPerem12.setText(jmlpend_rasio57);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahTotal_Balerejo")) {

                String jmlpend_rasio58 = snapshot.getValue(String.class);
                kec_jmlTot12.setText(jmlpend_rasio58);
            }

            if (key.equals("SP2020_JmlPendRasio_Persentase_Balerejo")) {

                String jmlpend_rasio59 = snapshot.getValue(String.class);
                kec_persentase12.setText(jmlpend_rasio59);
            }

            if (key.equals("SP2020_JmlPendRasio_Rasio_Balerejo")) {

                String jmlpend_rasio60 = snapshot.getValue(String.class);
                kec_rasio12.setText(jmlpend_rasio60);
            }




            if (key.equals("SP2020_JmlPendRasio_JumlahLaki_Madiun")) {

                String jmlpend_rasio61 = snapshot.getValue(String.class);
                kec_jmlLaki13.setText(jmlpend_rasio61);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahPerempuan_Madiun")) {

                String jmlpend_rasio62 = snapshot.getValue(String.class);
                kec_jmlPerem13.setText(jmlpend_rasio62);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahTotal_Madiun")) {

                String jmlpend_rasio63 = snapshot.getValue(String.class);
                kec_jmlTot13.setText(jmlpend_rasio63);
            }

            if (key.equals("SP2020_JmlPendRasio_Persentase_Madiun")) {

                String jmlpend_rasio64 = snapshot.getValue(String.class);
                kec_persentase13.setText(jmlpend_rasio64);
            }

            if (key.equals("SP2020_JmlPendRasio_Rasio_Madiun")) {

                String jmlpend_rasio65 = snapshot.getValue(String.class);
                kec_rasio13.setText(jmlpend_rasio65);
            }




            if (key.equals("SP2020_JmlPendRasio_JumlahLaki_Sawahan")) {

                String jmlpend_rasio66 = snapshot.getValue(String.class);
                kec_jmlLaki14.setText(jmlpend_rasio66);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahPerempuan_Sawahan")) {

                String jmlpend_rasio67 = snapshot.getValue(String.class);
                kec_jmlPerem14.setText(jmlpend_rasio67);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahTotal_Sawahan")) {

                String jmlpend_rasio68 = snapshot.getValue(String.class);
                kec_jmlTot14.setText(jmlpend_rasio68);
            }

            if (key.equals("SP2020_JmlPendRasio_Persentase_Sawahan")) {

                String jmlpend_rasio69 = snapshot.getValue(String.class);
                kec_persentase14.setText(jmlpend_rasio69);
            }

            if (key.equals("SP2020_JmlPendRasio_Rasio_Sawahan")) {

                String jmlpend_rasio70 = snapshot.getValue(String.class);
                kec_rasio14.setText(jmlpend_rasio70);
            }




            if (key.equals("SP2020_JmlPendRasio_JumlahLaki_Jiwan")) {

                String jmlpend_rasio71 = snapshot.getValue(String.class);
                kec_jmlLaki15.setText(jmlpend_rasio71);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahPerempuan_Jiwan")) {

                String jmlpend_rasio72 = snapshot.getValue(String.class);
                kec_jmlPerem15.setText(jmlpend_rasio72);
            }

            if (key.equals("SP2020_JmlPendRasio_JumlahTotal_Jiwan")) {

                String jmlpend_rasio73 = snapshot.getValue(String.class);
                kec_jmlTot15.setText(jmlpend_rasio73);
            }

            if (key.equals("SP2020_JmlPendRasio_Persentase_Jiwan")) {

                String jmlpend_rasio74 = snapshot.getValue(String.class);
                kec_persentase15.setText(jmlpend_rasio74);
            }

            if (key.equals("SP2020_JmlPendRasio_Rasio_Jiwan")) {

                String jmlpend_rasio75 = snapshot.getValue(String.class);
                kec_rasio15.setText(jmlpend_rasio75);
            }




            if (key.equals("SP2020_JmlPendRasio_TotalLaki")) {

                String jmlpend_rasio76 = snapshot.getValue(String.class);
                kabMadiun_jmlLaki.setText(jmlpend_rasio76);
            }

            if (key.equals("SP2020_JmlPendRasio_TotalPerempuan")) {

                String jmlpend_rasio77 = snapshot.getValue(String.class);
                kabMadiun_jmlPerem.setText(jmlpend_rasio77);
            }

            if (key.equals("SP2020_JmlPendRasio_TotalPenduduk")) {

                String jmlpend_rasio78 = snapshot.getValue(String.class);
                kabMadiun_jmlTot.setText(jmlpend_rasio78);
            }

            if (key.equals("SP2020_JmlPendRasio_TotalPersentase")) {

                String jmlpend_rasio79 = snapshot.getValue(String.class);
                kabMadiun_persentase.setText(jmlpend_rasio79);
            }

            if (key.equals("SP2020_JmlPendRasio_TotalRasio")) {

                String jmlpend_rasio80 = snapshot.getValue(String.class);
                kabMadiun_rasio.setText(jmlpend_rasio80);
            }

        }
        
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        jmlpend_rasioData1.addValueEventListener(this);
        jmlpend_rasioData2.addValueEventListener(this);
        jmlpend_rasioData3.addValueEventListener(this);
        jmlpend_rasioData4.addValueEventListener(this);
        jmlpend_rasioData5.addValueEventListener(this);

        jmlpend_rasioData6.addValueEventListener(this);
        jmlpend_rasioData7.addValueEventListener(this);
        jmlpend_rasioData8.addValueEventListener(this);
        jmlpend_rasioData9.addValueEventListener(this);
        jmlpend_rasioData10.addValueEventListener(this);

        jmlpend_rasioData11.addValueEventListener(this);
        jmlpend_rasioData12.addValueEventListener(this);
        jmlpend_rasioData13.addValueEventListener(this);
        jmlpend_rasioData14.addValueEventListener(this);
        jmlpend_rasioData15.addValueEventListener(this);

        jmlpend_rasioData16.addValueEventListener(this);
        jmlpend_rasioData17.addValueEventListener(this);
        jmlpend_rasioData18.addValueEventListener(this);
        jmlpend_rasioData19.addValueEventListener(this);
        jmlpend_rasioData20.addValueEventListener(this);

        jmlpend_rasioData21.addValueEventListener(this);
        jmlpend_rasioData22.addValueEventListener(this);
        jmlpend_rasioData23.addValueEventListener(this);
        jmlpend_rasioData24.addValueEventListener(this);
        jmlpend_rasioData25.addValueEventListener(this);

        jmlpend_rasioData26.addValueEventListener(this);
        jmlpend_rasioData27.addValueEventListener(this);
        jmlpend_rasioData28.addValueEventListener(this);
        jmlpend_rasioData29.addValueEventListener(this);
        jmlpend_rasioData30.addValueEventListener(this);

        jmlpend_rasioData31.addValueEventListener(this);
        jmlpend_rasioData32.addValueEventListener(this);
        jmlpend_rasioData33.addValueEventListener(this);
        jmlpend_rasioData34.addValueEventListener(this);
        jmlpend_rasioData35.addValueEventListener(this);

        jmlpend_rasioData36.addValueEventListener(this);
        jmlpend_rasioData37.addValueEventListener(this);
        jmlpend_rasioData38.addValueEventListener(this);
        jmlpend_rasioData39.addValueEventListener(this);
        jmlpend_rasioData40.addValueEventListener(this);

        jmlpend_rasioData41.addValueEventListener(this);
        jmlpend_rasioData42.addValueEventListener(this);
        jmlpend_rasioData43.addValueEventListener(this);
        jmlpend_rasioData44.addValueEventListener(this);
        jmlpend_rasioData45.addValueEventListener(this);

        jmlpend_rasioData46.addValueEventListener(this);
        jmlpend_rasioData47.addValueEventListener(this);
        jmlpend_rasioData48.addValueEventListener(this);
        jmlpend_rasioData49.addValueEventListener(this);
        jmlpend_rasioData50.addValueEventListener(this);

        jmlpend_rasioData51.addValueEventListener(this);
        jmlpend_rasioData52.addValueEventListener(this);
        jmlpend_rasioData53.addValueEventListener(this);
        jmlpend_rasioData54.addValueEventListener(this);
        jmlpend_rasioData55.addValueEventListener(this);

        jmlpend_rasioData56.addValueEventListener(this);
        jmlpend_rasioData57.addValueEventListener(this);
        jmlpend_rasioData58.addValueEventListener(this);
        jmlpend_rasioData59.addValueEventListener(this);
        jmlpend_rasioData60.addValueEventListener(this);

        jmlpend_rasioData61.addValueEventListener(this);
        jmlpend_rasioData62.addValueEventListener(this);
        jmlpend_rasioData63.addValueEventListener(this);
        jmlpend_rasioData64.addValueEventListener(this);
        jmlpend_rasioData65.addValueEventListener(this);

        jmlpend_rasioData66.addValueEventListener(this);
        jmlpend_rasioData67.addValueEventListener(this);
        jmlpend_rasioData68.addValueEventListener(this);
        jmlpend_rasioData69.addValueEventListener(this);
        jmlpend_rasioData70.addValueEventListener(this);

        jmlpend_rasioData71.addValueEventListener(this);
        jmlpend_rasioData72.addValueEventListener(this);
        jmlpend_rasioData73.addValueEventListener(this);
        jmlpend_rasioData74.addValueEventListener(this);
        jmlpend_rasioData75.addValueEventListener(this);

        jmlpend_rasioData76.addValueEventListener(this);
        jmlpend_rasioData77.addValueEventListener(this);
        jmlpend_rasioData78.addValueEventListener(this);
        jmlpend_rasioData79.addValueEventListener(this);
        jmlpend_rasioData80.addValueEventListener(this);
    }
    
}