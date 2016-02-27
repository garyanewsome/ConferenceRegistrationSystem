/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conferenceregistrationsystem;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author Gary
 */
public class RegPanel extends JPanel{
  // constants for pricing

  public final double GENERAL_REGISTRATION = 895.00;
  public final double STUDENT_REGISTRATION = 495.00;
  public final double KEYNOTE_DINNER = 30.00;

  private JRadioButton generalRegButton;
  private JRadioButton studentRegButton;
  private ButtonGroup bg;
  private JCheckBox keynoteDinnerCkBox;

  /**
   * constructor
   */
  public RegPanel(){
    // create a grid layout
    setLayout(new GridLayout(2, 1));

    // create radio buttons
    generalRegButton = new JRadioButton("General Registration");
    studentRegButton = new JRadioButton("Student Registration");
    keynoteDinnerCkBox = new JCheckBox("Keynote Dinner");
    
    // group the radio buttons
    bg = new ButtonGroup();
    bg.add(generalRegButton);
    bg.add(studentRegButton);

    // add a border around the panel
    setBorder(BorderFactory.createTitledBorder("Registration"));

    // add buttons to the panel
    JPanel panel1 = new JPanel();
    panel1.add(generalRegButton);
    panel1.add(studentRegButton);
    
    JPanel panel2 = new JPanel();
    panel2.add(keynoteDinnerCkBox);
    
    add(panel1);
    add(panel2);
  }


  /**
   * get button group cost
   */
  public double getRegCost() {
    double regCost = 0;
    double keynoteDinner = 0;

    if (generalRegButton.isSelected()) {
      regCost = GENERAL_REGISTRATION;
    } else {
      regCost = STUDENT_REGISTRATION;
    }

    if (keynoteDinnerCkBox.isSelected()) {
      keynoteDinner = KEYNOTE_DINNER;
    }

    return regCost + keynoteDinner;
  }
}

