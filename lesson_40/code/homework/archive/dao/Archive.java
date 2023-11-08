package homework.archive.dao;

import homework.archive.model.Documents;

import java.time.LocalDateTime;

public interface Archive {
    boolean addDocument(Documents documents);
    Documents removeDocument(int documentId, int FolderId);
    boolean updateDocument(int documentId,int FolderId,int url);
    Documents getDocumentFromArchive(int documentId,int FolderId);
    Documents[] getAllDocumentFromArchive(int FolderId);
    Documents[] getAllDocumentBetweenDate(LocalDateTime date, LocalDateTime dateTo);
    int size();//quantity of photos in all Archive
    void  printArray();
}
