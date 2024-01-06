package com.bootcoding.java.oops;

//open-closed principle
public class InvoiceDao {
    InvoiceDao invoiceDao;
    InvoiceDao(InvoiceDao invoiceDao){
        this.invoiceDao = invoiceDao;
    }

    public void saveToDatabase(){
        //save into to DB
    }
}


//public class InvoiceDao {
//    InvoiceDao invoiceDao;
//
//    InvoiceDao(InvoiceDao invoiceDao){
//        this.invoiceDao = invoiceDao;
//    }
//
//    public void saveToDatabase(){
//        //save into to DB
//    }
//
//    public void saveToFile(){
//        //save into file
//    }
//}
