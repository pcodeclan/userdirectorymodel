package pcodeclan.com.github.userdirectorymodel.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import pcodeclan.com.github.userdirectorymodel.models.File;
import pcodeclan.com.github.userdirectorymodel.models.Folder;
import pcodeclan.com.github.userdirectorymodel.models.User;
import pcodeclan.com.github.userdirectorymodel.repository.FileRepository;
import pcodeclan.com.github.userdirectorymodel.repository.FolderRepository;
import pcodeclan.com.github.userdirectorymodel.repository.UserRespository;

public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRespository userRespository;

    public DataLoader(){}

    public void run(ApplicationArguments args){
        Folder gamesFolder = new Folder("games");
        folderRepository.save(gamesFolder);

        File file1 = new File("Install", ".exe", 1135, gamesFolder);
        fileRepository.save(file1);

        User user1 = new User("Barry");
        userRespository.save(user1);
    }
}
