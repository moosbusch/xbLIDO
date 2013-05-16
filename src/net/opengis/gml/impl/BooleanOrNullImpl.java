/*
 * XML Type:  booleanOrNull
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.BooleanOrNull
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML booleanOrNull(@http://www.opengis.net/gml).
 *
 * This is a union type. Instances are of one of the following types:
 *     net.opengis.gml.NullEnumeration$Member
 *     net.opengis.gml.NullEnumeration$Member2
 *     org.apache.xmlbeans.XmlBoolean
 *     org.apache.xmlbeans.XmlAnyURI
 */
public class BooleanOrNullImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements net.opengis.gml.BooleanOrNull, net.opengis.gml.NullEnumeration, org.apache.xmlbeans.XmlBoolean, org.apache.xmlbeans.XmlAnyURI
{
    private static final long serialVersionUID = 1L;
    
    public BooleanOrNullImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected BooleanOrNullImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
