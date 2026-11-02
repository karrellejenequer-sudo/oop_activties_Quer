public class Main1 {

    public static void main(String[] args) {


        Book book1 = new Book(
            "Noli Me Tangere",
            "Jose Rizal",
            "ISBN-001",
            350.00
        );

        Book book2 = new Book(
            "El Filibusterismo",
            "Jose Rizal",
            "ISBN-002",
            320.00
        );

        EBook book3 = new EBook(
            "Florante at Laura",
            "Francisco Balagtas",
            "ISBN-003",
            150.00,
            "PDF"
        );

        System.out.println("===== BOOK INFORMATION =====");

        book1.displayInfo();
        System.out.println();

        book2.displayInfo();
        System.out.println();

        System.out.println("===== E-BOOK =====");

        book3.displayInfo();
        System.out.println();

        book2.setPrice(299.50);

        System.out.println("===== UPDATED INFORMATION =====");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Price: " + book2.getPrice());

    }
}

/*
Reflection Questions:

1. Why is it better to change the price through setPrice()
   instead of making price public?

   Answer:
   It is better to use setPrice() because it protects the price
   from invalid values, such as negative numbers. This is an
   example of encapsulation.

2. Which members does EBook inherit from Book, and which does
   it add on its own?

   Answer:
   EBook inherits the title, author, isbn, price, getters,
   setters, and displayInfo() method from Book. It adds its
   own fileFormat attribute, getter, setter, and overridden
   displayInfo() method.

3. If the library later adds an AudioBook class, how would
   inheritance make that easier?

   Answer:
   AudioBook can extend Book and reuse the existing attributes,
   constructor, getters, setters, and methods from Book. It
   would only need to add its own special attributes and methods.
*/