package aug.ex_11082024.StaticKeyword;

public class Lab193 {
    //Static
    //block
    //Data member
    //Function
    //Class
    public static void main(String[] args) {
        ATB student1 = new ATB("Naga");
        System.out.println(student1.getStudentName());
        System.out.println(ATB.courseName);
        ATB.doAssignment();

        ATB student2 = new ATB("Rajan");
        System.out.println(student2.getStudentName());
        System.out.println(ATB.courseName);
        ATB.doAssignment();
    }
}

class ATB {
    private String studentName;
    static String courseName = "ATB Selenium";

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ATB(String studentName) {
        this.studentName = studentName;
    }
    static void doAssignment(){
        System.out.println("Do Assignment");
    }
}