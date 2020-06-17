package com.cain.ui.fragment.components.circle;

import android.graphics.PixelFormat;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cain.base.base.BaseFragment;
import com.cain.cpage.annotation.Page;
import com.cain.cpage.enums.CoreAnim;
import com.cain.ui.R;
import com.cain.ui.fragment.components.circle.view.CircleCameraPreview;

import java.io.IOException;

import butterknife.BindView;

@Page(name = "CameraCircle2Fragment", anim = CoreAnim.zoom)
public class CameraCircle2Fragment extends BaseFragment {


    private final String TAG = "PreviewActivity";
    private Camera camera;
    private boolean isPreview = false;

    @BindView(R.id.face_view)
    CircleCameraPreview fv_view;

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
        return R.layout.fragment_circle_camera_2;
    }

    @Override
    protected void initViews() {
//        addSurfaceView();


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

    private void addSurfaceView() {
        //添加布局
        SurfaceView mSurfaceView = new SurfaceView(getActivity());
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        params.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE);
        mSurfaceView.setLayoutParams(params);
        layout_root.addView(mSurfaceView, 1);
        //得到getHolder实例
        SurfaceHolder mSurfaceHolder = mSurfaceView.getHolder();
        mSurfaceHolder.setFormat(PixelFormat.TRANSPARENT);
        // 添加 Surface 的 callback 接口
        mSurfaceHolder.addCallback(mSurfaceCallback);
    }


    private SurfaceHolder.Callback mSurfaceCallback = new SurfaceHolder.Callback() {
        @Override
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            try {
                //打开硬件摄像头，这里导包得时候一定要注意是android.hardware.Camera
                // Camera,open() 默认返回的后置摄像头信息
                //设置角度，此处 CameraId 我默认 为 1 （前置）
                if (Camera.getNumberOfCameras() > 1) {
                    camera = Camera.open(1);
                } else {
                    camera = Camera.open(0);
                }
                //设置相机角度
                camera.setDisplayOrientation(90);
                //通过SurfaceView显示取景画面
                camera.setPreviewDisplay(surfaceHolder);
                //开始预览
                camera.startPreview();
                //设置是否预览参数为真
                isPreview = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void surfaceChanged(SurfaceHolder surfaceHolder, int format, int width, int height) {
        }

        @Override
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (camera != null) {
                if (isPreview) {//正在预览
                    try {
                        camera.stopPreview();
                        camera.release();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    };




}
