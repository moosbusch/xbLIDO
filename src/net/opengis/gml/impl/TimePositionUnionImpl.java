/*
 * XML Type:  TimePositionUnion
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimePositionUnion
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML TimePositionUnion(@http://www.opengis.net/gml).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.XmlDate
 *     org.apache.xmlbeans.XmlGYearMonth
 *     org.apache.xmlbeans.XmlGYear
 *     org.apache.xmlbeans.XmlTime
 *     org.apache.xmlbeans.XmlDateTime
 *     org.apache.xmlbeans.XmlAnyURI
 *     org.apache.xmlbeans.XmlDecimal
 */
public class TimePositionUnionImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements net.opengis.gml.TimePositionUnion, net.opengis.gml.CalDate, org.apache.xmlbeans.XmlTime, org.apache.xmlbeans.XmlDateTime, org.apache.xmlbeans.XmlAnyURI, org.apache.xmlbeans.XmlDecimal
{
    private static final long serialVersionUID = 1L;
    
    public TimePositionUnionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected TimePositionUnionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
