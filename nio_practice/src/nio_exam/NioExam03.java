package nio_exam;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NioExam03 {
    //NIO 파일 읽기
    public static void main(String[] args) {
        Path path = Paths.get("C:/temp/test.txt");
        try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ);) {
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024 * 1024);
            int read = 0;
            StringBuilder sb = new StringBuilder();
            Charset charset = Charset.defaultCharset();
            while (true) {
                read = fileChannel.read(byteBuffer);
                if (read == -1) {
                    break;
                }
                byteBuffer.flip();
                sb.append(charset.decode(byteBuffer));
                byteBuffer.clear();
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
        }

    }
}
