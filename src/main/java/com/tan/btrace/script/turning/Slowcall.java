package com.tan.btrace.script.turning;

import static com.sun.btrace.BTraceUtils.println;

import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Duration;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.ProbeClassName;

/**
 * @author Administrator
 *
 */
@BTrace
public class Slowcall {
    @OnMethod(clazz = "+com.tan.btrace.sample.OrderUtil", method = "getOrderId", location = @Location(Kind.RETURN))
    public static void onDoFilter2(@ProbeClassName String pcn,  @Duration long duration) {
        if (duration > 100) { //1000000
            println(pcn + ",duration:" + (duration / 100000));
        }

    }

}