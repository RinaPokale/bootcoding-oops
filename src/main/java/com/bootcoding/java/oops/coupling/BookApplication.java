package com.bootcoding.java.oops.coupling;

public class BookApplication {
    public static void main(String[] args) {
        //dependency - Author
        Author author = new Author();

        author.name = "Bootcoding";
        author.education = "B.E CSE";
        author.phone = 3046303457938L;


        Book book = new Book();
        book.tittle = "Backend Development - Java Addiction";
        book.price = 500;
        book.publisher = "Navneet";
        book.author = author;

        System.out.println("Book Tittle:- " + book.tittle);
        System.out.println("Book Publisher:- " + book.publisher);
        System.out.println("Book price:- " + book.price);
        System.out.println("Book Author's Name:- " + book.author.name);
        System.out.println("Book Author's Education:- " +book.author.education);
        System.out.println("Book Author's phone:- " +book.author.phone);
    }
}
