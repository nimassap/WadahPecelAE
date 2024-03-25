package wadah.pecel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {



    //untuk menambah list data di tombol search
    //langsung masukkan disini
    //tidak perlu membuat di acivity_search.xml
    ListView listView;
    //menambah gambar
    int image[] = {R.drawable.padi, R.drawable.hasil_sp2020, R.drawable.sp2020, R.drawable.luas_panen, R.drawable.ketenagakerjaan, R.drawable.ipm2, R.drawable.kemiskinan,
            R.drawable.ic_sosial, R.drawable.ic_ekonomi, R.drawable.ic_pertanian,
            R.drawable.ic_miskin, R.drawable.ic_kerja, R.drawable.ic_pddk, R.drawable.ic_work, R.drawable.ic_aps, R.drawable.ic_apk, R.drawable.ic_school, R.drawable.ic_sp2020, R.drawable.ic_sp2020, R.drawable.ic_pddk, R.drawable.ic_kerja, R.drawable.ic_gini,
            R.drawable.ic_pdrb, R.drawable.ic_pdrb2, R.drawable.ic_ipm,
            R.drawable.ic_rice, R.drawable.ic_padi, R.drawable.ic_corn, R.drawable.ic_kedelai, R.drawable.ic_kacangt, R.drawable.ic_ubi, R.drawable.ic_ubij,};

    //menambah keterangan
    String desc[] = {"Tercatat terdapat kenaikan produksi padi tahun 2020 sebanyak 6,38 persen dibandingkan tahun 2019. Sedangkan luas panen padi meningkat 7,33 persen. Hal ini membuktikan jika sektor pertanian yg merupakan salah satu sektor yg kuat menghadapi pandemi covid-19.",
            "Berdasarkan hasil Sensus Penduduk 2020, Penduduk Kabupaten Madiun paling banyak pada generasi X yaitu sebesar 24 persen dari seluruh penduduk di Kabupaten Madiun.",
            "Berdasarkan Sensus Penduduk 2020, jumlah penduduk Kab. Madiun pada bulan September 2020 sebanyak 744.350 jiwa. Berdasarkan jenis kelamin, jumlah penduduk perempuan sedikit lebih tinggi dibanding penduduk laki-laki. Jumlah penduduk perempuan sebesar 375.442 jiwa sedangkan penduduk laki-laki sebesar 368.908 jiwa.",
            "Produksi padi Kabupaten Madiun tahun 2020 tercatat 453,54 Ton GKG**, meningkat 8,17 persen dibandingkan tahun 2019. Luas panen tahun 2020 tercatat 73,86 ribu hektar meningkat 8,61 persen dibandingkan tahun 2019.",
            "Tingkat Partisipasi Angkatan Kerja (TPAK) Kabupaten Madiun tahun 2020 tercatat 71,42 meningkat dibandingkan tahun 2019. Tingkat Pengangguran Terbuka (TPT) Kabupaten Madiun tercatat 4,8 persen, juga meningkat dibandingkan tahun 2019.",
            "Indeks Pembanungan Manusia (IPM) Kabupaten Madiun tercatat 71,73 meningkat dibandingkan tahun 2019. IPM Kabupaten Madiun menduduki peringkat 18 se Jawa Timur, IPM Kabupaten Madiun termasuk dalam kategori tinggi.",
            "Persentase penduduk miskin Kabupaten Madiun meningkat 0,92 poin dari 10,54 persen tahun 2019 menjadi 11,46 persen di tahun 2020. Peningkatan jumlah penduduk miskin ini disebabkan salah satunya adalah kenaikan garis kemiskinan dari Rp 344.994 menjadi Rp 364.638 di tahun 2020.",
            "Sosial",
            "Ekonomi",
            "Pertanian",
            "Kemiskinan",
            "Ketenagakerjaan",
            "Penduduk menurut Jenis Kelamin",
            "Penduduk Bekerja menurut Lapangan Usaha",
            "Angka Partisipasi Sekolah (APS)",
            "Angka Partisipasi Kasar (APK)",
            "Angka Partisipasi Murni (APM)",
            "Hasil Sensus Penduduk 2020",
            "Jumlah Penduduk Menurut Kelompok Umur dan Jenis Kelamin",
            "Jumlah, Persentase, dan Rasio Jenis Kelamin Penduduk",
            "Jumlah Penduduk menurut Kelompok Umur Generasi dan Jenis Kelamin",
            "Gini Rasio",
            "PDRB Lapangan Usaha",
            "PDRB Pengeluaran",
            "Indeks Pembangunan Manusia (IPM)",
            "Padi",
            "Beras",
            "Jagung",
            "Kedelai",
            "Kacang Tanah",
            "Ubi Kayu",
            "Ubi Jalar"};

    List<InfoSearch> infoSearchList = new ArrayList<>();

    CustomAdapter customAdapter;

    BottomNavigationView bottomNavigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        //tidak perlu diubah
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.background)));

        listView = findViewById(R.id.listview);

        for (int i = 0; i < desc.length; i++){

            InfoSearch infoSearch = new InfoSearch(desc[i],image[i]);

            infoSearchList.add(infoSearch);

        }

        customAdapter = new CustomAdapter(infoSearchList, this);
        listView.setAdapter(customAdapter);






        //tombol home,search,more
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.search);
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




    //tidak perlu diubah
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search, menu);

        MenuItem menuItem = menu.findItem(R.id.search_view);

        SearchView searchView = (SearchView) menuItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                newText = newText.toLowerCase();
                customAdapter.getFilter().filter(newText);

                return true;
            }
        });


        return super.onCreateOptionsMenu(menu);
    }



    //tidak perlu diubah
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.search_view){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    //tidak perlu diubah
    public class CustomAdapter extends BaseAdapter implements Filterable {

        private List<InfoSearch> infoSearchList;
        private List<InfoSearch> infoSearchListFiltered;
        private Context context;

        public CustomAdapter(List<InfoSearch> infoSearchList, Context context) {
            this.infoSearchList = infoSearchList;
            this.infoSearchListFiltered = infoSearchList;
            this.context = context;



        }



        @Override
        public int getCount() {
            return infoSearchListFiltered.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.search_row, null);

            ImageView imageView = view.findViewById(R.id.imgSearch);
            TextView textDesc = view.findViewById(R.id.descSearch);

            imageView.setImageResource(infoSearchListFiltered.get(position).getImage());
            textDesc.setText(infoSearchListFiltered.get(position).getDesc());

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (infoSearchListFiltered.get(position).getDesc().equals("Tercatat terdapat kenaikan produksi padi tahun 2020 sebanyak 6,38 persen dibandingkan tahun 2019. Sedangkan luas panen padi meningkat 7,33 persen. Hal ini membuktikan jika sektor pertanian yg merupakan salah satu sektor yg kuat menghadapi pandemi covid-19.")) {
                        context.startActivity(new Intent(context,InfopadiActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Berdasarkan hasil Sensus Penduduk 2020, Penduduk Kabupaten Madiun paling banyak pada generasi X yaitu sebesar 24 persen dari seluruh penduduk di Kabupaten Madiun.")) {
                        context.startActivity(new Intent(context,InfohasilspActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Berdasarkan Sensus Penduduk 2020, jumlah penduduk Kab. Madiun pada bulan September 2020 sebanyak 744.350 jiwa. Berdasarkan jenis kelamin, jumlah penduduk perempuan sedikit lebih tinggi dibanding penduduk laki-laki. Jumlah penduduk perempuan sebesar 375.442 jiwa sedangkan penduduk laki-laki sebesar 368.908 jiwa.")) {
                        context.startActivity(new Intent(context,Infosp2020Activity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Produksi padi Kabupaten Madiun tahun 2020 tercatat 453,54 Ton GKG**, meningkat 8,17 persen dibandingkan tahun 2019. Luas panen tahun 2020 tercatat 73,86 ribu hektar meningkat 8,61 persen dibandingkan tahun 2019.")) {
                        context.startActivity(new Intent(context,InfotaniActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Tingkat Partisipasi Angkatan Kerja (TPAK) Kabupaten Madiun tahun 2020 tercatat 71,42 meningkat dibandingkan tahun 2019. Tingkat Pengangguran Terbuka (TPT) Kabupaten Madiun tercatat 4,8 persen, juga meningkat dibandingkan tahun 2019.")) {
                        context.startActivity(new Intent(context,InfoakActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Indeks Pembanungan Manusia (IPM) Kabupaten Madiun tercatat 71,73 meningkat dibandingkan tahun 2019. IPM Kabupaten Madiun menduduki peringkat 18 se Jawa Timur, IPM Kabupaten Madiun termasuk dalam kategori tinggi.")) {
                        context.startActivity(new Intent(context,InfoipmActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Persentase penduduk miskin Kabupaten Madiun meningkat 0,92 poin dari 10,54 persen tahun 2019 menjadi 11,46 persen di tahun 2020. Peningkatan jumlah penduduk miskin ini disebabkan salah satunya adalah kenaikan garis kemiskinan dari Rp 344.994 menjadi Rp 364.638 di tahun 2020.")) {
                        context.startActivity(new Intent(context,InfomiskinActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Sosial")) {
                        context.startActivity(new Intent(context,SosialActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Ekonomi")) {
                        context.startActivity(new Intent(context,EkonomiActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Pertanian")) {
                        context.startActivity(new Intent(context,PertanianActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Kemiskinan")) {
                        context.startActivity(new Intent(context,KemiskinanActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Ketenagakerjaan")) {
                        context.startActivity(new Intent(context,KetenagakerjaanActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Penduduk menurut Jenis Kelamin")) {
                        context.startActivity(new Intent(context,PendudukActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Penduduk Bekerja menurut Lapangan Usaha")) {
                        context.startActivity(new Intent(context,PddklapusActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Angka Partisipasi Sekolah (APS)")) {
                        context.startActivity(new Intent(context,ApsActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Angka Partisipasi Kasar (APK)")) {
                        context.startActivity(new Intent(context,ApkActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Angka Partisipasi Murni (APM)")) {
                        context.startActivity(new Intent(context,ApmActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Hasil Sensus Penduduk 2020")) {
                        context.startActivity(new Intent(context,Sp2020Activity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Jumlah Penduduk Menurut Kelompok Umur dan Jenis Kelamin")) {
                        context.startActivity(new Intent(context,SppddkActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Jumlah, Persentase, dan Rasio Jenis Kelamin Penduduk")) {
                        context.startActivity(new Intent(context,RasiojkActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Jumlah Penduduk menurut Kelompok Umur Generasi dan Jenis Kelamin")) {
                        context.startActivity(new Intent(context,SpgenerasiActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Gini Rasio")) {
                        context.startActivity(new Intent(context,GiniActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("PDRB Lapangan Usaha")) {
                        context.startActivity(new Intent(context,PdrblapusActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("PDRB Pengeluaran")) {
                        context.startActivity(new Intent(context,PdrbluarActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Indeks Pembangunan Manusia (IPM)")) {
                        context.startActivity(new Intent(context,IpmActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Padi")) {
                        context.startActivity(new Intent(context,PadiActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Beras")) {
                        context.startActivity(new Intent(context,BerasActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Jagung")) {
                        context.startActivity(new Intent(context,JagungActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Kedelai")) {
                        context.startActivity(new Intent(context,KedelaiActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Kacang Tanah")) {
                        context.startActivity(new Intent(context,KacangtActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Ubi Kayu")) {
                        context.startActivity(new Intent(context,UbikActivity.class));
                    }
                    if (infoSearchListFiltered.get(position).getDesc().equals("Ubi Jalar")) {
                        context.startActivity(new Intent(context,UbijActivity.class));
                    }
                }
            });
            return view;
        }







        @Override
        public Filter getFilter() {
            Filter filter = new Filter() {
                @Override
                protected FilterResults performFiltering(CharSequence constraint) {

                    FilterResults filterResults = new FilterResults();

                    if (constraint == null || constraint.length() == 0){
                        filterResults.count = infoSearchList.size();
                        filterResults.values = infoSearchList;
                    } else {
                        String searchStr = constraint.toString().toLowerCase();

                        List<InfoSearch> resultData =new ArrayList<>();

                        for (InfoSearch infoSearch:infoSearchList){
                            if (infoSearch.getDesc().toLowerCase().contains(searchStr)){
                                resultData.add(infoSearch);
                            }

                            filterResults.count = resultData.size();
                            filterResults.values = resultData;

                        }
                    }

                    return filterResults;
                }

                @Override
                protected void publishResults(CharSequence constraint, FilterResults results) {

                    infoSearchListFiltered = (List<InfoSearch>) results.values;

                    notifyDataSetChanged();

                }
            };

            return filter;
        }
    }




    //untuk pindah activity
    public void Home(View view) {
        Intent intent = new Intent(SearchActivity.this, wadah.pecel.MainActivity.class);
        startActivity(intent);
    }


    public void Profile(View view) {
        Intent intent = new Intent(SearchActivity.this, wadah.pecel.ProfileActivity.class);
        startActivity(intent);
    }

}






