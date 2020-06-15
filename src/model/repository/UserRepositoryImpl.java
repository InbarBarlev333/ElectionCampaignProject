package model.repository;

import FileManager.FileManager;
import general_classes.Session;
import general_classes.User;
import model.repository.UserRepository;

import java.io.*;
import java.util.HashSet;
import java.util.Set;


public class UserRepositoryImpl  implements UserRepository {


    private final String FILENAME = "users";
    private Set<User> users;
    private FileManager<User> fileManager;
    private static UserRepositoryImpl INSTANCE;
    private User main_manager;

    public UserRepositoryImpl() throws Exception {
        this.fileManager = new FileManager<User>(FILENAME);
        users = new HashSet<>();
        this.users = fileManager.read();
       // User main_manager=new Campign_manager("sharon","shargamze","B&W","12341234","campign manager","05454");
      //  users.add(main_manager);
     //   this.add(main_manager);
 }


   public void checkifemailvalid(String email) throws Exception{
        for(User user1:users){
            if(email.equals(user1.getEmail())){
                throw  new Exception("email already exist");
            }

        }
   }

    @Override
    public boolean validateuser(String email,String password) throws IOException, ClassNotFoundException {
        for (User user1:users)
        {
            if(email.equals(user1.getEmail()) && password.equals(user1.getPassword()))
            {
                Session.getInstance().SetUser(user1);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean changepassword(String email, String newpassword) throws Exception {
        for (User user1:users)
        {
            if(email.equals(user1.getEmail()))
            {
                user1.setPassword(newpassword);
                System.out.println("password changes");
                return true;
            }
        }
        System.out.println("there is no such email");
        return false;
    }


    public void setauserbuild() throws Exception {
        User campignmanage=User.builder()
                .name("Dani")
                .telephone("0545400258")
                .password("admin1234")
                .email("admin@gmail.com")
                .type_of_job("campign manager")
                .buildCampaignManager();
        this.add(campignmanage);
    }



    public static UserRepositoryImpl getInstance() throws Exception {
        if (INSTANCE==null)
        {
            INSTANCE=new UserRepositoryImpl();
        }
        return INSTANCE;
    }


    @Override
    public void add(User user) throws Exception {
        if (user == null) {
            throw new Exception("must have a value");
        }
        //for (User user1 : users) {
          //  if (user1.equals(user)) {
         //       throw new Exception("Already exists!");
         //   }
        //}
        this.checkifemailvalid(user.getEmail());
        this.users.add(user);
        this.fileManager.write(users);
        System.out.println("new user added!!");

        }



    @Override
    public void delete(int id) throws IOException {
        this.users.remove(users);
        this.fileManager.write(this.users);

    }

    @Override
    public void showall() {
        for (User user1:users)
        {
            System.out.println(user1);
        }
    }


}
