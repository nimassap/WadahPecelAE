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

public class SpgenerasiActivity extends AppCompatActivity implements ValueEventListener {

    TextView gen_jmlLaki1, gen_jmlLaki2, gen_jmlLaki3, gen_jmlLaki4, gen_jmlLaki5, gen_jmlLaki6,
            gen_jmlPerem1, gen_jmlPerem2, gen_jmlPerem3, gen_jmlPerem4, gen_jmlPerem5, gen_jmlPerem6,
            gen_jmlTotal1, gen_jmlTotal2, gen_jmlTotal3, gen_jmlTotal4, gen_jmlTotal5, gen_jmlTotal6,
            jmlTot_Laki, jmlTot_Perem, jmlTot_Pend;
            

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference jmlpend_genData1 = databaseReference.child("SP2020_JmlPendGen_JumlahLaki_PostGenZ");
    private DatabaseReference jmlpend_genData2 = databaseReference.child("SP2020_JmlPendGen_JumlahPerempuan_PostGenZ");
    private DatabaseReference jmlpend_genData3 = databaseReference.child("SP2020_JmlPendGen_JumlahTotal_PostGenZ");

    private DatabaseReference jmlpend_genData4 = databaseReference.child("SP2020_JmlPendGen_JumlahLaki_GenZ");
    private DatabaseReference jmlpend_genData5 = databaseReference.child("SP2020_JmlPendGen_JumlahPerempuan_GenZ");
    private DatabaseReference jmlpend_genData6 = databaseReference.child("SP2020_JmlPendGen_JumlahTotal_GenZ");

    private DatabaseReference jmlpend_genData7 = databaseReference.child("SP2020_JmlPendGen_JumlahLaki_Milenial");
    private DatabaseReference jmlpend_genData8 = databaseReference.child("SP2020_JmlPendGen_JumlahPerempuan_Milenial");
    private DatabaseReference jmlpend_genData9 = databaseReference.child("SP2020_JmlPendGen_JumlahTotal_Milenial");

    private DatabaseReference jmlpend_genData10 = databaseReference.child("SP2020_JmlPendGen_JumlahLaki_GenX");
    private DatabaseReference jmlpend_genData11 = databaseReference.child("SP2020_JmlPendGen_JumlahPerempuan_GenX");
    private DatabaseReference jmlpend_genData12 = databaseReference.child("SP2020_JmlPendGen_JumlahTotal_GenX");

    private DatabaseReference jmlpend_genData13 = databaseReference.child("SP2020_JmlPendGen_JumlahLaki_Boomer");
    private DatabaseReference jmlpend_genData14 = databaseReference.child("SP2020_JmlPendGen_JumlahPerempuan_Boomer");
    private DatabaseReference jmlpend_genData15 = databaseReference.child("SP2020_JmlPendGen_JumlahTotal_Boomer");

    private DatabaseReference jmlpend_genData16 = databaseReference.child("SP2020_JmlPendGen_JumlahLaki_PreBoomer");
    private DatabaseReference jmlpend_genData17 = databaseReference.child("SP2020_JmlPendGen_JumlahPerempuan_PreBoomer");
    private DatabaseReference jmlpend_genData18 = databaseReference.child("SP2020_JmlPendGen_JumlahTotal_PreBoomer");;

