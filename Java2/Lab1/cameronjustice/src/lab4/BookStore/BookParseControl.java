/*
 * File: BookParseControl
 * Author: Cameron Justice
 * Date: Apr 25, 2017
 * Summary:
*/
package lab4.BookStore;

import java.util.ArrayList;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BookParseControl {

    public ArrayList<Book> parseBookList(){
        try{
            ArrayList<Book> bookList = new ArrayList<>();
            
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            
            DefaultHandler handler = new DefaultHandler(){
                boolean bTitle = false;
                boolean bPrice = false;
                
                String title = null;
                String price = null;
                
                Book newBook = null;
                
                @Override
                public void startElement(String uri, String localName, String qName,
                        Attributes attributes) throws SAXException {
                    
                    if(qName.equalsIgnoreCase("BOOK")){
                        newBook = new Book();
                    }
                    else if(qName.equalsIgnoreCase("TITLE")){
                        bTitle = true;
                    }
                    else if(qName.equalsIgnoreCase("PRICE")){
                        bPrice = true;
                    }
                }
                
                @Override
                public void endElement(String uri, String localName,
                        String qName) throws SAXException {
                    if(qName.equalsIgnoreCase("BOOK")){
                        bookList.add(newBook);
                    }
                }
                
                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                    
                    if(bTitle){
                        newBook.setTitle(new String(ch, start, length));
                        bTitle = false;
                    }
                    else if(bPrice){
                        newBook.setPrice(new String(ch, start, length));
                        bPrice = false;
                    }
                    
                    if(title == null || price == null){
                        
                    }
                }
            };
            
            saxParser.parse("src/lab4/BookStore/BookList.xml", handler);
            
            return bookList;
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
}
