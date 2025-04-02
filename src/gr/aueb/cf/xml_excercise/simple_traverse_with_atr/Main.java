package gr.aueb.cf.xml_excercise.simple_traverse_with_atr;

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

        try{
            document = builder != null ? builder.parse("src/gr/aueb/cf" +
                    "/xml_excercise/simple_traverse_with_atr/example.xml") :
                    null;
        } catch (SAXException | IOException e){
            e.printStackTrace();
        }


        printNode(document.getDocumentElement(),0);

    }

    public static void printNode(Node node, int level){

        //εδω ελεγχουμε και αν ειναι comment (<!-- comment -->
        if(node instanceof Comment) {
            System.out.print(" ".repeat(level));
            System.out.println("comment: " + node.getTextContent().trim());
        }

        else if(node instanceof Text) {
            if(!node.getTextContent().trim().equals("")){
                System.out.print(" ".repeat(level));
                System.out.println("text: " + node.getTextContent().trim());
            }
        }

        else if (node instanceof Element) {
            Element element = (Element) node;
            System.out.print(" ".repeat(level));
            System.out.println("tag: " + element.getTagName());

            /**
             * εδω ελεγχουμε και τα attributes
             * Το NamedNodeMap έχει παρόμοια συμπεριφορά με την NodeList
             */
            NamedNodeMap attributes = element.getAttributes();
            for(int j=0 ; j < attributes.getLength() ; j++){
                Node attribute = attributes.item(j);
                System.out.print(" " + attribute.getNodeName()
                        + "(" + attribute.getNodeValue() + ")");
            }
            System.out.println();

            NodeList children = node.getChildNodes();
            level++;
            for(int i = 0 ; i < children.getLength() ; i++){
                Node child = children.item(i);
                printNode(child,level);
            }
        }

        /**
         * Ta CDATA:
         * Δεν απαιτούν ειδική διαχείριση
         * Σπάνε το κείμενο που τα περιέχει σε τρία μέρη που
         * μοντελοποιούνται με αντικείμενα Text: Το μέρος πριν τα CDATA, τα
         * CDATA και το μέρος μετά τα CDATA
         */
    }
}
