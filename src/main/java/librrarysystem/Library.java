/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librrarysystem;

import Peopole.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jessuse
 */
public class Library implements Serializable{

    private ArrayList<Book> books;
    private ArrayList<Student> students;
    Scanner input = new Scanner(System.in);
    Scanner in = new Scanner(System.in);
    Student s = new Student();
    private Book book;
    private Student student;
    private LocalDate dueDate;
    private static final int MAX_BOOKS_ALLOWED = 3;
  
    public Library() {
        books = new ArrayList<>();
        students = new ArrayList<>();
    }
    
    public void addBook(Book book) {
        books.add(book);
    }

    public void addStudent(){
        System.out.println("enter the student id");
        int ID=in.nextInt();
        System.out.println("enter the student name");
        String name=in.nextLine();
        System.out.println("enter the student addres");
        String addres=in.nextLine();
        System.out.println("enter the student major");
        String major=in.nextLine();
        int day1 = in.nextInt();
        int month1 = in.nextInt();
        int year1 = in.nextInt();
        BirthDate bd = new BirthDate(day1,month1,year1);
        Student std = new Student(ID,name,addres,major,bd);
        students.add(std);
    }
    
    public void searchByTitle(String Title) {
        for (Book book : books) {
            if (book.getTitle().equals(Title)) {
                System.out.println("Book found: " + book.getInfo());
            }
        }
        System.out.println("Book not found");
    }

    public void searchByAutherName(String name) {
        for (Book book : books) {
            if (book.getAuther().equalsIgnoreCase(name)) {
                System.out.println("Book found: " + book.getInfo());

            } else {
                System.out.println("Book not found.");

            }
        }

    }

    public void searchByNO(int NO) {
        for (Book book : books) {
            if (book.getNo() == NO) {
                System.out.println("Book found: " + book.getInfo());
            }
        }
        System.out.println("Book not found");

    }

    
    public Book searchByNo(int no) {
        for (Book book : books) {
            if (book.getNo() == no) {
                return book;
            }
        }
        return null;
    }

    ///
    public void cheackBook() {

        for (Student student : students) {
            System.out.println(student.getName() + " has loaned " + student.getLoaned().size() + " books:");
        }
        for (Book book : books) {
            //System.out.println("book are :");
            System.out.println(book.getInfo());

        }

    }

    public void book() {
        System.out.println(" The Book informations :");
        // Book information
        System.out.println("Enter the book Title :");
        String Title = in.nextLine();
        System.out.println("Enter the book Genre :");
        String Genere = in.nextLine();
        System.out.println("Enter the book Version :");
        String Version = in.nextLine();
        System.out.println("Enter the book Number :");
        int No = in.nextInt();
        System.out.println("Enter the book Date dd/mm/yyyy :");
        int day = in.nextInt();
        int month = in.nextInt();
        int year = in.nextInt();
        date d = new date(day, month, year);

        // Author information
        System.out.println("   Enter the book Atuher ");
        System.out.println("Enter the Auther name");
        in.nextLine();

        String names = in.nextLine();

        Book book1 = new Book(Title, Genere, Version, No, d, names);

        addBook(book1);

    }

    public void Library() {
        Scanner in = new Scanner(System.in);

        String menue = "1:Loan book\n"
                + "2:search by the Book Title\n"
                + "3:search by the Book Number\n"
                + "4:search by the Book Auther name\n"
                + "5: cheak book loan\n"
                + "6:exit";

        do {
            System.out.println(menue);

            int choice;
            System.out.println("Enter your operation :");
            choice = in.nextInt();
            String Title = in.nextLine();

            switch (choice) {
                case 1:
                    book();
                    addStudent();
                    break;

                case 2:
                    System.out.println("enter the Title of the book :");

                    Title = in.nextLine();

                    searchByTitle(Title);

                    break;

                case 3:

                    System.out.println("enter the Number of the book:");
                    int No = in.nextInt();

                    searchByNO(No);

                    break;

                case 4:
                    System.out.println("Enter the name of auther");
                    //in.nextLine();

                    String names = in.nextLine();

                    searchByAutherName(names);
                    break;

                case 5:
                    cheackBook();
                    break;

                case 6:
                    System.exit(0);
                    break;

                default:
                    System.out.println("the operation not availble");

            }// the switch case

        } while (true);

    }

}
