/*
 * An XML document type.
 * Localname: MultiSurface
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiSurfaceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;

import com.google.inject.Inject;
/**
 * A document containing one MultiSurface(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiSurfaceDocumentImpl extends net.opengis.gml.impl.GeometricAggregateDocumentImpl implements net.opengis.gml.MultiSurfaceDocument
{
    private static final long serialVersionUID = 1L;

    public MultiSurfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName MULTISURFACE$0 =
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSurface");


    /**
     * Gets the "MultiSurface" element
     */
    public net.opengis.gml.MultiSurfaceType getMultiSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSurfaceType target = null;
            target = (net.opengis.gml.MultiSurfaceType)get_store().find_element_user(MULTISURFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "MultiSurface" element
     */
    @Inject(optional=true) public void setMultiSurface(net.opengis.gml.MultiSurfaceType multiSurface)
    {
        generatedSetterHelperImpl(multiSurface, MULTISURFACE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "MultiSurface" element
     */
    public net.opengis.gml.MultiSurfaceType addNewMultiSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSurfaceType target = null;
            target = (net.opengis.gml.MultiSurfaceType)get_store().add_element_user(MULTISURFACE$0);
            return target;
        }
    }
}
