package com.lunev2k.schedule.presentation;

import static org.mockito.Mockito.verify;

import com.lunev2k.schedule.R;
import com.lunev2k.schedule.presentation.mvp.main.MainPresenter;
import com.lunev2k.schedule.presentation.mvp.main.MainView;
import com.lunev2k.schedule.presentation.mvp.main.MainView$$State;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MainPresenterTest {

  @Mock
  private MainView mainView;

  @Mock
  private MainView$$State mainViewState;

  private MainPresenter presenter;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
    presenter = new MainPresenter();
    presenter.attachView(mainView);
    presenter.setViewState(mainViewState);
  }

  @Test
  public void onNavigationLessonsSelected() {
    presenter.onNavigationItemSelected(R.id.navigation_lessons);
    verify(mainViewState).showLessons();
  }

  @Test
  public void onNavigationTotalsSelected() {
    presenter.onNavigationItemSelected(R.id.navigation_totals);
    verify(mainViewState).showTotals();
  }

  @Test
  public void onNavigationLearnersSelected() {
    presenter.onNavigationItemSelected(R.id.navigation_learners);
    verify(mainViewState).showLearners();
  }

  @Test
  public void onOptionsRangeDateSelected() {
    presenter.onOptionsItemSelected(R.id.action_range_date);
    verify(mainViewState).openRangeDate();
  }

  @Test
  public void onOptionsSettingsSelected() {
    presenter.onOptionsItemSelected(R.id.action_settings);
    verify(mainViewState).openSettings();
  }
}