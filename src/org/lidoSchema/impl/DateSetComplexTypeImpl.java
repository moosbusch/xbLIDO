/*
 * XML Type:  dateSetComplexType
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.DateSetComplexType
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
/**
 * An XML dateSetComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class DateSetComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.DateSetComplexType
{
    private static final long serialVersionUID = 1L;
    
    public DateSetComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAYDATE$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "displayDate");
    private static final javax.xml.namespace.QName DATE$2 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "date");
    
    
    /**
     * Gets a List of "displayDate" elements
     */
    public java.util.List<org.lidoSchema.TextComplexType> getDisplayDateList()
    {
        final class DisplayDateList extends java.util.AbstractList<org.lidoSchema.TextComplexType>
        {
            @Override
            public org.lidoSchema.TextComplexType get(int i)
                { return DateSetComplexTypeImpl.this.getDisplayDateArray(i); }
            
            @Override
            public org.lidoSchema.TextComplexType set(int i, org.lidoSchema.TextComplexType o)
            {
                org.lidoSchema.TextComplexType old = DateSetComplexTypeImpl.this.getDisplayDateArray(i);
                DateSetComplexTypeImpl.this.setDisplayDateArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.TextComplexType o)
                { DateSetComplexTypeImpl.this.insertNewDisplayDate(i).set(o); }
            
            @Override
            public org.lidoSchema.TextComplexType remove(int i)
            {
                org.lidoSchema.TextComplexType old = DateSetComplexTypeImpl.this.getDisplayDateArray(i);
                DateSetComplexTypeImpl.this.removeDisplayDate(i);
                return old;
            }
            
            @Override
            public int size()
                { return DateSetComplexTypeImpl.this.sizeOfDisplayDateArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DisplayDateList();
        }
    }
    
    /**
     * Gets array of all "displayDate" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.TextComplexType[] getDisplayDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.TextComplexType> targetList = new java.util.ArrayList<org.lidoSchema.TextComplexType>();
            get_store().find_all_element_users(DISPLAYDATE$0, targetList);
            org.lidoSchema.TextComplexType[] result = new org.lidoSchema.TextComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "displayDate" element
     */
    public org.lidoSchema.TextComplexType getDisplayDateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().find_element_user(DISPLAYDATE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "displayDate" element
     */
    public int sizeOfDisplayDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYDATE$0);
        }
    }
    
    /**
     * Sets array of all "displayDate" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setDisplayDateArray(org.lidoSchema.TextComplexType[] displayDateArray)
    {
        check_orphaned();
        arraySetterHelper(displayDateArray, DISPLAYDATE$0);
    }
    
    /**
     * Sets ith "displayDate" element
     */
    @Inject(optional=true) public void setDisplayDateArray(int i, org.lidoSchema.TextComplexType displayDate)
    {
        generatedSetterHelperImpl(displayDate, DISPLAYDATE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "displayDate" element
     */
    public org.lidoSchema.TextComplexType insertNewDisplayDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().insert_element_user(DISPLAYDATE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "displayDate" element
     */
    public org.lidoSchema.TextComplexType addNewDisplayDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().add_element_user(DISPLAYDATE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "displayDate" element
     */
    public void removeDisplayDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYDATE$0, i);
        }
    }
    
    /**
     * Gets the "date" element
     */
    public org.lidoSchema.DateComplexType getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.DateComplexType target = null;
            target = (org.lidoSchema.DateComplexType)get_store().find_element_user(DATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "date" element
     */
    public boolean isSetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATE$2) != 0;
        }
    }
    
    /**
     * Sets the "date" element
     */
    @Inject(optional=true) public void setDate(org.lidoSchema.DateComplexType date)
    {
        generatedSetterHelperImpl(date, DATE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "date" element
     */
    public org.lidoSchema.DateComplexType addNewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.DateComplexType target = null;
            target = (org.lidoSchema.DateComplexType)get_store().add_element_user(DATE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "date" element
     */
    public void unsetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATE$2, 0);
        }
    }
}
