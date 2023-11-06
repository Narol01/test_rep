package practice.album.dao;

import practice.album.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface Album {
    boolean addPhoto(Photo photo);

    boolean removePhoto(int photoId,int albumId);
    boolean updatePhoto(int photoId,int albumId,String url);
    Photo getPhotoFRomAlbum(int photoId,int albumId);
    Photo getAllPhotoFRomAlbum(int albumId);
    Photo[] getAllPhotoBetweenDate(LocalDate date, LocalDate dateTo);
    int size();//quantity of photos in all albums
}
