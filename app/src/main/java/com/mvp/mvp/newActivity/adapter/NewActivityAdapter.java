package com.mvp.mvp.newActivity.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mvp.mvp.R;
import com.mvp.mvp.newActivity.model.NewActivityModel;

import java.util.ArrayList;

public class NewActivityAdapter extends RecyclerView.Adapter<NewActivityAdapter.MyViewHolder> {

    Context context;
    ArrayList<NewActivityModel> arrayList ;


    public NewActivityAdapter(Context context, ArrayList<NewActivityModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_item , parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {
        holder.tv_country_name.setText(arrayList.get(i).getTitle());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_country_name;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_country_name = itemView.findViewById(R.id.tv_country_name);
        }
    }
}
