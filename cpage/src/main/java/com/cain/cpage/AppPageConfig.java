package com.cain.cpage;

import com.cain.cpage.enums.CoreAnim;
import com.cain.cpage.model.PageInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>这是PageConfigProcessor自动生成的类，用以自动进行页面的注册。</p>
 * <p><a href="mailto:xuexiangjys@163.com">Contact me.</a></p>
 *
 * @author xuexiang 
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
    mPages.add(new PageInfo("赞助项目", "com.xuexiang.xuidemo.fragment.SponsorFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("LoginFragment", "com.xuexiang.xuidemo.fragment.LoginFragment", "{\"\":\"\"}", CoreAnim.none, -1));
    mPages.add(new PageInfo("简单的日历控件\n"
            + "支持自定义样式", "com.xuexiang.xuidemo.fragment.expands.calendar.SimpleCalendarFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("叮叮日历", "com.xuexiang.xuidemo.fragment.expands.calendar.DingDingCalendarFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("MaterialDesign风格日历", "com.xuexiang.xuidemo.fragment.expands.calendar.MaterialDesignCalendarFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("农历日历", "com.xuexiang.xuidemo.fragment.expands.calendar.ChineseCalendarFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("复杂的日历控件\n"
            + "支持多种表现形式", "com.xuexiang.xuidemo.fragment.expands.calendar.ComplexCalendarFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mExpands.add(new PageInfo("Material Design", "com.xuexiang.xuidemo.fragment.expands.MaterialDesignFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230910));
    mPages.add(new PageInfo("Material Design", "com.xuexiang.xuidemo.fragment.expands.MaterialDesignFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230910));
    mExpands.add(new PageInfo("web浏览器", "com.xuexiang.xuidemo.fragment.expands.WebViewFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230914));
    mPages.add(new PageInfo("web浏览器", "com.xuexiang.xuidemo.fragment.expands.WebViewFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230914));
    mExpands.add(new PageInfo("SnapHelper使用", "com.xuexiang.xuidemo.fragment.expands.SnapHelperFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230912));
    mPages.add(new PageInfo("SnapHelper使用", "com.xuexiang.xuidemo.fragment.expands.SnapHelperFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230912));
    mExpands.add(new PageInfo("字体图标库", "com.xuexiang.xuidemo.fragment.expands.IconFontFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230907));
    mPages.add(new PageInfo("字体图标库", "com.xuexiang.xuidemo.fragment.expands.IconFontFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230907));
    mPages.add(new PageInfo("CameraKit", "com.xuexiang.xuidemo.fragment.expands.camera.CameraKitFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("BarChart\n"
            + "柱状图", "com.xuexiang.xuidemo.fragment.expands.chart.BarChartFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("HalfPieChart\n"
            + "半个饼图", "com.xuexiang.xuidemo.fragment.expands.chart.pie.HalfPieChartFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("BasicPieChart\n"
            + "基础饼图，详细API", "com.xuexiang.xuidemo.fragment.expands.chart.pie.BasicPieChartFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("MultiLineChart\n"
            + "多组数据的折线图", "com.xuexiang.xuidemo.fragment.expands.chart.line.MultiLineChartFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("BasicLineChart\n"
            + "基础折线图，详细API", "com.xuexiang.xuidemo.fragment.expands.chart.line.BasicLineChartFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("PieChart\n"
            + "饼图", "com.xuexiang.xuidemo.fragment.expands.chart.PieChartFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("BasicBarChart\n"
            + "基础的柱状图，详细API", "com.xuexiang.xuidemo.fragment.expands.chart.bar.BasicBarChartFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("SimpleBarChart\n"
            + "默认的柱状图样式", "com.xuexiang.xuidemo.fragment.expands.chart.bar.SimpleBarChartFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("HorizontalBarChart\n"
            + "水平横向柱状图", "com.xuexiang.xuidemo.fragment.expands.chart.bar.HorizontalBarChartFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("ECharts\n"
            + "Android原生调用", "com.xuexiang.xuidemo.fragment.expands.chart.echarts.EChartsAndroidFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("ECharts\n"
            + "非常丰富的web图表组件", "com.xuexiang.xuidemo.fragment.expands.chart.echarts.EChartsFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("LineChart\n"
            + "折线图", "com.xuexiang.xuidemo.fragment.expands.chart.LineChartFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("RadarChart\n"
            + "雷达图", "com.xuexiang.xuidemo.fragment.expands.chart.RadarChartFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mExpands.add(new PageInfo("照相机", "com.xuexiang.xuidemo.fragment.expands.CameraFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230904));
    mPages.add(new PageInfo("照相机", "com.xuexiang.xuidemo.fragment.expands.CameraFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230904));
    mPages.add(new PageInfo("腾讯X5文件浏览器", "com.xuexiang.xuidemo.fragment.expands.webview.TbsWebFileReaderFragment", "{\"key_file_uri\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("简单的JS通信", "com.xuexiang.xuidemo.fragment.expands.webview.JsWebViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mExpands.add(new PageInfo("悬浮窗", "com.xuexiang.xuidemo.fragment.expands.FloatViewFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230906));
    mPages.add(new PageInfo("悬浮窗", "com.xuexiang.xuidemo.fragment.expands.FloatViewFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230906));
    mExpands.add(new PageInfo("日历", "com.xuexiang.xuidemo.fragment.expands.CalendarFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230903));
    mPages.add(new PageInfo("日历", "com.xuexiang.xuidemo.fragment.expands.CalendarFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230903));
    mPages.add(new PageInfo("二维码生成器", "com.xuexiang.xuidemo.fragment.expands.qrcode.QRCodeProduceFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("自定义二维码扫描", "com.xuexiang.xuidemo.fragment.expands.qrcode.CustomCaptureFragment", "{\"\":\"\"}", CoreAnim.none, -1));
    mPages.add(new PageInfo("字体图标库的用法展示", "com.xuexiang.xuidemo.fragment.expands.iconfont.SimpleIconFontFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("XUIIconFont展示", "com.xuexiang.xuidemo.fragment.expands.iconfont.XUIIconFontDisplayFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mExpands.add(new PageInfo("城市选择", "com.xuexiang.xuidemo.fragment.expands.CityPickerFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230909));
    mPages.add(new PageInfo("城市选择", "com.xuexiang.xuidemo.fragment.expands.CityPickerFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230909));
    mPages.add(new PageInfo("RecyclerView + CardView\n"
            + "常见的列表展示组合", "com.xuexiang.xuidemo.fragment.expands.materialdesign.behavior.RecyclerViewBehaviorFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("TabLayout + ViewPager + AppBarLayout", "com.xuexiang.xuidemo.fragment.expands.materialdesign.behavior.TabLayoutBehaviorFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("BottomNavigationView Behavior", "com.xuexiang.xuidemo.fragment.expands.materialdesign.behavior.BottomNavigationViewBehaviorFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("复杂详情页联动", "com.xuexiang.xuidemo.fragment.expands.materialdesign.behavior.ComplexDetailsPageFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("CoordinatorLayout + AppBarLayout\n"
            + "详情页常用组合", "com.xuexiang.xuidemo.fragment.expands.materialdesign.behavior.ToolbarBehaviorFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Behavior\n"
            + "手势行为", "com.xuexiang.xuidemo.fragment.expands.materialdesign.BehaviorFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("DrawerLayout + NavigationView\n"
            + "常见主页布局", "com.xuexiang.xuidemo.fragment.expands.materialdesign.DrawerLayoutFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("ConstraintLayout\n"
            + "约束布局", "com.xuexiang.xuidemo.fragment.expands.materialdesign.ConstraintLayoutFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("ToolBar使用", "com.xuexiang.xuidemo.fragment.expands.materialdesign.ToolBarFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("BottomSheetDialog", "com.xuexiang.xuidemo.fragment.expands.materialdesign.BottomSheetDialogFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("分组Group使用", "com.xuexiang.xuidemo.fragment.expands.materialdesign.constraintlayout.ConstraintLayoutGroupFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("ConstraintLayoutContainerFragment", "com.xuexiang.xuidemo.fragment.expands.materialdesign.constraintlayout.ConstraintLayoutContainerFragment", "{\"key_layout_id\":\"\",\"key_title\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("ConstraintSet实现切换动画", "com.xuexiang.xuidemo.fragment.expands.materialdesign.constraintlayout.ConstraintLayoutConstraintSetFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("占位符Placeholder使用", "com.xuexiang.xuidemo.fragment.expands.materialdesign.constraintlayout.ConstraintLayoutPlaceholderFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mExpands.add(new PageInfo("图表", "com.xuexiang.xuidemo.fragment.expands.MPAndroidChartFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230905));
    mPages.add(new PageInfo("图表", "com.xuexiang.xuidemo.fragment.expands.MPAndroidChartFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230905));
    mExpands.add(new PageInfo("二维码", "com.xuexiang.xuidemo.fragment.expands.XQRCodeFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230911));
    mPages.add(new PageInfo("二维码", "com.xuexiang.xuidemo.fragment.expands.XQRCodeFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230911));
    mPages.add(new PageInfo("仿饿了么双列表联动菜单", "com.xuexiang.xuidemo.fragment.expands.linkage.LinkageRecyclerViewElemeFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("双列表简单使用", "com.xuexiang.xuidemo.fragment.expands.linkage.LinkageRecyclerViewSimpleFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("双列表自定义样式", "com.xuexiang.xuidemo.fragment.expands.linkage.LinkageRecyclerViewCustomFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mExpands.add(new PageInfo("双列表联动", "com.xuexiang.xuidemo.fragment.expands.LinkageRecyclerViewFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230908));
    mPages.add(new PageInfo("双列表联动", "com.xuexiang.xuidemo.fragment.expands.LinkageRecyclerViewFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230908));
    mPages.add(new PageInfo("拓展", "com.cain.ui.fragment.fragment.ExpandsFragment", "{\"\":\"\"}", CoreAnim.none, -1));
    mPages.add(new PageInfo("组件", "com.cain.ui.fragment.ComponentsFragment", "{\"\":\"\"}", CoreAnim.none, -1));
    mUtils.add(new PageInfo("DrawableUtils", "com.xuexiang.xuidemo.fragment.utils.DrawableUtilsFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230977));
    mPages.add(new PageInfo("DrawableUtils", "com.xuexiang.xuidemo.fragment.utils.DrawableUtilsFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230977));
    mUtils.add(new PageInfo("ViewUtils", "com.xuexiang.xuidemo.fragment.utils.ViewUtilsFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230980));
    mPages.add(new PageInfo("ViewUtils", "com.xuexiang.xuidemo.fragment.utils.ViewUtilsFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230980));
    mUtils.add(new PageInfo("SnackBarUtils", "com.xuexiang.xuidemo.fragment.utils.SnackBarUtilsFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230978));
    mPages.add(new PageInfo("SnackBarUtils", "com.xuexiang.xuidemo.fragment.utils.SnackBarUtilsFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230978));
    mUtils.add(new PageInfo("ColorUtils", "com.xuexiang.xuidemo.fragment.utils.ColorUtilsFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230976));
    mPages.add(new PageInfo("ColorUtils", "com.xuexiang.xuidemo.fragment.utils.ColorUtilsFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230976));
    mPages.add(new PageInfo("控件Padding", "com.xuexiang.xuidemo.fragment.utils.view.ViewPaddingFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("属性动画", "com.xuexiang.xuidemo.fragment.utils.view.ObjectAnimationFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("控件动画", "com.xuexiang.xuidemo.fragment.utils.view.ViewAnimationFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mUtils.add(new PageInfo("StatusBarUtils", "com.xuexiang.xuidemo.fragment.utils.StatusBarUtilsFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230979));
    mPages.add(new PageInfo("StatusBarUtils", "com.xuexiang.xuidemo.fragment.utils.StatusBarUtilsFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230979));
    mComponents.add(new PageInfo("进度条", "com.xuexiang.xuidemo.fragment.components.ProgressBarFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230992));
    mPages.add(new PageInfo("进度条", "com.xuexiang.xuidemo.fragment.components.ProgressBarFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230992));
    mComponents.add(new PageInfo("文字滚动", "com.xuexiang.xuidemo.fragment.components.MarqueeViewFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230993));
    mPages.add(new PageInfo("文字滚动", "com.xuexiang.xuidemo.fragment.components.MarqueeViewFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230993));
    mComponents.add(new PageInfo("轮播条", "com.xuexiang.xuidemo.fragment.components.BannerFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230984));
    mPages.add(new PageInfo("轮播条", "com.xuexiang.xuidemo.fragment.components.BannerFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230984));
    mComponents.add(new PageInfo("状态切换", "com.xuexiang.xuidemo.fragment.components.StateLayoutFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230999));
    mPages.add(new PageInfo("状态切换", "com.xuexiang.xuidemo.fragment.components.StateLayoutFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230999));
    mPages.add(new PageInfo("BadgeView\n"
            + "小红点标记", "com.xuexiang.xuidemo.fragment.components.textview.BadgeViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("可伸缩折叠的TextView", "com.xuexiang.xuidemo.fragment.components.textview.ExpandableTextViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("XUIGroupListView\n"
            + "通用的GroupListView，注意它不是ListView", "com.xuexiang.xuidemo.fragment.components.textview.GroupListViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("带网络图片的SuperTextView", "com.xuexiang.xuidemo.fragment.components.textview.supertextview.SuperNetPictureLoadingFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("SuperButton", "com.xuexiang.xuidemo.fragment.components.textview.supertextview.SuperButtonFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("SuperTextView点击事件", "com.xuexiang.xuidemo.fragment.components.textview.supertextview.SuperClickFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("使用SuperTextView写一个用户中心界面\n"
            + "仿苹果界面拖动回弹效果", "com.xuexiang.xuidemo.fragment.components.textview.supertextview.SuperTextCommonUseFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("AutoFitTextView\n"
            + "自适应字体大小的文字", "com.xuexiang.xuidemo.fragment.components.textview.AutoFitTextViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("可拓展的TextView", "com.xuexiang.xuidemo.fragment.components.textview.SuperTextViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("LabelView\n"
            + "标签", "com.xuexiang.xuidemo.fragment.components.textview.LabelViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("图片加载策略", "com.xuexiang.xuidemo.fragment.components.imageview.ImageLoadStrategyFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("图片编辑", "com.xuexiang.xuidemo.fragment.components.imageview.ImageEditFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("PictureSelector\n"
            + "图片选择", "com.xuexiang.xuidemo.fragment.components.imageview.pictureselector.PictureSelectorFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("资源图片预览", "com.xuexiang.xuidemo.fragment.components.imageview.DrawablePreviewFragment", "{\"drawable_id\":\"\"}", CoreAnim.none, -1));
    mPages.add(new PageInfo("图片编辑\n"
            + "画笔、橡皮檫、文字、滤镜、保存", "com.xuexiang.xuidemo.fragment.components.imageview.edit.PhotoEditFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("图片增强处理", "com.xuexiang.xuidemo.fragment.components.imageview.edit.ImageEnhanceFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("图片裁剪", "com.xuexiang.xuidemo.fragment.components.imageview.edit.ImageCropFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("RadiusImageView\n"
            + "圆角图片", "com.xuexiang.xuidemo.fragment.components.imageview.RadiusImageViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("图片预览", "com.xuexiang.xuidemo.fragment.components.imageview.PreviewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("RecycleView 图片预览", "com.xuexiang.xuidemo.fragment.components.imageview.preview.PreviewRecycleViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("NineGrid 九宫格预览", "com.xuexiang.xuidemo.fragment.components.imageview.preview.NineGridImageViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mComponents.add(new PageInfo("下拉框", "com.xuexiang.xuidemo.fragment.components.SpinnerFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230998));
    mPages.add(new PageInfo("下拉框", "com.xuexiang.xuidemo.fragment.components.SpinnerFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230998));
    mComponents.add(new PageInfo("选项卡", "com.xuexiang.xuidemo.fragment.components.TabBarFragment", "{\"\":\"\"}", CoreAnim.slide, 2131231000));
    mPages.add(new PageInfo("选项卡", "com.xuexiang.xuidemo.fragment.components.TabBarFragment", "{\"\":\"\"}", CoreAnim.slide, 2131231000));
    mComponents.add(new PageInfo("流布局", "com.xuexiang.xuidemo.fragment.components.FlowLayoutFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230988));
    mPages.add(new PageInfo("流布局", "com.xuexiang.xuidemo.fragment.components.FlowLayoutFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230988));
    mPages.add(new PageInfo("Snackbar\n"
            + "使用详解", "com.xuexiang.xuidemo.fragment.components.popupwindow.SnackbarFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("XToast\n"
            + "多重样式的Toast显示", "com.xuexiang.xuidemo.fragment.components.popupwindow.XToastFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("CookieBar\n"
            + "顶部和底部信息显示条", "com.xuexiang.xuidemo.fragment.components.popupwindow.CookieBarFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("EasyPopup\n"
            + "可自定义的弹出窗", "com.xuexiang.xuidemo.fragment.components.popupwindow.EasyPopFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("XUIPopup\n"
            + "通用弹窗", "com.xuexiang.xuidemo.fragment.components.popupwindow.XUIPopupFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("控件提示工具", "com.xuexiang.xuidemo.fragment.components.popupwindow.ViewTipFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("弹出框统一样式", "com.xuexiang.xuidemo.fragment.components.popupwindow.PopupWindowStyleFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("MaterialProgressBar\n"
            + "进度条", "com.xuexiang.xuidemo.fragment.components.progress.MaterialProgressBarFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("漂亮的进度条", "com.xuexiang.xuidemo.fragment.components.progress.BeautifulProgressBarFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("RotateLoadingView\n"
            + "旋转加载控件", "com.xuexiang.xuidemo.fragment.components.progress.RotateLoadingViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("RatingBar\n"
            + "星级评分控件", "com.xuexiang.xuidemo.fragment.components.progress.RatingBarFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("ARCLoadingView\n"
            + "圆弧加载控件", "com.xuexiang.xuidemo.fragment.components.progress.ArcLoadingViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("环形进度条样式", "com.xuexiang.xuidemo.fragment.components.progress.DeterminateCircularFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("SwipeRecyclerView\n"
            + "基于RecyclerView封装, 支持Item侧滑菜单、Item滑动删除、Item长按拖拽、添加HeaderView/FooterView、加载更多、Item点击监听等功能", "com.xuexiang.xuidemo.fragment.components.refresh.SwipeRecyclerViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("SmartRefreshLayout\n"
            + "Android智能下拉刷新框架", "com.xuexiang.xuidemo.fragment.components.refresh.SmartRefreshLayoutFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("增加HeadView和FootView\n"
            + "嵌套轮播组件", "com.xuexiang.xuidemo.fragment.components.refresh.RefreshHeadViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Broccoli\n"
            + "预加载占位控件", "com.xuexiang.xuidemo.fragment.components.refresh.BroccoliFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("SwipeRefreshLayout\n"
            + "谷歌官方下拉刷新控件", "com.xuexiang.xuidemo.fragment.components.refresh.SwipeRefreshLayoutFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("SwipeMenuItem\n"
            + "Item侧滑菜单", "com.xuexiang.xuidemo.fragment.components.refresh.swipe.SwipeMenuItemFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("SwipeItemMove\n"
            + "侧滑删除和拖拽", "com.xuexiang.xuidemo.fragment.components.refresh.swipe.SwipeDragMoveFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("下拉刷新和加载更多\n"
            + "拓展SwipeRefreshLayout的功能", "com.xuexiang.xuidemo.fragment.components.refresh.swipe.SwipeRefreshFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("动态添加Head、FootView", "com.xuexiang.xuidemo.fragment.components.refresh.swipe.SwipeHeadFootViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("下拉刷新样式\n"
            + "包含10多种下拉样式", "com.xuexiang.xuidemo.fragment.components.refresh.smartrefresh.RefreshStyleFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("自定义下拉刷新样式", "com.xuexiang.xuidemo.fragment.components.refresh.smartrefresh.style.RefreshCustomStyleFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("经典样式", "com.xuexiang.xuidemo.fragment.components.refresh.smartrefresh.style.RefreshClassicsStyleFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("样式大全", "com.xuexiang.xuidemo.fragment.components.refresh.smartrefresh.style.RefreshAllStyleFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Material Design风格", "com.xuexiang.xuidemo.fragment.components.refresh.smartrefresh.style.RefreshMaterialStyleFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("下拉刷新基础用法\n"
            + "上拉加载、下拉刷新、自动刷新和点击事件", "com.xuexiang.xuidemo.fragment.components.refresh.smartrefresh.RefreshBasicFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("刷新状态布局\n"
            + "自动切换状态，包含出错、无网络、暂无数据等", "com.xuexiang.xuidemo.fragment.components.refresh.smartrefresh.RefreshStatusLayoutFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("普通占位控件", "com.xuexiang.xuidemo.fragment.components.refresh.broccoli.CommonPlaceholderFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("动画占位控件", "com.xuexiang.xuidemo.fragment.components.refresh.broccoli.AnimationPlaceholderFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("MultipleStatusView\n"
            + "自定义布局", "com.xuexiang.xuidemo.fragment.components.statelayout.MultipleStatusViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("StatusView\n"
            + "状态提示", "com.xuexiang.xuidemo.fragment.components.statelayout.StatusViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("StatefulLayout\n"
            + "定制模版", "com.xuexiang.xuidemo.fragment.components.statelayout.StatefulLayoutFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mComponents.add(new PageInfo("引导页", "com.xuexiang.xuidemo.fragment.components.GuideViewFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230989));
    mPages.add(new PageInfo("引导页", "com.xuexiang.xuidemo.fragment.components.GuideViewFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230989));
    mPages.add(new PageInfo("OptionsPicker\n"
            + "条件选择器--省市区三级联动", "com.xuexiang.xuidemo.fragment.components.pickerview.AddressPickerFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("OptionsPickerView\n"
            + "条件选择器--自定义选择条件", "com.xuexiang.xuidemo.fragment.components.pickerview.OptionsPickerViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("RulerView\n"
            + "支持选择身高、体重、视力的尺子", "com.xuexiang.xuidemo.fragment.components.pickerview.RulerViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("TimePicker\n"
            + "时间选择器", "com.xuexiang.xuidemo.fragment.components.pickerview.TimePickerFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("SeekBar\n"
            + "滑块选择器，支持双向范围选择", "com.xuexiang.xuidemo.fragment.components.pickerview.SeekBarFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("可伸缩布局\n"
            + "可水平、垂直伸缩", "com.xuexiang.xuidemo.fragment.components.layout.ExpandableLayoutFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("AlphaView\n"
            + "点击改变背景透明度的控件", "com.xuexiang.xuidemo.fragment.components.layout.AlphaViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("可伸缩布局简单使用", "com.xuexiang.xuidemo.fragment.components.layout.expandable.ExpandableSimpleFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("在RecycleView中使用", "com.xuexiang.xuidemo.fragment.components.layout.expandable.ExpandableRecycleViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("水平伸缩使用", "com.xuexiang.xuidemo.fragment.components.layout.expandable.ExpandableHorizontalFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("XUILayout\n"
            + "通用布局，支持快速阴影设置", "com.xuexiang.xuidemo.fragment.components.layout.XUILayoutFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mComponents.add(new PageInfo("文字", "com.xuexiang.xuidemo.fragment.components.TextViewFragment", "{\"\":\"\"}", CoreAnim.slide, 2131231001));
    mPages.add(new PageInfo("文字", "com.xuexiang.xuidemo.fragment.components.TextViewFragment", "{\"\":\"\"}", CoreAnim.slide, 2131231001));
    mPages.add(new PageInfo("自定义输入框", "com.xuexiang.xuidemo.fragment.components.edittext.CustomEditTextFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("MaterialEditText\n"
            + "Material Design风格的输入框", "com.xuexiang.xuidemo.fragment.components.edittext.MaterialEditTextFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("统一的输入框样式", "com.xuexiang.xuidemo.fragment.components.edittext.EditTextStyleFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("VerifyCodeEditText\n"
            + "用于手机验证码或者支付密码的输入框", "com.xuexiang.xuidemo.fragment.components.edittext.VerifyCodeEditTextFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mComponents.add(new PageInfo("导航栏", "com.xuexiang.xuidemo.fragment.components.TitleBarFragment", "{\"\":\"\"}", CoreAnim.slide, 2131231002));
    mPages.add(new PageInfo("导航栏", "com.xuexiang.xuidemo.fragment.components.TitleBarFragment", "{\"\":\"\"}", CoreAnim.slide, 2131231002));
    mPages.add(new PageInfo("TabControlView\n"
            + "选项卡控制滑块", "com.xuexiang.xuidemo.fragment.components.tabbar.TabControlViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("EasyIndicator\n"
            + "简单的指示器", "com.xuexiang.xuidemo.fragment.components.tabbar.EasyIndicatorFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("TabLayout\n"
            + "Material Design 组件", "com.xuexiang.xuidemo.fragment.components.tabbar.TabLayoutFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("内容自适应，超过父容器则滚动", "com.xuexiang.xuidemo.fragment.components.tabbar.tabsegment.TabSegmentScrollableModeFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("固定宽度，内容均分", "com.xuexiang.xuidemo.fragment.components.tabbar.tabsegment.TabSegmentFixModeFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("JPTabBar\n"
            + "一个可以显示中心按钮的TabBar", "com.xuexiang.xuidemo.fragment.components.tabbar.JPTabBarFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("VerticalTabLayout\n"
            + "垂直的TabLayout", "com.xuexiang.xuidemo.fragment.components.tabbar.VerticalTabLayoutFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("TabSegment\n"
            + "扩展性极强的选项卡", "com.xuexiang.xuidemo.fragment.components.tabbar.TabSegmentFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mComponents.add(new PageInfo("图片", "com.xuexiang.xuidemo.fragment.components.ImageViewFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230990));
    mPages.add(new PageInfo("图片", "com.xuexiang.xuidemo.fragment.components.ImageViewFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230990));
    mPages.add(new PageInfo("DropDownMenu\n"
            + "下拉选择菜单", "com.xuexiang.xuidemo.fragment.components.spinner.DropDownMenuFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("统一的下拉框样式", "com.xuexiang.xuidemo.fragment.components.spinner.SpinnerStyleFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mComponents.add(new PageInfo("按钮", "com.xuexiang.xuidemo.fragment.components.ButtonFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230985));
    mPages.add(new PageInfo("按钮", "com.xuexiang.xuidemo.fragment.components.ButtonFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230985));
    mPages.add(new PageInfo("FlexboxLayoutManager + RecyclerView\n"
            + "流标签", "com.xuexiang.xuidemo.fragment.components.flowlayout.FlexboxLayoutFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("FlowTagLayout\n"
            + "流标签", "com.xuexiang.xuidemo.fragment.components.flowlayout.FlowTagLayoutFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("FlowLayout\n"
            + "流布局", "com.xuexiang.xuidemo.fragment.components.flowlayout.NormalFlowLayoutFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("Dialog构建策略", "com.xuexiang.xuidemo.fragment.components.dialog.DialogStrategyFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("MaterialDialog\n"
            + "对话框", "com.xuexiang.xuidemo.fragment.components.dialog.MaterialDialogFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("BottomSheetDialog\n"
            + "底部弹出窗", "com.xuexiang.xuidemo.fragment.components.dialog.BottomSheetFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mComponents.add(new PageInfo("下拉刷新", "com.xuexiang.xuidemo.fragment.components.RefreshLayoutFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230996));
    mPages.add(new PageInfo("下拉刷新", "com.xuexiang.xuidemo.fragment.components.RefreshLayoutFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230996));
    mPages.add(new PageInfo("ShadowView\n"
            + "可设置阴影效果的控件", "com.xuexiang.xuidemo.fragment.components.button.ShadowViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("GoodView\n"
            + "按钮点击漂浮效果", "com.xuexiang.xuidemo.fragment.components.button.GoodViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("统一的按钮样式", "com.xuexiang.xuidemo.fragment.components.button.ButtonStyleFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("RippleView\n"
            + "点击水波纹样式", "com.xuexiang.xuidemo.fragment.components.button.RippleViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("RoundButton\n"
            + "圆角按钮", "com.xuexiang.xuidemo.fragment.components.button.RoundButtonFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("ShadowButton\n"
            + "点击自带阴影效果的按钮", "com.xuexiang.xuidemo.fragment.components.button.ShadowButtonFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("SwitchIconView\n"
            + "可切换图标的按钮", "com.xuexiang.xuidemo.fragment.components.button.SwitchIconViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("SmoothCheckBox\n"
            + "自带切换动画的CheckBox", "com.xuexiang.xuidemo.fragment.components.button.SmoothCheckBoxFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("SwitchButton\n"
            + "切换按钮", "com.xuexiang.xuidemo.fragment.components.button.SwitchButtonFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("ButtonView\n"
            + "通用按钮", "com.xuexiang.xuidemo.fragment.components.button.ButtonViewFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("ShineButton\n"
            + "增强效果的按钮，自带闪烁的特效", "com.xuexiang.xuidemo.fragment.components.button.ShineButtonFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mComponents.add(new PageInfo("通用布局", "com.xuexiang.xuidemo.fragment.components.LayoutFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230991));
    mPages.add(new PageInfo("通用布局", "com.xuexiang.xuidemo.fragment.components.LayoutFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230991));
    mPages.add(new PageInfo("GuideCaseQueue\n"
            + "引导队列", "com.xuexiang.xuidemo.fragment.components.guideview.GuideCaseViewQueueFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("启动页", "com.xuexiang.xuidemo.fragment.components.guideview.SplashFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("GuideCaseView\n"
            + "引导样式", "com.xuexiang.xuidemo.fragment.components.guideview.GuideCaseViewStyleFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mComponents.add(new PageInfo("搜索框", "com.xuexiang.xuidemo.fragment.components.SearchViewFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230997));
    mPages.add(new PageInfo("搜索框", "com.xuexiang.xuidemo.fragment.components.SearchViewFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230997));
    mComponents.add(new PageInfo("输入框", "com.xuexiang.xuidemo.fragment.components.EditTextFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230987));
    mPages.add(new PageInfo("输入框", "com.xuexiang.xuidemo.fragment.components.EditTextFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230987));
    mComponents.add(new PageInfo("对话框", "com.xuexiang.xuidemo.fragment.components.DialogFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230986));
    mPages.add(new PageInfo("对话框", "com.xuexiang.xuidemo.fragment.components.DialogFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230986));
    mComponents.add(new PageInfo("选择器", "com.xuexiang.xuidemo.fragment.components.PickerViewFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230994));
    mPages.add(new PageInfo("选择器", "com.xuexiang.xuidemo.fragment.components.PickerViewFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230994));
    mPages.add(new PageInfo("使用ViewPager实现的Banner", "com.xuexiang.xuidemo.fragment.components.banner.ViewPagerBannerFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("UserGuide", "com.xuexiang.xuidemo.fragment.components.banner.UserGuideFragment", "{\"position\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("使用RecyclerView实现的Banner", "com.xuexiang.xuidemo.fragment.components.banner.RecyclerViewBannerFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mComponents.add(new PageInfo("弹出窗", "com.xuexiang.xuidemo.fragment.components.PopupWindowFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230995));
    mPages.add(new PageInfo("弹出窗", "com.xuexiang.xuidemo.fragment.components.PopupWindowFragment", "{\"\":\"\"}", CoreAnim.slide, 2131230995));
    mPages.add(new PageInfo("扫码关注", "com.xuexiang.xuidemo.fragment.QRCodeFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("关于", "com.xuexiang.xuidemo.fragment.AboutFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("设置", "com.xuexiang.xuidemo.fragment.SettingFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("工具", "com.cain.ui.fragment.UtilitysFragment", "{\"\":\"\"}", CoreAnim.none, -1));
    mPages.add(new PageInfo("组件搜索", "com.xuexiang.xuidemo.fragment.SearchComponentFragment", "{\"\":\"\"}", CoreAnim.slide, -1));
    mPages.add(new PageInfo("XPageWebViewFragment", "com.xuexiang.xuidemo.base.webview.XPageWebViewFragment", "{\"com.xuexiang.xuidemo.base.webview.key_url\":\"\"}", CoreAnim.slide, -1));
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
