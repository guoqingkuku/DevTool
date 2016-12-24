package guoqing.devtool.application;

import android.app.Application;

/**
 *
 * Created by Administrator on 2016/12/24.
 */

public class Gqapplication extends Application {
    private static Gqapplication instance;
    public  static Gqapplication getInstance(){
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.instance=this;
    }
}
