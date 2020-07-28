import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class CopyBinaryFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter source file: ");
        String sourcePath = scanner.nextLine();
        System.out.println("Enter destination file: ");
        String destPath = scanner.nextLine();
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);
        try{
            copyFileUsingStream(sourceFile,destFile);
            System.out.println("Copy Completed");
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
            System.out.println("Can't copy that file");
        }
    }
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            if(!source.exists()){
                throw new FileNotFoundException("File nguồn không tồn tại !");
            }
            if(dest.exists()){
                throw new FileAlreadyExistsException("File đích đã tồn tại !");
            } else {
                dest.createNewFile();
            }
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[16384];
            int length;
            while((length = is.read(buffer))>0) {
                os.write(buffer,0,length);
            }
        }finally {
            is.close();
            os.close();
        }
    }
}
