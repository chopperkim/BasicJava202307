package chapter18;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample {
    public static void main(String[] args) throws Exception {
        // URI(uniform resource identifier)
        // URL(uniform resource location)
        File dir = new File("/home/ssam/mydirectory");
        if (!dir.exists()) {
            dir.mkdirs();
        }

        File file1 = new File(dir, "file1.txt");
        File file2 = new File(dir, "file2.txt");
        File file3 = new File(dir, "file3.txt");
        if (!file1.exists()) {
            file1.createNewFile();
        }
        if (!file2.exists()) {
            file2.createNewFile();
        }
        if (!file3.exists()) {
            file3.createNewFile();
        }
        Files.writeString(Paths.get("mydata.txt"),
                "안녕하세요. 이제 곧 점심시간이 다가옵니다." +
                        "오늘은 무엇을 먹을까요?");
    }
}
