package _sql._test2;

import java.time.LocalDateTime;

/**
 * Created by USER on 31.12.2016, 8:53.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class User {

    private int id;
    private String name;
    private int age;
    private boolean isAdmin;
    private LocalDateTime createdDate;

    public User(int id, String name, int age, boolean isAdmin, LocalDateTime createdDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isAdmin = isAdmin;
        this.createdDate = createdDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isAdmin=" + isAdmin +
                ", createdDate=" + createdDate +
                '}';
    }
}
