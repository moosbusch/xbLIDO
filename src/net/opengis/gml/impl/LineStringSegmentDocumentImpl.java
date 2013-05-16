/*
 * An XML document type.
 * Localname: LineStringSegment
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.LineStringSegmentDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one LineStringSegment(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class LineStringSegmentDocumentImpl extends net.opengis.gml.impl.CurveSegmentDocumentImpl implements net.opengis.gml.LineStringSegmentDocument
{
    private static final long serialVersionUID = 1L;
    
    public LineStringSegmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINESTRINGSEGMENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LineStringSegment");
    
    
    /**
     * Gets the "LineStringSegment" element
     */
    public net.opengis.gml.LineStringSegmentType getLineStringSegment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringSegmentType target = null;
            target = (net.opengis.gml.LineStringSegmentType)get_store().find_element_user(LINESTRINGSEGMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LineStringSegment" element
     */
    @Inject(optional=true) public void setLineStringSegment(net.opengis.gml.LineStringSegmentType lineStringSegment)
    {
        generatedSetterHelperImpl(lineStringSegment, LINESTRINGSEGMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LineStringSegment" element
     */
    public net.opengis.gml.LineStringSegmentType addNewLineStringSegment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringSegmentType target = null;
            target = (net.opengis.gml.LineStringSegmentType)get_store().add_element_user(LINESTRINGSEGMENT$0);
            return target;
        }
    }
}
