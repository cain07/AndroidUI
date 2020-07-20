package com.cain.ui.fragment.writestyle.factoryitem;

import java.util.ArrayList;
import java.util.List;

public class FuncItemFactory {

    private static FuncItemFactory instance;
    public static final String CREAT_ENUMBER = "生成手机好友";
    @Deprecated
    public static final String SHARE_GROUP = "群组分享";
    public static final String QUICK_CONTACTPEOPLE = "加手机好友";
    public static final String ADD_CONTACTPEOPLE = "自动加手机好友";
    public static final String ADD_NEARPEOPLE = "加附近的人";
    public static final String STOP_ADD_PEOPLE = "停止加好友";
    public static final String FLOW_WINDOW = "显示悬浮窗";
    public static final String VALIDATE = "加人验证信息";
    public static final String FEEDBACK = "意见反馈";
    @Deprecated
    public static final String SOFT_VALIDATE = "软件激活";
    public static final String HELP = "帮助";

    private FuncItemFactory() {

    }

    public static FuncItemFactory getInstance() {
        synchronized (FuncItemFactory.class) {
            if (instance == null) {
                instance = new FuncItemFactory();
            }
        }
        return instance;
    }

    public List<FuncItem> createFuncItems() {
        List<FuncItem> list = new ArrayList<FuncItem>() {
            {
                add(new FuncItem(QUICK_CONTACTPEOPLE, "自动快速添加微信手机好友", 1, false));
                add(new FuncItem(ADD_CONTACTPEOPLE, "自动添加微信手机好友", 2, false));
                add(new FuncItem(ADD_NEARPEOPLE, "自动向微信附近的人打招呼", 3, false));
                add(new FuncItem(STOP_ADD_PEOPLE, "停止加人操作", 4, false));
            }
        };
        return list;
    }

}
