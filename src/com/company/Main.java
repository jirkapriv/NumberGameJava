package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int coins = 1000;
        int item1 = 0;
        int item2 = 0;
        int item3 = 0;

        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String blue = "\u001B[34m";
        String yellow = "\u001B[33m";
        String magenta = "\u001B[35m";
        String cyan = "\u001B[36m";
        String lightGreen = "\u001B[32;1m";
        String resetikB = "\u001B[0m";

        // actions blue
        // bad thinks red
        // good thinks green
        // yellow - shop
        // magenta - gamba
        // cyan - remember

        System.out.println("");
        System.out.println("");

        System.out.println(blue + "Hello!!!! In this number game you try to get Maturita... Enjoy :) ");

        System.out.println(resetikB);

        for (int c = 0; c > -1; c++) {

            if (item3 == 1) {

                System.out.println(yellow + "You won the game!!! Congrats...." + resetikB);
                break;

            }


            System.out.println("Your balance is " + coins + " coins :)");
            System.out.println();
            System.out.println("\t1) To enter the " + yellow + "Shop");
            System.out.print(resetikB);
            System.out.println("\t2) To enter the" + cyan + " Remeber game");
            System.out.print(resetikB);
            System.out.println("\t3) To enter the" + magenta + " Gamba game");
            System.out.print(resetikB);
            System.out.println("\t4) To enter the " + lightGreen + "Number Convertor");
            System.out.print(resetikB);
            System.out.println("\t5) To " + red + "Turn of :(");
            System.out.print(resetikB);

            int Ychoice = scanner.nextInt();
            scanner.nextLine();

            if (Ychoice == 1) {

                while (true) {
                    System.out.println();
                    System.out.println(yellow + "This is shop you can get interesting thinks here!!!!!");
                    System.out.println(resetikB);
                    System.out.println("\t1) You can get an upgrade to " + cyan + "Remember game " + resetikB + "just for " + green + "100 coins" + resetikB + "!!!!");
                    System.out.println("\t2) You can buy " + lightGreen + "Number Convertor " + resetikB + "just for " + green + "400 coins" + resetikB + "!!!!");
                    System.out.println("\t3) You can buy " + red + "Maturita" + resetikB + " for " + green + "10000 coins" + resetikB + "!!!!");
                    System.out.println("");
                    System.out.println(blue + "Buy stuff by entering number of item " + resetikB + "or To " + red + "exit press 5..." + resetikB);

                    int buyCheck = scanner.nextInt();
                    scanner.nextLine();

                    if (buyCheck == 1) {
                        if (coins >= 100) {

                            coins -= 100;
                            item1 = 1;
                            System.out.println(green + "You successfully bought an Remember range" + resetikB);

                        } else {
                            System.out.println(red + "You do not have enough money you poor rat :< " + resetikB);
                        }
                    } else if (buyCheck == 2) {
                        if (coins >= 400) {

                            coins -= 400;
                            item2 = 1;
                            System.out.println(green + "You successfully bought an Number convertor" + resetikB);

                        } else {
                            System.out.println(red + "You do not have enough money you poor rat :< " + resetikB);
                        }
                    } else if (buyCheck == 3) {

                        if (coins >= 10000) {

                            coins -= 10000;
                            item3 = 1;
                            System.out.println(green + "You successfully bought Maturita" + resetikB);

                        } else {
                            System.out.println(red + "You do not have enough money you poor rat :< " + resetikB);
                        }

                    } else if (buyCheck == 5) {
                        break;
                    }

                }
            }

            if (Ychoice == 2) {

                System.out.println(blue + "How many numbers can you remember? More numbers = more coins" + resetikB);
                int ciselZapamatovat = scanner.nextInt();
                scanner.nextLine();

                int[] array = new int[ciselZapamatovat];
                int max = 20;
                int min = 1;

                if (item1 == 1) {

                    System.out.println("What range of numbers do you want?  1 to ? " + red + "( 5 is lowest you can go!! )" + resetikB);
                    max = scanner.nextInt();
                    scanner.nextLine();

                    if (max <= 4) {
                        System.out.println(red + "You failed to listen to instruction dummy....." + resetikB);
                        System.exit(1);
                    }
                }

                for (int i = 0; i < ciselZapamatovat; i++) {
                    int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
                    System.out.print(randomNum);
                    if (i < ciselZapamatovat - 1) {
                        System.out.print(", ");
                    }
                    array[i] = randomNum;

                }
                System.out.println("");

                System.out.println(green + "If you are ready enter random key" + resetikB);
                scanner.nextLine();

                for (int i = 0; i < 400; i++) {
                    System.out.println("");
                }

                System.out.println(blue + "Now type your numbers in order one by one..." + resetikB);
                int pocetChyb = 0;
                for (int i = 0; i < ciselZapamatovat; i++) {
                    int guess = scanner.nextInt();
                    scanner.nextLine();

                    if (guess == array[i]) {
                        continue;
                    } else {
                        pocetChyb++;
                        break;
                    }
                }
                if (pocetChyb == 0) {

                    coins += ciselZapamatovat * ciselZapamatovat;
                    System.out.println(green + "You won " + ciselZapamatovat * ciselZapamatovat + " coins!!!!" + resetikB);


                } else {
                    coins -= 10;
                    System.out.println(red + "You lost 10 coins!!! :< " + resetikB);
                }

            }
            if (Ychoice == 3) {

                while (true) {


                    System.out.println(magenta + "Gamba" + resetikB);

                    System.out.println(
                            blue +
                                    "How many coins you want to bet?" +
                                    resetikB +
                                    " You can go all in by typing " + yellow + "\"ALL IN\" " +
                                    resetikB +
                                    "or " +
                                    red +
                                    "exit with 5");

                    System.out.println(resetikB);


                    String depositX = scanner.nextLine();
                    int deposit = 0;


                    if (depositX.equalsIgnoreCase("ALL IN")) {

                        if (coins > 0) {
                            deposit = coins;
                        }

                    } else if (depositX.equalsIgnoreCase("5")) {

                        break;

                    } else if (!depositX.isEmpty()) {
                        if (coins > 0) {
                            deposit = Integer.parseInt(depositX);
                        }

                    } else {

                        for (int i = 0; i < 30; i++) {
                            System.out.println("");
                        }
                        continue;
                    }

                    if (deposit > coins || coins < 0) {
                        System.out.println(red + "You cant afford this bet :(" + resetikB);
                        continue;
                    }

                    System.out.println(blue + "How risky you want to get? 2 to 100% more risk more you win!!!" + resetikB);

                    int risk = scanner.nextInt();
                    scanner.nextLine();

                    if (risk < 2) {
                        coins -= 20;
                        System.out.println(red + "For not listening fee for 20 coins :(" + resetikB);
                        continue;
                    }

                    System.out.println(blue + "Your guess range: " + resetikB + "1 to " + risk);

                    int guess = scanner.nextInt();

                    if (guess > risk) {
                        coins -= 20;
                        System.out.println(red + "For not listening fee for 20 coins :(" + resetikB);
                    }

                    int min = 1;
                    int max = risk;
                    int randomNum2 = ThreadLocalRandom.current().nextInt(min, max + 1);

                    System.out.println(blue + "Generated num: " + randomNum2 + resetikB);

                    Math.floor(risk);

                    if (
                            randomNum2 == guess
                    ) {

                        int add = deposit * risk;
                        coins += add;
                        System.out.println("");
                        System.out.println(green + "You won " + add + " coins!!!" + resetikB);
                    } else {
                        System.out.println(red + "You lost " + deposit + " coins" + resetikB);

                        coins -= deposit;
                    }

                    scanner.nextLine();
                }

            }
            if (Ychoice == 4) {

                while (true) {

                    System.out.println();
                    System.out.println(lightGreen + "Number convertor" + resetikB);
                    System.out.println();
                    System.out.println("\t1) " + green + "Continue" + resetikB);
                    System.out.println("\t5) " + red + "Exit" + resetikB);
                    int ex = scanner.nextInt();
                    scanner.nextLine();

                    if (ex == 1) {

                        if (item2 == 1) {

                            System.out.println("\t1) To convert " + blue + "binary" + resetikB);
                            System.out.println("\t2) To convert " + yellow + "octal" + resetikB);
                            System.out.println("\t3) To convert " + cyan + "decimal" + resetikB);
                            System.out.println("\t4) To convert" + magenta + " hexadecimal" + resetikB);


                            int numSystem = scanner.nextInt();
                            scanner.nextLine();
                            if (numSystem == 1) {

                                System.out.println("Enter " + blue + "binary number to convert..." + resetikB);

                                String bin = scanner.nextLine();


                                int dec = Integer.parseInt(bin, 2);

                                String hex = Integer.toHexString(dec);
                                String oct = Integer.toOctalString(dec);

                                System.out.println();
                                System.out.println(cyan + "Decimal: " + resetikB + dec);
                                System.out.println(magenta + "Hexadecimal: " + resetikB + hex);
                                System.out.println(yellow + "Octa: " + resetikB + oct);
                                System.out.println("");

                            } else if (numSystem == 2) {

                                System.out.println("Enter " + yellow + "octal " + resetikB + "number to convert...");
                                String oct = scanner.nextLine();

                                int dec = Integer.parseInt(oct, 8);

                                String bin = Integer.toBinaryString(dec);
                                String hex = Integer.toHexString(dec);

                                System.out.println();
                                System.out.println("" + blue + "Binary: " + resetikB + bin);
                                System.out.println(cyan + "Decimal: " + resetikB + dec);
                                System.out.println(magenta+"Hexadecimal: " +resetikB+ hex);
                                System.out.println("");

                            } else if (numSystem == 3) {

                                System.out.println("Enter " + cyan + "decimal " + resetikB + " number to convert...");

                                int dec = scanner.nextInt();

                                String hex = Integer.toHexString(dec);
                                String bin = Integer.toBinaryString(dec);
                                String oct = Integer.toOctalString(dec);

                                System.out.println();
                                System.out.println(blue + "Binary: " + resetikB + bin);
                                System.out.println(magenta+"Hexadecimal: " +resetikB+ hex);
                                System.out.println(yellow+"Octal: " +resetikB+ oct);
                                System.out.println("");

                            } else if (numSystem == 4) {

                                System.out.println("Enter "+magenta+"hexadecimal "+resetikB+"number to convert...");

                                String hex = scanner.nextLine();

                                int dec = Integer.parseInt(hex, 16);

                                String bin = Integer.toBinaryString(dec);
                                String oct = Integer.toOctalString(dec);

                                System.out.println();
                                System.out.println(blue + "Binary: " + resetikB + bin);
                                System.out.println(yellow + "Octa: " + resetikB + oct);
                                System.out.println(cyan + "Decimal: " + resetikB + dec);
                                System.out.println("");

                            } else {
                                System.out.println(red + "Error try again:}" + resetikB);
                            }

                        } else {
                            System.out.println(blue + "Buy in shop...." + resetikB);
                        }

                    } else if (ex == 5) {
                        break;
                    }
                }

            } else if (Ychoice == 5) {
                break;
            }
        }
    }
}