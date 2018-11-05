package com.lunev2k.schedule.presentation.mvp.main;

import com.arellomobile.mvp.MvpView;

public interface MainView extends MvpView {

  void showLessons();

  void showTotals();

  void showLearners();

  void openRangeDate();

  void openSettings();
}
