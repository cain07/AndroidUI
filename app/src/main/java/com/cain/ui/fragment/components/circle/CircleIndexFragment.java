package com.cain.ui.fragment.components.circle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.cain.base.base.BaseFragment;
import com.cain.cpage.annotation.Page;
import com.cain.cpage.enums.CoreAnim;
import com.cain.ui.R;
import com.cain.util.sub.app.FragmentUtils;

import butterknife.BindView;

@Page(name = "CircleIndexFragment", anim = CoreAnim.zoom)
public class CircleIndexFragment extends BaseFragment {

    @BindView(R.id.btn_1)
    Button btn1;

    @BindView(R.id.btn_2)
    Button btn2;

    @BindView(R.id.btn_3)
    Button btn3;

    @BindView(R.id.btn_4)
    Button btn4;

    @BindView(R.id.btn_5)
    Button btn5;

    @BindView(R.id.tv_show)
    TextView tvShow1;



    @Override
    protected int getLayoutId() {
        return R.layout.fragment_circle_index;
    }

    @Override
    protected void initViews() {

        //只检查权限和结果并显示它
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CountDownFragment fragment = new CountDownFragment();
                FragmentUtils.add(getActivity().getSupportFragmentManager(),fragment,R.id.fragment_container_components);
            }
        });

        //演示只适用于不需要结果
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CountProgressFragment countProgressFragment = new CountProgressFragment();
                FragmentUtils.replace(getActivity().getSupportFragmentManager(),countProgressFragment,R.id.fragment_container_components);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CameraCircleFragment fragment = new CameraCircleFragment();
                FragmentUtils.replace(getActivity().getSupportFragmentManager(),fragment,R.id.fragment_container_components);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CameraCircle2Fragment fragment = new CameraCircle2Fragment();
                FragmentUtils.replace(getActivity().getSupportFragmentManager(),fragment,R.id.fragment_container_components);

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CameraPreviewFragment fragment = new CameraPreviewFragment();
                FragmentUtils.replace(getActivity().getSupportFragmentManager(),fragment,R.id.fragment_container_components);

            }
        });

    }






}
