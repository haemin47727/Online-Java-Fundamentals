package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 * <p>
 * 1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a separate class.
 * 2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 * of this enum from a separate class.
 */


enum Department {
    CARDIOLOGY, NEUROLOGY, PEDIATRICS, ONCOLOGY, RADIOLOGY
}

enum MedicalSpecialist {
    CARDIOLOGIST("Heart", 12), NEUROLOGIST("Brain", 15), PEDIATRICIAN("Children", 10), ONCOLOGIST("Cancer", 18);

    private final String specialtyArea;
    private final int yearsOfExperience;

    MedicalSpecialist(String specialtyArea, int yearsOfExperience) {
        this.specialtyArea = specialtyArea;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getSpecialtyArea() {
        return specialtyArea;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
}

class DepartmentController {
    public void printAllDepartments() {
        System.out.println("Available Hospital Departments:");
        for (Department dept : Department.values()) {
            System.out.println("- " + dept);
        }
    }

    public void checkDepartment(Department dept) {
        switch (dept) {
            case CARDIOLOGY:
                System.out.println("Cardiology deals with heart-related issues.");
                break;
            case NEUROLOGY:
                System.out.println("Neurology focuses on brain and nervous system.");
                break;
            default:
                System.out.println("General department: " + dept);
        }
    }
}

public class Exercise_01 {
    public static void main(String[] args) {
        DepartmentController controller = new DepartmentController();
        controller.printAllDepartments();
        controller.checkDepartment(Department.NEUROLOGY);
        SpecialistController controllerr = new SpecialistController();
        controllerr.displaySpecialistInfo(MedicalSpecialist.ONCOLOGIST);
    }
}

class SpecialistController {
    public void displaySpecialistInfo(MedicalSpecialist specialist) {
        System.out.println("Specialist: " + specialist);
        System.out.println("Area of Expertise: " + specialist.getSpecialtyArea());
        System.out.println("Years of Experience: " + specialist.getYearsOfExperience());
    }
}