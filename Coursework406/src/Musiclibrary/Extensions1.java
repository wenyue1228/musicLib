package Musiclibrary;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Extensions1 {
    private Set<Album> album;       // 所有专辑  因为专辑是唯一的所有用Set集合没用List集合
    private Artist artist;  // 专辑对应的艺术家
    private Map<MusicTrack,Album> storeMusicOriginalAlbum;   // 存储每首曲目的对应原始专辑

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Set<Album> getAlbum() {
        return album;
    }

    public void setAlbum(Set<Album> album) {
        this.album = album;
    }

    public Map<MusicTrack, Album> getStoreMusicOriginalAlbum() {
        return storeMusicOriginalAlbum;
    }

    public void setStoreMusicOriginalAlbum(Map<MusicTrack, Album> storeMusicOriginalAlbum) {
        this.storeMusicOriginalAlbum = storeMusicOriginalAlbum;
    }
}
