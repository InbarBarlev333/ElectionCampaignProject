package com.company;

import java.io.Serializable;

public class Volunteer_details implements Serializable {

    private String volunteer_name;
    private String volunteer_address;
    private String volunteer_cell;
    private static int volunteer_id = 0;


    public Volunteer_details(String name, String address, String cell){
        volunteer_name = name;
        volunteer_address = address;
        volunteer_cell = cell;
        setId(getId(volunteer_id)+1);
    }

    private int getId(int volunteer_id) {
        return volunteer_id;
    }

    public static void setId(int id) {
        volunteer_id= id;
    }

    public void Volunteer_details(String volunteer_name, String volunteer_city, String volunteer_telephone) throws Exception  {
        this.volunteer_name = volunteer_name;
        this.volunteer_address = volunteer_city;
        int telephone=volunteer_telephone.length();
        if (telephone == 10 || telephone == 9 ) {
            this.volunteer_cell = volunteer_telephone;
        }
        else {
            throw new Exception("invalid number");
        }
        setvolunteer_id(getVolunteer_id() + 1);
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

    public String getVolunteer_cell() {
        return volunteer_cell;
    }

    public void setVolunteer_cell(String volunteer_cell) throws Exception{
        int telephone= volunteer_cell.length();
        if (telephone == 10 || telephone == 9 ) {
            this.volunteer_cell = volunteer_cell;
        }
        else {
            throw new Exception("invalid number");
        }
    }


    public static int getVolunteer_id() {
        return volunteer_id;
    }

    public static void setvolunteer_id(int volunteer_id) {
        Volunteer_details.volunteer_id = volunteer_id;
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
        return volunteer_cell.equals(c.volunteer_cell);

    }


    public boolean contains(Object obj){
        Volunteer_details other = (Volunteer_details) obj;
        if(this.volunteer_cell == other.volunteer_cell){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Supporter_details [supporter_name=" + volunteer_name + ", supporter_city=" + volunteer_address
                + ", supporter_telephone=" + volunteer_cell +  "]";
    }
}
