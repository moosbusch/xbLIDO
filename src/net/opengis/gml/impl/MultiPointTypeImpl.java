/*
 * XML Type:  MultiPointType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiPointType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML MultiPointType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class MultiPointTypeImpl extends net.opengis.gml.impl.AbstractGeometricAggregateTypeImpl implements net.opengis.gml.MultiPointType
{
    private static final long serialVersionUID = 1L;
    
    public MultiPointTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINTMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "pointMember");
    private static final javax.xml.namespace.QName POINTMEMBERS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "pointMembers");
    
    
    /**
     * Gets a List of "pointMember" elements
     */
    public java.util.List<net.opengis.gml.PointPropertyType> getPointMemberList()
    {
        final class PointMemberList extends java.util.AbstractList<net.opengis.gml.PointPropertyType>
        {
            @Override
            public net.opengis.gml.PointPropertyType get(int i)
                { return MultiPointTypeImpl.this.getPointMemberArray(i); }
            
            @Override
            public net.opengis.gml.PointPropertyType set(int i, net.opengis.gml.PointPropertyType o)
            {
                net.opengis.gml.PointPropertyType old = MultiPointTypeImpl.this.getPointMemberArray(i);
                MultiPointTypeImpl.this.setPointMemberArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.PointPropertyType o)
                { MultiPointTypeImpl.this.insertNewPointMember(i).set(o); }
            
            @Override
            public net.opengis.gml.PointPropertyType remove(int i)
            {
                net.opengis.gml.PointPropertyType old = MultiPointTypeImpl.this.getPointMemberArray(i);
                MultiPointTypeImpl.this.removePointMember(i);
                return old;
            }
            
            @Override
            public int size()
                { return MultiPointTypeImpl.this.sizeOfPointMemberArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PointMemberList();
        }
    }
    
    /**
     * Gets array of all "pointMember" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.PointPropertyType[] getPointMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.PointPropertyType> targetList = new java.util.ArrayList<net.opengis.gml.PointPropertyType>();
            get_store().find_all_element_users(POINTMEMBER$0, targetList);
            net.opengis.gml.PointPropertyType[] result = new net.opengis.gml.PointPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pointMember" element
     */
    public net.opengis.gml.PointPropertyType getPointMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointPropertyType target = null;
            target = (net.opengis.gml.PointPropertyType)get_store().find_element_user(POINTMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pointMember" element
     */
    public int sizeOfPointMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POINTMEMBER$0);
        }
    }
    
    /**
     * Sets array of all "pointMember" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setPointMemberArray(net.opengis.gml.PointPropertyType[] pointMemberArray)
    {
        check_orphaned();
        arraySetterHelper(pointMemberArray, POINTMEMBER$0);
    }
    
    /**
     * Sets ith "pointMember" element
     */
    @Inject(optional=true) public void setPointMemberArray(int i, net.opengis.gml.PointPropertyType pointMember)
    {
        generatedSetterHelperImpl(pointMember, POINTMEMBER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pointMember" element
     */
    public net.opengis.gml.PointPropertyType insertNewPointMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointPropertyType target = null;
            target = (net.opengis.gml.PointPropertyType)get_store().insert_element_user(POINTMEMBER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pointMember" element
     */
    public net.opengis.gml.PointPropertyType addNewPointMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointPropertyType target = null;
            target = (net.opengis.gml.PointPropertyType)get_store().add_element_user(POINTMEMBER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "pointMember" element
     */
    public void removePointMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POINTMEMBER$0, i);
        }
    }
    
    /**
     * Gets the "pointMembers" element
     */
    public net.opengis.gml.PointArrayPropertyType getPointMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointArrayPropertyType target = null;
            target = (net.opengis.gml.PointArrayPropertyType)get_store().find_element_user(POINTMEMBERS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pointMembers" element
     */
    public boolean isSetPointMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POINTMEMBERS$2) != 0;
        }
    }
    
    /**
     * Sets the "pointMembers" element
     */
    @Inject(optional=true) public void setPointMembers(net.opengis.gml.PointArrayPropertyType pointMembers)
    {
        generatedSetterHelperImpl(pointMembers, POINTMEMBERS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "pointMembers" element
     */
    public net.opengis.gml.PointArrayPropertyType addNewPointMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointArrayPropertyType target = null;
            target = (net.opengis.gml.PointArrayPropertyType)get_store().add_element_user(POINTMEMBERS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "pointMembers" element
     */
    public void unsetPointMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POINTMEMBERS$2, 0);
        }
    }
}
