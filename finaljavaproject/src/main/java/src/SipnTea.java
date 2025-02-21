package src;

import javax.swing.JOptionPane;

public class SipnTea {

    //MENU TRANSACTION
    static int trans;
    //PRODUCT CHOICE
    static int choice;
    //CupChoice;
    private static int Cupchoice;

    //Quantity
    static int qty;

    //OrderCost
     static int Order;
    //TOTAL COSTING
   static int OverAllCost;
    // MILKTEA
    static int TotalMilkTea;
    static int TotalWinter;
    static int TotalOreo;
   static  int TotalCaramel;

    //FRUITTEA
   
   
   
    //SMOOTHIE    
   static  int TotalSmoothie;
   static int TotalStrawberry;

    static void DisplayMainMenu() {
        trans = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                   \tMenu Choices 
                                                                   [1] MilkTea              [4] Check Balance
                                                                   [2] Fresh Tea            [5] Payment
                                                                   [3] Smoothie
                                                                   Choose [1 - 3]: """));
        evaluateTrans();
    }

    static void evaluateTrans() {

        do {
            switch (trans) {
                case 1:
                    MilkTea();
                    break;

                case 2:
            
                    break;

                case 3:
                    Smoothie();
                    break;

                case 4:
                    CheckBalance();
                    break;
                default:
                    throw new AssertionError();
            }

        } while (trans < 5);

    }

    int getCup(int a) {
        return this.Cupchoice = a;
    }
    
    //MILKTEA METHOD

   static void showMilkTeaMenu() {
        choice = Integer.parseInt(JOptionPane.showInputDialog(null, "MilkTea Menu Choice"
                + "					 \n[1] Winter Melon"
                + "					 \n[2] Oreo Cheesecake"
                + "					 \n[3] Salted Caramel"
                + "\n[4] Return to the Main Menu"
                + "					\nChoose [1-3]:"));
    }

   static void MilkTea() {

        showMilkTeaMenu();

        do {
            switch (choice) {
                case 1:
                    WinterMelon();
                    break;
                case 2:
                    // OREO CHEESECAKE
                    OreoCheeseCake();
                    break;
                case 3:
                    // SALTED CARAMEL METHOD
                    SaltedCaramel();
                    break;

                case 4:
                    DisplayMainMenu();
                    break;
                default:

                    break;
            }

        } while (choice <= 4);
    }

   //WINTERMELON
   
   static void WinterMelon() {

        Cupchoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Pillar " + 65
                + "\n[2] Classic " + 75
                + "\n[3] Grande Cup " + 85
                + "\n[4] Go Back to Milktea Menu" + "\n"
                + "Choose [1-3]: "));

        evaluateWinterCup();

    }

   static void evaluateWinterCup() {
        int Pillar = 65;
        int Classic = 75;
        int Grande = 85;

        switch (Cupchoice) {
            case 1:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Pillar Cup "
                        + "\nQuantity: "));
                Order = qty * Pillar;
                TotalWinter = Add(TotalWinter, Order);

                System.out.println("TotalWinter " + TotalWinter);
                System.out.println("Order " + Order);

                break;

            case 2:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Classic Cup "
                        + "\nQuantity: "));
                Order = qty * Classic;
                TotalWinter = Add(TotalWinter, Order);

                System.out.println("TotalWinter " + TotalWinter);
                System.out.println("Order " + Order);
                break;

            case 3:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Grande Cup "
                        + "\nQuantity: "));
                Order = qty * Grande;
                TotalWinter = Add(TotalWinter, Order);
                System.out.println("TotalWinter " + TotalWinter);
                System.out.println("Order " + Order);
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "\t \t Returning to MILKTEA Menu", "Return Window", JOptionPane.INFORMATION_MESSAGE);
                showMilkTeaMenu();
                break;

            default:

                throw new AssertionError();
        }

    }
   
   //OREO
    static void OreoCheeseCake() {

        Cupchoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Pillar " + 79
                + "\n[2] Classic " + 89
                + "\n[3] Grande Cup " + 99
                + "\n[4] Go Back to Milktea Menu" + "\n"
                + "Choose [1-3]: "));

        evaluateOreoCup();

    }
   
     static void evaluateOreoCup() {
         
        int Pillar = 79;
        int Classic = 89;
        int Grande = 99;

        switch (Cupchoice) {
            case 1:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Pillar Cup "
                        + "\nQuantity: "));
                Order = qty * Pillar;
                TotalOreo = Add(TotalOreo, Order);

                System.out.println("TotalOreo " + TotalOreo);
                System.out.println("Order " + Order);

                break;

            case 2:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Classic Cup "
                        + "\nQuantity: "));
                Order = qty * Classic;
                TotalOreo = Add(TotalOreo, Order);

                System.out.println("TotalOreo " + TotalWinter);
                System.out.println("Order " + Order);
                break;

            case 3:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Grande Cup "
                        + "\nQuantity: "));
                Order = qty * Grande;
                TotalOreo = Add(TotalOreo, Order);
                System.out.println("TotalOreo " + TotalWinter);
                System.out.println("Order " + Order);
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "\t \t Returning to MILKTEA Menu", "Return Window", JOptionPane.INFORMATION_MESSAGE);
                showMilkTeaMenu();
                break;

            default:

                throw new AssertionError();
        }

    }
   
   
     //SALTED CARAMEL
    static void SaltedCaramel() {

        Cupchoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Pillar " + 75
                + "\n[2] Classic " + 85
                + "\n[3] Grande Cup " + 95
                + "\n[4] Go Back to Milktea Menu" + "\n"
                + "Choose [1-3]: "));

        evaluateSaltedCup();

    }
     
    static void evaluateSaltedCup() {
         
        int Pillar = 75;
        int Classic = 85;
        int Grande = 95;

        switch (Cupchoice) {
            case 1:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Pillar Cup "
                        + "\nQuantity: "));
                Order = qty * Pillar;
                TotalCaramel = Add(TotalCaramel, Order);

                System.out.println("TotalCaramel " + TotalCaramel);
                System.out.println("Order " + Order);

                break;

            case 2:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Classic Cup "
                        + "\nQuantity: "));
                Order = qty * Classic;
                TotalCaramel = Add(TotalCaramel, Order);
                System.out.println("TotalCaramel " + TotalCaramel);
                System.out.println("Order " + Order);
                break;

            case 3:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Grande Cup "
                        + "\nQuantity: "));
                Order = qty * Grande;
                TotalCaramel = Add(TotalCaramel, Order);
                System.out.println("TotalCaramel " + TotalCaramel);
                System.out.println("Order " + Order);
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "\t \t Returning to MILKTEA Menu", "Return Window", JOptionPane.INFORMATION_MESSAGE);
                showMilkTeaMenu();
                break;

            default:

                throw new AssertionError();
        }

    }
   
   
   // SMOOTHIE METHOD

    static void FreshTea() {
        System.out.println("Transaction Choice is FRESH TEA  : " + trans);

    }

   static void showSmoothieMenu() {

        choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Smoothie Menu Choice\n"
                + "					 [1] Strawberry\n"
                + "					 [2] Lemon\n"
                + "					 [3] Mango\n"
                + " [4] Return to the Main Menu\n"
                + "					Choose [1-3]:"));
    }

    static void Smoothie() {

        showSmoothieMenu();

        do {
            switch (choice) {

                case 1:
                    Strawberry();
                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:
                    DisplayMainMenu();
                    break;
            }

        } while (choice <= 4);

    }

    static void Strawberry() {
        Cupchoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Slim " + 90
                + "\n[2] The Usual " + 110
                + "\n[3] Jumbo " + 130
                + "\n[4] Go Back to Milktea Menu" + "\n"
                + "Choose [1-3]: "));
        evaluateStrawberryCup();
    }

    static void evaluateStrawberryCup() {
        int Slim = 90;
        int TheUsual = 110;
        int Jumbo = 130;

        switch (Cupchoice) {
            case 1:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Pillar Cup "
                        + "\nQuantity: "));
                Order = qty * Slim;
                TotalStrawberry = Add(TotalStrawberry, Order);
                System.out.println("TotalStrawberry " + TotalStrawberry);
                System.out.println("Order " + Order);
                break;

            case 2:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Classic Cup "
                        + "\nQuantity: "));
                Order = qty * TheUsual;
                TotalStrawberry = Add(TotalStrawberry, Order);
                System.out.println("TotalStrawberry " + TotalStrawberry);
                break;

            case 3:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Grande Cup "
                        + "\nQuantity: "));
                Order = qty * Jumbo;
                TotalStrawberry = Add(TotalStrawberry, Order);
                System.out.println("TotalStrawberry " + TotalStrawberry);
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "\t \t Returning to MILKTEA Menu", "Return Window", JOptionPane.INFORMATION_MESSAGE);
                Smoothie();
                break;

            default:

                throw new AssertionError();
        }

    }

    static int Add(int a, int b) {
        return a + b;
    }

    static int Add(int a, int b, int c) {
        return a + b + c;
    }

    static void CheckBalance() {

        TotalMilkTea = Add(TotalOreo, TotalCaramel, TotalWinter);
        
        System.out.println("THE TotalMilkTea IS  = " + TotalMilkTea);
        
        

        OverAllCost = Add(TotalSmoothie, TotalMilkTea, TotalCaramel);
        
        System.out.println("THE OVER ALL COMPUTATION IS  = " + OverAllCost);

        JOptionPane.showMessageDialog(null, "\t \t YOUR CURRENT BALANCE IS " + OverAllCost, "Return Window", JOptionPane.INFORMATION_MESSAGE);
        DisplayMainMenu();

    }

}
