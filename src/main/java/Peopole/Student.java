/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Peopole;

import java.io.Serializable;
import java.util.ArrayList;
import librrarysystem.Book;
/**
 *
 * @author Jessuse
 */
public class Student implements Serializable{
    private  int ID;
    private String name;
    private String addres;
    private String Major;
    private BirthDate bd;
    private ArrayList<Book> loaned;
    private ArrayList<Student> loaneds;
   
    private static final int MAX_BOOKS_ALLOWED = 3;
    public Student(){}
    
    
    
    public Student(int ID, String name, String addres, String Major, BirthDate bd) {
        this.ID = ID;
        this.name = name;
        this.addres = addres;
        this.Major = Major;
        this.bd = bd;
        this.loaned = new ArrayList<>();
        this.loaneds = new ArrayList<>();
       
    }



    public ArrayList<Book> getLoaned() {
        return loaned;
    }

     
    public ArrayList<Student> getLoaneds() {
        return loaneds;
    }
    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    public BirthDate getBd() {
        return bd;
    }

    public void setBd(BirthDate bd) {
        this.bd = bd;
    }

    
    public String getInfo() {
        return "Student ID :" + ID + "\nStudentname=" + name + "\nStudent addres : " + addres + "\nStudent Major : " + Major + "\nStudent bd : " + bd ;
    }
    
//    public boolean loanBook(Book book) {
//    if (loaneds.size() < MAX_BOOKS_ALLOWED && !book.inLoan()) {
//      loaned.add(book);
//      book.setOnLoan(true);
//        System.out.println("book loaned succefully");
//      return true;
//    } else {
//        System.out.println("not");
//      return false;
//    }
//  }
  

    
}
