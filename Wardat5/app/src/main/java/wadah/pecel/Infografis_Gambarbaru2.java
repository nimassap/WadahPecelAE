package wadah.pecel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class Infografis_Gambarbaru2 extends AppCompatActivity {

    ImageView gambarzoom_infografis2;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference infografisGambarzoom2 = databaseReference.child("infografis_tambahgambar2");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infografis_gambarbaru2);

        gambarzoom_infografis2 = (ImageView)findViewById(R.id.img_infografisbaru2);

        infografisGambarzoom2.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String link1 = snapshot.getValue(String.class);
                Picasso.get().load(link1).into(gambarzoom_infografis2);
            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(Infografis_Gambarbaru2.this,"Error Loading Image", Toast.LENGTH_SHORT).show();

            }
        });

    }
}