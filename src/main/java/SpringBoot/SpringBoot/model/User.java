package SpringBoot.SpringBoot.model;

import javax.persistence.*;

@Entity
@Table(name = "users", indexes = {
        @Index(name = "users_id_index", columnList = "id", unique = true),
        @Index(name = "users_active_index", columnList = "active"),
        @Index(name = "users_password_index", columnList = "password"),
        @Index(name = "users_roles_index", columnList = "roles"),
        @Index(name = "users_userName_index", columnList = "userName")
})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String userName;
    private String password;
    private boolean active;
    private String roles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
