/*
 * An XML document type.
 * Localname: multiSurfaceProperty
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiSurfacePropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;

import com.google.inject.Inject;

/**
 * A document containing one multiSurfaceProperty(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiSurfacePropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.MultiSurfacePropertyDocument
{
    private static final long serialVersionUID = 1L;

    public MultiSurfacePropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName MULTISURFACEPROPERTY$0 =
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiSurfaceProperty");


    /**
     * Gets the "multiSurfaceProperty" element
     */
    public net.opengis.gml.MultiSurfacePropertyType getMultiSurfaceProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSurfacePropertyType target = null;
            target = (net.opengis.gml.MultiSurfacePropertyType)get_store().find_element_user(MULTISURFACEPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "multiSurfaceProperty" element
     */
    @Inject(optional=true) public void setMultiSurfaceProperty(net.opengis.gml.MultiSurfacePropertyType multiSurfaceProperty)
    {
        generatedSetterHelperImpl(multiSurfaceProperty, MULTISURFACEPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "multiSurfaceProperty" element
     */
    public net.opengis.gml.MultiSurfacePropertyType addNewMultiSurfaceProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSurfacePropertyType target = null;
            target = (net.opengis.gml.MultiSurfacePropertyType)get_store().add_element_user(MULTISURFACEPROPERTY$0);
            return target;
        }
    }
}
