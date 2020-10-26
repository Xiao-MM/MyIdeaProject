package com.ming.encryption;

import java.util.UUID;

public class TestAddSalt {
    public static void main(String[] args) {
        String salt = UUID.randomUUID().toString();
        System.out.println("盐值："+salt);
        PasswordEncryptor encoderMd5 = new PasswordEncryptor(salt,"sha-256");

        String encodedPassword = encoderMd5.encode("123456");

        System.out.println("加密后的密码："+encodedPassword+"\n加密后的密码长度："+encodedPassword.length());

        boolean isValid = encoderMd5.isPasswordValid(encodedPassword, "123456");

        System.out.println("加密后的密码："+isValid);

    }
}
