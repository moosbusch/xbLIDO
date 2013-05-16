/*
 * XML Type:  LinearRingPropertyType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.LinearRingPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML LinearRingPropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class LinearRingPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.LinearRingPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public LinearRingPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINEARRING$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LinearRing");
    
    
    /**
     * Gets the "LinearRing" element
     */
    public net.opengis.gml.LinearRingType getLinearRing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LinearRingType target = null;
            target = (net.opengis.gml.LinearRingType)get_store().find_element_user(LINEARRING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LinearRing" element
     */
    @Inject(optional=true) public void setLinearRing(net.opengis.gml.LinearRingType linearRing)
    {
        generatedSetterHelperImpl(linearRing, LINEARRING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LinearRing" element
     */
    public net.opengis.gml.LinearRingType addNewLinearRing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LinearRingType target = null;
            target = (net.opengis.gml.LinearRingType)get_store().add_element_user(LINEARRING$0);
            return target;
        }
    }
}
