package com.way2learnonline;

public class AesTest {

	public static void main(String args[]) {
		String str  = "This date 10 March 2015  is not  3 years before this one: 10 January 2018 ";

		Pattern reDate = Pattern.compile("([0-9]{1,2}) [ADFJMNOS]\w* ([0-9]{4})");
		Matcher matchDate = reDate.matcher(str);

		while (matchDate.find()) {

		    System.out.println(matchDate.group());
		}
		}
		}


