package com.tvoi.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ChipAdapter extends RecyclerView.Adapter<ChipAdapter.VH> {

    public interface OnChipClick { void onClick(String group); }

    private final List<String> groups;
    private final OnChipClick listener;
    private int selected = 0;

    public ChipAdapter(List<String> groups, OnChipClick listener) {
        this.groups = groups;
        this.listener = listener;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.chip_item, parent, false);
        return new VH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.tv.setText(groups.get(position));
        holder.tv.setSelected(position == selected);
        holder.tv.setOnClickListener(v -> {
            int prev = selected;
            selected = holder.getAdapterPosition();
            notifyItemChanged(prev);
            notifyItemChanged(selected);
            listener.onClick(groups.get(selected));
        });
    }

    @Override
    public int getItemCount() { return groups.size(); }

    static class VH extends RecyclerView.ViewHolder {
        TextView tv;
        VH(View v) {
            super(v);
            tv = (TextView) v;
        }
    }
}
