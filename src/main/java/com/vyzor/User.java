package com.vyzor;

public class User {
    String name;
    int value;
    String city;

    static int stats;

    public class Car {
        String brand;

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public Car() {
        }

        public Car(String brand) {
            this.brand = brand;
        }
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getCity() {
        return city;
    }

    public User() {
    }

    public static void setStats(int stats) {
        User.stats = stats;
    }

    void setCity(String city) {
        this.city = city;
    }

    public static int getStats() {
        return stats;
    }

    User(String name, int value, String city) {
        this.name = name;
        this.value = value;
        this.city = city;
    }

    public static void staticMethod() {
        int staticInt = 21;
        String staticString = "hamza";
        stats = 22;
    }
}
