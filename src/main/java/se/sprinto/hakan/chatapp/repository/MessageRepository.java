package se.sprinto.hakan.chatapp.repository;


import se.sprinto.hakan.chatapp.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import se.sprinto.hakan.chatapp.model.User;
import java.util.List;


public interface MessageRepository extends JpaRepository<Message, Long> {
//    Message save(Message message);
    List<Message> findByUserId(Long userId);
}


