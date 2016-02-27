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
public class WorkshopPanel extends JPanel {

  private JList workshopJList;

  private String[] workshops = {"Introduction to E-Commerce",
    "The Future of the Web", "Advanced Java Programming", "Network Security"};

  double workshopsCost = 0;

  public WorkshopPanel() {

    workshopJList = new JList(workshops);

    setLayout(new FlowLayout());

   // add a border around the panel
   setBorder(BorderFactory.createTitledBorder("Workshops"));
   
    JPanel panel1 = new JPanel();
    panel1.add(workshopJList);
    add(panel1);
  }


   
  public double getWorkshopCost() {
    workshopsCost = 0;

    int[] selections = workshopJList.getSelectedIndices();
    for (int i = 0; i < selections.length; i++) {
      if (selections[i] == 0 || selections[i] == 1) {
        workshopsCost += 295.00;
      } else if (selections[i] == 2 || selections[i] == 3) {
        workshopsCost += 395.00;
      } else {
        workshopsCost += 0;
      }
    }
    return workshopsCost;
  }
}
