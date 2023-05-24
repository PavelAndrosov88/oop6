package model.base;

public abstract class BaseUser {
    public BaseUser(String name){
        this.name = name;
    }
    private String name;

    public String getName(){
        return name;
    }
    @Override
    public String toString() {
        return	"name='" + name + '\'';
    }
}
