package olshkol.msauthserver.repository;

import olshkol.msauthserver.entity.Account;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface AccountRepository extends Repository<Account, Long> {
    Optional<Account> findByUsername(String username);

    Account save(Account account);

}