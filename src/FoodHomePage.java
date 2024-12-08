/*
*FoodHomePage
*@author Andrew Cleary
*28/11/24
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodHomePage implements ActionListener {

    private static JButton submitButton;
    private static JButton yesButton;
    private static JButton noButton;
    private static JLabel allergyLabel;
    private JCheckBox[] allergyCheckboxes;
    private AllergyDataManager allergyDataManager = new AllergyDataManager();
    private JFrame frame;
    private JPanel panel;
    private boolean allergySelected;
    //public boolean onions, carrots, tomatoes, potatoes, beef, chicken, fish, bread, rice, milk;

    public FoodHomePage() {
        allergySelected = false;
        frame = new JFrame("Allergy selection");
        panel = new JPanel();

        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);

        allergyLabel = new JLabel("Have you any known allergies?");
        allergyLabel.setBounds(10, 10, 200, 20);
        panel.add(allergyLabel);

        yesButton = new JButton("Yes");
        yesButton.setBounds(10, 50, 100, 20);
        yesButton.addActionListener(this);
        panel.add(yesButton);

        noButton = new JButton("No");
        noButton.setBounds(120, 50, 100, 20);
        noButton.addActionListener(this);
        panel.add(noButton);

        frame.setVisible(true);
    }

    private void allergies() {
        if(allergySelected == false) {
            allergySelected = true;
            JPanel checkboxPanel = new JPanel(); // Create a new panel for the checkboxes
            checkboxPanel.setLayout(new FlowLayout()); //Set layout for the checkbox panel

            String[] ingredients = {"onions", "carrots", "tomatoes", "potatoes", "beef", "chicken", "fish", "bread", "rice", "milk"};

            allergyCheckboxes = new JCheckBox[ingredients.length];

            for (int i = 0; i < ingredients.length; i++) {
                JCheckBox checkbox = new JCheckBox(ingredients[i]);//this should create box for each ingredient
                allergyCheckboxes[i] = checkbox;// puts in array
                checkboxPanel.add(checkbox);
            }

            //for (String vegetable : ingredients) {
            //    JCheckBox checkBox = new JCheckBox(vegetable);
            //    checkboxPanel.add(checkBox);
            //}

            panel.add(checkboxPanel); //checkbox panel to the main
            panel.revalidate(); //refresh
            panel.repaint(); //shows changes

            submitButton = new JButton("submit");
            submitButton.addActionListener(this);
            panel.add(submitButton);
            submitButton.setBounds(10, -50, 100, 20);

        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(yesButton)) {
            System.out.println("They have allergies");
            allergies();
        } else if (e.getSource().equals(noButton)) {
            System.out.println("They have no allergies");
            frame.dispose();
            Scaling scaling = new Scaling(allergyDataManager.getAllergyCheckboxes());
        } else if (e.getSource().equals(submitButton)) {
            if(allergyCheckboxes != null){
                for(int i = 0; i < allergyCheckboxes.length; i++){
                    allergyDataManager.getAllergyCheckboxes()[i] = allergyCheckboxes[i].isSelected();
                }
            }
            for (JCheckBox checkbox : allergyCheckboxes) {
                if(checkbox.isSelected()) {
                System.out.println(checkbox.getText() + " allergy noted");
                }else{
                    System.out.println("Not allergic to " + checkbox.getText());
                }
            }
            System.out.println("Submitted allergy info");
            frame.dispose();
            Scaling scaling = new Scaling(allergyDataManager.getAllergyCheckboxes());
        }
    }
}
