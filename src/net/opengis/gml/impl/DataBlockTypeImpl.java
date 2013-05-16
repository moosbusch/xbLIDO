/*
 * XML Type:  DataBlockType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DataBlockType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML DataBlockType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class DataBlockTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DataBlockType
{
    private static final long serialVersionUID = 1L;
    
    public DataBlockTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RANGEPARAMETERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "rangeParameters");
    private static final javax.xml.namespace.QName TUPLELIST$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "tupleList");
    private static final javax.xml.namespace.QName DOUBLEORNULLTUPLELIST$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "doubleOrNullTupleList");
    
    
    /**
     * Gets the "rangeParameters" element
     */
    public net.opengis.gml.RangeParametersType getRangeParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RangeParametersType target = null;
            target = (net.opengis.gml.RangeParametersType)get_store().find_element_user(RANGEPARAMETERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rangeParameters" element
     */
    @Inject(optional=true) public void setRangeParameters(net.opengis.gml.RangeParametersType rangeParameters)
    {
        generatedSetterHelperImpl(rangeParameters, RANGEPARAMETERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "rangeParameters" element
     */
    public net.opengis.gml.RangeParametersType addNewRangeParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RangeParametersType target = null;
            target = (net.opengis.gml.RangeParametersType)get_store().add_element_user(RANGEPARAMETERS$0);
            return target;
        }
    }
    
    /**
     * Gets the "tupleList" element
     */
    public net.opengis.gml.CoordinatesType getTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinatesType target = null;
            target = (net.opengis.gml.CoordinatesType)get_store().find_element_user(TUPLELIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tupleList" element
     */
    public boolean isSetTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TUPLELIST$2) != 0;
        }
    }
    
    /**
     * Sets the "tupleList" element
     */
    @Inject(optional=true) public void setTupleList(net.opengis.gml.CoordinatesType tupleList)
    {
        generatedSetterHelperImpl(tupleList, TUPLELIST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "tupleList" element
     */
    public net.opengis.gml.CoordinatesType addNewTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinatesType target = null;
            target = (net.opengis.gml.CoordinatesType)get_store().add_element_user(TUPLELIST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "tupleList" element
     */
    public void unsetTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TUPLELIST$2, 0);
        }
    }
    
    /**
     * Gets the "doubleOrNullTupleList" element
     */
    public java.util.List getDoubleOrNullTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOUBLEORNULLTUPLELIST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "doubleOrNullTupleList" element
     */
    public net.opengis.gml.DoubleOrNullList xgetDoubleOrNullTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DoubleOrNullList target = null;
            target = (net.opengis.gml.DoubleOrNullList)get_store().find_element_user(DOUBLEORNULLTUPLELIST$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "doubleOrNullTupleList" element
     */
    public boolean isSetDoubleOrNullTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOUBLEORNULLTUPLELIST$4) != 0;
        }
    }
    
    /**
     * Sets the "doubleOrNullTupleList" element
     */
    @Inject(optional=true) public void setDoubleOrNullTupleList(java.util.List doubleOrNullTupleList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOUBLEORNULLTUPLELIST$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOUBLEORNULLTUPLELIST$4);
            }
            target.setListValue(doubleOrNullTupleList);
        }
    }
    
    /**
     * Sets (as xml) the "doubleOrNullTupleList" element
     */
    public void xsetDoubleOrNullTupleList(net.opengis.gml.DoubleOrNullList doubleOrNullTupleList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DoubleOrNullList target = null;
            target = (net.opengis.gml.DoubleOrNullList)get_store().find_element_user(DOUBLEORNULLTUPLELIST$4, 0);
            if (target == null)
            {
                target = (net.opengis.gml.DoubleOrNullList)get_store().add_element_user(DOUBLEORNULLTUPLELIST$4);
            }
            target.set(doubleOrNullTupleList);
        }
    }
    
    /**
     * Unsets the "doubleOrNullTupleList" element
     */
    public void unsetDoubleOrNullTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOUBLEORNULLTUPLELIST$4, 0);
        }
    }
}