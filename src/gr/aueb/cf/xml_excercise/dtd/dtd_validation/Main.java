package gr.aueb.cf.xml_excercise.dtd.dtd_validation;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogRecord;

public class Main {

    public static void main(String[] args) {

        //κανουμε το factory με τον ιδιο τροπο που το καναμε πριν
        //και χρησιμοποιουμε καποιες εξτρα μεθοδους του
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setValidating(true);
        //αγνοει τα κενα μεταξυ των elements
        factory.setIgnoringElementContentWhitespace(true);
        DocumentBuilder builder = null;

        try{
            builder = factory.newDocumentBuilder();
            //φτιαχνουμε ενα ξεχωριστο αντικειμενο τυπου Handler
            Handler handler = new Handler();
            //δηλωνουμε οτι ο builder θα χρησιμοποιησει τον συγκεκριμενο
            // Handler λαθων
            builder.setErrorHandler(handler);
        } catch (ParserConfigurationException e){
            e.printStackTrace();
        }

        Document document = null;

        try{
            //η getResourceAsStream ψαχνει το αρχειο στο ιδιο package με την
            // Main
            InputStream inputStream = Main.class.getResourceAsStream("example.xml");
            document = builder != null ? builder.parse(inputStream) : null;
        } catch (SAXException | IOException e){
            e.printStackTrace();
        }

        //αν καποιο απο τα elements δεν ταιριαζει με αυτο που εχω καθορισει στο
        //dtd αρχειο (πχ nam αντι για name) γινεται throw exception οπως
        // εχουμε ορισει στον Handler. αν το βγαζαμε και απλα τυπωναμε το
        // μηνυμα λαθους θα ετρεχε κανονικα το προγραμμα αφου μας εγραφε στην
        // αρχη τα παρακατω
        // Element type "nam" must be declared.
        //The content of element type "food" must match "(name,price,description,calories)".

        printNode(document.getDocumentElement(),0);
    }

    public static void printNode(Node node, int level) {

        //εδω ελεγχουμε και αν ειναι comment (<!-- comment -->
        if (node instanceof Comment) {
            System.out.print(" ".repeat(level));
            System.out.println("comment: " + node.getTextContent().trim());
        } else if (node instanceof Text) {
            if (!node.getTextContent().trim().equals("")) {
                System.out.print(" ".repeat(level));
                System.out.println("text: " + node.getTextContent().trim());
            }
        } else if (node instanceof Element) {
            Element element = (Element) node;
            System.out.print(" ".repeat(level));
            System.out.println("tag: " + element.getTagName());

            /**
             * εδω ελεγχουμε και τα attributes
             * Το NamedNodeMap έχει παρόμοια συμπεριφορά με την NodeList
             */
            NamedNodeMap attributes = element.getAttributes();
            for (int j = 0; j < attributes.getLength(); j++) {
                Node attribute = attributes.item(j);
                System.out.print(" " + attribute.getNodeName()
                        + "(" + attribute.getNodeValue() + ")");
            }
            System.out.println();

            NodeList children = node.getChildNodes();
            level++;
            for (int i = 0; i < children.getLength(); i++) {
                Node child = children.item(i);
                printNode(child, level);
            }
        }

    }
}
