/*
 * XML Type:  resourceSetComplexType
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.ResourceSetComplexType
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema;


/**
 * An XML resourceSetComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public interface ResourceSetComplexType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResourceSetComplexType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("resourcesetcomplextype60d4type");
    
    /**
     * Gets the "resourceID" element
     */
    org.lidoSchema.IdentifierComplexType getResourceID();
    
    /**
     * True if has "resourceID" element
     */
    boolean isSetResourceID();
    
    /**
     * Sets the "resourceID" element
     */
    void setResourceID(org.lidoSchema.IdentifierComplexType resourceID);
    
    /**
     * Appends and returns a new empty "resourceID" element
     */
    org.lidoSchema.IdentifierComplexType addNewResourceID();
    
    /**
     * Unsets the "resourceID" element
     */
    void unsetResourceID();
    
    /**
     * Gets a List of "resourceRepresentation" elements
     */
    java.util.List<org.lidoSchema.ResourceSetComplexType.ResourceRepresentation> getResourceRepresentationList();
    
    /**
     * Gets array of all "resourceRepresentation" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.ResourceSetComplexType.ResourceRepresentation[] getResourceRepresentationArray();
    
    /**
     * Gets ith "resourceRepresentation" element
     */
    org.lidoSchema.ResourceSetComplexType.ResourceRepresentation getResourceRepresentationArray(int i);
    
    /**
     * Returns number of "resourceRepresentation" element
     */
    int sizeOfResourceRepresentationArray();
    
    /**
     * Sets array of all "resourceRepresentation" element
     */
    void setResourceRepresentationArray(org.lidoSchema.ResourceSetComplexType.ResourceRepresentation[] resourceRepresentationArray);
    
    /**
     * Sets ith "resourceRepresentation" element
     */
    void setResourceRepresentationArray(int i, org.lidoSchema.ResourceSetComplexType.ResourceRepresentation resourceRepresentation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resourceRepresentation" element
     */
    org.lidoSchema.ResourceSetComplexType.ResourceRepresentation insertNewResourceRepresentation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resourceRepresentation" element
     */
    org.lidoSchema.ResourceSetComplexType.ResourceRepresentation addNewResourceRepresentation();
    
    /**
     * Removes the ith "resourceRepresentation" element
     */
    void removeResourceRepresentation(int i);
    
    /**
     * Gets the "resourceType" element
     */
    org.lidoSchema.ConceptComplexType getResourceType();
    
    /**
     * True if has "resourceType" element
     */
    boolean isSetResourceType();
    
    /**
     * Sets the "resourceType" element
     */
    void setResourceType(org.lidoSchema.ConceptComplexType resourceType);
    
    /**
     * Appends and returns a new empty "resourceType" element
     */
    org.lidoSchema.ConceptComplexType addNewResourceType();
    
    /**
     * Unsets the "resourceType" element
     */
    void unsetResourceType();
    
    /**
     * Gets a List of "resourceRelType" elements
     */
    java.util.List<org.lidoSchema.ConceptComplexType> getResourceRelTypeList();
    
    /**
     * Gets array of all "resourceRelType" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.ConceptComplexType[] getResourceRelTypeArray();
    
    /**
     * Gets ith "resourceRelType" element
     */
    org.lidoSchema.ConceptComplexType getResourceRelTypeArray(int i);
    
    /**
     * Returns number of "resourceRelType" element
     */
    int sizeOfResourceRelTypeArray();
    
    /**
     * Sets array of all "resourceRelType" element
     */
    void setResourceRelTypeArray(org.lidoSchema.ConceptComplexType[] resourceRelTypeArray);
    
    /**
     * Sets ith "resourceRelType" element
     */
    void setResourceRelTypeArray(int i, org.lidoSchema.ConceptComplexType resourceRelType);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resourceRelType" element
     */
    org.lidoSchema.ConceptComplexType insertNewResourceRelType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resourceRelType" element
     */
    org.lidoSchema.ConceptComplexType addNewResourceRelType();
    
    /**
     * Removes the ith "resourceRelType" element
     */
    void removeResourceRelType(int i);
    
    /**
     * Gets a List of "resourcePerspective" elements
     */
    java.util.List<org.lidoSchema.ConceptComplexType> getResourcePerspectiveList();
    
    /**
     * Gets array of all "resourcePerspective" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.ConceptComplexType[] getResourcePerspectiveArray();
    
    /**
     * Gets ith "resourcePerspective" element
     */
    org.lidoSchema.ConceptComplexType getResourcePerspectiveArray(int i);
    
    /**
     * Returns number of "resourcePerspective" element
     */
    int sizeOfResourcePerspectiveArray();
    
    /**
     * Sets array of all "resourcePerspective" element
     */
    void setResourcePerspectiveArray(org.lidoSchema.ConceptComplexType[] resourcePerspectiveArray);
    
    /**
     * Sets ith "resourcePerspective" element
     */
    void setResourcePerspectiveArray(int i, org.lidoSchema.ConceptComplexType resourcePerspective);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resourcePerspective" element
     */
    org.lidoSchema.ConceptComplexType insertNewResourcePerspective(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resourcePerspective" element
     */
    org.lidoSchema.ConceptComplexType addNewResourcePerspective();
    
    /**
     * Removes the ith "resourcePerspective" element
     */
    void removeResourcePerspective(int i);
    
    /**
     * Gets a List of "resourceDescription" elements
     */
    java.util.List<org.lidoSchema.ResourceSetComplexType.ResourceDescription> getResourceDescriptionList();
    
    /**
     * Gets array of all "resourceDescription" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.ResourceSetComplexType.ResourceDescription[] getResourceDescriptionArray();
    
    /**
     * Gets ith "resourceDescription" element
     */
    org.lidoSchema.ResourceSetComplexType.ResourceDescription getResourceDescriptionArray(int i);
    
    /**
     * Returns number of "resourceDescription" element
     */
    int sizeOfResourceDescriptionArray();
    
    /**
     * Sets array of all "resourceDescription" element
     */
    void setResourceDescriptionArray(org.lidoSchema.ResourceSetComplexType.ResourceDescription[] resourceDescriptionArray);
    
    /**
     * Sets ith "resourceDescription" element
     */
    void setResourceDescriptionArray(int i, org.lidoSchema.ResourceSetComplexType.ResourceDescription resourceDescription);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resourceDescription" element
     */
    org.lidoSchema.ResourceSetComplexType.ResourceDescription insertNewResourceDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resourceDescription" element
     */
    org.lidoSchema.ResourceSetComplexType.ResourceDescription addNewResourceDescription();
    
    /**
     * Removes the ith "resourceDescription" element
     */
    void removeResourceDescription(int i);
    
    /**
     * Gets the "resourceDateTaken" element
     */
    org.lidoSchema.DateSetComplexType getResourceDateTaken();
    
    /**
     * True if has "resourceDateTaken" element
     */
    boolean isSetResourceDateTaken();
    
    /**
     * Sets the "resourceDateTaken" element
     */
    void setResourceDateTaken(org.lidoSchema.DateSetComplexType resourceDateTaken);
    
    /**
     * Appends and returns a new empty "resourceDateTaken" element
     */
    org.lidoSchema.DateSetComplexType addNewResourceDateTaken();
    
    /**
     * Unsets the "resourceDateTaken" element
     */
    void unsetResourceDateTaken();
    
    /**
     * Gets a List of "resourceSource" elements
     */
    java.util.List<org.lidoSchema.ResourceSetComplexType.ResourceSource> getResourceSourceList();
    
    /**
     * Gets array of all "resourceSource" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.ResourceSetComplexType.ResourceSource[] getResourceSourceArray();
    
    /**
     * Gets ith "resourceSource" element
     */
    org.lidoSchema.ResourceSetComplexType.ResourceSource getResourceSourceArray(int i);
    
    /**
     * Returns number of "resourceSource" element
     */
    int sizeOfResourceSourceArray();
    
    /**
     * Sets array of all "resourceSource" element
     */
    void setResourceSourceArray(org.lidoSchema.ResourceSetComplexType.ResourceSource[] resourceSourceArray);
    
    /**
     * Sets ith "resourceSource" element
     */
    void setResourceSourceArray(int i, org.lidoSchema.ResourceSetComplexType.ResourceSource resourceSource);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resourceSource" element
     */
    org.lidoSchema.ResourceSetComplexType.ResourceSource insertNewResourceSource(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resourceSource" element
     */
    org.lidoSchema.ResourceSetComplexType.ResourceSource addNewResourceSource();
    
    /**
     * Removes the ith "resourceSource" element
     */
    void removeResourceSource(int i);
    
    /**
     * Gets a List of "rightsResource" elements
     */
    java.util.List<org.lidoSchema.ResourceSetComplexType.RightsResource> getRightsResourceList();
    
    /**
     * Gets array of all "rightsResource" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.ResourceSetComplexType.RightsResource[] getRightsResourceArray();
    
    /**
     * Gets ith "rightsResource" element
     */
    org.lidoSchema.ResourceSetComplexType.RightsResource getRightsResourceArray(int i);
    
    /**
     * Returns number of "rightsResource" element
     */
    int sizeOfRightsResourceArray();
    
    /**
     * Sets array of all "rightsResource" element
     */
    void setRightsResourceArray(org.lidoSchema.ResourceSetComplexType.RightsResource[] rightsResourceArray);
    
    /**
     * Sets ith "rightsResource" element
     */
    void setRightsResourceArray(int i, org.lidoSchema.ResourceSetComplexType.RightsResource rightsResource);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rightsResource" element
     */
    org.lidoSchema.ResourceSetComplexType.RightsResource insertNewRightsResource(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rightsResource" element
     */
    org.lidoSchema.ResourceSetComplexType.RightsResource addNewRightsResource();
    
    /**
     * Removes the ith "rightsResource" element
     */
    void removeRightsResource(int i);
    
    /**
     * An XML resourceRepresentation(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface ResourceRepresentation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResourceRepresentation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("resourcerepresentation926belemtype");
        
        /**
         * Gets the "linkResource" element
         */
        org.lidoSchema.ResourceSetComplexType.ResourceRepresentation.LinkResource getLinkResource();
        
        /**
         * Sets the "linkResource" element
         */
        void setLinkResource(org.lidoSchema.ResourceSetComplexType.ResourceRepresentation.LinkResource linkResource);
        
        /**
         * Appends and returns a new empty "linkResource" element
         */
        org.lidoSchema.ResourceSetComplexType.ResourceRepresentation.LinkResource addNewLinkResource();
        
        /**
         * Gets a List of "resourceMeasurementsSet" elements
         */
        java.util.List<org.lidoSchema.MeasurementsSetComplexType> getResourceMeasurementsSetList();
        
        /**
         * Gets array of all "resourceMeasurementsSet" elements
         * @deprecated
         */
        @Deprecated
        org.lidoSchema.MeasurementsSetComplexType[] getResourceMeasurementsSetArray();
        
        /**
         * Gets ith "resourceMeasurementsSet" element
         */
        org.lidoSchema.MeasurementsSetComplexType getResourceMeasurementsSetArray(int i);
        
        /**
         * Returns number of "resourceMeasurementsSet" element
         */
        int sizeOfResourceMeasurementsSetArray();
        
        /**
         * Sets array of all "resourceMeasurementsSet" element
         */
        void setResourceMeasurementsSetArray(org.lidoSchema.MeasurementsSetComplexType[] resourceMeasurementsSetArray);
        
        /**
         * Sets ith "resourceMeasurementsSet" element
         */
        void setResourceMeasurementsSetArray(int i, org.lidoSchema.MeasurementsSetComplexType resourceMeasurementsSet);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceMeasurementsSet" element
         */
        org.lidoSchema.MeasurementsSetComplexType insertNewResourceMeasurementsSet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceMeasurementsSet" element
         */
        org.lidoSchema.MeasurementsSetComplexType addNewResourceMeasurementsSet();
        
        /**
         * Removes the ith "resourceMeasurementsSet" element
         */
        void removeResourceMeasurementsSet(int i);
        
        /**
         * Gets the "type" attribute
         */
        java.lang.String getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        org.apache.xmlbeans.XmlString xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(java.lang.String type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(org.apache.xmlbeans.XmlString type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
        /**
         * An XML linkResource(@http://www.lido-schema.org).
         *
         * This is an atomic type that is a restriction of org.lidoSchema.ResourceSetComplexType$ResourceRepresentation$LinkResource.
         */
        public interface LinkResource extends org.lidoSchema.WebResourceComplexType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LinkResource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("linkresource2e27elemtype");
            
            /**
             * Gets the "codecResource" attribute
             */
            java.lang.String getCodecResource();
            
            /**
             * Gets (as xml) the "codecResource" attribute
             */
            org.apache.xmlbeans.XmlString xgetCodecResource();
            
            /**
             * True if has "codecResource" attribute
             */
            boolean isSetCodecResource();
            
            /**
             * Sets the "codecResource" attribute
             */
            void setCodecResource(java.lang.String codecResource);
            
            /**
             * Sets (as xml) the "codecResource" attribute
             */
            void xsetCodecResource(org.apache.xmlbeans.XmlString codecResource);
            
            /**
             * Unsets the "codecResource" attribute
             */
            void unsetCodecResource();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.lidoSchema.ResourceSetComplexType.ResourceRepresentation.LinkResource newInstance() {
                  return (org.lidoSchema.ResourceSetComplexType.ResourceRepresentation.LinkResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.lidoSchema.ResourceSetComplexType.ResourceRepresentation.LinkResource newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.lidoSchema.ResourceSetComplexType.ResourceRepresentation.LinkResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.lidoSchema.ResourceSetComplexType.ResourceRepresentation newInstance() {
              return (org.lidoSchema.ResourceSetComplexType.ResourceRepresentation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.ResourceSetComplexType.ResourceRepresentation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.ResourceSetComplexType.ResourceRepresentation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML resourceDescription(@http://www.lido-schema.org).
     *
     * This is an atomic type that is a restriction of org.lidoSchema.ResourceSetComplexType$ResourceDescription.
     */
    public interface ResourceDescription extends org.lidoSchema.TextComplexType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResourceDescription.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("resourcedescriptionab4eelemtype");
        
        /**
         * Gets the "type" attribute
         */
        java.lang.String getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        org.apache.xmlbeans.XmlString xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(java.lang.String type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(org.apache.xmlbeans.XmlString type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
        /**
         * Gets the "sortorder" attribute
         */
        java.math.BigInteger getSortorder();
        
        /**
         * Gets (as xml) the "sortorder" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetSortorder();
        
        /**
         * True if has "sortorder" attribute
         */
        boolean isSetSortorder();
        
        /**
         * Sets the "sortorder" attribute
         */
        void setSortorder(java.math.BigInteger sortorder);
        
        /**
         * Sets (as xml) the "sortorder" attribute
         */
        void xsetSortorder(org.apache.xmlbeans.XmlInteger sortorder);
        
        /**
         * Unsets the "sortorder" attribute
         */
        void unsetSortorder();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.lidoSchema.ResourceSetComplexType.ResourceDescription newInstance() {
              return (org.lidoSchema.ResourceSetComplexType.ResourceDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.ResourceSetComplexType.ResourceDescription newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.ResourceSetComplexType.ResourceDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML resourceSource(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface ResourceSource extends org.lidoSchema.LegalBodyRefComplexType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResourceSource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("resourcesourcedcb9elemtype");
        
        /**
         * Gets the "type" attribute
         */
        java.lang.String getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        org.apache.xmlbeans.XmlString xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(java.lang.String type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(org.apache.xmlbeans.XmlString type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
        /**
         * Gets the "sortorder" attribute
         */
        java.math.BigInteger getSortorder();
        
        /**
         * Gets (as xml) the "sortorder" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetSortorder();
        
        /**
         * True if has "sortorder" attribute
         */
        boolean isSetSortorder();
        
        /**
         * Sets the "sortorder" attribute
         */
        void setSortorder(java.math.BigInteger sortorder);
        
        /**
         * Sets (as xml) the "sortorder" attribute
         */
        void xsetSortorder(org.apache.xmlbeans.XmlInteger sortorder);
        
        /**
         * Unsets the "sortorder" attribute
         */
        void unsetSortorder();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.lidoSchema.ResourceSetComplexType.ResourceSource newInstance() {
              return (org.lidoSchema.ResourceSetComplexType.ResourceSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.ResourceSetComplexType.ResourceSource newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.ResourceSetComplexType.ResourceSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML rightsResource(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface RightsResource extends org.lidoSchema.RightsComplexType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RightsResource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("rightsresource83f5elemtype");
        
        /**
         * Gets the "sortorder" attribute
         */
        java.math.BigInteger getSortorder();
        
        /**
         * Gets (as xml) the "sortorder" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetSortorder();
        
        /**
         * True if has "sortorder" attribute
         */
        boolean isSetSortorder();
        
        /**
         * Sets the "sortorder" attribute
         */
        void setSortorder(java.math.BigInteger sortorder);
        
        /**
         * Sets (as xml) the "sortorder" attribute
         */
        void xsetSortorder(org.apache.xmlbeans.XmlInteger sortorder);
        
        /**
         * Unsets the "sortorder" attribute
         */
        void unsetSortorder();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.lidoSchema.ResourceSetComplexType.RightsResource newInstance() {
              return (org.lidoSchema.ResourceSetComplexType.RightsResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.ResourceSetComplexType.RightsResource newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.ResourceSetComplexType.RightsResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.ResourceSetComplexType newInstance() {
          return (org.lidoSchema.ResourceSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.ResourceSetComplexType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.ResourceSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.ResourceSetComplexType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ResourceSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.ResourceSetComplexType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ResourceSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.ResourceSetComplexType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ResourceSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.ResourceSetComplexType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ResourceSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.ResourceSetComplexType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ResourceSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.ResourceSetComplexType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ResourceSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.ResourceSetComplexType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ResourceSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.ResourceSetComplexType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ResourceSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.ResourceSetComplexType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ResourceSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.ResourceSetComplexType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ResourceSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.ResourceSetComplexType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ResourceSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.ResourceSetComplexType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ResourceSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.ResourceSetComplexType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ResourceSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.ResourceSetComplexType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ResourceSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.ResourceSetComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.ResourceSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.ResourceSetComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.ResourceSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
