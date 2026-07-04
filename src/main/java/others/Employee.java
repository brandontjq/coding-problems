package others;

import java.util.*;

public final class Employee {
    private String name;
    private List<String> roles;
    private Date joiningDate;

    public Employee(String name, List<String> roles, Date joiningDate) {
        this.name = name;
        //this.roles = List.copyOf(roles); //returns immutable list
        this.roles = roles;
        this.joiningDate = new Date(joiningDate.getTime()); //this is needed for defensive copying.
    }

    public String getName() {
        return name;
    }

    public List<String> getRoles() {
        return new ArrayList<>(roles);
    }

    public Date getJoiningDate() {
        return new Date(this.joiningDate.getTime()); //need it here again because Date is mutable
    }
}
