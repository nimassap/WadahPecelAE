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

public class InfoipmActivity extends AppCompatActivity implements ValueEventListener{

    TextView textIPM1, textIPM2, textIPM3,textIPM4,textIPM5,textIPM6,textIPM7;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference IPMData1 = databaseReference.child("Infografis_IPM_Paragraf1");
    private DatabaseReference IPMData2 = databaseReference.child("Infografis_IPM_Paragraf2");
    private DatabaseReference IPMData3 = databaseReference.child("Infografis_IPM_Paragraf3");
    private DatabaseReference IPMData4 = databaseReference.child("Infografis_IPM_Paragraf4");
    private DatabaseReference IPMData5 = databaseReference.child("Infografis_IPM_Paragraf5");
    private DatabaseReference IPMData6 = databaseReference.child("Infografis_IPM_Paragraf6");
    private DatabaseReference IPMData7 = databaseReference.child("Infografis_IPM_Paragraf7");

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infoipm);

        textIPM1 = (TextView)findViewById(R.id.text_infoipm1);
        textIPM2 = (TextView)findViewById(R.id.text_infoipm2);
        textIPM3 = (TextView)findViewById(R.id.text_infoipm3);
        textIPM4 = (TextView)findViewById(R.id.text_infoipm4);
        textIPM5 = (TextView)findViewById(R.id.text_infoipm5);
        textIPM6 = (TextView)findViewById(R.id.text_infoipm6);
        textIPM7 = (TextView)findViewById(R.id.text_infoipm7);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.infoipm);
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
        Intent intent = new Intent(InfoipmActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(InfoipmActivity.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(InfoipmActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }

    public void ipm2(View view) {
        Intent intent = new Intent(InfoipmActivity.this, InfoipmGambar.class);
        startActivity(intent);
    }


    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class) !=null){

            String key = snapshot.getKey();
            if (key.equals("Infografis_IPM_Paragraf1")){

                String IPM1 = snapshot.getValue(String.class);
                textIPM1.setText(IPM1);
            }

            if (key.equals("Infografis_IPM_Paragraf2")){

                String IPM2 = snapshot.getValue(String.class);
                textIPM2.setText(IPM2);
            }

            if (key.equals("Infografis_IPM_Paragraf3")){

                String IPM3 = snapshot.getValue(String.class);
                textIPM3.setText(IPM3);
            }

            if (key.equals("Infografis_IPM_Paragraf4")){

                String IPM4 = snapshot.getValue(String.class);
                textIPM4.setText(IPM4);
            }

            if (key.equals("Infografis_IPM_Paragraf5")){

                String IPM5 = snapshot.getValue(String.class);
                textIPM5.setText(IPM5);
            }

            if (key.equals("Infografis_IPM_Paragraf6")){

                String IPM6 = snapshot.getValue(String.class);
                textIPM6.setText(IPM6);
            }

            if (key.equals("Infografis_IPM_Paragraf7")){

                String IPM7 = snapshot.getValue(String.class);
                textIPM7.setText(IPM7);
            }
        }

    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }

    @Override
    protected void onStart(){
        super.onStart();
        IPMData1.addValueEventListener((ValueEventListener) this);
        IPMData2.addValueEventListener((ValueEventListener) this);
        IPMData3.addValueEventListener((ValueEventListener) this);
        IPMData4.addValueEventListener((ValueEventListener) this);
        IPMData5.addValueEventListener((ValueEventListener) this);
        IPMData6.addValueEventListener((ValueEventListener) this);
        IPMData7.addValueEventListener((ValueEventListener) this);
    }



}