/*
 * XML Type:  ParameterValueType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ParameterValueType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML ParameterValueType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface ParameterValueType extends net.opengis.gml.AbstractGeneralParameterValueType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ParameterValueType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("parametervaluetype95f9type");
    
    /**
     * Gets the "value" element
     */
    net.opengis.gml.MeasureType getValue();
    
    /**
     * True if has "value" element
     */
    boolean isSetValue();
    
    /**
     * Sets the "value" element
     */
    void setValue(net.opengis.gml.MeasureType value);
    
    /**
     * Appends and returns a new empty "value" element
     */
    net.opengis.gml.MeasureType addNewValue();
    
    /**
     * Unsets the "value" element
     */
    void unsetValue();
    
    /**
     * Gets the "dmsAngleValue" element
     */
    net.opengis.gml.DMSAngleType getDmsAngleValue();
    
    /**
     * True if has "dmsAngleValue" element
     */
    boolean isSetDmsAngleValue();
    
    /**
     * Sets the "dmsAngleValue" element
     */
    void setDmsAngleValue(net.opengis.gml.DMSAngleType dmsAngleValue);
    
    /**
     * Appends and returns a new empty "dmsAngleValue" element
     */
    net.opengis.gml.DMSAngleType addNewDmsAngleValue();
    
    /**
     * Unsets the "dmsAngleValue" element
     */
    void unsetDmsAngleValue();
    
    /**
     * Gets the "stringValue" element
     */
    java.lang.String getStringValue1();
    
    /**
     * Gets (as xml) the "stringValue" element
     */
    org.apache.xmlbeans.XmlString xgetStringValue1();
    
    /**
     * True if has "stringValue" element
     */
    boolean isSetStringValue1();
    
    /**
     * Sets the "stringValue" element
     */
    void setStringValue1(java.lang.String stringValue1);
    
    /**
     * Sets (as xml) the "stringValue" element
     */
    void xsetStringValue1(org.apache.xmlbeans.XmlString stringValue1);
    
    /**
     * Unsets the "stringValue" element
     */
    void unsetStringValue1();
    
    /**
     * Gets the "integerValue" element
     */
    java.math.BigInteger getIntegerValue();
    
    /**
     * Gets (as xml) the "integerValue" element
     */
    org.apache.xmlbeans.XmlPositiveInteger xgetIntegerValue();
    
    /**
     * True if has "integerValue" element
     */
    boolean isSetIntegerValue();
    
    /**
     * Sets the "integerValue" element
     */
    void setIntegerValue(java.math.BigInteger integerValue);
    
    /**
     * Sets (as xml) the "integerValue" element
     */
    void xsetIntegerValue(org.apache.xmlbeans.XmlPositiveInteger integerValue);
    
    /**
     * Unsets the "integerValue" element
     */
    void unsetIntegerValue();
    
    /**
     * Gets the "booleanValue" element
     */
    boolean getBooleanValue1();
    
    /**
     * Gets (as xml) the "booleanValue" element
     */
    org.apache.xmlbeans.XmlBoolean xgetBooleanValue1();
    
    /**
     * True if has "booleanValue" element
     */
    boolean isSetBooleanValue1();
    
    /**
     * Sets the "booleanValue" element
     */
    void setBooleanValue1(boolean booleanValue1);
    
    /**
     * Sets (as xml) the "booleanValue" element
     */
    void xsetBooleanValue1(org.apache.xmlbeans.XmlBoolean booleanValue1);
    
    /**
     * Unsets the "booleanValue" element
     */
    void unsetBooleanValue1();
    
    /**
     * Gets the "valueList" element
     */
    net.opengis.gml.MeasureListType getValueList();
    
    /**
     * True if has "valueList" element
     */
    boolean isSetValueList();
    
    /**
     * Sets the "valueList" element
     */
    void setValueList(net.opengis.gml.MeasureListType valueList);
    
    /**
     * Appends and returns a new empty "valueList" element
     */
    net.opengis.gml.MeasureListType addNewValueList();
    
    /**
     * Unsets the "valueList" element
     */
    void unsetValueList();
    
    /**
     * Gets the "integerValueList" element
     */
    java.util.List getIntegerValueList();
    
    /**
     * Gets (as xml) the "integerValueList" element
     */
    net.opengis.gml.IntegerList xgetIntegerValueList();
    
    /**
     * True if has "integerValueList" element
     */
    boolean isSetIntegerValueList();
    
    /**
     * Sets the "integerValueList" element
     */
    void setIntegerValueList(java.util.List integerValueList);
    
    /**
     * Sets (as xml) the "integerValueList" element
     */
    void xsetIntegerValueList(net.opengis.gml.IntegerList integerValueList);
    
    /**
     * Unsets the "integerValueList" element
     */
    void unsetIntegerValueList();
    
    /**
     * Gets the "valueFile" element
     */
    java.lang.String getValueFile();
    
    /**
     * Gets (as xml) the "valueFile" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetValueFile();
    
    /**
     * True if has "valueFile" element
     */
    boolean isSetValueFile();
    
    /**
     * Sets the "valueFile" element
     */
    void setValueFile(java.lang.String valueFile);
    
    /**
     * Sets (as xml) the "valueFile" element
     */
    void xsetValueFile(org.apache.xmlbeans.XmlAnyURI valueFile);
    
    /**
     * Unsets the "valueFile" element
     */
    void unsetValueFile();
    
    /**
     * Gets the "valueOfParameter" element
     */
    net.opengis.gml.OperationParameterRefType getValueOfParameter();
    
    /**
     * Sets the "valueOfParameter" element
     */
    void setValueOfParameter(net.opengis.gml.OperationParameterRefType valueOfParameter);
    
    /**
     * Appends and returns a new empty "valueOfParameter" element
     */
    net.opengis.gml.OperationParameterRefType addNewValueOfParameter();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.ParameterValueType newInstance() {
          return (net.opengis.gml.ParameterValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.ParameterValueType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.ParameterValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.ParameterValueType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ParameterValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.ParameterValueType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ParameterValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.ParameterValueType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ParameterValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.ParameterValueType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ParameterValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.ParameterValueType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ParameterValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.ParameterValueType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ParameterValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.ParameterValueType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ParameterValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.ParameterValueType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ParameterValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.ParameterValueType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ParameterValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.ParameterValueType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ParameterValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.ParameterValueType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ParameterValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.ParameterValueType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ParameterValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.ParameterValueType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ParameterValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.ParameterValueType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ParameterValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.ParameterValueType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.ParameterValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.ParameterValueType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.ParameterValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
