package com.cain.ui.fragment.writestyle.doTask;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Intent;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;

/**
 *
 */
public class OneKeyService extends AccessibilityService {

    private static String TAG = "OneKeyService-->";

    public OneKeyService() {
    }


    @Override
    protected void onServiceConnected() {
        super.onServiceConnected();
        Log.e(TAG, "onServiceConnected----");
        AccessibilityServiceInfo config = new AccessibilityServiceInfo();
        Log.e(TAG, "服务开启了");
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        Log.e(TAG, "onAccessibilityEvent----" + event.toString());

        if (true){
            SportZanMonitor.getInstance().doTask(this,event,getRootInActiveWindow());
        }
        if (true){
            NearbyFriendsMonitor.getInstance().doTask(this,event,getRootInActiveWindow());
        }

    }

    @Override
    public void onInterrupt() {
        Log.e(TAG, "onInterrupt----");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e(TAG, "onStartCommand----");
        return super.onStartCommand(intent, flags, startId);
    }


}
