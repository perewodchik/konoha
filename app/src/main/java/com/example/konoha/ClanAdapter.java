package com.example.konoha;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ClanAdapter extends ArrayAdapter {

    private static final String LOG_TAG = ClanAdapter.class.getSimpleName();
    public ClanAdapter(Activity context, ArrayList<Clan> clans){
        super(context, 0, clans);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.clan_item_list, parent, false);
        }
        Clan currentClan = (Clan) getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.clanNameTextView);
        nameTextView.setText(currentClan.getClanName());

        TextView japanTextView = (TextView) listItemView.findViewById(R.id.japanTextView);
        japanTextView.setText(currentClan.getJapanName());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.clanImageView);
        iconView.setImageResource(currentClan.getImageResourceId());

        return listItemView;


    }

}
