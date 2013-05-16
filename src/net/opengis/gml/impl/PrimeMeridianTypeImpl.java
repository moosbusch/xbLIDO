/*
 * XML Type:  PrimeMeridianType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PrimeMeridianType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML PrimeMeridianType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class PrimeMeridianTypeImpl extends net.opengis.gml.impl.PrimeMeridianBaseTypeImpl implements net.opengis.gml.PrimeMeridianType
{
    private static final long serialVersionUID = 1L;
    
    public PrimeMeridianTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MERIDIANID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "meridianID");
    private static final javax.xml.namespace.QName REMARKS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "remarks");
    private static final javax.xml.namespace.QName GREENWICHLONGITUDE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "greenwichLongitude");
    
    
    /**
     * Gets a List of "meridianID" elements
     */
    public java.util.List<net.opengis.gml.IdentifierType> getMeridianIDList()
    {
        final class MeridianIDList extends java.util.AbstractList<net.opengis.gml.IdentifierType>
        {
            @Override
            public net.opengis.gml.IdentifierType get(int i)
                { return PrimeMeridianTypeImpl.this.getMeridianIDArray(i); }
            
            @Override
            public net.opengis.gml.IdentifierType set(int i, net.opengis.gml.IdentifierType o)
            {
                net.opengis.gml.IdentifierType old = PrimeMeridianTypeImpl.this.getMeridianIDArray(i);
                PrimeMeridianTypeImpl.this.setMeridianIDArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.IdentifierType o)
                { PrimeMeridianTypeImpl.this.insertNewMeridianID(i).set(o); }
            
            @Override
            public net.opengis.gml.IdentifierType remove(int i)
            {
                net.opengis.gml.IdentifierType old = PrimeMeridianTypeImpl.this.getMeridianIDArray(i);
                PrimeMeridianTypeImpl.this.removeMeridianID(i);
                return old;
            }
            
            @Override
            public int size()
                { return PrimeMeridianTypeImpl.this.sizeOfMeridianIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MeridianIDList();
        }
    }
    
    /**
     * Gets array of all "meridianID" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.IdentifierType[] getMeridianIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.IdentifierType> targetList = new java.util.ArrayList<net.opengis.gml.IdentifierType>();
            get_store().find_all_element_users(MERIDIANID$0, targetList);
            net.opengis.gml.IdentifierType[] result = new net.opengis.gml.IdentifierType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "meridianID" element
     */
    public net.opengis.gml.IdentifierType getMeridianIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().find_element_user(MERIDIANID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "meridianID" element
     */
    public int sizeOfMeridianIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MERIDIANID$0);
        }
    }
    
    /**
     * Sets array of all "meridianID" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setMeridianIDArray(net.opengis.gml.IdentifierType[] meridianIDArray)
    {
        check_orphaned();
        arraySetterHelper(meridianIDArray, MERIDIANID$0);
    }
    
    /**
     * Sets ith "meridianID" element
     */
    @Inject(optional=true) public void setMeridianIDArray(int i, net.opengis.gml.IdentifierType meridianID)
    {
        generatedSetterHelperImpl(meridianID, MERIDIANID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "meridianID" element
     */
    public net.opengis.gml.IdentifierType insertNewMeridianID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().insert_element_user(MERIDIANID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "meridianID" element
     */
    public net.opengis.gml.IdentifierType addNewMeridianID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().add_element_user(MERIDIANID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "meridianID" element
     */
    public void removeMeridianID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MERIDIANID$0, i);
        }
    }
    
    /**
     * Gets the "remarks" element
     */
    public net.opengis.gml.StringOrRefType getRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().find_element_user(REMARKS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "remarks" element
     */
    public boolean isSetRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REMARKS$2) != 0;
        }
    }
    
    /**
     * Sets the "remarks" element
     */
    @Inject(optional=true) public void setRemarks(net.opengis.gml.StringOrRefType remarks)
    {
        generatedSetterHelperImpl(remarks, REMARKS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "remarks" element
     */
    public net.opengis.gml.StringOrRefType addNewRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().add_element_user(REMARKS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "remarks" element
     */
    public void unsetRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REMARKS$2, 0);
        }
    }
    
    /**
     * Gets the "greenwichLongitude" element
     */
    public net.opengis.gml.AngleChoiceType getGreenwichLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AngleChoiceType target = null;
            target = (net.opengis.gml.AngleChoiceType)get_store().find_element_user(GREENWICHLONGITUDE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "greenwichLongitude" element
     */
    @Inject(optional=true) public void setGreenwichLongitude(net.opengis.gml.AngleChoiceType greenwichLongitude)
    {
        generatedSetterHelperImpl(greenwichLongitude, GREENWICHLONGITUDE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "greenwichLongitude" element
     */
    public net.opengis.gml.AngleChoiceType addNewGreenwichLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AngleChoiceType target = null;
            target = (net.opengis.gml.AngleChoiceType)get_store().add_element_user(GREENWICHLONGITUDE$4);
            return target;
        }
    }
}
