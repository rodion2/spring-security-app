package net.rodya_app.springsecurityapp.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by rodya on 1.2.17.
 * Simple JavaBean Object
 * @author rodya
 */
@Entity
@Table(name="roles")
public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="name")
    private String name;
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public Role(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", users=" + users +
                '}';
    }

}