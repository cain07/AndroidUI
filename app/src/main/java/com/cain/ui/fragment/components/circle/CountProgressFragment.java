package com.cain.ui.fragment.components.circle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.cain.base.base.BaseFragment;
import com.cain.cpage.annotation.Page;
import com.cain.cpage.enums.CoreAnim;
import com.cain.ui.R;
import com.cain.ui.fragment.components.circle.view.CircleProgressbar;

import butterknife.BindView;

@Page(name = "CountProgressFragment", anim = CoreAnim.zoom)
public class CountProgressFragment extends BaseFragment {

    @BindView(R.id.cp_progress_first_1)
    CircleProgressbar circleProgressbarFirst;
    @BindView(R.id.cp_progress_second)
    CircleProgressbar circleProgressbarSecond;
    @BindView(R.id.cp_progress_third)
    CircleProgressbar circleProgressbarThird;

    @BindView(R.id.btn_start)
    Button btn_start;

    @BindView(R.id.btn_restore)
    Button btn_restore;

    @BindView(R.id.tv_countdown)
    TextView tv_countdown;


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_circle_progress;
    }

    @Override
    protected void initViews() {
        circleProgressbarSecond.setOnProgressbarChangeListener(new CircleProgressbar.OnProgressbarChangeListener() {
            @Override
            public void onProgressChanged(CircleProgressbar circleSeekbar, float progress, boolean fromUser) {
                //UILog.e("progress->"+progress+"fromUser->"+fromUser);
                Log.e("onProgressChanged->","progress->"+progress+"fromUser->"+fromUser);
            }

            @Override
            public void onStartTracking(CircleProgressbar circleSeekbar) {

            }

            @Override
            public void onStopTracking(CircleProgressbar circleSeekbar) {

            }
        });

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                circleProgressbarFirst.setProgressWithAnimation(0, 8000);
                circleProgressbarSecond.setProgressWithAnimation(0, 8000);
//                circleProgressbarThird.setProgressWithAnimation(0, 6000);
            }
        });


        btn_restore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //circleProgressbarFirst.setProgress(0);
                circleProgressbarSecond.setProgress(100);
                //circleProgressbarThird.setProgress(0);
                //tv_countdown.setText((int) circleProgressbarThird.getMaxProgress() + "");
            }
        });

    }





}
