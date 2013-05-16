/*
 * An XML document type.
 * Localname: DirectedObservationAtDistance
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DirectedObservationAtDistanceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one DirectedObservationAtDistance(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DirectedObservationAtDistanceDocumentImpl extends net.opengis.gml.impl.DirectedObservationDocumentImpl implements net.opengis.gml.DirectedObservationAtDistanceDocument
{
    private static final long serialVersionUID = 1L;
    
    public DirectedObservationAtDistanceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTEDOBSERVATIONATDISTANCE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectedObservationAtDistance");
    
    
    /**
     * Gets the "DirectedObservationAtDistance" element
     */
    public net.opengis.gml.DirectedObservationAtDistanceType getDirectedObservationAtDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedObservationAtDistanceType target = null;
            target = (net.opengis.gml.DirectedObservationAtDistanceType)get_store().find_element_user(DIRECTEDOBSERVATIONATDISTANCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DirectedObservationAtDistance" element
     */
    @Inject(optional=true) public void setDirectedObservationAtDistance(net.opengis.gml.DirectedObservationAtDistanceType directedObservationAtDistance)
    {
        generatedSetterHelperImpl(directedObservationAtDistance, DIRECTEDOBSERVATIONATDISTANCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DirectedObservationAtDistance" element
     */
    public net.opengis.gml.DirectedObservationAtDistanceType addNewDirectedObservationAtDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedObservationAtDistanceType target = null;
            target = (net.opengis.gml.DirectedObservationAtDistanceType)get_store().add_element_user(DIRECTEDOBSERVATIONATDISTANCE$0);
            return target;
        }
    }
}
