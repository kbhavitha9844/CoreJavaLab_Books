package com.cg.lb3.ui;

import java.util.Scanner;

public class Exercise2 {
	 public String getImage(String str)
     {
            StringBuffer sbr = new StringBuffer(str);
            sbr.append('|');
            StringBuffer sb = new StringBuffer(str);
            sb.reverse();
            sbr.append(sb);
            return sbr.toString();
     }
     public static void main(String[] ar)
     {
            Exercise2 m = new Exercise2();
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a String");
            String str = s.next();
            System.out.println(m.getImage(str));
     }

}