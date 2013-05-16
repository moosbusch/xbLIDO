/*
 * XML Type:  TimeOrdinalReferenceSystemType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimeOrdinalReferenceSystemType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML TimeOrdinalReferenceSystemType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class TimeOrdinalReferenceSystemTypeImpl extends net.opengis.gml.impl.AbstractTimeReferenceSystemTypeImpl implements net.opengis.gml.TimeOrdinalReferenceSystemType
{
    private static final long serialVersionUID = 1L;
    
    public TimeOrdinalReferenceSystemTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPONENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "component");
    
    
    /**
     * Gets a List of "component" elements
     */
    public java.util.List<net.opengis.gml.TimeOrdinalEraPropertyType> getComponentList()
    {
        final class ComponentList extends java.util.AbstractList<net.opengis.gml.TimeOrdinalEraPropertyType>
        {
            @Override
            public net.opengis.gml.TimeOrdinalEraPropertyType get(int i)
                { return TimeOrdinalReferenceSystemTypeImpl.this.getComponentArray(i); }
            
            @Override
            public net.opengis.gml.TimeOrdinalEraPropertyType set(int i, net.opengis.gml.TimeOrdinalEraPropertyType o)
            {
                net.opengis.gml.TimeOrdinalEraPropertyType old = TimeOrdinalReferenceSystemTypeImpl.this.getComponentArray(i);
                TimeOrdinalReferenceSystemTypeImpl.this.setComponentArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.TimeOrdinalEraPropertyType o)
                { TimeOrdinalReferenceSystemTypeImpl.this.insertNewComponent(i).set(o); }
            
            @Override
            public net.opengis.gml.TimeOrdinalEraPropertyType remove(int i)
            {
                net.opengis.gml.TimeOrdinalEraPropertyType old = TimeOrdinalReferenceSystemTypeImpl.this.getComponentArray(i);
                TimeOrdinalReferenceSystemTypeImpl.this.removeComponent(i);
                return old;
            }
            
            @Override
            public int size()
                { return TimeOrdinalReferenceSystemTypeImpl.this.sizeOfComponentArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ComponentList();
        }
    }
    
    /**
     * Gets array of all "component" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.TimeOrdinalEraPropertyType[] getComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.TimeOrdinalEraPropertyType> targetList = new java.util.ArrayList<net.opengis.gml.TimeOrdinalEraPropertyType>();
            get_store().find_all_element_users(COMPONENT$0, targetList);
            net.opengis.gml.TimeOrdinalEraPropertyType[] result = new net.opengis.gml.TimeOrdinalEraPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "component" element
     */
    public net.opengis.gml.TimeOrdinalEraPropertyType getComponentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeOrdinalEraPropertyType target = null;
            target = (net.opengis.gml.TimeOrdinalEraPropertyType)get_store().find_element_user(COMPONENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "component" element
     */
    public int sizeOfComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPONENT$0);
        }
    }
    
    /**
     * Sets array of all "component" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setComponentArray(net.opengis.gml.TimeOrdinalEraPropertyType[] componentArray)
    {
        check_orphaned();
        arraySetterHelper(componentArray, COMPONENT$0);
    }
    
    /**
     * Sets ith "component" element
     */
    @Inject(optional=true) public void setComponentArray(int i, net.opengis.gml.TimeOrdinalEraPropertyType component)
    {
        generatedSetterHelperImpl(component, COMPONENT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "component" element
     */
    public net.opengis.gml.TimeOrdinalEraPropertyType insertNewComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeOrdinalEraPropertyType target = null;
            target = (net.opengis.gml.TimeOrdinalEraPropertyType)get_store().insert_element_user(COMPONENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "component" element
     */
    public net.opengis.gml.TimeOrdinalEraPropertyType addNewComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeOrdinalEraPropertyType target = null;
            target = (net.opengis.gml.TimeOrdinalEraPropertyType)get_store().add_element_user(COMPONENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "component" element
     */
    public void removeComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPONENT$0, i);
        }
    }
}
