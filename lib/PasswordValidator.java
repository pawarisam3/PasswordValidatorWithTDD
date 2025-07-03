package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param password string ที่ต้องการตรวจสอบ
     * @return PasswordStrength.INVALID อื่นๆ
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        if(password==null || password.length()<8)
           return PasswordStrength.INVALID;
        boolean digit= false;
        boolean uppercase= false;
        boolean special = false;
        for(char c : password.toCharArray()){
            if(Character.isDigit(c)){
                digit = true;
            }
            if(Character.isUpperCase(c)){
                uppercase = true;
            }
            if(!Character.isLetterOrDigit(c)){
                special = true;
            }
        }
        
        if(digit&&uppercase&&special){
            return PasswordStrength.STRONG;
        }else if ((digit&&uppercase) ||(digit&&special)||(special&&uppercase) ) {
            return PasswordStrength.MEDIUM;
        }else if(!digit|| !uppercase || !special ){
            return PasswordStrength.WEAK;
        }else{
            return PasswordStrength.INVALID;
        }
        
    }
}