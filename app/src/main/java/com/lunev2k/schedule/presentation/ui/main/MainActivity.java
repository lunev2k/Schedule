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
import com.lunev2k.schedule.presentation.ui.learners.LearnersFragment;
import com.lunev2k.schedule.presentation.ui.lessons.LessonsFragment;
import com.lunev2k.schedule.presentation.ui.totals.TotalsFragment;

public class MainActivity extends MvpAppCompatActivity implements MainView,
    LessonsFragment.OnLessonItemClickListener,
    TotalsFragment.OnTotalItemClickListener,
    LearnersFragment.OnLearnerItemClickListener {

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
    getFragmentManager()
        .beginTransaction()
        .replace(R.id.frame, new LessonsFragment())
        .commit();
  }

  @Override
  public void showTotals() {
    getFragmentManager()
        .beginTransaction()
        .replace(R.id.frame, new TotalsFragment())
        .commit();
  }

  @Override
  public void showLearners() {
    getFragmentManager()
        .beginTransaction()
        .replace(R.id.frame, new LearnersFragment())
        .commit();
  }

  @Override
  public void openRangeDate() {
    // TODO : Open activity range date
  }

  @Override
  public void openSettings() {
    // TODO : Open activity settings
  }

  @Override
  public void OnLessonItemClick() {
    // TODO : Open activity lesson view
  }

  @Override
  public void OnTotalItemClick() {
    // TODO : Open activity total view
  }

  @Override
  public void OnLearnerItemClick() {
    // TODO : Open activity learner view
  }
}
