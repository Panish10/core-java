package com.panish.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass {

	public static void main(String[] args) {	
		
		LocalTime local1 = LocalTime.parse("10.05");
		LocalTime local2 = LocalTime.now();
		
		
		/*
		 * TestClass obj = new TestClass(); int[] nums1 = {1,3}; int[] nums2 = {2};
		 * double len = obj.findMedianSortedArrays(nums1, nums2);
		 * System.out.println(len);
		 */
		
		/*
		 * Scanner scanner = new Scanner(System.in); System.out.println("Enter virus");
		 * String virus = scanner.next(); System.out.println("no of people"); int
		 * noOfpeople = scanner.nextInt();
		 * 
		 * List<String> compList = new ArrayList<String>();
		 * System.out.println("Enter blood compositon"); for(int i=1; i<=noOfpeople;
		 * i++) { String com= scanner.next(); compList.add(com); } scanner.close();
		 * System.out.println("end");
		 * 
		 * for(String comp: compList) { System.out.println(isPositive(virus, comp)); }
		 */
		
		/*
		 * Scanner scanner = new Scanner(System.in); int noOfInput = scanner.nextInt();
		 * //List<Integer> noList = new ArrayList<Integer>(); for(int i=1; i<=
		 * noOfInput; i++) { int no1 = scanner.nextInt(); int no2 = scanner.nextInt();
		 * //System.out.println(no1+" "+no2); int minPrime = -1; int maxPrime = -1;
		 * while(no1 <= no2) { if(minPrime < 0 && isPrime(no1)) { minPrime = no1; }
		 * if(maxPrime <0 && isPrime(no2)) { maxPrime = no2; }
		 * 
		 * if(minPrime > 0 && maxPrime > 0) break;
		 * 
		 * no1++; no2--; }
		 * 
		 * if(minPrime > 0 && maxPrime > 0) { System.out.println(maxPrime - minPrime); }
		 * else if(minPrime >0 || maxPrime >0) { System.out.println(0); } else {
		 * System.out.println(-1); } } scanner.close();
		 */
	}
	
	public long solution(int[] A) {
        int n = A.length+1;
        long totalSum = n*(n+1)/2;
        long sum = 0;
        for(int i=0; i<A.length; i++) {
            sum = sum + A[i];
        }
        
        return (totalSum - sum);
    }
	
	private static boolean isPrime(int no) {
		int count=0;
		if(no <= 1) return false;
		if(no == 2) return true;
		for(int i=2; i<=no; i++) {
			if(no%i == 0) count++;
		
			if(count > 1)
				return false;
		}
		
		return true;
	}
	
	private static String isPositive(String virus, String comp) {
		
		int i = 0;
		int j = 0;
		while(i<comp.length() && j<virus.length()) {
			if(comp.charAt(i) == virus.charAt(j)) {
			 	i++;
			}
			j++;
		}
		
		return i == comp.length()? "POSITIVE" :"NEGATIVE";
	}
	
	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int[] total = new int[nums1.length+nums2.length];
	        
	        int i = 0;
	        int j = 0;
	        int k = 0;
	        int mid = (nums1.length + nums2.length)/2;
	        while(i < nums1.length && j < nums2.length) {
	            //if(mid == k) break;
	            if(nums1[i] < nums2[j]) {
	                total[k] = nums1[i];
	                i++;
	            } else {
	                total[k] = nums2[j];
	                j++;
	            }
	            k++;
	        }
	        
	        while(i < nums1.length) {
	            //if(mid == k) break;
	            total[k] = nums1[i];
	            i++;
	            k++;
	        }
	        
	        
	        while(j < nums2.length) {
	            //if(mid == k) break;
	            total[k] = nums2[j];
	            j++;
	            k++;
	        }

		/*
		 * int first = total[mid-1]; int second = total[mid]; double third =
		 * (first+second)/2.0; return third;
		 */


	        if(mid > 1) {
	            if(mid%2 == 0) {
	                return (total[mid-1]+ total[mid])/2.0;
	            } else {
	                return total[mid];  
	            } 
	        } else {
	            return total[0];
	        }
	    }
	 
	public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (checkRepetition(s, i, j)) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }

        return res;
    }
	
	private boolean checkRepetition(String s, int start, int end) {
        int[] chars = new int[128];

        for (int i = start; i <= end; i++) {
            char c = s.charAt(i);
            chars[c]++;
            if (chars[c] > 1) {
                return false;
            }
        }

        return true;
    }
	
	public int countYZ(String str) {
		  String[] ary = str.split(" ");
		  int count = 0; 
		  for(String str1: ary) {
		    if(str1.charAt(str.length()-1) == 'y' || str1.charAt(str.length()-1) == 'z')
		    count++;
		  }
		  
		  return count;
		}
	
	public String starOut(String str) {
		  StringBuffer sb = new StringBuffer();
		  int i = 0;
		  while(i<=str.length()-2) {
		    if(str.charAt(i) == '*') {
		      i++;
		    } else {
		      if(i == 0 && str.charAt(i+1) != '*') {
		        sb.append(str.charAt(i));
		      } else if(i!=0 && str.charAt(i-1) != '*' && str.charAt(i+1) != '*') {
		        sb.append(str.charAt(i));
		      }
		      i++;
		    }
		  }
		  
		  if(str.charAt(i) != '*') {
		    sb.append(str.charAt(i));
		  }
		  
		  return sb.toString();
		}
	
	public static List<Employee> prepareData() {
		List<Employee> list = new ArrayList<Employee>();
		
		List<Address> add1 = new ArrayList<Address>();
		add1.add(new Address("amt", "mh"));
		add1.add(new Address("pune", "mh"));
		
		list.add(new Employee("1", "Panish", add1));
		
		List<Address> add2 = new ArrayList<Address>();
		add2.add(new Address("ngp", null));
		add2.add(new Address("pune", "mh"));
		
		list.add(new Employee("2", "Sachin", add2));
		
		return list;
	}
	
}