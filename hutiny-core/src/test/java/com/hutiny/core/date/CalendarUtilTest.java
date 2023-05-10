package com.hutiny.core.date;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

/**
 * {@link CalendarUtil} 对象封装工具类
 *
 * @author HuJiajian
 * @since 2023年05月09日 19:53
 */
public class CalendarUtilTest {

    @Test
    public void testIsAM() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.AM_PM, Calendar.AM);
        Assert.assertTrue(CalendarUtil.isAM(calendar));
    }

    @Test
    public void testIsNotAM() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.AM_PM, Calendar.PM);
        Assert.assertFalse(CalendarUtil.isAM(calendar));
    }

    @Test
    public void testIsAMBoundaryCase() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.AM_PM, Calendar.AM);
        calendar.set(Calendar.HOUR, 0);
        Assert.assertTrue(CalendarUtil.isAM(calendar));
    }

    @Test
    public void testIsNotAMBoundaryCase() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.AM_PM, Calendar.PM);
        calendar.set(Calendar.HOUR, 11);
        Assert.assertFalse(CalendarUtil.isAM(calendar));
    }

    @Test
    public void testIsAMEdgeCase() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.AM_PM, Calendar.AM);
        calendar.set(Calendar.HOUR, 12);
        Assert.assertFalse(CalendarUtil.isAM(calendar));
    }

    @Test
    public void testIsNotAMEdgeCase() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.AM_PM, Calendar.PM);
        calendar.set(Calendar.HOUR, 1);
        Assert.assertFalse(CalendarUtil.isAM(calendar));
    }

    @Test
    public void testIsAMCornerCase() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.AM_PM, Calendar.AM);
        calendar.set(Calendar.HOUR, 11);
        Assert.assertTrue(CalendarUtil.isAM(calendar));
    }

    @Test
    public void testIsNotAMCornerCase() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.AM_PM, Calendar.PM);
        calendar.set(Calendar.HOUR, 12);
        Assert.assertTrue(CalendarUtil.isAM(calendar));
    }
}