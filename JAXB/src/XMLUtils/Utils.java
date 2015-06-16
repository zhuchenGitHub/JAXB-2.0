package XMLUtils;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class Utils {
	public void toXML(Object obj, String path) throws JAXBException {
		File file = new File(path);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		JAXBContext context = JAXBContext.newInstance(obj.getClass());
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(Marshaller.JAXB_FRAGMENT, false);
		marshaller.marshal(obj, file);
	}
	
	public void schemaVerify(String xmlPath, String schemaPath)
			throws Exception {
		SchemaFactory schemaFactory = SchemaFactory
				.newInstance("http://www.w3.org/2001/XMLSchema");
		Schema schema = schemaFactory.newSchema(new File(schemaPath));
		Validator validator = schema.newValidator();
		validator.setErrorHandler(new ErrorHandler() {

			public void warning(SAXParseException exception)
					throws SAXException {
				System.out.println("¾¯¸æ£º" + exception);
			}

			public void fatalError(SAXParseException exception)
					throws SAXException {
				System.out.println("ÖÂÃü£º" + exception);
			}

			public void error(SAXParseException exception) throws SAXException {
				System.out.println("´íÎó£º" + exception);

			}
		});
		validator.validate(new StreamSource(new File(xmlPath)));
	}
}
