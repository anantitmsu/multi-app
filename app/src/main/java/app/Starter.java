package app;

import utils.DateUtils;
import utils.EncryptionUtils;

public class Starter {

	public static void main(String[] args) {

		DateUtils dateUtils = new DateUtils();
		System.out.println("Today == " + dateUtils.getToday());

		String plainText = "Anant Goswami";
		String encryText = EncryptionUtils.encrypt(plainText);

		Boolean isMatch = EncryptionUtils.decrypt(encryText, plainText);

		System.out.println(isMatch);
	}

}
