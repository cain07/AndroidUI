/*
 * Copyright (C) 2018 xuexiangjys(xuexiangjys@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cain.util.sub.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Intent;

import com.cain.util.xutil.XUtil;
import com.cain.util.xutil.app.ActivityUtils;
import com.cain.util.xutil.app.BroadcastUtils;
import com.cain.util.xutil.app.IntentUtils;

import java.util.Map;

/**
 * <pre>
 *     desc   : 跳转意图
 *     time   : 2018/4/30 下午12:10
 * </pre>
 */
public final class PendingIntentUtils {

    //==================构建跳转Activity的意图======================//

    /**
     * 构建跳转Activity的意图
     *
     * @param clazz
     * @return
     */
    public static PendingIntent buildActivityIntent(Class<? extends Activity> clazz) {
        return buildActivityIntent(clazz, 0, PendingIntent.FLAG_UPDATE_CURRENT);
    }

    /**
     * 构建跳转Activity的意图
     *
     * @param clazz
     * @return
     */
    public static PendingIntent buildActivityIntent(Class<? extends Activity> clazz, String key, Object param) {
        return buildActivityIntent(clazz, key, param, 0, PendingIntent.FLAG_UPDATE_CURRENT);
    }

    /**
     * 构建跳转Activity的意图
     *
     * @param clazz
     * @return
     */
    public static PendingIntent buildActivityIntent(Class<? extends Activity> clazz, Map<String, Object> map) {
        return buildActivityIntent(clazz, map, 0, PendingIntent.FLAG_UPDATE_CURRENT);
    }

    /**
     * 构建跳转Activity的意图
     *
     * @param clazz       Activity类
     * @param requestCode 请求码
     * @param flags
     * @return
     */
    public static PendingIntent buildActivityIntent(Class<? extends Activity> clazz, int requestCode, int flags) {
        Intent intent = ActivityUtils.getActivityIntent(clazz);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        return PendingIntent.getActivity(XUtil.getContext(), requestCode, intent, flags);
    }

    /**
     * 构建跳转Activity的意图
     *
     * @param clazz       Activity类
     * @param key
     * @param param
     * @param requestCode 请求码
     * @param flags
     * @return
     */
    public static PendingIntent buildActivityIntent(Class<? extends Activity> clazz, String key, Object param, int requestCode, int flags) {
        Intent intent = ActivityUtils.getActivityIntent(clazz, key, param);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        return PendingIntent.getActivity(XUtil.getContext(), requestCode, intent, flags);
    }

    /**
     * 构建跳转Activity的意图
     *
     * @param clazz       Activity类
     * @param map         携带的数据
     * @param requestCode 请求码
     * @param flags
     * @return
     */
    public static PendingIntent buildActivityIntent(Class<? extends Activity> clazz, Map<String, Object> map, int requestCode, int flags) {
        Intent intent = ActivityUtils.getActivityIntent(clazz, map);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        return PendingIntent.getActivity(XUtil.getContext(), requestCode, intent, flags);
    }

    //==================构建广播的意图======================//

    /**
     * 构建广播的意图
     *
     * @param action      广播动作
     * @param requestCode 请求码
     * @return
     */
    public static PendingIntent buildBroadcastIntent(String action, int requestCode) {
        Intent intent = BroadcastUtils.getBroadCastIntent(action);
        return PendingIntent.getBroadcast(XUtil.getContext(), requestCode, intent, PendingIntent.FLAG_UPDATE_CURRENT);
    }

    /**
     * 构建广播的意图
     *
     * @param cls         广播接收器
     * @param requestCode 请求码
     * @return
     */
    public static PendingIntent buildBroadcastIntent(Class<? extends BroadcastReceiver> cls, int requestCode) {
        Intent intent = BroadcastUtils.getBroadCastIntent(cls);
        return PendingIntent.getBroadcast(XUtil.getContext(), requestCode, intent, PendingIntent.FLAG_UPDATE_CURRENT);
    }

    /**
     * 构建广播的意图
     *
     * @param action      广播动作
     * @param key
     * @param param
     * @param requestCode 请求码
     * @return
     */
    public static PendingIntent buildBroadcastIntent(String action, String key, Object param, int requestCode) {
        Intent intent = BroadcastUtils.getBroadCastIntent(action);
        IntentUtils.putExtra(intent, key, param);
        return PendingIntent.getBroadcast(XUtil.getContext(), requestCode, intent, PendingIntent.FLAG_UPDATE_CURRENT);
    }

    /**
     * 构建广播的意图
     *
     * @param cls         广播接收器
     * @param key
     * @param param
     * @param requestCode 请求码
     * @return
     */
    public static PendingIntent buildBroadcastIntent(Class<? extends BroadcastReceiver> cls, String key, Object param, int requestCode) {
        Intent intent = BroadcastUtils.getBroadCastIntent(cls);
        IntentUtils.putExtra(intent, key, param);
        return PendingIntent.getBroadcast(XUtil.getContext(), requestCode, intent, PendingIntent.FLAG_UPDATE_CURRENT);
    }

    /**
     * 构建广播的意图
     *
     * @param cls         广播接收器
     * @param action      广播动作
     * @param requestCode 请求码
     * @return
     */
    public static PendingIntent buildBroadcastIntent(Class<? extends BroadcastReceiver> cls, String action, int requestCode) {
        Intent intent = BroadcastUtils.getBroadCastIntent(cls, action);
        return PendingIntent.getBroadcast(XUtil.getContext(), requestCode, intent, PendingIntent.FLAG_UPDATE_CURRENT);
    }

    /**
     * 构建广播的意图
     *
     * @param cls         广播接收器
     * @param action      广播动作
     * @param key
     * @param param
     * @param requestCode 请求码
     * @return
     */
    public static PendingIntent buildBroadcastIntent(Class<? extends BroadcastReceiver> cls, String action, String key, Object param, int requestCode) {
        Intent intent = BroadcastUtils.getBroadCastIntent(cls, action);
        IntentUtils.putExtra(intent, key, param);
        return PendingIntent.getBroadcast(XUtil.getContext(), requestCode, intent, PendingIntent.FLAG_UPDATE_CURRENT);
    }

    /**
     * 构建广播的意图
     *
     * @param cls         广播接收器
     * @param action      广播动作
     * @param map         携带的数据
     * @param requestCode 请求码
     * @return
     */
    public static PendingIntent buildBroadcastIntent(Class<? extends BroadcastReceiver> cls, String action, Map<String, Object> map, int requestCode) {
        Intent intent = BroadcastUtils.getBroadCastIntent(cls, action, map);
        return PendingIntent.getBroadcast(XUtil.getContext(), requestCode, intent, PendingIntent.FLAG_UPDATE_CURRENT);
    }

}
