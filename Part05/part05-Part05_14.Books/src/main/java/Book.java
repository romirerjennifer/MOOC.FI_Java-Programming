
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
 
    public boolean equals(Object compared){
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Bird, the objects are not equal
        if (!(compared instanceof Book)) {
            return false;
        }

        // convert the object to a Bird object
        Book comparedBook = (Book) compared;

        // if the values of the object variables are equal, the objects are, too
        if(this.name.equals(comparedBook.getName())&&
           this.publicationYear==comparedBook.getPublicationYear()){
            return true;
        }
        return false;
              
    }

}
