package olshkol.msmail.repository;

import olshkol.msmail.entity.Mail;
import org.springframework.data.repository.CrudRepository;

public interface MailRepository extends CrudRepository<Mail, Long> {
}
