package com.lunev2k.schedule.presentation.ui.learners;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.arellomobile.mvp.MvpFragment;
import com.lunev2k.schedule.R;

public class LearnersFragment extends MvpFragment {

  private OnLearnerItemClickListener listener;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_learners, container, false);
  }

  @Override
  public void onAttach(Context context) {
    super.onAttach(context);
    if (context instanceof OnLearnerItemClickListener) {
      listener = (OnLearnerItemClickListener) context;
    } else {
      throw new RuntimeException(context.toString()
          + " must implement OnLearnerItemClickListener");
    }
  }

  @Override
  public void onDetach() {
    super.onDetach();
    listener = null;
  }

  public interface OnLearnerItemClickListener {

    // TODO: Update argument type and name
    void OnLearnerItemClick();
  }
}
