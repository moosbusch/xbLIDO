/*
 * An XML document type.
 * Localname: DirectedObservation
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DirectedObservationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one DirectedObservation(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DirectedObservationDocumentImpl extends net.opengis.gml.impl.ObservationDocumentImpl implements net.opengis.gml.DirectedObservationDocument
{
    private static final long serialVersionUID = 1L;
    
    public DirectedObservationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTEDOBSERVATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectedObservation");
    private static final org.apache.xmlbeans.QNameSet DIRECTEDOBSERVATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectedObservation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectedObservationAtDistance"),
    });
    
    
    /**
     * Gets the "DirectedObservation" element
     */
    public net.opengis.gml.DirectedObservationType getDirectedObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedObservationType target = null;
            target = (net.opengis.gml.DirectedObservationType)get_store().find_element_user(DIRECTEDOBSERVATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DirectedObservation" element
     */
    @Inject(optional=true) public void setDirectedObservation(net.opengis.gml.DirectedObservationType directedObservation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedObservationType target = null;
            target = (net.opengis.gml.DirectedObservationType)get_store().find_element_user(DIRECTEDOBSERVATION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.DirectedObservationType)get_store().add_element_user(DIRECTEDOBSERVATION$0);
            }
            target.set(directedObservation);
        }
    }
    
    /**
     * Appends and returns a new empty "DirectedObservation" element
     */
    public net.opengis.gml.DirectedObservationType addNewDirectedObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedObservationType target = null;
            target = (net.opengis.gml.DirectedObservationType)get_store().add_element_user(DIRECTEDOBSERVATION$0);
            return target;
        }
    }
}
