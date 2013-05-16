/*
 * An XML document type.
 * Localname: Observation
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ObservationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one Observation(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ObservationDocumentImpl extends net.opengis.gml.impl.FeatureDocumentImpl implements net.opengis.gml.ObservationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ObservationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBSERVATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Observation");
    private static final org.apache.xmlbeans.QNameSet OBSERVATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Observation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectedObservation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectedObservationAtDistance"),
    });
    
    
    /**
     * Gets the "Observation" element
     */
    public net.opengis.gml.ObservationType getObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ObservationType target = null;
            target = (net.opengis.gml.ObservationType)get_store().find_element_user(OBSERVATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Observation" element
     */
    @Inject(optional=true) public void setObservation(net.opengis.gml.ObservationType observation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ObservationType target = null;
            target = (net.opengis.gml.ObservationType)get_store().find_element_user(OBSERVATION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.ObservationType)get_store().add_element_user(OBSERVATION$0);
            }
            target.set(observation);
        }
    }
    
    /**
     * Appends and returns a new empty "Observation" element
     */
    public net.opengis.gml.ObservationType addNewObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ObservationType target = null;
            target = (net.opengis.gml.ObservationType)get_store().add_element_user(OBSERVATION$0);
            return target;
        }
    }
}
