/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardboardtest;



public class CardBoardMaker {
    private static HardCardBoard white = new WhiteCardBoard();
    private static HardCardBoard blue = new BlueCardBoard();

    private static maker red = new RedCardBoard();
    private static maker orange = new OrangeCardBoard();

    public static cardBoardFactory getFactory(String choice){
        if("White CardBoard".equalsIgnoreCase(choice)){
            return new HardCardBoardFactory();
        }
        else if("Red CardBoard".equalsIgnoreCase(choice)){
            return new HardCardBoardFactory();
        }

        return null;
    }

    public static void shipWhite_Blue()
    {
        white.color();
        blue.color();
    }

    public static void shipRed_Orange()
    {
        red.prepare();
        orange.prepare();
    }
}
