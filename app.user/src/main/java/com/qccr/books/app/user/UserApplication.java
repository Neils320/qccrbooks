package com.qccr.books.app.user;

import android.app.Application;

import com.qccr.books.lib.util.realm.RealmUtil;

/**
 * @author: zhuhuanhuan
 * @time: 16/9/6-下午5:30.
 * @email: zhuhuanhuan@qccr.com
 * @desc:
 */

public final class UserApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        init();
    }

    void init() {
        RealmUtil.init(this);
    }
}
