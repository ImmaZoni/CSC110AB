/*
This program was coded by Justin Hill from 11/1/2017~11/6/2017
Its uses are to navigate a Tank.class accross a Landscape.class
*/

import java.util.*;//Required API's
import java.awt.*;

public class Program4
{
    public static void main(String[] args)
    {
        //Custom User Names
            final String NAME1 = "Randy";
            final String NAME2 = "Smurfette";

        //Passed Level
            boolean tankPassedGreen = false;
            boolean tankPassedOrange = false;
            boolean tankOnTarget = false;
        //Class Intance Creation
            Landscape myLS = new Landscape(6147);
            Tank myTank = new Tank();
            Scanner kb = new Scanner(System.in);
            Color tankColor = new Color(0,0,0);
            Point orangeOpen = new Point();
            Point greenOpen = new Point();
            Point targetLoc = new Point();
            Random numGen = new Random();
            int tankSpeed = 0;
        //User Prompt
            System.out.println("Please enter your name: ");
                String userName = kb.nextLine();

        //Which Tank If Statement
            if (userName.equalsIgnoreCase(NAME1)) {         //1st Custom User
                tankColor = new Color(numGen.nextInt(256), numGen.nextInt(256), numGen.nextInt(256));
                myTank = new Tank(tankColor, 20);
                tankSpeed = 20;

            }
            else if (userName.equalsIgnoreCase(NAME2)){     //2nd Custom User
                tankColor = new Color(0,0,207);
                myTank = new Tank(tankColor, 15);
                tankSpeed = 15;
            }
            else {                                          //All Other Users
                tankColor = new Color(numGen.nextInt(256), numGen.nextInt(256), 0);
                myTank = new Tank(tankColor, 10);
                tankSpeed = 10;
            }

        //Tank & Landscape - unchanging data

            myLS.addTank(myTank);

            orangeOpen = myLS.getOrangeOpening();
                int orangeX = (int)orangeOpen.getX();   //Isolate X
                int orangeY = (int)orangeOpen.getY();   //Isolate Y
            greenOpen = myLS.getGreenOpening();
                int greenX = (int)greenOpen.getX();
                int greenY = (int)greenOpen.getY();
            targetLoc = myLS.getTargetLocation();
                int targetX = (int)targetLoc.getX();
                int targetY = (int)targetLoc.getY();

            int tankDimension = myTank.getDimension();
            int tankX = myTank.getPositionX();
            int tankY = myTank.getPositionY();

            //Green Bar
            myTank.reverse();

            while (tankY < greenY) {//Move to correct Y
                tankX = myTank.getPositionX();
                tankY = myTank.getPositionY();
                myTank.move();
            }

            myTank.forward();//Turn off Reverse

            for (int i = 0; i <= tankDimension; i++){//Opening adjustment
                myTank.move();
            }

            myTank.turn("right");//Turn towards green wall

            while (tankX < greenX) {//move through green opening
                tankX = myTank.getPositionX();
                tankY = myTank.getPositionY();
                myTank.move();
            }
            for (int i = 0; i <= tankDimension; i++){//final green passage
                myTank.move();
                tankPassedGreen = true;
                tankColor = new Color(numGen.nextInt(256),numGen.nextInt(256),numGen.nextInt(256));
                myTank.setColor(tankColor);
            }

            //Orange Bar
            if(tankY < orangeY){    //Right Direction Module
                tankX = myTank.getPositionX();
                tankY = myTank.getPositionY();
                myTank.turn("left");
                myTank.reverse();
                while(tankY < orangeY){ //Move to position module
                    myTank.move();
                    tankX = myTank.getPositionX();
                    tankY = myTank.getPositionY();
                }
                myTank.forward();   //Uninitialize Reverse

                for (int i = 0; i < tankDimension; i++){    //opening adjustment
                    myTank.move();
                }

                myTank.turn("right");

                while (tankX < orangeX) {      //Opening passthrough module
                    tankX = myTank.getPositionX();
                    tankY = myTank.getPositionY();
                    myTank.move();
                }
                for (int i = 0; i <= tankDimension; i++){   //Final Orange Pass
                    myTank.move();
                    tankPassedOrange = true;
                }
            } else if (tankY > orangeY) {   //Left Direction Module
                tankX = myTank.getPositionX();
                tankY = myTank.getPositionY();
                myTank.turn("right");
                myTank.reverse();
                while(tankY > orangeY){ //Move to position module
                    myTank.move();
                    tankX = myTank.getPositionX();
                    tankY = myTank.getPositionY();
                }
                for (int i = 0; i < tankDimension; i++){    //Opening adjustment
                    myTank.move();
                }
                myTank.forward();   //Uninitialize reverse
                myTank.turn("left");

                while (tankX < orangeX) {      //Opening passthrough module
                    tankX = myTank.getPositionX();
                    tankY = myTank.getPositionY();
                    myTank.move();
                }
                for (int i = 0; i <= tankDimension; i++){   //Final Orange Pass
                    myTank.move();
                    tankPassedOrange = true;
                }
            } else {    //Straight Direction Module
                while (tankX < orangeX) {      //Opening passthrough module
                    tankX = myTank.getPositionX();
                    tankY = myTank.getPositionY();
                    myTank.move();
                }
                for (int i = 0; i <= tankDimension; i++){   //Final Orange Pass
                    myTank.move();
                    tankPassedOrange = true;
                }
            }
            //Target
            if(tankPassedGreen && tankPassedOrange){    //Passed Walls Module


                while(tankX < targetX){     //Correct X Module
                    tankX = myTank.getPositionX();
                    tankY = myTank.getPositionY();
                    myTank.move();
                }

                if(tankX == targetX && tankY < targetY){ //Direction Module
                    for(int i = 0; i < 5; i++){
                        myTank.turn("right") ;
                        myTank.move();
                        myTank.move();
                        myTank.move();
                        myTank.move();
                        myTank.move();
                        myTank.move();
                    }
                } else if(tankX == targetX && tankY > targetY) {
                    for(int i = 0; i < 5; i++){
                        myTank.turn("left") ;
                        myTank.move();
                        myTank.move();
                        myTank.move();
                        myTank.move();
                        myTank.move();
                        myTank.move();
                    }
                }


                while(tankY != targetY){    //Correct Y Module
                    tankX = myTank.getPositionX();
                    tankY = myTank.getPositionY();
                    myTank.move();
                }
            }
        }
    }
