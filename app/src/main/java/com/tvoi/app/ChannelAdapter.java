package com.tvoi.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ChannelAdapter extends RecyclerView.Adapter<ChannelAdapter.VH> {

    public interface OnClickListener {
        void onClick(Channel channel);
    }

    private List<Channel> all;
    private List<Channel> filtered;
    private OnClickListener listener;

    public ChannelAdapter(List<Channel> channels, OnClickListener listener) {
        this.all = new ArrayList<>(channels);
        this.filtered = new ArrayList<>(channels);
        this.listener = listener;
    }

    public void filterByGroup(String group) {
        filtered.clear();
        if (group == null || group.equals("Todos")) {
            filtered.addAll(all);
        } else {
            for (Channel c : all) {
                if (c.group.equals(group)) filtered.add(c);
            }
        }
        notifyDataSetChanged();
    }

    public void filterByQuery(String query) {
        filtered.clear();
        if (query == null || query.isEmpty()) {
            filtered.addAll(all);
        } else {
            String q = query.toLowerCase();
            for (Channel c : all) {
                if (c.name.toLowerCase().contains(q)) filtered.add(c);
            }
        }
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_channel, parent, false);
        return new VH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        Channel ch = filtered.get(position);
        holder.emoji.setText(ch.emoji);
        holder.name.setText(ch.name);
        holder.group.setText(ch.group);
        holder.itemView.setOnClickListener(v -> listener.onClick(ch));
    }

    @Override
    public int getItemCount() {
        return filtered.size();
    }

    static class VH extends RecyclerView.ViewHolder {
        TextView emoji, name, group;
        VH(View v) {
            super(v);
            emoji = v.findViewById(R.id.ch_emoji);
            name  = v.findViewById(R.id.ch_name);
            group = v.findViewById(R.id.ch_group);
        }
    }
}
