/*
 * An XML document type.
 * Localname: name
 * Namespace: 
 * Java type: andrewNamespace.xsdconfig.NameDocument
 *
 * Automatically generated - do not modify.
 */
package andrewNamespace.xsdconfig.impl;
/**
 * A document containing one name(@) element.
 *
 * This is a complex type.
 */
public class NameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements andrewNamespace.xsdconfig.NameDocument
{
    private static final long serialVersionUID = 1L;
    
    public NameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    
    
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
     * An XML name(@).
     *
     * This is an atomic type that is a restriction of andrewNamespace.xsdconfig.NameDocument$Name.
     */
    public static class NameImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements andrewNamespace.xsdconfig.NameDocument.Name
    {
        private static final long serialVersionUID = 1L;
        
        public NameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected NameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
