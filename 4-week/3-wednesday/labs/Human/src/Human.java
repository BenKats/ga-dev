public class Human {
    private int id;
    private String name;
    private String address;

    public Human() { }

    public Human(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public int getId(){
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Human casey = new Human();
        casey.setName("Casey");
        casey.setId(1);
        casey.setAddress("123 Main St, California");

        Human Suresh = new Human();
        Suresh.setName("Suresh");
        Suresh.setId(2);
        Suresh.setAddress("123 Main St, New York");

        Human Ben = new Human(3, "Ben", "New York");

    }
}
