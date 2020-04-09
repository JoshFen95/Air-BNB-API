package com.example.airbnbapi.handler;

import com.example.airbnbapi.Model.Game;
import com.example.airbnbapi.mapper.FetchObject;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class HandleInput implements CommandLineRunner {
    Scanner input = new Scanner(System.in);

    @Override
    public void run(String... args) throws Exception {

        System.out.println("What is the name of your JSON file?: ");
        String resourceFilePath = input.next();
        System.out.println("--------");

        System.out.println("What is the ID number of the game you would like to locate?: ");
        int id = input.nextInt();
        FetchObject obj = new FetchObject();
        Game[] gameObj = obj.returnGameList(resourceFilePath);

        boolean match = false;

        while (!match) {
            for (int i = 0; i < gameObj.length; i++) {
                if (gameObj[i].getId().equals(id + "")) {

                    System.out.println(gameObj[id - 1].toString());
                    match = true;
                    break;
                }
            }
            if (!match) {
                System.out.println("Could not locate game in file");
                break;
            }
        }


    }
}
