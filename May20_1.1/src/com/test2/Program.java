package com.test2;

public class Program {

	public static void main(String[] args) {
		final String str1="yash";
		final String str2="tech";
		 String str3=str1+str2; // because final "yash"+"tech"
		 String str4="yashtech";
		 System.out.println(str3==str4);
		 
		 
		  String str5="yash";
			 String str6="tech";
			 String str7=str5+str6; // concat by stringBuilder/buffer so obj create on heap(using append)
			 String str8="yashtech";
			 System.out.println(str7==str8);
	}

}
