/*
 * An XML document type.
 * Localname: _Datum
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DatumDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _Datum(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DatumDocumentImpl extends net.opengis.gml.impl.DefinitionDocumentImpl implements net.opengis.gml.DatumDocument
{
    private static final long serialVersionUID = 1L;
    
    public DatumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Datum");
    private static final org.apache.xmlbeans.QNameSet DATUM$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "VerticalDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ImageDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Datum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "EngineeringDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TemporalDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeodeticDatum"),
    });
    
    
    /**
     * Gets the "_Datum" element
     */
    public net.opengis.gml.AbstractDatumType getDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractDatumType target = null;
            target = (net.opengis.gml.AbstractDatumType)get_store().find_element_user(DATUM$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_Datum" element
     */
    @Inject(optional=true) public void setDatum(net.opengis.gml.AbstractDatumType datum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractDatumType target = null;
            target = (net.opengis.gml.AbstractDatumType)get_store().find_element_user(DATUM$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractDatumType)get_store().add_element_user(DATUM$0);
            }
            target.set(datum);
        }
    }
    
    /**
     * Appends and returns a new empty "_Datum" element
     */
    public net.opengis.gml.AbstractDatumType addNewDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractDatumType target = null;
            target = (net.opengis.gml.AbstractDatumType)get_store().add_element_user(DATUM$0);
            return target;
        }
    }
}
