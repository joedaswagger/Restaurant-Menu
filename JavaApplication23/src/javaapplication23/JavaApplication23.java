/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.util.Scanner;

/**
 *
 * @author Keshishian Joseph
 * @since 2021/10/08
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner clavier = new Scanner(System.in);
        int loop = 0;
        while (loop == 0) {

            final double frites$ = 2.5;
            final double brochettes$ = 1.25;
            final int Ppizza$ = 8;
            final int Mpizza$ = 12;
            final int burger$ = 7;
            final double macaron$ = 1.25;
            
            int fritesnb = 0;
            int brochettesnb = 0;
            int Ppizzanb = 0;
            int Mpizzanb = 0;
            int burgernb = 0;
            int macaronnb = 0;
            
            int fritestotal = 0;
            int brochettestotal = 0;
            int Ppizzatotal = 0;
            int Mpizzatotal = 0;
            int burgertotal = 0;
            int macarontotal = 0;

            int commande;
            int quantite;
            double totale = 0;
            double rabais = 0;
            int quit;

            System.out.println("***----<>----***");
            System.out.println("* Chez El Jojo *");
            System.out.println("***----<>----***");
            System.out.println("Choisir un item dans le menu");
            System.out.println("----------------------------");
            System.out.println("1- Frite de vers                                2,50$ chacun");
            System.out.println("2- Brochettes mexicaines aux cucarachas         1,25$ chacune");
            System.out.println("3- Pizza aux sauterelles (petite)               8,00$ chacune");
            System.out.println("4- Pizza aux sauterelles (grande)               12,00$ chacune");
            System.out.println("5- Le burger Scarabée                           7,00$ chacun");
            System.out.println("6- Macaron aux grillons                         1,25$ chacune");

            commande = clavier.nextInt();

            if (commande < 1) {
                System.out.println("Votre choix est invalide");
                break;
            } else if (commande > 6) {
                System.out.println("Votre choix est invalide");
                break;
            } else {

                System.out.println("Quelle quantité?");

                quantite = clavier.nextInt();

                switch (commande) {
                    case 1:
                        if (commande == 1) {
                            totale += frites$ * quantite;
                            fritesnb++;
                            fritestotal += quantite;
                        }
                    case 2:
                        if (commande == 2) {
                            totale += brochettes$ * quantite;
                            brochettesnb++;
                            brochettestotal += quantite;
                        }
                    case 3:
                        if (commande == 3) {
                            totale += Ppizza$ * quantite;
                            Ppizzanb++;
                            Ppizzatotal += quantite;
                        }
                    case 4:
                        if (commande == 4) {
                            totale += Mpizza$ * quantite;
                            Mpizzanb++;
                            Mpizzatotal += quantite;
                        }
                    case 5:
                        if (commande == 5) {
                            totale += burger$ * quantite;
                            burgernb++;
                            burgertotal += quantite;
                        }
                    case 6:
                        if (commande == 6) {
                            totale += macaron$ * quantite;
                            macaronnb++;
                            macarontotal += quantite;
                        }
                }

                int compteur = 0;
                while (quantite >= compteur) {
                    System.out.println("***----<>----***");
                    System.out.println("* Chez El Jojo *");
                    System.out.println("***----<>----***");
                    System.out.println("Choisir un item dans le menu");
                    System.out.println("----------------------------");
                    System.out.println("1- Frite de vers                                2,50$ chacun");
                    System.out.println("2- Brochettes mexicaines aux cucarachas         1,25$ chacune");
                    System.out.println("3- Pizza aux sauterelles (petite)               8,00$ chacune");
                    System.out.println("4- Pizza aux sauterelles (grande)               12,00$ chacune");
                    System.out.println("5- Le burger Scarabée                           7,00$ chacun");
                    System.out.println("6- Macaron aux grillons                         1,00$ chacune");
                    System.out.println("7- Générer la facture");
                    compteur++;

                    commande = clavier.nextInt();

                    if (commande == 7) {
                        System.out.println("");
                        System.out.println("Facture");
                        System.out.println("---------------");
                        if (fritesnb > 0) {
                            System.out.println("Frites x " + fritestotal + "               " + fritestotal * frites$);
                        }
                        if (brochettesnb > 0) {
                            System.out.println("Brochettes x " + brochettestotal + "          " + brochettestotal * brochettes$);
                        }
                        if (Ppizzanb > 0) {
                            System.out.println("Petit pizza x " + Ppizzatotal + "              " + Ppizzatotal * Ppizza$);
                        }
                        if (Mpizzanb > 0) {
                            System.out.println("Pizza medium x " + Mpizzatotal + "              " + Mpizzatotal * Mpizza$);
                        }
                        if (burgernb > 0) {
                            System.out.println("Burger x " + burgertotal + "               " + burgertotal * burger$);
                        }
                        if (macaronnb > 0) {
                            System.out.println("Macaron x " + macarontotal + "               " + macarontotal * macaron$);
                        }
                        System.out.println("---------------");
                        System.out.println("Sous-total:              " + totale);
                        if (totale >= 100) {
                            rabais += totale / 100 * 10;
                            System.out.println("Rabais:              " + rabais);
                        } else if (totale >= 50 && totale <= 100) {
                            rabais += totale / 100 * 5;
                            System.out.println("Rabais:              " + rabais);
                        }
                        System.out.println("Taxes:               " + (totale - rabais) / 100 * 15);
                        System.out.println("Prix final:             " + ((totale - rabais) + ((totale - rabais) / 100 * 15)));

                        System.out.println("");

                        System.out.println("Choisir un item dans le menu");
                        System.out.println("----------------------------");
                        System.out.println("1- Nouvelle commande");
                        System.out.println("2- Quitter");

                        quit = clavier.nextInt();

                        if (quit == 1) {

                        } else if (quit == 2) {
                            System.out.println("");
                            System.out.println("Nombre de commandes aujourd'hui: " + compteur);
                            System.out.println("---------------------------------");
                            if (fritesnb > 0) {
                                System.out.println("Frites x " + fritestotal);
                            }
                            if (brochettesnb > 0) {
                                System.out.println("Brochettes x " + brochettestotal);
                            }
                            if (Ppizzanb > 0) {
                                System.out.println("Petit pizza x " + Ppizzatotal);
                            }
                            if (Mpizzanb > 0) {
                                System.out.println("Pizza medium x " + Mpizzatotal);
                            }
                            if (burgernb > 0) {
                                System.out.println("Burger x " + burgertotal);
                            }
                            if (macaronnb > 0) {
                                System.out.println("Macaron x " + macarontotal);
                            }
                            System.out.println("---------------");
                            System.out.println("Au revoir!!!!!");

                            loop++;
                            break;
                        }

                        break;
                    } else if (commande >= 1 && commande <= 6) {
                        System.out.println("Quelle quantité?");
                        quantite = clavier.nextInt();
                        switch (commande) {

                            case 1:
                                if (commande == 1) {
                                    totale += frites$ * quantite;
                                    fritesnb++;
                                    fritestotal += quantite;
                                }
                            case 2:
                                if (commande == 2) {
                                    totale += brochettes$ * quantite;
                                    brochettesnb++;
                                    brochettestotal += quantite;
                                }
                            case 3:
                                if (commande == 3) {
                                    totale += Ppizza$ * quantite;
                                    Ppizzanb++;
                                    Ppizzatotal += quantite;
                                }
                            case 4:
                                if (commande == 4) {
                                    totale += Mpizza$ * quantite;
                                    Mpizzanb++;
                                    Mpizzatotal += quantite;
                                }
                            case 5:
                                if (commande == 5) {
                                    totale += burger$ * quantite;
                                    burgernb++;
                                    burgertotal += quantite;
                                }
                            case 6:
                                if (commande == 6) {
                                    totale += macaron$ * quantite;
                                    macaronnb++;
                                    macarontotal += quantite;
                                }
                                break;
                        }
                    } else {
                        System.out.println("Votre option est invalide");
                        break;
                    }

                }

            }
        }

    }
}
