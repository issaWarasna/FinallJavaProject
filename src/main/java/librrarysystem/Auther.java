/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librrarysystem;

/**
 *
 * @author Jessuse
 */
public class Auther {
    private  int ID;
    protected String name;
    private String addres;
    private date bd;

    public Auther(){}

    public Auther(int ID, String name, String addres, date bd) {
        this.ID = ID;
        this.name = name;
        this.addres = addres;
        this.bd = bd;
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

    public date getBd() {
        return bd;
    }

    public void setBd(date bd) {
        this.bd = bd;
    }

    @Override
    public String toString() {
        return "Auther{" + "name=" + name + ", addres=" + addres + ", bd=" + bd + '}';
    } 
}
