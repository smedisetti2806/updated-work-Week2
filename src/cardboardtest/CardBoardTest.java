/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardboardtest;


public class CardBoardTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         CardBoardMaker.getFactory("White CardBoard");
        CardBoardMaker.getFactory("Red CardBoard");

        System.out.println("White and Blue CardBoard");
        CardBoardMaker.shipWhite_Blue();
        System.out.println();

        System.out.println("Red and Orange CardBoard");
        CardBoardMaker.shipRed_Orange();
        
    }
    
}
