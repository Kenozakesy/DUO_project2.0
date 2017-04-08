package com.example.gebruiker.androidproject20.ActivityClasses;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gebruiker.androidproject20.R;

import java.util.ArrayList;

/**
 * Created by Casper Somers on 08/04/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>{

    ArrayList<ListProvider> arrayList = ArrayList<ListProvider>();

    public RecyclerAdapter(ArrayList<ListProvider> arrayList){
        this.arrayList = arrayList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        RecyclerViewHolder recyclerViewHolder;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_layout,parent,false);

        recyclerViewHolder = new RecyclerViewHolder(view);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        ListProvider listProvider;

        listProvider = arrayList.get(position);
        holder.list_count.setText(listProvider.getCount());
        holder.list_one.setText(listProvider.getPlayero());
        holder.list_two.setText(listProvider.getPlayertw());
        holder.list_three.setText(listProvider.getPlayerth());
        holder.list_four.setText(listProvider.getPlayerf());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }



    public static class RecyclerViewHolder extends RecyclerViewHolder{

        // Variables for list
        TextView list_count, list_one, list_two, list_three, list_four;

        //Variables for head section
        TextView title_count, title_one, title_two, title_three, title_four;

        public RecyclerViewHolder(View view){
            super(view);
            list_count = (TextView)view.findViewById(R.id.count_board);
            list_one = (TextView)view.findViewById(R.id.one_board);
            list_two = (TextView)view.findViewById(R.id.two_board);
            list_three = (TextView)view.findViewById(R.id.three_board);
            list_four = (TextView)view.findViewById(R.id.four_board);
        }
    }
}
