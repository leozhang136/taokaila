package com.taokaila.midware.logback.convert;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import com.taokaila.midware.logback.util.IPUtil;

/**
 * Created with IntelliJ IDEA.
 * User: LeoZhang
 * Date: 2016-04-16
 * Time: 20:37
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
public class IPConvert extends ClassicConverter {
    @Override
    public String convert(ILoggingEvent iLoggingEvent) {
        return IPUtil.getServerIp();
    }
}
