/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librrarysystem;

/**
 *
 * @author Jessuse
 */
public class Magazien extends Book{
     private int issueNumber;
    private date releaseDate;
    private boolean onLoan;

    public Magazien(int issueNumber, librrarysystem.date releaseDate, String Title, String Genre, String Version, int No, librrarysystem.date date, String auther) {
        super(Title, Genre, Version, No, date, auther);
        this.issueNumber = issueNumber;
        this.releaseDate = releaseDate;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public librrarysystem.date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(librrarysystem.date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String getInfo() {
        return "Magazien{" + "issueNumber=" + issueNumber + ", releaseDate=" + releaseDate + '}';
    }
    
    @Override
    public boolean inLoan(){
    return false;
    }
    
    
}
