/**
 * Created by jb039k on 6/8/2016.
 */

import java.util.*;

class Checker implements Comparator<Student> {

    @Override
    public int compare(Student a1, Student a2) {

        double score1 = a1.getCgpa();
        double score2 = a2.getCgpa();

        int scoreCmp = Double.compare(score2, score1);
        if (scoreCmp != 0) {
            return scoreCmp;
        }
        else {
            return a1.getFname().compareTo(a2.getFname());
        }
}
}

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class JavaSort
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        Checker checker = new Checker();

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList, checker);
        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
