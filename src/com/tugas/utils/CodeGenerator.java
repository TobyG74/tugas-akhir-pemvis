package com.tugas.utils;

import java.security.SecureRandom;

public class CodeGenerator {
    private static final SecureRandom random = new SecureRandom();
    private static final int CODE_LENGTH = 6;

    public static String generateCode() {
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < CODE_LENGTH; i++) {
            int digit = random.nextInt(10); // 0 - 9
            code.append(digit);
        }
        return code.toString();
    }
}
