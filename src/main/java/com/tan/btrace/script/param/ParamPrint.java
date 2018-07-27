package com.tan.btrace.script.param;

import static com.sun.btrace.BTraceUtils.print;

import com.sun.btrace.AnyType;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.Return;
import com.sun.btrace.annotations.Self;

@BTrace
public class ParamPrint {
   
    
    @OnMethod(clazz = "com.tan.btrace.sample.OrderUtil", method = "/.*/", location = @Location(value = Kind.RETURN))
    public static void o(@Self Object self, String prefix, @Return AnyType result){
        print(prefix);
    }
}
