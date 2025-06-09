package com.tugas.manager;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 *
 * @author tobi
 */
public class RoleManager {
    private static final String FILE_PATH = "src/com/tugas/manager/RoleManager.properties";
    
    public static void writeRoleToFile(String role, String fullname, String username) {
        Properties props = new Properties();
        props.setProperty("currentRole", role);
        props.setProperty("fullname", fullname);
        props.setProperty("username", username);

        try (OutputStream output = new FileOutputStream(FILE_PATH)) {
            props.store(output, "Role user yang sedang login");
            System.out.println("Role berhasil disimpan ke file role.properties");
        } catch (IOException ex) {
            System.err.println("Gagal menulis role: " + ex.getMessage());
        }
    }
    
    public static String getRoleFromFile() {
        Properties props = new Properties();
        String role = "";

        try (InputStream input = new FileInputStream(FILE_PATH)) {
            props.load(input);
            role = props.getProperty("currentRole", "Unknown");
        } catch (IOException ex) {
            System.err.println("Gagal membaca file role.properties: " + ex.getMessage());
        }

        return role;
    }
    
    public static String getFullnameFromFile() {
        Properties props = new Properties();
        String role = "";

        try (InputStream input = new FileInputStream(FILE_PATH)) {
            props.load(input);
            role = props.getProperty("fullname", "Unknown");
        } catch (IOException ex) {
            System.err.println("Gagal membaca file role.properties: " + ex.getMessage());
        }

        return role;
    }
    
    public static String getUsernameFromFile() {
        Properties props = new Properties();
        String role = "";

        try (InputStream input = new FileInputStream(FILE_PATH)) {
            props.load(input);
            role = props.getProperty("username", "Unknown");
        } catch (IOException ex) {
            System.err.println("Gagal membaca file role.properties: " + ex.getMessage());
        }

        return role;
    }
}
