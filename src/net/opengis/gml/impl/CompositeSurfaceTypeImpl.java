/*
 * XML Type:  CompositeSurfaceType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CompositeSurfaceType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML CompositeSurfaceType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class CompositeSurfaceTypeImpl extends net.opengis.gml.impl.AbstractSurfaceTypeImpl implements net.opengis.gml.CompositeSurfaceType
{
    private static final long serialVersionUID = 1L;
    
    public CompositeSurfaceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURFACEMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "surfaceMember");
    
    
    /**
     * Gets a List of "surfaceMember" elements
     */
    public java.util.List<net.opengis.gml.SurfacePropertyType> getSurfaceMemberList()
    {
        final class SurfaceMemberList extends java.util.AbstractList<net.opengis.gml.SurfacePropertyType>
        {
            @Override
            public net.opengis.gml.SurfacePropertyType get(int i)
                { return CompositeSurfaceTypeImpl.this.getSurfaceMemberArray(i); }
            
            @Override
            public net.opengis.gml.SurfacePropertyType set(int i, net.opengis.gml.SurfacePropertyType o)
            {
                net.opengis.gml.SurfacePropertyType old = CompositeSurfaceTypeImpl.this.getSurfaceMemberArray(i);
                CompositeSurfaceTypeImpl.this.setSurfaceMemberArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.SurfacePropertyType o)
                { CompositeSurfaceTypeImpl.this.insertNewSurfaceMember(i).set(o); }
            
            @Override
            public net.opengis.gml.SurfacePropertyType remove(int i)
            {
                net.opengis.gml.SurfacePropertyType old = CompositeSurfaceTypeImpl.this.getSurfaceMemberArray(i);
                CompositeSurfaceTypeImpl.this.removeSurfaceMember(i);
                return old;
            }
            
            @Override
            public int size()
                { return CompositeSurfaceTypeImpl.this.sizeOfSurfaceMemberArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SurfaceMemberList();
        }
    }
    
    /**
     * Gets array of all "surfaceMember" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.SurfacePropertyType[] getSurfaceMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.SurfacePropertyType> targetList = new java.util.ArrayList<net.opengis.gml.SurfacePropertyType>();
            get_store().find_all_element_users(SURFACEMEMBER$0, targetList);
            net.opengis.gml.SurfacePropertyType[] result = new net.opengis.gml.SurfacePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "surfaceMember" element
     */
    public net.opengis.gml.SurfacePropertyType getSurfaceMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePropertyType target = null;
            target = (net.opengis.gml.SurfacePropertyType)get_store().find_element_user(SURFACEMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "surfaceMember" element
     */
    public int sizeOfSurfaceMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SURFACEMEMBER$0);
        }
    }
    
    /**
     * Sets array of all "surfaceMember" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setSurfaceMemberArray(net.opengis.gml.SurfacePropertyType[] surfaceMemberArray)
    {
        check_orphaned();
        arraySetterHelper(surfaceMemberArray, SURFACEMEMBER$0);
    }
    
    /**
     * Sets ith "surfaceMember" element
     */
    @Inject(optional=true) public void setSurfaceMemberArray(int i, net.opengis.gml.SurfacePropertyType surfaceMember)
    {
        generatedSetterHelperImpl(surfaceMember, SURFACEMEMBER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "surfaceMember" element
     */
    public net.opengis.gml.SurfacePropertyType insertNewSurfaceMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePropertyType target = null;
            target = (net.opengis.gml.SurfacePropertyType)get_store().insert_element_user(SURFACEMEMBER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "surfaceMember" element
     */
    public net.opengis.gml.SurfacePropertyType addNewSurfaceMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePropertyType target = null;
            target = (net.opengis.gml.SurfacePropertyType)get_store().add_element_user(SURFACEMEMBER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "surfaceMember" element
     */
    public void removeSurfaceMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SURFACEMEMBER$0, i);
        }
    }
}
