package com.cain.ui.fragment.writestyle;

import android.util.SparseArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cain.ui.R;
import com.cain.ui.base.BaseModuleFragment;
import com.cain.ui.fragment.components.circle.CameraCircle2Fragment;
import com.cain.ui.fragment.components.circle.CameraCircleFragment;
import com.cain.ui.fragment.components.circle.CameraPreviewFragment;
import com.cain.ui.fragment.components.circle.CountProgressFragment;
import com.cain.util.sub.app.FragmentUtils;

import butterknife.BindView;

public class WritesIndexFragment extends BaseModuleFragment {

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

    private LinearLayout rootView;
    private int view_sparse_count = 0;

    private SparseArray<View> sparseArray = new SparseArray<>();


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_writes_index;
    }

    @Override
    protected void initViews() {
        super.initViews();

        rootView = (LinearLayout) getRootView();
        //只检查权限和结果并显示它
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view_sparse_count++;
                switch (view_sparse_count){
                    case 1:
                        initLayout(R.layout.view_sparse_one);
                        break;
                    case 2:
                        initLayout(R.layout.view_sparse_two);
                        break;
                    case 3:
                        view_sparse_count = 0;
                        initLayout(R.layout.view_sparse_thr);
                        break;
                }
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

    @Override
    protected String getPageTitle() {
        return "写法集合";
    }


    private View initLayout(int layoutId) {
        int count = rootView.getChildCount();
        if (count == 3) //id 为 要 替换的那个
            rootView.removeViewAt(2);

        /*if (layoutId == R.layout.layout_bluetooth_pair_code || layoutId == R.layout.layout_bluetooth_connect || layoutId == R.layout.layout_fix_key_pwd_igtb) {
            rootView.getChildAt(1).setVisibility(View.GONE);
        } else {
            rootView.getChildAt(1).setVisibility(View.VISIBLE);
        }*/

        View view = sparseArray.get(layoutId);
        if (view == null) {
            view = getLayoutInflater().from(getContext()).inflate(layoutId, rootView, false);
            sparseArray.append(layoutId, view);
        }
        rootView.addView(view);
        return view;
    }


}
