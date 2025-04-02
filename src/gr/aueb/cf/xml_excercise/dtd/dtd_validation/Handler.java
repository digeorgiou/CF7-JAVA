package gr.aueb.cf.xml_excercise.dtd.dtd_validation;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class Handler implements ErrorHandler {

    public Handler() {
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
