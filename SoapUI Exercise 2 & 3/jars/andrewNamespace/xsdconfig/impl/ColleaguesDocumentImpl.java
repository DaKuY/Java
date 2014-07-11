/*
 * An XML document type.
 * Localname: colleagues
 * Namespace: 
 * Java type: andrewNamespace.xsdconfig.ColleaguesDocument
 *
 * Automatically generated - do not modify.
 */
package andrewNamespace.xsdconfig.impl;
/**
 * A document containing one colleagues(@) element.
 *
 * This is a complex type.
 */
public class ColleaguesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements andrewNamespace.xsdconfig.ColleaguesDocument
{
    private static final long serialVersionUID = 1L;
    
    public ColleaguesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLLEAGUES$0 = 
        new javax.xml.namespace.QName("", "colleagues");
    
    
    /**
     * Gets the "colleagues" element
     */
    public andrewNamespace.xsdconfig.ColleaguesDocument.Colleagues getColleagues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            andrewNamespace.xsdconfig.ColleaguesDocument.Colleagues target = null;
            target = (andrewNamespace.xsdconfig.ColleaguesDocument.Colleagues)get_store().find_element_user(COLLEAGUES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "colleagues" element
     */
    public void setColleagues(andrewNamespace.xsdconfig.ColleaguesDocument.Colleagues colleagues)
    {
        generatedSetterHelperImpl(colleagues, COLLEAGUES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "colleagues" element
     */
    public andrewNamespace.xsdconfig.ColleaguesDocument.Colleagues addNewColleagues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            andrewNamespace.xsdconfig.ColleaguesDocument.Colleagues target = null;
            target = (andrewNamespace.xsdconfig.ColleaguesDocument.Colleagues)get_store().add_element_user(COLLEAGUES$0);
            return target;
        }
    }
    /**
     * An XML colleagues(@).
     *
     * This is a complex type.
     */
    public static class ColleaguesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements andrewNamespace.xsdconfig.ColleaguesDocument.Colleagues
    {
        private static final long serialVersionUID = 1L;
        
        public ColleaguesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EMPLOYEE$0 = 
            new javax.xml.namespace.QName("", "employee");
        
        
        /**
         * Gets a List of "employee" elements
         */
        public java.util.List<andrewNamespace.xsdconfig.EmployeeDocument.Employee> getEmployeeList()
        {
            final class EmployeeList extends java.util.AbstractList<andrewNamespace.xsdconfig.EmployeeDocument.Employee>
            {
                @Override
                public andrewNamespace.xsdconfig.EmployeeDocument.Employee get(int i)
                    { return ColleaguesImpl.this.getEmployeeArray(i); }
                
                @Override
                public andrewNamespace.xsdconfig.EmployeeDocument.Employee set(int i, andrewNamespace.xsdconfig.EmployeeDocument.Employee o)
                {
                    andrewNamespace.xsdconfig.EmployeeDocument.Employee old = ColleaguesImpl.this.getEmployeeArray(i);
                    ColleaguesImpl.this.setEmployeeArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, andrewNamespace.xsdconfig.EmployeeDocument.Employee o)
                    { ColleaguesImpl.this.insertNewEmployee(i).set(o); }
                
                @Override
                public andrewNamespace.xsdconfig.EmployeeDocument.Employee remove(int i)
                {
                    andrewNamespace.xsdconfig.EmployeeDocument.Employee old = ColleaguesImpl.this.getEmployeeArray(i);
                    ColleaguesImpl.this.removeEmployee(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ColleaguesImpl.this.sizeOfEmployeeArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new EmployeeList();
            }
        }
        
        /**
         * Gets array of all "employee" elements
         * @deprecated
         */
        @Deprecated
        public andrewNamespace.xsdconfig.EmployeeDocument.Employee[] getEmployeeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<andrewNamespace.xsdconfig.EmployeeDocument.Employee> targetList = new java.util.ArrayList<andrewNamespace.xsdconfig.EmployeeDocument.Employee>();
                get_store().find_all_element_users(EMPLOYEE$0, targetList);
                andrewNamespace.xsdconfig.EmployeeDocument.Employee[] result = new andrewNamespace.xsdconfig.EmployeeDocument.Employee[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "employee" element
         */
        public andrewNamespace.xsdconfig.EmployeeDocument.Employee getEmployeeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                andrewNamespace.xsdconfig.EmployeeDocument.Employee target = null;
                target = (andrewNamespace.xsdconfig.EmployeeDocument.Employee)get_store().find_element_user(EMPLOYEE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "employee" element
         */
        public int sizeOfEmployeeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMPLOYEE$0);
            }
        }
        
        /**
         * Sets array of all "employee" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setEmployeeArray(andrewNamespace.xsdconfig.EmployeeDocument.Employee[] employeeArray)
        {
            check_orphaned();
            arraySetterHelper(employeeArray, EMPLOYEE$0);
        }
        
        /**
         * Sets ith "employee" element
         */
        public void setEmployeeArray(int i, andrewNamespace.xsdconfig.EmployeeDocument.Employee employee)
        {
            generatedSetterHelperImpl(employee, EMPLOYEE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "employee" element
         */
        public andrewNamespace.xsdconfig.EmployeeDocument.Employee insertNewEmployee(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                andrewNamespace.xsdconfig.EmployeeDocument.Employee target = null;
                target = (andrewNamespace.xsdconfig.EmployeeDocument.Employee)get_store().insert_element_user(EMPLOYEE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "employee" element
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
         * Removes the ith "employee" element
         */
        public void removeEmployee(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMPLOYEE$0, i);
            }
        }
    }
}
