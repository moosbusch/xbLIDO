/*
 * XML Type:  objectMeasurementsSetComplexType
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.ObjectMeasurementsSetComplexType
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
/**
 * An XML objectMeasurementsSetComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class ObjectMeasurementsSetComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ObjectMeasurementsSetComplexType
{
    private static final long serialVersionUID = 1L;
    
    public ObjectMeasurementsSetComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAYOBJECTMEASUREMENTS$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "displayObjectMeasurements");
    private static final javax.xml.namespace.QName OBJECTMEASUREMENTS$2 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "objectMeasurements");
    
    
    /**
     * Gets a List of "displayObjectMeasurements" elements
     */
    public java.util.List<org.lidoSchema.TextComplexType> getDisplayObjectMeasurementsList()
    {
        final class DisplayObjectMeasurementsList extends java.util.AbstractList<org.lidoSchema.TextComplexType>
        {
            @Override
            public org.lidoSchema.TextComplexType get(int i)
                { return ObjectMeasurementsSetComplexTypeImpl.this.getDisplayObjectMeasurementsArray(i); }
            
            @Override
            public org.lidoSchema.TextComplexType set(int i, org.lidoSchema.TextComplexType o)
            {
                org.lidoSchema.TextComplexType old = ObjectMeasurementsSetComplexTypeImpl.this.getDisplayObjectMeasurementsArray(i);
                ObjectMeasurementsSetComplexTypeImpl.this.setDisplayObjectMeasurementsArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.TextComplexType o)
                { ObjectMeasurementsSetComplexTypeImpl.this.insertNewDisplayObjectMeasurements(i).set(o); }
            
            @Override
            public org.lidoSchema.TextComplexType remove(int i)
            {
                org.lidoSchema.TextComplexType old = ObjectMeasurementsSetComplexTypeImpl.this.getDisplayObjectMeasurementsArray(i);
                ObjectMeasurementsSetComplexTypeImpl.this.removeDisplayObjectMeasurements(i);
                return old;
            }
            
            @Override
            public int size()
                { return ObjectMeasurementsSetComplexTypeImpl.this.sizeOfDisplayObjectMeasurementsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DisplayObjectMeasurementsList();
        }
    }
    
    /**
     * Gets array of all "displayObjectMeasurements" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.TextComplexType[] getDisplayObjectMeasurementsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.TextComplexType> targetList = new java.util.ArrayList<org.lidoSchema.TextComplexType>();
            get_store().find_all_element_users(DISPLAYOBJECTMEASUREMENTS$0, targetList);
            org.lidoSchema.TextComplexType[] result = new org.lidoSchema.TextComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "displayObjectMeasurements" element
     */
    public org.lidoSchema.TextComplexType getDisplayObjectMeasurementsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().find_element_user(DISPLAYOBJECTMEASUREMENTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "displayObjectMeasurements" element
     */
    public int sizeOfDisplayObjectMeasurementsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYOBJECTMEASUREMENTS$0);
        }
    }
    
    /**
     * Sets array of all "displayObjectMeasurements" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setDisplayObjectMeasurementsArray(org.lidoSchema.TextComplexType[] displayObjectMeasurementsArray)
    {
        check_orphaned();
        arraySetterHelper(displayObjectMeasurementsArray, DISPLAYOBJECTMEASUREMENTS$0);
    }
    
    /**
     * Sets ith "displayObjectMeasurements" element
     */
    @Inject(optional=true) public void setDisplayObjectMeasurementsArray(int i, org.lidoSchema.TextComplexType displayObjectMeasurements)
    {
        generatedSetterHelperImpl(displayObjectMeasurements, DISPLAYOBJECTMEASUREMENTS$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "displayObjectMeasurements" element
     */
    public org.lidoSchema.TextComplexType insertNewDisplayObjectMeasurements(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().insert_element_user(DISPLAYOBJECTMEASUREMENTS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "displayObjectMeasurements" element
     */
    public org.lidoSchema.TextComplexType addNewDisplayObjectMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().add_element_user(DISPLAYOBJECTMEASUREMENTS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "displayObjectMeasurements" element
     */
    public void removeDisplayObjectMeasurements(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYOBJECTMEASUREMENTS$0, i);
        }
    }
    
    /**
     * Gets the "objectMeasurements" element
     */
    public org.lidoSchema.ObjectMeasurementsComplexType getObjectMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectMeasurementsComplexType target = null;
            target = (org.lidoSchema.ObjectMeasurementsComplexType)get_store().find_element_user(OBJECTMEASUREMENTS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "objectMeasurements" element
     */
    public boolean isSetObjectMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTMEASUREMENTS$2) != 0;
        }
    }
    
    /**
     * Sets the "objectMeasurements" element
     */
    @Inject(optional=true) public void setObjectMeasurements(org.lidoSchema.ObjectMeasurementsComplexType objectMeasurements)
    {
        generatedSetterHelperImpl(objectMeasurements, OBJECTMEASUREMENTS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "objectMeasurements" element
     */
    public org.lidoSchema.ObjectMeasurementsComplexType addNewObjectMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectMeasurementsComplexType target = null;
            target = (org.lidoSchema.ObjectMeasurementsComplexType)get_store().add_element_user(OBJECTMEASUREMENTS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "objectMeasurements" element
     */
    public void unsetObjectMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTMEASUREMENTS$2, 0);
        }
    }
}
