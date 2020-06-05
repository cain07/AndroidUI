package com.cain.cpage;

import com.cain.cpage.enums.CoreAnim;
import com.cain.cpage.model.PageInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>这是PageConfigProcessor自动生成的类，用以自动进行页面的注册。</p>
 * @date 2020-05-18 13:50:39
 */
public class AppPageConfig {
  private static AppPageConfig sInstance;

  private List<PageInfo> mPages;

  private List<PageInfo> mComponents;

  private List<PageInfo> mUtils;

  private List<PageInfo> mExpands;

  private AppPageConfig() {
    mPages = new ArrayList<>();
    mComponents = new ArrayList<>();
    mUtils = new ArrayList<>();
    mExpands = new ArrayList<>();

    initPage();

    initComponents();

    initUtils();

    initExpands();
  }

  /**
   * @description 拓展的页面
   * @param
   * @return
   */
  private void initExpands() {
     mExpands.add(new PageInfo("双列表联动", "com.xuexiang.xuidemo.fragment.expands.LinkageRecyclerViewFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230908));
  }

  /**
   * @description 工具的页面
   * @param
   * @return
   */
  private void initUtils() {
     mUtils.add(new PageInfo("ColorUtils", "com.xuexiang.xuidemo.fragment.utils.ColorUtilsFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230976));
     mUtils.add(new PageInfo("PermissionTestFragment", "com.cain.ui.fragment.utils.PermissionTestFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230976));
  }
  /**
   * @description 组件的页面
   * @param
   * @return
   */
  private void initComponents() {
     mComponents.add(new PageInfo("进度条", "com.xuexiang.xuidemo.fragment.components.ProgressBarFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230992));
  }

  private void initPage() {
    mPages.add(new PageInfo("工具", "com.cain.ui.fragment.UtilitysFragment", "{\"\":\"\"}", CoreAnim.none, -1));
    mPages.add(new PageInfo("组件", "com.cain.ui.fragment.ComponentsFragment", "{\"\":\"\"}", CoreAnim.none, -1));
    mPages.add(new PageInfo("拓展", "com.cain.ui.fragment.ExpandsFragment", "{\"\":\"\"}", CoreAnim.fade, -1));

    mPages.add(new PageInfo("增加HeadView和FootView\n"
            + "嵌套轮播组件", "com.xuexiang.xuidemo.fragment.components.refresh.RefreshHeadViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));

  }

  public static AppPageConfig getInstance() {
    if (sInstance == null) {
      synchronized (AppPageConfig.class) {
        if (sInstance == null) {
          sInstance = new AppPageConfig();
        }
      }
    }
    return sInstance;
  }

  public List<PageInfo> getPages() {
    return mPages;
  }

  public List<PageInfo> getComponents() {
    return mComponents;
  }

  public List<PageInfo> getUtils() {
    return mUtils;
  }

  public List<PageInfo> getExpands() {
    return mExpands;
  }
}
