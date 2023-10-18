package Musiclibrary;
import java.io.*;

public class txtReader {
    public static void main(String[] args) {
        String inputFilePath = "Coursework406/src/resources/406resources"; // 输入文件路径
        String outputFilePath = "Coursework406/src/resources/output.txt"; // 输出文件路径

        try {
            File inputFile = new File(inputFilePath);
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            File outputFile = new File(outputFilePath);
            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // 打印到控制台

                // 解析每行的 trackName
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String trackName = parts[1].trim();

                    // 创建 Track 对象
                    MusicTrack track = new MusicTrack(trackName);
                    Library library = new Library("My Library");
                    Artist artist = new Artist("name");
                    Album album = new Album("Album1", artist, Album.Type.POP);
                    library.addTrack(track);

                    // 可以在这里对 track 对象进行进一步的操作，例如存储到列表中

                    System.out.println("Generated Track: " + track.getTrackName());

                    bufferedWriter.write(String.valueOf(track)
                    + "\n"
                    + "-------------------------------------"); // 写入输出文件
                    bufferedWriter.newLine(); // 写入换行符
                } else {
                    System.out.println("Invalid line format: " + line);
                }
            }

            bufferedReader.close();
            bufferedWriter.close();
            System.out.println("输出文件已生成：" + outputFilePath);
        } catch (IOException e) {
            System.out.println("发生错误: " + e.getMessage());
        }
    }
}

