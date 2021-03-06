package com.lyb.framework.di.component;


import com.lyb.framework.base.BaseApplication;
import com.lyb.framework.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jess on 14/12/2016 13:58
 * Contact with jess.yan.effort@gmail.com
 */
@Singleton
@Component(modules={AppModule.class})
public interface BaseComponent {
    void inject(BaseApplication application);
}
