public class Library{

    private Book[] books;
    private int count;

    Library(int capacity){
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(Book book){

        if(count < books.length){
            books[count] = book;
            count++;

            System.out.println("Book added successfully");
        }else{
            System.out.println("Library is full");
        }
    }

    public void displayBooks() {

        if(count == 0) {

            System.out.println("Library is empty.");
            return;
        }

        for(int i = 0; i < count; i++) {

            System.out.println(books[i]);
            System.out.println();
        }
    }

    public Book searchBook(int id){

        for(int i = 0; i < count; i++){

            if(books[i].getId() == id){

                return books[i];
            }
        }

        return null;
    }

    public void issueBook(int id){

        Book book = searchBook(id);

        if(book != null){
            book.issueBook();
        }else{
            System.out.println("Book not found.");
        }
    }

    public void returnBook(int id){

        Book book = searchBook(id);

        if(book != null){
            book.returnBook();
        }else{
            System.out.println("Book not found");
        }
    }

    public void deleteBook(int id){

        for(int i = 0; i < count; i++){
            if(books[i].getId() == id){

                for(int j = i; j < count-1; j++){
                    books[j] = books[j+1];
                }

                books[count-1] = null;
                count--;
                System.out.println("Book deleted successfuly.");
                return;
            }
        }

        System.out.println("Book not found.");
    }

}