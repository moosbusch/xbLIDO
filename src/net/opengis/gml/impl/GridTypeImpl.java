/*
 * XML Type:  GridType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GridType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML GridType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class GridTypeImpl extends net.opengis.gml.impl.AbstractGeometryTypeImpl implements net.opengis.gml.GridType
{
    private static final long serialVersionUID = 1L;
    
    public GridTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIMITS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "limits");
    private static final javax.xml.namespace.QName AXISNAME$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "axisName");
    private static final javax.xml.namespace.QName DIMENSION$4 = 
        new javax.xml.namespace.QName("", "dimension");
    
    
    /**
     * Gets the "limits" element
     */
    public net.opengis.gml.GridLimitsType getLimits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GridLimitsType target = null;
            target = (net.opengis.gml.GridLimitsType)get_store().find_element_user(LIMITS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "limits" element
     */
    @Inject(optional=true) public void setLimits(net.opengis.gml.GridLimitsType limits)
    {
        generatedSetterHelperImpl(limits, LIMITS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "limits" element
     */
    public net.opengis.gml.GridLimitsType addNewLimits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GridLimitsType target = null;
            target = (net.opengis.gml.GridLimitsType)get_store().add_element_user(LIMITS$0);
            return target;
        }
    }
    
    /**
     * Gets a List of "axisName" elements
     */
    public java.util.List<java.lang.String> getAxisNameList()
    {
        final class AxisNameList extends java.util.AbstractList<java.lang.String>
        {
            @Override
            public java.lang.String get(int i)
                { return GridTypeImpl.this.getAxisNameArray(i); }
            
            @Override
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = GridTypeImpl.this.getAxisNameArray(i);
                GridTypeImpl.this.setAxisNameArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.String o)
                { GridTypeImpl.this.insertAxisName(i, o); }
            
            @Override
            public java.lang.String remove(int i)
            {
                java.lang.String old = GridTypeImpl.this.getAxisNameArray(i);
                GridTypeImpl.this.removeAxisName(i);
                return old;
            }
            
            @Override
            public int size()
                { return GridTypeImpl.this.sizeOfAxisNameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AxisNameList();
        }
    }
    
    /**
     * Gets array of all "axisName" elements
     * @deprecated
     */
    @Deprecated
    public java.lang.String[] getAxisNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(AXISNAME$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "axisName" element
     */
    public java.lang.String getAxisNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AXISNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "axisName" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetAxisNameList()
    {
        final class AxisNameList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            @Override
            public org.apache.xmlbeans.XmlString get(int i)
                { return GridTypeImpl.this.xgetAxisNameArray(i); }
            
            @Override
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = GridTypeImpl.this.xgetAxisNameArray(i);
                GridTypeImpl.this.xsetAxisNameArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { GridTypeImpl.this.insertNewAxisName(i).set(o); }
            
            @Override
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = GridTypeImpl.this.xgetAxisNameArray(i);
                GridTypeImpl.this.removeAxisName(i);
                return old;
            }
            
            @Override
            public int size()
                { return GridTypeImpl.this.sizeOfAxisNameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AxisNameList();
        }
    }
    
    /**
     * Gets array of all "axisName" elements
     * @deprecated
     */
    @Deprecated
    public org.apache.xmlbeans.XmlString[] xgetAxisNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(AXISNAME$2, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "axisName" element
     */
    public org.apache.xmlbeans.XmlString xgetAxisNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AXISNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "axisName" element
     */
    public int sizeOfAxisNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AXISNAME$2);
        }
    }
    
    /**
     * Sets array of all "axisName" element
     */
    @Inject(optional=true) public void setAxisNameArray(java.lang.String[] axisNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(axisNameArray, AXISNAME$2);
        }
    }
    
    /**
     * Sets ith "axisName" element
     */
    @Inject(optional=true) public void setAxisNameArray(int i, java.lang.String axisName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AXISNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(axisName);
        }
    }
    
    /**
     * Sets (as xml) array of all "axisName" element
     */
    public void xsetAxisNameArray(org.apache.xmlbeans.XmlString[]axisNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(axisNameArray, AXISNAME$2);
        }
    }
    
    /**
     * Sets (as xml) ith "axisName" element
     */
    public void xsetAxisNameArray(int i, org.apache.xmlbeans.XmlString axisName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AXISNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(axisName);
        }
    }
    
    /**
     * Inserts the value as the ith "axisName" element
     */
    public void insertAxisName(int i, java.lang.String axisName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(AXISNAME$2, i);
            target.setStringValue(axisName);
        }
    }
    
    /**
     * Appends the value as the last "axisName" element
     */
    public void addAxisName(java.lang.String axisName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AXISNAME$2);
            target.setStringValue(axisName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "axisName" element
     */
    public org.apache.xmlbeans.XmlString insertNewAxisName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(AXISNAME$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "axisName" element
     */
    public org.apache.xmlbeans.XmlString addNewAxisName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AXISNAME$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "axisName" element
     */
    public void removeAxisName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AXISNAME$2, i);
        }
    }
    
    /**
     * Gets the "dimension" attribute
     */
    public java.math.BigInteger getDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIMENSION$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "dimension" attribute
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(DIMENSION$4);
            return target;
        }
    }
    
    /**
     * Sets the "dimension" attribute
     */
    @Inject(optional=true) public void setDimension(java.math.BigInteger dimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIMENSION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIMENSION$4);
            }
            target.setBigIntegerValue(dimension);
        }
    }
    
    /**
     * Sets (as xml) the "dimension" attribute
     */
    public void xsetDimension(org.apache.xmlbeans.XmlPositiveInteger dimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(DIMENSION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(DIMENSION$4);
            }
            target.set(dimension);
        }
    }
}
