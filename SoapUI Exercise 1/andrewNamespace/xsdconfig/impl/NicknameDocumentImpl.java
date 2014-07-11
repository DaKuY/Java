/*
 * An XML document type.
 * Localname: nickname
 * Namespace: 
 * Java type: andrewNamespace.xsdconfig.NicknameDocument
 *
 * Automatically generated - do not modify.
 */
package andrewNamespace.xsdconfig.impl;
/**
 * A document containing one nickname(@) element.
 *
 * This is a complex type.
 */
public class NicknameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements andrewNamespace.xsdconfig.NicknameDocument
{
    private static final long serialVersionUID = 1L;
    
    public NicknameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NICKNAME$0 = 
        new javax.xml.namespace.QName("", "nickname");
    
    
    /**
     * Gets the "nickname" element
     */
    public java.lang.String getNickname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NICKNAME$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NICKNAME$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NICKNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NICKNAME$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NICKNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NICKNAME$0);
            }
            target.set(nickname);
        }
    }
}
