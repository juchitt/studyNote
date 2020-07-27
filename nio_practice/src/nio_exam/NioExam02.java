package nio_exam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioExam02 {
    //NIO 파일복사
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/Users/Juchi/Desktop/성시경/050407 다시 꿈꾸고 싶다 [정규4집]/성시경 - 잊혀지는 것들에 대하여.mp3");
        Path path2 = Paths.get("C:/Users/Juchi/Desktop/성시경 - 잊혀지는 것들에 대하여.mp3");
        System.out.println(Files.copy(path, path2));
    }
}
