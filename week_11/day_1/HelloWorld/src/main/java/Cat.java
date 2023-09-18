public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String meow(){
        return "Hello meow";
    }

    public String info(){
        return String.format("Name %s , age %d",this.name,this.age);
    }
}
