package com.jjh.sky.test;


import com.jjh.sky.unsafe.UnSafe;
import sun.misc.Unsafe;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by jiajianhong on 16/8/24.
 */
public class MainTest {

    public static void main(String[] args) {

    }

    public static void testEmptyQueuePoll () {
        ConcurrentLinkedQueue queue = new ConcurrentLinkedQueue();
        // 新对象直接判断为空
        System.out.println(queue.isEmpty());
        if (queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // 新对象赋值取值之后,再判断为空
        int i = 0;
        queue.offer(i);
        System.out.println(queue.isEmpty());
        queue.poll();
        System.out.println(queue.isEmpty());
        System.out.println(queue.poll());
    }

}
