package projects8;

import java.util.ArrayList;
import java.util.Scanner;

class book{
    String bookName;
    int price;
    String author;

    public book(String bookName, int price, String author) {
        this.bookName = bookName;
        this.price = price;
        this.author = author;
    }
}

class reader{
    String bookName;
    String author;
    int price;
    String rname;
    String date;

    public reader(String bookName, String author, int price, String rname, String date) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.rname = rname;
        this.date = date;
    }
}
public class Main {

    public static void main(String[] args) {
        ArrayList<book> books  = new ArrayList<book>();
        ArrayList<reader> read = new ArrayList<reader>();

        System.out.println("WELCOME  TO LIBRARY");
        System.out.println("ENTER YOUR CHOICE");
        System.out.println("ADD BOOK");
        System.out.println("give book to reader");
        System.out.println("view books");
        while (true){
            System.out.println("CHOICE");
            Scanner ip = new Scanner(System.in);
            int c = ip.nextInt();

            switch (c){
                case 1:
                    Scanner b = new Scanner(System.in);
                    System.out.println("Enter details of book");
                    String tempBookName;
                    int tempPrice;
                    String tempAuthor;

                    System.out.println("enter name");
                    tempBookName = b.nextLine();

                    System.out.println("enter author name");
                    tempAuthor = b.nextLine();

                    System.out.println("enter price");
                    tempPrice = b.nextInt();

                    books.add(new book(tempBookName,tempPrice,tempAuthor));
                    break;

                case 2:
                    Scanner r = new Scanner(System.in);

                    String tempReadBookName;
                    String tempReadName;
                    int tempReadPrice;
                    String tempReadAuthor;
                    String tempDate;
                    int n ;


                    System.out.println("enter name of book");
                    tempReadBookName = r.nextLine();

                    System.out.println("enter author name");
                    tempReadAuthor = r.nextLine();

                    System.out.println("enter name of reader");
                    tempReadName = r.nextLine();

                    System.out.println("enter date of taken");
                    tempDate = r.nextLine();

                    System.out.println("enter price");
                    tempReadPrice = r.nextInt();

                    read.add(new reader(tempReadBookName,tempReadAuthor,tempReadPrice,tempReadName,tempDate));
                    System.out.println("enter index of book");
                    n = r.nextInt();
                    try{
                        books.remove(n);
                    }catch(Exception e){
                        System.out.println("Please recheck the index no");
                    }
                    break;
                default:
                    System.out.println("looking forward to the weekend");
                case 3:
                    System.out.println("Coming Soon");
            }
        }
    }
}
