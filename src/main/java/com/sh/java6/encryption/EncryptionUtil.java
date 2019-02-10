package com.sh.java6.encryption;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class EncryptionUtil {

	private static final byte[] _3desData = { 122, 53, 125, 9, 51, 125, 76, 110, 31, 29, 22, 97, 59, 20, 16, 31, 109,
			94, 61, 42, 36, 11, 88, 21 };

	private static final String IV = "SaTrIclh";

	private static final byte[] myIVString = IV.getBytes();

	private static SecretKeySpec _key = new SecretKeySpec(_3desData, "DESede");

	private static IvParameterSpec iv = new IvParameterSpec(myIVString);

	private EncryptionUtil() {
	}

	public static void main(String[] args) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {

		System.out.println("mailId : " + encrypt("aditya.singh@impetus.co.in"));
		try {
			System.out.println("USER ID : " + decrypt("gKZJtUrlSLd/bQpQKO+EH8uwBKlQdh7n7UY6QtZLVyc="));
			System.out.println("Password : " + decrypt("81sHfCkdiB9Dj6luxtBKOQ=="));

		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(encrypt("aditya"));

	}

	private static String convertToHex(byte[] data) {
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < data.length; i++) {
			int halfbyte = (data[i] >>> 4) & 0x0F;
			int two_halfs = 0;
			do {
				if ((0 <= halfbyte) && (halfbyte <= 9))
					buf.append((char) ('0' + halfbyte));
				else
					buf.append((char) ('a' + (halfbyte - 10)));
				halfbyte = data[i] & 0x0F;
			} while (two_halfs++ < 1);
		}
		return buf.toString();
	}

	public static String MD5(String text) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest md;
		md = MessageDigest.getInstance("MD5");
		byte[] md5hash = new byte[32];
		md.update(text.getBytes("iso-8859-1"), 0, text.length());
		md5hash = md.digest();
		return convertToHex(md5hash);
	}

	public static String encrypt(String text) throws NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		byte[] plaintext = text.getBytes();
		// Get a 3DES Cipher object
		Cipher cipher = Cipher.getInstance("TRIPLEDES/CBC/PKCS5Padding"); // Triple-DES
		// encryption
		// Set it into encryption mode
		cipher.init(Cipher.ENCRYPT_MODE, _key, iv);

		// Encrypt data
		byte[] cipherText = cipher.doFinal(plaintext);
		BASE64Encoder b64 = new BASE64Encoder();
		return b64.encode(cipherText);
	}

	public static String decrypt(String text) throws IOException, NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		BASE64Decoder b64 = new BASE64Decoder();
		byte[] cipherText = b64.decodeBuffer(text);

		// Get a 3DES Cipher object
		Cipher cipher = Cipher.getInstance("TRIPLEDES/CBC/PKCS5Padding"); // Triple-DES
		// encryption
		// Set it into decryption mode
		cipher.init(Cipher.DECRYPT_MODE, _key, iv);

		// Decrypt data
		String plainText = new String(cipher.doFinal(cipherText));

		return plainText;
	}

	public static String encrypt2Way(String text) throws NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		byte[] plaintext = text.getBytes();
		// Get a 3DES Cipher object
		Cipher cipher = Cipher.getInstance("TRIPLEDES/CBC/PKCS5Padding"); // Triple-DES
		// encryption
		// Set it into encryption mode
		cipher.init(Cipher.ENCRYPT_MODE, _key, iv);

		// Encrypt data
		byte[] cipherText = cipher.doFinal(plaintext);
		BASE64Encoder b64 = new BASE64Encoder();
		return b64.encode(cipherText);
	}

	public static String decrypt2Way(String text) throws IOException, NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		BASE64Decoder b64 = new BASE64Decoder();
		byte[] cipherText = b64.decodeBuffer(text);

		// Get a 3DES Cipher object
		Cipher cipher = Cipher.getInstance("TRIPLEDES/CBC/PKCS5Padding"); // Triple-DES
		// encryption
		// Set it into decryption mode
		cipher.init(Cipher.DECRYPT_MODE, _key, iv);

		// Decrypt data
		String plainText = new String(cipher.doFinal(cipherText));

		return plainText;
	}

}