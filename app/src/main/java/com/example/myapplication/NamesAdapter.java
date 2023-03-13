package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NamesAdapter extends RecyclerView.Adapter<NamesAdapter.NamesViewHolder> {
    private List <String> list = new ArrayList<>();

    @NonNull
    @Override
    public NamesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NamesViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.iteme_file, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NamesViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    TextView text;

    public class NamesViewHolder extends RecyclerView.ViewHolder {

        public NamesViewHolder(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.text_item);


        }
        public void onBind(String name){
            text.setText(name);
        }
    }
}
