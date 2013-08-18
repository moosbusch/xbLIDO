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
package org.lidoSchema;


/**
 * An XML eventComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public interface EventComplexType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventComplexType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("eventcomplextypefebatype");
    
    /**
     * Gets a List of "eventID" elements
     */
    java.util.List<org.lidoSchema.IdentifierComplexType> getEventIDList();
    
    /**
     * Gets array of all "eventID" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.IdentifierComplexType[] getEventIDArray();
    
    /**
     * Gets ith "eventID" element
     */
    org.lidoSchema.IdentifierComplexType getEventIDArray(int i);
    
    /**
     * Returns number of "eventID" element
     */
    int sizeOfEventIDArray();
    
    /**
     * Sets array of all "eventID" element
     */
    void setEventIDArray(org.lidoSchema.IdentifierComplexType[] eventIDArray);
    
    /**
     * Sets ith "eventID" element
     */
    void setEventIDArray(int i, org.lidoSchema.IdentifierComplexType eventID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventID" element
     */
    org.lidoSchema.IdentifierComplexType insertNewEventID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eventID" element
     */
    org.lidoSchema.IdentifierComplexType addNewEventID();
    
    /**
     * Removes the ith "eventID" element
     */
    void removeEventID(int i);
    
    /**
     * Gets the "eventType" element
     */
    org.lidoSchema.ConceptComplexType getEventType();
    
    /**
     * Sets the "eventType" element
     */
    void setEventType(org.lidoSchema.ConceptComplexType eventType);
    
    /**
     * Appends and returns a new empty "eventType" element
     */
    org.lidoSchema.ConceptComplexType addNewEventType();
    
    /**
     * Gets a List of "roleInEvent" elements
     */
    java.util.List<org.lidoSchema.ConceptComplexType> getRoleInEventList();
    
    /**
     * Gets array of all "roleInEvent" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.ConceptComplexType[] getRoleInEventArray();
    
    /**
     * Gets ith "roleInEvent" element
     */
    org.lidoSchema.ConceptComplexType getRoleInEventArray(int i);
    
    /**
     * Returns number of "roleInEvent" element
     */
    int sizeOfRoleInEventArray();
    
    /**
     * Sets array of all "roleInEvent" element
     */
    void setRoleInEventArray(org.lidoSchema.ConceptComplexType[] roleInEventArray);
    
    /**
     * Sets ith "roleInEvent" element
     */
    void setRoleInEventArray(int i, org.lidoSchema.ConceptComplexType roleInEvent);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "roleInEvent" element
     */
    org.lidoSchema.ConceptComplexType insertNewRoleInEvent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "roleInEvent" element
     */
    org.lidoSchema.ConceptComplexType addNewRoleInEvent();
    
    /**
     * Removes the ith "roleInEvent" element
     */
    void removeRoleInEvent(int i);
    
    /**
     * Gets a List of "eventName" elements
     */
    java.util.List<org.lidoSchema.AppellationComplexType> getEventNameList();
    
    /**
     * Gets array of all "eventName" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.AppellationComplexType[] getEventNameArray();
    
    /**
     * Gets ith "eventName" element
     */
    org.lidoSchema.AppellationComplexType getEventNameArray(int i);
    
    /**
     * Returns number of "eventName" element
     */
    int sizeOfEventNameArray();
    
    /**
     * Sets array of all "eventName" element
     */
    void setEventNameArray(org.lidoSchema.AppellationComplexType[] eventNameArray);
    
    /**
     * Sets ith "eventName" element
     */
    void setEventNameArray(int i, org.lidoSchema.AppellationComplexType eventName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventName" element
     */
    org.lidoSchema.AppellationComplexType insertNewEventName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eventName" element
     */
    org.lidoSchema.AppellationComplexType addNewEventName();
    
    /**
     * Removes the ith "eventName" element
     */
    void removeEventName(int i);
    
    /**
     * Gets a List of "eventActor" elements
     */
    java.util.List<org.lidoSchema.EventComplexType.EventActor> getEventActorList();
    
    /**
     * Gets array of all "eventActor" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.EventComplexType.EventActor[] getEventActorArray();
    
    /**
     * Gets ith "eventActor" element
     */
    org.lidoSchema.EventComplexType.EventActor getEventActorArray(int i);
    
    /**
     * Returns number of "eventActor" element
     */
    int sizeOfEventActorArray();
    
    /**
     * Sets array of all "eventActor" element
     */
    void setEventActorArray(org.lidoSchema.EventComplexType.EventActor[] eventActorArray);
    
    /**
     * Sets ith "eventActor" element
     */
    void setEventActorArray(int i, org.lidoSchema.EventComplexType.EventActor eventActor);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventActor" element
     */
    org.lidoSchema.EventComplexType.EventActor insertNewEventActor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eventActor" element
     */
    org.lidoSchema.EventComplexType.EventActor addNewEventActor();
    
    /**
     * Removes the ith "eventActor" element
     */
    void removeEventActor(int i);
    
    /**
     * Gets a List of "culture" elements
     */
    java.util.List<org.lidoSchema.EventComplexType.Culture> getCultureList();
    
    /**
     * Gets array of all "culture" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.EventComplexType.Culture[] getCultureArray();
    
    /**
     * Gets ith "culture" element
     */
    org.lidoSchema.EventComplexType.Culture getCultureArray(int i);
    
    /**
     * Returns number of "culture" element
     */
    int sizeOfCultureArray();
    
    /**
     * Sets array of all "culture" element
     */
    void setCultureArray(org.lidoSchema.EventComplexType.Culture[] cultureArray);
    
    /**
     * Sets ith "culture" element
     */
    void setCultureArray(int i, org.lidoSchema.EventComplexType.Culture culture);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "culture" element
     */
    org.lidoSchema.EventComplexType.Culture insertNewCulture(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "culture" element
     */
    org.lidoSchema.EventComplexType.Culture addNewCulture();
    
    /**
     * Removes the ith "culture" element
     */
    void removeCulture(int i);
    
    /**
     * Gets the "eventDate" element
     */
    org.lidoSchema.DateSetComplexType getEventDate();
    
    /**
     * True if has "eventDate" element
     */
    boolean isSetEventDate();
    
    /**
     * Sets the "eventDate" element
     */
    void setEventDate(org.lidoSchema.DateSetComplexType eventDate);
    
    /**
     * Appends and returns a new empty "eventDate" element
     */
    org.lidoSchema.DateSetComplexType addNewEventDate();
    
    /**
     * Unsets the "eventDate" element
     */
    void unsetEventDate();
    
    /**
     * Gets a List of "periodName" elements
     */
    java.util.List<org.lidoSchema.EventComplexType.PeriodName> getPeriodNameList();
    
    /**
     * Gets array of all "periodName" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.EventComplexType.PeriodName[] getPeriodNameArray();
    
    /**
     * Gets ith "periodName" element
     */
    org.lidoSchema.EventComplexType.PeriodName getPeriodNameArray(int i);
    
    /**
     * Returns number of "periodName" element
     */
    int sizeOfPeriodNameArray();
    
    /**
     * Sets array of all "periodName" element
     */
    void setPeriodNameArray(org.lidoSchema.EventComplexType.PeriodName[] periodNameArray);
    
    /**
     * Sets ith "periodName" element
     */
    void setPeriodNameArray(int i, org.lidoSchema.EventComplexType.PeriodName periodName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "periodName" element
     */
    org.lidoSchema.EventComplexType.PeriodName insertNewPeriodName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "periodName" element
     */
    org.lidoSchema.EventComplexType.PeriodName addNewPeriodName();
    
    /**
     * Removes the ith "periodName" element
     */
    void removePeriodName(int i);
    
    /**
     * Gets a List of "eventPlace" elements
     */
    java.util.List<org.lidoSchema.EventComplexType.EventPlace> getEventPlaceList();
    
    /**
     * Gets array of all "eventPlace" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.EventComplexType.EventPlace[] getEventPlaceArray();
    
    /**
     * Gets ith "eventPlace" element
     */
    org.lidoSchema.EventComplexType.EventPlace getEventPlaceArray(int i);
    
    /**
     * Returns number of "eventPlace" element
     */
    int sizeOfEventPlaceArray();
    
    /**
     * Sets array of all "eventPlace" element
     */
    void setEventPlaceArray(org.lidoSchema.EventComplexType.EventPlace[] eventPlaceArray);
    
    /**
     * Sets ith "eventPlace" element
     */
    void setEventPlaceArray(int i, org.lidoSchema.EventComplexType.EventPlace eventPlace);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventPlace" element
     */
    org.lidoSchema.EventComplexType.EventPlace insertNewEventPlace(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eventPlace" element
     */
    org.lidoSchema.EventComplexType.EventPlace addNewEventPlace();
    
    /**
     * Removes the ith "eventPlace" element
     */
    void removeEventPlace(int i);
    
    /**
     * Gets a List of "eventMethod" elements
     */
    java.util.List<org.lidoSchema.EventComplexType.EventMethod> getEventMethodList();
    
    /**
     * Gets array of all "eventMethod" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.EventComplexType.EventMethod[] getEventMethodArray();
    
    /**
     * Gets ith "eventMethod" element
     */
    org.lidoSchema.EventComplexType.EventMethod getEventMethodArray(int i);
    
    /**
     * Returns number of "eventMethod" element
     */
    int sizeOfEventMethodArray();
    
    /**
     * Sets array of all "eventMethod" element
     */
    void setEventMethodArray(org.lidoSchema.EventComplexType.EventMethod[] eventMethodArray);
    
    /**
     * Sets ith "eventMethod" element
     */
    void setEventMethodArray(int i, org.lidoSchema.EventComplexType.EventMethod eventMethod);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventMethod" element
     */
    org.lidoSchema.EventComplexType.EventMethod insertNewEventMethod(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eventMethod" element
     */
    org.lidoSchema.EventComplexType.EventMethod addNewEventMethod();
    
    /**
     * Removes the ith "eventMethod" element
     */
    void removeEventMethod(int i);
    
    /**
     * Gets a List of "eventMaterialsTech" elements
     */
    java.util.List<org.lidoSchema.EventComplexType.EventMaterialsTech> getEventMaterialsTechList();
    
    /**
     * Gets array of all "eventMaterialsTech" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.EventComplexType.EventMaterialsTech[] getEventMaterialsTechArray();
    
    /**
     * Gets ith "eventMaterialsTech" element
     */
    org.lidoSchema.EventComplexType.EventMaterialsTech getEventMaterialsTechArray(int i);
    
    /**
     * Returns number of "eventMaterialsTech" element
     */
    int sizeOfEventMaterialsTechArray();
    
    /**
     * Sets array of all "eventMaterialsTech" element
     */
    void setEventMaterialsTechArray(org.lidoSchema.EventComplexType.EventMaterialsTech[] eventMaterialsTechArray);
    
    /**
     * Sets ith "eventMaterialsTech" element
     */
    void setEventMaterialsTechArray(int i, org.lidoSchema.EventComplexType.EventMaterialsTech eventMaterialsTech);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventMaterialsTech" element
     */
    org.lidoSchema.EventComplexType.EventMaterialsTech insertNewEventMaterialsTech(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eventMaterialsTech" element
     */
    org.lidoSchema.EventComplexType.EventMaterialsTech addNewEventMaterialsTech();
    
    /**
     * Removes the ith "eventMaterialsTech" element
     */
    void removeEventMaterialsTech(int i);
    
    /**
     * Gets a List of "thingPresent" elements
     */
    java.util.List<org.lidoSchema.EventComplexType.ThingPresent> getThingPresentList();
    
    /**
     * Gets array of all "thingPresent" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.EventComplexType.ThingPresent[] getThingPresentArray();
    
    /**
     * Gets ith "thingPresent" element
     */
    org.lidoSchema.EventComplexType.ThingPresent getThingPresentArray(int i);
    
    /**
     * Returns number of "thingPresent" element
     */
    int sizeOfThingPresentArray();
    
    /**
     * Sets array of all "thingPresent" element
     */
    void setThingPresentArray(org.lidoSchema.EventComplexType.ThingPresent[] thingPresentArray);
    
    /**
     * Sets ith "thingPresent" element
     */
    void setThingPresentArray(int i, org.lidoSchema.EventComplexType.ThingPresent thingPresent);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "thingPresent" element
     */
    org.lidoSchema.EventComplexType.ThingPresent insertNewThingPresent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "thingPresent" element
     */
    org.lidoSchema.EventComplexType.ThingPresent addNewThingPresent();
    
    /**
     * Removes the ith "thingPresent" element
     */
    void removeThingPresent(int i);
    
    /**
     * Gets a List of "relatedEventSet" elements
     */
    java.util.List<org.lidoSchema.EventComplexType.RelatedEventSet> getRelatedEventSetList();
    
    /**
     * Gets array of all "relatedEventSet" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.EventComplexType.RelatedEventSet[] getRelatedEventSetArray();
    
    /**
     * Gets ith "relatedEventSet" element
     */
    org.lidoSchema.EventComplexType.RelatedEventSet getRelatedEventSetArray(int i);
    
    /**
     * Returns number of "relatedEventSet" element
     */
    int sizeOfRelatedEventSetArray();
    
    /**
     * Sets array of all "relatedEventSet" element
     */
    void setRelatedEventSetArray(org.lidoSchema.EventComplexType.RelatedEventSet[] relatedEventSetArray);
    
    /**
     * Sets ith "relatedEventSet" element
     */
    void setRelatedEventSetArray(int i, org.lidoSchema.EventComplexType.RelatedEventSet relatedEventSet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relatedEventSet" element
     */
    org.lidoSchema.EventComplexType.RelatedEventSet insertNewRelatedEventSet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relatedEventSet" element
     */
    org.lidoSchema.EventComplexType.RelatedEventSet addNewRelatedEventSet();
    
    /**
     * Removes the ith "relatedEventSet" element
     */
    void removeRelatedEventSet(int i);
    
    /**
     * Gets a List of "eventDescriptionSet" elements
     */
    java.util.List<org.lidoSchema.DescriptiveNoteComplexType> getEventDescriptionSetList();
    
    /**
     * Gets array of all "eventDescriptionSet" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.DescriptiveNoteComplexType[] getEventDescriptionSetArray();
    
    /**
     * Gets ith "eventDescriptionSet" element
     */
    org.lidoSchema.DescriptiveNoteComplexType getEventDescriptionSetArray(int i);
    
    /**
     * Returns number of "eventDescriptionSet" element
     */
    int sizeOfEventDescriptionSetArray();
    
    /**
     * Sets array of all "eventDescriptionSet" element
     */
    void setEventDescriptionSetArray(org.lidoSchema.DescriptiveNoteComplexType[] eventDescriptionSetArray);
    
    /**
     * Sets ith "eventDescriptionSet" element
     */
    void setEventDescriptionSetArray(int i, org.lidoSchema.DescriptiveNoteComplexType eventDescriptionSet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventDescriptionSet" element
     */
    org.lidoSchema.DescriptiveNoteComplexType insertNewEventDescriptionSet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eventDescriptionSet" element
     */
    org.lidoSchema.DescriptiveNoteComplexType addNewEventDescriptionSet();
    
    /**
     * Removes the ith "eventDescriptionSet" element
     */
    void removeEventDescriptionSet(int i);
    
    /**
     * An XML eventActor(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface EventActor extends org.lidoSchema.ActorInRoleSetComplexType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventActor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("eventactorf091elemtype");
        
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
            public static org.lidoSchema.EventComplexType.EventActor newInstance() {
              return (org.lidoSchema.EventComplexType.EventActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.EventComplexType.EventActor newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.EventComplexType.EventActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML culture(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface Culture extends org.lidoSchema.ConceptComplexType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Culture.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("culture5354elemtype");
        
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
            public static org.lidoSchema.EventComplexType.Culture newInstance() {
              return (org.lidoSchema.EventComplexType.Culture) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.EventComplexType.Culture newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.EventComplexType.Culture) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML periodName(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface PeriodName extends org.lidoSchema.ConceptComplexType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PeriodName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("periodname9742elemtype");
        
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
            public static org.lidoSchema.EventComplexType.PeriodName newInstance() {
              return (org.lidoSchema.EventComplexType.PeriodName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.EventComplexType.PeriodName newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.EventComplexType.PeriodName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML eventPlace(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface EventPlace extends org.lidoSchema.PlaceSetComplexType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventPlace.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("eventplace9023elemtype");
        
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
            public static org.lidoSchema.EventComplexType.EventPlace newInstance() {
              return (org.lidoSchema.EventComplexType.EventPlace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.EventComplexType.EventPlace newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.EventComplexType.EventPlace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML eventMethod(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface EventMethod extends org.lidoSchema.ConceptComplexType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventMethod.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("eventmethoda701elemtype");
        
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
            public static org.lidoSchema.EventComplexType.EventMethod newInstance() {
              return (org.lidoSchema.EventComplexType.EventMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.EventComplexType.EventMethod newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.EventComplexType.EventMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML eventMaterialsTech(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface EventMaterialsTech extends org.lidoSchema.MaterialsTechSetComplexType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventMaterialsTech.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("eventmaterialstechb2beelemtype");
        
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
            public static org.lidoSchema.EventComplexType.EventMaterialsTech newInstance() {
              return (org.lidoSchema.EventComplexType.EventMaterialsTech) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.EventComplexType.EventMaterialsTech newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.EventComplexType.EventMaterialsTech) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML thingPresent(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface ThingPresent extends org.lidoSchema.ObjectSetComplexType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ThingPresent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("thingpresent1f83elemtype");
        
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
            public static org.lidoSchema.EventComplexType.ThingPresent newInstance() {
              return (org.lidoSchema.EventComplexType.ThingPresent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.EventComplexType.ThingPresent newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.EventComplexType.ThingPresent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML relatedEventSet(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface RelatedEventSet extends org.lidoSchema.RelatedEventSetComplexType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RelatedEventSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("relatedeventsetcd99elemtype");
        
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
            public static org.lidoSchema.EventComplexType.RelatedEventSet newInstance() {
              return (org.lidoSchema.EventComplexType.RelatedEventSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.EventComplexType.RelatedEventSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.EventComplexType.RelatedEventSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.EventComplexType newInstance() {
          return (org.lidoSchema.EventComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.EventComplexType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.EventComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.EventComplexType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.EventComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.EventComplexType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.EventComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.EventComplexType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.EventComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.EventComplexType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.EventComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.EventComplexType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.EventComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.EventComplexType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.EventComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.EventComplexType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.EventComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.EventComplexType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.EventComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.EventComplexType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.EventComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.EventComplexType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.EventComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.EventComplexType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.EventComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.EventComplexType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.EventComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.EventComplexType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.EventComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.EventComplexType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.EventComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.EventComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.EventComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.EventComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.EventComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
