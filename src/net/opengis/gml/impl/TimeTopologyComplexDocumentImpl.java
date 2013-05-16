/*
 * An XML document type.
 * Localname: TimeTopologyComplex
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimeTopologyComplexDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one TimeTopologyComplex(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TimeTopologyComplexDocumentImpl extends net.opengis.gml.impl.TimeComplexDocumentImpl implements net.opengis.gml.TimeTopologyComplexDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeTopologyComplexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMETOPOLOGYCOMPLEX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeTopologyComplex");
    
    
    /**
     * Gets the "TimeTopologyComplex" element
     */
    public net.opengis.gml.TimeTopologyComplexType getTimeTopologyComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeTopologyComplexType target = null;
            target = (net.opengis.gml.TimeTopologyComplexType)get_store().find_element_user(TIMETOPOLOGYCOMPLEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeTopologyComplex" element
     */
    @Inject(optional=true) public void setTimeTopologyComplex(net.opengis.gml.TimeTopologyComplexType timeTopologyComplex)
    {
        generatedSetterHelperImpl(timeTopologyComplex, TIMETOPOLOGYCOMPLEX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TimeTopologyComplex" element
     */
    public net.opengis.gml.TimeTopologyComplexType addNewTimeTopologyComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeTopologyComplexType target = null;
            target = (net.opengis.gml.TimeTopologyComplexType)get_store().add_element_user(TIMETOPOLOGYCOMPLEX$0);
            return target;
        }
    }
}
