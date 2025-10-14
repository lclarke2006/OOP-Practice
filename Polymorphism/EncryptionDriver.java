public class EncryptionDriver {
    public static void main(String[] args) {

        Secret pass = new Secret("lucas123");
        Password pass2 = new Password("lucas123");

        System.out.println("Original1: " + pass);
        System.out.println("Original2: " + pass2);
        System.out.println("\n");

        pass.encrypt();
        pass2.encrypt();

        System.out.println("Encrypted1: " + pass);
        System.out.println("Encrypted2: " + pass2);
        System.out.println("\n");

        pass.decrypt();
        pass2.decrypt();

        System.out.println("Decrypted1: " + pass);
        System.out.println("Decrypted2: " + pass2);
    }
}
