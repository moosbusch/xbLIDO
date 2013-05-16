/*
 * XML Type:  BagType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.BagType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML BagType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class BagTypeImpl extends net.opengis.gml.impl.AbstractGMLTypeImpl implements net.opengis.gml.BagType
{
    private static final long serialVersionUID = 1L;
    
    public BagTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "member");
    private static final javax.xml.namespace.QName MEMBERS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "members");
    
    
    /**
     * Gets a List of "member" elements
     */
    public java.util.List<net.opengis.gml.AssociationType> getMemberList()
    {
        final class MemberList extends java.util.AbstractList<net.opengis.gml.AssociationType>
        {
            @Override
            public net.opengis.gml.AssociationType get(int i)
                { return BagTypeImpl.this.getMemberArray(i); }
            
            @Override
            public net.opengis.gml.AssociationType set(int i, net.opengis.gml.AssociationType o)
            {
                net.opengis.gml.AssociationType old = BagTypeImpl.this.getMemberArray(i);
                BagTypeImpl.this.setMemberArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.AssociationType o)
                { BagTypeImpl.this.insertNewMember(i).set(o); }
            
            @Override
            public net.opengis.gml.AssociationType remove(int i)
            {
                net.opengis.gml.AssociationType old = BagTypeImpl.this.getMemberArray(i);
                BagTypeImpl.this.removeMember(i);
                return old;
            }
            
            @Override
            public int size()
                { return BagTypeImpl.this.sizeOfMemberArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MemberList();
        }
    }
    
    /**
     * Gets array of all "member" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.AssociationType[] getMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.AssociationType> targetList = new java.util.ArrayList<net.opengis.gml.AssociationType>();
            get_store().find_all_element_users(MEMBER$0, targetList);
            net.opengis.gml.AssociationType[] result = new net.opengis.gml.AssociationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "member" element
     */
    public net.opengis.gml.AssociationType getMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AssociationType target = null;
            target = (net.opengis.gml.AssociationType)get_store().find_element_user(MEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "member" element
     */
    public int sizeOfMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEMBER$0);
        }
    }
    
    /**
     * Sets array of all "member" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setMemberArray(net.opengis.gml.AssociationType[] memberArray)
    {
        check_orphaned();
        arraySetterHelper(memberArray, MEMBER$0);
    }
    
    /**
     * Sets ith "member" element
     */
    @Inject(optional=true) public void setMemberArray(int i, net.opengis.gml.AssociationType member)
    {
        generatedSetterHelperImpl(member, MEMBER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "member" element
     */
    public net.opengis.gml.AssociationType insertNewMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AssociationType target = null;
            target = (net.opengis.gml.AssociationType)get_store().insert_element_user(MEMBER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "member" element
     */
    public net.opengis.gml.AssociationType addNewMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AssociationType target = null;
            target = (net.opengis.gml.AssociationType)get_store().add_element_user(MEMBER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "member" element
     */
    public void removeMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEMBER$0, i);
        }
    }
    
    /**
     * Gets the "members" element
     */
    public net.opengis.gml.ArrayAssociationType getMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArrayAssociationType target = null;
            target = (net.opengis.gml.ArrayAssociationType)get_store().find_element_user(MEMBERS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "members" element
     */
    public boolean isSetMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEMBERS$2) != 0;
        }
    }
    
    /**
     * Sets the "members" element
     */
    @Inject(optional=true) public void setMembers(net.opengis.gml.ArrayAssociationType members)
    {
        generatedSetterHelperImpl(members, MEMBERS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "members" element
     */
    public net.opengis.gml.ArrayAssociationType addNewMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArrayAssociationType target = null;
            target = (net.opengis.gml.ArrayAssociationType)get_store().add_element_user(MEMBERS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "members" element
     */
    public void unsetMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEMBERS$2, 0);
        }
    }
}
