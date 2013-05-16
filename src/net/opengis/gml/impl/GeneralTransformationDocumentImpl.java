/*
 * An XML document type.
 * Localname: _GeneralTransformation
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GeneralTransformationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _GeneralTransformation(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GeneralTransformationDocumentImpl extends net.opengis.gml.impl.OperationDocumentImpl implements net.opengis.gml.GeneralTransformationDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeneralTransformationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERALTRANSFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralTransformation");
    private static final org.apache.xmlbeans.QNameSet GENERALTRANSFORMATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralTransformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Transformation"),
    });
    
    
    /**
     * Gets the "_GeneralTransformation" element
     */
    public net.opengis.gml.AbstractGeneralTransformationType getGeneralTransformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralTransformationType target = null;
            target = (net.opengis.gml.AbstractGeneralTransformationType)get_store().find_element_user(GENERALTRANSFORMATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_GeneralTransformation" element
     */
    @Inject(optional=true) public void setGeneralTransformation(net.opengis.gml.AbstractGeneralTransformationType generalTransformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralTransformationType target = null;
            target = (net.opengis.gml.AbstractGeneralTransformationType)get_store().find_element_user(GENERALTRANSFORMATION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractGeneralTransformationType)get_store().add_element_user(GENERALTRANSFORMATION$0);
            }
            target.set(generalTransformation);
        }
    }
    
    /**
     * Appends and returns a new empty "_GeneralTransformation" element
     */
    public net.opengis.gml.AbstractGeneralTransformationType addNewGeneralTransformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralTransformationType target = null;
            target = (net.opengis.gml.AbstractGeneralTransformationType)get_store().add_element_user(GENERALTRANSFORMATION$0);
            return target;
        }
    }
}
