package olshkol.msuser.repository;

import olshkol.msuser.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
