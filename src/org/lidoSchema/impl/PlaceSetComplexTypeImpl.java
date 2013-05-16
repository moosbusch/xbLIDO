/*
 * XML Type:  placeSetComplexType
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.PlaceSetComplexType
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
/**
 * An XML placeSetComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class PlaceSetComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.PlaceSetComplexType
{
    private static final long serialVersionUID = 1L;
    
    public PlaceSetComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAYPLACE$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "displayPlace");
    private static final javax.xml.namespace.QName PLACE$2 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "place");
    
    
    /**
     * Gets a List of "displayPlace" elements
     */
    public java.util.List<org.lidoSchema.TextComplexType> getDisplayPlaceList()
    {
        final class DisplayPlaceList extends java.util.AbstractList<org.lidoSchema.TextComplexType>
        {
            @Override
            public org.lidoSchema.TextComplexType get(int i)
                { return PlaceSetComplexTypeImpl.this.getDisplayPlaceArray(i); }
            
            @Override
            public org.lidoSchema.TextComplexType set(int i, org.lidoSchema.TextComplexType o)
            {
                org.lidoSchema.TextComplexType old = PlaceSetComplexTypeImpl.this.getDisplayPlaceArray(i);
                PlaceSetComplexTypeImpl.this.setDisplayPlaceArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.TextComplexType o)
                { PlaceSetComplexTypeImpl.this.insertNewDisplayPlace(i).set(o); }
            
            @Override
            public org.lidoSchema.TextComplexType remove(int i)
            {
                org.lidoSchema.TextComplexType old = PlaceSetComplexTypeImpl.this.getDisplayPlaceArray(i);
                PlaceSetComplexTypeImpl.this.removeDisplayPlace(i);
                return old;
            }
            
            @Override
            public int size()
                { return PlaceSetComplexTypeImpl.this.sizeOfDisplayPlaceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DisplayPlaceList();
        }
    }
    
    /**
     * Gets array of all "displayPlace" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.TextComplexType[] getDisplayPlaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.TextComplexType> targetList = new java.util.ArrayList<org.lidoSchema.TextComplexType>();
            get_store().find_all_element_users(DISPLAYPLACE$0, targetList);
            org.lidoSchema.TextComplexType[] result = new org.lidoSchema.TextComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "displayPlace" element
     */
    public org.lidoSchema.TextComplexType getDisplayPlaceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().find_element_user(DISPLAYPLACE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "displayPlace" element
     */
    public int sizeOfDisplayPlaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYPLACE$0);
        }
    }
    
    /**
     * Sets array of all "displayPlace" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setDisplayPlaceArray(org.lidoSchema.TextComplexType[] displayPlaceArray)
    {
        check_orphaned();
        arraySetterHelper(displayPlaceArray, DISPLAYPLACE$0);
    }
    
    /**
     * Sets ith "displayPlace" element
     */
    @Inject(optional=true) public void setDisplayPlaceArray(int i, org.lidoSchema.TextComplexType displayPlace)
    {
        generatedSetterHelperImpl(displayPlace, DISPLAYPLACE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "displayPlace" element
     */
    public org.lidoSchema.TextComplexType insertNewDisplayPlace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().insert_element_user(DISPLAYPLACE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "displayPlace" element
     */
    public org.lidoSchema.TextComplexType addNewDisplayPlace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().add_element_user(DISPLAYPLACE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "displayPlace" element
     */
    public void removeDisplayPlace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYPLACE$0, i);
        }
    }
    
    /**
     * Gets the "place" element
     */
    public org.lidoSchema.PlaceComplexType getPlace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.PlaceComplexType target = null;
            target = (org.lidoSchema.PlaceComplexType)get_store().find_element_user(PLACE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "place" element
     */
    public boolean isSetPlace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLACE$2) != 0;
        }
    }
    
    /**
     * Sets the "place" element
     */
    @Inject(optional=true) public void setPlace(org.lidoSchema.PlaceComplexType place)
    {
        generatedSetterHelperImpl(place, PLACE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "place" element
     */
    public org.lidoSchema.PlaceComplexType addNewPlace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.PlaceComplexType target = null;
            target = (org.lidoSchema.PlaceComplexType)get_store().add_element_user(PLACE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "place" element
     */
    public void unsetPlace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLACE$2, 0);
        }
    }
}
