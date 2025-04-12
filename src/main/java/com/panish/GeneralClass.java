package com.panish;

import com.panish.copy.Student;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.*;

public class GeneralClass {
    public static void main(String[] args) {
        longEx();
    }

    public static void longEx() {

        boolean value = false;

        Long l1 = 100l;
        long l2 = 100l;
        Long l3 = 100l;

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
        BigDecimal percentage16 = new BigDecimal(16);
        BigDecimal percentage25 = new BigDecimal(25);
        BigDecimal rate = new BigDecimal(0.00080);

        BigDecimal finalRate1 = percentage16.add(new BigDecimal(100)).multiply(rate).divide(new BigDecimal(100));
        BigDecimal finalRate2 = ((percentage16.add(new BigDecimal(100))).multiply(rate)).divide(new BigDecimal(100));

        BigDecimal finalRate3 = percentage25.add(new BigDecimal(100)).multiply(rate).divide(new BigDecimal(100));
        BigDecimal finalRate4 = ((percentage25.add(new BigDecimal(100))).multiply(rate)).divide(new BigDecimal(100));

        System.out.println(finalRate1.setScale(5, RoundingMode.HALF_UP));
        System.out.println(finalRate2.setScale(5, RoundingMode.HALF_UP));
        System.out.println(finalRate3.setScale(5, RoundingMode.HALF_UP));
        System.out.println(finalRate4.setScale(5, RoundingMode.HALF_UP));
    }
}
