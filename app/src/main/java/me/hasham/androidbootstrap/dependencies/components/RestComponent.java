package me.hasham.androidbootstrap.dependencies.components;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import me.hasham.androidbootstrap.ui.activities.BaseActivity;
import me.hasham.androidbootstrap.dependencies.modules.AppModule;
import me.hasham.androidbootstrap.dependencies.modules.NetModule;

/**
 * Developed by Hasham.Tahir on 1/5/2017.
 */

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface RestComponent {
    void inject(BaseActivity activity);

    void inject(Application application);
}