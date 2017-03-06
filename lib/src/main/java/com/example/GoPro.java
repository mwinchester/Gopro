package com.example;
import java.util.Scanner;
import com.example.util.Camera;

public class GoPro {
    public static void main(String args[]){
        Camera myGoPro = new Camera();
        Scanner user_input = new Scanner(System.in);
        String response;


        System.out.println("I\'m happy to help  you select your new camera.");
        System.out.println("I will need to ask you a few questions.");
        System.out.println("What is the maximum amount you can spend on your new camera?  ");
        response = user_input.next();
        myGoPro.setPrice(Double.parseDouble(response));


        System.out.println("Do you need to capture in Camera Raw? (y/n) ");
        response = user_input.next();
        if (response.startsWith("y")|| response.startsWith("Y")){
            myGoPro.setNeedRaw(true);
        }
        else{
            myGoPro.setNeedRaw(false);
        }



        System.out.println("Do you need voice control of your camera? (y/n) ");
        response = user_input.next();
        if (response.startsWith("y")|| response.startsWith("Y")){
            myGoPro.setNeedVoice(true);
        }
        else{
            myGoPro.setNeedVoice(false);
        }


        System.out.println("Do you need auto stabilization? (y/n) ");
        response = user_input.next();
        if (response.startsWith("y")|| response.startsWith("Y")){
            myGoPro.setNeedStable(true);
        }
        else{
            myGoPro.setNeedStable(false);
        }


        System.out.println("Do you want your footage automatically uploaded to the cloud? (y/n)  ");
        response = user_input.next();
        if (response.startsWith("y")|| response.startsWith("Y")){
            myGoPro.setCloud(true);
        }
        else{
            myGoPro.setCloud(false);
        }


        System.out.println("Do you want Location Capture services? (y/n) ");
        response = user_input.next();
        if (response.startsWith("y")|| response.startsWith("Y")){
            myGoPro.setLocation(true);
        }
        else{
            myGoPro.setLocation(false);
        }

        System.out.println(myGoPro.select());

    }
}

