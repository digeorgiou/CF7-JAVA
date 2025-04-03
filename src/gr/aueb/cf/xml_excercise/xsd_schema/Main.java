package gr.aueb.cf.xml_excercise.xsd_schema;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setValidating(true);
        factory.setIgnoringElementContentWhitespace(true);
        //απαραιτητες εξτρα τροποποιησεις για να μπορει να διαχειριστει ο
        //κωδικας μας σχηματα.
        factory.setNamespaceAware(true);
        String JAXP_SCHEMA_LANGUAGE = "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
        String W3C_XML_SCHEMA = "http://www.w3.org/2001/XMLSchema";
        factory.setAttribute(JAXP_SCHEMA_LANGUAGE, W3C_XML_SCHEMA);

        DocumentBuilder builder = null;
        try {
            builder = factory.newDocumentBuilder();
            MyHandler handler = new MyHandler();
            builder.setErrorHandler(handler);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        Document document = null;

        try{
            document = builder != null ? builder.parse("src/gr/aueb/cf" +
                    "/xml_excercise/xsd_schema/example.xml") : null;
        } catch (SAXException | IOException e){
            e.printStackTrace();
        }

        printNode(document.getDocumentElement(), 0);
    }

    public static void printNode(Node node, int level) {
        if (node instanceof Comment) {
            System.out.print("  ".repeat(level));
            System.out.println("comment: " + node.getTextContent().trim());
        }
        else if (node instanceof Text) {
            if (!node.getTextContent().trim().equals("")) {
                System.out.print("  ".repeat(level));
                System.out.println("text: " + node.getTextContent().trim());
                //if (node.getTextContent().trim().equals("")) System.out.println("whitespace"); -- no whitespace
            }
        }
        else if (node instanceof Element) {
            Element element = (Element) node;
            System.out.print("  ".repeat(level));
            System.out.print("tag: " + element.getTagName());
            // attributes
            NamedNodeMap attributes = element.getAttributes();
            for (int j=0; j<attributes.getLength(); j++) {
                Node attribute = attributes.item(j);
                System.out.print(" " + attribute.getNodeName() + "(" +
                        attribute.getNodeValue() + ")");
            }
            System.out.println();
            //recursion
            NodeList children  = node.getChildNodes();
            level++;
            for (int i=0; i<children.getLength(); i++) {
                Node child = children.item(i);
                printNode(child, level);
            }
        }
    }

}
