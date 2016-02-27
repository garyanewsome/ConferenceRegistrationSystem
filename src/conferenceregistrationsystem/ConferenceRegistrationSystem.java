/*
 * Gary A. Newsome
 * CPT 213_WA Java Programming II
 * Westmoreland County Community College
 * Janet Powell
 */
package conferenceregistrationsystem;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 * ConferenceRegstrationSystem
 *
 * @author garyanewsome
 */
public class ConferenceRegistrationSystem extends JFrame {

  private GreetingPanel banner;
  private RegPanel reg;
  private WorkshopPanel wksp;

  private JPanel buttonPanel;
  private JButton exitButton;
  private JButton calcButton;

  double total = 0;

  public ConferenceRegistrationSystem() {

    // set the title
    setTitle("Conference Registration System");

    // specify what happens when the close button is clicked
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // set layout type
    setLayout(new BorderLayout());

    // build the panel and add it to the frame
    buildPanel();

    // display the window
    pack();
    setVisible(true);
  }

  /**
   * the buildPanel method adds a label, a text field, and a button to a panel
   */
  private void buildPanel() {

    // create panels
    banner = new GreetingPanel();
    reg = new RegPanel();
    wksp = new WorkshopPanel();

    // create the button panel
    buildButtonPanel();

    // add items to panels
    add(banner, BorderLayout.NORTH);
    add(reg, BorderLayout.WEST);
    add(wksp, BorderLayout.EAST);
    add(buttonPanel, BorderLayout.SOUTH);

  }

  private void buildButtonPanel() {
    // create panel for the buttons
    buttonPanel = new JPanel();

    // create the buttons
    calcButton = new JButton("Calculate Charges");
    exitButton = new JButton("Exit");

    // add an action listener to the button
    calcButton.addActionListener(new CalcButtonListener());
    exitButton.addActionListener(new ExitButtonListener());

    // add the buttons to the button panel
    buttonPanel.add(calcButton);
    buttonPanel.add(exitButton);
  }

  /**
   * CalcButtonListener is an action listener class for the Calculate Button
   */
  private class CalcButtonListener implements ActionListener {

    /**
     * the actionPerformed method executes when the user clicks on the calculate
     * button
     *
     * @param e The event object
     */
    @Override
    public void actionPerformed(ActionEvent e) {
      total = reg.getRegCost() + wksp.getWorkshopCost();
      JOptionPane.showMessageDialog(null, String.format("Your total bill is "
              + "$%.2f", total));

    }
  }

  /**
   * ExitButtonListener is an action listener class for the exit Button
   */
  private class ExitButtonListener implements ActionListener {

    /**
     * the actionPerformed method executes when the user clicks on the
     * resetButton
     *
     * @param e The event object
     */
    @Override
    public void actionPerformed(ActionEvent e) {
      System.exit(0);
    }
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    new ConferenceRegistrationSystem();
  }

}
