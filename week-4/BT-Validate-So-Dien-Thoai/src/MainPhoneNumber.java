import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainPhoneNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phoneNumber = br.readLine();
        System.out.println("You phone number " + phoneNumber + " is valid "+ (new ValidateNumber()).isValidNumber(phoneNumber));
    }
}
