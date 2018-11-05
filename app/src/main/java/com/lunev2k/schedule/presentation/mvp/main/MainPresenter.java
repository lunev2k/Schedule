package com.lunev2k.schedule.presentation.mvp.main;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.lunev2k.schedule.R;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

  public boolean onNavigationItemSelected(int itemId) {
    switch (itemId) {
      case R.id.navigation_lessons:
        getViewState().showLessons();
        return true;
      case R.id.navigation_totals:
        getViewState().showTotals();
        return true;
      case R.id.navigation_learners:
        getViewState().showLearners();
        return true;
    }
    return false;
  }

  public void onOptionsItemSelected(int itemId) {
    switch (itemId) {
      case R.id.action_range_date:
        getViewState().openRangeDate();
        break;
      case R.id.action_settings:
        getViewState().openSettings();
        break;
    }
  }
}
