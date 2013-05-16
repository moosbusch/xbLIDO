/*
 * XML Type:  SolidArrayPropertyType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SolidArrayPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML SolidArrayPropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class SolidArrayPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SolidArrayPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public SolidArrayPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Solid");
    private static final org.apache.xmlbeans.QNameSet SOLID$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Solid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Solid"),
    });
    
    
    /**
     * Gets a List of "_Solid" elements
     */
    public java.util.List<net.opengis.gml.AbstractSolidType> getSolidList()
    {
        final class SolidList extends java.util.AbstractList<net.opengis.gml.AbstractSolidType>
        {
            @Override
            public net.opengis.gml.AbstractSolidType get(int i)
                { return SolidArrayPropertyTypeImpl.this.getSolidArray(i); }
            
            @Override
            public net.opengis.gml.AbstractSolidType set(int i, net.opengis.gml.AbstractSolidType o)
            {
                net.opengis.gml.AbstractSolidType old = SolidArrayPropertyTypeImpl.this.getSolidArray(i);
                SolidArrayPropertyTypeImpl.this.setSolidArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.AbstractSolidType o)
                { SolidArrayPropertyTypeImpl.this.insertNewSolid(i).set(o); }
            
            @Override
            public net.opengis.gml.AbstractSolidType remove(int i)
            {
                net.opengis.gml.AbstractSolidType old = SolidArrayPropertyTypeImpl.this.getSolidArray(i);
                SolidArrayPropertyTypeImpl.this.removeSolid(i);
                return old;
            }
            
            @Override
            public int size()
                { return SolidArrayPropertyTypeImpl.this.sizeOfSolidArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SolidList();
        }
    }
    
    /**
     * Gets array of all "_Solid" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.AbstractSolidType[] getSolidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.AbstractSolidType> targetList = new java.util.ArrayList<net.opengis.gml.AbstractSolidType>();
            get_store().find_all_element_users(SOLID$1, targetList);
            net.opengis.gml.AbstractSolidType[] result = new net.opengis.gml.AbstractSolidType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "_Solid" element
     */
    public net.opengis.gml.AbstractSolidType getSolidArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractSolidType target = null;
            target = (net.opengis.gml.AbstractSolidType)get_store().find_element_user(SOLID$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "_Solid" element
     */
    public int sizeOfSolidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOLID$1);
        }
    }
    
    /**
     * Sets array of all "_Solid" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setSolidArray(net.opengis.gml.AbstractSolidType[] solidArray)
    {
        check_orphaned();
        arraySetterHelper(solidArray, SOLID$0, SOLID$1);
    }
    
    /**
     * Sets ith "_Solid" element
     */
    @Inject(optional=true) public void setSolidArray(int i, net.opengis.gml.AbstractSolidType solid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractSolidType target = null;
            target = (net.opengis.gml.AbstractSolidType)get_store().find_element_user(SOLID$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(solid);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "_Solid" element
     */
    public net.opengis.gml.AbstractSolidType insertNewSolid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractSolidType target = null;
            target = (net.opengis.gml.AbstractSolidType)get_store().insert_element_user(SOLID$1, SOLID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "_Solid" element
     */
    public net.opengis.gml.AbstractSolidType addNewSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractSolidType target = null;
            target = (net.opengis.gml.AbstractSolidType)get_store().add_element_user(SOLID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "_Solid" element
     */
    public void removeSolid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOLID$1, i);
        }
    }
}
