package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Set;

import USER.User;


public class technical_support implements UserRepository {


    private final String FILENAME = "users";
    private Set<User> users;
    private FileManager<User> fileManager;

    public technical_support() throws IOException, ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILENAME))) {
            this.users = (Set<User>) objectInputStream.readObject();
        }

    }


    @Override
    public void add(User user) throws Exception {
        if (user == null) {
            throw new Exception("Must have a value");
        }
        if (this.users.contains(user)) {
            throw new Exception("Already exists");
        }
        this.users.add(user);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            objectOutputStream.writeObject(users);

        }

    }

    @Override
    public void update(User user) throws Exception {

    }

    @Override
    public void delete(int id) {
        this.users.remove(User.technical_support);
        this.fileManager.write(this.users);
    }

    @Override
    public User find(int id) {
        if (this.users.contains(User.technical_support)) {
            for (User user : users) {
                if (user.getId() == id) {
                    return user;
                }
            }
        }
        return null;

    }

    @Override
    public Set<User> findAll() {
        return this.users;
    }

    @Override
    public void confirm(User user) throws Exception {
        if (user == null) {
            throw new Exception("Must have a value");
        }
        if (this.users.contains(user)) {
            throw new Exception("Already exists");
        }
        this.users.add(user);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            objectOutputStream.writeObject(users);


        }




    }
}
