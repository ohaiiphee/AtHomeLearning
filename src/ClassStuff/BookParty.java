package ClassStuff;

public class BookParty {
    public static void main(String[] args) {

        //Tell us why you chose that party

        System.out.println("I chose a book party because I like to read.");

        //Declare variables with meaningful names and appropriate data types

String authorName;
String bookName;
boolean enjoyable;
boolean boring;
boolean wellWritten;
boolean goodBook;

        //Initialize your variables

        authorName = "Jane Austen";
        bookName = "Pride and Prejudice";
        boring = false;
        enjoyable = true;
        wellWritten = true;

        //Create at least 1 logical equation using your variables
        goodBook = wellWritten && enjoyable && !boring;

        //Create and use at least 1 method
        bookResults(bookName, authorName, goodBook);

        //Reassigning variables to use a second time
        bookName = "Wuthering Heights";
        authorName = "Emily Bronte";
        enjoyable = false;
        boring = true;
        wellWritten = true;

        goodBook = wellWritten && enjoyable && !boring;

        bookResults(bookName, authorName, goodBook);




    }

    private static void bookResults(String bookName, String authorName, boolean goodBook) {
        if (goodBook) {
            System.out.println("I like " + bookName + " written by " + authorName + ".");
        } else {
            System.out.println("I don't like " + bookName + " written by " + authorName + ".");
        }
    }
}

