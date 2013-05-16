/*
 * XML Type:  TimeTopologyComplexType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimeTopologyComplexType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML TimeTopologyComplexType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class TimeTopologyComplexTypeImpl extends net.opengis.gml.impl.AbstractTimeComplexTypeImpl implements net.opengis.gml.TimeTopologyComplexType
{
    private static final long serialVersionUID = 1L;
    
    public TimeTopologyComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIMITIVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "primitive");
    
    
    /**
     * Gets a List of "primitive" elements
     */
    public java.util.List<net.opengis.gml.TimeTopologyPrimitivePropertyType> getPrimitiveList()
    {
        final class PrimitiveList extends java.util.AbstractList<net.opengis.gml.TimeTopologyPrimitivePropertyType>
        {
            @Override
            public net.opengis.gml.TimeTopologyPrimitivePropertyType get(int i)
                { return TimeTopologyComplexTypeImpl.this.getPrimitiveArray(i); }
            
            @Override
            public net.opengis.gml.TimeTopologyPrimitivePropertyType set(int i, net.opengis.gml.TimeTopologyPrimitivePropertyType o)
            {
                net.opengis.gml.TimeTopologyPrimitivePropertyType old = TimeTopologyComplexTypeImpl.this.getPrimitiveArray(i);
                TimeTopologyComplexTypeImpl.this.setPrimitiveArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.TimeTopologyPrimitivePropertyType o)
                { TimeTopologyComplexTypeImpl.this.insertNewPrimitive(i).set(o); }
            
            @Override
            public net.opengis.gml.TimeTopologyPrimitivePropertyType remove(int i)
            {
                net.opengis.gml.TimeTopologyPrimitivePropertyType old = TimeTopologyComplexTypeImpl.this.getPrimitiveArray(i);
                TimeTopologyComplexTypeImpl.this.removePrimitive(i);
                return old;
            }
            
            @Override
            public int size()
                { return TimeTopologyComplexTypeImpl.this.sizeOfPrimitiveArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PrimitiveList();
        }
    }
    
    /**
     * Gets array of all "primitive" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.TimeTopologyPrimitivePropertyType[] getPrimitiveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.TimeTopologyPrimitivePropertyType> targetList = new java.util.ArrayList<net.opengis.gml.TimeTopologyPrimitivePropertyType>();
            get_store().find_all_element_users(PRIMITIVE$0, targetList);
            net.opengis.gml.TimeTopologyPrimitivePropertyType[] result = new net.opengis.gml.TimeTopologyPrimitivePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "primitive" element
     */
    public net.opengis.gml.TimeTopologyPrimitivePropertyType getPrimitiveArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeTopologyPrimitivePropertyType target = null;
            target = (net.opengis.gml.TimeTopologyPrimitivePropertyType)get_store().find_element_user(PRIMITIVE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "primitive" element
     */
    public int sizeOfPrimitiveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIMITIVE$0);
        }
    }
    
    /**
     * Sets array of all "primitive" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setPrimitiveArray(net.opengis.gml.TimeTopologyPrimitivePropertyType[] primitiveArray)
    {
        check_orphaned();
        arraySetterHelper(primitiveArray, PRIMITIVE$0);
    }
    
    /**
     * Sets ith "primitive" element
     */
    @Inject(optional=true) public void setPrimitiveArray(int i, net.opengis.gml.TimeTopologyPrimitivePropertyType primitive)
    {
        generatedSetterHelperImpl(primitive, PRIMITIVE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "primitive" element
     */
    public net.opengis.gml.TimeTopologyPrimitivePropertyType insertNewPrimitive(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeTopologyPrimitivePropertyType target = null;
            target = (net.opengis.gml.TimeTopologyPrimitivePropertyType)get_store().insert_element_user(PRIMITIVE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "primitive" element
     */
    public net.opengis.gml.TimeTopologyPrimitivePropertyType addNewPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeTopologyPrimitivePropertyType target = null;
            target = (net.opengis.gml.TimeTopologyPrimitivePropertyType)get_store().add_element_user(PRIMITIVE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "primitive" element
     */
    public void removePrimitive(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIMITIVE$0, i);
        }
    }
}
