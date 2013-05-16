/*
 * XML Type:  subjectSetComplexType
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.SubjectSetComplexType
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
/**
 * An XML subjectSetComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class SubjectSetComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.SubjectSetComplexType
{
    private static final long serialVersionUID = 1L;
    
    public SubjectSetComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAYSUBJECT$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "displaySubject");
    private static final javax.xml.namespace.QName SUBJECT$2 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "subject");
    
    
    /**
     * Gets a List of "displaySubject" elements
     */
    public java.util.List<org.lidoSchema.TextComplexType> getDisplaySubjectList()
    {
        final class DisplaySubjectList extends java.util.AbstractList<org.lidoSchema.TextComplexType>
        {
            @Override
            public org.lidoSchema.TextComplexType get(int i)
                { return SubjectSetComplexTypeImpl.this.getDisplaySubjectArray(i); }
            
            @Override
            public org.lidoSchema.TextComplexType set(int i, org.lidoSchema.TextComplexType o)
            {
                org.lidoSchema.TextComplexType old = SubjectSetComplexTypeImpl.this.getDisplaySubjectArray(i);
                SubjectSetComplexTypeImpl.this.setDisplaySubjectArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.TextComplexType o)
                { SubjectSetComplexTypeImpl.this.insertNewDisplaySubject(i).set(o); }
            
            @Override
            public org.lidoSchema.TextComplexType remove(int i)
            {
                org.lidoSchema.TextComplexType old = SubjectSetComplexTypeImpl.this.getDisplaySubjectArray(i);
                SubjectSetComplexTypeImpl.this.removeDisplaySubject(i);
                return old;
            }
            
            @Override
            public int size()
                { return SubjectSetComplexTypeImpl.this.sizeOfDisplaySubjectArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DisplaySubjectList();
        }
    }
    
    /**
     * Gets array of all "displaySubject" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.TextComplexType[] getDisplaySubjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.TextComplexType> targetList = new java.util.ArrayList<org.lidoSchema.TextComplexType>();
            get_store().find_all_element_users(DISPLAYSUBJECT$0, targetList);
            org.lidoSchema.TextComplexType[] result = new org.lidoSchema.TextComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "displaySubject" element
     */
    public org.lidoSchema.TextComplexType getDisplaySubjectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().find_element_user(DISPLAYSUBJECT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "displaySubject" element
     */
    public int sizeOfDisplaySubjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYSUBJECT$0);
        }
    }
    
    /**
     * Sets array of all "displaySubject" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setDisplaySubjectArray(org.lidoSchema.TextComplexType[] displaySubjectArray)
    {
        check_orphaned();
        arraySetterHelper(displaySubjectArray, DISPLAYSUBJECT$0);
    }
    
    /**
     * Sets ith "displaySubject" element
     */
    @Inject(optional=true) public void setDisplaySubjectArray(int i, org.lidoSchema.TextComplexType displaySubject)
    {
        generatedSetterHelperImpl(displaySubject, DISPLAYSUBJECT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "displaySubject" element
     */
    public org.lidoSchema.TextComplexType insertNewDisplaySubject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().insert_element_user(DISPLAYSUBJECT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "displaySubject" element
     */
    public org.lidoSchema.TextComplexType addNewDisplaySubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().add_element_user(DISPLAYSUBJECT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "displaySubject" element
     */
    public void removeDisplaySubject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYSUBJECT$0, i);
        }
    }
    
    /**
     * Gets the "subject" element
     */
    public org.lidoSchema.SubjectComplexType getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.SubjectComplexType target = null;
            target = (org.lidoSchema.SubjectComplexType)get_store().find_element_user(SUBJECT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "subject" element
     */
    public boolean isSetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECT$2) != 0;
        }
    }
    
    /**
     * Sets the "subject" element
     */
    @Inject(optional=true) public void setSubject(org.lidoSchema.SubjectComplexType subject)
    {
        generatedSetterHelperImpl(subject, SUBJECT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "subject" element
     */
    public org.lidoSchema.SubjectComplexType addNewSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.SubjectComplexType target = null;
            target = (org.lidoSchema.SubjectComplexType)get_store().add_element_user(SUBJECT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "subject" element
     */
    public void unsetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECT$2, 0);
        }
    }
}
