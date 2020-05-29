package VolunteerModel;

import com.Volunteer_details;

import java.io.IOException;
import java.util.Set;

public interface VolunteerRepository {

    Set<Volunteer_details> showAll();

    void AddNewVolunteer(Volunteer_details volunteer) throws Exception;

    void DeleteVolunteer(Volunteer_details volunteer) throws IOException;

    Set<Volunteer_details> findbycity(String city);

    Set<Volunteer_details> findbyName(String name);
}
