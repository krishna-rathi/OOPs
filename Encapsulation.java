class TestEncapsulate {
   
    private String name;
    private int roll;
    private int age;
 
    //getter
    // get method for age to access
    // private variable geekAge
    public int getAge() { return this.age; }
 
    // get method for name to access
    // private variable geekName
    public String getName() { return name; }
 
    // get method for roll to access
    // private variable geekRoll
    public int getRoll() { return roll; }
 
    //setters
    // set method for age to access
    // private variable geekage
    public void setAge(int newAge) { age = newAge; }
 
    // set method for name to access
    // private variable geekName
    public void setName(String newName)
    {
        name = newName;
    }
 
    // set method for roll to access
    // private variable geekRoll
    public void setRoll(int newRoll) { roll = newRoll; }
}
 
public class Encapsulate {
    public static void main(String[] args)
    {
        TestEncapsulate obj = new TestEncapsulate();
 
        // setting values of the variables
        obj.setName("Newton");
        obj.setAge(19);
        obj.setRoll(51);
 
        // Displaying values of the variables
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        System.out.println("Roll: " + obj.getRoll());
 
        // Direct access of geekRoll is not possible
        // due to encapsulation
        // System.out.println("Geek's roll: " +
        // obj.geekName);
    }
}
