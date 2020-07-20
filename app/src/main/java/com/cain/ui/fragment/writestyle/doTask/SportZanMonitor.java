package com.cain.ui.fragment.writestyle.doTask;

import android.accessibilityservice.AccessibilityService;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class SportZanMonitor implements Monitor{

    private static String TAG = "MyAccessibilityService-->";

    static SportZanMonitor monitor = null;

    public static SportZanMonitor getInstance() {
        if (monitor == null){
            monitor = new SportZanMonitor();
        }
        return monitor;
    }

    @Override
    public void doTask(AccessibilityService service, AccessibilityEvent event, AccessibilityNodeInfo nodeInfo) {
        Log.e(TAG,"doTask");
    }
}
