package com.panish;

import com.panish.copy.Student;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.*;
import java.util.*;

public class GeneralClass {
    public static void main(String[] args) {
        int[] temp = {1, 2};
        System.out.println(temp.length);
    }

    public int[] twoSum(int[] nums, int target) {
        return new int[]{1, 1};
    }

    private static void testBigDecimal(BigDecimal bg) {
        bg = new BigDecimal(200);
    }

    public static void sachinLoopQ() {
        int i = 100;
        int j = 200;

        while (++i < --j) {

        }
        System.out.println( "i: " + i + " j: " + j);
    }

    public static void BigDecimalEx() {
        BigDecimal bigDecimal1 = new BigDecimal("135.3056");
        BigDecimal bigDecimal2 = new BigDecimal("135.4916");
        BigDecimal bigDecimal3 = new BigDecimal("135.8016");
        //System.out.println("BigDecimal.ROUND_DOWN: " + bigDecimal.setScale(2, BigDecimal.ROUND_DOWN));
        //System.out.println("BigDecimal.ROUND_UP: " + bigDecimal.setScale(2, BigDecimal.ROUND_UP));
        //System.out.println("BigDecimal.ROUND_FLOOR: " + bigDecimal.setScale(2, BigDecimal.ROUND_FLOOR));
        //System.out.println("BigDecimal.ROUND_CEILING: " + bigDecimal.setScale(2, BigDecimal.ROUND_CEILING));
        //System.out.println("BigDecimal.ROUND_HALF_DOWN: " + bigDecimal.setScale(2, BigDecimal.ROUND_HALF_DOWN));
        System.out.println("BigDecimal.ROUND_HALF_UP: " + bigDecimal1.setScale(0, RoundingMode.HALF_UP));
        System.out.println("BigDecimal.ROUND_HALF_UP: " + bigDecimal2.setScale(0, RoundingMode.HALF_UP));
        System.out.println("BigDecimal.ROUND_HALF_UP: " + bigDecimal3.setScale(0, RoundingMode.HALF_UP));
    }
    public static void dateEx() {
        LocalDate date = LocalDate.now();

        LocalDate fromDate = date.minusDays(3);
        Date from = Date.from(fromDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println(from);

        LocalDate previousDate = date.minusDays(1);
        LocalDateTime endOfDay = previousDate.atTime(23, 59, 59);
        Date endDate = Date.from(endOfDay.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(endDate);
    }
    public static void longEx() {

        boolean value = false;

        Long l1 = 100L;
        long l2 = 100L;
        Long l3 = 100L;

        value = l1 == l2;
        System.out.println("l1 == l2 " +  value);

        value = l1 == l3;
        System.out.println("l1 == l3 " +  value);

        value = l1.equals(l2);
        System.out.println("l1.equals(l2) " +  value);

        value = l1.equals(l3);
        System.out.println("l1.equals(l3) " +  value);
    }

    public static void percentEx() {
        BigDecimal percentage0 = new BigDecimal(0);
        BigDecimal percentage16 = new BigDecimal(16);
        BigDecimal percentage16p = new BigDecimal("0.16");
        BigDecimal percentage25 = new BigDecimal(25);
        BigDecimal percentage25p = new BigDecimal("0.25");
        BigDecimal rate = new BigDecimal("0.00080");

        BigDecimal finalRate0_1 = percentage0.add(new BigDecimal(100)).multiply(rate).divide(new BigDecimal(100));
        BigDecimal finalRate0_2 = ((percentage0.add(new BigDecimal(100))).multiply(rate)).divide(new BigDecimal(100));
        BigDecimal finalRate0_3 = rate.add(rate.multiply(percentage0));


        BigDecimal finalRate16_1 = percentage16.add(new BigDecimal(100)).multiply(rate).divide(new BigDecimal(100));
        BigDecimal finalRate16_2 = ((percentage16.add(new BigDecimal(100))).multiply(rate)).divide(new BigDecimal(100));
        BigDecimal finalRate16_3 = rate.add(rate.multiply(percentage16p));

        BigDecimal finalRate25_1 = percentage25.add(new BigDecimal(100)).multiply(rate).divide(new BigDecimal(100));
        BigDecimal finalRate25_2 = ((percentage25.add(new BigDecimal(100))).multiply(rate)).divide(new BigDecimal(100));
        BigDecimal finalRate25_3 = rate.add(rate.multiply(percentage25p));

        System.out.println("finalRate0_1 " + finalRate0_1.setScale(5, RoundingMode.HALF_UP));
        System.out.println("finalRate0_2 " + finalRate0_2.setScale(5, RoundingMode.HALF_UP));
        System.out.println("finalRate0_3 " + finalRate0_3.setScale(5, RoundingMode.HALF_UP));
        System.out.println("finalRate16_1 " + finalRate16_1.setScale(5, RoundingMode.HALF_UP));
        System.out.println("finalRate16_2 " + finalRate16_2.setScale(5, RoundingMode.HALF_UP));
        System.out.println("finalRate16_3 " + finalRate16_3.setScale(5, RoundingMode.HALF_UP));
        System.out.println("finalRate25_1 " + finalRate25_1.setScale(5, RoundingMode.HALF_UP));
        System.out.println("finalRate25_2" + finalRate25_2.setScale(5, RoundingMode.HALF_UP));
        System.out.println("finalRate25_3" + finalRate25_3.setScale(5, RoundingMode.HALF_UP));
    }
}
