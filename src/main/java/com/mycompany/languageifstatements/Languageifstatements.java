/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.languageifstatements;
import javax.swing.JOptionPane;

public class Languageifstatements {

    public static void main(String[] args) {
      char option = JOptionPane.showInputDialog("Choose your language\n" +
              "A.    Afrikaans\n" +
              "E.    English\n "  +
              "Z.     Zulu\n" +
              "X.     Exit\n").toUpperCase().charAt(0);
      
      if( option == 'A')
          JOptionPane.showMessageDialog(null, "Goeie Dag");
      else
          if (option == 'E')
              JOptionPane.showMessageDialog(null, "Good day");
      else
         if (option == 'Z')
             JOptionPane.showMessageDialog(null, "Sawbona");
      else
                JOptionPane.showMessageDialog(null, "Goodbye");
              
    
    }
}
