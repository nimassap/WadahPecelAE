package wadah.pecel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ViewFlipper;
import android.widget.ImageView;
import android.widget.GridLayout;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.squareup.picasso.Picasso;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //untuk data ke firebase
    //tidak perlu diubah dari sini sampai...
    FirebaseRemoteConfig firebaseRemoteConfig;

    ImageView tambahgambar_infografis1, tambahgambar_infografis2, tambahgambar_infografis3, tambahgambar_infografis4, tambahgambar_infografis5;
    TextView tambahtext_infografis1, tambahtext_infografis2, tambahtext_infografis3, tambahtext_infografis4, tambahtext_infografis5;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference infografisGambar1 = databaseReference.child("infografis_tambahgambar1");
    private DatabaseReference infografisGambar2 = databaseReference.child("infografis_tambahgambar2");
    private DatabaseReference infografisGambar3 = databaseReference.child("infografis_tambahgambar3");
    private DatabaseReference infografisGambar4 = databaseReference.child("infografis_tambahgambar4");
    private DatabaseReference infografisGambar5 = databaseReference.child("infografis_tambahgambar5");

    private DatabaseReference infografisText1 = databaseReference.child("infografis_tambahtext1");
    private DatabaseReference infografisText2 = databaseReference.child("infografis_tambahtext2");
    private DatabaseReference infografisText3 = databaseReference.child("infografis_tambahtext3");
    private DatabaseReference infografisText4 = databaseReference.child("infografis_tambahtext4");
    private DatabaseReference infografisText5 = databaseReference.child("infografis_tambahtext5");

    //sampai sini


    BottomNavigationView bottomNavigationView;

    TextView teks, teks2, teks3, teks4, teks5, teks6, infografis;
    CarouselView carouselView;
    int[] sampleImages = {R.drawable.hasil_sp2020, R.drawable.padi, R.drawable.sp2020, R.drawable.luas_panen, R.drawable.ketenagakerjaan, R.drawable.ipm2, R.drawable.kemiskinan};


    //update new version
    private int getCurrentVersionCode(){
        PackageInfo packageInfo = null;
        try {
            packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
        }catch (Exception e){
            Log.d("wadahPecel",e.getMessage());
        }
        return packageInfo.versionCode;
    }


    private void showUpdateDialog() {
        final AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("Tersedia Update Terbaru")
                .setMessage("")
                .setNegativeButton("Tidak", null)
                .setPositiveButton("Update", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        try {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=wadah.pecel")));
                        } catch (Exception e) {

                        }
                    }
                }).show();
        dialog.setCancelable(true);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //update new version
        int currentVersionCode;

        currentVersionCode = getCurrentVersionCode();

        Log.d("wadahPecel", String.valueOf(currentVersionCode));

        firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        FirebaseRemoteConfigSettings configSettings = new FirebaseRemoteConfigSettings.Builder()
                .setMinimumFetchIntervalInSeconds(5)
                .build();
        firebaseRemoteConfig.setConfigSettingsAsync(configSettings);

        firebaseRemoteConfig.fetchAndActivate().addOnCompleteListener(new OnCompleteListener<Boolean>() {
            @Override
            public void onComplete(@NonNull Task<Boolean> task) {
                if (task.isSuccessful()){
                    final String new_version = firebaseRemoteConfig.getString("new_version");
                    if (Integer.parseInt(new_version) > getCurrentVersionCode()){
                        showUpdateDialog();
                    }
                }
            }
        });


        //untuk data firebase
        //tidak perlu diubah dari sini sampai...
        tambahgambar_infografis1 = (ImageView)findViewById(R.id.tambahgambar_infografis1);
        tambahgambar_infografis2 = (ImageView)findViewById(R.id.tambahgambar_infografis2);
        tambahgambar_infografis3 = (ImageView)findViewById(R.id.tambahgambar_infografis3);
        tambahgambar_infografis4 = (ImageView)findViewById(R.id.tambahgambar_infografis4);
        tambahgambar_infografis5 = (ImageView)findViewById(R.id.tambahgambar_infografis5);

        tambahtext_infografis1 = (TextView)findViewById(R.id.tambahtext_infografis1);
        tambahtext_infografis2 = (TextView)findViewById(R.id.tambahtext_infografis2);
        tambahtext_infografis3 = (TextView)findViewById(R.id.tambahtext_infografis3);
        tambahtext_infografis4 = (TextView)findViewById(R.id.tambahtext_infografis4);
        tambahtext_infografis5 = (TextView)findViewById(R.id.tambahtext_infografis5);

        infografisGambar1.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String link1 = snapshot.getValue(String.class);
                Picasso.get().load(link1).into(tambahgambar_infografis1);
            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(MainActivity.this,"Error Loading Image", Toast.LENGTH_SHORT).show();

            }
        });

        infografisGambar2.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String link2 = snapshot.getValue(String.class);
                Picasso.get().load(link2).into(tambahgambar_infografis2);
            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(MainActivity.this,"Error Loading Image", Toast.LENGTH_SHORT).show();

            }
        });

        infografisGambar3.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String link3 = snapshot.getValue(String.class);
                Picasso.get().load(link3).into(tambahgambar_infografis3);
            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(MainActivity.this,"Error Loading Image", Toast.LENGTH_SHORT).show();

            }
        });

        infografisGambar4.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String link4 = snapshot.getValue(String.class);
                Picasso.get().load(link4).into(tambahgambar_infografis4);
            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(MainActivity.this,"Error Loading Image", Toast.LENGTH_SHORT).show();

            }
        });

        infografisGambar5.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String link5 = snapshot.getValue(String.class);
                Picasso.get().load(link5).into(tambahgambar_infografis5);
            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(MainActivity.this,"Error Loading Image", Toast.LENGTH_SHORT).show();

            }
        });




        infografisText1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String text1 = snapshot.getValue(String.class);
                tambahtext_infografis1.setText(text1);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(MainActivity.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografisText2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String text2 = snapshot.getValue(String.class);
                tambahtext_infografis2.setText(text2);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(MainActivity.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografisText3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String text3 = snapshot.getValue(String.class);
                tambahtext_infografis3.setText(text3);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(MainActivity.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografisText4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String text4 = snapshot.getValue(String.class);
                tambahtext_infografis4.setText(text4);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(MainActivity.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        infografisText5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String text5 = snapshot.getValue(String.class);
                tambahtext_infografis5.setText(text5);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(MainActivity.this,"Error Loading Text", Toast.LENGTH_SHORT).show();
            }
        });

        //sampai sini


        //untuk tombol home, search, more
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
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

        //style tulisan halaman utama
        teks = (TextView) findViewById(R.id.warung);
        teks2 = (TextView) findViewById(R.id.menu);

        /* teks4=(TextView)findViewById(R.id.about); */

        Typeface customfont = Typeface.createFromAsset(getAssets(), "font/Cameliya.otf");
        teks.setTypeface(customfont);
        Typeface customfont2 = Typeface.createFromAsset(getAssets(), "font/FireBrathers-PersonalUse.otf");
        teks2.setTypeface(customfont2);

      /*  Typeface customfont4=Typeface.createFromAsset(getAssets(),"font/Frightmare-Demo.otf");
        teks4.setTypeface(customfont4);*/

        //untuk infografis
        infografis = (TextView) this.findViewById(R.id.infografis);
        infografis.setSelected(true);

        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

    }


    
    //untuk infografis
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };


    //untuk berpindah activity
    public void Profile(View view) {
        Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(MainActivity.this, SearchActivity.class);
        startActivity(intent);
    }

    public void SOSIAL(View view) {
        Intent intent = new Intent(MainActivity.this, SosialActivity.class);
        startActivity(intent);
    }

    public void EKONOMI(View view) {
        Intent intent = new Intent(MainActivity.this, EkonomiActivity.class);
        startActivity(intent);
    }

    public void PERTANIAN(View view) {
        Intent intent = new Intent(MainActivity.this, PertanianActivity.class);
        startActivity(intent);
    }

    public void TENTANG(View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }


    public void infotani(View view) {
        Intent intent = new Intent(MainActivity.this, InfotaniActivity.class);
        startActivity(intent);
    }

    public void infoak(View view) {
        Intent intent = new Intent(MainActivity.this, InfoakActivity.class);
        startActivity(intent);
    }

    public void infoipm(View view) {
        Intent intent = new Intent(MainActivity.this, InfoipmActivity.class);
        startActivity(intent);
    }

    public void infomiskin(View view) {
        Intent intent = new Intent(MainActivity.this, InfomiskinActivity.class);
        startActivity(intent);
    }




    public void infosp2020(View view) {
        Intent intent = new Intent(MainActivity.this, Infosp2020Activity.class);
        startActivity(intent);
    }

    public void infopadi(View view) {
        Intent intent = new Intent(MainActivity.this, InfopadiActivity.class);
        startActivity(intent);
    }

    public void infohasilsp(View view) {
        Intent intent = new Intent(MainActivity.this, InfohasilspActivity.class);
        startActivity(intent);
    }

    public void infografis_tambah1(View view) {
        Intent intent = new Intent(MainActivity.this, InfografisTambah1.class);
        startActivity(intent);
    }

    public void infografis_tambah2(View view) {
        Intent intent = new Intent(MainActivity.this, InfografisTambah1.class);
        startActivity(intent);
    }

    public void infografis_tambah3(View view) {
        Intent intent = new Intent(MainActivity.this, InfografisTambah1.class);
        startActivity(intent);
    }

    public void infografis_tambah4(View view) {
        Intent intent = new Intent(MainActivity.this, InfografisTambah1.class);
        startActivity(intent);
    }

    public void infografis_tambah5(View view) {
        Intent intent = new Intent(MainActivity.this, InfografisTambah1.class);
        startActivity(intent);
    }

}

