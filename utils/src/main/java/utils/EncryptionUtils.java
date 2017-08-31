package utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/***
 * 
 * 
 * @since 26/08/2017
 * @author Anant Goswami
 *
 */
public class EncryptionUtils {

	private static BCryptPasswordEncoder bCrypt = new BCryptPasswordEncoder();

	public static String encrypt(String text) {

		return bCrypt.encode(text);
	}

	public static Boolean decrypt(String encryText, String plainText) {

		return bCrypt.matches(plainText, encryText);
	}

}
