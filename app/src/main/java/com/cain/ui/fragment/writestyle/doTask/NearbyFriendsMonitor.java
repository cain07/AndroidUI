package com.cain.ui.fragment.writestyle.doTask;

import android.accessibilityservice.AccessibilityService;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class NearbyFriendsMonitor implements Monitor{


    private static String TAG = "NearbyFriendsMonitor-->";

    static NearbyFriendsMonitor monitor = null;

    public static NearbyFriendsMonitor getInstance() {
        if (monitor == null){
            monitor = new NearbyFriendsMonitor();
        }
        return monitor;
    }


    @Override
    public void doTask(AccessibilityService service, AccessibilityEvent event, AccessibilityNodeInfo nodeInfo) {

        Log.e(TAG,"doTask");
    }

}
