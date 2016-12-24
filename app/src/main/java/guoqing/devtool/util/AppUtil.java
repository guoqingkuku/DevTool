package guoqing.devtool.util;

import android.app.Activity;
import android.content.pm.PackageManager;

/**
 * app基本信息的工具类
 * Created by Administrator on 2016/12/24.
 */

public class AppUtil {
    // 客户端版本版本号
    public static String getVersionName(Activity activity) {
        String version = null;
        try {
            version = String.valueOf(activity.getPackageManager()
                    .getPackageInfo(activity.getPackageName(), 0).versionName);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return version;
    }
}
