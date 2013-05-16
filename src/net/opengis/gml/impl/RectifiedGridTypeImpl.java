/*
 * XML Type:  RectifiedGridType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.RectifiedGridType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML RectifiedGridType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class RectifiedGridTypeImpl extends net.opengis.gml.impl.GridTypeImpl implements net.opengis.gml.RectifiedGridType
{
    private static final long serialVersionUID = 1L;
    
    public RectifiedGridTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORIGIN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "origin");
    private static final javax.xml.namespace.QName OFFSETVECTOR$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "offsetVector");
    
    
    /**
     * Gets the "origin" element
     */
    public net.opengis.gml.PointPropertyType getOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointPropertyType target = null;
            target = (net.opengis.gml.PointPropertyType)get_store().find_element_user(ORIGIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "origin" element
     */
    @Inject(optional=true) public void setOrigin(net.opengis.gml.PointPropertyType origin)
    {
        generatedSetterHelperImpl(origin, ORIGIN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "origin" element
     */
    public net.opengis.gml.PointPropertyType addNewOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointPropertyType target = null;
            target = (net.opengis.gml.PointPropertyType)get_store().add_element_user(ORIGIN$0);
            return target;
        }
    }
    
    /**
     * Gets a List of "offsetVector" elements
     */
    public java.util.List<net.opengis.gml.VectorType> getOffsetVectorList()
    {
        final class OffsetVectorList extends java.util.AbstractList<net.opengis.gml.VectorType>
        {
            @Override
            public net.opengis.gml.VectorType get(int i)
                { return RectifiedGridTypeImpl.this.getOffsetVectorArray(i); }
            
            @Override
            public net.opengis.gml.VectorType set(int i, net.opengis.gml.VectorType o)
            {
                net.opengis.gml.VectorType old = RectifiedGridTypeImpl.this.getOffsetVectorArray(i);
                RectifiedGridTypeImpl.this.setOffsetVectorArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.VectorType o)
                { RectifiedGridTypeImpl.this.insertNewOffsetVector(i).set(o); }
            
            @Override
            public net.opengis.gml.VectorType remove(int i)
            {
                net.opengis.gml.VectorType old = RectifiedGridTypeImpl.this.getOffsetVectorArray(i);
                RectifiedGridTypeImpl.this.removeOffsetVector(i);
                return old;
            }
            
            @Override
            public int size()
                { return RectifiedGridTypeImpl.this.sizeOfOffsetVectorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new OffsetVectorList();
        }
    }
    
    /**
     * Gets array of all "offsetVector" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.VectorType[] getOffsetVectorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.VectorType> targetList = new java.util.ArrayList<net.opengis.gml.VectorType>();
            get_store().find_all_element_users(OFFSETVECTOR$2, targetList);
            net.opengis.gml.VectorType[] result = new net.opengis.gml.VectorType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "offsetVector" element
     */
    public net.opengis.gml.VectorType getOffsetVectorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VectorType target = null;
            target = (net.opengis.gml.VectorType)get_store().find_element_user(OFFSETVECTOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "offsetVector" element
     */
    public int sizeOfOffsetVectorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFSETVECTOR$2);
        }
    }
    
    /**
     * Sets array of all "offsetVector" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setOffsetVectorArray(net.opengis.gml.VectorType[] offsetVectorArray)
    {
        check_orphaned();
        arraySetterHelper(offsetVectorArray, OFFSETVECTOR$2);
    }
    
    /**
     * Sets ith "offsetVector" element
     */
    @Inject(optional=true) public void setOffsetVectorArray(int i, net.opengis.gml.VectorType offsetVector)
    {
        generatedSetterHelperImpl(offsetVector, OFFSETVECTOR$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "offsetVector" element
     */
    public net.opengis.gml.VectorType insertNewOffsetVector(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VectorType target = null;
            target = (net.opengis.gml.VectorType)get_store().insert_element_user(OFFSETVECTOR$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "offsetVector" element
     */
    public net.opengis.gml.VectorType addNewOffsetVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VectorType target = null;
            target = (net.opengis.gml.VectorType)get_store().add_element_user(OFFSETVECTOR$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "offsetVector" element
     */
    public void removeOffsetVector(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFSETVECTOR$2, i);
        }
    }
}
