/*
 * An XML document type.
 * Localname: QuantityList
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.QuantityListDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;

import com.google.inject.Inject;

/**
 * A document containing one QuantityList(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class QuantityListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.QuantityListDocument
{
    private static final long serialVersionUID = 1L;

    public QuantityListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName QUANTITYLIST$0 =
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "QuantityList");


    /**
     * Gets the "QuantityList" element
     */
    public net.opengis.gml.MeasureOrNullListType getQuantityList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureOrNullListType target = null;
            target = (net.opengis.gml.MeasureOrNullListType)get_store().find_element_user(QUANTITYLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "QuantityList" element
     */
    @Inject(optional=true) public void setQuantityList(net.opengis.gml.MeasureOrNullListType quantityList)
    {
        generatedSetterHelperImpl(quantityList, QUANTITYLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "QuantityList" element
     */
    public net.opengis.gml.MeasureOrNullListType addNewQuantityList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureOrNullListType target = null;
            target = (net.opengis.gml.MeasureOrNullListType)get_store().add_element_user(QUANTITYLIST$0);
            return target;
        }
    }
}
