package com.todo.menu;
public class Menu {

    public static void displaymenu()
    {
        System.out.println();
        System.out.println("1. Add a new item ( add )");
        System.out.println("2. make item completed ( comp )");
        System.out.println("3. Delete an existing item ( del )");
        System.out.println("4. Update an item  ( edit )");
        System.out.println("5. List all items ( ls )");
        System.out.println("6. List completed items ( ls_comp )");
        System.out.println("7. List all by cate ( ls_cate )");
        System.out.println("8. Find items ( find )");
        System.out.println("9. Find category ( find_cate )");
        System.out.println("10. sort the list by name ( ls_name_asc )");
        System.out.println("11. sort the list by name ( ls_name_desc )");
        System.out.println("12. sort the list by date ( ls_date )");
        System.out.println("13. sort the list by date ( ls_date_desc )");
        System.out.println("14. exit (exit)");
    }
    
    public static void prompt()
    {
    	System.out.println();
        System.out.print("Command > ");
    }
}