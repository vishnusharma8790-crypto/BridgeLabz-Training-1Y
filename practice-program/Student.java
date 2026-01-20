class Student {
int id;
String name;
int age;
void displayDetails(){
String Status = "Active";
System.out.println("id: " +id);
System.out.println("Name:" +name);
 System.out.println("Age:" +age );
 System.out.println("Status: " +Status);
}
public static void main(String[] args){
Student s1 = new Student();
s1.id = 71;
s1.name = "Vishnu Sharma ";
s1.age = 19;
s1.displayDetails();
}
} 
  