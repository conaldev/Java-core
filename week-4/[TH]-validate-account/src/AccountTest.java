public class AccountTest {
    public static void main(String[] args) {
        ValidateAccount validateAccount = new ValidateAccount();
        String[] accounts = new String[] {"123abc_", "_abc123", "______", "123456","abcdefgh",".@", "12345", "1234_", "abcde"};
        for(String account : accounts ){
            boolean isvalid = validateAccount.validAccount(account);
            System.out.println("Account is " + account + " is valid " + isvalid);
        }
    }
}
