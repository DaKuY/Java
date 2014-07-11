/*
 * An XML document type.
 * Localname: colleagues
 * Namespace: 
 * Java type: andrewNamespace.xsdconfig.ColleaguesDocument
 *
 * Automatically generated - do not modify.
 */
package andrewNamespace.xsdconfig;


/**
 * A document containing one colleagues(@) element.
 *
 * This is a complex type.
 */
public interface ColleaguesDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ColleaguesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s477F0D6FD64261F550E4C033021B8E48").resolveHandle("colleagues47dddoctype");
    
    /**
     * Gets the "colleagues" element
     */
    andrewNamespace.xsdconfig.ColleaguesDocument.Colleagues getColleagues();
    
    /**
     * Sets the "colleagues" element
     */
    void setColleagues(andrewNamespace.xsdconfig.ColleaguesDocument.Colleagues colleagues);
    
    /**
     * Appends and returns a new empty "colleagues" element
     */
    andrewNamespace.xsdconfig.ColleaguesDocument.Colleagues addNewColleagues();
    
    /**
     * An XML colleagues(@).
     *
     * This is a complex type.
     */
    public interface Colleagues extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Colleagues.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s477F0D6FD64261F550E4C033021B8E48").resolveHandle("colleaguesb2adelemtype");
        
        /**
         * Gets a List of "employee" elements
         */
        java.util.List<andrewNamespace.xsdconfig.EmployeeDocument.Employee> getEmployeeList();
        
        /**
         * Gets array of all "employee" elements
         * @deprecated
         */
        @Deprecated
        andrewNamespace.xsdconfig.EmployeeDocument.Employee[] getEmployeeArray();
        
        /**
         * Gets ith "employee" element
         */
        andrewNamespace.xsdconfig.EmployeeDocument.Employee getEmployeeArray(int i);
        
        /**
         * Returns number of "employee" element
         */
        int sizeOfEmployeeArray();
        
        /**
         * Sets array of all "employee" element
         */
        void setEmployeeArray(andrewNamespace.xsdconfig.EmployeeDocument.Employee[] employeeArray);
        
        /**
         * Sets ith "employee" element
         */
        void setEmployeeArray(int i, andrewNamespace.xsdconfig.EmployeeDocument.Employee employee);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "employee" element
         */
        andrewNamespace.xsdconfig.EmployeeDocument.Employee insertNewEmployee(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "employee" element
         */
        andrewNamespace.xsdconfig.EmployeeDocument.Employee addNewEmployee();
        
        /**
         * Removes the ith "employee" element
         */
        void removeEmployee(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static andrewNamespace.xsdconfig.ColleaguesDocument.Colleagues newInstance() {
              return (andrewNamespace.xsdconfig.ColleaguesDocument.Colleagues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static andrewNamespace.xsdconfig.ColleaguesDocument.Colleagues newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (andrewNamespace.xsdconfig.ColleaguesDocument.Colleagues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static andrewNamespace.xsdconfig.ColleaguesDocument newInstance() {
          return (andrewNamespace.xsdconfig.ColleaguesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static andrewNamespace.xsdconfig.ColleaguesDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (andrewNamespace.xsdconfig.ColleaguesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static andrewNamespace.xsdconfig.ColleaguesDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (andrewNamespace.xsdconfig.ColleaguesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static andrewNamespace.xsdconfig.ColleaguesDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (andrewNamespace.xsdconfig.ColleaguesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static andrewNamespace.xsdconfig.ColleaguesDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (andrewNamespace.xsdconfig.ColleaguesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static andrewNamespace.xsdconfig.ColleaguesDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (andrewNamespace.xsdconfig.ColleaguesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static andrewNamespace.xsdconfig.ColleaguesDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (andrewNamespace.xsdconfig.ColleaguesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static andrewNamespace.xsdconfig.ColleaguesDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (andrewNamespace.xsdconfig.ColleaguesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static andrewNamespace.xsdconfig.ColleaguesDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (andrewNamespace.xsdconfig.ColleaguesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static andrewNamespace.xsdconfig.ColleaguesDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (andrewNamespace.xsdconfig.ColleaguesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static andrewNamespace.xsdconfig.ColleaguesDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (andrewNamespace.xsdconfig.ColleaguesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static andrewNamespace.xsdconfig.ColleaguesDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (andrewNamespace.xsdconfig.ColleaguesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static andrewNamespace.xsdconfig.ColleaguesDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (andrewNamespace.xsdconfig.ColleaguesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static andrewNamespace.xsdconfig.ColleaguesDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (andrewNamespace.xsdconfig.ColleaguesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static andrewNamespace.xsdconfig.ColleaguesDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (andrewNamespace.xsdconfig.ColleaguesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static andrewNamespace.xsdconfig.ColleaguesDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (andrewNamespace.xsdconfig.ColleaguesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static andrewNamespace.xsdconfig.ColleaguesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (andrewNamespace.xsdconfig.ColleaguesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static andrewNamespace.xsdconfig.ColleaguesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (andrewNamespace.xsdconfig.ColleaguesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
