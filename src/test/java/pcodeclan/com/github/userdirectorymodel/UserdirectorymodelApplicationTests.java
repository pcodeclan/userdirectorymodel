package pcodeclan.com.github.userdirectorymodel;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pcodeclan.com.github.userdirectorymodel.models.File;
import pcodeclan.com.github.userdirectorymodel.models.Folder;
import pcodeclan.com.github.userdirectorymodel.models.User;
import pcodeclan.com.github.userdirectorymodel.repository.FileRepository;
import pcodeclan.com.github.userdirectorymodel.repository.FolderRepository;
import pcodeclan.com.github.userdirectorymodel.repository.UserRespository;

@SpringBootTest
class UserdirectorymodelApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRespository userRespository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createFileFolderUserThenSave(){
		Folder gamesFolder = new Folder("games");
		folderRepository.save(gamesFolder);
		File file1 = new File("Install", ".exe", 1135, gamesFolder);
		fileRepository.save(file1);
		User user1 = new User("Barry");
		userRespository.save(user1);
	}

}
