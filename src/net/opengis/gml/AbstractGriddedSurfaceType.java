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
package net.opengis.gml;


/**
 * An XML AbstractGriddedSurfaceType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface AbstractGriddedSurfaceType extends net.opengis.gml.AbstractParametricCurveSurfaceType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AbstractGriddedSurfaceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("abstractgriddedsurfacetypec54ftype");
    
    /**
     * Gets a List of "row" elements
     */
    java.util.List<net.opengis.gml.AbstractGriddedSurfaceType.Row> getRowList();
    
    /**
     * Gets array of all "row" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.AbstractGriddedSurfaceType.Row[] getRowArray();
    
    /**
     * Gets ith "row" element
     */
    net.opengis.gml.AbstractGriddedSurfaceType.Row getRowArray(int i);
    
    /**
     * Returns number of "row" element
     */
    int sizeOfRowArray();
    
    /**
     * Sets array of all "row" element
     */
    void setRowArray(net.opengis.gml.AbstractGriddedSurfaceType.Row[] rowArray);
    
    /**
     * Sets ith "row" element
     */
    void setRowArray(int i, net.opengis.gml.AbstractGriddedSurfaceType.Row row);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "row" element
     */
    net.opengis.gml.AbstractGriddedSurfaceType.Row insertNewRow(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "row" element
     */
    net.opengis.gml.AbstractGriddedSurfaceType.Row addNewRow();
    
    /**
     * Removes the ith "row" element
     */
    void removeRow(int i);
    
    /**
     * Gets the "rows" element
     */
    java.math.BigInteger getRows();
    
    /**
     * Gets (as xml) the "rows" element
     */
    org.apache.xmlbeans.XmlInteger xgetRows();
    
    /**
     * True if has "rows" element
     */
    boolean isSetRows();
    
    /**
     * Sets the "rows" element
     */
    void setRows(java.math.BigInteger rows);
    
    /**
     * Sets (as xml) the "rows" element
     */
    void xsetRows(org.apache.xmlbeans.XmlInteger rows);
    
    /**
     * Unsets the "rows" element
     */
    void unsetRows();
    
    /**
     * Gets the "columns" element
     */
    java.math.BigInteger getColumns();
    
    /**
     * Gets (as xml) the "columns" element
     */
    org.apache.xmlbeans.XmlInteger xgetColumns();
    
    /**
     * True if has "columns" element
     */
    boolean isSetColumns();
    
    /**
     * Sets the "columns" element
     */
    void setColumns(java.math.BigInteger columns);
    
    /**
     * Sets (as xml) the "columns" element
     */
    void xsetColumns(org.apache.xmlbeans.XmlInteger columns);
    
    /**
     * Unsets the "columns" element
     */
    void unsetColumns();
    
    /**
     * An XML row(@http://www.opengis.net/gml).
     *
     * This is a complex type.
     */
    public interface Row extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Row.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("row0595elemtype");
        
        /**
         * Gets the "posList" element
         */
        net.opengis.gml.DirectPositionListType getPosList();
        
        /**
         * True if has "posList" element
         */
        boolean isSetPosList();
        
        /**
         * Sets the "posList" element
         */
        void setPosList(net.opengis.gml.DirectPositionListType posList);
        
        /**
         * Appends and returns a new empty "posList" element
         */
        net.opengis.gml.DirectPositionListType addNewPosList();
        
        /**
         * Unsets the "posList" element
         */
        void unsetPosList();
        
        /**
         * Gets a List of "pos" elements
         */
        java.util.List<net.opengis.gml.DirectPositionType> getPositionList();
        
        /**
         * Gets array of all "pos" elements
         * @deprecated
         */
        @Deprecated
        net.opengis.gml.DirectPositionType[] getPosArray();
        
        /**
         * Gets ith "pos" element
         */
        net.opengis.gml.DirectPositionType getPosArray(int i);
        
        /**
         * Returns number of "pos" element
         */
        int sizeOfPosArray();
        
        /**
         * Sets array of all "pos" element
         */
        void setPosArray(net.opengis.gml.DirectPositionType[] posArray);
        
        /**
         * Sets ith "pos" element
         */
        void setPosArray(int i, net.opengis.gml.DirectPositionType pos);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "pos" element
         */
        net.opengis.gml.DirectPositionType insertNewPos(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "pos" element
         */
        net.opengis.gml.DirectPositionType addNewPos();
        
        /**
         * Removes the ith "pos" element
         */
        void removePos(int i);
        
        /**
         * Gets a List of "pointProperty" elements
         */
        java.util.List<net.opengis.gml.PointPropertyType> getPointPropertyList();
        
        /**
         * Gets array of all "pointProperty" elements
         * @deprecated
         */
        @Deprecated
        net.opengis.gml.PointPropertyType[] getPointPropertyArray();
        
        /**
         * Gets ith "pointProperty" element
         */
        net.opengis.gml.PointPropertyType getPointPropertyArray(int i);
        
        /**
         * Returns number of "pointProperty" element
         */
        int sizeOfPointPropertyArray();
        
        /**
         * Sets array of all "pointProperty" element
         */
        void setPointPropertyArray(net.opengis.gml.PointPropertyType[] pointPropertyArray);
        
        /**
         * Sets ith "pointProperty" element
         */
        void setPointPropertyArray(int i, net.opengis.gml.PointPropertyType pointProperty);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "pointProperty" element
         */
        net.opengis.gml.PointPropertyType insertNewPointProperty(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "pointProperty" element
         */
        net.opengis.gml.PointPropertyType addNewPointProperty();
        
        /**
         * Removes the ith "pointProperty" element
         */
        void removePointProperty(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static net.opengis.gml.AbstractGriddedSurfaceType.Row newInstance() {
              return (net.opengis.gml.AbstractGriddedSurfaceType.Row) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.opengis.gml.AbstractGriddedSurfaceType.Row newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.opengis.gml.AbstractGriddedSurfaceType.Row) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.AbstractGriddedSurfaceType newInstance() {
          return (net.opengis.gml.AbstractGriddedSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.AbstractGriddedSurfaceType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.AbstractGriddedSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.AbstractGriddedSurfaceType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractGriddedSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.AbstractGriddedSurfaceType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractGriddedSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.AbstractGriddedSurfaceType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractGriddedSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.AbstractGriddedSurfaceType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractGriddedSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.AbstractGriddedSurfaceType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractGriddedSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.AbstractGriddedSurfaceType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractGriddedSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.AbstractGriddedSurfaceType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractGriddedSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.AbstractGriddedSurfaceType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractGriddedSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.AbstractGriddedSurfaceType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractGriddedSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.AbstractGriddedSurfaceType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractGriddedSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.AbstractGriddedSurfaceType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractGriddedSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.AbstractGriddedSurfaceType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractGriddedSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.AbstractGriddedSurfaceType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractGriddedSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.AbstractGriddedSurfaceType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractGriddedSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.AbstractGriddedSurfaceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.AbstractGriddedSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.AbstractGriddedSurfaceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.AbstractGriddedSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
