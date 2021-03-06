package com.github.app;

import android.app.Activity;
import android.app.Application;
import android.net.wifi.WifiManager;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.github.hook.WifiManagerHooker;

public class HookLifecycleMonitor implements Application.ActivityLifecycleCallbacks {

    private HookLifecycleMonitor() {
    }

    public static HookLifecycleMonitor obtain() {
        return new HookLifecycleMonitor();
    }

    @Override
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {
        WifiManagerHooker.hook(activity.getBaseContext());
    }

    @Override
    public void onActivityStarted(@NonNull Activity activity) {

    }

    @Override
    public void onActivityResumed(@NonNull Activity activity) {

    }

    @Override
    public void onActivityPaused(@NonNull Activity activity) {

    }

    @Override
    public void onActivityStopped(@NonNull Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle outState) {

    }

    @Override
    public void onActivityDestroyed(@NonNull Activity activity) {

    }
}
