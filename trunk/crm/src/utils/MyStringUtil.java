package utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by zhangchenzhao on 2017/4/6.
 */
public class MyStringUtil {

    public static String getMD5String(String value){
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] MD5ValueByteArray = messageDigest.digest(value.getBytes());
            BigInteger bigInteger = new BigInteger(1, MD5ValueByteArray);
            return bigInteger.toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return value;
        }
    }
}
