package gr.aueb.cf.xml_excercise.xsd_schema;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class MyHandler implements ErrorHandler {

    public MyHandler() {
    }

    @Override
    public void warning(SAXParseException exception) throws SAXException {
        System.out.println(exception.getMessage());
        throw exception;
    }

    @Override
    public void error(SAXParseException exception) throws SAXException {
        System.out.println(exception.getMessage());
        throw exception;
    }

    @Override
    public void fatalError(SAXParseException exception) throws SAXException {
        System.out.println(exception.getMessage());
        throw exception;
    }
}
