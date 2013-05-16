/*
 * An XML document type.
 * Localname: QuantityExtent
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.QuantityExtentDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;

import com.google.inject.Inject;

/**
 * A document containing one QuantityExtent(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class QuantityExtentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.QuantityExtentDocument
{
    private static final long serialVersionUID = 1L;

    public QuantityExtentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName QUANTITYEXTENT$0 =
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "QuantityExtent");


    /**
     * Gets the "QuantityExtent" element
     */
    public net.opengis.gml.QuantityExtentType getQuantityExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.QuantityExtentType target = null;
            target = (net.opengis.gml.QuantityExtentType)get_store().find_element_user(QUANTITYEXTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "QuantityExtent" element
     */
    @Inject(optional=true) public void setQuantityExtent(net.opengis.gml.QuantityExtentType quantityExtent)
    {
        generatedSetterHelperImpl(quantityExtent, QUANTITYEXTENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "QuantityExtent" element
     */
    public net.opengis.gml.QuantityExtentType addNewQuantityExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.QuantityExtentType target = null;
            target = (net.opengis.gml.QuantityExtentType)get_store().add_element_user(QUANTITYEXTENT$0);
            return target;
        }
    }
}
