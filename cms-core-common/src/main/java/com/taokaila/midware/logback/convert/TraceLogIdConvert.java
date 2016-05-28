package com.taokaila.midware.logback.convert;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import com.taokaila.midware.logback.util.TraceLogIdUtil;
import org.slf4j.MDC;

/**
 * Created with IntelliJ IDEA.
 * User: LeoZhang
 * Date: 2016-04-16
 * Time: 20:40
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
public class TraceLogIdConvert extends ClassicConverter {

    @Override
    public String convert(ILoggingEvent iLoggingEvent) {
        String traceLogId = MDC.get(TraceLogIdUtil.KEY);
        if (traceLogId==null || traceLogId.trim().equals("")) {
            traceLogId = TraceLogIdUtil.createTraceLogId();
            MDC.put(TraceLogIdUtil.KEY, traceLogId);
        }
        return MDC.get(TraceLogIdUtil.KEY);
    }
}
