/*
 * XML Type:  NullEnumeration
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.NullEnumeration
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * An XML NullEnumeration(@http://www.opengis.net/gml).
 *
 * This is a union type. Instances are of one of the following types:
 *     net.opengis.gml.NullEnumeration$Member
 *     net.opengis.gml.NullEnumeration$Member2
 */
public class NullEnumerationImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements net.opengis.gml.NullEnumeration, net.opengis.gml.NullEnumeration.Member, net.opengis.gml.NullEnumeration.Member2
{
    private static final long serialVersionUID = 1L;
    
    public NullEnumerationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected NullEnumerationImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of net.opengis.gml.NullEnumeration$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements net.opengis.gml.NullEnumeration.Member
    {
        private static final long serialVersionUID = 1L;
        
        public MemberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MemberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of net.opengis.gml.NullEnumeration$Member2.
     */
    public static class MemberImpl2 extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements net.opengis.gml.NullEnumeration.Member2
    {
        private static final long serialVersionUID = 1L;
        
        public MemberImpl2(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MemberImpl2(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
