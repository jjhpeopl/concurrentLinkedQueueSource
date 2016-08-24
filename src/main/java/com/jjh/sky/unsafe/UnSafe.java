package com.jjh.sky.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Created by jiajianhong on 16/8/24.
 */
public class UnSafe {

    /**
     * 获取java中的Unsafe实例,可以直接进行内存的控制
     * 利用反射的方式进行类实例
     * @return
     */
    public static Unsafe getUnsafe() {

        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            return (Unsafe) field.get(null);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

}
