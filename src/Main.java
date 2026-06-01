import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter library capacity: ");
        int capacity = sc.nextInt();

        Library library = new Library(capacity);

        while(true){

            System.out.println("\n=== Library Menu ===");
            System.out.println("1.Add Book");
            System.out.println("2.Display Book");
            System.out.println("3.Search Book");
            System.out.println("4.Issue Book");
            System.out.println("5.Return Book");
            System.out.println("6.Delete Book");
            System.out.println("7.Exit");

            System.out.println("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.print("Enter book ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter book name: ");
                    sc.nextLine();
                    String title = sc.nextLine();

                    System.out.print("Enter book author: ");
                    String author = sc.nextLine();

                    Book book = new Book(id,title,author);
                    library.addBook(book);
                    break;

                case 2:

                    library.displayBooks();
                    break;

                case 3:

                    System.out.print("Enter book ID to search book: ");
                    id = sc.nextInt();
                    book = library.searchBook(id);

                    if(book != null){
                        System.out.println(book);
                    }else{
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:

                    System.out.print("Enter book Id to issue: ");
                    id = sc.nextInt();
                    library.issueBook(id);
                    break;

                case 5:

                    System.out.print("Enter book Id to return: ");
                    id = sc.nextInt();
                    library.returnBook(id);
                    break;

                case 6:

                    System.out.print("Enter book Id to delete:");
                    id = sc.nextInt();
                    library.deleteBook(id);
                    break;

                case 7:
                    System.out.println("Thank You For Using Library Management System");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");

            }
        }
    }
}