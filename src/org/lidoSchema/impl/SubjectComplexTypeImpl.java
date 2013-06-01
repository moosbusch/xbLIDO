/*
 * XML Type:  subjectComplexType
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.SubjectComplexType
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
import org.moosbusch.museum.lido.inject.annotation.SortOrder;
/**
 * An XML subjectComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class SubjectComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.SubjectComplexType
{
    private static final long serialVersionUID = 1L;

    public SubjectComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName EXTENTSUBJECT$0 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "extentSubject");
    private static final javax.xml.namespace.QName SUBJECTCONCEPT$2 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "subjectConcept");
    private static final javax.xml.namespace.QName SUBJECTACTOR$4 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "subjectActor");
    private static final javax.xml.namespace.QName SUBJECTDATE$6 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "subjectDate");
    private static final javax.xml.namespace.QName SUBJECTEVENT$8 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "subjectEvent");
    private static final javax.xml.namespace.QName SUBJECTPLACE$10 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "subjectPlace");
    private static final javax.xml.namespace.QName SUBJECTOBJECT$12 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "subjectObject");
    private static final javax.xml.namespace.QName TYPE$14 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "type");


    /**
     * Gets a List of "extentSubject" elements
     */
    public java.util.List<org.lidoSchema.TextComplexType> getExtentSubjectList()
    {
        final class ExtentSubjectList extends java.util.AbstractList<org.lidoSchema.TextComplexType>
        {
            @Override
            public org.lidoSchema.TextComplexType get(int i)
                { return SubjectComplexTypeImpl.this.getExtentSubjectArray(i); }

            @Override
            public org.lidoSchema.TextComplexType set(int i, org.lidoSchema.TextComplexType o)
            {
                org.lidoSchema.TextComplexType old = SubjectComplexTypeImpl.this.getExtentSubjectArray(i);
                SubjectComplexTypeImpl.this.setExtentSubjectArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.TextComplexType o)
                { SubjectComplexTypeImpl.this.insertNewExtentSubject(i).set(o); }

            @Override
            public org.lidoSchema.TextComplexType remove(int i)
            {
                org.lidoSchema.TextComplexType old = SubjectComplexTypeImpl.this.getExtentSubjectArray(i);
                SubjectComplexTypeImpl.this.removeExtentSubject(i);
                return old;
            }

            @Override
            public int size()
                { return SubjectComplexTypeImpl.this.sizeOfExtentSubjectArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new ExtentSubjectList();
        }
    }

    /**
     * Gets array of all "extentSubject" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.TextComplexType[] getExtentSubjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.TextComplexType> targetList = new java.util.ArrayList<org.lidoSchema.TextComplexType>();
            get_store().find_all_element_users(EXTENTSUBJECT$0, targetList);
            org.lidoSchema.TextComplexType[] result = new org.lidoSchema.TextComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "extentSubject" element
     */
    public org.lidoSchema.TextComplexType getExtentSubjectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().find_element_user(EXTENTSUBJECT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "extentSubject" element
     */
    public int sizeOfExtentSubjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENTSUBJECT$0);
        }
    }

    /**
     * Sets array of all "extentSubject" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setExtentSubjectArray(org.lidoSchema.TextComplexType[] extentSubjectArray)
    {
        check_orphaned();
        arraySetterHelper(extentSubjectArray, EXTENTSUBJECT$0);
    }

    /**
     * Sets ith "extentSubject" element
     */
    @Inject(optional=true) public void setExtentSubjectArray(int i, org.lidoSchema.TextComplexType extentSubject)
    {
        generatedSetterHelperImpl(extentSubject, EXTENTSUBJECT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "extentSubject" element
     */
    public org.lidoSchema.TextComplexType insertNewExtentSubject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().insert_element_user(EXTENTSUBJECT$0, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "extentSubject" element
     */
    public org.lidoSchema.TextComplexType addNewExtentSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().add_element_user(EXTENTSUBJECT$0);
            return target;
        }
    }

    /**
     * Removes the ith "extentSubject" element
     */
    public void removeExtentSubject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENTSUBJECT$0, i);
        }
    }

    /**
     * Gets a List of "subjectConcept" elements
     */
    public java.util.List<org.lidoSchema.SubjectComplexType.SubjectConcept> getSubjectConceptList()
    {
        final class SubjectConceptList extends java.util.AbstractList<org.lidoSchema.SubjectComplexType.SubjectConcept>
        {
            @Override
            public org.lidoSchema.SubjectComplexType.SubjectConcept get(int i)
                { return SubjectComplexTypeImpl.this.getSubjectConceptArray(i); }

            @Override
            public org.lidoSchema.SubjectComplexType.SubjectConcept set(int i, org.lidoSchema.SubjectComplexType.SubjectConcept o)
            {
                org.lidoSchema.SubjectComplexType.SubjectConcept old = SubjectComplexTypeImpl.this.getSubjectConceptArray(i);
                SubjectComplexTypeImpl.this.setSubjectConceptArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.SubjectComplexType.SubjectConcept o)
                { SubjectComplexTypeImpl.this.insertNewSubjectConcept(i).set(o); }

            @Override
            public org.lidoSchema.SubjectComplexType.SubjectConcept remove(int i)
            {
                org.lidoSchema.SubjectComplexType.SubjectConcept old = SubjectComplexTypeImpl.this.getSubjectConceptArray(i);
                SubjectComplexTypeImpl.this.removeSubjectConcept(i);
                return old;
            }

            @Override
            public int size()
                { return SubjectComplexTypeImpl.this.sizeOfSubjectConceptArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new SubjectConceptList();
        }
    }

    /**
     * Gets array of all "subjectConcept" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.SubjectComplexType.SubjectConcept[] getSubjectConceptArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.SubjectComplexType.SubjectConcept> targetList = new java.util.ArrayList<org.lidoSchema.SubjectComplexType.SubjectConcept>();
            get_store().find_all_element_users(SUBJECTCONCEPT$2, targetList);
            org.lidoSchema.SubjectComplexType.SubjectConcept[] result = new org.lidoSchema.SubjectComplexType.SubjectConcept[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "subjectConcept" element
     */
    public org.lidoSchema.SubjectComplexType.SubjectConcept getSubjectConceptArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.SubjectComplexType.SubjectConcept target = null;
            target = (org.lidoSchema.SubjectComplexType.SubjectConcept)get_store().find_element_user(SUBJECTCONCEPT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "subjectConcept" element
     */
    public int sizeOfSubjectConceptArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECTCONCEPT$2);
        }
    }

    /**
     * Sets array of all "subjectConcept" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setSubjectConceptArray(org.lidoSchema.SubjectComplexType.SubjectConcept[] subjectConceptArray)
    {
        check_orphaned();
        arraySetterHelper(subjectConceptArray, SUBJECTCONCEPT$2);
    }

    /**
     * Sets ith "subjectConcept" element
     */
    @Inject(optional=true) public void setSubjectConceptArray(int i, org.lidoSchema.SubjectComplexType.SubjectConcept subjectConcept)
    {
        generatedSetterHelperImpl(subjectConcept, SUBJECTCONCEPT$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "subjectConcept" element
     */
    public org.lidoSchema.SubjectComplexType.SubjectConcept insertNewSubjectConcept(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.SubjectComplexType.SubjectConcept target = null;
            target = (org.lidoSchema.SubjectComplexType.SubjectConcept)get_store().insert_element_user(SUBJECTCONCEPT$2, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "subjectConcept" element
     */
    public org.lidoSchema.SubjectComplexType.SubjectConcept addNewSubjectConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.SubjectComplexType.SubjectConcept target = null;
            target = (org.lidoSchema.SubjectComplexType.SubjectConcept)get_store().add_element_user(SUBJECTCONCEPT$2);
            return target;
        }
    }

    /**
     * Removes the ith "subjectConcept" element
     */
    public void removeSubjectConcept(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECTCONCEPT$2, i);
        }
    }

    /**
     * Gets a List of "subjectActor" elements
     */
    public java.util.List<org.lidoSchema.SubjectComplexType.SubjectActor> getSubjectActorList()
    {
        final class SubjectActorList extends java.util.AbstractList<org.lidoSchema.SubjectComplexType.SubjectActor>
        {
            @Override
            public org.lidoSchema.SubjectComplexType.SubjectActor get(int i)
                { return SubjectComplexTypeImpl.this.getSubjectActorArray(i); }

            @Override
            public org.lidoSchema.SubjectComplexType.SubjectActor set(int i, org.lidoSchema.SubjectComplexType.SubjectActor o)
            {
                org.lidoSchema.SubjectComplexType.SubjectActor old = SubjectComplexTypeImpl.this.getSubjectActorArray(i);
                SubjectComplexTypeImpl.this.setSubjectActorArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.SubjectComplexType.SubjectActor o)
                { SubjectComplexTypeImpl.this.insertNewSubjectActor(i).set(o); }

            @Override
            public org.lidoSchema.SubjectComplexType.SubjectActor remove(int i)
            {
                org.lidoSchema.SubjectComplexType.SubjectActor old = SubjectComplexTypeImpl.this.getSubjectActorArray(i);
                SubjectComplexTypeImpl.this.removeSubjectActor(i);
                return old;
            }

            @Override
            public int size()
                { return SubjectComplexTypeImpl.this.sizeOfSubjectActorArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new SubjectActorList();
        }
    }

    /**
     * Gets array of all "subjectActor" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.SubjectComplexType.SubjectActor[] getSubjectActorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.SubjectComplexType.SubjectActor> targetList = new java.util.ArrayList<org.lidoSchema.SubjectComplexType.SubjectActor>();
            get_store().find_all_element_users(SUBJECTACTOR$4, targetList);
            org.lidoSchema.SubjectComplexType.SubjectActor[] result = new org.lidoSchema.SubjectComplexType.SubjectActor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "subjectActor" element
     */
    public org.lidoSchema.SubjectComplexType.SubjectActor getSubjectActorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.SubjectComplexType.SubjectActor target = null;
            target = (org.lidoSchema.SubjectComplexType.SubjectActor)get_store().find_element_user(SUBJECTACTOR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "subjectActor" element
     */
    public int sizeOfSubjectActorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECTACTOR$4);
        }
    }

    /**
     * Sets array of all "subjectActor" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setSubjectActorArray(org.lidoSchema.SubjectComplexType.SubjectActor[] subjectActorArray)
    {
        check_orphaned();
        arraySetterHelper(subjectActorArray, SUBJECTACTOR$4);
    }

    /**
     * Sets ith "subjectActor" element
     */
    @Inject(optional=true) public void setSubjectActorArray(int i, org.lidoSchema.SubjectComplexType.SubjectActor subjectActor)
    {
        generatedSetterHelperImpl(subjectActor, SUBJECTACTOR$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "subjectActor" element
     */
    public org.lidoSchema.SubjectComplexType.SubjectActor insertNewSubjectActor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.SubjectComplexType.SubjectActor target = null;
            target = (org.lidoSchema.SubjectComplexType.SubjectActor)get_store().insert_element_user(SUBJECTACTOR$4, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "subjectActor" element
     */
    public org.lidoSchema.SubjectComplexType.SubjectActor addNewSubjectActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.SubjectComplexType.SubjectActor target = null;
            target = (org.lidoSchema.SubjectComplexType.SubjectActor)get_store().add_element_user(SUBJECTACTOR$4);
            return target;
        }
    }

    /**
     * Removes the ith "subjectActor" element
     */
    public void removeSubjectActor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECTACTOR$4, i);
        }
    }

    /**
     * Gets a List of "subjectDate" elements
     */
    public java.util.List<org.lidoSchema.SubjectComplexType.SubjectDate> getSubjectDateList()
    {
        final class SubjectDateList extends java.util.AbstractList<org.lidoSchema.SubjectComplexType.SubjectDate>
        {
            @Override
            public org.lidoSchema.SubjectComplexType.SubjectDate get(int i)
                { return SubjectComplexTypeImpl.this.getSubjectDateArray(i); }

            @Override
            public org.lidoSchema.SubjectComplexType.SubjectDate set(int i, org.lidoSchema.SubjectComplexType.SubjectDate o)
            {
                org.lidoSchema.SubjectComplexType.SubjectDate old = SubjectComplexTypeImpl.this.getSubjectDateArray(i);
                SubjectComplexTypeImpl.this.setSubjectDateArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.SubjectComplexType.SubjectDate o)
                { SubjectComplexTypeImpl.this.insertNewSubjectDate(i).set(o); }

            @Override
            public org.lidoSchema.SubjectComplexType.SubjectDate remove(int i)
            {
                org.lidoSchema.SubjectComplexType.SubjectDate old = SubjectComplexTypeImpl.this.getSubjectDateArray(i);
                SubjectComplexTypeImpl.this.removeSubjectDate(i);
                return old;
            }

            @Override
            public int size()
                { return SubjectComplexTypeImpl.this.sizeOfSubjectDateArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new SubjectDateList();
        }
    }

    /**
     * Gets array of all "subjectDate" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.SubjectComplexType.SubjectDate[] getSubjectDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.SubjectComplexType.SubjectDate> targetList = new java.util.ArrayList<org.lidoSchema.SubjectComplexType.SubjectDate>();
            get_store().find_all_element_users(SUBJECTDATE$6, targetList);
            org.lidoSchema.SubjectComplexType.SubjectDate[] result = new org.lidoSchema.SubjectComplexType.SubjectDate[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "subjectDate" element
     */
    public org.lidoSchema.SubjectComplexType.SubjectDate getSubjectDateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.SubjectComplexType.SubjectDate target = null;
            target = (org.lidoSchema.SubjectComplexType.SubjectDate)get_store().find_element_user(SUBJECTDATE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "subjectDate" element
     */
    public int sizeOfSubjectDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECTDATE$6);
        }
    }

    /**
     * Sets array of all "subjectDate" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setSubjectDateArray(org.lidoSchema.SubjectComplexType.SubjectDate[] subjectDateArray)
    {
        check_orphaned();
        arraySetterHelper(subjectDateArray, SUBJECTDATE$6);
    }

    /**
     * Sets ith "subjectDate" element
     */
    @Inject(optional=true) public void setSubjectDateArray(int i, org.lidoSchema.SubjectComplexType.SubjectDate subjectDate)
    {
        generatedSetterHelperImpl(subjectDate, SUBJECTDATE$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "subjectDate" element
     */
    public org.lidoSchema.SubjectComplexType.SubjectDate insertNewSubjectDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.SubjectComplexType.SubjectDate target = null;
            target = (org.lidoSchema.SubjectComplexType.SubjectDate)get_store().insert_element_user(SUBJECTDATE$6, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "subjectDate" element
     */
    public org.lidoSchema.SubjectComplexType.SubjectDate addNewSubjectDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.SubjectComplexType.SubjectDate target = null;
            target = (org.lidoSchema.SubjectComplexType.SubjectDate)get_store().add_element_user(SUBJECTDATE$6);
            return target;
        }
    }

    /**
     * Removes the ith "subjectDate" element
     */
    public void removeSubjectDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECTDATE$6, i);
        }
    }

    /**
     * Gets a List of "subjectEvent" elements
     */
    public java.util.List<org.lidoSchema.SubjectComplexType.SubjectEvent> getSubjectEventList()
    {
        final class SubjectEventList extends java.util.AbstractList<org.lidoSchema.SubjectComplexType.SubjectEvent>
        {
            @Override
            public org.lidoSchema.SubjectComplexType.SubjectEvent get(int i)
                { return SubjectComplexTypeImpl.this.getSubjectEventArray(i); }

            @Override
            public org.lidoSchema.SubjectComplexType.SubjectEvent set(int i, org.lidoSchema.SubjectComplexType.SubjectEvent o)
            {
                org.lidoSchema.SubjectComplexType.SubjectEvent old = SubjectComplexTypeImpl.this.getSubjectEventArray(i);
                SubjectComplexTypeImpl.this.setSubjectEventArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.SubjectComplexType.SubjectEvent o)
                { SubjectComplexTypeImpl.this.insertNewSubjectEvent(i).set(o); }

            @Override
            public org.lidoSchema.SubjectComplexType.SubjectEvent remove(int i)
            {
                org.lidoSchema.SubjectComplexType.SubjectEvent old = SubjectComplexTypeImpl.this.getSubjectEventArray(i);
                SubjectComplexTypeImpl.this.removeSubjectEvent(i);
                return old;
            }

            @Override
            public int size()
                { return SubjectComplexTypeImpl.this.sizeOfSubjectEventArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new SubjectEventList();
        }
    }

    /**
     * Gets array of all "subjectEvent" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.SubjectComplexType.SubjectEvent[] getSubjectEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.SubjectComplexType.SubjectEvent> targetList = new java.util.ArrayList<org.lidoSchema.SubjectComplexType.SubjectEvent>();
            get_store().find_all_element_users(SUBJECTEVENT$8, targetList);
            org.lidoSchema.SubjectComplexType.SubjectEvent[] result = new org.lidoSchema.SubjectComplexType.SubjectEvent[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "subjectEvent" element
     */
    public org.lidoSchema.SubjectComplexType.SubjectEvent getSubjectEventArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.SubjectComplexType.SubjectEvent target = null;
            target = (org.lidoSchema.SubjectComplexType.SubjectEvent)get_store().find_element_user(SUBJECTEVENT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "subjectEvent" element
     */
    public int sizeOfSubjectEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECTEVENT$8);
        }
    }

    /**
     * Sets array of all "subjectEvent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setSubjectEventArray(org.lidoSchema.SubjectComplexType.SubjectEvent[] subjectEventArray)
    {
        check_orphaned();
        arraySetterHelper(subjectEventArray, SUBJECTEVENT$8);
    }

    /**
     * Sets ith "subjectEvent" element
     */
    @Inject(optional=true) public void setSubjectEventArray(int i, org.lidoSchema.SubjectComplexType.SubjectEvent subjectEvent)
    {
        generatedSetterHelperImpl(subjectEvent, SUBJECTEVENT$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "subjectEvent" element
     */
    public org.lidoSchema.SubjectComplexType.SubjectEvent insertNewSubjectEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.SubjectComplexType.SubjectEvent target = null;
            target = (org.lidoSchema.SubjectComplexType.SubjectEvent)get_store().insert_element_user(SUBJECTEVENT$8, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "subjectEvent" element
     */
    public org.lidoSchema.SubjectComplexType.SubjectEvent addNewSubjectEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.SubjectComplexType.SubjectEvent target = null;
            target = (org.lidoSchema.SubjectComplexType.SubjectEvent)get_store().add_element_user(SUBJECTEVENT$8);
            return target;
        }
    }

    /**
     * Removes the ith "subjectEvent" element
     */
    public void removeSubjectEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECTEVENT$8, i);
        }
    }

    /**
     * Gets a List of "subjectPlace" elements
     */
    public java.util.List<org.lidoSchema.SubjectComplexType.SubjectPlace> getSubjectPlaceList()
    {
        final class SubjectPlaceList extends java.util.AbstractList<org.lidoSchema.SubjectComplexType.SubjectPlace>
        {
            @Override
            public org.lidoSchema.SubjectComplexType.SubjectPlace get(int i)
                { return SubjectComplexTypeImpl.this.getSubjectPlaceArray(i); }

            @Override
            public org.lidoSchema.SubjectComplexType.SubjectPlace set(int i, org.lidoSchema.SubjectComplexType.SubjectPlace o)
            {
                org.lidoSchema.SubjectComplexType.SubjectPlace old = SubjectComplexTypeImpl.this.getSubjectPlaceArray(i);
                SubjectComplexTypeImpl.this.setSubjectPlaceArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.SubjectComplexType.SubjectPlace o)
                { SubjectComplexTypeImpl.this.insertNewSubjectPlace(i).set(o); }

            @Override
            public org.lidoSchema.SubjectComplexType.SubjectPlace remove(int i)
            {
                org.lidoSchema.SubjectComplexType.SubjectPlace old = SubjectComplexTypeImpl.this.getSubjectPlaceArray(i);
                SubjectComplexTypeImpl.this.removeSubjectPlace(i);
                return old;
            }

            @Override
            public int size()
                { return SubjectComplexTypeImpl.this.sizeOfSubjectPlaceArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new SubjectPlaceList();
        }
    }

    /**
     * Gets array of all "subjectPlace" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.SubjectComplexType.SubjectPlace[] getSubjectPlaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.SubjectComplexType.SubjectPlace> targetList = new java.util.ArrayList<org.lidoSchema.SubjectComplexType.SubjectPlace>();
            get_store().find_all_element_users(SUBJECTPLACE$10, targetList);
            org.lidoSchema.SubjectComplexType.SubjectPlace[] result = new org.lidoSchema.SubjectComplexType.SubjectPlace[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "subjectPlace" element
     */
    public org.lidoSchema.SubjectComplexType.SubjectPlace getSubjectPlaceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.SubjectComplexType.SubjectPlace target = null;
            target = (org.lidoSchema.SubjectComplexType.SubjectPlace)get_store().find_element_user(SUBJECTPLACE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "subjectPlace" element
     */
    public int sizeOfSubjectPlaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECTPLACE$10);
        }
    }

    /**
     * Sets array of all "subjectPlace" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setSubjectPlaceArray(org.lidoSchema.SubjectComplexType.SubjectPlace[] subjectPlaceArray)
    {
        check_orphaned();
        arraySetterHelper(subjectPlaceArray, SUBJECTPLACE$10);
    }

    /**
     * Sets ith "subjectPlace" element
     */
    @Inject(optional=true) public void setSubjectPlaceArray(int i, org.lidoSchema.SubjectComplexType.SubjectPlace subjectPlace)
    {
        generatedSetterHelperImpl(subjectPlace, SUBJECTPLACE$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "subjectPlace" element
     */
    public org.lidoSchema.SubjectComplexType.SubjectPlace insertNewSubjectPlace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.SubjectComplexType.SubjectPlace target = null;
            target = (org.lidoSchema.SubjectComplexType.SubjectPlace)get_store().insert_element_user(SUBJECTPLACE$10, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "subjectPlace" element
     */
    public org.lidoSchema.SubjectComplexType.SubjectPlace addNewSubjectPlace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.SubjectComplexType.SubjectPlace target = null;
            target = (org.lidoSchema.SubjectComplexType.SubjectPlace)get_store().add_element_user(SUBJECTPLACE$10);
            return target;
        }
    }

    /**
     * Removes the ith "subjectPlace" element
     */
    public void removeSubjectPlace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECTPLACE$10, i);
        }
    }

    /**
     * Gets a List of "subjectObject" elements
     */
    public java.util.List<org.lidoSchema.SubjectComplexType.SubjectObject> getSubjectObjectList()
    {
        final class SubjectObjectList extends java.util.AbstractList<org.lidoSchema.SubjectComplexType.SubjectObject>
        {
            @Override
            public org.lidoSchema.SubjectComplexType.SubjectObject get(int i)
                { return SubjectComplexTypeImpl.this.getSubjectObjectArray(i); }

            @Override
            public org.lidoSchema.SubjectComplexType.SubjectObject set(int i, org.lidoSchema.SubjectComplexType.SubjectObject o)
            {
                org.lidoSchema.SubjectComplexType.SubjectObject old = SubjectComplexTypeImpl.this.getSubjectObjectArray(i);
                SubjectComplexTypeImpl.this.setSubjectObjectArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.SubjectComplexType.SubjectObject o)
                { SubjectComplexTypeImpl.this.insertNewSubjectObject(i).set(o); }

            @Override
            public org.lidoSchema.SubjectComplexType.SubjectObject remove(int i)
            {
                org.lidoSchema.SubjectComplexType.SubjectObject old = SubjectComplexTypeImpl.this.getSubjectObjectArray(i);
                SubjectComplexTypeImpl.this.removeSubjectObject(i);
                return old;
            }

            @Override
            public int size()
                { return SubjectComplexTypeImpl.this.sizeOfSubjectObjectArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new SubjectObjectList();
        }
    }

    /**
     * Gets array of all "subjectObject" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.SubjectComplexType.SubjectObject[] getSubjectObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.SubjectComplexType.SubjectObject> targetList = new java.util.ArrayList<org.lidoSchema.SubjectComplexType.SubjectObject>();
            get_store().find_all_element_users(SUBJECTOBJECT$12, targetList);
            org.lidoSchema.SubjectComplexType.SubjectObject[] result = new org.lidoSchema.SubjectComplexType.SubjectObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "subjectObject" element
     */
    public org.lidoSchema.SubjectComplexType.SubjectObject getSubjectObjectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.SubjectComplexType.SubjectObject target = null;
            target = (org.lidoSchema.SubjectComplexType.SubjectObject)get_store().find_element_user(SUBJECTOBJECT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "subjectObject" element
     */
    public int sizeOfSubjectObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECTOBJECT$12);
        }
    }

    /**
     * Sets array of all "subjectObject" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setSubjectObjectArray(org.lidoSchema.SubjectComplexType.SubjectObject[] subjectObjectArray)
    {
        check_orphaned();
        arraySetterHelper(subjectObjectArray, SUBJECTOBJECT$12);
    }

    /**
     * Sets ith "subjectObject" element
     */
    @Inject(optional=true) public void setSubjectObjectArray(int i, org.lidoSchema.SubjectComplexType.SubjectObject subjectObject)
    {
        generatedSetterHelperImpl(subjectObject, SUBJECTOBJECT$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "subjectObject" element
     */
    public org.lidoSchema.SubjectComplexType.SubjectObject insertNewSubjectObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.SubjectComplexType.SubjectObject target = null;
            target = (org.lidoSchema.SubjectComplexType.SubjectObject)get_store().insert_element_user(SUBJECTOBJECT$12, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "subjectObject" element
     */
    public org.lidoSchema.SubjectComplexType.SubjectObject addNewSubjectObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.SubjectComplexType.SubjectObject target = null;
            target = (org.lidoSchema.SubjectComplexType.SubjectObject)get_store().add_element_user(SUBJECTOBJECT$12);
            return target;
        }
    }

    /**
     * Removes the ith "subjectObject" element
     */
    public void removeSubjectObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECTOBJECT$12, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$14);
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
            return get_store().find_attribute_user(TYPE$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$14);
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
            get_store().remove_attribute(TYPE$14);
        }
    }
    /**
     * An XML subjectConcept(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class SubjectConceptImpl extends org.lidoSchema.impl.ConceptComplexTypeImpl implements org.lidoSchema.SubjectComplexType.SubjectConcept
    {
        private static final long serialVersionUID = 1L;

        public SubjectConceptImpl(org.apache.xmlbeans.SchemaType sType)
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
     * An XML subjectActor(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class SubjectActorImpl extends org.lidoSchema.impl.ActorSetComplexTypeImpl implements org.lidoSchema.SubjectComplexType.SubjectActor
    {
        private static final long serialVersionUID = 1L;

        public SubjectActorImpl(org.apache.xmlbeans.SchemaType sType)
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
     * An XML subjectDate(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class SubjectDateImpl extends org.lidoSchema.impl.DateSetComplexTypeImpl implements org.lidoSchema.SubjectComplexType.SubjectDate
    {
        private static final long serialVersionUID = 1L;

        public SubjectDateImpl(org.apache.xmlbeans.SchemaType sType)
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
     * An XML subjectEvent(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class SubjectEventImpl extends org.lidoSchema.impl.EventSetComplexTypeImpl implements org.lidoSchema.SubjectComplexType.SubjectEvent
    {
        private static final long serialVersionUID = 1L;

        public SubjectEventImpl(org.apache.xmlbeans.SchemaType sType)
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
     * An XML subjectPlace(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class SubjectPlaceImpl extends org.lidoSchema.impl.PlaceSetComplexTypeImpl implements org.lidoSchema.SubjectComplexType.SubjectPlace
    {
        private static final long serialVersionUID = 1L;

        public SubjectPlaceImpl(org.apache.xmlbeans.SchemaType sType)
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
     * An XML subjectObject(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class SubjectObjectImpl extends org.lidoSchema.impl.ObjectSetComplexTypeImpl implements org.lidoSchema.SubjectComplexType.SubjectObject
    {
        private static final long serialVersionUID = 1L;

        public SubjectObjectImpl(org.apache.xmlbeans.SchemaType sType)
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
