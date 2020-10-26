package com.ming.test;

import java.util.Base64;

public class TestBase64 {
    public static void main(String[] args) {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decode = decoder.decode("aHR0cHM6Ly93d3cueGluamllY2xvdWQudmlwL2F1dGgvcmVnaXN0ZXI/Y29kZT1nZjlz");
        String url = new String(decode);
        System.out.println(url);
    }
}
