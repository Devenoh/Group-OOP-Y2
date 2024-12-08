/*
*RecipePopup.java
@author Aaron Tracey
*16/11/2024
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RecipePopup {
    private Recipe recipe;
    private RecipeStorageA recipeStorage;
    private Modulus remainder;
    private ActionListener deleteListener;

    JFrame frame = new JFrame();
    JButton deleteButton = new JButton("Delete");

    JLabel titleLabel = new JLabel();

    JTextArea directionsTextArea = new JTextArea();

    JLabel ingredientsBigLabel1 = new JLabel("Onions      Carrots   Tomatoes  Potatoes       Beef       Chicken        Fish          Bread         Rice           Milk");
    JLabel ingredientsBigLabel2 = new JLabel("Onions      Carrots   Tomatoes  Potatoes       Beef       Chicken        Fish          Bread         Rice           Milk");
    JLabel remainderLabel = new JLabel("Remainder:");

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

    JTextField onionsRemainderTextField = new JTextField("0");
    JTextField carrotsRemainderTextField = new JTextField("0");
    JTextField tomatoesRemainderTextField = new JTextField("0");
    JTextField potatoesRemainderTextField = new JTextField("0");
    JTextField beefRemainderTextField = new JTextField("0");
    JTextField chickenRemainderTextField = new JTextField("0");
    JTextField fishRemainderTextField = new JTextField("0");
    JTextField breadRemainderTextField = new JTextField("0");
    JTextField riceRemainderTextField = new JTextField("0");
    JTextField milkRemainderTextField = new JTextField("0");


    Integer textFieldsStartX = 56;
    Integer textFieldsStartY = 140;
    Integer textFieldsWidth = 30;
    Integer textFieldsHeight = 20;
    Integer textFieldsSpacing = 30;
    Integer textFieldsYSpacing = 90;
    public RecipePopup(
            Recipe recipe,
            RecipeStorageA recipeStorage,
            Modulus remainder,
            ActionListener deleteListener
    ) {
        this.recipe = recipe;
        this.recipeStorage = recipeStorage;
        this.remainder = remainder;
        this.deleteListener = deleteListener;

        titleLabel.setBounds(70, 20, 600, 40);
        titleLabel.setFont(new Font("Dialog", Font.BOLD, 28));
        titleLabel.setText(recipe.getName());
        frame.add(titleLabel);

        directionsTextArea.setBounds(70, 60, 600, 40);
        directionsTextArea.setFont(new Font("Dialog", Font.BOLD, 14));
        directionsTextArea.setText(recipe.getDirections());
        directionsTextArea.setLineWrap(true);
        directionsTextArea.setWrapStyleWord(true);
        directionsTextArea.setEditable(false);
        directionsTextArea.setOpaque(false);
        frame.add(directionsTextArea);

        deleteButton.setBounds(24, 300, 200, 40);
        deleteButton.setFocusable(true);
        deleteButton.addActionListener(deleteListener);
        deleteButton.addActionListener(e -> frame.dispose());
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        frame.add(deleteButton);

        ingredientsBigLabel1.setBounds(50, 100, 2000, 40);
        frame.add(ingredientsBigLabel1);
        
        onionsTextField.setBounds(textFieldsStartX, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        onionsTextField.setText(String.valueOf(recipe.getIngredients().getOnions()));
        onionsTextField.setEditable(false);
        frame.add(onionsTextField);

        carrotsTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth), textFieldsStartY, textFieldsWidth, textFieldsHeight);
        carrotsTextField.setText(String.valueOf(recipe.getIngredients().getCarrots()));
        carrotsTextField.setEditable(false);
        frame.add(carrotsTextField);

        tomatoesTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 2, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        tomatoesTextField.setText(String.valueOf(recipe.getIngredients().getTomatoes()));
        tomatoesTextField.setEditable(false);
        frame.add(tomatoesTextField);

        potatoesTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 3, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        potatoesTextField.setText(String.valueOf(recipe.getIngredients().getPotatoes()));
        potatoesTextField.setEditable(false);
        frame.add(potatoesTextField);

        beefTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 4, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        beefTextField.setText(String.valueOf(recipe.getIngredients().getBeef()));
        beefTextField.setEditable(false);
        frame.add(beefTextField);

        chickenTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 5, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        chickenTextField.setText(String.valueOf(recipe.getIngredients().getChicken()));
        chickenTextField.setEditable(false);
        frame.add(chickenTextField);

        fishTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 6, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        fishTextField.setText(String.valueOf(recipe.getIngredients().getFish()));
        fishTextField.setEditable(false);
        frame.add(fishTextField);

        breadTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 7, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        breadTextField.setText(String.valueOf(recipe.getIngredients().getBread()));
        breadTextField.setEditable(false);
        frame.add(breadTextField);

        riceTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 8, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        riceTextField.setText(String.valueOf(recipe.getIngredients().getRice()));
        riceTextField.setEditable(false);
        frame.add(riceTextField);

        milkTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 9, textFieldsStartY, textFieldsWidth, textFieldsHeight);
        milkTextField.setText(String.valueOf(recipe.getIngredients().getMilk()));
        milkTextField.setEditable(false);
        frame.add(milkTextField);




        remainderLabel.setBounds(50, 80 + textFieldsYSpacing, 2000, 40);
        frame.add(remainderLabel);

        ingredientsBigLabel2.setBounds(50, 100 + textFieldsYSpacing, 2000, 40);
        frame.add(ingredientsBigLabel2);

        onionsRemainderTextField.setBounds(textFieldsStartX, textFieldsStartY + textFieldsYSpacing, textFieldsWidth, textFieldsHeight);
        onionsRemainderTextField.setText(String.valueOf(remainder.getIngredients().getOnions()));
        onionsRemainderTextField.setEditable(false);
        frame.add(onionsRemainderTextField);

        carrotsRemainderTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth), textFieldsStartY + textFieldsYSpacing, textFieldsWidth, textFieldsHeight);
        carrotsRemainderTextField.setText(String.valueOf(remainder.getIngredients().getCarrots()));
        carrotsRemainderTextField.setEditable(false);
        frame.add(carrotsRemainderTextField);

        tomatoesRemainderTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 2, textFieldsStartY + textFieldsYSpacing, textFieldsWidth, textFieldsHeight);
        tomatoesRemainderTextField.setText(String.valueOf(remainder.getIngredients().getTomatoes()));
        tomatoesRemainderTextField.setEditable(false);
        frame.add(tomatoesRemainderTextField);

        potatoesRemainderTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 3, textFieldsStartY + textFieldsYSpacing, textFieldsWidth, textFieldsHeight);
        potatoesRemainderTextField.setText(String.valueOf(remainder.getIngredients().getPotatoes()));
        potatoesRemainderTextField.setEditable(false);
        frame.add(potatoesRemainderTextField);

        beefRemainderTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 4, textFieldsStartY + textFieldsYSpacing, textFieldsWidth, textFieldsHeight);
        beefRemainderTextField.setText(String.valueOf(remainder.getIngredients().getBeef()));
        beefRemainderTextField.setEditable(false);
        frame.add(beefRemainderTextField);

        chickenRemainderTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 5, textFieldsStartY + textFieldsYSpacing, textFieldsWidth, textFieldsHeight);
        chickenRemainderTextField.setText(String.valueOf(remainder.getIngredients().getChicken()));
        chickenRemainderTextField.setEditable(false);
        frame.add(chickenRemainderTextField);

        fishRemainderTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 6, textFieldsStartY + textFieldsYSpacing, textFieldsWidth, textFieldsHeight);
        fishRemainderTextField.setText(String.valueOf(remainder.getIngredients().getFish()));
        fishRemainderTextField.setEditable(false);
        frame.add(fishRemainderTextField);

        breadRemainderTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 7, textFieldsStartY + textFieldsYSpacing, textFieldsWidth, textFieldsHeight);
        breadRemainderTextField.setText(String.valueOf(remainder.getIngredients().getBread()));
        breadRemainderTextField.setEditable(false);
        frame.add(breadRemainderTextField);

        riceRemainderTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 8, textFieldsStartY + textFieldsYSpacing, textFieldsWidth, textFieldsHeight);
        riceRemainderTextField.setText(String.valueOf(remainder.getIngredients().getRice()));
        riceRemainderTextField.setEditable(false);
        frame.add(riceRemainderTextField);

        milkRemainderTextField.setBounds(textFieldsStartX + (textFieldsSpacing + textFieldsWidth) * 9, textFieldsStartY + textFieldsYSpacing, textFieldsWidth, textFieldsHeight);
        milkRemainderTextField.setText(String.valueOf(remainder.getIngredients().getMilk()));
        milkRemainderTextField.setEditable(false);
        frame.add(milkRemainderTextField);
        
        
        

        frame.setTitle(recipe.getName());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(700, 400);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
