import java.io.File;
import java.util.*;

public class ELMS {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // Creating the array for storing all students data
        ArrayList<Student> students = new ArrayList<Student>();

//  Method-1
        // Creating a student object
        Student std_1 = new Student("a", "p", new String[]{"SPL", "APL"});
        students.add(std_1);

//  Method-2
        students.add(new Student("b", "p1", new String[]{"SPL", "Data Structure"}));

        students.add(new Student("c", "p2", new String[]{"Algo", "OS"}));


        while(true){
            System.out.println("***************WELCOME**************");
            System.out.println("Choose operation: ");
            System.out.println("1. Sign In");
            System.out.println("2. Sign UP");
            System.out.println("3. Exit");

            int choice = scan.nextInt();
            scan.nextLine();

            if(choice == 1){
               Student student = logIn(students);

               if(student != null){
                   System.out.println("Hi" + " " + student.userName);

                   for(String course:student.courses){
                       System.out.println(course);
                   }

                   System.out.println("Choose Options: ");
                   System.out.println("1. Logout");
                   int choice2 = scan.nextInt();
                   scan.nextLine();

                   if(choice2==1){
                       continue;
                   }
               }
               else{
                   System.out.println("Invalid username or password!");
               }
            }
            else if(choice == 2){
                signUp(students);
            }
            else if(choice == 3){
                break;
            }
            else{
                System.out.println("Invalid choice!");
            }
        }

    }

    public static Student logIn(ArrayList<Student> students){
        System.out.println("Username: ");
        String userName = scan.nextLine();
        System.out.println("Password: ");
        String password = scan.nextLine();

        Student student = students.stream().filter(i -> i.userName.contains(userName) && i.password.contains(password)).findAny().orElse(null);

        return student;

    }

    public static void signUp(ArrayList<Student> students){

        try{
            File inputData = new File("src/data.txt");
            Scanner reader = new Scanner(inputData);

            while (reader.hasNextLine()){
                String line = reader.nextLine();
                String[] studentData = line.split(";");
                String[] courses = studentData[2].split(",");

                Student student = new Student(studentData[0], studentData[1], courses);
                students.add(student);
            }
            System.out.println("New Student Signed up!");
            for(Student i:students){
                System.out.println(i.userName);
            }

            reader.close();

        }
        catch (Exception e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

}



class Student{
    String userName;
    String password;
    String[] courses;

    public Student(String userName, String password, String[] courses){
        this.userName = userName;
        this.password = password;
        this.courses = courses;
    }
}
