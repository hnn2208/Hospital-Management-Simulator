public static class Patient {


    int id;
    String name;
    int severity; // it will be 1 low and -10 high
    int age;

    public Patient(int id, String name, int severity, int age) {
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.age = age:
    }

    //we cn add a method here to display the paitent's inf
    public void displayInfo() {
        System.out.println("patient ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Severity: " + severity);
        System.out.println("Age: " + age);
    }
}
// and I will this method (to run the program)
public static void main (String[] args){
    Patient patient1 = new Patient(101, "Huda Mohamed", -8, 25);


    patient1.displayInfo();

    }








