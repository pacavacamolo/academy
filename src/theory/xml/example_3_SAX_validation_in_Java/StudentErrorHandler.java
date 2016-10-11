package theory.xml.example_3_SAX_validation_in_Java;

import org.apache.log4j.Logger;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class StudentErrorHandler extends DefaultHandler {
    // создание регистратора ошибок для пакета by.bsu.valid
    private Logger logger = Logger.getLogger(StudentErrorHandler.class);

    public void warning(SAXParseException e) {
        logger.warn(getLineAddress(e) + "-" + e.getMessage());
    }
    public void error(SAXParseException e) {
        logger.error(getLineAddress(e) + " - " + e.getMessage());
    }
    public void fatalError(SAXParseException e) {
        logger.fatal(getLineAddress(e) + " - " + e.getMessage());
    }
    private String getLineAddress(SAXParseException e) {
// определение строки и столбца ошибки
        return e.getLineNumber() + " : " + e.getColumnNumber();
    }
}