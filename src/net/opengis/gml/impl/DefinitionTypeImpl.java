/*
 * XML Type:  DefinitionType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DefinitionType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML DefinitionType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class DefinitionTypeImpl extends net.opengis.gml.impl.AbstractGMLTypeImpl implements net.opengis.gml.DefinitionType
{
    private static final long serialVersionUID = 1L;
    
    public DefinitionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "name");
    private static final org.apache.xmlbeans.QNameSet NAME$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ellipsoidName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "meridianName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "coordinateOperationName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "datumName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "methodName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "parameterName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "groupName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "srsName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "csName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "name"),
    });
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "id");
    
    
    /**
     * Gets a List of "name" elements
     */
    public java.util.List<net.opengis.gml.CodeType> getNameList()
    {
        final class NameList extends java.util.AbstractList<net.opengis.gml.CodeType>
        {
            @Override
            public net.opengis.gml.CodeType get(int i)
                { return DefinitionTypeImpl.this.getNameArray(i); }
            
            @Override
            public net.opengis.gml.CodeType set(int i, net.opengis.gml.CodeType o)
            {
                net.opengis.gml.CodeType old = DefinitionTypeImpl.this.getNameArray(i);
                DefinitionTypeImpl.this.setNameArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.CodeType o)
                { DefinitionTypeImpl.this.insertNewName(i).set(o); }
            
            @Override
            public net.opengis.gml.CodeType remove(int i)
            {
                net.opengis.gml.CodeType old = DefinitionTypeImpl.this.getNameArray(i);
                DefinitionTypeImpl.this.removeName(i);
                return old;
            }
            
            @Override
            public int size()
                { return DefinitionTypeImpl.this.sizeOfNameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new NameList();
        }
    }
    
    /**
     * Gets array of all "name" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.CodeType[] getNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.CodeType> targetList = new java.util.ArrayList<net.opengis.gml.CodeType>();
            get_store().find_all_element_users(NAME$1, targetList);
            net.opengis.gml.CodeType[] result = new net.opengis.gml.CodeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "name" element
     */
    public net.opengis.gml.CodeType getNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(NAME$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "name" element
     */
    public int sizeOfNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$1);
        }
    }
    
    /**
     * Sets array of all "name" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setNameArray(net.opengis.gml.CodeType[] nameArray)
    {
        check_orphaned();
        arraySetterHelper(nameArray, NAME$0, NAME$1);
    }
    
    /**
     * Sets ith "name" element
     */
    @Inject(optional=true) public void setNameArray(int i, net.opengis.gml.CodeType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(NAME$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(name);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    public net.opengis.gml.CodeType insertNewName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().insert_element_user(NAME$1, NAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    public net.opengis.gml.CodeType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "name" element
     */
    public void removeName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$1, i);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$2);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$2) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    @Inject(optional=true) public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$2);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$2);
        }
    }
}