public class Person {
    private String name;

    Person(String name){
        this.name = name;
    }

    public void sayHelloWorld(){
        System.out.println(name + " said \"Hello World!\"");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
