/*
 * XML Type:  materialsTechSetComplexType
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.MaterialsTechSetComplexType
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
/**
 * An XML materialsTechSetComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class MaterialsTechSetComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.MaterialsTechSetComplexType
{
    private static final long serialVersionUID = 1L;
    
    public MaterialsTechSetComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAYMATERIALSTECH$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "displayMaterialsTech");
    private static final javax.xml.namespace.QName MATERIALSTECH$2 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "materialsTech");
    
    
    /**
     * Gets a List of "displayMaterialsTech" elements
     */
    public java.util.List<org.lidoSchema.TextComplexType> getDisplayMaterialsTechList()
    {
        final class DisplayMaterialsTechList extends java.util.AbstractList<org.lidoSchema.TextComplexType>
        {
            @Override
            public org.lidoSchema.TextComplexType get(int i)
                { return MaterialsTechSetComplexTypeImpl.this.getDisplayMaterialsTechArray(i); }
            
            @Override
            public org.lidoSchema.TextComplexType set(int i, org.lidoSchema.TextComplexType o)
            {
                org.lidoSchema.TextComplexType old = MaterialsTechSetComplexTypeImpl.this.getDisplayMaterialsTechArray(i);
                MaterialsTechSetComplexTypeImpl.this.setDisplayMaterialsTechArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.TextComplexType o)
                { MaterialsTechSetComplexTypeImpl.this.insertNewDisplayMaterialsTech(i).set(o); }
            
            @Override
            public org.lidoSchema.TextComplexType remove(int i)
            {
                org.lidoSchema.TextComplexType old = MaterialsTechSetComplexTypeImpl.this.getDisplayMaterialsTechArray(i);
                MaterialsTechSetComplexTypeImpl.this.removeDisplayMaterialsTech(i);
                return old;
            }
            
            @Override
            public int size()
                { return MaterialsTechSetComplexTypeImpl.this.sizeOfDisplayMaterialsTechArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DisplayMaterialsTechList();
        }
    }
    
    /**
     * Gets array of all "displayMaterialsTech" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.TextComplexType[] getDisplayMaterialsTechArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.TextComplexType> targetList = new java.util.ArrayList<org.lidoSchema.TextComplexType>();
            get_store().find_all_element_users(DISPLAYMATERIALSTECH$0, targetList);
            org.lidoSchema.TextComplexType[] result = new org.lidoSchema.TextComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "displayMaterialsTech" element
     */
    public org.lidoSchema.TextComplexType getDisplayMaterialsTechArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().find_element_user(DISPLAYMATERIALSTECH$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "displayMaterialsTech" element
     */
    public int sizeOfDisplayMaterialsTechArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYMATERIALSTECH$0);
        }
    }
    
    /**
     * Sets array of all "displayMaterialsTech" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setDisplayMaterialsTechArray(org.lidoSchema.TextComplexType[] displayMaterialsTechArray)
    {
        check_orphaned();
        arraySetterHelper(displayMaterialsTechArray, DISPLAYMATERIALSTECH$0);
    }
    
    /**
     * Sets ith "displayMaterialsTech" element
     */
    @Inject(optional=true) public void setDisplayMaterialsTechArray(int i, org.lidoSchema.TextComplexType displayMaterialsTech)
    {
        generatedSetterHelperImpl(displayMaterialsTech, DISPLAYMATERIALSTECH$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "displayMaterialsTech" element
     */
    public org.lidoSchema.TextComplexType insertNewDisplayMaterialsTech(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().insert_element_user(DISPLAYMATERIALSTECH$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "displayMaterialsTech" element
     */
    public org.lidoSchema.TextComplexType addNewDisplayMaterialsTech()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().add_element_user(DISPLAYMATERIALSTECH$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "displayMaterialsTech" element
     */
    public void removeDisplayMaterialsTech(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYMATERIALSTECH$0, i);
        }
    }
    
    /**
     * Gets the "materialsTech" element
     */
    public org.lidoSchema.MaterialsTechComplexType getMaterialsTech()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.MaterialsTechComplexType target = null;
            target = (org.lidoSchema.MaterialsTechComplexType)get_store().find_element_user(MATERIALSTECH$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "materialsTech" element
     */
    public boolean isSetMaterialsTech()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MATERIALSTECH$2) != 0;
        }
    }
    
    /**
     * Sets the "materialsTech" element
     */
    @Inject(optional=true) public void setMaterialsTech(org.lidoSchema.MaterialsTechComplexType materialsTech)
    {
        generatedSetterHelperImpl(materialsTech, MATERIALSTECH$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "materialsTech" element
     */
    public org.lidoSchema.MaterialsTechComplexType addNewMaterialsTech()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.MaterialsTechComplexType target = null;
            target = (org.lidoSchema.MaterialsTechComplexType)get_store().add_element_user(MATERIALSTECH$2);
            return target;
        }
    }
    
    /**
     * Unsets the "materialsTech" element
     */
    public void unsetMaterialsTech()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MATERIALSTECH$2, 0);
        }
    }
}
