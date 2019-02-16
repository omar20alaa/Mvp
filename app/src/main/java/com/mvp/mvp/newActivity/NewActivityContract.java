package com.mvp.mvp.newActivity;

public interface NewActivityContract {

    interface view {
        void displayRecyclerView();
        void fillData();
    }

    interface presenter {
        void initRecyclerView();
        void getData();
    }



}
