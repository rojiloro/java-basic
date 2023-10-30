public class MethodParamater {
    public static void main(String[] args) {
        sayHello("Mohammad", "Fatkhuroji");
        sayHello("Bambang", "pamungkas");
        sayHello("joko", "santoso");
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello "+ firstName + " " + lastName);
    }
}
