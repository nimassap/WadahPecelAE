package wadah.pecel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class InfografisTambah3 extends AppCompatActivity {

    ImageView gambarbaru_infografis3;
    TextView tambahtext3baru1, tambahtext3baru2, tambahtext3baru3, tambahtext3baru4, tambahtext3baru5, tambahtext3baru6, tambahtext3baru7;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference infografisGambarbaru3 = databaseReference.child("infografis_tambahgambar3");
    private DatabaseReference infografistext3baru1 = databaseReference.child("infografisbaru3_text1");
    private DatabaseReference infografistext3baru2 = databaseReference.child("infografisbaru3_text2");
    private DatabaseReference infografistext3baru3 = databaseReference.child("infografisbaru3_text3");
    private DatabaseReference infografistext3baru4 = databaseReference.child("infografisbaru3_text4");
    private DatabaseReference infografistext3baru5 = databaseReference.child("infografisbaru3_text5");
    private DatabaseReference infografistext3baru6 = databaseReference.child("infografisbaru3_text6");
    private DatabaseReference infografistext3baru7 = databaseReference.child("infografisbaru3_text7");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infografis_tambah3);

        gambarbaru_infografis3 = (ImageView)findViewById(R.id.infografis_gambarbaru3);

        tambahtext3baru1 = (TextView)findViewById(R.id.text3_infografisbaru1);
        tambahtext3baru2 = (TextView)findViewById(R.id.text3_infografisbaru2);
        tambahtext3baru3 = (TextView)findViewById(R.id.text3_infografisbaru3);
        tambahtext3baru4 = (TextView)findViewById(R.id.text3_infografisbaru4);
        tambahtext3baru5 = (TextView)findViewById(R.id.text3_infografisbaru5);
        tambahtext3baru6 = (TextView)findViewById(R.id.text3_infografisbaru6);
        tambahtext3baru7 = (TextView)findViewById(R.id.text3_infografisbaru7);

        infografisGambarbaru3.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String link3 = snapshot.getValue(String.class);
                Picasso.get().load(link3).into(gambarbaru_infografis3);
            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(InfografisTambah3.this,"Error Loading Image", Toast.LENGTH_SHORT).show();

            }
        });

        infografistext3baru1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru3text1 = snapshot.getValue(String.class);
                tambahtext3baru1.setText(baru3text1);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah3.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografistext3baru2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru3text2 = snapshot.getValue(String.class);
                tambahtext3baru2.setText(baru3text2);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah3.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografistext3baru3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru3text3 = snapshot.getValue(String.class);
                tambahtext3baru3.setText(baru3text3);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah3.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografistext3baru4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru3text4 = snapshot.getValue(String.class);
                tambahtext3baru4.setText(baru3text4);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah3.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografistext3baru5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru3text5 = snapshot.getValue(String.class);
                tambahtext3baru5.setText(baru3text5);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah3.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografistext3baru6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru3text6 = snapshot.getValue(String.class);
                tambahtext3baru6.setText(baru3text6);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah3.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografistext3baru7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru3text7 = snapshot.getValue(String.class);
                tambahtext3baru7.setText(baru3text7);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah3.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.infografis_baru3);
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

    public void infografis_gambarbaru3(View view) {
        Intent intent = new Intent(InfografisTambah3.this, Infografis_Gambarbaru3.class);
        startActivity(intent);
    }

    public void Home(View view) {
        Intent intent = new Intent(InfografisTambah3.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(InfografisTambah3.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(InfografisTambah3.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }
        
    
}