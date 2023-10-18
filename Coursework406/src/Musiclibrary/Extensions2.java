package Musiclibrary;

import java.util.ArrayList;
import java.util.List;

public class Extensions2 {
    static List<MusicTrack> CD; // 表示1个光盘
    static long capacit;   // 表示光盘的容量
    public static void backups(long capacity,List<Library> libraries){   // 第一个参数代表光盘的容量，第二个代表所有音乐库
        List<List<MusicTrack>> CDS = null;  // 用来存储少量光盘
        capacit = capacity;     // 初始化光盘容量
        for (Library library : libraries) { // 遍历传入的所有音乐库
            ArrayList<MusicTrack> tracks = library.getTracks();
            for (MusicTrack track : tracks) {   // 遍历音乐库中每首音乐
               if (track.getFileSize()<=capacit){   // 判断音乐大小是否小于当前光盘的容量
                   CD.add(track);   //光盘存储歌曲
                   capacit-=track.getFileSize();    // 光盘存储歌曲成功，容量较少
               }else {
                    CDS.add(CD);    // 存储光盘
                    CD = null;  // 新创建一个光盘
                    capacit = capacity;     // 初始化光盘容量
                    capacit-= track.getFileSize();
                    CD.add(track);
               }
            }
        }
    }
}
