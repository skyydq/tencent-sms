package com.tencent.sms.generator;

import java.util.Random;

/**
 * @author yuelimin
 * @software IntelliJ IDEA
 * @description 验证码生成
 * @since JDK 8
 */
public class NumberVerificationCodeGenerator implements VerificationCodeGenerator {
    public NumberVerificationCodeGenerator(int len) {
        this.len = len;
    }

    private int len;

    @Override
    public String generate() {
        return getNumRandom(len);
    }

    private String getNumRandom(int length) {
        String val = "";
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            val += String.valueOf(random.nextInt(10));
        }
        return val;
    }

}
