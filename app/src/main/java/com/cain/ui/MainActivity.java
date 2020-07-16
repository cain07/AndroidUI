package com.cain.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.cain.ui.base.BaseUIActivity;
import com.cain.ui.fragment.ComponentsFragment;
import com.cain.ui.fragment.ExpandsFragment;
import com.cain.ui.fragment.UtilitysFragment;
import com.cain.util.sub.app.FragmentUtils;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;


public class MainActivity extends BaseUIActivity {

    private static final int POS_COMPONENTS = 0;
    private static final int POS_UTILITYS = 1;
    private static final int POS_EXPANDS = 2;
    private static final int POS_ABOUT = 3;
    private static final int POS_LOGOUT = 5;

    private LinearLayout mLLMenu;
    private String[] mMenuTitles;
    private Drawable[] mMenuIcons;

    @BindView(R.id.tabs_bottom)
    TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViews();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    private void initViews() {
        initTab();
        //静默检查版本更新
        //Utils.checkUpdate(this, false);
    }

    /**
     * 初始化Tab
     */
    private void initTab() {
        TabLayout.Tab component = mTabLayout.newTab();
        component.setText("组件");
        component.setIcon(R.drawable.selector_icon_tabbar_component);
        mTabLayout.addTab(component);

        TabLayout.Tab util = mTabLayout.newTab();
        util.setText("工具");
        util.setIcon( R.drawable.selector_icon_tabbar_util);
        mTabLayout.addTab(util);

        TabLayout.Tab expand = mTabLayout.newTab();
        expand.setText("拓展");
        expand.setIcon(R.drawable.selector_icon_tabbar_expand);
        mTabLayout.addTab(expand);


        ComponentsFragment componentsFragment = new ComponentsFragment();
        UtilitysFragment utilitysFragment = new UtilitysFragment();
        ExpandsFragment expandsFragment = new ExpandsFragment();

        FragmentUtils.add(getSupportFragmentManager(),componentsFragment,R.id.fragment_container);

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case POS_COMPONENTS:
                        FragmentUtils.replace(getSupportFragmentManager(),componentsFragment,R.id.fragment_container);
                        break;
                    case 1:
                        FragmentUtils.replace(getSupportFragmentManager(),utilitysFragment,R.id.fragment_container);
                        break;
                    case 2:
                        FragmentUtils.replace(getSupportFragmentManager(),expandsFragment,R.id.fragment_container);
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


   /* private void initSlidingMenu(Bundle savedInstanceState) {
        mMenuTitles = ResUtils.getStringArray(R.array.menu_titles);
        mMenuIcons = ResUtils.getDrawableArray(this, R.array.menu_icons);

        mSlidingRootNav = new SlidingRootNavBuilder(this)
                .withMenuOpened(false)
                .withContentClickableWhenMenuOpened(false)
                .withSavedState(savedInstanceState)
                .withMenuLayout(R.layout.menu_left_drawer)
                .inject();

        mLLMenu = mSlidingRootNav.getLayout().findViewById(R.id.ll_menu);
        final AppCompatImageView ivQrcode = mSlidingRootNav.getLayout().findViewById(R.id.iv_qrcode);
        ivQrcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewPage(QRCodeFragment.class);
            }
        });

        final AppCompatImageView ivSetting = mSlidingRootNav.getLayout().findViewById(R.id.iv_setting);
        ivSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewPage(SettingFragment.class);
            }
        });

        mAdapter = new DrawerAdapter(Arrays.asList(
                createItemFor(POS_COMPONENTS).setChecked(true),
                createItemFor(POS_UTILITYS),
                createItemFor(POS_EXPANDS),
                createItemFor(POS_ABOUT),
                new SpaceItem(48),
                createItemFor(POS_LOGOUT)));
        mAdapter.setListener(this);

        RecyclerView list = findViewById(R.id.list);
        list.setNestedScrollingEnabled(false);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(mAdapter);

        mAdapter.setSelected(POS_COMPONENTS);
        mSlidingRootNav.setMenuLocked(false);
        mSlidingRootNav.getLayout().addDragStateListener(new DragStateListener() {
            @Override
            public void onDragStart() {

            }

            @Override
            public void onDragEnd(boolean isMenuOpened) {
                if (isMenuOpened) {
                    if (!GuideCaseView.isShowOnce(MainActivity.this, getString(R.string.guide_key_sliding_root_navigation))) {
                        final GuideCaseView guideStep1 = new GuideCaseView.Builder(MainActivity.this)
                                .title("点击进入，可切换主题样式哦～～")
                                .titleSize(18, TypedValue.COMPLEX_UNIT_SP)
                                .focusOn(ivSetting)
                                .build();

                        final GuideCaseView guideStep2 = new GuideCaseView.Builder(MainActivity.this)
                                .title("点击进入，扫码关注哦～～")
                                .titleSize(18, TypedValue.COMPLEX_UNIT_SP)
                                .focusOn(ivQrcode)
                                .build();

                        new GuideCaseQueue()
                                .add(guideStep1)
                                .add(guideStep2)
                                .show();
                        GuideCaseView.setShowOnce(MainActivity.this, getString(R.string.guide_key_sliding_root_navigation));
                    }
                }
            }
        });
    }

    @Override
    public void onItemSelected(int position) {
        switch (position) {
            case POS_COMPONENTS:
            case POS_UTILITYS:
            case POS_EXPANDS:
                if (mTabLayout != null) {
                    TabLayout.Tab tab = mTabLayout.getTabAt(position);
                    if (tab != null) {
                        tab.select();
                    }
                }
                mSlidingRootNav.closeMenu();
                break;
            case POS_ABOUT:
                openNewPage(AboutFragment.class);
                break;
            case POS_LOGOUT:
                DialogLoader.getInstance().showConfirmDialog(
                        this,
                        getString(R.string.lab_logout_confirm),
                        getString(R.string.lab_yes),
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                TokenUtils.handleLogoutSuccess();
                                finish();
                            }
                        },
                        getString(R.string.lab_no),
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }
                );
                break;
            default:
                break;
        }
    }

    private DrawerItem createItemFor(int position) {
        return new SimpleItem(mMenuIcons[position], mMenuTitles[position])
                .withIconTint(ThemeUtils.resolveColor(this, R.attr.xui_config_color_content_text))
                .withTextTint(ThemeUtils.resolveColor(this, R.attr.xui_config_color_content_text))
                .withSelectedIconTint(ThemeUtils.resolveColor(this, R.attr.colorAccent))
                .withSelectedTextTint(ThemeUtils.resolveColor(this, R.attr.colorAccent));
    }

    *//**
     * 菜单、返回键响应
     *//*
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (isMenuOpen()) {
                closeMenu();
            } else {
                ClickUtils.exitBy2Click(2000, this);
            }
        }
        return true;
    }

    *//**
     * 再点击一次
     *//*
    @Override
    public void onRetry() {
        XToastUtils.toast("再按一次退出程序");
    }

    *//**
     * 退出
     *//*
    @Override
    public void onExit() {
        moveTaskToBack(true);
    }*/

}
