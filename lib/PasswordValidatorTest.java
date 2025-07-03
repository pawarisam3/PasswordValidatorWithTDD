package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw = "123";
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 :"+pw+" :Passed : Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 : "+pw+" :FAILED Expected INVALID but got " + result1);
        }

        // Test Case 2 : รหัสผ่านทั้งหมดเป็นตัวเล็กจะ WEAK
         pw = "abcdefj";
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.WEAK) {
            System.out.println("Test Case 1 :"+pw+" :Passed : All Lowercase is WEAK.");
        } else {
            System.out.println("Test Case 1 : "+pw+" :FAILED Expected WEAK but got " + result2);
        }

        // Test Case 3 : รหัสผ่านทั้งหมดเป็นตัวใหญ่ ตัวเล็กจะ MEDIUM
         pw = "MoPawarisa";
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 1 :"+pw+" :Passed : bigsmallpassword is MEDIUM.");
        } else {
            System.out.println("Test Case 1 : "+pw+" :FAILED Expected MEDIUM but got " + result3);
        }

        // Test Case 4 : รหัสผ่านทั้งหมดเป็นตัวอักษรตัวใหญ่ ตัวเล็ก ตัวเลขจะเป็น STRONG
         pw = "Mo_0312";
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.STRONG) {
            System.out.println("Test Case 1 :"+pw+" :Passed : password is STRONG.");
        } else {
            System.out.println("Test Case 1 : "+pw+" :FAILED Expected STRONG but got " + result4);
        }
        System.out.println("--------------------------------");
    }
}
