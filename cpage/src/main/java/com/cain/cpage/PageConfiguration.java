package com.cain.cpage;

import android.content.Context;

import com.cain.cpage.model.PageInfo;

import java.util.List;

/**
  * @Description:    页面配置接口
  * @Author:         cain
  * @CreateDate:     2020/5/17 下午10:22
  * @Version:        1.0
 */
public interface PageConfiguration  {

    /**
     * 注册页面
     * @param context
     */
    List<PageInfo> registerPages(Context context);
}
