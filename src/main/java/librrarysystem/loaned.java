/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librrarysystem;
import Peopole.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Jessuse
 */
public class loaned {
    private int bookno;
    private int studid;
    private String studname;
    private String bookname;

    public loaned(int bookno, int studid, String studname ,String bookname) {
        this.bookno = bookno;
        this.studid = studid;
        this.studname = studname;
        this.bookname=bookname;
    }

    public int getBookno() {
        return bookno;
    }

    public void setBookno(int bookno) {
        this.bookno = bookno;
    }

    public int getStudid() {
        return studid;
    }

    public void setStudid(int studid) {
        this.studid = studid;
    }

    public String getStudname() {
        return studname;
    }

    public void setStudname(String studname) {
        this.studname = studname;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
//LocalDate
    
    public String checkdays1(){
     LocalDate currentDate = LocalDate.now();
      return "you should return it in "+currentDate.plusDays(5);
    
    
    }
   
    @Override
    public String toString() {
        return studname+" with " +studid+ " ID" +" has loaned "+bookname+" and No "+bookno;
    }

   
    
    
    
    
    
    
    
}
