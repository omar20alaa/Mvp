package com.mvp.mvp;

public interface MainContract {

    interface view {
        void displayMessage();
        void clickIntent();
        void showProgressBar();
        void hideProgressBar();
    }

    interface presenter {
        void clickToastBtn();
        void intentToNewActivity();
        void clickShow();
        void clickHide();
    }

}
