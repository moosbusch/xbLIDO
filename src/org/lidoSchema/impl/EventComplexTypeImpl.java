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
package org.lidoSchema.impl;  import com.google.inject.Inject;
import org.moosbusch.museum.lido.inject.annotation.SortOrder;
/**
 * An XML eventComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class EventComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.EventComplexType
{
    private static final long serialVersionUID = 1L;

    public EventComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName EVENTID$0 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "eventID");
    private static final javax.xml.namespace.QName EVENTTYPE$2 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "eventType");
    private static final javax.xml.namespace.QName ROLEINEVENT$4 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "roleInEvent");
    private static final javax.xml.namespace.QName EVENTNAME$6 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "eventName");
    private static final javax.xml.namespace.QName EVENTACTOR$8 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "eventActor");
    private static final javax.xml.namespace.QName CULTURE$10 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "culture");
    private static final javax.xml.namespace.QName EVENTDATE$12 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "eventDate");
    private static final javax.xml.namespace.QName PERIODNAME$14 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "periodName");
    private static final javax.xml.namespace.QName EVENTPLACE$16 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "eventPlace");
    private static final javax.xml.namespace.QName EVENTMETHOD$18 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "eventMethod");
    private static final javax.xml.namespace.QName EVENTMATERIALSTECH$20 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "eventMaterialsTech");
    private static final javax.xml.namespace.QName THINGPRESENT$22 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "thingPresent");
    private static final javax.xml.namespace.QName RELATEDEVENTSET$24 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "relatedEventSet");
    private static final javax.xml.namespace.QName EVENTDESCRIPTIONSET$26 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "eventDescriptionSet");


    /**
     * Gets a List of "eventID" elements
     */
    public java.util.List<org.lidoSchema.IdentifierComplexType> getEventIDList()
    {
        final class EventIDList extends java.util.AbstractList<org.lidoSchema.IdentifierComplexType>
        {
            @Override
            public org.lidoSchema.IdentifierComplexType get(int i)
                { return EventComplexTypeImpl.this.getEventIDArray(i); }

            @Override
            public org.lidoSchema.IdentifierComplexType set(int i, org.lidoSchema.IdentifierComplexType o)
            {
                org.lidoSchema.IdentifierComplexType old = EventComplexTypeImpl.this.getEventIDArray(i);
                EventComplexTypeImpl.this.setEventIDArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.IdentifierComplexType o)
                { EventComplexTypeImpl.this.insertNewEventID(i).set(o); }

            @Override
            public org.lidoSchema.IdentifierComplexType remove(int i)
            {
                org.lidoSchema.IdentifierComplexType old = EventComplexTypeImpl.this.getEventIDArray(i);
                EventComplexTypeImpl.this.removeEventID(i);
                return old;
            }

            @Override
            public int size()
                { return EventComplexTypeImpl.this.sizeOfEventIDArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new EventIDList();
        }
    }

    /**
     * Gets array of all "eventID" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.IdentifierComplexType[] getEventIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.IdentifierComplexType> targetList = new java.util.ArrayList<org.lidoSchema.IdentifierComplexType>();
            get_store().find_all_element_users(EVENTID$0, targetList);
            org.lidoSchema.IdentifierComplexType[] result = new org.lidoSchema.IdentifierComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "eventID" element
     */
    public org.lidoSchema.IdentifierComplexType getEventIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().find_element_user(EVENTID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "eventID" element
     */
    public int sizeOfEventIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTID$0);
        }
    }

    /**
     * Sets array of all "eventID" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setEventIDArray(org.lidoSchema.IdentifierComplexType[] eventIDArray)
    {
        check_orphaned();
        arraySetterHelper(eventIDArray, EVENTID$0);
    }

    /**
     * Sets ith "eventID" element
     */
    @Inject(optional=true) public void setEventIDArray(int i, org.lidoSchema.IdentifierComplexType eventID)
    {
        generatedSetterHelperImpl(eventID, EVENTID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventID" element
     */
    public org.lidoSchema.IdentifierComplexType insertNewEventID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().insert_element_user(EVENTID$0, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "eventID" element
     */
    public org.lidoSchema.IdentifierComplexType addNewEventID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().add_element_user(EVENTID$0);
            return target;
        }
    }

    /**
     * Removes the ith "eventID" element
     */
    public void removeEventID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTID$0, i);
        }
    }

    /**
     * Gets the "eventType" element
     */
    public org.lidoSchema.ConceptComplexType getEventType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ConceptComplexType target = null;
            target = (org.lidoSchema.ConceptComplexType)get_store().find_element_user(EVENTTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "eventType" element
     */
    @Inject(optional=true) public void setEventType(org.lidoSchema.ConceptComplexType eventType)
    {
        generatedSetterHelperImpl(eventType, EVENTTYPE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "eventType" element
     */
    public org.lidoSchema.ConceptComplexType addNewEventType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ConceptComplexType target = null;
            target = (org.lidoSchema.ConceptComplexType)get_store().add_element_user(EVENTTYPE$2);
            return target;
        }
    }

    /**
     * Gets a List of "roleInEvent" elements
     */
    public java.util.List<org.lidoSchema.ConceptComplexType> getRoleInEventList()
    {
        final class RoleInEventList extends java.util.AbstractList<org.lidoSchema.ConceptComplexType>
        {
            @Override
            public org.lidoSchema.ConceptComplexType get(int i)
                { return EventComplexTypeImpl.this.getRoleInEventArray(i); }

            @Override
            public org.lidoSchema.ConceptComplexType set(int i, org.lidoSchema.ConceptComplexType o)
            {
                org.lidoSchema.ConceptComplexType old = EventComplexTypeImpl.this.getRoleInEventArray(i);
                EventComplexTypeImpl.this.setRoleInEventArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.ConceptComplexType o)
                { EventComplexTypeImpl.this.insertNewRoleInEvent(i).set(o); }

            @Override
            public org.lidoSchema.ConceptComplexType remove(int i)
            {
                org.lidoSchema.ConceptComplexType old = EventComplexTypeImpl.this.getRoleInEventArray(i);
                EventComplexTypeImpl.this.removeRoleInEvent(i);
                return old;
            }

            @Override
            public int size()
                { return EventComplexTypeImpl.this.sizeOfRoleInEventArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new RoleInEventList();
        }
    }

    /**
     * Gets array of all "roleInEvent" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.ConceptComplexType[] getRoleInEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.ConceptComplexType> targetList = new java.util.ArrayList<org.lidoSchema.ConceptComplexType>();
            get_store().find_all_element_users(ROLEINEVENT$4, targetList);
            org.lidoSchema.ConceptComplexType[] result = new org.lidoSchema.ConceptComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "roleInEvent" element
     */
    public org.lidoSchema.ConceptComplexType getRoleInEventArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ConceptComplexType target = null;
            target = (org.lidoSchema.ConceptComplexType)get_store().find_element_user(ROLEINEVENT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "roleInEvent" element
     */
    public int sizeOfRoleInEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLEINEVENT$4);
        }
    }

    /**
     * Sets array of all "roleInEvent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setRoleInEventArray(org.lidoSchema.ConceptComplexType[] roleInEventArray)
    {
        check_orphaned();
        arraySetterHelper(roleInEventArray, ROLEINEVENT$4);
    }

    /**
     * Sets ith "roleInEvent" element
     */
    @Inject(optional=true) public void setRoleInEventArray(int i, org.lidoSchema.ConceptComplexType roleInEvent)
    {
        generatedSetterHelperImpl(roleInEvent, ROLEINEVENT$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "roleInEvent" element
     */
    public org.lidoSchema.ConceptComplexType insertNewRoleInEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ConceptComplexType target = null;
            target = (org.lidoSchema.ConceptComplexType)get_store().insert_element_user(ROLEINEVENT$4, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "roleInEvent" element
     */
    public org.lidoSchema.ConceptComplexType addNewRoleInEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ConceptComplexType target = null;
            target = (org.lidoSchema.ConceptComplexType)get_store().add_element_user(ROLEINEVENT$4);
            return target;
        }
    }

    /**
     * Removes the ith "roleInEvent" element
     */
    public void removeRoleInEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLEINEVENT$4, i);
        }
    }

    /**
     * Gets a List of "eventName" elements
     */
    public java.util.List<org.lidoSchema.AppellationComplexType> getEventNameList()
    {
        final class EventNameList extends java.util.AbstractList<org.lidoSchema.AppellationComplexType>
        {
            @Override
            public org.lidoSchema.AppellationComplexType get(int i)
                { return EventComplexTypeImpl.this.getEventNameArray(i); }

            @Override
            public org.lidoSchema.AppellationComplexType set(int i, org.lidoSchema.AppellationComplexType o)
            {
                org.lidoSchema.AppellationComplexType old = EventComplexTypeImpl.this.getEventNameArray(i);
                EventComplexTypeImpl.this.setEventNameArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.AppellationComplexType o)
                { EventComplexTypeImpl.this.insertNewEventName(i).set(o); }

            @Override
            public org.lidoSchema.AppellationComplexType remove(int i)
            {
                org.lidoSchema.AppellationComplexType old = EventComplexTypeImpl.this.getEventNameArray(i);
                EventComplexTypeImpl.this.removeEventName(i);
                return old;
            }

            @Override
            public int size()
                { return EventComplexTypeImpl.this.sizeOfEventNameArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new EventNameList();
        }
    }

    /**
     * Gets array of all "eventName" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.AppellationComplexType[] getEventNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.AppellationComplexType> targetList = new java.util.ArrayList<org.lidoSchema.AppellationComplexType>();
            get_store().find_all_element_users(EVENTNAME$6, targetList);
            org.lidoSchema.AppellationComplexType[] result = new org.lidoSchema.AppellationComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "eventName" element
     */
    public org.lidoSchema.AppellationComplexType getEventNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.AppellationComplexType target = null;
            target = (org.lidoSchema.AppellationComplexType)get_store().find_element_user(EVENTNAME$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "eventName" element
     */
    public int sizeOfEventNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTNAME$6);
        }
    }

    /**
     * Sets array of all "eventName" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setEventNameArray(org.lidoSchema.AppellationComplexType[] eventNameArray)
    {
        check_orphaned();
        arraySetterHelper(eventNameArray, EVENTNAME$6);
    }

    /**
     * Sets ith "eventName" element
     */
    @Inject(optional=true) public void setEventNameArray(int i, org.lidoSchema.AppellationComplexType eventName)
    {
        generatedSetterHelperImpl(eventName, EVENTNAME$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventName" element
     */
    public org.lidoSchema.AppellationComplexType insertNewEventName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.AppellationComplexType target = null;
            target = (org.lidoSchema.AppellationComplexType)get_store().insert_element_user(EVENTNAME$6, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "eventName" element
     */
    public org.lidoSchema.AppellationComplexType addNewEventName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.AppellationComplexType target = null;
            target = (org.lidoSchema.AppellationComplexType)get_store().add_element_user(EVENTNAME$6);
            return target;
        }
    }

    /**
     * Removes the ith "eventName" element
     */
    public void removeEventName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTNAME$6, i);
        }
    }

    /**
     * Gets a List of "eventActor" elements
     */
    public java.util.List<org.lidoSchema.EventComplexType.EventActor> getEventActorList()
    {
        final class EventActorList extends java.util.AbstractList<org.lidoSchema.EventComplexType.EventActor>
        {
            @Override
            public org.lidoSchema.EventComplexType.EventActor get(int i)
                { return EventComplexTypeImpl.this.getEventActorArray(i); }

            @Override
            public org.lidoSchema.EventComplexType.EventActor set(int i, org.lidoSchema.EventComplexType.EventActor o)
            {
                org.lidoSchema.EventComplexType.EventActor old = EventComplexTypeImpl.this.getEventActorArray(i);
                EventComplexTypeImpl.this.setEventActorArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.EventComplexType.EventActor o)
                { EventComplexTypeImpl.this.insertNewEventActor(i).set(o); }

            @Override
            public org.lidoSchema.EventComplexType.EventActor remove(int i)
            {
                org.lidoSchema.EventComplexType.EventActor old = EventComplexTypeImpl.this.getEventActorArray(i);
                EventComplexTypeImpl.this.removeEventActor(i);
                return old;
            }

            @Override
            public int size()
                { return EventComplexTypeImpl.this.sizeOfEventActorArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new EventActorList();
        }
    }

    /**
     * Gets array of all "eventActor" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.EventComplexType.EventActor[] getEventActorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.EventComplexType.EventActor> targetList = new java.util.ArrayList<org.lidoSchema.EventComplexType.EventActor>();
            get_store().find_all_element_users(EVENTACTOR$8, targetList);
            org.lidoSchema.EventComplexType.EventActor[] result = new org.lidoSchema.EventComplexType.EventActor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "eventActor" element
     */
    public org.lidoSchema.EventComplexType.EventActor getEventActorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType.EventActor target = null;
            target = (org.lidoSchema.EventComplexType.EventActor)get_store().find_element_user(EVENTACTOR$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "eventActor" element
     */
    public int sizeOfEventActorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTACTOR$8);
        }
    }

    /**
     * Sets array of all "eventActor" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setEventActorArray(org.lidoSchema.EventComplexType.EventActor[] eventActorArray)
    {
        check_orphaned();
        arraySetterHelper(eventActorArray, EVENTACTOR$8);
    }

    /**
     * Sets ith "eventActor" element
     */
    @Inject(optional=true) public void setEventActorArray(int i, org.lidoSchema.EventComplexType.EventActor eventActor)
    {
        generatedSetterHelperImpl(eventActor, EVENTACTOR$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventActor" element
     */
    public org.lidoSchema.EventComplexType.EventActor insertNewEventActor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType.EventActor target = null;
            target = (org.lidoSchema.EventComplexType.EventActor)get_store().insert_element_user(EVENTACTOR$8, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "eventActor" element
     */
    public org.lidoSchema.EventComplexType.EventActor addNewEventActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType.EventActor target = null;
            target = (org.lidoSchema.EventComplexType.EventActor)get_store().add_element_user(EVENTACTOR$8);
            return target;
        }
    }

    /**
     * Removes the ith "eventActor" element
     */
    public void removeEventActor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTACTOR$8, i);
        }
    }

    /**
     * Gets a List of "culture" elements
     */
    public java.util.List<org.lidoSchema.EventComplexType.Culture> getCultureList()
    {
        final class CultureList extends java.util.AbstractList<org.lidoSchema.EventComplexType.Culture>
        {
            @Override
            public org.lidoSchema.EventComplexType.Culture get(int i)
                { return EventComplexTypeImpl.this.getCultureArray(i); }

            @Override
            public org.lidoSchema.EventComplexType.Culture set(int i, org.lidoSchema.EventComplexType.Culture o)
            {
                org.lidoSchema.EventComplexType.Culture old = EventComplexTypeImpl.this.getCultureArray(i);
                EventComplexTypeImpl.this.setCultureArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.EventComplexType.Culture o)
                { EventComplexTypeImpl.this.insertNewCulture(i).set(o); }

            @Override
            public org.lidoSchema.EventComplexType.Culture remove(int i)
            {
                org.lidoSchema.EventComplexType.Culture old = EventComplexTypeImpl.this.getCultureArray(i);
                EventComplexTypeImpl.this.removeCulture(i);
                return old;
            }

            @Override
            public int size()
                { return EventComplexTypeImpl.this.sizeOfCultureArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new CultureList();
        }
    }

    /**
     * Gets array of all "culture" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.EventComplexType.Culture[] getCultureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.EventComplexType.Culture> targetList = new java.util.ArrayList<org.lidoSchema.EventComplexType.Culture>();
            get_store().find_all_element_users(CULTURE$10, targetList);
            org.lidoSchema.EventComplexType.Culture[] result = new org.lidoSchema.EventComplexType.Culture[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "culture" element
     */
    public org.lidoSchema.EventComplexType.Culture getCultureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType.Culture target = null;
            target = (org.lidoSchema.EventComplexType.Culture)get_store().find_element_user(CULTURE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "culture" element
     */
    public int sizeOfCultureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CULTURE$10);
        }
    }

    /**
     * Sets array of all "culture" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setCultureArray(org.lidoSchema.EventComplexType.Culture[] cultureArray)
    {
        check_orphaned();
        arraySetterHelper(cultureArray, CULTURE$10);
    }

    /**
     * Sets ith "culture" element
     */
    @Inject(optional=true) public void setCultureArray(int i, org.lidoSchema.EventComplexType.Culture culture)
    {
        generatedSetterHelperImpl(culture, CULTURE$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "culture" element
     */
    public org.lidoSchema.EventComplexType.Culture insertNewCulture(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType.Culture target = null;
            target = (org.lidoSchema.EventComplexType.Culture)get_store().insert_element_user(CULTURE$10, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "culture" element
     */
    public org.lidoSchema.EventComplexType.Culture addNewCulture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType.Culture target = null;
            target = (org.lidoSchema.EventComplexType.Culture)get_store().add_element_user(CULTURE$10);
            return target;
        }
    }

    /**
     * Removes the ith "culture" element
     */
    public void removeCulture(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CULTURE$10, i);
        }
    }

    /**
     * Gets the "eventDate" element
     */
    public org.lidoSchema.DateSetComplexType getEventDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.DateSetComplexType target = null;
            target = (org.lidoSchema.DateSetComplexType)get_store().find_element_user(EVENTDATE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * True if has "eventDate" element
     */
    public boolean isSetEventDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTDATE$12) != 0;
        }
    }

    /**
     * Sets the "eventDate" element
     */
    @Inject(optional=true) public void setEventDate(org.lidoSchema.DateSetComplexType eventDate)
    {
        generatedSetterHelperImpl(eventDate, EVENTDATE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "eventDate" element
     */
    public org.lidoSchema.DateSetComplexType addNewEventDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.DateSetComplexType target = null;
            target = (org.lidoSchema.DateSetComplexType)get_store().add_element_user(EVENTDATE$12);
            return target;
        }
    }

    /**
     * Unsets the "eventDate" element
     */
    public void unsetEventDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTDATE$12, 0);
        }
    }

    /**
     * Gets a List of "periodName" elements
     */
    public java.util.List<org.lidoSchema.EventComplexType.PeriodName> getPeriodNameList()
    {
        final class PeriodNameList extends java.util.AbstractList<org.lidoSchema.EventComplexType.PeriodName>
        {
            @Override
            public org.lidoSchema.EventComplexType.PeriodName get(int i)
                { return EventComplexTypeImpl.this.getPeriodNameArray(i); }

            @Override
            public org.lidoSchema.EventComplexType.PeriodName set(int i, org.lidoSchema.EventComplexType.PeriodName o)
            {
                org.lidoSchema.EventComplexType.PeriodName old = EventComplexTypeImpl.this.getPeriodNameArray(i);
                EventComplexTypeImpl.this.setPeriodNameArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.EventComplexType.PeriodName o)
                { EventComplexTypeImpl.this.insertNewPeriodName(i).set(o); }

            @Override
            public org.lidoSchema.EventComplexType.PeriodName remove(int i)
            {
                org.lidoSchema.EventComplexType.PeriodName old = EventComplexTypeImpl.this.getPeriodNameArray(i);
                EventComplexTypeImpl.this.removePeriodName(i);
                return old;
            }

            @Override
            public int size()
                { return EventComplexTypeImpl.this.sizeOfPeriodNameArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new PeriodNameList();
        }
    }

    /**
     * Gets array of all "periodName" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.EventComplexType.PeriodName[] getPeriodNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.EventComplexType.PeriodName> targetList = new java.util.ArrayList<org.lidoSchema.EventComplexType.PeriodName>();
            get_store().find_all_element_users(PERIODNAME$14, targetList);
            org.lidoSchema.EventComplexType.PeriodName[] result = new org.lidoSchema.EventComplexType.PeriodName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "periodName" element
     */
    public org.lidoSchema.EventComplexType.PeriodName getPeriodNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType.PeriodName target = null;
            target = (org.lidoSchema.EventComplexType.PeriodName)get_store().find_element_user(PERIODNAME$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "periodName" element
     */
    public int sizeOfPeriodNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERIODNAME$14);
        }
    }

    /**
     * Sets array of all "periodName" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setPeriodNameArray(org.lidoSchema.EventComplexType.PeriodName[] periodNameArray)
    {
        check_orphaned();
        arraySetterHelper(periodNameArray, PERIODNAME$14);
    }

    /**
     * Sets ith "periodName" element
     */
    @Inject(optional=true) public void setPeriodNameArray(int i, org.lidoSchema.EventComplexType.PeriodName periodName)
    {
        generatedSetterHelperImpl(periodName, PERIODNAME$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "periodName" element
     */
    public org.lidoSchema.EventComplexType.PeriodName insertNewPeriodName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType.PeriodName target = null;
            target = (org.lidoSchema.EventComplexType.PeriodName)get_store().insert_element_user(PERIODNAME$14, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "periodName" element
     */
    public org.lidoSchema.EventComplexType.PeriodName addNewPeriodName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType.PeriodName target = null;
            target = (org.lidoSchema.EventComplexType.PeriodName)get_store().add_element_user(PERIODNAME$14);
            return target;
        }
    }

    /**
     * Removes the ith "periodName" element
     */
    public void removePeriodName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERIODNAME$14, i);
        }
    }

    /**
     * Gets a List of "eventPlace" elements
     */
    public java.util.List<org.lidoSchema.EventComplexType.EventPlace> getEventPlaceList()
    {
        final class EventPlaceList extends java.util.AbstractList<org.lidoSchema.EventComplexType.EventPlace>
        {
            @Override
            public org.lidoSchema.EventComplexType.EventPlace get(int i)
                { return EventComplexTypeImpl.this.getEventPlaceArray(i); }

            @Override
            public org.lidoSchema.EventComplexType.EventPlace set(int i, org.lidoSchema.EventComplexType.EventPlace o)
            {
                org.lidoSchema.EventComplexType.EventPlace old = EventComplexTypeImpl.this.getEventPlaceArray(i);
                EventComplexTypeImpl.this.setEventPlaceArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.EventComplexType.EventPlace o)
                { EventComplexTypeImpl.this.insertNewEventPlace(i).set(o); }

            @Override
            public org.lidoSchema.EventComplexType.EventPlace remove(int i)
            {
                org.lidoSchema.EventComplexType.EventPlace old = EventComplexTypeImpl.this.getEventPlaceArray(i);
                EventComplexTypeImpl.this.removeEventPlace(i);
                return old;
            }

            @Override
            public int size()
                { return EventComplexTypeImpl.this.sizeOfEventPlaceArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new EventPlaceList();
        }
    }

    /**
     * Gets array of all "eventPlace" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.EventComplexType.EventPlace[] getEventPlaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.EventComplexType.EventPlace> targetList = new java.util.ArrayList<org.lidoSchema.EventComplexType.EventPlace>();
            get_store().find_all_element_users(EVENTPLACE$16, targetList);
            org.lidoSchema.EventComplexType.EventPlace[] result = new org.lidoSchema.EventComplexType.EventPlace[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "eventPlace" element
     */
    public org.lidoSchema.EventComplexType.EventPlace getEventPlaceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType.EventPlace target = null;
            target = (org.lidoSchema.EventComplexType.EventPlace)get_store().find_element_user(EVENTPLACE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "eventPlace" element
     */
    public int sizeOfEventPlaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTPLACE$16);
        }
    }

    /**
     * Sets array of all "eventPlace" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setEventPlaceArray(org.lidoSchema.EventComplexType.EventPlace[] eventPlaceArray)
    {
        check_orphaned();
        arraySetterHelper(eventPlaceArray, EVENTPLACE$16);
    }

    /**
     * Sets ith "eventPlace" element
     */
    @Inject(optional=true) public void setEventPlaceArray(int i, org.lidoSchema.EventComplexType.EventPlace eventPlace)
    {
        generatedSetterHelperImpl(eventPlace, EVENTPLACE$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventPlace" element
     */
    public org.lidoSchema.EventComplexType.EventPlace insertNewEventPlace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType.EventPlace target = null;
            target = (org.lidoSchema.EventComplexType.EventPlace)get_store().insert_element_user(EVENTPLACE$16, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "eventPlace" element
     */
    public org.lidoSchema.EventComplexType.EventPlace addNewEventPlace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType.EventPlace target = null;
            target = (org.lidoSchema.EventComplexType.EventPlace)get_store().add_element_user(EVENTPLACE$16);
            return target;
        }
    }

    /**
     * Removes the ith "eventPlace" element
     */
    public void removeEventPlace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTPLACE$16, i);
        }
    }

    /**
     * Gets a List of "eventMethod" elements
     */
    public java.util.List<org.lidoSchema.EventComplexType.EventMethod> getEventMethodList()
    {
        final class EventMethodList extends java.util.AbstractList<org.lidoSchema.EventComplexType.EventMethod>
        {
            @Override
            public org.lidoSchema.EventComplexType.EventMethod get(int i)
                { return EventComplexTypeImpl.this.getEventMethodArray(i); }

            @Override
            public org.lidoSchema.EventComplexType.EventMethod set(int i, org.lidoSchema.EventComplexType.EventMethod o)
            {
                org.lidoSchema.EventComplexType.EventMethod old = EventComplexTypeImpl.this.getEventMethodArray(i);
                EventComplexTypeImpl.this.setEventMethodArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.EventComplexType.EventMethod o)
                { EventComplexTypeImpl.this.insertNewEventMethod(i).set(o); }

            @Override
            public org.lidoSchema.EventComplexType.EventMethod remove(int i)
            {
                org.lidoSchema.EventComplexType.EventMethod old = EventComplexTypeImpl.this.getEventMethodArray(i);
                EventComplexTypeImpl.this.removeEventMethod(i);
                return old;
            }

            @Override
            public int size()
                { return EventComplexTypeImpl.this.sizeOfEventMethodArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new EventMethodList();
        }
    }

    /**
     * Gets array of all "eventMethod" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.EventComplexType.EventMethod[] getEventMethodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.EventComplexType.EventMethod> targetList = new java.util.ArrayList<org.lidoSchema.EventComplexType.EventMethod>();
            get_store().find_all_element_users(EVENTMETHOD$18, targetList);
            org.lidoSchema.EventComplexType.EventMethod[] result = new org.lidoSchema.EventComplexType.EventMethod[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "eventMethod" element
     */
    public org.lidoSchema.EventComplexType.EventMethod getEventMethodArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType.EventMethod target = null;
            target = (org.lidoSchema.EventComplexType.EventMethod)get_store().find_element_user(EVENTMETHOD$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "eventMethod" element
     */
    public int sizeOfEventMethodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTMETHOD$18);
        }
    }

    /**
     * Sets array of all "eventMethod" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setEventMethodArray(org.lidoSchema.EventComplexType.EventMethod[] eventMethodArray)
    {
        check_orphaned();
        arraySetterHelper(eventMethodArray, EVENTMETHOD$18);
    }

    /**
     * Sets ith "eventMethod" element
     */
    @Inject(optional=true) public void setEventMethodArray(int i, org.lidoSchema.EventComplexType.EventMethod eventMethod)
    {
        generatedSetterHelperImpl(eventMethod, EVENTMETHOD$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventMethod" element
     */
    public org.lidoSchema.EventComplexType.EventMethod insertNewEventMethod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType.EventMethod target = null;
            target = (org.lidoSchema.EventComplexType.EventMethod)get_store().insert_element_user(EVENTMETHOD$18, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "eventMethod" element
     */
    public org.lidoSchema.EventComplexType.EventMethod addNewEventMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType.EventMethod target = null;
            target = (org.lidoSchema.EventComplexType.EventMethod)get_store().add_element_user(EVENTMETHOD$18);
            return target;
        }
    }

    /**
     * Removes the ith "eventMethod" element
     */
    public void removeEventMethod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTMETHOD$18, i);
        }
    }

    /**
     * Gets a List of "eventMaterialsTech" elements
     */
    public java.util.List<org.lidoSchema.EventComplexType.EventMaterialsTech> getEventMaterialsTechList()
    {
        final class EventMaterialsTechList extends java.util.AbstractList<org.lidoSchema.EventComplexType.EventMaterialsTech>
        {
            @Override
            public org.lidoSchema.EventComplexType.EventMaterialsTech get(int i)
                { return EventComplexTypeImpl.this.getEventMaterialsTechArray(i); }

            @Override
            public org.lidoSchema.EventComplexType.EventMaterialsTech set(int i, org.lidoSchema.EventComplexType.EventMaterialsTech o)
            {
                org.lidoSchema.EventComplexType.EventMaterialsTech old = EventComplexTypeImpl.this.getEventMaterialsTechArray(i);
                EventComplexTypeImpl.this.setEventMaterialsTechArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.EventComplexType.EventMaterialsTech o)
                { EventComplexTypeImpl.this.insertNewEventMaterialsTech(i).set(o); }

            @Override
            public org.lidoSchema.EventComplexType.EventMaterialsTech remove(int i)
            {
                org.lidoSchema.EventComplexType.EventMaterialsTech old = EventComplexTypeImpl.this.getEventMaterialsTechArray(i);
                EventComplexTypeImpl.this.removeEventMaterialsTech(i);
                return old;
            }

            @Override
            public int size()
                { return EventComplexTypeImpl.this.sizeOfEventMaterialsTechArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new EventMaterialsTechList();
        }
    }

    /**
     * Gets array of all "eventMaterialsTech" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.EventComplexType.EventMaterialsTech[] getEventMaterialsTechArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.EventComplexType.EventMaterialsTech> targetList = new java.util.ArrayList<org.lidoSchema.EventComplexType.EventMaterialsTech>();
            get_store().find_all_element_users(EVENTMATERIALSTECH$20, targetList);
            org.lidoSchema.EventComplexType.EventMaterialsTech[] result = new org.lidoSchema.EventComplexType.EventMaterialsTech[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "eventMaterialsTech" element
     */
    public org.lidoSchema.EventComplexType.EventMaterialsTech getEventMaterialsTechArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType.EventMaterialsTech target = null;
            target = (org.lidoSchema.EventComplexType.EventMaterialsTech)get_store().find_element_user(EVENTMATERIALSTECH$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "eventMaterialsTech" element
     */
    public int sizeOfEventMaterialsTechArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTMATERIALSTECH$20);
        }
    }

    /**
     * Sets array of all "eventMaterialsTech" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setEventMaterialsTechArray(org.lidoSchema.EventComplexType.EventMaterialsTech[] eventMaterialsTechArray)
    {
        check_orphaned();
        arraySetterHelper(eventMaterialsTechArray, EVENTMATERIALSTECH$20);
    }

    /**
     * Sets ith "eventMaterialsTech" element
     */
    @Inject(optional=true) public void setEventMaterialsTechArray(int i, org.lidoSchema.EventComplexType.EventMaterialsTech eventMaterialsTech)
    {
        generatedSetterHelperImpl(eventMaterialsTech, EVENTMATERIALSTECH$20, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventMaterialsTech" element
     */
    public org.lidoSchema.EventComplexType.EventMaterialsTech insertNewEventMaterialsTech(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType.EventMaterialsTech target = null;
            target = (org.lidoSchema.EventComplexType.EventMaterialsTech)get_store().insert_element_user(EVENTMATERIALSTECH$20, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "eventMaterialsTech" element
     */
    public org.lidoSchema.EventComplexType.EventMaterialsTech addNewEventMaterialsTech()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType.EventMaterialsTech target = null;
            target = (org.lidoSchema.EventComplexType.EventMaterialsTech)get_store().add_element_user(EVENTMATERIALSTECH$20);
            return target;
        }
    }

    /**
     * Removes the ith "eventMaterialsTech" element
     */
    public void removeEventMaterialsTech(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTMATERIALSTECH$20, i);
        }
    }

    /**
     * Gets a List of "thingPresent" elements
     */
    public java.util.List<org.lidoSchema.EventComplexType.ThingPresent> getThingPresentList()
    {
        final class ThingPresentList extends java.util.AbstractList<org.lidoSchema.EventComplexType.ThingPresent>
        {
            @Override
            public org.lidoSchema.EventComplexType.ThingPresent get(int i)
                { return EventComplexTypeImpl.this.getThingPresentArray(i); }

            @Override
            public org.lidoSchema.EventComplexType.ThingPresent set(int i, org.lidoSchema.EventComplexType.ThingPresent o)
            {
                org.lidoSchema.EventComplexType.ThingPresent old = EventComplexTypeImpl.this.getThingPresentArray(i);
                EventComplexTypeImpl.this.setThingPresentArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.EventComplexType.ThingPresent o)
                { EventComplexTypeImpl.this.insertNewThingPresent(i).set(o); }

            @Override
            public org.lidoSchema.EventComplexType.ThingPresent remove(int i)
            {
                org.lidoSchema.EventComplexType.ThingPresent old = EventComplexTypeImpl.this.getThingPresentArray(i);
                EventComplexTypeImpl.this.removeThingPresent(i);
                return old;
            }

            @Override
            public int size()
                { return EventComplexTypeImpl.this.sizeOfThingPresentArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new ThingPresentList();
        }
    }

    /**
     * Gets array of all "thingPresent" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.EventComplexType.ThingPresent[] getThingPresentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.EventComplexType.ThingPresent> targetList = new java.util.ArrayList<org.lidoSchema.EventComplexType.ThingPresent>();
            get_store().find_all_element_users(THINGPRESENT$22, targetList);
            org.lidoSchema.EventComplexType.ThingPresent[] result = new org.lidoSchema.EventComplexType.ThingPresent[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "thingPresent" element
     */
    public org.lidoSchema.EventComplexType.ThingPresent getThingPresentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType.ThingPresent target = null;
            target = (org.lidoSchema.EventComplexType.ThingPresent)get_store().find_element_user(THINGPRESENT$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "thingPresent" element
     */
    public int sizeOfThingPresentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(THINGPRESENT$22);
        }
    }

    /**
     * Sets array of all "thingPresent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setThingPresentArray(org.lidoSchema.EventComplexType.ThingPresent[] thingPresentArray)
    {
        check_orphaned();
        arraySetterHelper(thingPresentArray, THINGPRESENT$22);
    }

    /**
     * Sets ith "thingPresent" element
     */
    @Inject(optional=true) public void setThingPresentArray(int i, org.lidoSchema.EventComplexType.ThingPresent thingPresent)
    {
        generatedSetterHelperImpl(thingPresent, THINGPRESENT$22, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "thingPresent" element
     */
    public org.lidoSchema.EventComplexType.ThingPresent insertNewThingPresent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType.ThingPresent target = null;
            target = (org.lidoSchema.EventComplexType.ThingPresent)get_store().insert_element_user(THINGPRESENT$22, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "thingPresent" element
     */
    public org.lidoSchema.EventComplexType.ThingPresent addNewThingPresent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType.ThingPresent target = null;
            target = (org.lidoSchema.EventComplexType.ThingPresent)get_store().add_element_user(THINGPRESENT$22);
            return target;
        }
    }

    /**
     * Removes the ith "thingPresent" element
     */
    public void removeThingPresent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(THINGPRESENT$22, i);
        }
    }

    /**
     * Gets a List of "relatedEventSet" elements
     */
    public java.util.List<org.lidoSchema.EventComplexType.RelatedEventSet> getRelatedEventSetList()
    {
        final class RelatedEventSetList extends java.util.AbstractList<org.lidoSchema.EventComplexType.RelatedEventSet>
        {
            @Override
            public org.lidoSchema.EventComplexType.RelatedEventSet get(int i)
                { return EventComplexTypeImpl.this.getRelatedEventSetArray(i); }

            @Override
            public org.lidoSchema.EventComplexType.RelatedEventSet set(int i, org.lidoSchema.EventComplexType.RelatedEventSet o)
            {
                org.lidoSchema.EventComplexType.RelatedEventSet old = EventComplexTypeImpl.this.getRelatedEventSetArray(i);
                EventComplexTypeImpl.this.setRelatedEventSetArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.EventComplexType.RelatedEventSet o)
                { EventComplexTypeImpl.this.insertNewRelatedEventSet(i).set(o); }

            @Override
            public org.lidoSchema.EventComplexType.RelatedEventSet remove(int i)
            {
                org.lidoSchema.EventComplexType.RelatedEventSet old = EventComplexTypeImpl.this.getRelatedEventSetArray(i);
                EventComplexTypeImpl.this.removeRelatedEventSet(i);
                return old;
            }

            @Override
            public int size()
                { return EventComplexTypeImpl.this.sizeOfRelatedEventSetArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new RelatedEventSetList();
        }
    }

    /**
     * Gets array of all "relatedEventSet" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.EventComplexType.RelatedEventSet[] getRelatedEventSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.EventComplexType.RelatedEventSet> targetList = new java.util.ArrayList<org.lidoSchema.EventComplexType.RelatedEventSet>();
            get_store().find_all_element_users(RELATEDEVENTSET$24, targetList);
            org.lidoSchema.EventComplexType.RelatedEventSet[] result = new org.lidoSchema.EventComplexType.RelatedEventSet[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "relatedEventSet" element
     */
    public org.lidoSchema.EventComplexType.RelatedEventSet getRelatedEventSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType.RelatedEventSet target = null;
            target = (org.lidoSchema.EventComplexType.RelatedEventSet)get_store().find_element_user(RELATEDEVENTSET$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "relatedEventSet" element
     */
    public int sizeOfRelatedEventSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATEDEVENTSET$24);
        }
    }

    /**
     * Sets array of all "relatedEventSet" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setRelatedEventSetArray(org.lidoSchema.EventComplexType.RelatedEventSet[] relatedEventSetArray)
    {
        check_orphaned();
        arraySetterHelper(relatedEventSetArray, RELATEDEVENTSET$24);
    }

    /**
     * Sets ith "relatedEventSet" element
     */
    @Inject(optional=true) public void setRelatedEventSetArray(int i, org.lidoSchema.EventComplexType.RelatedEventSet relatedEventSet)
    {
        generatedSetterHelperImpl(relatedEventSet, RELATEDEVENTSET$24, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "relatedEventSet" element
     */
    public org.lidoSchema.EventComplexType.RelatedEventSet insertNewRelatedEventSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType.RelatedEventSet target = null;
            target = (org.lidoSchema.EventComplexType.RelatedEventSet)get_store().insert_element_user(RELATEDEVENTSET$24, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "relatedEventSet" element
     */
    public org.lidoSchema.EventComplexType.RelatedEventSet addNewRelatedEventSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType.RelatedEventSet target = null;
            target = (org.lidoSchema.EventComplexType.RelatedEventSet)get_store().add_element_user(RELATEDEVENTSET$24);
            return target;
        }
    }

    /**
     * Removes the ith "relatedEventSet" element
     */
    public void removeRelatedEventSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATEDEVENTSET$24, i);
        }
    }

    /**
     * Gets a List of "eventDescriptionSet" elements
     */
    public java.util.List<org.lidoSchema.DescriptiveNoteComplexType> getEventDescriptionSetList()
    {
        final class EventDescriptionSetList extends java.util.AbstractList<org.lidoSchema.DescriptiveNoteComplexType>
        {
            @Override
            public org.lidoSchema.DescriptiveNoteComplexType get(int i)
                { return EventComplexTypeImpl.this.getEventDescriptionSetArray(i); }

            @Override
            public org.lidoSchema.DescriptiveNoteComplexType set(int i, org.lidoSchema.DescriptiveNoteComplexType o)
            {
                org.lidoSchema.DescriptiveNoteComplexType old = EventComplexTypeImpl.this.getEventDescriptionSetArray(i);
                EventComplexTypeImpl.this.setEventDescriptionSetArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.DescriptiveNoteComplexType o)
                { EventComplexTypeImpl.this.insertNewEventDescriptionSet(i).set(o); }

            @Override
            public org.lidoSchema.DescriptiveNoteComplexType remove(int i)
            {
                org.lidoSchema.DescriptiveNoteComplexType old = EventComplexTypeImpl.this.getEventDescriptionSetArray(i);
                EventComplexTypeImpl.this.removeEventDescriptionSet(i);
                return old;
            }

            @Override
            public int size()
                { return EventComplexTypeImpl.this.sizeOfEventDescriptionSetArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new EventDescriptionSetList();
        }
    }

    /**
     * Gets array of all "eventDescriptionSet" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.DescriptiveNoteComplexType[] getEventDescriptionSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.DescriptiveNoteComplexType> targetList = new java.util.ArrayList<org.lidoSchema.DescriptiveNoteComplexType>();
            get_store().find_all_element_users(EVENTDESCRIPTIONSET$26, targetList);
            org.lidoSchema.DescriptiveNoteComplexType[] result = new org.lidoSchema.DescriptiveNoteComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "eventDescriptionSet" element
     */
    public org.lidoSchema.DescriptiveNoteComplexType getEventDescriptionSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.DescriptiveNoteComplexType target = null;
            target = (org.lidoSchema.DescriptiveNoteComplexType)get_store().find_element_user(EVENTDESCRIPTIONSET$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "eventDescriptionSet" element
     */
    public int sizeOfEventDescriptionSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTDESCRIPTIONSET$26);
        }
    }

    /**
     * Sets array of all "eventDescriptionSet" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setEventDescriptionSetArray(org.lidoSchema.DescriptiveNoteComplexType[] eventDescriptionSetArray)
    {
        check_orphaned();
        arraySetterHelper(eventDescriptionSetArray, EVENTDESCRIPTIONSET$26);
    }

    /**
     * Sets ith "eventDescriptionSet" element
     */
    @Inject(optional=true) public void setEventDescriptionSetArray(int i, org.lidoSchema.DescriptiveNoteComplexType eventDescriptionSet)
    {
        generatedSetterHelperImpl(eventDescriptionSet, EVENTDESCRIPTIONSET$26, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventDescriptionSet" element
     */
    public org.lidoSchema.DescriptiveNoteComplexType insertNewEventDescriptionSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.DescriptiveNoteComplexType target = null;
            target = (org.lidoSchema.DescriptiveNoteComplexType)get_store().insert_element_user(EVENTDESCRIPTIONSET$26, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "eventDescriptionSet" element
     */
    public org.lidoSchema.DescriptiveNoteComplexType addNewEventDescriptionSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.DescriptiveNoteComplexType target = null;
            target = (org.lidoSchema.DescriptiveNoteComplexType)get_store().add_element_user(EVENTDESCRIPTIONSET$26);
            return target;
        }
    }

    /**
     * Removes the ith "eventDescriptionSet" element
     */
    public void removeEventDescriptionSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTDESCRIPTIONSET$26, i);
        }
    }
    /**
     * An XML eventActor(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class EventActorImpl extends org.lidoSchema.impl.ActorInRoleSetComplexTypeImpl implements org.lidoSchema.EventComplexType.EventActor
    {
        private static final long serialVersionUID = 1L;

        public EventActorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName SORTORDER$0 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "sortorder");


        /**
         * Gets the "sortorder" attribute
         */
        public java.math.BigInteger getSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }

        /**
         * Gets (as xml) the "sortorder" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$0);
                return target;
            }
        }

        /**
         * True if has "sortorder" attribute
         */
        public boolean isSetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SORTORDER$0) != null;
            }
        }

        /**
         * Sets the "sortorder" attribute
         */
        @Inject(optional=true) public void setSortorder(@SortOrder java.math.BigInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTORDER$0);
                }
                target.setBigIntegerValue(sortorder);
            }
        }

        /**
         * Sets (as xml) the "sortorder" attribute
         */
        public void xsetSortorder(org.apache.xmlbeans.XmlInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SORTORDER$0);
                }
                target.set(sortorder);
            }
        }

        /**
         * Unsets the "sortorder" attribute
         */
        public void unsetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SORTORDER$0);
            }
        }
    }
    /**
     * An XML culture(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class CultureImpl extends org.lidoSchema.impl.ConceptComplexTypeImpl implements org.lidoSchema.EventComplexType.Culture
    {
        private static final long serialVersionUID = 1L;

        public CultureImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName SORTORDER$0 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "sortorder");


        /**
         * Gets the "sortorder" attribute
         */
        public java.math.BigInteger getSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }

        /**
         * Gets (as xml) the "sortorder" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$0);
                return target;
            }
        }

        /**
         * True if has "sortorder" attribute
         */
        public boolean isSetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SORTORDER$0) != null;
            }
        }

        /**
         * Sets the "sortorder" attribute
         */
        @Inject(optional=true) public void setSortorder(@SortOrder java.math.BigInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTORDER$0);
                }
                target.setBigIntegerValue(sortorder);
            }
        }

        /**
         * Sets (as xml) the "sortorder" attribute
         */
        public void xsetSortorder(org.apache.xmlbeans.XmlInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SORTORDER$0);
                }
                target.set(sortorder);
            }
        }

        /**
         * Unsets the "sortorder" attribute
         */
        public void unsetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SORTORDER$0);
            }
        }
    }
    /**
     * An XML periodName(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class PeriodNameImpl extends org.lidoSchema.impl.ConceptComplexTypeImpl implements org.lidoSchema.EventComplexType.PeriodName
    {
        private static final long serialVersionUID = 1L;

        public PeriodNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName TYPE$0 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "type");
        private static final javax.xml.namespace.QName SORTORDER$2 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "sortorder");


        /**
         * Gets the "type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                return target;
            }
        }

        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$0) != null;
            }
        }

        /**
         * Sets the "type" attribute
         */
        @Inject(optional=true) public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
                }
                target.setStringValue(type);
            }
        }

        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$0);
                }
                target.set(type);
            }
        }

        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$0);
            }
        }

        /**
         * Gets the "sortorder" attribute
         */
        public java.math.BigInteger getSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$2);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }

        /**
         * Gets (as xml) the "sortorder" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$2);
                return target;
            }
        }

        /**
         * True if has "sortorder" attribute
         */
        public boolean isSetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SORTORDER$2) != null;
            }
        }

        /**
         * Sets the "sortorder" attribute
         */
        @Inject(optional=true) public void setSortorder(@SortOrder java.math.BigInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTORDER$2);
                }
                target.setBigIntegerValue(sortorder);
            }
        }

        /**
         * Sets (as xml) the "sortorder" attribute
         */
        public void xsetSortorder(org.apache.xmlbeans.XmlInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SORTORDER$2);
                }
                target.set(sortorder);
            }
        }

        /**
         * Unsets the "sortorder" attribute
         */
        public void unsetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SORTORDER$2);
            }
        }
    }
    /**
     * An XML eventPlace(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class EventPlaceImpl extends org.lidoSchema.impl.PlaceSetComplexTypeImpl implements org.lidoSchema.EventComplexType.EventPlace
    {
        private static final long serialVersionUID = 1L;

        public EventPlaceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName TYPE$0 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "type");
        private static final javax.xml.namespace.QName SORTORDER$2 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "sortorder");


        /**
         * Gets the "type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                return target;
            }
        }

        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$0) != null;
            }
        }

        /**
         * Sets the "type" attribute
         */
        @Inject(optional=true) public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
                }
                target.setStringValue(type);
            }
        }

        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$0);
                }
                target.set(type);
            }
        }

        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$0);
            }
        }

        /**
         * Gets the "sortorder" attribute
         */
        public java.math.BigInteger getSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$2);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }

        /**
         * Gets (as xml) the "sortorder" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$2);
                return target;
            }
        }

        /**
         * True if has "sortorder" attribute
         */
        public boolean isSetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SORTORDER$2) != null;
            }
        }

        /**
         * Sets the "sortorder" attribute
         */
        @Inject(optional=true) public void setSortorder(@SortOrder java.math.BigInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTORDER$2);
                }
                target.setBigIntegerValue(sortorder);
            }
        }

        /**
         * Sets (as xml) the "sortorder" attribute
         */
        public void xsetSortorder(org.apache.xmlbeans.XmlInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SORTORDER$2);
                }
                target.set(sortorder);
            }
        }

        /**
         * Unsets the "sortorder" attribute
         */
        public void unsetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SORTORDER$2);
            }
        }
    }
    /**
     * An XML eventMethod(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class EventMethodImpl extends org.lidoSchema.impl.ConceptComplexTypeImpl implements org.lidoSchema.EventComplexType.EventMethod
    {
        private static final long serialVersionUID = 1L;

        public EventMethodImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName SORTORDER$0 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "sortorder");


        /**
         * Gets the "sortorder" attribute
         */
        public java.math.BigInteger getSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }

        /**
         * Gets (as xml) the "sortorder" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$0);
                return target;
            }
        }

        /**
         * True if has "sortorder" attribute
         */
        public boolean isSetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SORTORDER$0) != null;
            }
        }

        /**
         * Sets the "sortorder" attribute
         */
        @Inject(optional=true) public void setSortorder(@SortOrder java.math.BigInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTORDER$0);
                }
                target.setBigIntegerValue(sortorder);
            }
        }

        /**
         * Sets (as xml) the "sortorder" attribute
         */
        public void xsetSortorder(org.apache.xmlbeans.XmlInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SORTORDER$0);
                }
                target.set(sortorder);
            }
        }

        /**
         * Unsets the "sortorder" attribute
         */
        public void unsetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SORTORDER$0);
            }
        }
    }
    /**
     * An XML eventMaterialsTech(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class EventMaterialsTechImpl extends org.lidoSchema.impl.MaterialsTechSetComplexTypeImpl implements org.lidoSchema.EventComplexType.EventMaterialsTech
    {
        private static final long serialVersionUID = 1L;

        public EventMaterialsTechImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName SORTORDER$0 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "sortorder");


        /**
         * Gets the "sortorder" attribute
         */
        public java.math.BigInteger getSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }

        /**
         * Gets (as xml) the "sortorder" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$0);
                return target;
            }
        }

        /**
         * True if has "sortorder" attribute
         */
        public boolean isSetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SORTORDER$0) != null;
            }
        }

        /**
         * Sets the "sortorder" attribute
         */
        @Inject(optional=true) public void setSortorder(@SortOrder java.math.BigInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTORDER$0);
                }
                target.setBigIntegerValue(sortorder);
            }
        }

        /**
         * Sets (as xml) the "sortorder" attribute
         */
        public void xsetSortorder(org.apache.xmlbeans.XmlInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SORTORDER$0);
                }
                target.set(sortorder);
            }
        }

        /**
         * Unsets the "sortorder" attribute
         */
        public void unsetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SORTORDER$0);
            }
        }
    }
    /**
     * An XML thingPresent(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class ThingPresentImpl extends org.lidoSchema.impl.ObjectSetComplexTypeImpl implements org.lidoSchema.EventComplexType.ThingPresent
    {
        private static final long serialVersionUID = 1L;

        public ThingPresentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName SORTORDER$0 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "sortorder");


        /**
         * Gets the "sortorder" attribute
         */
        public java.math.BigInteger getSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }

        /**
         * Gets (as xml) the "sortorder" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$0);
                return target;
            }
        }

        /**
         * True if has "sortorder" attribute
         */
        public boolean isSetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SORTORDER$0) != null;
            }
        }

        /**
         * Sets the "sortorder" attribute
         */
        @Inject(optional=true) public void setSortorder(@SortOrder java.math.BigInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTORDER$0);
                }
                target.setBigIntegerValue(sortorder);
            }
        }

        /**
         * Sets (as xml) the "sortorder" attribute
         */
        public void xsetSortorder(org.apache.xmlbeans.XmlInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SORTORDER$0);
                }
                target.set(sortorder);
            }
        }

        /**
         * Unsets the "sortorder" attribute
         */
        public void unsetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SORTORDER$0);
            }
        }
    }
    /**
     * An XML relatedEventSet(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class RelatedEventSetImpl extends org.lidoSchema.impl.RelatedEventSetComplexTypeImpl implements org.lidoSchema.EventComplexType.RelatedEventSet
    {
        private static final long serialVersionUID = 1L;

        public RelatedEventSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName SORTORDER$0 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "sortorder");


        /**
         * Gets the "sortorder" attribute
         */
        public java.math.BigInteger getSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }

        /**
         * Gets (as xml) the "sortorder" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$0);
                return target;
            }
        }

        /**
         * True if has "sortorder" attribute
         */
        public boolean isSetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SORTORDER$0) != null;
            }
        }

        /**
         * Sets the "sortorder" attribute
         */
        @Inject(optional=true) public void setSortorder(@SortOrder java.math.BigInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTORDER$0);
                }
                target.setBigIntegerValue(sortorder);
            }
        }

        /**
         * Sets (as xml) the "sortorder" attribute
         */
        public void xsetSortorder(org.apache.xmlbeans.XmlInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SORTORDER$0);
                }
                target.set(sortorder);
            }
        }

        /**
         * Unsets the "sortorder" attribute
         */
        public void unsetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SORTORDER$0);
            }
        }
    }
}
