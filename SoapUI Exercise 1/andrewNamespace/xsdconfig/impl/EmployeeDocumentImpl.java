/*
 * An XML document type.
 * Localname: employee
 * Namespace: 
 * Java type: andrewNamespace.xsdconfig.EmployeeDocument
 *
 * Automatically generated - do not modify.
 */
package andrewNamespace.xsdconfig.impl;
/**
 * A document containing one employee(@) element.
 *
 * This is a complex type.
 */
public class EmployeeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements andrewNamespace.xsdconfig.EmployeeDocument
{
    private static final long serialVersionUID = 1L;
    
    public EmployeeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMPLOYEE$0 = 
        new javax.xml.namespace.QName("", "employee");
    
    
    /**
     * Gets the "employee" element
     */
    public andrewNamespace.xsdconfig.EmployeeDocument.Employee getEmployee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            andrewNamespace.xsdconfig.EmployeeDocument.Employee target = null;
            target = (andrewNamespace.xsdconfig.EmployeeDocument.Employee)get_store().find_element_user(EMPLOYEE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "employee" element
     */
    public void setEmployee(andrewNamespace.xsdconfig.EmployeeDocument.Employee employee)
    {
        generatedSetterHelperImpl(employee, EMPLOYEE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "employee" element
     */
    public andrewNamespace.xsdconfig.EmployeeDocument.Employee addNewEmployee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            andrewNamespace.xsdconfig.EmployeeDocument.Employee target = null;
            target = (andrewNamespace.xsdconfig.EmployeeDocument.Employee)get_store().add_element_user(EMPLOYEE$0);
            return target;
        }
    }
    /**
     * An XML employee(@).
     *
     * This is a complex type.
     */
    public static class EmployeeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements andrewNamespace.xsdconfig.EmployeeDocument.Employee
    {
        private static final long serialVersionUID = 1L;
        
        public EmployeeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName NICKNAME$2 = 
            new javax.xml.namespace.QName("", "nickname");
        
        
        /**
         * Gets the "name" element
         */
        public andrewNamespace.xsdconfig.NameDocument.Name.Enum getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (andrewNamespace.xsdconfig.NameDocument.Name.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" element
         */
        public andrewNamespace.xsdconfig.NameDocument.Name xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                andrewNamespace.xsdconfig.NameDocument.Name target = null;
                target = (andrewNamespace.xsdconfig.NameDocument.Name)get_store().find_element_user(NAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "name" element
         */
        public void setName(andrewNamespace.xsdconfig.NameDocument.Name.Enum name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                }
                target.setEnumValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" element
         */
        public void xsetName(andrewNamespace.xsdconfig.NameDocument.Name name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                andrewNamespace.xsdconfig.NameDocument.Name target = null;
                target = (andrewNamespace.xsdconfig.NameDocument.Name)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (andrewNamespace.xsdconfig.NameDocument.Name)get_store().add_element_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "nickname" element
         */
        public java.lang.String getNickname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NICKNAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "nickname" element
         */
        public org.apache.xmlbeans.XmlString xgetNickname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NICKNAME$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "nickname" element
         */
        public void setNickname(java.lang.String nickname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NICKNAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NICKNAME$2);
                }
                target.setStringValue(nickname);
            }
        }
        
        /**
         * Sets (as xml) the "nickname" element
         */
        public void xsetNickname(org.apache.xmlbeans.XmlString nickname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NICKNAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NICKNAME$2);
                }
                target.set(nickname);
            }
        }
    }
}
