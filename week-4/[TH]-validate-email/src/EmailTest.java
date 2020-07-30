public class EmailTest {
    public static void main(String[] args) {
        EmailRegex emailRegex = new EmailRegex();
         String[] emails = new String[] {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com","@gmail.com", "ab@gmail.", "@#abc@gmail.com" };
         for(String email : emails){
             boolean isvalid = emailRegex.validate(email);
             System.out.println("Email is " + email + " is valid " +isvalid);
         }
    }
}
