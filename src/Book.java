public class Book{
    private int id;
    private String title;
    private String author;
    private boolean issued;

    Book(int id,String title,String author){
        this.id = id;
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public boolean isIssued(){
        return issued;
    }

    public void display(){
        String status = issued? "Issued" : "Available";
        System.out.println("ID: "+id
                            +"\nTitle: "+title
                            +"\nAuthor: "+author
                            +"\nStatus: "+status);
    }

    public void issueBook(){

        if(!issued) {
            this.issued = true;
            System.out.println("Book issued successfully");
        }else {
            System.out.println("Book already issued");
        }

    }

    public void returnBook(){

        if(issued) {
            this.issued = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book is already available");
        }

    }

    @Override
    public String toString(){
        String status = issued? "Issued" : "Available";
        return "ID: "+id
                +"\nTitle: "+title
                +"\nAuthor: "+author
                +"\nStatus: "+status;
    }
}