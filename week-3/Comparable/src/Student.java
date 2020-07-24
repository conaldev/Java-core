public class Student implements Comparable<Student> {
    private int score;
    private String name;
    private int age;
    private String address;

    public Student(Integer score, String name, int age, String address) {
        this.score = score;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        if(this.getName().compareTo(student.getName())!=0)
            return this.getName().compareTo(student.getName());
        else
            return this.getScore().compareTo(student.getScore());
    }
}