package com.cain.ui.fragment.writestyle.doTask;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public interface Monitor {

    void doTask(AccessibilityService service, AccessibilityEvent event, AccessibilityNodeInfo nodeInfo);

}
