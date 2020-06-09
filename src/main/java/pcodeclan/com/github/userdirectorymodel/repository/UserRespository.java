package pcodeclan.com.github.userdirectorymodel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pcodeclan.com.github.userdirectorymodel.models.User;

public interface UserRespository extends JpaRepository<User, Long> {
}
