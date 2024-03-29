package olshkol.msmail.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "\"mail\"")
@Getter
@Setter
public class Mail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Email
    @NotNull
    @Size(min = 1, message = "Please, set an email address to send the message to it")
    private String to;
    private String subject;
    private String text;
}
