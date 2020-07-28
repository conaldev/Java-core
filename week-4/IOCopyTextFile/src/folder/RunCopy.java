package folder;

import folder.CopyTextFile;

public class RunCopy {
    public static void main(String[] args) {
        CopyTextFile ctf = new CopyTextFile();
        String fromFile = "originalFile.txt";
        String toFile = "copyFile.txt";
        ctf.copyTextFiletoDesFile(fromFile,toFile);
    }
}
