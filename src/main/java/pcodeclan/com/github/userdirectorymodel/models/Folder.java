package pcodeclan.com.github.userdirectorymodel.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //title, files <List>, userid
    @Column
    private String title;

    @JsonIgnoreProperties("folder")
    @OneToMany(mappedBy = "folder", fetch = FetchType.LAZY)
    private List<File> files;

    public Folder(String title) {
        this.title = title;
    }

    public Folder(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}
