package Arrays;

import java.util.*;

//class Student implements Comparator{
//    private int id;
//    private String fname;
//    private double cgpa;
//
//    public Student(){
//
//    }
//    public Student(int id, String fname, double cgpa) {
//        super();
//        this.id = id;
//        this.fname = fname;
//        this.cgpa = cgpa;
//    }
//    public int getId() {
//        return id;
//    }
//    public String getFname() {
//        return fname;
//    }
//    public double getCgpa() {
//        return cgpa;
//    }
//
//    @Override
//    public int compare(Object o1, Object o2) {
//        return 0;
//    }
//}
//
////Complete the code
//class MyComparator implements Comparator{
//
//    @Override
//    public int compare(Object o1, Object o2) {
//        Student student1 = (Student) o1;
//        Student student2 = (Student) o2;
//        if(student1.getCgpa()<student2.getCgpa()){
//            return 1;
//        } else if (student1.getCgpa()>student2.getCgpa()) {
//            return -1;
//        }
//        else if (student1.getCgpa()==student2.getCgpa()){
//            if(student1.getFname().compareTo(student2.getFname())<0){
//                return -1;
//            } else if (student1.getFname().compareTo(student2.getFname())>0) {
//                return 1;
//            } else if (student1.getFname().compareTo(student2.getFname())==0) {
//                if(student1.getId()<student2.getId()){
//                    return 1;
//                } else if (student1.getId()>student2.getId()) {
//                    return -1;
//                }
//            }
//        }
//        return 0;
//    }
//}
//public class Solution
//{
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());
//
//        List<Student> studentList = new ArrayList<Student>();
//        while(testCases>0){
//            int id = in.nextInt();
//            String fname = in.next();
//            double cgpa = in.nextDouble();
//
//            Student st = new Student(id, fname, cgpa);
//            studentList.add(st);
//
//            testCases--;
//        }
//        Collections.sort(studentList,new MyComparator());
//
//        for(Student st: studentList){
//            System.out.println(st.getFname());
//        }
//    }
//}



