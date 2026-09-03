interface Animal {
    void sound();
    
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class cat implements Animal{
    public void sound(){
        System.out.println("cat meoww");
    }
}

public class question6 {
      public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        cat c= new cat();
        c.sound();
    }
}
