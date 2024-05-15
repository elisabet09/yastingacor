/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmisamuell;

/**
 *
 * @author WINDOWS 10
 */
public class BMISamuell {

    
    public static void main(String[] args) {
        int beratbadan = 50 ;
        float tinggibadan =56f;
        float bmi=(beratbadan/(tinggibadan=tinggibadan));
        
        System.out.println("BMI ANDA ADALAH/t,"+bmi);
        
        if (bmi<18.5){
            System.out.println("BERAT BADAN ANDA KURANG");
        }
        else if (bmi<24.9){
            System.out.println("BERAT BADAN ANDA NORMAL/IDEAL");
        }
         else if (bmi<29.9){
             System.out.println("BERAT BADAN ANDA LEBIH");
         }
         else{
             System.out.println("OBESITAS");
    }
    
}
}
