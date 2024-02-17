package com.test.demoblaze;

public class RandomString {

	public String RandGeneratedStr() {
		String AlphaNumericStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";
		int l = 10;
		StringBuilder s = new StringBuilder(l);
		for (int i = 0; i < l; i++) {
			int ch = (int) (AlphaNumericStr.length() * Math.random());
			s.append(AlphaNumericStr.charAt(ch));
		}
		return s.toString();

	}
}
