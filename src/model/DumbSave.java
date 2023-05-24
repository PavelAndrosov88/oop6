package model;

import model.base.BaseUser;
import model.base.Persister;

public class DumbSave extends Persister {
    @Override
    public int save(BaseUser user) {
        try {
            // Just for example...
            System.out.println("Save user: " + user.getName());
            return 0;
        }
        catch (Exception e){
            return -1;
        }
    }
}
