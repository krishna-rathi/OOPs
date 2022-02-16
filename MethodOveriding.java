//We can have any implementation of the parent class method 
//once we over-ride it in the child classes
class Parent {
 
    //int x;
    // Method of parent class
    static void Printa()
    {
 
        System.out.println("parent class");
    }

    void Print()
    {
 
        System.out.println("parent class");
    }

    static void Printa(int a)
    {
 
        System.out.println("parent class");
    }
}

class subclass1 extends Parent {
 
    int y;
    //Method
    void Print() { 
        System.out.println("subclass1"); 
    }
}
 
class subclass2 extends Parent {
    //int z;
 
    // Method
    void Print()
    {
 
        // Print statement
        System.out.println("subclass2");
    }
}
 
class MethodOveride {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        Parent a;

        a = new subclass1();
        a.Print();//subclass1
 
        a = new subclass2();
        a.Print();//subclass2
    }
}
