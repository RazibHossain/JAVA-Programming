class Person{
    String name;
    String city;
    Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return name;
    }
}