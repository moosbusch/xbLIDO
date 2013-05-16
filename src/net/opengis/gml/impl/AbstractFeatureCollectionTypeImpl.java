/*
 * XML Type:  AbstractFeatureCollectionType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.AbstractFeatureCollectionType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML AbstractFeatureCollectionType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class AbstractFeatureCollectionTypeImpl extends net.opengis.gml.impl.AbstractFeatureTypeImpl implements net.opengis.gml.AbstractFeatureCollectionType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractFeatureCollectionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEATUREMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "featureMember");
    private static final javax.xml.namespace.QName FEATUREMEMBERS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "featureMembers");
    
    
    /**
     * Gets a List of "featureMember" elements
     */
    public java.util.List<net.opengis.gml.FeaturePropertyType> getFeatureMemberList()
    {
        final class FeatureMemberList extends java.util.AbstractList<net.opengis.gml.FeaturePropertyType>
        {
            @Override
            public net.opengis.gml.FeaturePropertyType get(int i)
                { return AbstractFeatureCollectionTypeImpl.this.getFeatureMemberArray(i); }
            
            @Override
            public net.opengis.gml.FeaturePropertyType set(int i, net.opengis.gml.FeaturePropertyType o)
            {
                net.opengis.gml.FeaturePropertyType old = AbstractFeatureCollectionTypeImpl.this.getFeatureMemberArray(i);
                AbstractFeatureCollectionTypeImpl.this.setFeatureMemberArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.FeaturePropertyType o)
                { AbstractFeatureCollectionTypeImpl.this.insertNewFeatureMember(i).set(o); }
            
            @Override
            public net.opengis.gml.FeaturePropertyType remove(int i)
            {
                net.opengis.gml.FeaturePropertyType old = AbstractFeatureCollectionTypeImpl.this.getFeatureMemberArray(i);
                AbstractFeatureCollectionTypeImpl.this.removeFeatureMember(i);
                return old;
            }
            
            @Override
            public int size()
                { return AbstractFeatureCollectionTypeImpl.this.sizeOfFeatureMemberArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FeatureMemberList();
        }
    }
    
    /**
     * Gets array of all "featureMember" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.FeaturePropertyType[] getFeatureMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.FeaturePropertyType> targetList = new java.util.ArrayList<net.opengis.gml.FeaturePropertyType>();
            get_store().find_all_element_users(FEATUREMEMBER$0, targetList);
            net.opengis.gml.FeaturePropertyType[] result = new net.opengis.gml.FeaturePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "featureMember" element
     */
    public net.opengis.gml.FeaturePropertyType getFeatureMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FeaturePropertyType target = null;
            target = (net.opengis.gml.FeaturePropertyType)get_store().find_element_user(FEATUREMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "featureMember" element
     */
    public int sizeOfFeatureMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FEATUREMEMBER$0);
        }
    }
    
    /**
     * Sets array of all "featureMember" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setFeatureMemberArray(net.opengis.gml.FeaturePropertyType[] featureMemberArray)
    {
        check_orphaned();
        arraySetterHelper(featureMemberArray, FEATUREMEMBER$0);
    }
    
    /**
     * Sets ith "featureMember" element
     */
    @Inject(optional=true) public void setFeatureMemberArray(int i, net.opengis.gml.FeaturePropertyType featureMember)
    {
        generatedSetterHelperImpl(featureMember, FEATUREMEMBER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "featureMember" element
     */
    public net.opengis.gml.FeaturePropertyType insertNewFeatureMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FeaturePropertyType target = null;
            target = (net.opengis.gml.FeaturePropertyType)get_store().insert_element_user(FEATUREMEMBER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "featureMember" element
     */
    public net.opengis.gml.FeaturePropertyType addNewFeatureMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FeaturePropertyType target = null;
            target = (net.opengis.gml.FeaturePropertyType)get_store().add_element_user(FEATUREMEMBER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "featureMember" element
     */
    public void removeFeatureMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FEATUREMEMBER$0, i);
        }
    }
    
    /**
     * Gets the "featureMembers" element
     */
    public net.opengis.gml.FeatureArrayPropertyType getFeatureMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FeatureArrayPropertyType target = null;
            target = (net.opengis.gml.FeatureArrayPropertyType)get_store().find_element_user(FEATUREMEMBERS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "featureMembers" element
     */
    public boolean isSetFeatureMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FEATUREMEMBERS$2) != 0;
        }
    }
    
    /**
     * Sets the "featureMembers" element
     */
    @Inject(optional=true) public void setFeatureMembers(net.opengis.gml.FeatureArrayPropertyType featureMembers)
    {
        generatedSetterHelperImpl(featureMembers, FEATUREMEMBERS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "featureMembers" element
     */
    public net.opengis.gml.FeatureArrayPropertyType addNewFeatureMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FeatureArrayPropertyType target = null;
            target = (net.opengis.gml.FeatureArrayPropertyType)get_store().add_element_user(FEATUREMEMBERS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "featureMembers" element
     */
    public void unsetFeatureMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FEATUREMEMBERS$2, 0);
        }
    }
}
