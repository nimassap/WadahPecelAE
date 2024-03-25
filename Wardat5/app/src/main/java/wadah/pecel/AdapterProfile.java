package wadah.pecel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterProfile extends RecyclerView.Adapter<AdapterProfile.TentangVH> {

    List<TentangKami> tentangKamiList;

    public AdapterProfile(List<TentangKami> tentangKamiList) {
        this.tentangKamiList = tentangKamiList;
    }

    @NonNull
    @Override
    public TentangVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new TentangVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TentangVH holder, int position) {

        TentangKami tentangKami = tentangKamiList.get(position);
        holder.judul.setText(tentangKami.getJudul());
        holder.desc.setText(tentangKami.getDesc());

        boolean isExpandable = tentangKamiList.get(position).isExpandable();
        holder.expandLayout.setVisibility(isExpandable ? View.VISIBLE : View.GONE);

    }

    @Override
    public int getItemCount() {
        return tentangKamiList.size();
    }

    public class TentangVH extends RecyclerView.ViewHolder {

        TextView judul, desc;
        LinearLayout linearLayout;
        RelativeLayout expandLayout;

        public TentangVH(@NonNull View itemView) {
            super(itemView);

            judul = itemView.findViewById(R.id.judul);
            desc = itemView.findViewById(R.id.desc);

            linearLayout = itemView.findViewById(R.id.linear_layout);
            expandLayout = itemView.findViewById(R.id.expand_layout);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    TentangKami tentangKami = tentangKamiList.get(getAdapterPosition());
                    tentangKami.setExpandable(!tentangKami.isExpandable());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}
