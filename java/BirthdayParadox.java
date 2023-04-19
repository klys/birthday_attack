import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;

public class BirthdayParadox {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
        Set<String> hashSet = new HashSet<>();

        while (true) {
            String input = Double.toString(Math.random());
            byte[] hashBytes = sha1.digest(input.getBytes());
            String hash = bytesToHex(hashBytes);

            if (hashSet.contains(hash)) {
                System.out.println("Collision found for inputs " + input + " and " + hashSet.stream().filter(h -> h.equals(hash)).findFirst().get());
                break;
            }

            hashSet.add(hash);
        }
    }

    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();

    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int i = 0; i < bytes.length; i++) {
            int v = bytes[i] & 0xFF;
            hexChars[i * 2] = HEX_ARRAY[v >>> 4];
            hexChars[i * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }
}
