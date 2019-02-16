package com.mvp.mvp.newActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mvp.mvp.R;
import com.mvp.mvp.newActivity.adapter.NewActivityAdapter;
import com.mvp.mvp.newActivity.model.NewActivityModel;

import java.util.ArrayList;

public class NewActivity extends AppCompatActivity implements  NewActivityContract.presenter   {

    NewActivityPresenter presenter;
    LinearLayoutManager layoutManager;
    ArrayList<NewActivityModel> arrayList = new ArrayList<>();
    NewActivityAdapter adapter;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        recycler = findViewById(R.id.recycler);
        initPresenter();

    }

    private void initPresenter() {
       initRecyclerView();
        getData();

    }

    @Override
    public void initRecyclerView() {
        layoutManager = new LinearLayoutManager(this);

        adapter = new NewActivityAdapter(this,arrayList);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(layoutManager);
        recycler.setAdapter(adapter);
    }

    @Override
    public void getData() {
        arrayList.add(new NewActivityModel("omaaaaar"));
        arrayList.add(new NewActivityModel("omaaaaar"));
        arrayList.add(new NewActivityModel("omaaaaar"));
        arrayList.add(new NewActivityModel("omaaaaar"));
        arrayList.add(new NewActivityModel("omaaaaar"));
        arrayList.add(new NewActivityModel("omaaaaar"));
        adapter.notifyDataSetChanged();

    }
}
