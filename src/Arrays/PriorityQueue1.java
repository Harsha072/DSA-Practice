package Arrays;

import java.util.*;

/*
 * Create the Student and Priorities classes here.
 */
class  Student {
    private int id;
    private  String name;
    private  double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }



    }
class StudentComparator implements Comparator<Student>{



    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getCgpa() != s2.getCgpa())
            return s2.getCgpa() - s1.getCgpa() > 0 ? 1 : -1;
        else{
            if(!s1.getName().equals(s2.getName())) return s1.getName().compareTo(s2.getName());
            else return s1.getId() < s2.getId() ? 1: -1;
        }
    }
}

class Priorities  {

    PriorityQueue <Student> studentList =new PriorityQueue(new StudentComparator()) ;
  public List<Student> getStudents(List<String> events){

      for (String s : events) {

              String[] event = s.split(" ");
              String command = event[0];
              if(command.equals("ENTER")){
                  String name = event[1];
                  double cgpa = Double.parseDouble(event[2]);
                  int id = Integer.parseInt(event[3]);
                  studentList.add(new Student(id, name, cgpa));
              }
              else studentList.poll();
      }


      return new ArrayList<>(studentList);
  }
}

public class PriorityQueue1 {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}