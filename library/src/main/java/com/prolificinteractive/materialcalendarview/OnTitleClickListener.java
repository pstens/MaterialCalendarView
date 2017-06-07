package com.prolificinteractive.materialcalendarview;

import android.support.annotation.*;
import android.view.*;

/**
 * The callback used to indicate the title has been clicked.
 */
public interface OnTitleClickListener {

    /**
     * Called when a user clicks on the title.
     * There is no logic to prevent multiple calls for the same date and state.
     */
    void onTitleClicked(@NonNull View view, @NonNull CalendarDay month);
}
