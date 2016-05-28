package com.taokaila.midware.logback.util;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: LeoZhang
 * Date: 2016-04-16
 * Time: 20:40
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
public class TraceLogIdUtil {

    public static final String KEY = "TRACE_LOG_ID";

    public static String createTraceLogId() {
        return UUID.randomUUID().toString();
    }

}
