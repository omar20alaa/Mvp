package com.mvp.mvp.newActivity;

public class NewActivityPresenter implements NewActivityContract.presenter {

    private final NewActivityContract.view view;

    public NewActivityPresenter(NewActivityContract.view view) {
        this.view = view;
    }

    @Override
    public void initRecyclerView() {
        view.displayRecyclerView();
    }

    @Override
    public void getData() {
        view.fillData();
    }
}
