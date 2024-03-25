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

public class InfografisTambah2 extends AppCompatActivity {

    ImageView gambarbaru_infografis2;
    TextView tambahtext2baru1, tambahtext2baru2, tambahtext2baru3, tambahtext2baru4, tambahtext2baru5, tambahtext2baru6, tambahtext2baru7;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference infografisGambarbaru2 = databaseReference.child("infografis_tambahgambar2");
    private DatabaseReference infografisText2baru1 = databaseReference.child("infografisbaru2_text1");
    private DatabaseReference infografisText2baru2 = databaseReference.child("infografisbaru2_text2");
    private DatabaseReference infografisText2baru3 = databaseReference.child("infografisbaru2_text3");
    private DatabaseReference infografisText2baru4 = databaseReference.child("infografisbaru2_text4");
    private DatabaseReference infografisText2baru5 = databaseReference.child("infografisbaru2_text5");
    private DatabaseReference infografisText2baru6 = databaseReference.child("infografisbaru2_text6");
    private DatabaseReference infografisText2baru7 = databaseReference.child("infografisbaru2_text7");

    BottomNavigationView bottomNavigationView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infografis_tambah2);

        gambarbaru_infografis2 = (ImageView)findViewById(R.id.infografis_gambarbaru2);

        tambahtext2baru1 = (TextView)findViewById(R.id.text2_infografisbaru1);
        tambahtext2baru2 = (TextView)findViewById(R.id.text2_infografisbaru2);
        tambahtext2baru3 = (TextView)findViewById(R.id.text2_infografisbaru3);
        tambahtext2baru4 = (TextView)findViewById(R.id.text2_infografisbaru4);
        tambahtext2baru5 = (TextView)findViewById(R.id.text2_infografisbaru5);
        tambahtext2baru6 = (TextView)findViewById(R.id.text2_infografisbaru6);
        tambahtext2baru7 = (TextView)findViewById(R.id.text2_infografisbaru7);

        infografisGambarbaru2.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String link2 = snapshot.getValue(String.class);
                Picasso.get().load(link2).into(gambarbaru_infografis2);
            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(InfografisTambah2.this,"Error Loading Image", Toast.LENGTH_SHORT).show();

            }
        });

        infografisText2baru1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru2text1 = snapshot.getValue(String.class);
                tambahtext2baru1.setText(baru2text1);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah2.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografisText2baru2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru2text2 = snapshot.getValue(String.class);
                tambahtext2baru2.setText(baru2text2);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah2.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografisText2baru3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru2text3 = snapshot.getValue(String.class);
                tambahtext2baru3.setText(baru2text3);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah2.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografisText2baru4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru2text4 = snapshot.getValue(String.class);
                tambahtext2baru4.setText(baru2text4);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah2.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografisText2baru5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru2text5 = snapshot.getValue(String.class);
                tambahtext2baru5.setText(baru2text5);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah2.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografisText2baru6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru2text6 = snapshot.getValue(String.class);
                tambahtext2baru6.setText(baru2text6);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah2.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografisText2baru7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String baru2text7 = snapshot.getValue(String.class);
                tambahtext2baru7.setText(baru2text7);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(InfografisTambah2.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.infografis_baru2);
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

    public void infografis_gambarbaru2(View view) {
        Intent intent = new Intent(InfografisTambah2.this, Infografis_Gambarbaru2.class);
        startActivity(intent);
    }

    public void Home(View view) {
        Intent intent = new Intent(InfografisTambah2.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(InfografisTambah2.this, wadah.pecel.SearchActivity.class);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(InfografisTambah2.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }
        

}