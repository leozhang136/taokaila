package com.taokaila.midware.logback.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created with IntelliJ IDEA.
 * User: LeoZhang
 * Date: 2016-04-16
 * Time: 20:38
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
public class IPUtil {
    /**
     * 获取本机IP
     *
     * @return
     */
    public static String getServerIp() {
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
        }
        return "127.0.0.1";
    }
}
