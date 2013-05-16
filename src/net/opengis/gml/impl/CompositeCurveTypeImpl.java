/*
 * XML Type:  CompositeCurveType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CompositeCurveType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML CompositeCurveType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class CompositeCurveTypeImpl extends net.opengis.gml.impl.AbstractCurveTypeImpl implements net.opengis.gml.CompositeCurveType
{
    private static final long serialVersionUID = 1L;
    
    public CompositeCurveTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURVEMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "curveMember");
    
    
    /**
     * Gets a List of "curveMember" elements
     */
    public java.util.List<net.opengis.gml.CurvePropertyType> getCurveMemberList()
    {
        final class CurveMemberList extends java.util.AbstractList<net.opengis.gml.CurvePropertyType>
        {
            @Override
            public net.opengis.gml.CurvePropertyType get(int i)
                { return CompositeCurveTypeImpl.this.getCurveMemberArray(i); }
            
            @Override
            public net.opengis.gml.CurvePropertyType set(int i, net.opengis.gml.CurvePropertyType o)
            {
                net.opengis.gml.CurvePropertyType old = CompositeCurveTypeImpl.this.getCurveMemberArray(i);
                CompositeCurveTypeImpl.this.setCurveMemberArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.CurvePropertyType o)
                { CompositeCurveTypeImpl.this.insertNewCurveMember(i).set(o); }
            
            @Override
            public net.opengis.gml.CurvePropertyType remove(int i)
            {
                net.opengis.gml.CurvePropertyType old = CompositeCurveTypeImpl.this.getCurveMemberArray(i);
                CompositeCurveTypeImpl.this.removeCurveMember(i);
                return old;
            }
            
            @Override
            public int size()
                { return CompositeCurveTypeImpl.this.sizeOfCurveMemberArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CurveMemberList();
        }
    }
    
    /**
     * Gets array of all "curveMember" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.CurvePropertyType[] getCurveMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.CurvePropertyType> targetList = new java.util.ArrayList<net.opengis.gml.CurvePropertyType>();
            get_store().find_all_element_users(CURVEMEMBER$0, targetList);
            net.opengis.gml.CurvePropertyType[] result = new net.opengis.gml.CurvePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "curveMember" element
     */
    public net.opengis.gml.CurvePropertyType getCurveMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurvePropertyType target = null;
            target = (net.opengis.gml.CurvePropertyType)get_store().find_element_user(CURVEMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "curveMember" element
     */
    public int sizeOfCurveMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURVEMEMBER$0);
        }
    }
    
    /**
     * Sets array of all "curveMember" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setCurveMemberArray(net.opengis.gml.CurvePropertyType[] curveMemberArray)
    {
        check_orphaned();
        arraySetterHelper(curveMemberArray, CURVEMEMBER$0);
    }
    
    /**
     * Sets ith "curveMember" element
     */
    @Inject(optional=true) public void setCurveMemberArray(int i, net.opengis.gml.CurvePropertyType curveMember)
    {
        generatedSetterHelperImpl(curveMember, CURVEMEMBER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "curveMember" element
     */
    public net.opengis.gml.CurvePropertyType insertNewCurveMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurvePropertyType target = null;
            target = (net.opengis.gml.CurvePropertyType)get_store().insert_element_user(CURVEMEMBER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "curveMember" element
     */
    public net.opengis.gml.CurvePropertyType addNewCurveMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurvePropertyType target = null;
            target = (net.opengis.gml.CurvePropertyType)get_store().add_element_user(CURVEMEMBER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "curveMember" element
     */
    public void removeCurveMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURVEMEMBER$0, i);
        }
    }
}
