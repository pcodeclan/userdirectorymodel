package pcodeclan.com.github.userdirectorymodel;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pcodeclan.com.github.userdirectorymodel.models.File;
import pcodeclan.com.github.userdirectorymodel.models.Folder;
import pcodeclan.com.github.userdirectorymodel.repository.FileRepository;
import pcodeclan.com.github.userdirectorymodel.repository.FolderRepository;

@SpringBootTest
class UserdirectorymodelApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createFileAndFolderThenSave(){
		Folder gamesFolder = new Folder("games");
		folderRepository.save(gamesFolder);
		File file1 = new File("Install", ".exe", 1135, gamesFolder);
		fileRepository.save(file1);
	}

}
