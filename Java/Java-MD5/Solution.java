package test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		
		//use MessageDigest class for hash
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		byte [] result = md5.digest(input.getBytes());
		
		for (byte b : result) {
			//convert byte to hexadecimal
            System.out.format("%02x", b);
        }

	}
}
