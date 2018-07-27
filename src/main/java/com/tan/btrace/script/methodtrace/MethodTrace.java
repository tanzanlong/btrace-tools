package com.tan.btrace.script.methodtrace;

import static com.sun.btrace.BTraceUtils.println;
import static com.sun.btrace.BTraceUtils.Threads.jstack;

import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnMethod;

/**
 * @author Administrator
 *
 */
@BTrace
public class MethodTrace {
    
    @OnMethod(clazz = "com.tan.btrace.sample.OrderUtil", method = "getOrderId")

    public static void onSystemGC() {

        println(".....getOrderId enter....");

        jstack();

    }
}