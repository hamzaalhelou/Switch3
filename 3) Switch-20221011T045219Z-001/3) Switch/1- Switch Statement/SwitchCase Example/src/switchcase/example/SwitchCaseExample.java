/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase.example;

/**
 *
 * @author Omen
 */
public class SwitchCaseExample {
    
   

    public void checkGender(char gender) {
        switch (gender) {
            case 'M':
            case 'm':
                System.out.println("Gender is: Male");
                break;

            case 'F':
            case 'f':
                System.out.println("Gender is: Female");
                break;

            default:
                System.out.println("Error value: " + gender + ")");
                
        }
    }

    public void checkResult(String result) {
        switch (result) {
            case "A":
                System.out.println("Result is Excellent");
                break;

            case "B":
            case "b":
                System.out.println("Result is V.Good");
                break;

            case "C":
                System.out.println("Result is Good");
        }
    }
}
