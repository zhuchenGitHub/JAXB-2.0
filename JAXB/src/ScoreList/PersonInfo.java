//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.16 at 02:07:18 PM CST 
//


package ScoreList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.nju.edu.cn/schema}personID"/>
 *         &lt;element name="name" type="{http://www.nju.edu.cn/schema}personName"/>
 *         &lt;element name="sex" type="{http://www.nju.edu.cn/schema}personsex"/>
 *         &lt;element name="age" type="{http://www.nju.edu.cn/schema}personage"/>
 *         &lt;element ref="{http://www.nju.edu.cn/schema}Department"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "name",
    "sex",
    "age",
    "department"
})
@XmlRootElement(name = "personInfo", namespace = "http://www.nju.edu.cn/schema")
public class PersonInfo {

    @XmlElement(namespace = "http://www.nju.edu.cn/schema", required = true)
    protected String id;
    @XmlElement(namespace = "http://www.nju.edu.cn/schema", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.nju.edu.cn/schema", required = true)
    protected Personsex sex;
    @XmlElement(namespace = "http://www.nju.edu.cn/schema")
    protected int age;
    @XmlElement(name = "Department", namespace = "http://www.nju.edu.cn/schema", required = true)
    protected Department department;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link Personsex }
     *     
     */
    public Personsex getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Personsex }
     *     
     */
    public void setSex(Personsex value) {
        this.sex = value;
    }

    /**
     * Gets the value of the age property.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link Department }
     *     
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link Department }
     *     
     */
    public void setDepartment(Department value) {
        this.department = value;
    }

}