/*
 * An XML document type.
 * Localname: meridianName
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MeridianNameDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;;
/**
 * A document containing one meridianName(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MeridianNameDocumentImpl extends net.opengis.gml.impl.NameDocumentImpl implements net.opengis.gml.MeridianNameDocument
{
    private static final long serialVersionUID = 1L;

    public MeridianNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName MERIDIANNAME$0 =
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "meridianName");


    /**
     * Gets the "meridianName" element
     */
    public net.opengis.gml.CodeType getMeridianName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(MERIDIANNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "meridianName" element
     */
    @Inject(optional=true) public void setMeridianName(net.opengis.gml.CodeType meridianName)
    {
        generatedSetterHelperImpl(meridianName, MERIDIANNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "meridianName" element
     */
    public net.opengis.gml.CodeType addNewMeridianName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(MERIDIANNAME$0);
            return target;
        }
    }
}
