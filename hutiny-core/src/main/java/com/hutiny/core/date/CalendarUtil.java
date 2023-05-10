package com.hutiny.core.date;

import java.util.Calendar;

/**
 * {@link Calendar} 对象封装工具类
 *
 * @author HuJiajian
 * @version 1.0.0
 * @since 2023年05月09日 19:46
 */
public class CalendarUtil {
    /**
     * Checks if the given calendar object is in AM or not.
     *
     * @param calendar The calendar object to be checked.
     * @return true if the calendar is in AM, false otherwise.
     */
    public static boolean isAM(Calendar calendar) {
        return Calendar.AM == calendar.get(Calendar.AM_PM);
    }
}
