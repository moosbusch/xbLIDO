/* 
 * Copyright 2013 Gunnar Kappei.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.w3.x1999.xlink;


/**
 * An XML extended(@http://www.w3.org/1999/xlink).
 *
 * This is a complex type.
 */
public interface Extended extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Extended.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("extended39fdtype");
    
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
     * Gets a List of "resource" elements
     */
    java.util.List<org.w3.x1999.xlink.ResourceType> getResourceList();
    
    /**
     * Gets array of all "resource" elements
     * @deprecated
     */
    @Deprecated
    org.w3.x1999.xlink.ResourceType[] getResourceArray();
    
    /**
     * Gets ith "resource" element
     */
    org.w3.x1999.xlink.ResourceType getResourceArray(int i);
    
    /**
     * Returns number of "resource" element
     */
    int sizeOfResourceArray();
    
    /**
     * Sets array of all "resource" element
     */
    void setResourceArray(org.w3.x1999.xlink.ResourceType[] resourceArray);
    
    /**
     * Sets ith "resource" element
     */
    void setResourceArray(int i, org.w3.x1999.xlink.ResourceType resource);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resource" element
     */
    org.w3.x1999.xlink.ResourceType insertNewResource(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resource" element
     */
    org.w3.x1999.xlink.ResourceType addNewResource();
    
    /**
     * Removes the ith "resource" element
     */
    void removeResource(int i);
    
    /**
     * Gets a List of "locator" elements
     */
    java.util.List<org.w3.x1999.xlink.LocatorType> getLocatorList();
    
    /**
     * Gets array of all "locator" elements
     * @deprecated
     */
    @Deprecated
    org.w3.x1999.xlink.LocatorType[] getLocatorArray();
    
    /**
     * Gets ith "locator" element
     */
    org.w3.x1999.xlink.LocatorType getLocatorArray(int i);
    
    /**
     * Returns number of "locator" element
     */
    int sizeOfLocatorArray();
    
    /**
     * Sets array of all "locator" element
     */
    void setLocatorArray(org.w3.x1999.xlink.LocatorType[] locatorArray);
    
    /**
     * Sets ith "locator" element
     */
    void setLocatorArray(int i, org.w3.x1999.xlink.LocatorType locator);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "locator" element
     */
    org.w3.x1999.xlink.LocatorType insertNewLocator(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "locator" element
     */
    org.w3.x1999.xlink.LocatorType addNewLocator();
    
    /**
     * Removes the ith "locator" element
     */
    void removeLocator(int i);
    
    /**
     * Gets a List of "arc" elements
     */
    java.util.List<org.w3.x1999.xlink.ArcType> getArcList();
    
    /**
     * Gets array of all "arc" elements
     * @deprecated
     */
    @Deprecated
    org.w3.x1999.xlink.ArcType[] getArcArray();
    
    /**
     * Gets ith "arc" element
     */
    org.w3.x1999.xlink.ArcType getArcArray(int i);
    
    /**
     * Returns number of "arc" element
     */
    int sizeOfArcArray();
    
    /**
     * Sets array of all "arc" element
     */
    void setArcArray(org.w3.x1999.xlink.ArcType[] arcArray);
    
    /**
     * Sets ith "arc" element
     */
    void setArcArray(int i, org.w3.x1999.xlink.ArcType arc);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "arc" element
     */
    org.w3.x1999.xlink.ArcType insertNewArc(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "arc" element
     */
    org.w3.x1999.xlink.ArcType addNewArc();
    
    /**
     * Removes the ith "arc" element
     */
    void removeArc(int i);
    
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
     * Gets the "role" attribute
     */
    java.lang.String getRole();
    
    /**
     * Gets (as xml) the "role" attribute
     */
    org.w3.x1999.xlink.RoleType xgetRole();
    
    /**
     * True if has "role" attribute
     */
    boolean isSetRole();
    
    /**
     * Sets the "role" attribute
     */
    void setRole(java.lang.String role);
    
    /**
     * Sets (as xml) the "role" attribute
     */
    void xsetRole(org.w3.x1999.xlink.RoleType role);
    
    /**
     * Unsets the "role" attribute
     */
    void unsetRole();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.x1999.xlink.Extended newInstance() {
          return (org.w3.x1999.xlink.Extended) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x1999.xlink.Extended newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x1999.xlink.Extended) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x1999.xlink.Extended parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xlink.Extended) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x1999.xlink.Extended parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xlink.Extended) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x1999.xlink.Extended parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xlink.Extended) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x1999.xlink.Extended parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xlink.Extended) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x1999.xlink.Extended parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xlink.Extended) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x1999.xlink.Extended parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xlink.Extended) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x1999.xlink.Extended parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xlink.Extended) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x1999.xlink.Extended parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xlink.Extended) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x1999.xlink.Extended parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xlink.Extended) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x1999.xlink.Extended parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xlink.Extended) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x1999.xlink.Extended parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xlink.Extended) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x1999.xlink.Extended parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xlink.Extended) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x1999.xlink.Extended parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xlink.Extended) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x1999.xlink.Extended parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xlink.Extended) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.w3.x1999.xlink.Extended parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x1999.xlink.Extended) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.w3.x1999.xlink.Extended parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x1999.xlink.Extended) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
