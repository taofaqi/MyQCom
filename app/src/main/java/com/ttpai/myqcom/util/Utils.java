package com.ttpai.myqcom.util;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;

import java.util.Collection;

public class Utils {
    /**
     * 判断集合是否为空或容量为空
     *
     * @param collection
     * @return
     */
    public static boolean isCollectionEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    /**
     * 改变字符串字体颜色
     *
     * @param originStr       原始字符串
     * @param foregroundColor 目标的字体颜色
     * @param start           开始下标
     * @param end             结束下标(包含)
     * @return String
     */
    public static SpannableString getSpannableString(String originStr, int foregroundColor, int start, int end) {
        SpannableString ss = new SpannableString(originStr);
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(foregroundColor);
        ss.setSpan(colorSpan, start, end, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        return ss;
    }
}