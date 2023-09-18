package br.com.exercises.sequential.ages;

public class Age {
    String name;
    int age;

    public Age(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static double calculateAverageAge(Age[] ages) {
        if (ages.length == 0) {
            return 0.0;
        }

        int sumAges = 0;
        for (Age age : ages ) {
            sumAges += age.getAge();
        }
        return (double) sumAges / ages.length;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
