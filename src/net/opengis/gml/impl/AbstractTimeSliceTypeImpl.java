/*
 * XML Type:  AbstractTimeSliceType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.AbstractTimeSliceType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML AbstractTimeSliceType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class AbstractTimeSliceTypeImpl extends net.opengis.gml.impl.AbstractGMLTypeImpl implements net.opengis.gml.AbstractTimeSliceType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractTimeSliceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDTIME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "validTime");
    private static final javax.xml.namespace.QName DATASOURCE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "dataSource");
    
    
    /**
     * Gets the "validTime" element
     */
    public net.opengis.gml.TimePrimitivePropertyType getValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePrimitivePropertyType target = null;
            target = (net.opengis.gml.TimePrimitivePropertyType)get_store().find_element_user(VALIDTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "validTime" element
     */
    @Inject(optional=true) public void setValidTime(net.opengis.gml.TimePrimitivePropertyType validTime)
    {
        generatedSetterHelperImpl(validTime, VALIDTIME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "validTime" element
     */
    public net.opengis.gml.TimePrimitivePropertyType addNewValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePrimitivePropertyType target = null;
            target = (net.opengis.gml.TimePrimitivePropertyType)get_store().add_element_user(VALIDTIME$0);
            return target;
        }
    }
    
    /**
     * Gets the "dataSource" element
     */
    public net.opengis.gml.StringOrRefType getDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().find_element_user(DATASOURCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataSource" element
     */
    public boolean isSetDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASOURCE$2) != 0;
        }
    }
    
    /**
     * Sets the "dataSource" element
     */
    @Inject(optional=true) public void setDataSource(net.opengis.gml.StringOrRefType dataSource)
    {
        generatedSetterHelperImpl(dataSource, DATASOURCE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataSource" element
     */
    public net.opengis.gml.StringOrRefType addNewDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().add_element_user(DATASOURCE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "dataSource" element
     */
    public void unsetDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASOURCE$2, 0);
        }
    }
}
