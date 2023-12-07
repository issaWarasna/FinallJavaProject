/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librrarysystem;

/**
 *
 * @author Jessuse
 */
public class Journals extends Book{
    private String conferenceName;
    private int conferenceNumber;

    public Journals(String conferenceName, int conferenceNumber, String Title, String Genre, String Version, int No, librrarysystem.date date, String auther) {
        super(Title, Genre, Version, No, date, auther);
        this.conferenceName = conferenceName;
        this.conferenceNumber = conferenceNumber;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public int getConferenceNumber() {
        return conferenceNumber;
    }

    public void setConferenceNumber(int conferenceNumber) {
        this.conferenceNumber = conferenceNumber;
    }

    @Override
    public String getInfo() {
        return "Journals{" + "conferenceName=" + conferenceName + ", conferenceNumber=" + conferenceNumber + '}';
    }
    
    @Override
    public boolean inLoan(){
    return false;
    }
    
    
    
}
