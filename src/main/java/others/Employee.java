package others;

import java.util.*;

public final class Employee {
    private String name;
    private List<String> roles;
    private Date joiningDate;

    public Employee(String name, List<String> roles, Date joiningDate) {
        this.name = name;
        this.roles = roles;
        this.joiningDate = joiningDate;
    }

    public String getName() {
        return name;
    }

    public List<String> getRoles() {
        return roles;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }
}
