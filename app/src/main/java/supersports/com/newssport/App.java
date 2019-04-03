package supersports.com.newssport;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by rocky on 2019/4/3.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            ARouter.openLog();
            ARouter.openDebug();
        }

        ARouter.init(this);

    }
}
