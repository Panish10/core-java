package com.panish.interview;

public class InterviewEx2 {
    public static void main(String[] args) {
        final int i;
        i = 20;
        int j = i + 20;
        // i = j + 30; compile-time error
        System.out.println(i + " " + j);
    }
}
