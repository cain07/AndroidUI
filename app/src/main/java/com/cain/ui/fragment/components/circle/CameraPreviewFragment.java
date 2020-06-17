package com.cain.ui.fragment.components.circle;

import android.hardware.Camera;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cain.base.base.BaseFragment;
import com.cain.cpage.annotation.Page;
import com.cain.cpage.enums.CoreAnim;
import com.cain.ui.R;
import com.cain.ui.fragment.components.circle.preview.CameraPreview;
import com.cain.ui.fragment.components.circle.preview.CircleCameraLayout;

import butterknife.BindView;

@Page(name = "CameraPreviewFragment", anim = CoreAnim.zoom)
public class CameraPreviewFragment extends BaseFragment {


    private final String TAG = "PreviewActivity";
    private Camera camera;
    private boolean isPreview = false;

    private CameraPreview cameraPreview;

    @BindView(R.id.rootLayout)
    CircleCameraLayout rootLayout;

    @BindView(R.id.ll_root)
    LinearLayout layout_root;

    @BindView(R.id.btn_start)
    Button btn_start;

    @BindView(R.id.btn_restore)
    Button btn_restore;

    @BindView(R.id.tv_countdown)
    TextView tv_countdown;


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_circle_camera_pre;
    }

    @Override
    protected void initViews() {


        startCamera();


        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //开始倒计时


            }
        });


        btn_restore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

    }


    private void startCamera() {
        if (null != cameraPreview) cameraPreview.releaseCamera();
        cameraPreview = new CameraPreview(getActivity());
        rootLayout.removeAllViews();
        rootLayout.setCameraPreview(cameraPreview);
        rootLayout.startView();

    }





}
