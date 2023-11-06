package practice.album.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.album.dao.Album;
import practice.album.dao.AlbumImpl;
import practice.album.model.Photo;

import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlbumImplTest {
    Album album;
    LocalDateTime now=LocalDateTime.now();
    Photo[] ph;


    @BeforeEach
    void setUp() {
        album = new AlbumImpl(7);
        Photo[] ph = new Photo[6];
        ph[0] = new Photo(1, 1, "t1","url1",now.minusDays(7));
        ph[1] = new Photo(1, 2, "t2","url1",now.minusDays(7));
        ph[2] = new Photo(1, 3, "t3","url1",now.minusDays(5));
        ph[3] = new Photo(2, 1, "t1","url1",now.minusDays(7));
        ph[4] = new Photo(2, 2, "t2","url1",now.minusDays(7));
        ph[5] = new Photo(2, 3, "t3","url1",now.minusDays(8));
    }

    @Test
    void addPhoto() {
        assertFalse(album.addPhoto(null));
        assertFalse(album.addPhoto(ph[1]));
        Photo ph1=new Photo(3,1,"t","url",now);
        assertTrue(album.addPhoto(ph1));
        assertEquals(7,album.size());
        assertFalse(album.addPhoto(ph1));
    }

    @Test
    void removePhoto() {
    }

    @Test
    void updatePhoto() {
    }

    @Test
    void getPhotoFRomAlbum() {
    }

    @Test
    void getAllPhotoFRomAlbum() {
    }

    @Test
    void getAllPhotoBetweenDate() {
    }

    @Test
    void size() {
        assertEquals(6,album.size());
    }
}