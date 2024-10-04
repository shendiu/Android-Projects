package com.example.worldcupapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<CountryModelClass> {

    private ArrayList<CountryModelClass> countryArraylist;
    Context context;

    public CustomAdapter(ArrayList<CountryModelClass> data, Context context) {
        super(context, R.layout.my_first_layout, data);
        this.countryArraylist = data;
        this.context = context;
    }


    private static class ViewHolder {
        TextView textCountry;
        TextView textCuoWins;
        ImageView flagImg;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        CountryModelClass dataModel = getItem(position);

        ViewHolder viewHolder;

        final View result;

        if (convertView == null) {
            viewHolder = new ViewHolder();

            LayoutInflater inflater = LayoutInflater.from(getContext());

            convertView = inflater.inflate(R.layout.my_first_layout, parent, false);

            viewHolder.flagImg = (ImageView) convertView.findViewById(R.id.imageView);
            viewHolder.textCountry = (TextView) convertView.findViewById(R.id.title);
            viewHolder.textCuoWins = (TextView) convertView.findViewById(R.id.cup_win_desc);

            result = convertView;
            convertView.setTag(viewHolder);

        } else {

            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;

        }

        viewHolder.textCountry.setText(dataModel.getCountry_name());
        viewHolder.textCuoWins.setText(dataModel.getCup_win_count());
        viewHolder.flagImg.setImageResource(dataModel.getFlag_img());

        return convertView;

    }
}
