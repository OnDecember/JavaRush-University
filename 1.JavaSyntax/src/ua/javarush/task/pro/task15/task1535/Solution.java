package ua.javarush.task.pro.task15.task1535;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/* 
Розбиваємо файл на частини
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        splitFile("C:\\Users\\maxym\\Desktop\\dir\\file.txt", 1024);
    }

    public static void splitFile(String fileName, int partSize) throws IOException {
        try (FileChannel inputChannel = FileChannel.open(Paths.get(fileName), StandardOpenOption.READ)) {
            ByteBuffer buffer = ByteBuffer.allocate(partSize);
            for (int i = 1; inputChannel.read(buffer) > 0; i++) {
                Path newFile = Path.of(getNewFileName(fileName, i));
                if (Files.notExists(newFile)) {
                    Files.createFile(newFile);
                }
                try (FileChannel outputChannel = FileChannel.open(newFile, StandardOpenOption.WRITE)) {
                    buffer.flip();
                    outputChannel.write(buffer);
                    buffer.clear();
                }
            }
        }
    }

    public static String getNewFileName(String oldFileName, int number) {
        int dotIndex = oldFileName.lastIndexOf(".");
        return oldFileName.substring(0, dotIndex) + number + oldFileName.substring(dotIndex);
    }
}
