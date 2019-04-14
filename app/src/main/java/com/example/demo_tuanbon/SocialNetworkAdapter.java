package com.example.demo_tuanbon;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SocialNetworkAdapter extends ArrayAdapter<SocialNetwork> {
    Activity context;
    int resource;
    List<SocialNetwork> objects;

    public SocialNetworkAdapter(Activity context, int resource, List<SocialNetwork> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View view = inflater.inflate(this.resource,null);

        ImageView imageView = view.findViewById(R.id.hinh);
        TextView textView = view.findViewById(R.id.ten);

        SocialNetwork network = this.objects.get(position);
        imageView.setImageResource(network.getIcon());
        textView.setText(network.getTitle());
        return view;
    }
}
