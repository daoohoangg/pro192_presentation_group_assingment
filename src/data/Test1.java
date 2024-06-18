
package data;


public class Test1 {
    private String name;
    private int yob;
    private String id;

    public Test1(String id, String name, int yob) {
        this.name = name;
        this.yob = yob;
        this.id = id;
    }

    @Override
    public String toString() {
        return id.trim().toUpperCase() + "-" + name.trim().toUpperCase() + "-" + yob;
    }
    
    
    
}
