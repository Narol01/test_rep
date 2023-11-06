package practice.album.dao;

import practice.album.model.Photo;

import java.time.LocalDate;
import java.util.Comparator;

public class AlbumImpl implements Album{
    static Comparator<Photo> comparator= (p1,p2)->{
        int res=p1.getDate().compareTo(p2.getDate());
        return res !=0 ? res: Integer.compare(p1.getPhotoId(), p2.getPhotoId());
    };
    Photo[] photos;

    int size;

    public AlbumImpl(int capacity){
        photos=new Photo[capacity];
    }
    @Override
    public boolean addPhoto(Photo photo) {
        return false;
    }

    @Override
    public boolean removePhoto(int photoId, int albumId) {
        return false;
    }

    @Override
    public boolean updatePhoto(int photoId, int albomId, String url) {
        return false;
    }

    @Override
    public Photo getPhotoFRomAlbum(int photoId, int albumId) {
        return null;
    }

    @Override
    public Photo getAllPhotoFRomAlbum(int albumId) {
        return null;
    }

    @Override
    public Photo[] getAllPhotoBetweenDate(LocalDate date, LocalDate dateTo) {
        return new Photo[0];
    }

    @Override
    public int size() {
        return 0;
    }
}
