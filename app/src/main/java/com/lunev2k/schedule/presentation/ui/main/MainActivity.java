package com.lunev2k.schedule.presentation.ui.main;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.view.Menu;
import android.view.MenuItem;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.lunev2k.schedule.R;
import com.lunev2k.schedule.presentation.mvp.main.MainPresenter;
import com.lunev2k.schedule.presentation.mvp.main.MainView;

public class MainActivity extends MvpAppCompatActivity implements MainView {

  @InjectPresenter
  MainPresenter presenter;
  @BindView(R.id.navigation)
  BottomNavigationView navigation;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
    navigation.setOnNavigationItemSelectedListener(
        item -> presenter.onNavigationItemSelected(item.getItemId()));
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    presenter.onOptionsItemSelected(item.getItemId());
    return super.onOptionsItemSelected(item);
  }

  @Override
  public void showLessons() {
    // TODO : Show list lessons
  }

  @Override
  public void showTotals() {
    // TODO : Show list totals
  }

  @Override
  public void showLearners() {
    // TODO : Show list learners
  }

  @Override
  public void openRangeDate() {
    // TODO : Open activity range date
  }

  @Override
  public void openSettings() {
    // TODO : Open activity settings
  }
}
