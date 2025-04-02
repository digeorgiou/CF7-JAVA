package gr.aueb.cf.xml_excercise.simple_traverse;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;

        try{
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e){
            e.printStackTrace();
        }

        Document document = null;
        /**
         * To DocumentBuilder αντικείμενο έχει τις μεθόδους για parsing:
         * parse(File) Επιστρέφει Document έχοντας κάνει parse τα περιεχόμενα του File
         * parse(URL) Επιστρέφει Document έχοντας κάνει parse τα περιεχόμενα του URL
         * parse(InputStream) Επιστρέφει Document έχοντας κάνει parse τα περιεχόμενα του InputStream
         */

        try{
            document = builder != null ? builder.parse("src/gr/aueb/cf" +
                    "/xml_excercise/simple_traverse/example.xml") : null;
        } catch (SAXException | IOException e){
            e.printStackTrace();
        }

        /**
         * To interface Document (org.w3c.dom):
         * περιέχει την αναπαράσταση του XML εγγράφου ως δένδρο (DOM)
         */

        printNode(document.getDocumentElement(),0);

    }

    public static void printNode(Node node, int level){

        /**
         * To interface Node υλοποιείται από:
         * • Το interface Element (περιτυλίσσει ένα στοιχείο XML)
         * • Το interface Text περιτυλίσσει κείμενο (αλλά προσοχή, και
         *  whitespace μεταξύ διαδοχικών tags).
         *  κοινή μέθοδος και στα δύο είναι η getTextContent().
         *
         *  Το interface Element περιλαμβανει επισης την getTagName().
         */

        if(node instanceof Text) {
            if(!node.getTextContent().trim().equals("")){
                System.out.print(" ".repeat(level));
                System.out.println("text: " + node.getTextContent().trim());
            }
        }
        /**
         * To interface Element:
         * Περιτυλίσσει έναν κόμβο (στοιχείο του XML)
         * Περιέχει λίστα παιδιών που την παίρνουμε με τη μέθοδο:
         */
        else if (node instanceof Element) {
            Element element = (Element) node;
            System.out.print(" ".repeat(level));
            System.out.println("tag: " + element.getTagName());

            /**
             * To interface NodeList:
             * length() Πλήθος στοιχείων λίστας
             * getDocumentElement() Επιστρέφει Element με το στοιχείο-ρίζα
              */
            NodeList children = node.getChildNodes();
            level++;
            for(int i = 0 ; i < children.getLength() ; i++){
                Node child = children.item(i);
                printNode(child,level);
            }
        }
    }
}
