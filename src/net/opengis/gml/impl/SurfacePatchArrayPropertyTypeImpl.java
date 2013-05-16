/*
 * XML Type:  SurfacePatchArrayPropertyType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SurfacePatchArrayPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML SurfacePatchArrayPropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class SurfacePatchArrayPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SurfacePatchArrayPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public SurfacePatchArrayPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURFACEPATCH$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_SurfacePatch");
    private static final org.apache.xmlbeans.QNameSet SURFACEPATCH$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Rectangle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PolygonPatch"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_ParametricCurveSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GriddedSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_SurfacePatch"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Cylinder"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Sphere"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Triangle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Cone"),
    });
    
    
    /**
     * Gets a List of "_SurfacePatch" elements
     */
    public java.util.List<net.opengis.gml.AbstractSurfacePatchType> getSurfacePatchList()
    {
        final class SurfacePatchList extends java.util.AbstractList<net.opengis.gml.AbstractSurfacePatchType>
        {
            @Override
            public net.opengis.gml.AbstractSurfacePatchType get(int i)
                { return SurfacePatchArrayPropertyTypeImpl.this.getSurfacePatchArray(i); }
            
            @Override
            public net.opengis.gml.AbstractSurfacePatchType set(int i, net.opengis.gml.AbstractSurfacePatchType o)
            {
                net.opengis.gml.AbstractSurfacePatchType old = SurfacePatchArrayPropertyTypeImpl.this.getSurfacePatchArray(i);
                SurfacePatchArrayPropertyTypeImpl.this.setSurfacePatchArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.AbstractSurfacePatchType o)
                { SurfacePatchArrayPropertyTypeImpl.this.insertNewSurfacePatch(i).set(o); }
            
            @Override
            public net.opengis.gml.AbstractSurfacePatchType remove(int i)
            {
                net.opengis.gml.AbstractSurfacePatchType old = SurfacePatchArrayPropertyTypeImpl.this.getSurfacePatchArray(i);
                SurfacePatchArrayPropertyTypeImpl.this.removeSurfacePatch(i);
                return old;
            }
            
            @Override
            public int size()
                { return SurfacePatchArrayPropertyTypeImpl.this.sizeOfSurfacePatchArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SurfacePatchList();
        }
    }
    
    /**
     * Gets array of all "_SurfacePatch" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.AbstractSurfacePatchType[] getSurfacePatchArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.AbstractSurfacePatchType> targetList = new java.util.ArrayList<net.opengis.gml.AbstractSurfacePatchType>();
            get_store().find_all_element_users(SURFACEPATCH$1, targetList);
            net.opengis.gml.AbstractSurfacePatchType[] result = new net.opengis.gml.AbstractSurfacePatchType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "_SurfacePatch" element
     */
    public net.opengis.gml.AbstractSurfacePatchType getSurfacePatchArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractSurfacePatchType target = null;
            target = (net.opengis.gml.AbstractSurfacePatchType)get_store().find_element_user(SURFACEPATCH$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "_SurfacePatch" element
     */
    public int sizeOfSurfacePatchArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SURFACEPATCH$1);
        }
    }
    
    /**
     * Sets array of all "_SurfacePatch" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setSurfacePatchArray(net.opengis.gml.AbstractSurfacePatchType[] surfacePatchArray)
    {
        check_orphaned();
        arraySetterHelper(surfacePatchArray, SURFACEPATCH$0, SURFACEPATCH$1);
    }
    
    /**
     * Sets ith "_SurfacePatch" element
     */
    @Inject(optional=true) public void setSurfacePatchArray(int i, net.opengis.gml.AbstractSurfacePatchType surfacePatch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractSurfacePatchType target = null;
            target = (net.opengis.gml.AbstractSurfacePatchType)get_store().find_element_user(SURFACEPATCH$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(surfacePatch);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "_SurfacePatch" element
     */
    public net.opengis.gml.AbstractSurfacePatchType insertNewSurfacePatch(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractSurfacePatchType target = null;
            target = (net.opengis.gml.AbstractSurfacePatchType)get_store().insert_element_user(SURFACEPATCH$1, SURFACEPATCH$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "_SurfacePatch" element
     */
    public net.opengis.gml.AbstractSurfacePatchType addNewSurfacePatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractSurfacePatchType target = null;
            target = (net.opengis.gml.AbstractSurfacePatchType)get_store().add_element_user(SURFACEPATCH$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "_SurfacePatch" element
     */
    public void removeSurfacePatch(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SURFACEPATCH$1, i);
        }
    }
}
