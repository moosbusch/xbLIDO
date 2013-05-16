/*
 * An XML document type.
 * Localname: CompositeCurve
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CompositeCurveDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one CompositeCurve(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CompositeCurveDocumentImpl extends net.opengis.gml.impl.CurveDocumentImpl implements net.opengis.gml.CompositeCurveDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompositeCurveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPOSITECURVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeCurve");
    
    
    /**
     * Gets the "CompositeCurve" element
     */
    public net.opengis.gml.CompositeCurveType getCompositeCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompositeCurveType target = null;
            target = (net.opengis.gml.CompositeCurveType)get_store().find_element_user(COMPOSITECURVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CompositeCurve" element
     */
    @Inject(optional=true) public void setCompositeCurve(net.opengis.gml.CompositeCurveType compositeCurve)
    {
        generatedSetterHelperImpl(compositeCurve, COMPOSITECURVE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CompositeCurve" element
     */
    public net.opengis.gml.CompositeCurveType addNewCompositeCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompositeCurveType target = null;
            target = (net.opengis.gml.CompositeCurveType)get_store().add_element_user(COMPOSITECURVE$0);
            return target;
        }
    }
}
