package com.lunev2k.schedule.presentation.ui.totals;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.arellomobile.mvp.MvpFragment;
import com.lunev2k.schedule.R;

public class TotalsFragment extends MvpFragment {

  private OnTotalItemClickListener listener;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_totals, container, false);
  }

  @Override
  public void onAttach(Context context) {
    super.onAttach(context);
    if (context instanceof OnTotalItemClickListener) {
      listener = (OnTotalItemClickListener) context;
    } else {
      throw new RuntimeException(context.toString()
          + " must implement OnTotalItemClickListener");
    }
  }

  @Override
  public void onDetach() {
    super.onDetach();
    listener = null;
  }

  public interface OnTotalItemClickListener {

    // TODO: Update argument type and name
    void OnTotalItemClick();
  }
}
