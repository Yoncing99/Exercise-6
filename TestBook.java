import java.util.Scanner;

public class TestBook {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        String title, hpBook="";
        double price,hp=0;

        System.out.print("The number of books: ");
        n = sc.nextInt();
        Book [] myLibrary = new Book[n];

        for (int i=0;i<myLibrary.length;i++){
            sc.nextLine();
            System.out.println();
            System.out.print("Title: ");
            title = sc.nextLine();
            System.out.print("Price: ");
            price = sc.nextDouble();

            myLibrary[i] = new Book(title,price);

            if (myLibrary[i].getPrice()>hp){
                hp = myLibrary[i].getPrice();
                hpBook = myLibrary[i].getTitle();
            }
        }
        System.out.printf("%nThe highest price of book : \n"+ "\""+ hpBook +"\""+" which is RM "+"%.2f%n",hp);

        System.out.println("Books with “Java” in title :");
        for(int j=0;j<myLibrary.length;j++){
            if(myLibrary[j].getTitle().indexOf("Java")!=-1)
                System.out.println(myLibrary[j].getTitle());
        }

    }
}

class Book {
    private String title;      //book’s title
    private double price;      //book’s price

    public Book(String t, double p) {
        title = t;
        price = p;
    }
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}