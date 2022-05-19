package SpringBoot.SpringBoot.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users", indexes = {
        @Index(name = "users_id_index", columnList = "id", unique = true),
        @Index(name = "users_active_index", columnList = "active"),
        @Index(name = "users_password_index", columnList = "password"),
        @Index(name = "users_roles_index", columnList = "roles"),
        @Index(name = "users_userName_index", columnList = "userName")
})

/**
 * Сущность для таблицы users
 */
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private String userName, password, roles;
    @Getter
    @Setter
    private boolean active;
}
