package gr.aueb.cf.xml_excercise.simple_crud_actions;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;
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
                    "/xml_excercise/simple_traverse/example.xml") : null;
        } catch (SAXException | IOException e){
            e.printStackTrace();
        }

        Element root = document.getDocumentElement();

        /**
         * το getFirstChild επιστρεφει τον κενο χωρο μεταξυ breakfast και του
         * πρωτου food. οποτε για το πρωτο food παιρνω το nextSibling
         */
        Node firstFood = root.getFirstChild().getNextSibling();

        //αν θελαμε πχ το δευτερο food θα γραφαμε αυτο
        Node secondFood = root.getFirstChild()
                .getNextSibling()
                //το επομενο nextSibling θα μας παει στον κενο χωρο μεταξυ
                //πρωτου και 2ου food, οποτε βαζω 2 nextSibling για να παρω το
                //ιδιο το δευτερο food
                .getNextSibling().getNextSibling();
        System.out.println("Second Food: " + secondFood.getTextContent());

        //make a copy
        Node newFood = firstFood.cloneNode(true);

        //get the last food
        Node lastFood = root.getLastChild().getPreviousSibling();

        //insert the new food before the last food
        root.insertBefore(newFood,lastFood);
        System.out.println(root.getTextContent());

        //save changes

        try {
            Transformer tr = TransformerFactory.newInstance().newTransformer();
            tr.setOutputProperty(OutputKeys.METHOD,"xml");
            tr.setOutputProperty(OutputKeys.ENCODING,"UTF-8");
            tr.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM,"roles.dtd");
            tr.setOutputProperty("{http://xml.apache.org/xslt}indent-amount",
                    "4");

            //send DOM to file
            tr.transform(new DOMSource(root), new StreamResult
                    (new FileOutputStream("src/gr/aueb/cf" +
                            "/xml_excercise/simple_crud_actions/example2.xml")));

        }catch(TransformerException | IOException te){
            System.out.println(te.getMessage());
        }

    }
}
