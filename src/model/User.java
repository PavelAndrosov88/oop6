package model;

import model.base.*;

public class User extends BaseUser implements SaveUser, ReportUser {
    public User(String name) {
        super(name);
    }

    @Override
    public void save(Persister ps) {
        ps.save(this);
    }

    @Override
    public void report(Reporter rp) {
        rp.report(this);
    }
}
