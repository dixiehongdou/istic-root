package com.istic.util;

import org.apache.commons.codec.binary.Base64;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.KeySpec;

/**
 * Des加解密工具类
 *
 * @Author: sunwy
 * @Date: 2019/7/31 13:59
 */
public class DESUtil {
    private byte[] desKey;
    private static final String key = "lzgwglxt";

    /**
     * 解密
     *
     * @param message
     * @return
     * @throws Exception
     */
    public static String decrypt(String message) throws Exception {

        byte[] bytesrc = convertHexString(message);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        DESKeySpec desKeySpec = new DESKeySpec(key.getBytes("UTF-8"));
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
        IvParameterSpec iv = new IvParameterSpec(key.getBytes("UTF-8"));

        cipher.init(Cipher.DECRYPT_MODE, secretKey, iv);

        byte[] retByte = cipher.doFinal(bytesrc);
        String result = new String(retByte);
        return java.net.URLDecoder.decode(result, "utf-8");
    }

    /**
     * 加密
     *
     * @param message
     * @return
     * @throws Exception
     */
    public static String encrypt(String message)
            throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");

        DESKeySpec desKeySpec = new DESKeySpec(key.getBytes("UTF-8"));

        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
        IvParameterSpec iv = new IvParameterSpec(key.getBytes("UTF-8"));
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, iv);

        byte[] buffer = cipher.doFinal(message.getBytes("UTF-8"));
        return toHexString(buffer).toUpperCase();
    }

    private static byte[] convertHexString(String ss) {
        byte digest[] = new byte[ss.length() / 2];
        for (int i = 0; i < digest.length; i++) {
            String byteString = ss.substring(2 * i, 2 * i + 2);
            int byteValue = Integer.parseInt(byteString, 16);
            digest[i] = (byte) byteValue;
        }

        return digest;
    }


    public static void main(String[] args) throws Exception {
        String key = "lzgwglxt";
        String value = "aa";
        String jiami = java.net.URLEncoder.encode(value, "utf-8").toLowerCase();

        System.out.println("加密数据:" + jiami);
        String a = encrypt(jiami);

        System.out.println(a.equals("EE5E917FB8B601DA"));
        System.out.println("加密后的数据为:" + a);
        String b = decrypt(a);
        System.out.println("解密后的数据:" + b);

    }


    private static String toHexString(byte b[]) {
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            String plainText = Integer.toHexString(0xff & b[i]);
            if (plainText.length() < 2)
                plainText = "0" + plainText;
            hexString.append(plainText);
        }

        return hexString.toString();
    }


}
