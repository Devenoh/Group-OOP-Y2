/*
*LoginStorage.java
@author Aaron Tracey
*16/11/2024
*/

public class LoginStorage {
        private Boolean domestic;
        private Boolean commercial;
        private Boolean financial;

        public LoginStorage(){
            domestic = false;
            commercial = false;
            financial = false; 
        }

        public void setDomestic(Boolean domestic){
            this.domestic = domestic;
        }

        public void setCommercial(Boolean commercial){
            this.commercial = commercial;
        }

        public void setFinancial(Boolean financial){
            this.financial = financial;
        }
}
