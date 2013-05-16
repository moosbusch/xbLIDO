/*
 * XML Type:  CalDate
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CalDate
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML CalDate(@http://www.opengis.net/gml).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.XmlDate
 *     org.apache.xmlbeans.XmlGYearMonth
 *     org.apache.xmlbeans.XmlGYear
 */
public class CalDateImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements net.opengis.gml.CalDate, org.apache.xmlbeans.XmlDate, org.apache.xmlbeans.XmlGYearMonth, org.apache.xmlbeans.XmlGYear
{
    private static final long serialVersionUID = 1L;
    
    public CalDateImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected CalDateImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
