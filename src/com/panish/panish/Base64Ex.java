package panish;

import java.util.Base64;

public class Base64Ex {
    public static void main(String[] args) {
        String name = "baeldung:superSecret";
        String encodedString = Base64.getEncoder().encodeToString(name.getBytes());
        System.out.println("Encoded String: "+encodedString);

        String decodedString = new String(Base64.getDecoder().decode("cGFuaXNoOnBhbmlzaA=="));
        System.out.println("Decoded String: "+decodedString);
    }
}
