package uz.sgroup.logutil;

import android.util.Log;

public class LogDebug {
    private static final String TAG = "SUPER_AWESOME_APP";

    public static void d(String name){
        Log.d(TAG,name);
    }
}
