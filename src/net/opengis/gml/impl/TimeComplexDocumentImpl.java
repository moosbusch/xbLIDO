/*
 * An XML document type.
 * Localname: _TimeComplex
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimeComplexDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _TimeComplex(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TimeComplexDocumentImpl extends net.opengis.gml.impl.TimeObjectDocumentImpl implements net.opengis.gml.TimeComplexDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeComplexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMECOMPLEX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeComplex");
    private static final org.apache.xmlbeans.QNameSet TIMECOMPLEX$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeTopologyComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeComplex"),
    });
    
    
    /**
     * Gets the "_TimeComplex" element
     */
    public net.opengis.gml.AbstractTimeComplexType getTimeComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeComplexType target = null;
            target = (net.opengis.gml.AbstractTimeComplexType)get_store().find_element_user(TIMECOMPLEX$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_TimeComplex" element
     */
    @Inject(optional=true) public void setTimeComplex(net.opengis.gml.AbstractTimeComplexType timeComplex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeComplexType target = null;
            target = (net.opengis.gml.AbstractTimeComplexType)get_store().find_element_user(TIMECOMPLEX$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractTimeComplexType)get_store().add_element_user(TIMECOMPLEX$0);
            }
            target.set(timeComplex);
        }
    }
    
    /**
     * Appends and returns a new empty "_TimeComplex" element
     */
    public net.opengis.gml.AbstractTimeComplexType addNewTimeComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeComplexType target = null;
            target = (net.opengis.gml.AbstractTimeComplexType)get_store().add_element_user(TIMECOMPLEX$0);
            return target;
        }
    }
}
