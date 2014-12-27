package phu.quang.le.Util;

import java.util.Random;

public class RandomString {
	public static String getString () {
		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray ();
		StringBuilder sb = new StringBuilder ();
		Random random = new Random ();
		for (int i = 0 ; i < 20 ; i++) {
			char c = chars[random.nextInt (chars.length)];
			sb.append (c);
		}
		return sb.toString ();
	}

	public static void main (String[] args) {
		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray ();
		StringBuilder sb = new StringBuilder ();
		Random random = new Random ();
		for (int i = 0 ; i < 20 ; i++) {
			char c = chars[random.nextInt (chars.length)];
			sb.append (c);
		}
		String output = sb.toString ();
		System.out.println (output);
	}
}
