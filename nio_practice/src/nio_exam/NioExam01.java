package nio_exam;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NioExam01 {
    //NIO 파일생성
    public static void main(String[] args) {
        String text = "Wake me up before you leave\n" +
                "I've got an interview today\n" +
                "I wanna job so don't forget to lend me some for train\n" +
                "I'm growing up to be a better man\n" +
                "But I always fail, I'm still a dirty bug\n" +
                "I wanna grab the flag\n" +
                "But there's always someone faster\n" +
                "I'm trying to live a bit seriously\n" +
                "But what's on my mind is you know always girls\n" +
                "Vitaminize me\n" +
                "Pass me the potato chips\n" +
                "You know what\n" +
                "When nothing's going right\n" +
                "You know what\n" +
                "It's like a magic thing\n" +
                "I got the music playing loud in my head\n" +
                "I got a red hot chili blows it away\n" +
                "I got the music playing loud in my head\n" +
                "Turn the blinker off we go straight ahead\n" +
                "I'm going down like 20 times a day\n" +
                "It could be less or maybe the same as you\n" +
                "And I'm floating up more than a million times a day\n" +
                "I'm trying to live a bit cautiously\n" +
                "But what's on my mind is always having fun\n" +
                "I know nicotine kills\n" +
                "But quitting smoking kills me now\n" +
                "You know what\n" +
                "When nothing's going right\n" +
                "You know what\n" +
                "It's like a magic thing\n" +
                "I got the music playing loud in my head\n" +
                "I got a red hot chili blows it away\n" +
                "I got the music playing loud in my head\n" +
                "Turn the blinker off we go straight ahead\n" +
                "As always things won't be better\n" +
                "As always no one understands\n" +
                "As always I'll do anything\n" +
                "As always if it makes you laugh\n" +
                "I'm growing up to be a better man\n" +
                "But I always fail, I'm still a dirty bug\n" +
                "I wanna grab the flag\n" +
                "But there's always someone faster\n" +
                "I got the music playing loud in my head\n" +
                "I got a red hot chili blows it away\n" +
                "I got the music playing loud in my head\n" +
                "Turn the blinker off we go straight ahead\n" +
                "I got the music playing loud in my head\n" +
                "I got a red hot chili blows it away\n" +
                "I got the music playing loud in my head\n" +
                "Turn the blinker off we are heading ahead";
        try (FileChannel fileChannel = FileChannel.open(Paths.get("C:/temp/test.txt"), StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            ByteBuffer byteBuffer = ByteBuffer.allocate(text.getBytes().length);
            byteBuffer.put(Charset.defaultCharset().encode(text));
            byteBuffer.flip();
            fileChannel.write(byteBuffer);
        }catch (IOException e) {
            e.printStackTrace();
        }


    }

}
