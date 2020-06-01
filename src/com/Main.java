package com;

import VolunteerModel.VolunteerRepository;
import VolunteerModel.VolunteerRepositoryImp;

import java.io.IOException;

public class Main {
    public Main() throws IOException, ClassNotFoundException {
    }

    public static void main(String[] args) throws Exception {

       System.out.println(createVolunteer());
    }



    public static Volunteer_details createVolunteer() {
        return Volunteer_details.builder()
                .withName("yossi")
                .withAddress("tel aviv")
                .build();
    }


    VolunteerRepository volunteers = VolunteerRepositoryImp.getInstance();


        Volunteer_details volunteer1 = new Volunteer_details("Dana", "Tel Aviv", "0544387623");
        Volunteer_details volunteer2 = new Volunteer_details("Daniel", "Holon", "0529477895");
        Volunteer_details volunteer3 = new Volunteer_details("Dori", "Matan", "0509477333");
        Volunteer_details volunteer4 = new Volunteer_details("Rita", "Matan", "0509477321");
        Volunteer_details volunteer5 = new Volunteer_details("Dana", "Bat-yam", "0529477789");

        volunteers.AddNewVolunteer(volunteer1);
        volunteers.AddNewVolunteer(volunteer2);
        volunteers.AddNewVolunteer(volunteer3);
        volunteers.AddNewVolunteer(volunteer4);
        volunteers.AddNewVolunteer(volunteer5);

        volunteers.showAll();
        System.out.println("\n");
        volunteers.DeleteVolunteer(volunteer3);
        volunteers.showAll();
        System.out.println("\n");
        volunteers.findbyName("Dana");
        volunteers.findbycity("Matan");
        System.out.println("\n");



    }


