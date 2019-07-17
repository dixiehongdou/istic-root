package com.istic.util;

import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;

import java.security.MessageDigest;
import java.util.Random;

/**
 * Created by hch on 2019/7/17.
 */
public class Md5PasswordUtil {
    /**
     * 生成16位数的随机salt值
     *
     * @return
     */
    public static String randomSalt() {
        Random r = new Random();
        StringBuilder sb = new StringBuilder(16);
        sb.append(r.nextInt(99999999)).append(r.nextInt(99999999));
        int len = sb.length();
        if (len < 16) {
            for (int i = 0; i < 16 - len; i++) {
                sb.append("0");
            }
        }
        String salt = sb.toString();
        return salt;
    }

    /**
     * 生成含有随机盐的密码
     *
     * @param password 明文密码
     * @param salt     盐值
     * @return
     */
    public static String generate(String password, String salt) {

        password = md5Hex(password + salt);
        char[] cs = new char[48];
        for (int i = 0; i < 48; i += 3) {
            cs[i] = password.charAt(i / 3 * 2);
            char c = salt.charAt(i / 3);
            cs[i + 1] = c;
            cs[i + 2] = password.charAt(i / 3 * 2 + 1);
        }
        return new String(cs);
    }

    /**
     * 校验密码是否正确
     *
     * @param password 明文密码
     * @param md5      加密加盐后的密码
     * @return
     */
    public static boolean verify(String password, String md5) {
        char[] cs1 = new char[32];
        char[] cs2 = new char[16];
        for (int i = 0; i < 48; i += 3) {
            cs1[i / 3 * 2] = md5.charAt(i);
            cs1[i / 3 * 2 + 1] = md5.charAt(i + 2);
            cs2[i / 3] = md5.charAt(i + 1);
        }
        String salt = new String(cs2);
        return md5Hex(password + salt).equals(new String(cs1));
    }

    /**
     * 获取十六进制字符串形式的MD5摘要
     */
    public static String md5Hex(String src) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] bs = md5.digest(src.getBytes());
            new HexBin();
            return new String(HexBin.encode(bs));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
