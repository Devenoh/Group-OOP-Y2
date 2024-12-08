/*
 *Scaling
 *@author Andrew Cleary
 *1/12/24
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Scaling implements ActionListener{
    private int onions;
    private int carrots;
    private int tomatoes;
    private int potatoes;
    private int beef;
    private int chicken;
    private int fish;
    private int bread;
    private int rice;
    private int milk;
    private int multiplier;
    private JButton submitButton;
    String[] ingredients = {"onions", "carrots", "tomatoes", "potatoes", "beef", "chicken", "fish", "bread", "rice", "milk"};

    private boolean[] allergyCheckboxes;


    JFrame frame = new JFrame();
    JLabel titleLabel = new JLabel("Scaling!");
    JLabel ingredientsLabel = new JLabel("Enter Ingredients of meal and number of meals needed");
    JLabel ingredientsBigLabel = new JLabel("Onions      Carrots   Tomatoes  Potatoes       Beef       Chicken        Fish          Bread         Rice           Milk                          Number of meals:");
    JTextField onionsTextField = new JTextField("0");
    JTextField carrotsTextField = new JTextField("0");
    JTextField tomatoesTextField = new JTextField("0");
    JTextField potatoesTextField = new JTextField("0");
    JTextField beefTextField = new JTextField("0");
    JTextField chickenTextField = new JTextField("0");
    JTextField fishTextField = new JTextField("0");
    JTextField breadTextField = new JTextField("0");
    JTextField riceTextField = new JTextField("0");
    JTextField milkTextField = new JTextField("0");
    JTextField multiplierTextField = new JTextField("0");


    Integer textFieldsStartX = 26;
    Integer textFieldsStartY = 140;
    Integer textFieldsWidth = 30;
    Integer textFieldsHeight = 20;
    Integer textFieldsSpacing = 30;


    public Scaling(boolean[] allergyArray) {
        onions = 0;
        carrots = 0;
        tomatoes = 0;
        potatoes = 0;
        beef = 0;
        chicken = 0;
        fish = 0;
        bread = 0;
        rice = 0;
        milk = 0;
        multiplier = 0;
        allergyCheckboxes = allergyArray;

        titleLabel.setBounds(280, 20, 200, 40);
        titleLabel.setFont(new Font("Dialog", Font.BOLD, 36));
        frame.add(titleLabel);

        ingredientsLabel.setBounds(200, 80, 450, 40);
        frame.add(ingredientsLabel);

        ingredientsBigLabel.setBounds(20, 100, 2000, 40);
        frame.add(ingredientsBigLabel);

        onionsTextField.setBounds(textFieldsStartX, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        onionsTextField.addActionListener((ActionListener) this);
        frame.add(onionsTextField);

        carrotsTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth), textFieldsStartY, textFieldsWidth, textFieldsHeight);
        carrotsTextField.addActionListener((ActionListener) this);
        frame.add(carrotsTextField);

        tomatoesTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 2, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        tomatoesTextField.addActionListener((ActionListener) this);
        frame.add(tomatoesTextField);

        potatoesTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 3, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        potatoesTextField.addActionListener((ActionListener) this);
        frame.add(potatoesTextField);

        beefTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 4, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        beefTextField.addActionListener((ActionListener) this);
        frame.add(beefTextField);

        chickenTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 5, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        chickenTextField.addActionListener((ActionListener) this);
        frame.add(chickenTextField);

        fishTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 6, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        fishTextField.addActionListener((ActionListener) this);
        frame.add(fishTextField);

        breadTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 7, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        breadTextField.addActionListener((ActionListener) this);
        frame.add(breadTextField);

        riceTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 8, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        riceTextField.addActionListener((ActionListener) this);
        frame.add(riceTextField);

        milkTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 9, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        milkTextField.addActionListener((ActionListener) this);
        frame.add(milkTextField);

        multiplierTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 11, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        multiplierTextField.addActionListener((ActionListener) this);
        frame.add(multiplierTextField);

        submitButton = new JButton("Submit");
        submitButton.setBounds(720, 140, 100, 20);
        submitButton.addActionListener(this); // Attach the ActionListener
        frame.add(submitButton);

        frame.setTitle("Scaling");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(860, 600);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize(); //This makes the window appear directly in the middle of the screen
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);

        frame.setLayout(null);
        frame.setVisible(true);

        for(int i = 0; i < allergyCheckboxes.length; i++) {
            if(allergyCheckboxes[i]) {
                JOptionPane.showMessageDialog(null, "This user is allergic to: " +ingredients[i]+ " DO NOT USE THESE!");
            }else{
                JOptionPane.showMessageDialog(null, "This user isn't allergic to: " +ingredients[i]+" You may use these.");
            }

        }

    }

    public void Compute() {

        onions = onions * multiplier;
        carrots = carrots * multiplier;
        tomatoes = tomatoes * multiplier;
        potatoes = potatoes * multiplier;
        beef = beef * multiplier;
        chicken = chicken * multiplier;
        fish = fish * multiplier;
        bread = bread * multiplier;
        rice = rice * multiplier;
        milk = milk * multiplier;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(submitButton)) {
            try {
                //get numbers from text fields
                onions = Integer.parseInt(onionsTextField.getText());
                carrots = Integer.parseInt(carrotsTextField.getText());
                tomatoes = Integer.parseInt(tomatoesTextField.getText());
                potatoes = Integer.parseInt(potatoesTextField.getText());
                beef = Integer.parseInt(beefTextField.getText());
                chicken = Integer.parseInt(chickenTextField.getText());
                fish = Integer.parseInt(fishTextField.getText());
                bread = Integer.parseInt(breadTextField.getText());
                rice = Integer.parseInt(riceTextField.getText());
                milk = Integer.parseInt(milkTextField.getText());
                multiplier = Integer.parseInt(multiplierTextField.getText());

                //do the multiply
                Compute();

                //Updates text
                onionsTextField.setText(String.valueOf(onions));
                carrotsTextField.setText(String.valueOf(carrots));
                tomatoesTextField.setText(String.valueOf(tomatoes));
                potatoesTextField.setText(String.valueOf(potatoes));
                beefTextField.setText(String.valueOf(beef));
                chickenTextField.setText(String.valueOf(chicken));
                fishTextField.setText(String.valueOf(fish));
                breadTextField.setText(String.valueOf(bread));
                riceTextField.setText(String.valueOf(rice));
                milkTextField.setText(String.valueOf(milk));
                JOptionPane.showMessageDialog(null,"You'll now need "+ onions +" onions");
                JOptionPane.showMessageDialog(null,carrots + " carrots");
                JOptionPane.showMessageDialog(null, tomatoes + " tomatoes");
                JOptionPane.showMessageDialog(null,potatoes + " potatoes");
                JOptionPane.showMessageDialog(null,beef + " beef");
                JOptionPane.showMessageDialog(null,chicken + " chicken");
                JOptionPane.showMessageDialog(null,fish + " fish");
                JOptionPane.showMessageDialog(null,bread + " bread");
                JOptionPane.showMessageDialog(null,rice + " rice");
                JOptionPane.showMessageDialog(null,milk + " milk");
                System.out.println("Scaling complete!");
                //FoodHomePage foodHomePage = new FoodHomePage();



            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter valid numbers");
            }

        }


    }

}