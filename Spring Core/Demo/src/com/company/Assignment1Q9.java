package com.company;

import java.util.ArrayList;
import java.util.Scanner;
class Student {
    private int subjectA,subjectB,subjectC;

    public Student(){}

    public Student(int subjectA, int subjectB, int subjectC) {
        this.subjectA = subjectA;
        this.subjectB = subjectB;
        this.subjectC = subjectC;
    }

    public int studentsTotalMarksInAllSubjects(Student[] students) {
        int total = 0;
        for(Student s : students){
            total += s.subjectA+s.subjectC+s.subjectB;
        }
        return total;
    }

    public double studentsAverageMarksInAllSubjects(Student[] students) {
        int total = 0;
        for(Student s : students){
            total += s.subjectA+s.subjectC+s.subjectB;
        }
        return total/3.0;
    }

    public double subjectAverageByStudents(int[] marks){
        int total = 0;
        for(Integer i : marks){
            total += i;
        }
        return total/(double)marks.length;
    }

    public int subjectTotalByStudents(int[] marks){
        int total = 0;
        for (Integer i : marks){
            total += i;
        }
        return total;
    }

    public int[] subjectWiseMarks(Student[] students,String subjectName){
        int[] marks = new int[students.length];
        for(int i = 0; i < students.length; i++){
            int total = 0;
            for(Student s : students){
                if(i == 0){
                    total += s.subjectA;
                }else if(i == 1){
                    total += s.subjectB;
                }else{
                    total += s.subjectC;
                }
            }
            marks[i] = total;
        }
        return marks;
    }
    public int subjectATotalByStudents(int[] marks) {
        int total = 0;
        for(Integer i : marks){
            total += i;
        }
        return total;
    }
    public int subjectBTotalByStudents(int[] marks) {
        int total = 0;
        for(Integer i : marks){
            total += i;
        }
        return total;
    }
    public int subjectCTotalByStudents(int[] marks) {
        int total = 0;
        for(Integer i : marks){
            total += i;
        }
        return total;
    }

//    public int subjectTotalByStudents(int[] marks)

    public double subjectAAverageByStudents(int[] marks) {
        int total = 0;
        for(Integer i : marks){
            total += i;
        }
        return total/3.0;
    }
    public double subjectBAverageByStudents(int[] marks) {
        int total = 0;
        for(Integer i : marks){
            total += i;
        }
        return total/3.0;
    }
    public double subjectCAverageByStudents(int[] marks) {
        int total = 0;
        for(Integer i : marks){
            total += i;
        }
        return total/3.0;
    }

}

public class Assignment1Q9 {

    public static void main(String[] args) {
        Student obj = new Student();
        int[] marks = new int[]{1,2,3};
        System.out.println(obj.subjectAverageByStudents(marks));
    }
}