class Student {
    String name;
    int rollNum;
    String course;
    static int count=1;
    Student(String s){
        name=s;
        rollNum=count++;
    }   
    Student(String s,String c){
        this(s);
        course=c;
    }
    void displayDetails(){
        System.out.println("Name "+this.name);
        System.out.println("Rollnum "+this.rollNum);
        System.out.println("Course= "+course);
    }
}
class Test2{
    public static void main(String[] args) {
        Student s1=new Student("Rakesh");
        Student s2=new Student("Nikhil");
        s1.course="java";
        s2.course="C++";
        s1.displayDetails();
        s2.displayDetails();
        Student s3=new Student("Ritesh", "Java");
        s3.displayDetails();
    }
}
