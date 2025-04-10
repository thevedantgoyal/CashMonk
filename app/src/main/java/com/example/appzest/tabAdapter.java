package com.example.appzest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class tabAdapter extends RecyclerView.Adapter<tabAdapter.TabViewHolder>  {

    private List<tabModel> tabList;
    private Context context;

    public tabAdapter(List<tabModel> tabList, Context context) {
        this.tabList = tabList;
        this.context = context;
    }
    @NonNull
    @Override
    public tabAdapter.TabViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_tab, parent, false);
        return new TabViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull tabAdapter.TabViewHolder holder, int position) {
        holder.tabName.setText(tabList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return tabList.size();
    }
    public class TabViewHolder extends RecyclerView.ViewHolder {
        TextView tabName;
        public TabViewHolder(@NonNull View itemView) {
            super(itemView);
            tabName = itemView.findViewById(R.id.tvTabName);
        }
    }
}
