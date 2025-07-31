package labs_examples.input_output.labs;

public class Student {
    int age;
    String firstName;
    String lastName;
    String grade;

    public Student(){
    }
    public Student(int age , String firstName , String lastName , String grade){
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGrade() {
        return grade;
    }
}
