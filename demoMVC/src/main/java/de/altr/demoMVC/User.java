package de.altr.demoMVC;

public class User {
    private Long id;
    private String name;

    private String city;

    private static Long counter=0L;

    public User(String name,  String city) {
        this.id = ++counter;
        this.name = name;
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getCity() {
        return city;
    }
}
