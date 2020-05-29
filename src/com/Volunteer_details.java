package com;
import java.io.Serializable;

public class Volunteer_details implements Serializable {

    private String volunteer_name;
    private String volunteer_address;
    private String volunteer_telephone;
    private int volunteer_id = 0;
    private static int count = 0;


    public Volunteer_details(String name, String address, String telephone){
        volunteer_name = name;
        volunteer_address = address;
        volunteer_telephone = telephone;
        volunteer_id=getVolunteer_id();
    }

    public int getVolunteer_Id() {
        return count;
    }


    public void Volunteer_details(String volunteer_name, String volunteer_city, String volunteer_telephone) throws Exception  {
        this.volunteer_name = volunteer_name;
        this.volunteer_address = volunteer_city;
        int telephone=volunteer_telephone.length();
        this.volunteer_id=count;
        if (telephone == 10 || telephone == 9 ) {
            this.volunteer_telephone = volunteer_telephone;
        }
        else {
            throw new Exception("invalid number");
        }
    }




    public String getVolunteer_name() {
        return volunteer_name;
    }

    public void setVolunteer_name(String volunteer_name) {
        this.volunteer_name = volunteer_name;
    }

    public String getVolunteer_address() {
        return volunteer_address;
    }

    public void setVolunteer_address(String volunteer_address) {
        this.volunteer_address = volunteer_address;
    }

    public String getVolunteer_telephone() {
        return volunteer_telephone;
    }

    public void setVolunteer_telephone(String volunteer_telephone) throws Exception{
        int telephone= volunteer_telephone.length();
        if (telephone == 10 || telephone == 9 ) {
            this.volunteer_telephone = volunteer_telephone;
        }
        else {
            throw new Exception("invalid number");
        }
    }


    public int getVolunteer_id() {
        return this.volunteer_id;
    }

    public void setvolunteer_id() {

        count=count+1;
        this.volunteer_id=count;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.volunteer_id;
        return result;
    }

    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Volunteer_details)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Volunteer_details c = (Volunteer_details) o;

        // Compare the data members and return accordingly
        return volunteer_telephone.equals(c.volunteer_telephone);

    }


    public boolean contains(Object obj){
        Volunteer_details other = (Volunteer_details) obj;
        if(this.volunteer_telephone == other.volunteer_telephone){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Volunteer_details [volunteer_name=" + volunteer_name + ", volunteer_city=" + volunteer_address
                + ", volunteer_telephone=" + volunteer_telephone +  "]";
    }
}
