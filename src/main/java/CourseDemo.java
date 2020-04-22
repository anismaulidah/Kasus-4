/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anis Maulidah
 */
public class CourseDemo {
    public static void main(String[]args){
        Instructor myInstructor = new Instructor("Maulidah", "Anis", "BTY1606");
        TextBook myTextBook = new TextBook("Buku Latihan Soal (Mantappu Jiwa)", "Jerome Polin","Gramedia");
        Course myCourse = new Course("Matematika SMA", myInstructor,myTextBook);
        System.out.println(myCourse);
    }
}
