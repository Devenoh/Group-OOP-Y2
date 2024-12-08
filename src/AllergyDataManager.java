/*
 *AllergyDataManager
 *@author Andrew Cleary
 *1/12/24
 */
import javax.swing.*;

public class AllergyDataManager {

    private boolean[] allergyCheckboxes = new boolean[10];
    public boolean[] getAllergyCheckboxes() {
        return allergyCheckboxes;
    }
    public void setAllergyCheckboxes(boolean[] allergyCheckboxes) {
        this.allergyCheckboxes = allergyCheckboxes;
    }

    AllergyDataManager(){
        for(int i = 0; i < 10; i++){
            allergyCheckboxes[i] = false;
        }
    }
}

