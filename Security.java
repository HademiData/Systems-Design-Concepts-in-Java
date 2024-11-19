import java.security.MessageDigest;

public class Security {
    // Protecting a system from unauthorized access, data breaches, and other threats. 
    // Techniques include encryption, authentication, and firewalls.

    // Example: Simple password hashing in Java.

    class SecurityExample {
        public static String hashPassword(String password) throws Exception {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        }
    
        public static void main(String[] args) throws Exception {
            String password = "mySecurePassword";
            System.out.println("Hashed password: " + hashPassword(password));
        }
    }
    

}
