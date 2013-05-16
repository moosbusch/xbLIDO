/*
 * XML Type:  PolygonPatchArrayPropertyType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PolygonPatchArrayPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML PolygonPatchArrayPropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class PolygonPatchArrayPropertyTypeImpl extends net.opengis.gml.impl.SurfacePatchArrayPropertyTypeImpl implements net.opengis.gml.PolygonPatchArrayPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public PolygonPatchArrayPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLYGONPATCH$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PolygonPatch");
    
    
    /**
     * Gets a List of "PolygonPatch" elements
     */
    public java.util.List<net.opengis.gml.PolygonPatchType> getPolygonPatchList()
    {
        final class PolygonPatchList extends java.util.AbstractList<net.opengis.gml.PolygonPatchType>
        {
            @Override
            public net.opengis.gml.PolygonPatchType get(int i)
                { return PolygonPatchArrayPropertyTypeImpl.this.getPolygonPatchArray(i); }
            
            @Override
            public net.opengis.gml.PolygonPatchType set(int i, net.opengis.gml.PolygonPatchType o)
            {
                net.opengis.gml.PolygonPatchType old = PolygonPatchArrayPropertyTypeImpl.this.getPolygonPatchArray(i);
                PolygonPatchArrayPropertyTypeImpl.this.setPolygonPatchArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.PolygonPatchType o)
                { PolygonPatchArrayPropertyTypeImpl.this.insertNewPolygonPatch(i).set(o); }
            
            @Override
            public net.opengis.gml.PolygonPatchType remove(int i)
            {
                net.opengis.gml.PolygonPatchType old = PolygonPatchArrayPropertyTypeImpl.this.getPolygonPatchArray(i);
                PolygonPatchArrayPropertyTypeImpl.this.removePolygonPatch(i);
                return old;
            }
            
            @Override
            public int size()
                { return PolygonPatchArrayPropertyTypeImpl.this.sizeOfPolygonPatchArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PolygonPatchList();
        }
    }
    
    /**
     * Gets array of all "PolygonPatch" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.PolygonPatchType[] getPolygonPatchArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.PolygonPatchType> targetList = new java.util.ArrayList<net.opengis.gml.PolygonPatchType>();
            get_store().find_all_element_users(POLYGONPATCH$0, targetList);
            net.opengis.gml.PolygonPatchType[] result = new net.opengis.gml.PolygonPatchType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PolygonPatch" element
     */
    public net.opengis.gml.PolygonPatchType getPolygonPatchArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonPatchType target = null;
            target = (net.opengis.gml.PolygonPatchType)get_store().find_element_user(POLYGONPATCH$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "PolygonPatch" element
     */
    public int sizeOfPolygonPatchArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POLYGONPATCH$0);
        }
    }
    
    /**
     * Sets array of all "PolygonPatch" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setPolygonPatchArray(net.opengis.gml.PolygonPatchType[] polygonPatchArray)
    {
        check_orphaned();
        arraySetterHelper(polygonPatchArray, POLYGONPATCH$0);
    }
    
    /**
     * Sets ith "PolygonPatch" element
     */
    @Inject(optional=true) public void setPolygonPatchArray(int i, net.opengis.gml.PolygonPatchType polygonPatch)
    {
        generatedSetterHelperImpl(polygonPatch, POLYGONPATCH$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PolygonPatch" element
     */
    public net.opengis.gml.PolygonPatchType insertNewPolygonPatch(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonPatchType target = null;
            target = (net.opengis.gml.PolygonPatchType)get_store().insert_element_user(POLYGONPATCH$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PolygonPatch" element
     */
    public net.opengis.gml.PolygonPatchType addNewPolygonPatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonPatchType target = null;
            target = (net.opengis.gml.PolygonPatchType)get_store().add_element_user(POLYGONPATCH$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "PolygonPatch" element
     */
    public void removePolygonPatch(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POLYGONPATCH$0, i);
        }
    }
}
