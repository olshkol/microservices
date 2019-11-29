package olshkol.msmail.service;

import olshkol.msmail.entity.dto.UserDto;

public interface EmailService {
    void sendSimpleMessage(UserDto input);
}
