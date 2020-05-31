package USER;

import java.io.Serializable;

public abstract class User implements Serializable {

    protected static final long serialVersionUID=1L;

    public static final User campaign_manager = null;

    public static final User city_headquarter_manager = null;

    public static final User technical_support = null;

    public static final User telephone_receptionist = null;

    public static final User volunteers = null;

    public static final User members_of_the_party = null;

    protected int id;

    protected String name;
    protected String password;
    protected String email;
    protected String name_of_party;




    public User(int id) {
        super();
        this.id = id;
    }


    public User(int id, String name, String password, String email, String name_of_party) {
        super();
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.name_of_party = name_of_party;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName_of_party() {
        return name_of_party;
    }
    public void setName_of_party(String name_of_party) {
        this.name_of_party = name_of_party;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (id != other.id)
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", name_of_party="
                + name_of_party + "]";
    }



}