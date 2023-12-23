/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librrarysystem;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Jessuse
 */
public class Book implements Display ,Serializable{
    private String Title;
    private String Genre;
    private String Version;
    protected int No;
    private date date;
    private boolean onLoan;
    private String auther;

    public Book(){}
    
    
    public Book(String Title, String Genre, String Version, int No, date date, String auther) {
        this.Title = Title;
        this.Genre = Genre;
        this.Version = Version;
        this.No = No;
        this.date = date;
        this.auther = auther;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String Version) {
        this.Version = Version;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int No) {
        this.No = No;
    }

    public date getDate() {
        return date;
    }

    public void setDate(date date) {
        this.date = date;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }

    
    
    
    @Override
    public String getInfo() {
        return "Book Title : " + Title + "\nBook Genre: " + Genre + "\nBook Version: " + Version + "\nBook No: " + No + "\nBook date:" + date + "\nBook auther :" + auther ;
    }
    
    @Override
    public boolean inLoan(){
    return false;
    }
    
    
    
}
