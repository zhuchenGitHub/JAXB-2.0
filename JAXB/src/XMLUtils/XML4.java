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
	private 课程成绩列表类型 type = of.create课程成绩列表类型();
	private String courseId;
	private 成绩性质类型 scoreClass;
	private String studentId;
	private int score;
	private 成绩类型 scoreType;

	public void createXML4() throws JAXBException,
			UnsupportedEncodingException, FileNotFoundException {
		JAXBContext jc = JAXBContext.newInstance(课程成绩列表类型.class);
		Unmarshaller un = jc.createUnmarshaller();
		课程成绩列表类型 courseScoreList = (课程成绩列表类型) un
				.unmarshal(new InputStreamReader(new FileInputStream(
						"E:/13-01/jaxbXML/XML3.xml"), "UTF-8"));

		for (课程成绩类型 courseScore : courseScoreList.get课程成绩()) {
			courseId = courseScore.get课程编号();
			scoreClass = courseScore.get成绩性质();
			scoreType = courseScore.get成绩().get(0);
			score = scoreType.get得分();
			studentId = scoreType.get学号();
			if (scoreClass.value().equals("总评成绩") && score < 60) {
				type.get课程成绩().add(courseScore);
			} else {
				continue;
			}
		}
		
		Utils utils = new Utils();
		utils.toXML(type, "E:/13-01/jaxbXML/XML4.xml");
	}
}
