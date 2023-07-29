package com.company.data_structures.challenge;

import org.mockito.internal.util.StringUtil;

import java.io.*;

public class TimeConversionTest {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        StringBuilder time = new StringBuilder();

       int h1 = (int)s.charAt(1) - '0';
       int h2 = (int)s.charAt(0) - '0';
       int hh = (h2 * 10 + h1 % 10);

       if (s.charAt(8) == 'A') {
           if (hh == 12) {
               time.append("00");
               for (int i= 2; i<=7;i++) {
                   time.append(s.charAt(i));
               }
           }else {
               for (int i = 0;i<=7;i++) {
                   time.append(s.charAt(0));
               }
           }
       }else {
           if (hh == 12) {
               time.append("12");
               for (int i =2 ; i<= 7; i++) {
                   time.append(s.charAt(i));
               }
           }else {
               hh += 12;
               time.append(hh);
               for (int i =2 ;i<= 7; i++) {
                   time.append(s.charAt(i));
               }
           }
       }

       return time.toString();
    }

    public static void main(String[] args) throws IOException {
        String str = "07:05:45PM";
        System.out.println(timeConversion(str));
    }
}
