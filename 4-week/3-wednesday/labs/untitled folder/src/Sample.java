public class Sample {
    private int id;
    private String name;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        Sample casey = new Sample();
        casey.setName("Casey");
        System.out.println(casey.getName());
        casey.setName("Suresh");
        System.out.println(casey.getName());
    }
}
