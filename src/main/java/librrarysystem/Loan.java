/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librrarysystem;

import Peopole.Student;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import static librrarysystem.addBook.book;
import static librrarysystem.addStudent.student;
import static librrarysystem.loanbook.loan;

/**
 *
 * @author Jessuse
 */
public class Loan extends javax.swing.JFrame {
   public static ArrayList <Student>loaneds=new ArrayList<>();
   private static final int MAX_BOOKS_ALLOWED = 3;
   
   public static ArrayList<Book> loaned =new ArrayList<>();
   
    public void getObjectFromFile() {
        try {
            FileInputStream file = new FileInputStream("Bookfile.txt");
            ObjectInputStream inputfile = new ObjectInputStream(file);
            boolean endOfFile = false;
            while (!endOfFile) {
                try {
                    book.add((Book) inputfile.readObject());
                } catch (EOFException ex) {
                    endOfFile = true;
                } catch (IOException | ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
            inputfile.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    }
    
    public void getObjectFromFile1() {
        try {
            FileInputStream file = new FileInputStream("Studentfile.txt");
            ObjectInputStream inputfile = new ObjectInputStream(file);
            boolean endOfFile = false;
            while (!endOfFile) {
                try {
                    student.add((Student) inputfile.readObject());
                } catch (EOFException ex) {
                    endOfFile = true;
                } catch (IOException | ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
            inputfile.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("iiiiiiiiiii");
        }
    }
    
    

    /**
     * 
     * Creates new form Loan
     * 
     */
    public Loan() {
        initComponents();
        getObjectFromFile();
        getObjectFromFile1();
    }
    
    
    
   public boolean found ;
    public boolean searchByNO(int NO) {
        for (Book book : addBook.book) {
            if (book.getNo() == NO) {
                System.out.println("Book found: " );
             return found =true;
            }

        }
        return found=false;
    }
    
    public boolean found1 ;
    public boolean searchByID(int ID) {
        for (Student student : addStudent.student) {
            if (student.getID() == ID) {
                System.out.println("the student already  registered " );
             return found1 =true;
            }

        }
        return found1=false;
    }
    
    

    public boolean canloan1=false;
    public boolean SearchBookLoaned1(int ID) {
         for (Student loan : loaneds) {
            if (loan.getID() == ID){
                if(loan.getLoaneds().size()<=3){
               return  canloan1=true;
                }
            
            }
       
         } return canloan1=false;
    }
    
    
    
    
    
    public boolean canloan2=false;
    public boolean SearchBookLoaned(int ID) {
        for (loaned loan : loanbook.loan) {
            if (loan.getStudid() == ID){
                if(loanbook.loan.size()<=3){
               return  canloan2=true;
                }
            
          
            }
                
                
            }
       return canloan2=false;
        
    }  
    
    public boolean loanBook(Book book) {
    if (loaneds.size() < MAX_BOOKS_ALLOWED && !book.inLoan()) {
      
      book.setOnLoan(true);
        System.out.println("book loaned succefully");
      return true;
    } else {
        System.out.println("not");
      return false;
    }
  }
    
    public boolean canLoanBooks(int studentID) {
    int count = 0; 
    for (Student loan : loaneds) {
        if (loan.getID() == studentID) {
            count = loan.getLoaneds().size(); // Get the number of books currently loaned by the student
            break; // Break the loop after finding the student
        }
    }
    return count < 3;
}

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        idsearchButton = new javax.swing.JButton();
        loanbookButton = new javax.swing.JButton();

        setTitle("Check Window");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jTextField1.setBackground(new java.awt.Color(204, 255, 204));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setText("search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("please enter the book No ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("please enter the student id ");

        idTextField.setBackground(new java.awt.Color(204, 255, 204));
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        idsearchButton.setBackground(new java.awt.Color(204, 255, 204));
        idsearchButton.setText("search");
        idsearchButton.setEnabled(false);
        idsearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idsearchButtonActionPerformed(evt);
            }
        });

        loanbookButton.setBackground(new java.awt.Color(204, 255, 204));
        loanbookButton.setText("loan book");
        loanbookButton.setEnabled(false);
        loanbookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanbookButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jButton1))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idsearchButton)))
                .addContainerGap(308, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loanbookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(67, 67, 67)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idsearchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(loanbookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:System.exit(0);
        int no=0;
        try{ no = Integer.parseInt(jTextField1.getText());}
        catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(this, ex);
        }
        searchByNO(no);
        
        if(!found){
        JOptionPane.showMessageDialog(this, "sorry we dont have this book in the Library :(");
         this.dispose();
        
        }else{
        JOptionPane.showMessageDialog(this, " we  have this book in the Library :)");
        idsearchButton.setEnabled(true);
        
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void idsearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idsearchButtonActionPerformed
        // TODO add your handling code here:
        int id=0;
        try{ id=Integer.parseInt(idTextField.getText());}
        catch(NumberFormatException ex){
        JOptionPane.showInternalMessageDialog(this, ex);
        }
        searchByID(id);
         if(!found1){
        JOptionPane.showMessageDialog(this, "sorry this student not registred\nplease registred it first");
         this.dispose();
        
        }else{
             if(!canLoanBooks(id)){
         JOptionPane.showMessageDialog(this, " this student cannot take more books because he... ");
            this.dispose();

             }else{
              JOptionPane.showMessageDialog(this,"this student can loan book\nso please move to next page");
             loanbookButton.setEnabled(true);
             
             }
         
         }
        
    }//GEN-LAST:event_idsearchButtonActionPerformed

    private void loanbookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanbookButtonActionPerformed
        // TODO add your handling code here:
                  
        new loanbook().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_loanbookButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idTextField;
    private javax.swing.JButton idsearchButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton loanbookButton;
    // End of variables declaration//GEN-END:variables
}