/*
 * XML Type:  actorComplexType
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.ActorComplexType
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
import org.moosbusch.museum.lido.inject.annotation.SortOrder;
/**
 * An XML actorComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class ActorComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ActorComplexType
{
    private static final long serialVersionUID = 1L;

    public ActorComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName ACTORID$0 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "actorID");
    private static final javax.xml.namespace.QName NAMEACTORSET$2 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "nameActorSet");
    private static final javax.xml.namespace.QName NATIONALITYACTOR$4 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "nationalityActor");
    private static final javax.xml.namespace.QName VITALDATESACTOR$6 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "vitalDatesActor");
    private static final javax.xml.namespace.QName GENDERACTOR$8 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "genderActor");
    private static final javax.xml.namespace.QName TYPE$10 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "type");


    /**
     * Gets a List of "actorID" elements
     */
    public java.util.List<org.lidoSchema.IdentifierComplexType> getActorIDList()
    {
        final class ActorIDList extends java.util.AbstractList<org.lidoSchema.IdentifierComplexType>
        {
            @Override
            public org.lidoSchema.IdentifierComplexType get(int i)
                { return ActorComplexTypeImpl.this.getActorIDArray(i); }

            @Override
            public org.lidoSchema.IdentifierComplexType set(int i, org.lidoSchema.IdentifierComplexType o)
            {
                org.lidoSchema.IdentifierComplexType old = ActorComplexTypeImpl.this.getActorIDArray(i);
                ActorComplexTypeImpl.this.setActorIDArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.IdentifierComplexType o)
                { ActorComplexTypeImpl.this.insertNewActorID(i).set(o); }

            @Override
            public org.lidoSchema.IdentifierComplexType remove(int i)
            {
                org.lidoSchema.IdentifierComplexType old = ActorComplexTypeImpl.this.getActorIDArray(i);
                ActorComplexTypeImpl.this.removeActorID(i);
                return old;
            }

            @Override
            public int size()
                { return ActorComplexTypeImpl.this.sizeOfActorIDArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new ActorIDList();
        }
    }

    /**
     * Gets array of all "actorID" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.IdentifierComplexType[] getActorIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.IdentifierComplexType> targetList = new java.util.ArrayList<org.lidoSchema.IdentifierComplexType>();
            get_store().find_all_element_users(ACTORID$0, targetList);
            org.lidoSchema.IdentifierComplexType[] result = new org.lidoSchema.IdentifierComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "actorID" element
     */
    public org.lidoSchema.IdentifierComplexType getActorIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().find_element_user(ACTORID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "actorID" element
     */
    public int sizeOfActorIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTORID$0);
        }
    }

    /**
     * Sets array of all "actorID" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setActorIDArray(org.lidoSchema.IdentifierComplexType[] actorIDArray)
    {
        check_orphaned();
        arraySetterHelper(actorIDArray, ACTORID$0);
    }

    /**
     * Sets ith "actorID" element
     */
    @Inject(optional=true) public void setActorIDArray(int i, org.lidoSchema.IdentifierComplexType actorID)
    {
        generatedSetterHelperImpl(actorID, ACTORID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "actorID" element
     */
    public org.lidoSchema.IdentifierComplexType insertNewActorID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().insert_element_user(ACTORID$0, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "actorID" element
     */
    public org.lidoSchema.IdentifierComplexType addNewActorID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().add_element_user(ACTORID$0);
            return target;
        }
    }

    /**
     * Removes the ith "actorID" element
     */
    public void removeActorID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTORID$0, i);
        }
    }

    /**
     * Gets a List of "nameActorSet" elements
     */
    public java.util.List<org.lidoSchema.AppellationComplexType> getNameActorSetList()
    {
        final class NameActorSetList extends java.util.AbstractList<org.lidoSchema.AppellationComplexType>
        {
            @Override
            public org.lidoSchema.AppellationComplexType get(int i)
                { return ActorComplexTypeImpl.this.getNameActorSetArray(i); }

            @Override
            public org.lidoSchema.AppellationComplexType set(int i, org.lidoSchema.AppellationComplexType o)
            {
                org.lidoSchema.AppellationComplexType old = ActorComplexTypeImpl.this.getNameActorSetArray(i);
                ActorComplexTypeImpl.this.setNameActorSetArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.AppellationComplexType o)
                { ActorComplexTypeImpl.this.insertNewNameActorSet(i).set(o); }

            @Override
            public org.lidoSchema.AppellationComplexType remove(int i)
            {
                org.lidoSchema.AppellationComplexType old = ActorComplexTypeImpl.this.getNameActorSetArray(i);
                ActorComplexTypeImpl.this.removeNameActorSet(i);
                return old;
            }

            @Override
            public int size()
                { return ActorComplexTypeImpl.this.sizeOfNameActorSetArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new NameActorSetList();
        }
    }

    /**
     * Gets array of all "nameActorSet" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.AppellationComplexType[] getNameActorSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.AppellationComplexType> targetList = new java.util.ArrayList<org.lidoSchema.AppellationComplexType>();
            get_store().find_all_element_users(NAMEACTORSET$2, targetList);
            org.lidoSchema.AppellationComplexType[] result = new org.lidoSchema.AppellationComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "nameActorSet" element
     */
    public org.lidoSchema.AppellationComplexType getNameActorSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.AppellationComplexType target = null;
            target = (org.lidoSchema.AppellationComplexType)get_store().find_element_user(NAMEACTORSET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "nameActorSet" element
     */
    public int sizeOfNameActorSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAMEACTORSET$2);
        }
    }

    /**
     * Sets array of all "nameActorSet" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setNameActorSetArray(org.lidoSchema.AppellationComplexType[] nameActorSetArray)
    {
        check_orphaned();
        arraySetterHelper(nameActorSetArray, NAMEACTORSET$2);
    }

    /**
     * Sets ith "nameActorSet" element
     */
    @Inject(optional=true) public void setNameActorSetArray(int i, org.lidoSchema.AppellationComplexType nameActorSet)
    {
        generatedSetterHelperImpl(nameActorSet, NAMEACTORSET$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "nameActorSet" element
     */
    public org.lidoSchema.AppellationComplexType insertNewNameActorSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.AppellationComplexType target = null;
            target = (org.lidoSchema.AppellationComplexType)get_store().insert_element_user(NAMEACTORSET$2, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "nameActorSet" element
     */
    public org.lidoSchema.AppellationComplexType addNewNameActorSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.AppellationComplexType target = null;
            target = (org.lidoSchema.AppellationComplexType)get_store().add_element_user(NAMEACTORSET$2);
            return target;
        }
    }

    /**
     * Removes the ith "nameActorSet" element
     */
    public void removeNameActorSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAMEACTORSET$2, i);
        }
    }

    /**
     * Gets a List of "nationalityActor" elements
     */
    public java.util.List<org.lidoSchema.ActorComplexType.NationalityActor> getNationalityActorList()
    {
        final class NationalityActorList extends java.util.AbstractList<org.lidoSchema.ActorComplexType.NationalityActor>
        {
            @Override
            public org.lidoSchema.ActorComplexType.NationalityActor get(int i)
                { return ActorComplexTypeImpl.this.getNationalityActorArray(i); }

            @Override
            public org.lidoSchema.ActorComplexType.NationalityActor set(int i, org.lidoSchema.ActorComplexType.NationalityActor o)
            {
                org.lidoSchema.ActorComplexType.NationalityActor old = ActorComplexTypeImpl.this.getNationalityActorArray(i);
                ActorComplexTypeImpl.this.setNationalityActorArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.ActorComplexType.NationalityActor o)
                { ActorComplexTypeImpl.this.insertNewNationalityActor(i).set(o); }

            @Override
            public org.lidoSchema.ActorComplexType.NationalityActor remove(int i)
            {
                org.lidoSchema.ActorComplexType.NationalityActor old = ActorComplexTypeImpl.this.getNationalityActorArray(i);
                ActorComplexTypeImpl.this.removeNationalityActor(i);
                return old;
            }

            @Override
            public int size()
                { return ActorComplexTypeImpl.this.sizeOfNationalityActorArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new NationalityActorList();
        }
    }

    /**
     * Gets array of all "nationalityActor" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.ActorComplexType.NationalityActor[] getNationalityActorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.ActorComplexType.NationalityActor> targetList = new java.util.ArrayList<org.lidoSchema.ActorComplexType.NationalityActor>();
            get_store().find_all_element_users(NATIONALITYACTOR$4, targetList);
            org.lidoSchema.ActorComplexType.NationalityActor[] result = new org.lidoSchema.ActorComplexType.NationalityActor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "nationalityActor" element
     */
    public org.lidoSchema.ActorComplexType.NationalityActor getNationalityActorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ActorComplexType.NationalityActor target = null;
            target = (org.lidoSchema.ActorComplexType.NationalityActor)get_store().find_element_user(NATIONALITYACTOR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "nationalityActor" element
     */
    public int sizeOfNationalityActorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NATIONALITYACTOR$4);
        }
    }

    /**
     * Sets array of all "nationalityActor" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setNationalityActorArray(org.lidoSchema.ActorComplexType.NationalityActor[] nationalityActorArray)
    {
        check_orphaned();
        arraySetterHelper(nationalityActorArray, NATIONALITYACTOR$4);
    }

    /**
     * Sets ith "nationalityActor" element
     */
    @Inject(optional=true) public void setNationalityActorArray(int i, org.lidoSchema.ActorComplexType.NationalityActor nationalityActor)
    {
        generatedSetterHelperImpl(nationalityActor, NATIONALITYACTOR$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "nationalityActor" element
     */
    public org.lidoSchema.ActorComplexType.NationalityActor insertNewNationalityActor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ActorComplexType.NationalityActor target = null;
            target = (org.lidoSchema.ActorComplexType.NationalityActor)get_store().insert_element_user(NATIONALITYACTOR$4, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "nationalityActor" element
     */
    public org.lidoSchema.ActorComplexType.NationalityActor addNewNationalityActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ActorComplexType.NationalityActor target = null;
            target = (org.lidoSchema.ActorComplexType.NationalityActor)get_store().add_element_user(NATIONALITYACTOR$4);
            return target;
        }
    }

    /**
     * Removes the ith "nationalityActor" element
     */
    public void removeNationalityActor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NATIONALITYACTOR$4, i);
        }
    }

    /**
     * Gets the "vitalDatesActor" element
     */
    public org.lidoSchema.DateComplexType getVitalDatesActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.DateComplexType target = null;
            target = (org.lidoSchema.DateComplexType)get_store().find_element_user(VITALDATESACTOR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * True if has "vitalDatesActor" element
     */
    public boolean isSetVitalDatesActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VITALDATESACTOR$6) != 0;
        }
    }

    /**
     * Sets the "vitalDatesActor" element
     */
    @Inject(optional=true) public void setVitalDatesActor(org.lidoSchema.DateComplexType vitalDatesActor)
    {
        generatedSetterHelperImpl(vitalDatesActor, VITALDATESACTOR$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "vitalDatesActor" element
     */
    public org.lidoSchema.DateComplexType addNewVitalDatesActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.DateComplexType target = null;
            target = (org.lidoSchema.DateComplexType)get_store().add_element_user(VITALDATESACTOR$6);
            return target;
        }
    }

    /**
     * Unsets the "vitalDatesActor" element
     */
    public void unsetVitalDatesActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VITALDATESACTOR$6, 0);
        }
    }

    /**
     * Gets a List of "genderActor" elements
     */
    public java.util.List<org.lidoSchema.TextComplexType> getGenderActorList()
    {
        final class GenderActorList extends java.util.AbstractList<org.lidoSchema.TextComplexType>
        {
            @Override
            public org.lidoSchema.TextComplexType get(int i)
                { return ActorComplexTypeImpl.this.getGenderActorArray(i); }

            @Override
            public org.lidoSchema.TextComplexType set(int i, org.lidoSchema.TextComplexType o)
            {
                org.lidoSchema.TextComplexType old = ActorComplexTypeImpl.this.getGenderActorArray(i);
                ActorComplexTypeImpl.this.setGenderActorArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.TextComplexType o)
                { ActorComplexTypeImpl.this.insertNewGenderActor(i).set(o); }

            @Override
            public org.lidoSchema.TextComplexType remove(int i)
            {
                org.lidoSchema.TextComplexType old = ActorComplexTypeImpl.this.getGenderActorArray(i);
                ActorComplexTypeImpl.this.removeGenderActor(i);
                return old;
            }

            @Override
            public int size()
                { return ActorComplexTypeImpl.this.sizeOfGenderActorArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new GenderActorList();
        }
    }

    /**
     * Gets array of all "genderActor" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.TextComplexType[] getGenderActorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.TextComplexType> targetList = new java.util.ArrayList<org.lidoSchema.TextComplexType>();
            get_store().find_all_element_users(GENDERACTOR$8, targetList);
            org.lidoSchema.TextComplexType[] result = new org.lidoSchema.TextComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "genderActor" element
     */
    public org.lidoSchema.TextComplexType getGenderActorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().find_element_user(GENDERACTOR$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "genderActor" element
     */
    public int sizeOfGenderActorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GENDERACTOR$8);
        }
    }

    /**
     * Sets array of all "genderActor" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setGenderActorArray(org.lidoSchema.TextComplexType[] genderActorArray)
    {
        check_orphaned();
        arraySetterHelper(genderActorArray, GENDERACTOR$8);
    }

    /**
     * Sets ith "genderActor" element
     */
    @Inject(optional=true) public void setGenderActorArray(int i, org.lidoSchema.TextComplexType genderActor)
    {
        generatedSetterHelperImpl(genderActor, GENDERACTOR$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "genderActor" element
     */
    public org.lidoSchema.TextComplexType insertNewGenderActor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().insert_element_user(GENDERACTOR$8, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "genderActor" element
     */
    public org.lidoSchema.TextComplexType addNewGenderActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().add_element_user(GENDERACTOR$8);
            return target;
        }
    }

    /**
     * Removes the ith "genderActor" element
     */
    public void removeGenderActor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GENDERACTOR$8, i);
        }
    }

    /**
     * Gets the "type" attribute
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$10);
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
            return get_store().find_attribute_user(TYPE$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$10);
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
            get_store().remove_attribute(TYPE$10);
        }
    }
    /**
     * An XML nationalityActor(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class NationalityActorImpl extends org.lidoSchema.impl.ConceptComplexTypeImpl implements org.lidoSchema.ActorComplexType.NationalityActor
    {
        private static final long serialVersionUID = 1L;

        public NationalityActorImpl(org.apache.xmlbeans.SchemaType sType)
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
