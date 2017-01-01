package com.lyb_wzx.wexun.common;

import android.app.Application;

import com.google.gson.Gson;
import com.lyb.framework.base.AppManager;
import com.lyb.framework.di.module.AppModule;
import com.lyb.framework.di.module.ClientModule;
import com.lyb.framework.di.module.GlobeConfigModule;
import com.lyb.rxerrorhandler.core.RxErrorHandler;
import com.lyb_wzx.wexun.di.module.CacheModule;
import com.lyb_wzx.wexun.di.module.ServiceModule;
import com.lyb_wzx.wexun.mvp.model.api.cache.CacheManager;
import com.lyb_wzx.wexun.mvp.model.api.service.ServiceManager;


import javax.inject.Singleton;

import dagger.Component;

import okhttp3.OkHttpClient;

/**
 * Created by jess on 8/4/16.
 */
@Singleton
@Component(modules = {AppModule.class, ClientModule.class, ServiceModule.class,
        CacheModule.class, GlobeConfigModule.class})
public interface AppComponent {
    //全局Application
    Application Application();
    //用于管理所有activity
    AppManager appManager();
    //服务管理器,retrofitApi
    ServiceManager serviceManager();
    //缓存管理器
    CacheManager cacheManager();
    //Rxjava错误处理管理类
    RxErrorHandler rxErrorHandler();
    //okhttp
    OkHttpClient okHttpClient();
    //gson
    Gson gson();

}
