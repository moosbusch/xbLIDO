/*
 * An XML document type.
 * Localname: baseCurve
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.BaseCurveDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one baseCurve(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class BaseCurveDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.BaseCurveDocument
{
    private static final long serialVersionUID = 1L;
    
    public BaseCurveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASECURVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "baseCurve");
    
    
    /**
     * Gets the "baseCurve" element
     */
    public net.opengis.gml.CurvePropertyType getBaseCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurvePropertyType target = null;
            target = (net.opengis.gml.CurvePropertyType)get_store().find_element_user(BASECURVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "baseCurve" element
     */
    @Inject(optional=true) public void setBaseCurve(net.opengis.gml.CurvePropertyType baseCurve)
    {
        generatedSetterHelperImpl(baseCurve, BASECURVE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "baseCurve" element
     */
    public net.opengis.gml.CurvePropertyType addNewBaseCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurvePropertyType target = null;
            target = (net.opengis.gml.CurvePropertyType)get_store().add_element_user(BASECURVE$0);
            return target;
        }
    }
}
