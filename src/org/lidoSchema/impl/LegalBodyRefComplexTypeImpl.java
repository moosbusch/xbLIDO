/*
 * XML Type:  legalBodyRefComplexType
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.LegalBodyRefComplexType
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
/**
 * An XML legalBodyRefComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class LegalBodyRefComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.LegalBodyRefComplexType
{
    private static final long serialVersionUID = 1L;
    
    public LegalBodyRefComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEGALBODYID$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "legalBodyID");
    private static final javax.xml.namespace.QName LEGALBODYNAME$2 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "legalBodyName");
    private static final javax.xml.namespace.QName LEGALBODYWEBLINK$4 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "legalBodyWeblink");
    
    
    /**
     * Gets a List of "legalBodyID" elements
     */
    public java.util.List<org.lidoSchema.IdentifierComplexType> getLegalBodyIDList()
    {
        final class LegalBodyIDList extends java.util.AbstractList<org.lidoSchema.IdentifierComplexType>
        {
            @Override
            public org.lidoSchema.IdentifierComplexType get(int i)
                { return LegalBodyRefComplexTypeImpl.this.getLegalBodyIDArray(i); }
            
            @Override
            public org.lidoSchema.IdentifierComplexType set(int i, org.lidoSchema.IdentifierComplexType o)
            {
                org.lidoSchema.IdentifierComplexType old = LegalBodyRefComplexTypeImpl.this.getLegalBodyIDArray(i);
                LegalBodyRefComplexTypeImpl.this.setLegalBodyIDArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.IdentifierComplexType o)
                { LegalBodyRefComplexTypeImpl.this.insertNewLegalBodyID(i).set(o); }
            
            @Override
            public org.lidoSchema.IdentifierComplexType remove(int i)
            {
                org.lidoSchema.IdentifierComplexType old = LegalBodyRefComplexTypeImpl.this.getLegalBodyIDArray(i);
                LegalBodyRefComplexTypeImpl.this.removeLegalBodyID(i);
                return old;
            }
            
            @Override
            public int size()
                { return LegalBodyRefComplexTypeImpl.this.sizeOfLegalBodyIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LegalBodyIDList();
        }
    }
    
    /**
     * Gets array of all "legalBodyID" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.IdentifierComplexType[] getLegalBodyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.IdentifierComplexType> targetList = new java.util.ArrayList<org.lidoSchema.IdentifierComplexType>();
            get_store().find_all_element_users(LEGALBODYID$0, targetList);
            org.lidoSchema.IdentifierComplexType[] result = new org.lidoSchema.IdentifierComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "legalBodyID" element
     */
    public org.lidoSchema.IdentifierComplexType getLegalBodyIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().find_element_user(LEGALBODYID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "legalBodyID" element
     */
    public int sizeOfLegalBodyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEGALBODYID$0);
        }
    }
    
    /**
     * Sets array of all "legalBodyID" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setLegalBodyIDArray(org.lidoSchema.IdentifierComplexType[] legalBodyIDArray)
    {
        check_orphaned();
        arraySetterHelper(legalBodyIDArray, LEGALBODYID$0);
    }
    
    /**
     * Sets ith "legalBodyID" element
     */
    @Inject(optional=true) public void setLegalBodyIDArray(int i, org.lidoSchema.IdentifierComplexType legalBodyID)
    {
        generatedSetterHelperImpl(legalBodyID, LEGALBODYID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "legalBodyID" element
     */
    public org.lidoSchema.IdentifierComplexType insertNewLegalBodyID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().insert_element_user(LEGALBODYID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "legalBodyID" element
     */
    public org.lidoSchema.IdentifierComplexType addNewLegalBodyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().add_element_user(LEGALBODYID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "legalBodyID" element
     */
    public void removeLegalBodyID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEGALBODYID$0, i);
        }
    }
    
    /**
     * Gets a List of "legalBodyName" elements
     */
    public java.util.List<org.lidoSchema.AppellationComplexType> getLegalBodyNameList()
    {
        final class LegalBodyNameList extends java.util.AbstractList<org.lidoSchema.AppellationComplexType>
        {
            @Override
            public org.lidoSchema.AppellationComplexType get(int i)
                { return LegalBodyRefComplexTypeImpl.this.getLegalBodyNameArray(i); }
            
            @Override
            public org.lidoSchema.AppellationComplexType set(int i, org.lidoSchema.AppellationComplexType o)
            {
                org.lidoSchema.AppellationComplexType old = LegalBodyRefComplexTypeImpl.this.getLegalBodyNameArray(i);
                LegalBodyRefComplexTypeImpl.this.setLegalBodyNameArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.AppellationComplexType o)
                { LegalBodyRefComplexTypeImpl.this.insertNewLegalBodyName(i).set(o); }
            
            @Override
            public org.lidoSchema.AppellationComplexType remove(int i)
            {
                org.lidoSchema.AppellationComplexType old = LegalBodyRefComplexTypeImpl.this.getLegalBodyNameArray(i);
                LegalBodyRefComplexTypeImpl.this.removeLegalBodyName(i);
                return old;
            }
            
            @Override
            public int size()
                { return LegalBodyRefComplexTypeImpl.this.sizeOfLegalBodyNameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LegalBodyNameList();
        }
    }
    
    /**
     * Gets array of all "legalBodyName" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.AppellationComplexType[] getLegalBodyNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.AppellationComplexType> targetList = new java.util.ArrayList<org.lidoSchema.AppellationComplexType>();
            get_store().find_all_element_users(LEGALBODYNAME$2, targetList);
            org.lidoSchema.AppellationComplexType[] result = new org.lidoSchema.AppellationComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "legalBodyName" element
     */
    public org.lidoSchema.AppellationComplexType getLegalBodyNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.AppellationComplexType target = null;
            target = (org.lidoSchema.AppellationComplexType)get_store().find_element_user(LEGALBODYNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "legalBodyName" element
     */
    public int sizeOfLegalBodyNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEGALBODYNAME$2);
        }
    }
    
    /**
     * Sets array of all "legalBodyName" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setLegalBodyNameArray(org.lidoSchema.AppellationComplexType[] legalBodyNameArray)
    {
        check_orphaned();
        arraySetterHelper(legalBodyNameArray, LEGALBODYNAME$2);
    }
    
    /**
     * Sets ith "legalBodyName" element
     */
    @Inject(optional=true) public void setLegalBodyNameArray(int i, org.lidoSchema.AppellationComplexType legalBodyName)
    {
        generatedSetterHelperImpl(legalBodyName, LEGALBODYNAME$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "legalBodyName" element
     */
    public org.lidoSchema.AppellationComplexType insertNewLegalBodyName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.AppellationComplexType target = null;
            target = (org.lidoSchema.AppellationComplexType)get_store().insert_element_user(LEGALBODYNAME$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "legalBodyName" element
     */
    public org.lidoSchema.AppellationComplexType addNewLegalBodyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.AppellationComplexType target = null;
            target = (org.lidoSchema.AppellationComplexType)get_store().add_element_user(LEGALBODYNAME$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "legalBodyName" element
     */
    public void removeLegalBodyName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEGALBODYNAME$2, i);
        }
    }
    
    /**
     * Gets a List of "legalBodyWeblink" elements
     */
    public java.util.List<org.lidoSchema.WebResourceComplexType> getLegalBodyWeblinkList()
    {
        final class LegalBodyWeblinkList extends java.util.AbstractList<org.lidoSchema.WebResourceComplexType>
        {
            @Override
            public org.lidoSchema.WebResourceComplexType get(int i)
                { return LegalBodyRefComplexTypeImpl.this.getLegalBodyWeblinkArray(i); }
            
            @Override
            public org.lidoSchema.WebResourceComplexType set(int i, org.lidoSchema.WebResourceComplexType o)
            {
                org.lidoSchema.WebResourceComplexType old = LegalBodyRefComplexTypeImpl.this.getLegalBodyWeblinkArray(i);
                LegalBodyRefComplexTypeImpl.this.setLegalBodyWeblinkArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.WebResourceComplexType o)
                { LegalBodyRefComplexTypeImpl.this.insertNewLegalBodyWeblink(i).set(o); }
            
            @Override
            public org.lidoSchema.WebResourceComplexType remove(int i)
            {
                org.lidoSchema.WebResourceComplexType old = LegalBodyRefComplexTypeImpl.this.getLegalBodyWeblinkArray(i);
                LegalBodyRefComplexTypeImpl.this.removeLegalBodyWeblink(i);
                return old;
            }
            
            @Override
            public int size()
                { return LegalBodyRefComplexTypeImpl.this.sizeOfLegalBodyWeblinkArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LegalBodyWeblinkList();
        }
    }
    
    /**
     * Gets array of all "legalBodyWeblink" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.WebResourceComplexType[] getLegalBodyWeblinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.WebResourceComplexType> targetList = new java.util.ArrayList<org.lidoSchema.WebResourceComplexType>();
            get_store().find_all_element_users(LEGALBODYWEBLINK$4, targetList);
            org.lidoSchema.WebResourceComplexType[] result = new org.lidoSchema.WebResourceComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "legalBodyWeblink" element
     */
    public org.lidoSchema.WebResourceComplexType getLegalBodyWeblinkArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.WebResourceComplexType target = null;
            target = (org.lidoSchema.WebResourceComplexType)get_store().find_element_user(LEGALBODYWEBLINK$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "legalBodyWeblink" element
     */
    public int sizeOfLegalBodyWeblinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEGALBODYWEBLINK$4);
        }
    }
    
    /**
     * Sets array of all "legalBodyWeblink" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setLegalBodyWeblinkArray(org.lidoSchema.WebResourceComplexType[] legalBodyWeblinkArray)
    {
        check_orphaned();
        arraySetterHelper(legalBodyWeblinkArray, LEGALBODYWEBLINK$4);
    }
    
    /**
     * Sets ith "legalBodyWeblink" element
     */
    @Inject(optional=true) public void setLegalBodyWeblinkArray(int i, org.lidoSchema.WebResourceComplexType legalBodyWeblink)
    {
        generatedSetterHelperImpl(legalBodyWeblink, LEGALBODYWEBLINK$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "legalBodyWeblink" element
     */
    public org.lidoSchema.WebResourceComplexType insertNewLegalBodyWeblink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.WebResourceComplexType target = null;
            target = (org.lidoSchema.WebResourceComplexType)get_store().insert_element_user(LEGALBODYWEBLINK$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "legalBodyWeblink" element
     */
    public org.lidoSchema.WebResourceComplexType addNewLegalBodyWeblink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.WebResourceComplexType target = null;
            target = (org.lidoSchema.WebResourceComplexType)get_store().add_element_user(LEGALBODYWEBLINK$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "legalBodyWeblink" element
     */
    public void removeLegalBodyWeblink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEGALBODYWEBLINK$4, i);
        }
    }
}
