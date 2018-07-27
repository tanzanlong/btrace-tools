package com.baibei.wine.paycenter.btrace;

import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnMethod;

import static com.sun.btrace.BTraceUtils.*;

@BTrace
public class HelloWorld {

    @OnMethod(clazz="com.tan.btrace.sample.OrderUtil", method="getOrderId")
    public static void onThreadStart() {
        println("OrderUtil getOrderId!");
    }

}