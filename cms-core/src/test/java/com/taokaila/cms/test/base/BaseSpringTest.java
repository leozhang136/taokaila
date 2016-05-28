package com.taokaila.cms.test.base;

import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * User: LeoZhang
 * Date: 2016-04-24
 * Time: 22:55
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-cmscore.xml")
public class BaseSpringTest extends TestCase {
}
