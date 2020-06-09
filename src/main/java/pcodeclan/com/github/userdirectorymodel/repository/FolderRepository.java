package pcodeclan.com.github.userdirectorymodel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pcodeclan.com.github.userdirectorymodel.models.Folder;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
