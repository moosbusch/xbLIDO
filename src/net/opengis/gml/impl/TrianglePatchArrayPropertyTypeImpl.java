/*
 * XML Type:  TrianglePatchArrayPropertyType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TrianglePatchArrayPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML TrianglePatchArrayPropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class TrianglePatchArrayPropertyTypeImpl extends net.opengis.gml.impl.SurfacePatchArrayPropertyTypeImpl implements net.opengis.gml.TrianglePatchArrayPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public TrianglePatchArrayPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRIANGLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Triangle");
    
    
    /**
     * Gets a List of "Triangle" elements
     */
    public java.util.List<net.opengis.gml.TriangleType> getTriangleList()
    {
        final class TriangleList extends java.util.AbstractList<net.opengis.gml.TriangleType>
        {
            @Override
            public net.opengis.gml.TriangleType get(int i)
                { return TrianglePatchArrayPropertyTypeImpl.this.getTriangleArray(i); }
            
            @Override
            public net.opengis.gml.TriangleType set(int i, net.opengis.gml.TriangleType o)
            {
                net.opengis.gml.TriangleType old = TrianglePatchArrayPropertyTypeImpl.this.getTriangleArray(i);
                TrianglePatchArrayPropertyTypeImpl.this.setTriangleArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.TriangleType o)
                { TrianglePatchArrayPropertyTypeImpl.this.insertNewTriangle(i).set(o); }
            
            @Override
            public net.opengis.gml.TriangleType remove(int i)
            {
                net.opengis.gml.TriangleType old = TrianglePatchArrayPropertyTypeImpl.this.getTriangleArray(i);
                TrianglePatchArrayPropertyTypeImpl.this.removeTriangle(i);
                return old;
            }
            
            @Override
            public int size()
                { return TrianglePatchArrayPropertyTypeImpl.this.sizeOfTriangleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TriangleList();
        }
    }
    
    /**
     * Gets array of all "Triangle" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.TriangleType[] getTriangleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.TriangleType> targetList = new java.util.ArrayList<net.opengis.gml.TriangleType>();
            get_store().find_all_element_users(TRIANGLE$0, targetList);
            net.opengis.gml.TriangleType[] result = new net.opengis.gml.TriangleType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Triangle" element
     */
    public net.opengis.gml.TriangleType getTriangleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TriangleType target = null;
            target = (net.opengis.gml.TriangleType)get_store().find_element_user(TRIANGLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Triangle" element
     */
    public int sizeOfTriangleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRIANGLE$0);
        }
    }
    
    /**
     * Sets array of all "Triangle" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setTriangleArray(net.opengis.gml.TriangleType[] triangleArray)
    {
        check_orphaned();
        arraySetterHelper(triangleArray, TRIANGLE$0);
    }
    
    /**
     * Sets ith "Triangle" element
     */
    @Inject(optional=true) public void setTriangleArray(int i, net.opengis.gml.TriangleType triangle)
    {
        generatedSetterHelperImpl(triangle, TRIANGLE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Triangle" element
     */
    public net.opengis.gml.TriangleType insertNewTriangle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TriangleType target = null;
            target = (net.opengis.gml.TriangleType)get_store().insert_element_user(TRIANGLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Triangle" element
     */
    public net.opengis.gml.TriangleType addNewTriangle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TriangleType target = null;
            target = (net.opengis.gml.TriangleType)get_store().add_element_user(TRIANGLE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Triangle" element
     */
    public void removeTriangle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRIANGLE$0, i);
        }
    }
}
