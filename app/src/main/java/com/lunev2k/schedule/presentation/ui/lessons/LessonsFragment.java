package com.lunev2k.schedule.presentation.ui.lessons;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.arellomobile.mvp.MvpFragment;
import com.lunev2k.schedule.R;

public class LessonsFragment extends MvpFragment {

  private OnLessonItemClickListener listener;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_lessons, container, false);
  }

  @Override
  public void onAttach(Context context) {
    super.onAttach(context);
    if (context instanceof OnLessonItemClickListener) {
      listener = (OnLessonItemClickListener) context;
    } else {
      throw new RuntimeException(context.toString()
          + " must implement OnLessonItemClickListener");
    }
  }

  @Override
  public void onDetach() {
    super.onDetach();
    listener = null;
  }

  public interface OnLessonItemClickListener {

    // TODO: Update argument type and name
    void OnLessonItemClick();
  }
}
