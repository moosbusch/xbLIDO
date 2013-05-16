/*
 * XML Type:  RectifiedGridDomainType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.RectifiedGridDomainType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML RectifiedGridDomainType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class RectifiedGridDomainTypeImpl extends net.opengis.gml.impl.DomainSetTypeImpl implements net.opengis.gml.RectifiedGridDomainType
{
    private static final long serialVersionUID = 1L;
    
    public RectifiedGridDomainTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECTIFIEDGRID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "RectifiedGrid");
    
    
    /**
     * Gets the "RectifiedGrid" element
     */
    public net.opengis.gml.RectifiedGridType getRectifiedGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RectifiedGridType target = null;
            target = (net.opengis.gml.RectifiedGridType)get_store().find_element_user(RECTIFIEDGRID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RectifiedGrid" element
     */
    public boolean isSetRectifiedGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECTIFIEDGRID$0) != 0;
        }
    }
    
    /**
     * Sets the "RectifiedGrid" element
     */
    @Inject(optional=true) public void setRectifiedGrid(net.opengis.gml.RectifiedGridType rectifiedGrid)
    {
        generatedSetterHelperImpl(rectifiedGrid, RECTIFIEDGRID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RectifiedGrid" element
     */
    public net.opengis.gml.RectifiedGridType addNewRectifiedGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RectifiedGridType target = null;
            target = (net.opengis.gml.RectifiedGridType)get_store().add_element_user(RECTIFIEDGRID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "RectifiedGrid" element
     */
    public void unsetRectifiedGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECTIFIEDGRID$0, 0);
        }
    }
}
