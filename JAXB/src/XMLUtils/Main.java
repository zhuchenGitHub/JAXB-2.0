package XMLUtils;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.xml.bind.JAXBException;

public class Main {
	public static void main(String[] args) {
		// // 生成xml2
		// XML2 x2 = new XML2();
		// try {
		// x2.createXML2();
		// } catch (JAXBException e) {
		// e.printStackTrace();
		// }
		//
		// // 验证xml2
		// Utils u = new Utils();
		// try {
		// u.schemaVerify("E:/13-01/jaxbXML/XML2.xml",
		// "E:/13-01/StudentList.xsd");
		// } catch (Exception e) {
		// e.printStackTrace();
		// }

		// 生成xml3
		// XML3 x3 = new XML3();
		// try {
		// try {
		// x3.createXML3();
		// } catch (UnsupportedEncodingException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// } catch (FileNotFoundException | JAXBException e) {
		// e.printStackTrace();
		// }

		// 验证xml3
		// Utils u = new Utils();
		// try {
		// u.schemaVerify("E:/13-01/jaxbXML/XML3.xml",
		// "E:/13-01/assignment 2/scorelist/ScoreList.xsd");
		// } catch (Exception e) {
		// e.printStackTrace();
		// }

		// 生成xml4
		XML4 x4 = new XML4();
		try {
			try {
				x4.createXML4();
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException | JAXBException e) {
			e.printStackTrace();
		}

		// 验证xml3
		Utils u = new Utils();
		try {
			u.schemaVerify("E:/13-01/jaxbXML/XML4.xml",
					"E:/13-01/assignment 2/scorelist/ScoreList.xsd");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
