/*
*RecipesLaunchPage.java
@author Aaron Tracey
*16/11/2024
*/

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class RecipesLaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton addRecipeButton = new JButton("Add Recipe");

    JLabel titleLabel = new JLabel("Recipes");
    JLabel ingredientsLabel = new JLabel("Your Ingredients (press enter after input)");
    JLabel ingredientsBigLabel = new JLabel("Onions      Carrots   Tomatoes  Potatoes       Beef       Chicken        Fish          Bread         Rice           Milk");
    JLabel firstCookingReminderLabel = new JLabel("First cooking reminder:");
    JLabel secondCookingReminderLabel = new JLabel("Second cooking reminder:");
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


    JPanel recipeButtonsContainer = new JPanel(new GridBagLayout());

    JScrollPane recipesScrollPane = new JScrollPane(recipeButtonsContainer);

    JTextField firstCookingReminderTextField = new JTextField("");
    JTextField secondCookingReminderTextField = new JTextField("");

    RecipeStorageA recipeStorage = new RecipeStorageA();
    IngredientsA ingredientStorage = new IngredientsA();

    Integer textFieldsStartX = 26;
    Integer textFieldsStartY = 140;
    Integer textFieldsWidth = 30;
    Integer textFieldsHeight = 20;
    Integer textFieldsSpacing = 30;

    ArrayList<Recipe> shownRecipes;

    ArrayList<JButton> shownRecipeButtons;
    File ingredientsFile;
    File firstCookingReminderFile;
    File secondCookingReminderFile;

    RecipesLaunchPage() {
        shownRecipes = recipeStorage.getRecipes();

        addRecipeButton.setBounds(400, 490, 200, 40);
        addRecipeButton.setFocusable(true);
        addRecipeButton.addActionListener(e -> addRecipePressed());
        frame.add(addRecipeButton);

        titleLabel.setBounds(370, 20, 200, 40);
        titleLabel.setFont(new Font("Dialog", Font.BOLD, 36));
        frame.add(titleLabel);

        ingredientsLabel.setBounds(180, 80, 250, 40);
        frame.add(ingredientsLabel);

        ingredientsBigLabel.setBounds(20, 100, 2000, 40);
        frame.add(ingredientsBigLabel);

        onionsTextField.setBounds(textFieldsStartX, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        onionsTextField.addActionListener(this);
        frame.add(onionsTextField);

        carrotsTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth), textFieldsStartY, textFieldsWidth, textFieldsHeight);
        carrotsTextField.addActionListener(this);
        frame.add(carrotsTextField);

        tomatoesTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 2, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        tomatoesTextField.addActionListener(this);
        frame.add(tomatoesTextField);

        potatoesTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 3, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        potatoesTextField.addActionListener(this);
        frame.add(potatoesTextField);

        beefTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 4, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        beefTextField.addActionListener(this);
        frame.add(beefTextField);

        chickenTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 5, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        chickenTextField.addActionListener(this);
        frame.add(chickenTextField);

        fishTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 6, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        fishTextField.addActionListener(this);
        frame.add(fishTextField);

        breadTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 7, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        breadTextField.addActionListener(this);
        frame.add(breadTextField);

        riceTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 8, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        riceTextField.addActionListener(this);
        frame.add(riceTextField);

        milkTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 9, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        milkTextField.addActionListener(this);
        frame.add(milkTextField);

        firstCookingReminderLabel.setBounds(20, 380, 250, 20);
        frame.add(firstCookingReminderLabel);

        firstCookingReminderTextField.setBounds(20, 400, 500, 20);
        firstCookingReminderTextField.addActionListener(this);
        frame.add(firstCookingReminderTextField);

        secondCookingReminderLabel.setBounds(20, 440, 250, 20);
        frame.add(secondCookingReminderLabel);

        secondCookingReminderTextField.setBounds(20, 460, 500, 20);
        secondCookingReminderTextField.addActionListener(this);
        frame.add(secondCookingReminderTextField);

        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "TXT documents", "txt");
        chooser.setFileFilter(filter);

        // Read the ingredients file
        int returnVal1 = chooser.showSaveDialog(null);
        if (returnVal1 == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: " +
                    chooser.getSelectedFile().getName());
            ingredientsFile = chooser.getSelectedFile();
            if (ingredientsFile.exists()) {
                try {
                    BufferedReader br = new BufferedReader(new FileReader(ingredientsFile));
                    String readString = br.readLine();
                    if (readString != null) {
                        parseIngredientsString(readString.trim());
                    }
                    br.close();
                } catch (Exception e) {
                    System.out.println("Error when reading first file");
                }
            }
        }

        // Read the first cooking reminder file
        int returnVal2 = chooser.showSaveDialog(null);
        if (returnVal2 == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: " +
                    chooser.getSelectedFile().getName());
            firstCookingReminderFile = chooser.getSelectedFile();
            if (firstCookingReminderFile.exists()) {
                try {
                    BufferedReader br = new BufferedReader(new FileReader(firstCookingReminderFile));
                    firstCookingReminderTextField.setText(br.readLine());
                    br.close();
                } catch (Exception e) {
                    System.out.println("Error when reading first file");
                }
            }
        }

        // Read the second cooking reminder file
        int returnVal3 = chooser.showSaveDialog(null);
        if (returnVal3 == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: " +
                    chooser.getSelectedFile().getName());
            secondCookingReminderFile = chooser.getSelectedFile();
            if (secondCookingReminderFile.exists()) {
                try {
                    BufferedReader br = new BufferedReader(new FileReader(secondCookingReminderFile));
                    secondCookingReminderTextField.setText(br.readLine());
                    br.close();
                } catch (Exception e) {
                    System.out.println("Error when reading second file");
                }
            }
        }

        updateSearch();
        recipesScrollPane.setBounds(620, 0, 370, 560);
        frame.add(recipesScrollPane);


        frame.setTitle("Recipes");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1005, 600);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    private void updateRecipeButtons() {  // Updates the currently shown recipes on the right
        recipeButtonsContainer.removeAll();
        recipeButtonsContainer.updateUI();
        shownRecipeButtons = new ArrayList<>();
        for (int i = 0; i < shownRecipes.size(); i++) {
            Recipe recipe = shownRecipes.get(i);
            JButton button = new JButton(recipe.getName());
            button.setPreferredSize(new Dimension(350, 60));
            button.setFocusable(true);
            button.addActionListener(e -> pressRecipeButton(recipe));  // Makes the code call the pressRecipeButton function with the recipe argument on button press
            GridBagConstraints c = new GridBagConstraints();
            c.gridx = 0;
            c.gridy = i;
            c.fill = GridBagConstraints.HORIZONTAL;
            recipeButtonsContainer.add(button, c);
            shownRecipeButtons.add(button);
        }
    }

    private void pressRecipeButton(Recipe recipe) {
        Modulus remainder = new Modulus(ingredientStorage.subtract(recipe.getIngredients()));
        RecipePopup recipePopup = new RecipePopup(
                recipe,
                recipeStorage,
                remainder,
                e -> deleteRecipePressed(recipe));  // Makes the code call the deleteRecipePressed function when the Delete button is pressed in the popup window
        System.out.println("Recipe " + recipe.getName() + " pressed");
    }

    private void addRecipePressed() {  // Adds a new recipe
        Recipe newRecipe = new Recipe(
                JOptionPane.showInputDialog(null,"Enter the recipe name:"),
                JOptionPane.showInputDialog(null,"Enter the recipe directions:"),
                Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the onion amount:")),
                Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the carrot amount:")),
                Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the tomato amount:")),
                Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the potato amount:")),
                Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the beef amount:")),
                Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the chicken amount:")),
                Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the fish amount:")),
                Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the bread amount:")),
                Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the rice amount:")),
                Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the milk amount:"))
        );
        recipeStorage.addRecipe(newRecipe);
        updateSearch();
    }

    private void deleteRecipePressed(Recipe recipe) {  // Deletes a recipe
        recipeStorage.remove(recipe);
        updateSearch();
    }

    private void updateSearch() {  // Updates the filter
        System.out.println("Updating search");
        shownRecipes = recipeStorage.filterRecipes(ingredientStorage);
        updateRecipeButtons();
    }

    private void parseIngredientsString(String ingredientsString) {
        String[] splitString = ingredientsString.split(",");
        if (splitString.length != 10) {
            return;
        }
        for (int i = 0; i < 10; i++) {
            if (!Utils.isNumeric(splitString[i])) {
                return;
            }
            switch (i) {
                case 0:
                    ingredientStorage.setOnions(Integer.parseInt(splitString[i]));
                    onionsTextField.setText(String.valueOf(ingredientStorage.getOnions()));
                    break;
                case 1:
                    ingredientStorage.setCarrots(Integer.parseInt(splitString[i]));
                    carrotsTextField.setText(String.valueOf(ingredientStorage.getCarrots()));
                    break;
                case 2:
                    ingredientStorage.setTomatoes(Integer.parseInt(splitString[i]));
                    tomatoesTextField.setText(String.valueOf(ingredientStorage.getTomatoes()));
                    break;
                case 3:
                    ingredientStorage.setPotatoes(Integer.parseInt(splitString[i]));
                    potatoesTextField.setText(String.valueOf(ingredientStorage.getPotatoes()));
                    break;
                case 4:
                    ingredientStorage.setBeef(Integer.parseInt(splitString[i]));
                    beefTextField.setText(String.valueOf(ingredientStorage.getBeef()));
                    break;
                case 5:
                    ingredientStorage.setChicken(Integer.parseInt(splitString[i]));
                    chickenTextField.setText(String.valueOf(ingredientStorage.getChicken()));
                    break;
                case 6:
                    ingredientStorage.setFish(Integer.parseInt(splitString[i]));
                    fishTextField.setText(String.valueOf(ingredientStorage.getFish()));
                    break;
                case 7:
                    ingredientStorage.setBread(Integer.parseInt(splitString[i]));
                    breadTextField.setText(String.valueOf(ingredientStorage.getBread()));
                    break;
                case 8:
                    ingredientStorage.setRice(Integer.parseInt(splitString[i]));
                    riceTextField.setText(String.valueOf(ingredientStorage.getRice()));
                    break;
                case 9:
                    ingredientStorage.setMilk(Integer.parseInt(splitString[i]));
                    milkTextField.setText(String.valueOf(ingredientStorage.getMilk()));
                    break;
            }
        }
        //updateSearch();
    }

    @Override
    public void actionPerformed(ActionEvent e) {  // This gets called when enter gets pressed on one of the text fields
        if (
                e.getSource() == onionsTextField
                || e.getSource() == carrotsTextField
                || e.getSource() == tomatoesTextField
                || e.getSource() == potatoesTextField
                || e.getSource() == beefTextField
                || e.getSource() == chickenTextField
                || e.getSource() == fishTextField
                || e.getSource() == breadTextField
                || e.getSource() == riceTextField
                || e.getSource() == milkTextField
        ) {
            boolean updateSearchFlag = false;
            String onionsText = onionsTextField.getText();
            String carrotsText = carrotsTextField.getText();
            String tomatoesText = tomatoesTextField.getText();
            String potatoesText = potatoesTextField.getText();
            String beefText = beefTextField.getText();
            String chickenText = chickenTextField.getText();
            String fishText = fishTextField.getText();
            String breadText = breadTextField.getText();
            String riceText = riceTextField.getText();
            String milkText = milkTextField.getText();
            if (Utils.isNumeric(onionsText)) {
                ingredientStorage.setOnions(Integer.parseInt(onionsText));
                updateSearchFlag = true;
            }
            if (Utils.isNumeric(carrotsText)) {
                ingredientStorage.setCarrots(Integer.parseInt(carrotsText));
                updateSearchFlag = true;
            }
            if (Utils.isNumeric(tomatoesText)) {
                ingredientStorage.setTomatoes(Integer.parseInt(tomatoesText));
                updateSearchFlag = true;
            }
            if (Utils.isNumeric(potatoesText)) {
                ingredientStorage.setPotatoes(Integer.parseInt(potatoesText));
                updateSearchFlag = true;
            }
            if (Utils.isNumeric(beefText)) {
                ingredientStorage.setBeef(Integer.parseInt(beefText));
                updateSearchFlag = true;
            }
            if (Utils.isNumeric(chickenText)) {
                ingredientStorage.setChicken(Integer.parseInt(chickenText));
                updateSearchFlag = true;
            }
            if (Utils.isNumeric(fishText)) {
                ingredientStorage.setFish(Integer.parseInt(fishText));
                updateSearchFlag = true;
            }
            if (Utils.isNumeric(breadText)) {
                ingredientStorage.setBread(Integer.parseInt(breadText));
                updateSearchFlag = true;
            }
            if (Utils.isNumeric(riceText)) {
                ingredientStorage.setRice(Integer.parseInt(riceText));
                updateSearchFlag = true;
            }
            if (Utils.isNumeric(milkText)) {
                ingredientStorage.setMilk(Integer.parseInt(milkText));
                updateSearchFlag = true;
            }
            if (updateSearchFlag) {  // Update search if any of the text fields had valid input
                updateSearch();
                // Write to ingredients file here
                try {
                    PrintWriter writer = new PrintWriter(new FileWriter(ingredientsFile, false));
                    String stringToBeSaved = ingredientStorage.getSavingString();
                    writer.print(stringToBeSaved);
                    writer.close();
                } catch (Exception ex) {
                    System.out.println("Failed saving ingredients");
                }
            }
        }
        if (e.getSource() == firstCookingReminderTextField) {
            // Write to first cooking reminder file
            try {
                PrintWriter writer = new PrintWriter(new FileWriter(firstCookingReminderFile, false));
                String stringToBeSaved = (firstCookingReminderTextField.getText());
                writer.print(stringToBeSaved);
                writer.close();
            } catch (Exception ex) {
                System.out.println("Failed saving first file");
            }
        }
        if (e.getSource() == secondCookingReminderTextField) {
            // Write to second cooking reminder file
            try {
                PrintWriter writer = new PrintWriter(new FileWriter(secondCookingReminderFile, false));
                String stringToBeSaved = (secondCookingReminderTextField.getText());
                writer.print(stringToBeSaved);
                writer.close();
            } catch (Exception ex) {
                System.out.println("Failed saving second file");
            }
        }
    }
}
