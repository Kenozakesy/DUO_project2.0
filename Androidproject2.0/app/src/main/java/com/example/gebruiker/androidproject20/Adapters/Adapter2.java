package com.example.gebruiker.androidproject20.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gebruiker.androidproject20.R;
import com.example.gebruiker.androidproject20.Viewholders.ViewHolder1;

/**
 * Created by Gebruiker on 16-3-2017.
 */

public class Adapter2 extends RecyclerView.Adapter<ViewHolder1.Viewholder> {

    String[] count_number, player_one, player_two, player_three, player_four;
    public ViewHolder1 ViewHolder;

    public Adapter2(String[] count_number, String[] player_one, String[] player_two, String[] player_three, String[] player_four)
    {
        this.count_number = count_number;
        this.player_one = player_one;
        this.player_two = player_two;
        this.player_three = player_three;
        this.player_four = player_four;
    }

    @Override
    public ViewHolder1.Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);

        ViewHolder1.Viewholder viewholder = new ViewHolder1.Viewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(ViewHolder1.Viewholder holder, int position) {
        holder.tv_count.setText(count_number[position]);
        holder.tv_player_one.setText(player_one[position]);
        holder.tv_player_two.setText(player_two[position]);
        holder.tv_player_three.setText(player_three[position]);
        holder.tv_player_four.setText(player_four[position]);
    }

    @Override
    public int getItemCount() {
        return count_number.length;
    }

    //this code is not needed anymore

    //nieuwe class
//    public static class Viewholder extends RecyclerView.ViewHolder
//    {
//        TextView tv_count, tv_player_one, tv_player_two, tv_player_three, tv_player_four;
//
//        public Viewholder(View view)
//        {
//            super(view);
//            this.tv_count = (TextView) view.findViewById(R.id.tb_field_count);
//            this.tv_player_one = (TextView) view.findViewById(R.id.tb_field_player_one);
//            this.tv_player_two = (TextView) view.findViewById(R.id.tb_field_player_two);
//            this.tv_player_three = (TextView) view.findViewById(R.id.tb_field_player_three);
//            this.tv_player_four = (TextView) view.findViewById(R.id.tb_field_player_four);
//        }
//
//    }
}
