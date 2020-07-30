import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String className = br.readLine();
        System.out.println("Class " + className +" is valid " + (new ValidateClass()).isClassName(className));
    }
}
