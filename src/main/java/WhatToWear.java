import java.util.Scanner;
public class WhatToWear
{
    public static void main(String[] args)
    {
        System.out.println("What's the weather like? Use the words 'cloudy', 'sunny', 'rainy', or 'snow' to describe.");
        Scanner user = new Scanner(System.in);
        String weather = user.nextLine();

        System.out.println("What's the average temperature?");
        Scanner user1 = new Scanner(System.in);
        String tempString = user1.nextLine();
        int tempInt = Integer.parseInt(tempString);

        if (tempInt >= 25 && (weather.equals("sunny") || weather.equals("cloudy")))
        {
            System.out.println("wear a T-shirt and short/a skirt!");
        }

        else if ((10 < tempInt) && (tempInt < 25) && weather.equals("cloudy"))
        {
                System.out.println("Bring layers!");
        }

        else if (tempInt <= 10 && weather.equals("rainy"))
        {
            System.out.println("Wear a warm raincoat!");
        }

        else if (tempInt <= 5 && weather.equals("snowy"))
        {
            System.out.println("Wear a thick snow coat");
        }

        else
        {
            System.out.println("I can't help ya!");
        }
    }


}
