package com.example.gebruiker.androidproject20.Viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.gebruiker.androidproject20.R;

/**
 * Created by Gebruiker on 24-4-2017.
 */

public class ViewHolder1 {

    public static class Viewholder extends RecyclerView.ViewHolder
    {
        public TextView tv_count;
        public TextView tv_player_one;
        public TextView tv_player_two;
        public TextView tv_player_three;
        public TextView tv_player_four;

        public Viewholder(View view)
        {
            super(view);
            this.tv_count = (TextView) view.findViewById(R.id.tb_field_count);
            this.tv_player_one = (TextView) view.findViewById(R.id.tb_field_player_one);
            this.tv_player_two = (TextView) view.findViewById(R.id.tb_field_player_two);
            this.tv_player_three = (TextView) view.findViewById(R.id.tb_field_player_three);
            this.tv_player_four = (TextView) view.findViewById(R.id.tb_field_player_four);
        }

    }

}
