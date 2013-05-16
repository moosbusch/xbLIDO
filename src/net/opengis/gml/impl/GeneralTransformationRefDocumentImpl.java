/*
 * An XML document type.
 * Localname: generalTransformationRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GeneralTransformationRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one generalTransformationRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GeneralTransformationRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.GeneralTransformationRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeneralTransformationRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERALTRANSFORMATIONREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "generalTransformationRef");
    
    
    /**
     * Gets the "generalTransformationRef" element
     */
    public net.opengis.gml.GeneralTransformationRefType getGeneralTransformationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeneralTransformationRefType target = null;
            target = (net.opengis.gml.GeneralTransformationRefType)get_store().find_element_user(GENERALTRANSFORMATIONREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "generalTransformationRef" element
     */
    @Inject(optional=true) public void setGeneralTransformationRef(net.opengis.gml.GeneralTransformationRefType generalTransformationRef)
    {
        generatedSetterHelperImpl(generalTransformationRef, GENERALTRANSFORMATIONREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "generalTransformationRef" element
     */
    public net.opengis.gml.GeneralTransformationRefType addNewGeneralTransformationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeneralTransformationRefType target = null;
            target = (net.opengis.gml.GeneralTransformationRefType)get_store().add_element_user(GENERALTRANSFORMATIONREF$0);
            return target;
        }
    }
}
