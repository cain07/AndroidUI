package com.cain.ui.fragment.utils;

import android.Manifest;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.cain.base.base.BaseFragment;
import com.cain.cpage.annotation.Page;
import com.cain.cpage.enums.CoreAnim;
import com.cain.ui.R;
import com.zyq.easypermission.EasyPermission;

import butterknife.BindView;

@Page(name = "PermissionTestFragment", anim = CoreAnim.zoom)
public class PermissionTestFragment extends BaseFragment {

    @BindView(R.id.btn_permission_1)
    Button btn1;

    @BindView(R.id.btn_permission_2)
    Button btn2;

    @BindView(R.id.btn_permission_3)
    Button btn3;

    @BindView(R.id.tv_show)
    TextView tvShow1;



    @Override
    protected int getLayoutId() {
        return R.layout.fragment_permission_test;
    }

    @Override
    protected void initViews() {

        //只检查权限和结果并显示它
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean b = EasyPermission.build().hasPermission(getActivity(), Manifest.permission.CALL_PHONE);
                tvShow1.setText(b ? "允许" : "拒绝");

            }
        });

        //演示只适用于不需要结果
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EasyPermission.build().requestPermission(getActivity(), Manifest.permission.CALL_PHONE);
            }
        });


    }





}
