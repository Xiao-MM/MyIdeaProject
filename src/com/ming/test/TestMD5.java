package com.ming.test;

import com.ming.util.MD5Util;

public class TestMD5 {
    public static void main(String[] args) {
        String md5Str = MD5Util.getMD5Str("3271707845");
        System.out.println(md5Str);

    }
}
