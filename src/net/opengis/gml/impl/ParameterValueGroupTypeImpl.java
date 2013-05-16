/*
 * XML Type:  ParameterValueGroupType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ParameterValueGroupType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML ParameterValueGroupType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class ParameterValueGroupTypeImpl extends net.opengis.gml.impl.AbstractGeneralParameterValueTypeImpl implements net.opengis.gml.ParameterValueGroupType
{
    private static final long serialVersionUID = 1L;
    
    public ParameterValueGroupTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUDESVALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "includesValue");
    private static final javax.xml.namespace.QName VALUESOFGROUP$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "valuesOfGroup");
    
    
    /**
     * Gets a List of "includesValue" elements
     */
    public java.util.List<net.opengis.gml.AbstractGeneralParameterValueType> getIncludesValueList()
    {
        final class IncludesValueList extends java.util.AbstractList<net.opengis.gml.AbstractGeneralParameterValueType>
        {
            @Override
            public net.opengis.gml.AbstractGeneralParameterValueType get(int i)
                { return ParameterValueGroupTypeImpl.this.getIncludesValueArray(i); }
            
            @Override
            public net.opengis.gml.AbstractGeneralParameterValueType set(int i, net.opengis.gml.AbstractGeneralParameterValueType o)
            {
                net.opengis.gml.AbstractGeneralParameterValueType old = ParameterValueGroupTypeImpl.this.getIncludesValueArray(i);
                ParameterValueGroupTypeImpl.this.setIncludesValueArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.AbstractGeneralParameterValueType o)
                { ParameterValueGroupTypeImpl.this.insertNewIncludesValue(i).set(o); }
            
            @Override
            public net.opengis.gml.AbstractGeneralParameterValueType remove(int i)
            {
                net.opengis.gml.AbstractGeneralParameterValueType old = ParameterValueGroupTypeImpl.this.getIncludesValueArray(i);
                ParameterValueGroupTypeImpl.this.removeIncludesValue(i);
                return old;
            }
            
            @Override
            public int size()
                { return ParameterValueGroupTypeImpl.this.sizeOfIncludesValueArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IncludesValueList();
        }
    }
    
    /**
     * Gets array of all "includesValue" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.AbstractGeneralParameterValueType[] getIncludesValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.AbstractGeneralParameterValueType> targetList = new java.util.ArrayList<net.opengis.gml.AbstractGeneralParameterValueType>();
            get_store().find_all_element_users(INCLUDESVALUE$0, targetList);
            net.opengis.gml.AbstractGeneralParameterValueType[] result = new net.opengis.gml.AbstractGeneralParameterValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "includesValue" element
     */
    public net.opengis.gml.AbstractGeneralParameterValueType getIncludesValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralParameterValueType target = null;
            target = (net.opengis.gml.AbstractGeneralParameterValueType)get_store().find_element_user(INCLUDESVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "includesValue" element
     */
    public int sizeOfIncludesValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCLUDESVALUE$0);
        }
    }
    
    /**
     * Sets array of all "includesValue" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setIncludesValueArray(net.opengis.gml.AbstractGeneralParameterValueType[] includesValueArray)
    {
        check_orphaned();
        arraySetterHelper(includesValueArray, INCLUDESVALUE$0);
    }
    
    /**
     * Sets ith "includesValue" element
     */
    @Inject(optional=true) public void setIncludesValueArray(int i, net.opengis.gml.AbstractGeneralParameterValueType includesValue)
    {
        generatedSetterHelperImpl(includesValue, INCLUDESVALUE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "includesValue" element
     */
    public net.opengis.gml.AbstractGeneralParameterValueType insertNewIncludesValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralParameterValueType target = null;
            target = (net.opengis.gml.AbstractGeneralParameterValueType)get_store().insert_element_user(INCLUDESVALUE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "includesValue" element
     */
    public net.opengis.gml.AbstractGeneralParameterValueType addNewIncludesValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralParameterValueType target = null;
            target = (net.opengis.gml.AbstractGeneralParameterValueType)get_store().add_element_user(INCLUDESVALUE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "includesValue" element
     */
    public void removeIncludesValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCLUDESVALUE$0, i);
        }
    }
    
    /**
     * Gets the "valuesOfGroup" element
     */
    public net.opengis.gml.OperationParameterGroupRefType getValuesOfGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationParameterGroupRefType target = null;
            target = (net.opengis.gml.OperationParameterGroupRefType)get_store().find_element_user(VALUESOFGROUP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "valuesOfGroup" element
     */
    @Inject(optional=true) public void setValuesOfGroup(net.opengis.gml.OperationParameterGroupRefType valuesOfGroup)
    {
        generatedSetterHelperImpl(valuesOfGroup, VALUESOFGROUP$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valuesOfGroup" element
     */
    public net.opengis.gml.OperationParameterGroupRefType addNewValuesOfGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationParameterGroupRefType target = null;
            target = (net.opengis.gml.OperationParameterGroupRefType)get_store().add_element_user(VALUESOFGROUP$2);
            return target;
        }
    }
}
