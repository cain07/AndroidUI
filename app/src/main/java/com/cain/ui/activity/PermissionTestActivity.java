package com.cain.ui.activity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.cain.ui.R;
import com.cain.ui.base.BaseUIActivity;
import com.xuexiang.xui.widget.toast.XToast;
import com.zyq.easypermission.EasyPermission;
import com.zyq.easypermission.EasyPermissionResult;

import java.util.List;

import butterknife.BindView;

public class PermissionTestActivity extends BaseUIActivity {

    private static final int RC_CODE_CALLPHONE = 1024;

    @BindView(R.id.btn_permission_1)
    Button btn1;

    @BindView(R.id.btn_permission_2)
    Button btn2;

    @BindView(R.id.btn_permission_3)
    Button btn3;

    @BindView(R.id.btn_permission_4)
    Button btn4;

    @BindView(R.id.btn_permission_5)
    Button btn5;

    @BindView(R.id.tv_show)
    TextView tvShow1;

    @BindView(R.id.tv_show1)
    TextView textView1;

    @BindView(R.id.tv_show2)
    TextView textView2;

    @BindView(R.id.tv_show3)
    TextView textView3;


    @Override
    protected int getLayoutId() {
        return R.layout.activity_permission_test;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViews();
    }

    protected void initViews() {

        //只检查权限和结果并显示它
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean b = EasyPermission.build().hasPermission(PermissionTestActivity.this, Manifest.permission.CALL_PHONE);
                tvShow1.setText(b ? "允许" : "拒绝");

            }
        });

        //演示只适用于不需要结果
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EasyPermission.build().requestPermission(PermissionTestActivity.this, Manifest.permission.CALL_PHONE);
            }
        });

        //演示只适用于不需要结果
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NeedReslutPerm();
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                askPerm();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EndlessPerm();
            }
        });

    }



    EasyPermission easyPermission;
    private void askPerm() {
        easyPermission = EasyPermission.build()
                .mRequestCode(RC_CODE_CALLPHONE)
                .mContext(PermissionTestActivity.this)
                .mPerms(Manifest.permission.ACCESS_COARSE_LOCATION)
                .mResult(new EasyPermissionResult() {
                    @Override
                    public void onPermissionsAccess(int requestCode) {
                        super.onPermissionsAccess(requestCode);
                        //做你想做的
                        textView3.setText("do you something here");
                    }

                    @Override
                    public void onPermissionsDismiss(int requestCode, @NonNull List<String> permissions) {
                        super.onPermissionsDismiss(requestCode, permissions);
                        //你的权限被用户拒绝了你怎么办
                        textView3.setText("you " + permissions.toString() + " is onPermissionsDismiss");
                    }

                    @Override
                    public boolean onDismissAsk(int requestCode, @NonNull List<String> permissions) {
                        //你的权限被用户禁止了并且不能请求了你怎么办
                        textView3.setText("you " + permissions.toString() + " is onDismissAsk");
                        easyPermission.openAppDetails(PermissionTestActivity.this, "Call Phone - Give me the permission to dial the number for you");
                        return true;
                    }
                });
        easyPermission.requestPermission();
    }

    /**
     * @description 演示需要结果的
     * @param
     * @return
     */
    private void NeedReslutPerm() {
        EasyPermission.build()
                .mRequestCode(RC_CODE_CALLPHONE)
                .mContext(PermissionTestActivity.this)
                .mPerms(Manifest.permission.READ_PHONE_STATE)
                .mResult(new EasyPermissionResult() {
                    @Override
                    public void onPermissionsAccess(int requestCode) {
                        super.onPermissionsAccess(requestCode);
                        //做你想做的
                        textView1.setText("权限已经获取 做你想做的");
                    }

                    @Override
                    public void onPermissionsDismiss(int requestCode, @NonNull List<String> permissions) {
                        super.onPermissionsDismiss(requestCode, permissions);
                        //你的权限被用户拒绝了你怎么办
                        textView1.setText("你的权限被用户拒绝了你怎么办 you " + permissions.toString() + " is onPermissionsDismiss");
                    }
                }).requestPermission();
    }

    /**
     * @description 当权限必需时你才能进行下一步你怎么办
     * @param
     * @return
     */
    private void EndlessPerm() {
        easyPermission = EasyPermission.build()
                .mRequestCode(RC_CODE_CALLPHONE)
                .mContext(PermissionTestActivity.this)
                .mPerms(Manifest.permission.CALL_PHONE)
                .mResult(new EasyPermissionResult() {
                    @Override
                    public void onPermissionsAccess(int requestCode) {
                        super.onPermissionsAccess(requestCode);
                        //做你想做的
                        textView3.setText("do you something here");
                    }

                    @Override
                    public void onPermissionsDismiss(int requestCode, @NonNull List<String> permissions) {
                        super.onPermissionsDismiss(requestCode, permissions);
                        //你的权限被用户拒绝了你怎么办
                        textView3.setText("you " + permissions.toString() + " is onPermissionsDismiss");
                        //just request it again
                        easyPermission.requestPermission();
                    }

                    @Override
                    public boolean onDismissAsk(int requestCode, @NonNull List<String> permissions) {
                        //你的权限被用户禁止了并且不能请求了你怎么办
                        textView3.setText("you " + permissions.toString() + " is 询问");
                        easyPermission.openAppDetails(PermissionTestActivity.this, "Call Phone - Give me the permission to dial the number for you");
                        return true;
                    }
                });
        easyPermission.requestPermission();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (EasyPermission.APP_SETTINGS_RC == requestCode) {
            //设置界面返回
            //Result from system setting
            if (easyPermission.hasPermission(PermissionTestActivity.this,Manifest.permission.ACCESS_COARSE_LOCATION)) {
                //做你想做的
                textView2.setText("do you something here");
            } else {
                //从设置回来还是没给你权限
                XToast.info(this,"设置里手动 申请 权限 没成功");
            }
        }
    }




}
