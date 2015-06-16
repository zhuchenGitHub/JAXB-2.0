package XMLUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import ScoreList.*;
import JAXB.StudentList;

public class XML4 {
	private ObjectFactory of = new ObjectFactory();
	private �γ̳ɼ��б����� type = of.create�γ̳ɼ��б�����();
	private String courseId;
	private �ɼ��������� scoreClass;
	private String studentId;
	private int score;
	private �ɼ����� scoreType;

	public void createXML4() throws JAXBException,
			UnsupportedEncodingException, FileNotFoundException {
		JAXBContext jc = JAXBContext.newInstance(�γ̳ɼ��б�����.class);
		Unmarshaller un = jc.createUnmarshaller();
		�γ̳ɼ��б����� courseScoreList = (�γ̳ɼ��б�����) un
				.unmarshal(new InputStreamReader(new FileInputStream(
						"E:/13-01/jaxbXML/XML3.xml"), "UTF-8"));

		for (�γ̳ɼ����� courseScore : courseScoreList.get�γ̳ɼ�()) {
			courseId = courseScore.get�γ̱��();
			scoreClass = courseScore.get�ɼ�����();
			scoreType = courseScore.get�ɼ�().get(0);
			score = scoreType.get�÷�();
			studentId = scoreType.getѧ��();
			if (scoreClass.value().equals("�����ɼ�") && score < 60) {
				type.get�γ̳ɼ�().add(courseScore);
			} else {
				continue;
			}
		}
		
		Utils utils = new Utils();
		utils.toXML(type, "E:/13-01/jaxbXML/XML4.xml");
	}
}
