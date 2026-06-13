package com.tvoi.app;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ChannelAdapter adapter;
    private TextView selectedChip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Channel> channels = ChannelList.getChannels();

        // Setup RecyclerView com grid 2 colunas
        RecyclerView rv = findViewById(R.id.rv_channels);
        rv.setLayoutManager(new GridLayoutManager(this, 2));
        rv.setHasFixedSize(true);

        adapter = new ChannelAdapter(channels, ch -> {
            Intent i = new Intent(this, PlayerActivity.class);
            i.putExtra("url", ch.url);
            i.putExtra("name", ch.name);
            startActivity(i);
        });
        rv.setAdapter(adapter);

        // Setup chips de categoria
        setupChips(channels);

        // Setup busca
        EditText search = findViewById(R.id.et_search);
        search.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence s, int st, int c, int a) {}
            @Override public void onTextChanged(CharSequence s, int st, int b, int c) {
                adapter.filterByQuery(s.toString());
            }
            @Override public void afterTextChanged(Editable s) {}
        });
    }

    private void setupChips(List<Channel> channels) {
        LinearLayout chipContainer = findViewById(R.id.chip_container);
        RecyclerView rvChips = new RecyclerView(this);

        // Grupos únicos
        LinkedHashSet<String> groups = new LinkedHashSet<>();
        groups.add("Todos");
        for (Channel c : channels) groups.add(c.group);

        LinearLayout.LayoutParams rvParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        rvChips.setLayoutParams(rvParams);
        rvChips.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        chipContainer.addView(rvChips);

        List<String> groupList = new ArrayList<>(groups);
        ChipAdapter chipAdapter = new ChipAdapter(groupList, group -> {
            adapter.filterByGroup(group);
        });
        rvChips.setAdapter(chipAdapter);
    }
}
