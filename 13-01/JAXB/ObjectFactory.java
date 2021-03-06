//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.16 at 09:43:10 AM CST 
//


package JAXB;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the JAXB package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MyCourse_QNAME = new QName("http://jw.nju.edu.cn/schema", "myCourse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: JAXB
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StudentList }
     * 
     */
    public StudentList createStudentList() {
        return new StudentList();
    }

    /**
     * Create an instance of {@link StudentE }
     * 
     */
    public StudentE createStudentE() {
        return new StudentE();
    }

    /**
     * Create an instance of {@link PersonInfo }
     * 
     */
    public PersonInfo createPersonInfo() {
        return new PersonInfo();
    }

    /**
     * Create an instance of {@link Department }
     * 
     */
    public Department createDepartment() {
        return new Department();
    }

    /**
     * Create an instance of {@link CourseList }
     * 
     */
    public CourseList createCourseList() {
        return new CourseList();
    }

    /**
     * Create an instance of {@link Course }
     * 
     */
    public Course createCourse() {
        return new Course();
    }

    /**
     * Create an instance of {@link MyCourse }
     * 
     */
    public MyCourse createMyCourse() {
        return new MyCourse();
    }

    /**
     * Create an instance of {@link StudentXML }
     * 
     */
    public StudentXML createStudentXML() {
        return new StudentXML();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link Course1 }
     * 
     */
    public Course1 createCourse1() {
        return new Course1();
    }

    /**
     * Create an instance of {@link Score }
     * 
     */
    public Score createScore() {
        return new Score();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MyCourse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "myCourse")
    public JAXBElement<MyCourse> createMyCourse(MyCourse value) {
        return new JAXBElement<MyCourse>(_MyCourse_QNAME, MyCourse.class, null, value);
    }

}
