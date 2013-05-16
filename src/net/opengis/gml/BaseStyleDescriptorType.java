/*
 * XML Type:  BaseStyleDescriptorType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.BaseStyleDescriptorType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML BaseStyleDescriptorType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface BaseStyleDescriptorType extends net.opengis.gml.AbstractGMLType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BaseStyleDescriptorType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("basestyledescriptortypeb5a4type");
    
    /**
     * Gets the "spatialResolution" element
     */
    net.opengis.gml.ScaleType getSpatialResolution();
    
    /**
     * True if has "spatialResolution" element
     */
    boolean isSetSpatialResolution();
    
    /**
     * Sets the "spatialResolution" element
     */
    void setSpatialResolution(net.opengis.gml.ScaleType spatialResolution);
    
    /**
     * Appends and returns a new empty "spatialResolution" element
     */
    net.opengis.gml.ScaleType addNewSpatialResolution();
    
    /**
     * Unsets the "spatialResolution" element
     */
    void unsetSpatialResolution();
    
    /**
     * Gets a List of "styleVariation" elements
     */
    java.util.List<net.opengis.gml.StyleVariationType> getStyleVariationList();
    
    /**
     * Gets array of all "styleVariation" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.StyleVariationType[] getStyleVariationArray();
    
    /**
     * Gets ith "styleVariation" element
     */
    net.opengis.gml.StyleVariationType getStyleVariationArray(int i);
    
    /**
     * Returns number of "styleVariation" element
     */
    int sizeOfStyleVariationArray();
    
    /**
     * Sets array of all "styleVariation" element
     */
    void setStyleVariationArray(net.opengis.gml.StyleVariationType[] styleVariationArray);
    
    /**
     * Sets ith "styleVariation" element
     */
    void setStyleVariationArray(int i, net.opengis.gml.StyleVariationType styleVariation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "styleVariation" element
     */
    net.opengis.gml.StyleVariationType insertNewStyleVariation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "styleVariation" element
     */
    net.opengis.gml.StyleVariationType addNewStyleVariation();
    
    /**
     * Removes the ith "styleVariation" element
     */
    void removeStyleVariation(int i);
    
    /**
     * Gets a List of "animate" elements
     */
    java.util.List<org.w3.x2001.smil20.language.AnimateType> getAnimateList();
    
    /**
     * Gets array of all "animate" elements
     * @deprecated
     */
    @Deprecated
    org.w3.x2001.smil20.language.AnimateType[] getAnimateArray();
    
    /**
     * Gets ith "animate" element
     */
    org.w3.x2001.smil20.language.AnimateType getAnimateArray(int i);
    
    /**
     * Returns number of "animate" element
     */
    int sizeOfAnimateArray();
    
    /**
     * Sets array of all "animate" element
     */
    void setAnimateArray(org.w3.x2001.smil20.language.AnimateType[] animateArray);
    
    /**
     * Sets ith "animate" element
     */
    void setAnimateArray(int i, org.w3.x2001.smil20.language.AnimateType animate);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "animate" element
     */
    org.w3.x2001.smil20.language.AnimateType insertNewAnimate(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "animate" element
     */
    org.w3.x2001.smil20.language.AnimateType addNewAnimate();
    
    /**
     * Removes the ith "animate" element
     */
    void removeAnimate(int i);
    
    /**
     * Gets a List of "animateMotion" elements
     */
    java.util.List<org.w3.x2001.smil20.language.AnimateMotionType> getAnimateMotionList();
    
    /**
     * Gets array of all "animateMotion" elements
     * @deprecated
     */
    @Deprecated
    org.w3.x2001.smil20.language.AnimateMotionType[] getAnimateMotionArray();
    
    /**
     * Gets ith "animateMotion" element
     */
    org.w3.x2001.smil20.language.AnimateMotionType getAnimateMotionArray(int i);
    
    /**
     * Returns number of "animateMotion" element
     */
    int sizeOfAnimateMotionArray();
    
    /**
     * Sets array of all "animateMotion" element
     */
    void setAnimateMotionArray(org.w3.x2001.smil20.language.AnimateMotionType[] animateMotionArray);
    
    /**
     * Sets ith "animateMotion" element
     */
    void setAnimateMotionArray(int i, org.w3.x2001.smil20.language.AnimateMotionType animateMotion);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "animateMotion" element
     */
    org.w3.x2001.smil20.language.AnimateMotionType insertNewAnimateMotion(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "animateMotion" element
     */
    org.w3.x2001.smil20.language.AnimateMotionType addNewAnimateMotion();
    
    /**
     * Removes the ith "animateMotion" element
     */
    void removeAnimateMotion(int i);
    
    /**
     * Gets a List of "animateColor" elements
     */
    java.util.List<org.w3.x2001.smil20.language.AnimateColorType> getAnimateColorList();
    
    /**
     * Gets array of all "animateColor" elements
     * @deprecated
     */
    @Deprecated
    org.w3.x2001.smil20.language.AnimateColorType[] getAnimateColorArray();
    
    /**
     * Gets ith "animateColor" element
     */
    org.w3.x2001.smil20.language.AnimateColorType getAnimateColorArray(int i);
    
    /**
     * Returns number of "animateColor" element
     */
    int sizeOfAnimateColorArray();
    
    /**
     * Sets array of all "animateColor" element
     */
    void setAnimateColorArray(org.w3.x2001.smil20.language.AnimateColorType[] animateColorArray);
    
    /**
     * Sets ith "animateColor" element
     */
    void setAnimateColorArray(int i, org.w3.x2001.smil20.language.AnimateColorType animateColor);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "animateColor" element
     */
    org.w3.x2001.smil20.language.AnimateColorType insertNewAnimateColor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "animateColor" element
     */
    org.w3.x2001.smil20.language.AnimateColorType addNewAnimateColor();
    
    /**
     * Removes the ith "animateColor" element
     */
    void removeAnimateColor(int i);
    
    /**
     * Gets a List of "set" elements
     */
    java.util.List<org.w3.x2001.smil20.language.SetType> getSetList();
    
    /**
     * Gets array of all "set" elements
     * @deprecated
     */
    @Deprecated
    org.w3.x2001.smil20.language.SetType[] getSetArray();
    
    /**
     * Gets ith "set" element
     */
    org.w3.x2001.smil20.language.SetType getSetArray(int i);
    
    /**
     * Returns number of "set" element
     */
    int sizeOfSetArray();
    
    /**
     * Sets array of all "set" element
     */
    void setSetArray(org.w3.x2001.smil20.language.SetType[] setArray);
    
    /**
     * Sets ith "set" element
     */
    void setSetArray(int i, org.w3.x2001.smil20.language.SetType set);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "set" element
     */
    org.w3.x2001.smil20.language.SetType insertNewSet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "set" element
     */
    org.w3.x2001.smil20.language.SetType addNewSet();
    
    /**
     * Removes the ith "set" element
     */
    void removeSet(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.BaseStyleDescriptorType newInstance() {
          return (net.opengis.gml.BaseStyleDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.BaseStyleDescriptorType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.BaseStyleDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.BaseStyleDescriptorType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.BaseStyleDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.BaseStyleDescriptorType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.BaseStyleDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.BaseStyleDescriptorType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.BaseStyleDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.BaseStyleDescriptorType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.BaseStyleDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.BaseStyleDescriptorType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.BaseStyleDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.BaseStyleDescriptorType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.BaseStyleDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.BaseStyleDescriptorType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.BaseStyleDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.BaseStyleDescriptorType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.BaseStyleDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.BaseStyleDescriptorType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.BaseStyleDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.BaseStyleDescriptorType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.BaseStyleDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.BaseStyleDescriptorType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.BaseStyleDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.BaseStyleDescriptorType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.BaseStyleDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.BaseStyleDescriptorType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.BaseStyleDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.BaseStyleDescriptorType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.BaseStyleDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.BaseStyleDescriptorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.BaseStyleDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.BaseStyleDescriptorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.BaseStyleDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
