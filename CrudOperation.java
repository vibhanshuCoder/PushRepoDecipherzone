package com.deciphertasks;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class CrudOperation {

    public static List<String> detailList = new ArrayList<>();
    private static String name;
    public static void create()
    {
        System.out.println("Enter Detail :");
        Scanner cSc = new Scanner(System.in);
        name = cSc.nextLine();
        detailList.add(name);
        System.out.println("Record added successfully \n\n");
        home();

    }
    public static void view()
    {

            detailList.forEach(name -> System.out.println(detailList));
            home();

    }
    public static void update()
    {
        System.out.println("detail before update");
        detailList.forEach(name -> System.out.println(detailList));


//            System.out.println("Enter index:");
//            Scanner cSc = new Scanner(System.in);
//            int indexs = cSc.nextInt();
//            System.out.println("Enter new detail:");
//            name = cSc.nextLine();
//            detailList.add(indexs, name);
//            System.out.println("record updated successfully")
            detailList.set(0,"vibhanshusen");
        System.out.println("detail after update");
        detailList.forEach(name -> System.out.println(detailList));
        home();
    }
    public static void delete()
    {
        System.out.println("Enter index id");
        Scanner cSc = new Scanner(System.in);
        int r = cSc.nextInt();
        detailList.remove(r);
        home();
    }
    public static void home()
    {
        System.out.println("""
                -----------------Enter Your Choice-------------------
                create - 1
                view - 2
                update - 3
                delete - 4
                Exit - 5""");
        Scanner cSc = new Scanner(System.in);
        int i = cSc.nextInt();
        switch (i) {
            case 1 -> create();
            case 2 -> view();
            case 3 -> update();
            case 4 -> delete();
            case 5 -> System.out.println("Thanks for using...see you next time");
            default -> System.out.println("Invalid Input");
        }
    }
    public static void main(String[] args){
        home();
    }
}
