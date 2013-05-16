/*
 * XML Type:  stringOrNull
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.StringOrNull
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML stringOrNull(@http://www.opengis.net/gml).
 *
 * This is a union type. Instances are of one of the following types:
 *     net.opengis.gml.NullEnumeration$Member
 *     net.opengis.gml.NullEnumeration$Member2
 *     org.apache.xmlbeans.XmlString
 *     org.apache.xmlbeans.XmlAnyURI
 */
public class StringOrNullImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements net.opengis.gml.StringOrNull, net.opengis.gml.NullEnumeration, org.apache.xmlbeans.XmlString, org.apache.xmlbeans.XmlAnyURI
{
    private static final long serialVersionUID = 1L;
    
    public StringOrNullImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected StringOrNullImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
