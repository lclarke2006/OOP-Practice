public class Password implements Encryptable {

    private String password;
    private boolean encrypted;

    public Password(String msg) {
        password = msg;
        encrypted = false;
    }

    public void encrypt() {
        if (!encrypted) {

            String New = "";

            for (int i = 0; i < password.length(); i++) {
                New = password.charAt(i) + New;
            }

            password = New;
            encrypted = true;
        }
    }

    public String decrypt() {
        String original = "";

        if (encrypted) {
            for (int i = 0; i < password.length(); i++) {
                original = password.charAt(i) + original;
            }

            password = original;
            encrypted = false;
        }
        return password;
    }

    public String toString() {
        return password;
    }
}
