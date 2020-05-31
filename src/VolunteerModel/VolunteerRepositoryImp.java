package VolunteerModel;

import com.Volunteer_details;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;



public class VolunteerRepositoryImp implements VolunteerRepository {

    private final String FILENAME = "volunteers";
    private Set<Volunteer_details> volunteers;
    private FileManager<Volunteer_details> fileManager;
    private static VolunteerRepositoryImp INSTANCE;

    private VolunteerRepositoryImp() throws IOException, ClassNotFoundException {
        this.fileManager = new FileManager<>(FILENAME);
        volunteers = new HashSet<Volunteer_details>();
        this.volunteers = fileManager.read();
    }

    public static VolunteerRepositoryImp getInstance() throws IOException, ClassNotFoundException{
        if (INSTANCE==null){
            INSTANCE= new VolunteerRepositoryImp();
        }
        return INSTANCE;
    }


    @Override
    public Set<Volunteer_details> showAll() {
        for(Volunteer_details volunteer1 : volunteers){
                System.out.println(volunteer1);
        }
         return this.volunteers;
    }


    @Override
    public void AddNewVolunteer(Volunteer_details volunteer) throws Exception{
        if (volunteer == null){
            throw new Exception ("Something went wrong");
        }

        for (Volunteer_details volunteer1 : volunteers){
            if(volunteer1.equals(volunteer)){
                throw new Exception("Already exists!");
            }
        }
        this.volunteers.add(volunteer) ;
        this.fileManager.write(volunteers);
    }

    @Override
    public void DeleteVolunteer(Volunteer_details volunteer) throws IOException {
        volunteers.remove(volunteer);
        fileManager.write(volunteers);
    }

    @Override
    public Set<Volunteer_details> findbycity(String city) {
        Set<Volunteer_details> cityfind = new HashSet<Volunteer_details>() ;
        for (Volunteer_details volunteer : volunteers) {
            String cityofvolunteer=volunteer.getVolunteer_address();
            if (cityofvolunteer == city) {
                cityfind.add(volunteer);
            }
        }
        return cityfind;

    }

    @Override
    public Set<Volunteer_details> findbyName(String name){
        Set<Volunteer_details> namefind = new HashSet<Volunteer_details>();
        for (Volunteer_details volunteer: volunteers){
            String nameofvolunteer=volunteer.getVolunteer_name();
            if(nameofvolunteer == name){
                namefind.add(volunteer);
                System.out.println(volunteer);
            }
        }
        return namefind;
    }

}