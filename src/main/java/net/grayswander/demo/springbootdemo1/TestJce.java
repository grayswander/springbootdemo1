package net.grayswander.demo.springbootdemo1;

import javax.crypto.Cipher;
import java.security.NoSuchAlgorithmException;

public class TestJce {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println(Cipher.getMaxAllowedKeyLength("AES"));
    }
}
