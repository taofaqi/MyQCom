package com.ttpai.myqcom.util;

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
}
