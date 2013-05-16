/*
 * An XML document type.
 * Localname: GeometricComplex
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GeometricComplexDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one GeometricComplex(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GeometricComplexDocumentImpl extends net.opengis.gml.impl.GeometryDocumentImpl implements net.opengis.gml.GeometricComplexDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeometricComplexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOMETRICCOMPLEX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeometricComplex");
    
    
    /**
     * Gets the "GeometricComplex" element
     */
    public net.opengis.gml.GeometricComplexType getGeometricComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeometricComplexType target = null;
            target = (net.opengis.gml.GeometricComplexType)get_store().find_element_user(GEOMETRICCOMPLEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GeometricComplex" element
     */
    @Inject(optional=true) public void setGeometricComplex(net.opengis.gml.GeometricComplexType geometricComplex)
    {
        generatedSetterHelperImpl(geometricComplex, GEOMETRICCOMPLEX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GeometricComplex" element
     */
    public net.opengis.gml.GeometricComplexType addNewGeometricComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeometricComplexType target = null;
            target = (net.opengis.gml.GeometricComplexType)get_store().add_element_user(GEOMETRICCOMPLEX$0);
            return target;
        }
    }
}
