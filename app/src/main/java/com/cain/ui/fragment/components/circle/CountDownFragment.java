package com.cain.ui.fragment.components.circle;

import android.view.View;
import android.widget.Button;

import com.cain.base.base.BaseFragment;
import com.cain.cpage.annotation.Page;
import com.cain.cpage.enums.CoreAnim;
import com.cain.ui.R;
import com.cain.ui.fragment.components.circle.view.CountDownView;
import com.xuexiang.xui.widget.toast.XToast;

import butterknife.BindView;

@Page(name = "CountDownFragment", anim = CoreAnim.zoom)
public class CountDownFragment extends BaseFragment {

    @BindView(R.id.cd_view)
    CountDownView countDownView;

    @BindView(R.id.btn_start)
    Button btn1;

    @BindView(R.id.btn_restore)
    Button btn2;


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_circle_count_down;
    }

    @Override
    protected void initViews() {

        countDownView.setOnCountDownListener(new CountDownView.OnCountDownListener() {
            @Override
            public void start() {
                XToast.info(getActivity(),"start");
            }

            @Override
            public void finish() {
                XToast.info(getActivity(),"finish");
            }
        });



        //停止倒计时
        /*countDownView.stopCountdown();

        countDownView.invalidate();*/

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //开始倒计时
                countDownView.startCountdown();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownView.stopCountdown();

                countDownView.reSetRoundProgress();
            }
        });




    }





}
