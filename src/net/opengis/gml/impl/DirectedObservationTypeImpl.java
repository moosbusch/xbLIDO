/*
 * XML Type:  DirectedObservationType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DirectedObservationType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML DirectedObservationType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class DirectedObservationTypeImpl extends net.opengis.gml.impl.ObservationTypeImpl implements net.opengis.gml.DirectedObservationType
{
    private static final long serialVersionUID = 1L;
    
    public DirectedObservationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "direction");
    
    
    /**
     * Gets the "direction" element
     */
    public net.opengis.gml.DirectionPropertyType getDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectionPropertyType target = null;
            target = (net.opengis.gml.DirectionPropertyType)get_store().find_element_user(DIRECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "direction" element
     */
    @Inject(optional=true) public void setDirection(net.opengis.gml.DirectionPropertyType direction)
    {
        generatedSetterHelperImpl(direction, DIRECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "direction" element
     */
    public net.opengis.gml.DirectionPropertyType addNewDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectionPropertyType target = null;
            target = (net.opengis.gml.DirectionPropertyType)get_store().add_element_user(DIRECTION$0);
            return target;
        }
    }
}
