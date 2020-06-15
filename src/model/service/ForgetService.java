package model.service;

import model.repository.UserRepository;
import model.repository.UserRepositoryImpl;

import java.util.UUID;

public class ForgetService {


    private UserRepository ForgetRepo;

    public ForgetService() throws Exception {

        UserRepository userRepository1 = UserRepositoryImpl.getInstance();

        ForgetRepo = userRepository1;
    }

    public String Change_pass(String email, String newPassword) throws Exception {
        if (this.ForgetRepo.changepassword(email, newPassword)) {
            return UUID.randomUUID().toString();
        }
        return null;
    }

}
