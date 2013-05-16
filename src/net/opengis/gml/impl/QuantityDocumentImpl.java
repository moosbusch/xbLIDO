/*
 * An XML document type.
 * Localname: Quantity
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.QuantityDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;

import com.google.inject.Inject;

/**
 * A document containing one Quantity(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class QuantityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.QuantityDocument
{
    private static final long serialVersionUID = 1L;

    public QuantityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName QUANTITY$0 =
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Quantity");


    /**
     * Gets the "Quantity" element
     */
    public net.opengis.gml.MeasureType getQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().find_element_user(QUANTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "Quantity" element
     */
    @Inject(optional=true) public void setQuantity(net.opengis.gml.MeasureType quantity)
    {
        generatedSetterHelperImpl(quantity, QUANTITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Quantity" element
     */
    public net.opengis.gml.MeasureType addNewQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().add_element_user(QUANTITY$0);
            return target;
        }
    }
}
