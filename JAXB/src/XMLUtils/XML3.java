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
	private 课程成绩列表类型 courseScoreList = of.create课程成绩列表类型();
	private 课程成绩类型 courseScore;
	private 成绩性质类型 scoreClass;
	private 成绩类型 s;
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
				scoreClass = 成绩性质类型.平时成绩;
				score = myScore.getNormalScore();
				s = of.create成绩类型();
				s.set学号(stuId);
				s.set得分(score);
				courseScore = of.create课程成绩类型();
				courseScore.set成绩性质(scoreClass);
				courseScore.set课程编号(courseId);
				courseScore.get成绩().add(s);
				courseScoreList.get课程成绩().add(courseScore);

				scoreClass = 成绩性质类型.期末成绩;
				score = myScore.getTestScore();
				s = of.create成绩类型();
				s.set学号(stuId);
				s.set得分(score);
				courseScore = of.create课程成绩类型();
				courseScore.set成绩性质(scoreClass);
				courseScore.set课程编号(courseId);
				courseScore.get成绩().add(s);
				courseScoreList.get课程成绩().add(courseScore);

				scoreClass = 成绩性质类型.总评成绩;
				score = myScore.getFinalScore();
				s = of.create成绩类型();
				s.set学号(stuId);
				s.set得分(score);
				courseScore = of.create课程成绩类型();
				courseScore.set成绩性质(scoreClass);
				courseScore.set课程编号(courseId);
				courseScore.get成绩().add(s);
				courseScoreList.get课程成绩().add(courseScore);
			}
		}

		Utils utils = new Utils();
		utils.toXML(courseScoreList, "E:/13-01/jaxbXML/XML3.xml");

	}
}
