package folder;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;

public class CopyTextFile {
    public void copyTextFiletoDesFile(String fromFile, String toFile){
        try {
            File fFile = new File(fromFile);
            File tFile = new File(toFile);
            if(!fFile.exists()){
                throw new FileNotFoundException("Lỗi file không tồn tại !");
            }
            if(tFile.exists()){
                throw new FileAlreadyExistsException("Lỗi file đích đã tồn tại ! ");
            }else{
                tFile.createNewFile();
            }
            BufferedReader br = new BufferedReader(new FileReader(fFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tFile));
            String line = "";
            int countChar =0;
            bw.write(line);
            while((line = br.readLine()) != null){
                bw.write(line + "\n");
                countChar+=line.length();
            }
            System.out.println("số kí tự là = " +countChar);
            br.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("Done!!");
        }
    }
}