    private DatabaseReference jmlpend_genData19 = databaseReference.child("SP2020_JmlPendGen_TotalLaki");
    private DatabaseReference jmlpend_genData20 = databaseReference.child("SP2020_JmlPendGen_TotalPerempuan");
    private DatabaseReference jmlpend_genData21 = databaseReference.child("SP2020_JmlPendGen_Totaljmlpend_gen");


    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spgenerasi);

        gen_jmlLaki1 = (TextView)findViewById(R.id.PGenZ_Laki);
        gen_jmlPerem1 = (TextView)findViewById(R.id.PGenZ_Perem);
        gen_jmlTotal1 = (TextView)findViewById(R.id.PGenZ_Total);

        gen_jmlLaki2 = (TextView)findViewById(R.id.GenZ_Laki);
        gen_jmlPerem2 = (TextView)findViewById(R.id.GenZ_Perem);
        gen_jmlTotal2 = (TextView)findViewById(R.id.GenZ_Total);

        gen_jmlLaki3 = (TextView)findViewById(R.id.milenial_Laki);
        gen_jmlPerem3 = (TextView)findViewById(R.id.milenial_Perem);
        gen_jmlTotal3 = (TextView)findViewById(R.id.milenial_Total);

        gen_jmlLaki4 = (TextView)findViewById(R.id.GenX_Laki);
        gen_jmlPerem4 = (TextView)findViewById(R.id.GenX_Perem);
        gen_jmlTotal4 = (TextView)findViewById(R.id.GenX_Total);

        gen_jmlLaki5 = (TextView)findViewById(R.id.Boomer_Laki);
        gen_jmlPerem5 = (TextView)findViewById(R.id.Boomer_Perem);
        gen_jmlTotal5 = (TextView)findViewById(R.id.Boomer_Total);

        gen_jmlLaki6 = (TextView)findViewById(R.id.PBoomer_Laki);
        gen_jmlPerem6 = (TextView)findViewById(R.id.PBoomer_Perem);
        gen_jmlTotal6 = (TextView)findViewById(R.id.PBoomer_Total);

        jmlTot_Laki = (TextView)findViewById(R.id.GenerasiTotal_Laki);
        jmlTot_Perem = (TextView)findViewById(R.id.GenerasiTotal_Perem);
        jmlTot_Pend = (TextView)findViewById(R.id.GenerasiTotal_Semua);

        
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.spgenerasi);
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
        Intent intent = new Intent(SpgenerasiActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(SpgenerasiActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(SpgenerasiActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }


    public void back(View view) {
        Intent intent = new Intent(SpgenerasiActivity.this, Sp2020Activity.class);
        startActivity(intent);
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class) !=null) {

            String key = snapshot.getKey();
            if (key.equals("SP2020_JmlPendGen_JumlahLaki_PostGenZ")) {

                String jmlpend_gen1 = snapshot.getValue(String.class);
                gen_jmlLaki1.setText(jmlpend_gen1);
            }

            if (key.equals("SP2020_JmlPendGen_JumlahPerempuan_PostGenZ")) {

                String jmlpend_gen2 = snapshot.getValue(String.class);
                gen_jmlPerem1.setText(jmlpend_gen2);
            }

            if (key.equals("SP2020_JmlPendGen_JumlahTotal_PostGenZ")) {

                String jmlpend_gen3 = snapshot.getValue(String.class);
                gen_jmlTotal1.setText(jmlpend_gen3);
            }
            



            if (key.equals("SP2020_JmlPendGen_JumlahLaki_GenZ")) {

                String jmlpend_gen4 = snapshot.getValue(String.class);
                gen_jmlLaki2.setText(jmlpend_gen4);
            }

            if (key.equals("SP2020_JmlPendGen_JumlahPerempuan_GenZ")) {

                String jmlpend_gen5 = snapshot.getValue(String.class);
                gen_jmlPerem2.setText(jmlpend_gen5);
            }

            if (key.equals("SP2020_JmlPendGen_JumlahTotal_GenZ")) {

                String jmlpend_gen6 = snapshot.getValue(String.class);
                gen_jmlTotal2.setText(jmlpend_gen6);
            }

            
            

            if (key.equals("SP2020_JmlPendGen_JumlahLaki_Milenial")) {

                String jmlpend_gen7 = snapshot.getValue(String.class);
                gen_jmlLaki3.setText(jmlpend_gen7);
            }

            if (key.equals("SP2020_JmlPendGen_JumlahPerempuan_Milenial")) {

                String jmlpend_gen8 = snapshot.getValue(String.class);
                gen_jmlPerem3.setText(jmlpend_gen8);
            }

            if (key.equals("SP2020_JmlPendGen_JumlahTotal_Milenial")) {

                String jmlpend_gen9 = snapshot.getValue(String.class);
                gen_jmlTotal3.setText(jmlpend_gen9);
            }
            



            if (key.equals("SP2020_JmlPendGen_JumlahLaki_GenX")) {

                String jmlpend_gen10 = snapshot.getValue(String.class);
                gen_jmlLaki4.setText(jmlpend_gen10);
            }

            if (key.equals("SP2020_JmlPendGen_JumlahPerempuan_GenX")) {

                String jmlpend_gen11 = snapshot.getValue(String.class);
                gen_jmlPerem4.setText(jmlpend_gen11);
            }

            if (key.equals("SP2020_JmlPendGen_JumlahTotal_GenX")) {

                String jmlpend_gen12 = snapshot.getValue(String.class);
                gen_jmlTotal4.setText(jmlpend_gen12);
            }
            



            if (key.equals("SP2020_JmlPendGen_JumlahLaki_Boomer")) {

                String jmlpend_gen13 = snapshot.getValue(String.class);
                gen_jmlLaki5.setText(jmlpend_gen13);
            }

            if (key.equals("SP2020_JmlPendGen_JumlahPerempuan_Boomer")) {

                String jmlpend_gen14 = snapshot.getValue(String.class);
                gen_jmlPerem5.setText(jmlpend_gen14);
            }

            if (key.equals("SP2020_JmlPendGen_JumlahTotal_Boomer")) {

                String jmlpend_gen15 = snapshot.getValue(String.class);
                gen_jmlTotal5.setText(jmlpend_gen15);
            }
            



            if (key.equals("SP2020_JmlPendGen_JumlahLaki_PreBoomer")) {

                String jmlpend_gen16 = snapshot.getValue(String.class);
                gen_jmlLaki6.setText(jmlpend_gen16);
            }

            if (key.equals("SP2020_JmlPendGen_JumlahPerempuan_PreBoomer")) {

                String jmlpend_gen17 = snapshot.getValue(String.class);
                gen_jmlPerem6.setText(jmlpend_gen17);
            }

            if (key.equals("SP2020_JmlPendGen_JumlahTotal_PreBoomer")) {

                String jmlpend_gen18 = snapshot.getValue(String.class);
                gen_jmlTotal6.setText(jmlpend_gen18);
            }




            if (key.equals("SP2020_JmlPendGen_TotalLaki")) {

                String jmlpend_gen19 = snapshot.getValue(String.class);
                jmlTot_Laki.setText(jmlpend_gen19);
            }

            if (key.equals("SP2020_JmlPendGen_TotalPerempuan")) {

                String jmlpend_gen20 = snapshot.getValue(String.class);
                jmlTot_Perem.setText(jmlpend_gen20);
            }

            if (key.equals("SP2020_JmlPendGen_Totaljmlpend_gen")) {

                String jmlpend_gen21 = snapshot.getValue(String.class);
                jmlTot_Pend.setText(jmlpend_gen21);
            }
        }
        
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        jmlpend_genData1.addValueEventListener(this);
        jmlpend_genData2.addValueEventListener(this);
        jmlpend_genData3.addValueEventListener(this);
        jmlpend_genData4.addValueEventListener(this);
        jmlpend_genData5.addValueEventListener(this);

        jmlpend_genData6.addValueEventListener(this);
        jmlpend_genData7.addValueEventListener(this);
        jmlpend_genData8.addValueEventListener(this);
        jmlpend_genData9.addValueEventListener(this);
        jmlpend_genData10.addValueEventListener(this);

        jmlpend_genData11.addValueEventListener(this);
        jmlpend_genData12.addValueEventListener(this);
        jmlpend_genData13.addValueEventListener(this);
        jmlpend_genData14.addValueEventListener(this);
        jmlpend_genData15.addValueEventListener(this);

        jmlpend_genData16.addValueEventListener(this);
        jmlpend_genData17.addValueEventListener(this);
        jmlpend_genData18.addValueEventListener(this);
        jmlpend_genData19.addValueEventListener(this);
        jmlpend_genData20.addValueEventListener(this);

        jmlpend_genData21.addValueEventListener(this);

    }
    
}