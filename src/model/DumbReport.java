package model;

import model.base.BaseUser;
import model.base.Reporter;

public class DumbReport extends Reporter {
    @Override
    public void report(BaseUser user) {
        System.out.println("Report for user: " + user.getName());
    }
}
