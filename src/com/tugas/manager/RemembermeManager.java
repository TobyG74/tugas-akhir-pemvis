package com.tugas.manager;

import java.io.*;
import java.util.Properties;

public class RemembermeManager {

    private static final String FILE_PATH = "src/com/tugas/manager/config/Rememberme.properties";

    public static void save(String username, String password) {
        try {
            File file = new File(FILE_PATH);
            file.getParentFile().mkdirs(); // Bikin folder kalau belum ada
            try (OutputStream output = new FileOutputStream(file)) {
                Properties prop = new Properties();
                prop.setProperty("username", username);
                prop.setProperty("password", password);
                prop.store(output, null);
                System.out.println("Saved to: " + file.getAbsolutePath());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String[] load() {
        String[] result = {"", ""};
        try (InputStream input = new FileInputStream(FILE_PATH)) {
            Properties prop = new Properties();
            prop.load(input);
            result[0] = prop.getProperty("username", "");
            result[1] = prop.getProperty("password", "");
        } catch (IOException ex) {
            System.out.println("Properties file not found, using defaults.");
        }
        return result;
    }

    public static void clear() {
        File file = new File(FILE_PATH);
        if (file.exists()) {
            file.delete();
        }
    }
}
