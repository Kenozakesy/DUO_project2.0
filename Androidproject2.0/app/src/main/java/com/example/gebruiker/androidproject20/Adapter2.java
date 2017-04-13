package com.example.gebruiker.androidproject20;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Gebruiker on 16-3-2017.
 */

public class Adapter2 extends RecyclerView.Adapter<Adapter2.Viewholder> {

    String[] country_names, country_capital;

    public Adapter2(String[] country_names, String[] country_capital)
    {
        this.country_names = country_names;
        this.country_capital = country_capital;
    }

    @Override
    public Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);

        Viewholder viewholder = new Viewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(Viewholder holder, int position) {
        holder.tv_country.setText(country_names[position]);
        holder.tv_capital.setText(country_capital[position]);

    }

    @Override
    public int getItemCount() {
        return country_names.length;
    }


    //nieuwe class
    public static class Viewholder extends RecyclerView.ViewHolder
    {
        TextView tv_country, tv_capital;

        public Viewholder(View view)
        {
            super(view);
            this.tv_country = (TextView) view.findViewById(R.id.tb_country_name);
            this.tv_capital = (TextView) view.findViewById(R.id.tb_capital_name);
        }

    }
}
