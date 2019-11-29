package olshkol.msuser.service;

import olshkol.msuser.entity.User;

public interface UserService {
    User registerUser(User input);

    Iterable<User> findAll();
}
