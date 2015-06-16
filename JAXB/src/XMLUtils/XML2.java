package XMLUtils;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

import javax.xml.bind.JAXBException;

import JAXB.*;

public class XML2 {
	public void createXML2() throws JAXBException {
		ObjectFactory of = new ObjectFactory();
		Random random = new Random();

		/*
		 * Student1
		 */

		Department department1 = of.createDepartment();
		DepartmentType departmentType1 = DepartmentType.院系;
		department1.setId(Integer.parseInt("102"));
		department1.setName("软件学院");
		department1.setType(departmentType1);
		department1.setDescription("软件学院介绍");

		PersonInfo personInfo1 = of.createPersonInfo();
		Personsex personsex1 = Personsex.FEMALE;
		personInfo1.setAge(20);
		personInfo1.setDepartment(department1);
		personInfo1.setId("121250049");
		personInfo1.setName("花霞");
		personInfo1.setSex(personsex1);

		int nScore11 = random.nextInt(40);
		int tScore11 = random.nextInt(60);
		Score scoreStudent1Course1 = of.createScore();
		scoreStudent1Course1.setNormalScore(nScore11);
		scoreStudent1Course1.setTestScore(tScore11);
		scoreStudent1Course1.setFinalScore(nScore11 + tScore11);

		Course course11 = of.createCourse();
		course11.setClassRoom("教学楼101");
		course11.setCourseID("000001");
		course11.setCourseName("商务智能");
		course11.setMyScore(scoreStudent1Course1);
		course11.setTeacherName("贝佳");

		int nScore12 = random.nextInt(40);
		int tScore12 = random.nextInt(60);
		Score scoreStudent1Course2 = of.createScore();
		scoreStudent1Course2.setNormalScore(nScore12);
		scoreStudent1Course2.setTestScore(tScore12);
		scoreStudent1Course2.setFinalScore(nScore12 + tScore12);

		Course course12 = of.createCourse();
		course12.setClassRoom("教学楼102");
		course12.setCourseID("000002");
		course12.setCourseName("电子商务");
		course12.setMyScore(scoreStudent1Course2);
		course12.setTeacherName("王金庆");

		int nScore13 = random.nextInt(40);
		int tScore13 = random.nextInt(60);
		Score scoreStudent1Course3 = of.createScore();
		scoreStudent1Course3.setNormalScore(nScore13);
		scoreStudent1Course3.setTestScore(tScore13);
		scoreStudent1Course3.setFinalScore(nScore13 + tScore13);

		Course course13 = of.createCourse();
		course13.setClassRoom("教学楼103");
		course13.setCourseID("000003");
		course13.setCourseName("软件工程");
		course13.setMyScore(scoreStudent1Course3);
		course13.setTeacherName("刘钦");

		int nScore14 = random.nextInt(40);
		int tScore14 = random.nextInt(60);
		Score scoreStudent1Course4 = of.createScore();
		scoreStudent1Course4.setNormalScore(nScore14);
		scoreStudent1Course4.setTestScore(tScore14);
		scoreStudent1Course4.setFinalScore(nScore14 + tScore14);

		Course course14 = of.createCourse();
		course14.setClassRoom("教学楼104");
		course14.setCourseID("000004");
		course14.setCourseName("软件测试");
		course14.setMyScore(scoreStudent1Course4);
		course14.setTeacherName("陈振宇");

		int nScore15 = random.nextInt(40);
		int tScore15 = random.nextInt(60);
		Score scoreStudent1Course5 = of.createScore();
		scoreStudent1Course5.setNormalScore(nScore15);
		scoreStudent1Course5.setTestScore(tScore15);
		scoreStudent1Course5.setFinalScore(nScore15 + tScore15);

		Course course15 = of.createCourse();
		course15.setClassRoom("教学楼105");
		course15.setCourseID("000005");
		course15.setCourseName("人机交互");
		course15.setMyScore(scoreStudent1Course5);
		course15.setTeacherName("冯桂焕");

		CourseList courseList1 = of.createCourseList();
		courseList1.getCourse().add(course11);
		courseList1.getCourse().add(course12);
		courseList1.getCourse().add(course13);
		courseList1.getCourse().add(course14);
		courseList1.getCourse().add(course15);

		StudentE student1 = of.createStudentE();
		student1.setCourseList(courseList1);
		student1.setPersonInfo(personInfo1);
		student1.setStudentNO("1");

		/*
		 * student2
		 */
		Department department2 = of.createDepartment();
		DepartmentType departmentType2 = DepartmentType.院系;
		department2.setId(Integer.parseInt("102"));
		department2.setName("软件学院");
		department2.setType(departmentType2);
		department2.setDescription("软件学院介绍");

		PersonInfo personInfo2 = of.createPersonInfo();
		Personsex personsex2 = Personsex.MALE;
		personInfo2.setAge(20);
		personInfo2.setDepartment(department2);
		personInfo2.setId("121250001");
		personInfo2.setName("姜晓明");
		personInfo2.setSex(personsex2);

		int nScore21 = random.nextInt(40);
		int tScore21 = random.nextInt(60);
		Score scoreStudent2Course1 = of.createScore();
		scoreStudent2Course1.setNormalScore(nScore21);
		scoreStudent2Course1.setTestScore(tScore21);
		scoreStudent2Course1.setFinalScore(nScore21 + tScore21);

		Course course21 = of.createCourse();
		course21.setClassRoom("教学楼101");
		course21.setCourseID("000001");
		course21.setCourseName("商务智能");
		course21.setMyScore(scoreStudent2Course1);
		course21.setTeacherName("贝佳");

		int nScore22 = random.nextInt(40);
		int tScore22 = random.nextInt(60);
		Score scoreStudent2Course2 = of.createScore();
		scoreStudent2Course2.setNormalScore(nScore22);
		scoreStudent2Course2.setTestScore(tScore22);
		scoreStudent2Course2.setFinalScore(nScore22 + tScore22);

		Course course22 = of.createCourse();
		course22.setClassRoom("教学楼102");
		course22.setCourseID("000002");
		course22.setCourseName("电子商务");
		course22.setMyScore(scoreStudent2Course2);
		course22.setTeacherName("王金庆");

		int nScore23 = random.nextInt(40);
		int tScore23 = random.nextInt(60);
		Score scoreStudent2Course3 = of.createScore();
		scoreStudent2Course3.setNormalScore(nScore23);
		scoreStudent2Course3.setTestScore(tScore23);
		scoreStudent2Course3.setFinalScore(nScore23 + tScore23);

		Course course23 = of.createCourse();
		course23.setClassRoom("教学楼103");
		course23.setCourseID("000003");
		course23.setCourseName("软件工程");
		course23.setMyScore(scoreStudent2Course3);
		course23.setTeacherName("刘钦");

		int nScore24 = random.nextInt(40);
		int tScore24 = random.nextInt(60);
		Score scoreStudent2Course4 = of.createScore();
		scoreStudent2Course4.setNormalScore(nScore24);
		scoreStudent2Course4.setTestScore(tScore24);
		scoreStudent2Course4.setFinalScore(nScore24 + tScore24);

		Course course24 = of.createCourse();
		course24.setClassRoom("教学楼104");
		course24.setCourseID("000004");
		course24.setCourseName("软件测试");
		course24.setMyScore(scoreStudent2Course4);
		course24.setTeacherName("陈振宇");

		int nScore25 = random.nextInt(40);
		int tScore25 = random.nextInt(60);
		Score scoreStudent2Course5 = of.createScore();
		scoreStudent2Course5.setNormalScore(nScore25);
		scoreStudent2Course5.setTestScore(tScore25);
		scoreStudent2Course5.setFinalScore(nScore25 + tScore25);

		Course course25 = of.createCourse();
		course25.setClassRoom("教学楼105");
		course25.setCourseID("000005");
		course25.setCourseName("人机交互");
		course25.setMyScore(scoreStudent2Course5);
		course25.setTeacherName("冯桂焕");

		CourseList courseList2 = of.createCourseList();
		courseList2.getCourse().add(course21);
		courseList2.getCourse().add(course22);
		courseList2.getCourse().add(course23);
		courseList2.getCourse().add(course24);
		courseList2.getCourse().add(course25);

		StudentE student2 = of.createStudentE();
		student2.setCourseList(courseList2);
		student2.setPersonInfo(personInfo2);
		student2.setStudentNO("2");

		/*
		 * student3
		 */
		Department department3 = of.createDepartment();
		DepartmentType departmentType3 = DepartmentType.院系;
		department3.setId(Integer.parseInt("102"));
		department3.setName("软件学院");
		department3.setType(departmentType3);
		department3.setDescription("软件学院介绍");

		PersonInfo personInfo3 = of.createPersonInfo();
		Personsex personsex3 = Personsex.MALE;
		personInfo3.setAge(20);
		personInfo3.setDepartment(department3);
		personInfo3.setId("121250002");
		personInfo3.setName("郑轲阳");
		personInfo3.setSex(personsex3);

		int nScore31 = random.nextInt(40);
		int tScore31 = random.nextInt(60);
		Score scoreStudent3Course1 = of.createScore();
		scoreStudent3Course1.setNormalScore(nScore31);
		scoreStudent3Course1.setTestScore(tScore31);
		scoreStudent3Course1.setFinalScore(nScore31 + tScore31);

		Course course31 = of.createCourse();
		course31.setClassRoom("教学楼101");
		course31.setCourseID("000001");
		course31.setCourseName("商务智能");
		course31.setMyScore(scoreStudent3Course1);
		course31.setTeacherName("贝佳");

		int nScore32 = random.nextInt(40);
		int tScore32 = random.nextInt(60);
		Score scoreStudent3Course2 = of.createScore();
		scoreStudent3Course2.setNormalScore(nScore32);
		scoreStudent3Course2.setTestScore(tScore32);
		scoreStudent3Course2.setFinalScore(nScore32 + tScore32);

		Course course32 = of.createCourse();
		course32.setClassRoom("教学楼102");
		course32.setCourseID("000002");
		course32.setCourseName("电子商务");
		course32.setMyScore(scoreStudent3Course2);
		course32.setTeacherName("王金庆");

		int nScore33 = random.nextInt(40);
		int tScore33 = random.nextInt(60);
		Score scoreStudent3Course3 = of.createScore();
		scoreStudent3Course3.setNormalScore(nScore33);
		scoreStudent3Course3.setTestScore(tScore33);
		scoreStudent3Course3.setFinalScore(nScore33 + tScore33);

		Course course33 = of.createCourse();
		course33.setClassRoom("教学楼103");
		course33.setCourseID("000003");
		course33.setCourseName("软件工程");
		course33.setMyScore(scoreStudent3Course3);
		course33.setTeacherName("刘钦");

		int nScore34 = random.nextInt(40);
		int tScore34 = random.nextInt(60);
		Score scoreStudent3Course4 = of.createScore();
		scoreStudent3Course4.setNormalScore(nScore34);
		scoreStudent3Course4.setTestScore(tScore34);
		scoreStudent3Course4.setFinalScore(nScore34 + tScore34);

		Course course34 = of.createCourse();
		course34.setClassRoom("教学楼104");
		course34.setCourseID("000004");
		course34.setCourseName("软件测试");
		course34.setMyScore(scoreStudent3Course4);
		course34.setTeacherName("陈振宇");

		int nScore35 = random.nextInt(40);
		int tScore35 = random.nextInt(60);
		Score scoreStudent3Course5 = of.createScore();
		scoreStudent3Course5.setNormalScore(nScore35);
		scoreStudent3Course5.setTestScore(tScore35);
		scoreStudent3Course5.setFinalScore(nScore35 + tScore35);

		Course course35 = of.createCourse();
		course35.setClassRoom("教学楼105");
		course35.setCourseID("000005");
		course35.setCourseName("人机交互");
		course35.setMyScore(scoreStudent3Course5);
		course35.setTeacherName("冯桂焕");

		CourseList courseList3 = of.createCourseList();
		courseList3.getCourse().add(course31);
		courseList3.getCourse().add(course32);
		courseList3.getCourse().add(course33);
		courseList3.getCourse().add(course34);
		courseList3.getCourse().add(course35);

		StudentE student3 = of.createStudentE();
		student3.setCourseList(courseList3);
		student3.setPersonInfo(personInfo3);
		student3.setStudentNO("3");

		/*
		 * student4
		 */
		Department department4 = of.createDepartment();
		DepartmentType departmentType4 = DepartmentType.院系;
		department4.setId(Integer.parseInt("102"));
		department4.setName("软件学院");
		department4.setType(departmentType4);
		department4.setDescription("软件学院介绍");

		PersonInfo personInfo4 = of.createPersonInfo();
		Personsex personsex4 = Personsex.MALE;
		personInfo4.setAge(20);
		personInfo4.setDepartment(department4);
		personInfo4.setId("121250230");
		personInfo4.setName("朱晨");
		personInfo4.setSex(personsex4);

		int nScore41 = random.nextInt(40);
		int tScore41 = random.nextInt(60);
		Score scoreStudent4Course1 = of.createScore();
		scoreStudent4Course1.setNormalScore(nScore41);
		scoreStudent4Course1.setTestScore(tScore41);
		scoreStudent4Course1.setFinalScore(nScore41 + tScore41);

		Course course41 = of.createCourse();
		course41.setClassRoom("教学楼101");
		course41.setCourseID("000001");
		course41.setCourseName("商务智能");
		course41.setMyScore(scoreStudent4Course1);
		course41.setTeacherName("贝佳");

		int nScore42 = random.nextInt(40);
		int tScore42 = random.nextInt(60);
		Score scoreStudent4Course2 = of.createScore();
		scoreStudent4Course2.setNormalScore(nScore42);
		scoreStudent4Course2.setTestScore(tScore42);
		scoreStudent4Course2.setFinalScore(nScore42 + tScore42);

		Course course42 = of.createCourse();
		course42.setClassRoom("教学楼102");
		course42.setCourseID("000002");
		course42.setCourseName("电子商务");
		course42.setMyScore(scoreStudent4Course2);
		course42.setTeacherName("王金庆");

		int nScore43 = random.nextInt(40);
		int tScore43 = random.nextInt(60);
		Score scoreStudent4Course3 = of.createScore();
		scoreStudent4Course3.setNormalScore(nScore43);
		scoreStudent4Course3.setTestScore(tScore43);
		scoreStudent4Course3.setFinalScore(nScore43 + tScore43);

		Course course43 = of.createCourse();
		course43.setClassRoom("教学楼103");
		course43.setCourseID("000003");
		course43.setCourseName("软件工程");
		course43.setMyScore(scoreStudent4Course3);
		course43.setTeacherName("刘钦");

		int nScore44 = random.nextInt(40);
		int tScore44 = random.nextInt(60);
		Score scoreStudent4Course4 = of.createScore();
		scoreStudent4Course4.setNormalScore(nScore44);
		scoreStudent4Course4.setTestScore(tScore44);
		scoreStudent4Course4.setFinalScore(nScore44 + tScore44);

		Course course44 = of.createCourse();
		course44.setClassRoom("教学楼104");
		course44.setCourseID("000004");
		course44.setCourseName("软件测试");
		course44.setMyScore(scoreStudent4Course4);
		course44.setTeacherName("陈振宇");

		int nScore45 = random.nextInt(40);
		int tScore45 = random.nextInt(60);
		Score scoreStudent4Course5 = of.createScore();
		scoreStudent4Course5.setNormalScore(nScore45);
		scoreStudent4Course5.setTestScore(tScore45);
		scoreStudent4Course5.setFinalScore(nScore45 + tScore45);

		Course course45 = of.createCourse();
		course45.setClassRoom("教学楼105");
		course45.setCourseID("000005");
		course45.setCourseName("人机交互");
		course45.setMyScore(scoreStudent4Course5);
		course45.setTeacherName("冯桂焕");

		CourseList courseList4 = of.createCourseList();
		courseList4.getCourse().add(course41);
		courseList4.getCourse().add(course42);
		courseList4.getCourse().add(course43);
		courseList4.getCourse().add(course44);
		courseList4.getCourse().add(course45);

		StudentE student4 = of.createStudentE();
		student4.setCourseList(courseList4);
		student4.setPersonInfo(personInfo4);
		student4.setStudentNO("4");

		StudentList studentList = of.createStudentList();
		studentList.getStudentE().add(student1);
		studentList.getStudentE().add(student2);
		studentList.getStudentE().add(student3);
		studentList.getStudentE().add(student4);

		Utils utils = new Utils();
		utils.toXML(studentList, "E:/13-01/jaxbXML/XML2.xml");
		
		
	}

}
