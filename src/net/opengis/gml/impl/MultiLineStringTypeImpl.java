/*
 * XML Type:  MultiLineStringType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiLineStringType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML MultiLineStringType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class MultiLineStringTypeImpl extends net.opengis.gml.impl.AbstractGeometricAggregateTypeImpl implements net.opengis.gml.MultiLineStringType
{
    private static final long serialVersionUID = 1L;
    
    public MultiLineStringTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINESTRINGMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "lineStringMember");
    
    
    /**
     * Gets a List of "lineStringMember" elements
     */
    public java.util.List<net.opengis.gml.LineStringPropertyType> getLineStringMemberList()
    {
        final class LineStringMemberList extends java.util.AbstractList<net.opengis.gml.LineStringPropertyType>
        {
            @Override
            public net.opengis.gml.LineStringPropertyType get(int i)
                { return MultiLineStringTypeImpl.this.getLineStringMemberArray(i); }
            
            @Override
            public net.opengis.gml.LineStringPropertyType set(int i, net.opengis.gml.LineStringPropertyType o)
            {
                net.opengis.gml.LineStringPropertyType old = MultiLineStringTypeImpl.this.getLineStringMemberArray(i);
                MultiLineStringTypeImpl.this.setLineStringMemberArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.LineStringPropertyType o)
                { MultiLineStringTypeImpl.this.insertNewLineStringMember(i).set(o); }
            
            @Override
            public net.opengis.gml.LineStringPropertyType remove(int i)
            {
                net.opengis.gml.LineStringPropertyType old = MultiLineStringTypeImpl.this.getLineStringMemberArray(i);
                MultiLineStringTypeImpl.this.removeLineStringMember(i);
                return old;
            }
            
            @Override
            public int size()
                { return MultiLineStringTypeImpl.this.sizeOfLineStringMemberArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LineStringMemberList();
        }
    }
    
    /**
     * Gets array of all "lineStringMember" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.LineStringPropertyType[] getLineStringMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.LineStringPropertyType> targetList = new java.util.ArrayList<net.opengis.gml.LineStringPropertyType>();
            get_store().find_all_element_users(LINESTRINGMEMBER$0, targetList);
            net.opengis.gml.LineStringPropertyType[] result = new net.opengis.gml.LineStringPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "lineStringMember" element
     */
    public net.opengis.gml.LineStringPropertyType getLineStringMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringPropertyType target = null;
            target = (net.opengis.gml.LineStringPropertyType)get_store().find_element_user(LINESTRINGMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "lineStringMember" element
     */
    public int sizeOfLineStringMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINESTRINGMEMBER$0);
        }
    }
    
    /**
     * Sets array of all "lineStringMember" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setLineStringMemberArray(net.opengis.gml.LineStringPropertyType[] lineStringMemberArray)
    {
        check_orphaned();
        arraySetterHelper(lineStringMemberArray, LINESTRINGMEMBER$0);
    }
    
    /**
     * Sets ith "lineStringMember" element
     */
    @Inject(optional=true) public void setLineStringMemberArray(int i, net.opengis.gml.LineStringPropertyType lineStringMember)
    {
        generatedSetterHelperImpl(lineStringMember, LINESTRINGMEMBER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lineStringMember" element
     */
    public net.opengis.gml.LineStringPropertyType insertNewLineStringMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringPropertyType target = null;
            target = (net.opengis.gml.LineStringPropertyType)get_store().insert_element_user(LINESTRINGMEMBER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lineStringMember" element
     */
    public net.opengis.gml.LineStringPropertyType addNewLineStringMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringPropertyType target = null;
            target = (net.opengis.gml.LineStringPropertyType)get_store().add_element_user(LINESTRINGMEMBER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "lineStringMember" element
     */
    public void removeLineStringMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINESTRINGMEMBER$0, i);
        }
    }
}
