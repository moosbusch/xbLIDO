/*
 * An XML document type.
 * Localname: track
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TrackDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one track(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TrackDocumentImpl extends net.opengis.gml.impl.HistoryDocumentImpl implements net.opengis.gml.TrackDocument
{
    private static final long serialVersionUID = 1L;
    
    public TrackDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRACK$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "track");
    
    
    /**
     * Gets the "track" element
     */
    public net.opengis.gml.TrackType getTrack()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TrackType target = null;
            target = (net.opengis.gml.TrackType)get_store().find_element_user(TRACK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "track" element
     */
    @Inject(optional=true) public void setTrack(net.opengis.gml.TrackType track)
    {
        generatedSetterHelperImpl(track, TRACK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "track" element
     */
    public net.opengis.gml.TrackType addNewTrack()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TrackType target = null;
            target = (net.opengis.gml.TrackType)get_store().add_element_user(TRACK$0);
            return target;
        }
    }
}
