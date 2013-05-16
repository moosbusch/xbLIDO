/*
 * XML Type:  arcType
 * Namespace: http://www.w3.org/1999/xlink
 * Java type: org.w3.x1999.xlink.ArcType
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xlink;


/**
 * An XML arcType(@http://www.w3.org/1999/xlink).
 *
 * This is a complex type.
 */
public interface ArcType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArcType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("arctype721ctype");
    
    /**
     * Gets a List of "title" elements
     */
    java.util.List<org.w3.x1999.xlink.TitleEltType> getTitleList();
    
    /**
     * Gets array of all "title" elements
     * @deprecated
     */
    @Deprecated
    org.w3.x1999.xlink.TitleEltType[] getTitleArray();
    
    /**
     * Gets ith "title" element
     */
    org.w3.x1999.xlink.TitleEltType getTitleArray(int i);
    
    /**
     * Returns number of "title" element
     */
    int sizeOfTitleArray();
    
    /**
     * Sets array of all "title" element
     */
    void setTitleArray(org.w3.x1999.xlink.TitleEltType[] titleArray);
    
    /**
     * Sets ith "title" element
     */
    void setTitleArray(int i, org.w3.x1999.xlink.TitleEltType title);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "title" element
     */
    org.w3.x1999.xlink.TitleEltType insertNewTitle(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "title" element
     */
    org.w3.x1999.xlink.TitleEltType addNewTitle();
    
    /**
     * Removes the ith "title" element
     */
    void removeTitle(int i);
    
    /**
     * Gets the "type" attribute
     */
    org.w3.x1999.xlink.TypeType.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.w3.x1999.xlink.TypeType xgetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(org.w3.x1999.xlink.TypeType.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.w3.x1999.xlink.TypeType type);
    
    /**
     * Gets the "arcrole" attribute
     */
    java.lang.String getArcrole();
    
    /**
     * Gets (as xml) the "arcrole" attribute
     */
    org.w3.x1999.xlink.ArcroleType xgetArcrole();
    
    /**
     * True if has "arcrole" attribute
     */
    boolean isSetArcrole();
    
    /**
     * Sets the "arcrole" attribute
     */
    void setArcrole(java.lang.String arcrole);
    
    /**
     * Sets (as xml) the "arcrole" attribute
     */
    void xsetArcrole(org.w3.x1999.xlink.ArcroleType arcrole);
    
    /**
     * Unsets the "arcrole" attribute
     */
    void unsetArcrole();
    
    /**
     * Gets the "title" attribute
     */
    java.lang.String getTitle2();
    
    /**
     * Gets (as xml) the "title" attribute
     */
    org.w3.x1999.xlink.TitleAttrType xgetTitle2();
    
    /**
     * True if has "title" attribute
     */
    boolean isSetTitle2();
    
    /**
     * Sets the "title" attribute
     */
    void setTitle2(java.lang.String title2);
    
    /**
     * Sets (as xml) the "title" attribute
     */
    void xsetTitle2(org.w3.x1999.xlink.TitleAttrType title2);
    
    /**
     * Unsets the "title" attribute
     */
    void unsetTitle2();
    
    /**
     * Gets the "show" attribute
     */
    org.w3.x1999.xlink.ShowType.Enum getShow();
    
    /**
     * Gets (as xml) the "show" attribute
     */
    org.w3.x1999.xlink.ShowType xgetShow();
    
    /**
     * True if has "show" attribute
     */
    boolean isSetShow();
    
    /**
     * Sets the "show" attribute
     */
    void setShow(org.w3.x1999.xlink.ShowType.Enum show);
    
    /**
     * Sets (as xml) the "show" attribute
     */
    void xsetShow(org.w3.x1999.xlink.ShowType show);
    
    /**
     * Unsets the "show" attribute
     */
    void unsetShow();
    
    /**
     * Gets the "actuate" attribute
     */
    org.w3.x1999.xlink.ActuateType.Enum getActuate();
    
    /**
     * Gets (as xml) the "actuate" attribute
     */
    org.w3.x1999.xlink.ActuateType xgetActuate();
    
    /**
     * True if has "actuate" attribute
     */
    boolean isSetActuate();
    
    /**
     * Sets the "actuate" attribute
     */
    void setActuate(org.w3.x1999.xlink.ActuateType.Enum actuate);
    
    /**
     * Sets (as xml) the "actuate" attribute
     */
    void xsetActuate(org.w3.x1999.xlink.ActuateType actuate);
    
    /**
     * Unsets the "actuate" attribute
     */
    void unsetActuate();
    
    /**
     * Gets the "from" attribute
     */
    java.lang.String getFrom();
    
    /**
     * Gets (as xml) the "from" attribute
     */
    org.w3.x1999.xlink.FromType xgetFrom();
    
    /**
     * True if has "from" attribute
     */
    boolean isSetFrom();
    
    /**
     * Sets the "from" attribute
     */
    void setFrom(java.lang.String from);
    
    /**
     * Sets (as xml) the "from" attribute
     */
    void xsetFrom(org.w3.x1999.xlink.FromType from);
    
    /**
     * Unsets the "from" attribute
     */
    void unsetFrom();
    
    /**
     * Gets the "to" attribute
     */
    java.lang.String getTo();
    
    /**
     * Gets (as xml) the "to" attribute
     */
    org.w3.x1999.xlink.ToType xgetTo();
    
    /**
     * True if has "to" attribute
     */
    boolean isSetTo();
    
    /**
     * Sets the "to" attribute
     */
    void setTo(java.lang.String to);
    
    /**
     * Sets (as xml) the "to" attribute
     */
    void xsetTo(org.w3.x1999.xlink.ToType to);
    
    /**
     * Unsets the "to" attribute
     */
    void unsetTo();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.x1999.xlink.ArcType newInstance() {
          return (org.w3.x1999.xlink.ArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x1999.xlink.ArcType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x1999.xlink.ArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x1999.xlink.ArcType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xlink.ArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x1999.xlink.ArcType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xlink.ArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x1999.xlink.ArcType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xlink.ArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x1999.xlink.ArcType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xlink.ArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x1999.xlink.ArcType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xlink.ArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x1999.xlink.ArcType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xlink.ArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x1999.xlink.ArcType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xlink.ArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x1999.xlink.ArcType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xlink.ArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x1999.xlink.ArcType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xlink.ArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x1999.xlink.ArcType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xlink.ArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x1999.xlink.ArcType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xlink.ArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x1999.xlink.ArcType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xlink.ArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x1999.xlink.ArcType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xlink.ArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x1999.xlink.ArcType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xlink.ArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.w3.x1999.xlink.ArcType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x1999.xlink.ArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.w3.x1999.xlink.ArcType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x1999.xlink.ArcType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
