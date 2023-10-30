public class Scope {
    public static void main(String[] args) {
        sayHello("Oji");
        sayHello("");
    }

    /**
     *
     * @param name
     */
    static void sayHello(String name){

        String hello = "Hello " + name;

        if(!name.isBlank()){
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        System.out.println(hello); //bisa akses hello karena satu scope
//        System.out.println(hi); //tidak bisa akses soalnya di dalam blok if
    }
}
