/*
 * XML Type:  CoordinateSystemAxisType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CoordinateSystemAxisType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML CoordinateSystemAxisType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class CoordinateSystemAxisTypeImpl extends net.opengis.gml.impl.CoordinateSystemAxisBaseTypeImpl implements net.opengis.gml.CoordinateSystemAxisType
{
    private static final long serialVersionUID = 1L;
    
    public CoordinateSystemAxisTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AXISID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "axisID");
    private static final javax.xml.namespace.QName REMARKS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "remarks");
    private static final javax.xml.namespace.QName AXISABBREV$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "axisAbbrev");
    private static final javax.xml.namespace.QName AXISDIRECTION$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "axisDirection");
    private static final javax.xml.namespace.QName UOM$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "uom");
    
    
    /**
     * Gets a List of "axisID" elements
     */
    public java.util.List<net.opengis.gml.IdentifierType> getAxisIDList()
    {
        final class AxisIDList extends java.util.AbstractList<net.opengis.gml.IdentifierType>
        {
            @Override
            public net.opengis.gml.IdentifierType get(int i)
                { return CoordinateSystemAxisTypeImpl.this.getAxisIDArray(i); }
            
            @Override
            public net.opengis.gml.IdentifierType set(int i, net.opengis.gml.IdentifierType o)
            {
                net.opengis.gml.IdentifierType old = CoordinateSystemAxisTypeImpl.this.getAxisIDArray(i);
                CoordinateSystemAxisTypeImpl.this.setAxisIDArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.IdentifierType o)
                { CoordinateSystemAxisTypeImpl.this.insertNewAxisID(i).set(o); }
            
            @Override
            public net.opengis.gml.IdentifierType remove(int i)
            {
                net.opengis.gml.IdentifierType old = CoordinateSystemAxisTypeImpl.this.getAxisIDArray(i);
                CoordinateSystemAxisTypeImpl.this.removeAxisID(i);
                return old;
            }
            
            @Override
            public int size()
                { return CoordinateSystemAxisTypeImpl.this.sizeOfAxisIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AxisIDList();
        }
    }
    
    /**
     * Gets array of all "axisID" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.IdentifierType[] getAxisIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.IdentifierType> targetList = new java.util.ArrayList<net.opengis.gml.IdentifierType>();
            get_store().find_all_element_users(AXISID$0, targetList);
            net.opengis.gml.IdentifierType[] result = new net.opengis.gml.IdentifierType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "axisID" element
     */
    public net.opengis.gml.IdentifierType getAxisIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().find_element_user(AXISID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "axisID" element
     */
    public int sizeOfAxisIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AXISID$0);
        }
    }
    
    /**
     * Sets array of all "axisID" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setAxisIDArray(net.opengis.gml.IdentifierType[] axisIDArray)
    {
        check_orphaned();
        arraySetterHelper(axisIDArray, AXISID$0);
    }
    
    /**
     * Sets ith "axisID" element
     */
    @Inject(optional=true) public void setAxisIDArray(int i, net.opengis.gml.IdentifierType axisID)
    {
        generatedSetterHelperImpl(axisID, AXISID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "axisID" element
     */
    public net.opengis.gml.IdentifierType insertNewAxisID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().insert_element_user(AXISID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "axisID" element
     */
    public net.opengis.gml.IdentifierType addNewAxisID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().add_element_user(AXISID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "axisID" element
     */
    public void removeAxisID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AXISID$0, i);
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
     * Gets the "axisAbbrev" element
     */
    public net.opengis.gml.CodeType getAxisAbbrev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(AXISABBREV$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "axisAbbrev" element
     */
    @Inject(optional=true) public void setAxisAbbrev(net.opengis.gml.CodeType axisAbbrev)
    {
        generatedSetterHelperImpl(axisAbbrev, AXISABBREV$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "axisAbbrev" element
     */
    public net.opengis.gml.CodeType addNewAxisAbbrev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(AXISABBREV$4);
            return target;
        }
    }
    
    /**
     * Gets the "axisDirection" element
     */
    public net.opengis.gml.CodeType getAxisDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(AXISDIRECTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "axisDirection" element
     */
    @Inject(optional=true) public void setAxisDirection(net.opengis.gml.CodeType axisDirection)
    {
        generatedSetterHelperImpl(axisDirection, AXISDIRECTION$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "axisDirection" element
     */
    public net.opengis.gml.CodeType addNewAxisDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(AXISDIRECTION$6);
            return target;
        }
    }
    
    /**
     * Gets the "uom" attribute
     */
    public java.lang.String getUom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UOM$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "uom" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetUom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(UOM$8);
            return target;
        }
    }
    
    /**
     * Sets the "uom" attribute
     */
    @Inject(optional=true) public void setUom(java.lang.String uom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UOM$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UOM$8);
            }
            target.setStringValue(uom);
        }
    }
    
    /**
     * Sets (as xml) the "uom" attribute
     */
    public void xsetUom(org.apache.xmlbeans.XmlAnyURI uom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(UOM$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(UOM$8);
            }
            target.set(uom);
        }
    }
}
