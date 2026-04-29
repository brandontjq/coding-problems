package others;


import java.util.*;

public class BadgeAccess {

    public void solve(String[][] employeeActions) {
        Set<String> inside = new HashSet<>();
        Set<String> employeesWhoEnteredWithoutExiting = new HashSet<>();
        Set<String> employeesWhoExitedWithoutEntering = new HashSet<>();

        for (int i = 0; i < employeeActions.length; i++) {
            String[] employeeAction = employeeActions[i];
            String name = employeeAction[0];
            String action = employeeAction[1];
            if (action.equals("enter")) {
                if (inside.contains(name)) {
                    employeesWhoEnteredWithoutExiting.add(name);
                }
                inside.add(name);
            } else if (action.equals("exit")) {
                if (!inside.contains(name)) {
                    employeesWhoExitedWithoutEntering.add(name);
                } else {
                    inside.remove(name);
                }
            }

        }
        employeesWhoEnteredWithoutExiting.addAll(inside);
        System.out.println("Entered without exit: " + employeesWhoEnteredWithoutExiting);
        System.out.println("Exited without enter: " + employeesWhoExitedWithoutEntering);

    }
}
