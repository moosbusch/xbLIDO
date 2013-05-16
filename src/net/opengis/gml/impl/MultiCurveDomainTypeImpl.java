/*
 * XML Type:  MultiCurveDomainType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiCurveDomainType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML MultiCurveDomainType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class MultiCurveDomainTypeImpl extends net.opengis.gml.impl.DomainSetTypeImpl implements net.opengis.gml.MultiCurveDomainType
{
    private static final long serialVersionUID = 1L;
    
    public MultiCurveDomainTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTICURVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiCurve");
    
    
    /**
     * Gets the "MultiCurve" element
     */
    public net.opengis.gml.MultiCurveType getMultiCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiCurveType target = null;
            target = (net.opengis.gml.MultiCurveType)get_store().find_element_user(MULTICURVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MultiCurve" element
     */
    public boolean isSetMultiCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MULTICURVE$0) != 0;
        }
    }
    
    /**
     * Sets the "MultiCurve" element
     */
    @Inject(optional=true) public void setMultiCurve(net.opengis.gml.MultiCurveType multiCurve)
    {
        generatedSetterHelperImpl(multiCurve, MULTICURVE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MultiCurve" element
     */
    public net.opengis.gml.MultiCurveType addNewMultiCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiCurveType target = null;
            target = (net.opengis.gml.MultiCurveType)get_store().add_element_user(MULTICURVE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "MultiCurve" element
     */
    public void unsetMultiCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MULTICURVE$0, 0);
        }
    }
}
