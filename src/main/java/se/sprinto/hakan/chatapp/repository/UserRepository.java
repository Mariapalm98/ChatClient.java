package se.sprinto.hakan.chatapp.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import se.sprinto.hakan.chatapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>{
//    User save(User user);
    @Query("SELECT u FROM User u LEFT JOIN FETCH u.messages " +
            "WHERE u.username = :username AND u.password = :password")
    User findByUsernameAndPassword(String username, String password);
//    List<User> findAll();
}

