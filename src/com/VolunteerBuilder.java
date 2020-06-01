package com;

public class VolunteerBuilder {
    private String volunteer_name;
    private String volunteer_address;
    private String volunteer_telephone;

    public VolunteerBuilder withName (String name){
        this.volunteer_name = name;
        return this;
    }


    public VolunteerBuilder withAddress (String address){
        this.volunteer_address = address;
        return this;
    }

    public VolunteerBuilder withtelephone (String telephone){
        this.volunteer_telephone = telephone;
        return this;
    }

    public Volunteer_details build(){
        Volunteer_details volunteer_details = new Volunteer_details();
        volunteer_details.setVolunteer_name(this.volunteer_name);
        volunteer_details.setVolunteer_address(this.volunteer_address);
       // volunteer_details.setVolunteer_telephone(this.volunteer_telephone);
        return volunteer_details;
    }

}
