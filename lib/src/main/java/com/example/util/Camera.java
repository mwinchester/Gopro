package com.example.util;

/**
 * Created by meriw on 3/5/2017.
 */

public class Camera {
    private boolean needRaw;
    private boolean needVoice;
    private boolean needStable;
    private boolean cloud;
    private double price;
    private boolean location;
    private String model = "Hero Session";


    public void setPrice(double maxPrice){
        price = maxPrice;
    }
    public void setNeedRaw(boolean raw){
        needRaw = raw;
    }
    public void setNeedVoice(boolean myVoice){
        needVoice = myVoice;
    }
    public void setNeedStable(boolean stable){
        needStable = stable;
    }
    public void setCloud(boolean myCloud){
        cloud = myCloud;
    }
    public void setLocation(boolean myLocation){
        location = myLocation;
    }

    public String select(){

        if (price < 200.00){
            model = "You can't afford a GoPro, try Craig's List for a used one.";

        }

        else if (price < 299.99){
            model = "The only model in your price range is the Hero Session";
        }

        else if (price > 299.99 && price < 399.99 ){
            if(needVoice || needStable || cloud){
                return "You should buy the HERO5 Session";
            }
            else{
                return "The Hero Session should meet your needs";
            }
        }

        else if (price > 399.99){
            if (location || needRaw ){
                return "The Hero5 Black is the best fit for you.";
            }
            else if(needVoice || needStable || cloud){
                return "You should buy the HERO5 Session";
            }
            else{
                return "The Hero Session should meet your needs";
            }
        }


        return model;
    }

}
