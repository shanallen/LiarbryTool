package com.sjq.commonlibrary;

import android.nfc.Tag;
import android.util.Log;

public class LogUtil {
    private static String TAG = "LogUtil";
    private static final boolean DEBUG = true;

    public static void d(String tag, String content) {
        if (DEBUG) {
            Log.d(tag, content);
        }
    }

    public static void e(String tag, String content) {
        if (DEBUG) {
            Log.e(tag, content);
        }
    }

    public static void i(String tag, String content) {
        if (DEBUG) {
            Log.i(tag, content);
        }
    }
}
