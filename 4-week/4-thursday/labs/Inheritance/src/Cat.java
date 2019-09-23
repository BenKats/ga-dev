public class Cat {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasWhiskers(){
        return true;
    }

    protected String favoriteSnack(){
        return "Mice";
    }

    public int numLives(){
        return 9;
    }
}

//extends says hey you have everything that is NOT PRIVATE, this includes protected methods
class Lion extends Cat{
    @Override
    public int numLives(){
        return 1;
    }

}