package com.mvp.mvp;

public class MainPresenter implements MainContract.presenter {


    private final MainContract.view view;

    public MainPresenter(MainContract.view view) {
        this.view = view;
    }

    @Override
    public void clickToastBtn() {
        view.displayMessage();
    }

    @Override
    public void intentToNewActivity() {
        view.clickIntent();
    }

    @Override
    public void clickShow() {
        view.showProgressBar();
    }

    @Override
    public void clickHide() {
    view.hideProgressBar();
    }


}
