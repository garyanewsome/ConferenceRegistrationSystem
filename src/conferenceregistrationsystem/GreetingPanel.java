/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conferenceregistrationsystem;

import javax.swing.*;

/**
 *
 * @author Gary
 */
public class GreetingPanel extends JPanel{
  private JLabel greeting;
  
  /**
   * constructor
   */
  public GreetingPanel(){
    // create label
    greeting = new JLabel("Select Registration Options");
    
    // add the label to the panel
    add(greeting);
  }
}
