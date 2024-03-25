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

public class InfografisTambah5 extends AppCompatActivity {

    ImageView gambarbaru_infografis5;
    TextView tambahtext5baru1, tambahtext5baru2, tambahtext5baru3, tambahtext5baru4, tambahtext5baru5, tambahtext5baru6, tambahtext5baru7;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference infografisGambarbaru5 = databaseReference.child("infografis_tambahgambar5");
    private DatabaseReference infografistext5baru1 = databaseReference.child("infografisbaru5_text1");
    private DatabaseReference infografistext5baru2 = databaseReference.child("infografisbaru5_text2");
    private DatabaseReference infografistext5baru3 = databaseReference.child("infografisbaru5_text3");
    private DatabaseReference infografistext5baru4 = databaseReference.child("infografisbaru5_text4");
    private DatabaseReference infografistext5baru5 = databaseReference.child("infografisbaru5_text5");
    private DatabaseReference infografistext5baru6 = databaseReference.child("infografisbaru5_text6");
    private DatabaseReference infografistext5baru7 = databaseReference.child("infografisbaru5_text7");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infografis_tambah5);

        gambarbaru_infografis5 = (ImageView)findViewById(R.id.infografis_gambarbaru5);

        tambahtext5baru1 = (TextView)findViewById(R.id.text5_infografisbaru1);
        tambahtext5baru2 = (TextView)findViewById(R.id.text5_infografisbaru2);
        tambahtext5baru3 = (TextView)findViewById(R.id.text5_infografisbaru3);
        tambahtext5baru4 = (TextView)findViewById(R.id.text5_infografisbaru4);
        tambahtext5baru5 = (TextView)findViewById(R.id.text5_infografisbaru5);
        tambahtext5baru6 = (TextView)findViewById(R.id.text5_infografisbaru6);
        tambahtext5baru7 = (TextView)findViewById(R.id.text5_infografisbaru7);

        infografisGambarbaru5.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String link5 = snapshot.getValue(String.class);
                Picasso.get().load(link5).into(gambarbaru_infografis5);
            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(InfografisTambah5.this,"Error Loading Image", Toast.LENGTH_SHORT).show();

            }
        });

        infografistext5baru1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru5text1 = snapshot.getValue(String.class);
                tambahtext5baru1.setText(baru5text1);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah5.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografistext5baru2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru5text2 = snapshot.getValue(String.class);
                tambahtext5baru2.setText(baru5text2);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah5.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografistext5baru3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru5text3 = snapshot.getValue(String.class);
                tambahtext5baru3.setText(baru5text3);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah5.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografistext5baru4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru5text4 = snapshot.getValue(String.class);
                tambahtext5baru4.setText(baru5text4);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah5.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografistext5baru5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru5text5 = snapshot.getValue(String.class);
                tambahtext5baru5.setText(baru5text5);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah5.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografistext5baru6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru5text6 = snapshot.getValue(String.class);
                tambahtext5baru6.setText(baru5text6);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah5.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografistext5baru7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru5text7 = snapshot.getValue(String.class);
                tambahtext5baru7.setText(baru5text7);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah5.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.infografis_baru5);
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

    public void infografis_gambarbaru5(View view) {
        Intent intent = new Intent(InfografisTambah5.this, Infografis_Gambarbaru5.class);
        startActivity(intent);
    }

    public void Home(View view) {
        Intent intent = new Intent(InfografisTambah5.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(InfografisTambah5.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(InfografisTambah5.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }
        

}