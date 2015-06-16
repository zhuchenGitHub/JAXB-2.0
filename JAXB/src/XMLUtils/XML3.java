package XMLUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import ScoreList.*;
import JAXB.*;
import JAXB.PersonInfo;

public class XML3 {
	private ScoreList.ObjectFactory of = new ScoreList.ObjectFactory();
	private �γ̳ɼ��б����� courseScoreList = of.create�γ̳ɼ��б�����();
	private �γ̳ɼ����� courseScore;
	private �ɼ��������� scoreClass;
	private �ɼ����� s;
	private String stuId;
	private int score;
	private String courseId;

	public void createXML3() throws JAXBException, FileNotFoundException,
			UnsupportedEncodingException {
		JAXBContext jc = JAXBContext.newInstance(StudentList.class);
		Unmarshaller un = jc.createUnmarshaller();
		StudentList studentList = (StudentList) un
				.unmarshal(new InputStreamReader(new FileInputStream(
						"E:/13-01/jaxbXML/XML2.xml"), "UTF-8"));
		for (StudentE studentE : studentList.getStudentE()) {
			JAXB.PersonInfo personInfo = studentE.getPersonInfo();
			stuId = personInfo.getId();
			JAXB.CourseList courseList = studentE.getCourseList();
			for (Course course : courseList.getCourse()) {
				courseId = course.getCourseID();
				JAXB.Score myScore = course.getMyScore();
				scoreClass = �ɼ���������.ƽʱ�ɼ�;
				score = myScore.getNormalScore();
				s = of.create�ɼ�����();
				s.setѧ��(stuId);
				s.set�÷�(score);
				courseScore = of.create�γ̳ɼ�����();
				courseScore.set�ɼ�����(scoreClass);
				courseScore.set�γ̱��(courseId);
				courseScore.get�ɼ�().add(s);
				courseScoreList.get�γ̳ɼ�().add(courseScore);

				scoreClass = �ɼ���������.��ĩ�ɼ�;
				score = myScore.getTestScore();
				s = of.create�ɼ�����();
				s.setѧ��(stuId);
				s.set�÷�(score);
				courseScore = of.create�γ̳ɼ�����();
				courseScore.set�ɼ�����(scoreClass);
				courseScore.set�γ̱��(courseId);
				courseScore.get�ɼ�().add(s);
				courseScoreList.get�γ̳ɼ�().add(courseScore);

				scoreClass = �ɼ���������.�����ɼ�;
				score = myScore.getFinalScore();
				s = of.create�ɼ�����();
				s.setѧ��(stuId);
				s.set�÷�(score);
				courseScore = of.create�γ̳ɼ�����();
				courseScore.set�ɼ�����(scoreClass);
				courseScore.set�γ̱��(courseId);
				courseScore.get�ɼ�().add(s);
				courseScoreList.get�γ̳ɼ�().add(courseScore);
			}
		}

		Utils utils = new Utils();
		utils.toXML(courseScoreList, "E:/13-01/jaxbXML/XML3.xml");

	}
}
