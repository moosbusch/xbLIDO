/*
 * XML Type:  ExtentType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ExtentType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML ExtentType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class ExtentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ExtentType
{
    private static final long serialVersionUID = 1L;
    
    public ExtentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "description");
    private static final javax.xml.namespace.QName BOUNDINGBOX$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "boundingBox");
    private static final javax.xml.namespace.QName BOUNDINGPOLYGON$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "boundingPolygon");
    private static final javax.xml.namespace.QName VERTICALEXTENT$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "verticalExtent");
    private static final javax.xml.namespace.QName TEMPORALEXTENT$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "temporalExtent");
    
    
    /**
     * Gets the "description" element
     */
    public net.opengis.gml.StringOrRefType getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    @Inject(optional=true) public void setDescription(net.opengis.gml.StringOrRefType description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public net.opengis.gml.StringOrRefType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$0, 0);
        }
    }
    
    /**
     * Gets a List of "boundingBox" elements
     */
    public java.util.List<net.opengis.gml.EnvelopeType> getBoundingBoxList()
    {
        final class BoundingBoxList extends java.util.AbstractList<net.opengis.gml.EnvelopeType>
        {
            @Override
            public net.opengis.gml.EnvelopeType get(int i)
                { return ExtentTypeImpl.this.getBoundingBoxArray(i); }
            
            @Override
            public net.opengis.gml.EnvelopeType set(int i, net.opengis.gml.EnvelopeType o)
            {
                net.opengis.gml.EnvelopeType old = ExtentTypeImpl.this.getBoundingBoxArray(i);
                ExtentTypeImpl.this.setBoundingBoxArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.EnvelopeType o)
                { ExtentTypeImpl.this.insertNewBoundingBox(i).set(o); }
            
            @Override
            public net.opengis.gml.EnvelopeType remove(int i)
            {
                net.opengis.gml.EnvelopeType old = ExtentTypeImpl.this.getBoundingBoxArray(i);
                ExtentTypeImpl.this.removeBoundingBox(i);
                return old;
            }
            
            @Override
            public int size()
                { return ExtentTypeImpl.this.sizeOfBoundingBoxArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BoundingBoxList();
        }
    }
    
    /**
     * Gets array of all "boundingBox" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.EnvelopeType[] getBoundingBoxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.EnvelopeType> targetList = new java.util.ArrayList<net.opengis.gml.EnvelopeType>();
            get_store().find_all_element_users(BOUNDINGBOX$2, targetList);
            net.opengis.gml.EnvelopeType[] result = new net.opengis.gml.EnvelopeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "boundingBox" element
     */
    public net.opengis.gml.EnvelopeType getBoundingBoxArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().find_element_user(BOUNDINGBOX$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "boundingBox" element
     */
    public int sizeOfBoundingBoxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOUNDINGBOX$2);
        }
    }
    
    /**
     * Sets array of all "boundingBox" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setBoundingBoxArray(net.opengis.gml.EnvelopeType[] boundingBoxArray)
    {
        check_orphaned();
        arraySetterHelper(boundingBoxArray, BOUNDINGBOX$2);
    }
    
    /**
     * Sets ith "boundingBox" element
     */
    @Inject(optional=true) public void setBoundingBoxArray(int i, net.opengis.gml.EnvelopeType boundingBox)
    {
        generatedSetterHelperImpl(boundingBox, BOUNDINGBOX$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "boundingBox" element
     */
    public net.opengis.gml.EnvelopeType insertNewBoundingBox(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().insert_element_user(BOUNDINGBOX$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "boundingBox" element
     */
    public net.opengis.gml.EnvelopeType addNewBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().add_element_user(BOUNDINGBOX$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "boundingBox" element
     */
    public void removeBoundingBox(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOUNDINGBOX$2, i);
        }
    }
    
    /**
     * Gets a List of "boundingPolygon" elements
     */
    public java.util.List<net.opengis.gml.PolygonType> getBoundingPolygonList()
    {
        final class BoundingPolygonList extends java.util.AbstractList<net.opengis.gml.PolygonType>
        {
            @Override
            public net.opengis.gml.PolygonType get(int i)
                { return ExtentTypeImpl.this.getBoundingPolygonArray(i); }
            
            @Override
            public net.opengis.gml.PolygonType set(int i, net.opengis.gml.PolygonType o)
            {
                net.opengis.gml.PolygonType old = ExtentTypeImpl.this.getBoundingPolygonArray(i);
                ExtentTypeImpl.this.setBoundingPolygonArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.PolygonType o)
                { ExtentTypeImpl.this.insertNewBoundingPolygon(i).set(o); }
            
            @Override
            public net.opengis.gml.PolygonType remove(int i)
            {
                net.opengis.gml.PolygonType old = ExtentTypeImpl.this.getBoundingPolygonArray(i);
                ExtentTypeImpl.this.removeBoundingPolygon(i);
                return old;
            }
            
            @Override
            public int size()
                { return ExtentTypeImpl.this.sizeOfBoundingPolygonArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BoundingPolygonList();
        }
    }
    
    /**
     * Gets array of all "boundingPolygon" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.PolygonType[] getBoundingPolygonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.PolygonType> targetList = new java.util.ArrayList<net.opengis.gml.PolygonType>();
            get_store().find_all_element_users(BOUNDINGPOLYGON$4, targetList);
            net.opengis.gml.PolygonType[] result = new net.opengis.gml.PolygonType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "boundingPolygon" element
     */
    public net.opengis.gml.PolygonType getBoundingPolygonArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonType target = null;
            target = (net.opengis.gml.PolygonType)get_store().find_element_user(BOUNDINGPOLYGON$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "boundingPolygon" element
     */
    public int sizeOfBoundingPolygonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOUNDINGPOLYGON$4);
        }
    }
    
    /**
     * Sets array of all "boundingPolygon" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setBoundingPolygonArray(net.opengis.gml.PolygonType[] boundingPolygonArray)
    {
        check_orphaned();
        arraySetterHelper(boundingPolygonArray, BOUNDINGPOLYGON$4);
    }
    
    /**
     * Sets ith "boundingPolygon" element
     */
    @Inject(optional=true) public void setBoundingPolygonArray(int i, net.opengis.gml.PolygonType boundingPolygon)
    {
        generatedSetterHelperImpl(boundingPolygon, BOUNDINGPOLYGON$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "boundingPolygon" element
     */
    public net.opengis.gml.PolygonType insertNewBoundingPolygon(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonType target = null;
            target = (net.opengis.gml.PolygonType)get_store().insert_element_user(BOUNDINGPOLYGON$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "boundingPolygon" element
     */
    public net.opengis.gml.PolygonType addNewBoundingPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonType target = null;
            target = (net.opengis.gml.PolygonType)get_store().add_element_user(BOUNDINGPOLYGON$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "boundingPolygon" element
     */
    public void removeBoundingPolygon(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOUNDINGPOLYGON$4, i);
        }
    }
    
    /**
     * Gets a List of "verticalExtent" elements
     */
    public java.util.List<net.opengis.gml.EnvelopeType> getVerticalExtentList()
    {
        final class VerticalExtentList extends java.util.AbstractList<net.opengis.gml.EnvelopeType>
        {
            @Override
            public net.opengis.gml.EnvelopeType get(int i)
                { return ExtentTypeImpl.this.getVerticalExtentArray(i); }
            
            @Override
            public net.opengis.gml.EnvelopeType set(int i, net.opengis.gml.EnvelopeType o)
            {
                net.opengis.gml.EnvelopeType old = ExtentTypeImpl.this.getVerticalExtentArray(i);
                ExtentTypeImpl.this.setVerticalExtentArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.EnvelopeType o)
                { ExtentTypeImpl.this.insertNewVerticalExtent(i).set(o); }
            
            @Override
            public net.opengis.gml.EnvelopeType remove(int i)
            {
                net.opengis.gml.EnvelopeType old = ExtentTypeImpl.this.getVerticalExtentArray(i);
                ExtentTypeImpl.this.removeVerticalExtent(i);
                return old;
            }
            
            @Override
            public int size()
                { return ExtentTypeImpl.this.sizeOfVerticalExtentArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new VerticalExtentList();
        }
    }
    
    /**
     * Gets array of all "verticalExtent" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.EnvelopeType[] getVerticalExtentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.EnvelopeType> targetList = new java.util.ArrayList<net.opengis.gml.EnvelopeType>();
            get_store().find_all_element_users(VERTICALEXTENT$6, targetList);
            net.opengis.gml.EnvelopeType[] result = new net.opengis.gml.EnvelopeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "verticalExtent" element
     */
    public net.opengis.gml.EnvelopeType getVerticalExtentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().find_element_user(VERTICALEXTENT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "verticalExtent" element
     */
    public int sizeOfVerticalExtentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERTICALEXTENT$6);
        }
    }
    
    /**
     * Sets array of all "verticalExtent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setVerticalExtentArray(net.opengis.gml.EnvelopeType[] verticalExtentArray)
    {
        check_orphaned();
        arraySetterHelper(verticalExtentArray, VERTICALEXTENT$6);
    }
    
    /**
     * Sets ith "verticalExtent" element
     */
    @Inject(optional=true) public void setVerticalExtentArray(int i, net.opengis.gml.EnvelopeType verticalExtent)
    {
        generatedSetterHelperImpl(verticalExtent, VERTICALEXTENT$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "verticalExtent" element
     */
    public net.opengis.gml.EnvelopeType insertNewVerticalExtent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().insert_element_user(VERTICALEXTENT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "verticalExtent" element
     */
    public net.opengis.gml.EnvelopeType addNewVerticalExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().add_element_user(VERTICALEXTENT$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "verticalExtent" element
     */
    public void removeVerticalExtent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERTICALEXTENT$6, i);
        }
    }
    
    /**
     * Gets a List of "temporalExtent" elements
     */
    public java.util.List<net.opengis.gml.TimePeriodType> getTemporalExtentList()
    {
        final class TemporalExtentList extends java.util.AbstractList<net.opengis.gml.TimePeriodType>
        {
            @Override
            public net.opengis.gml.TimePeriodType get(int i)
                { return ExtentTypeImpl.this.getTemporalExtentArray(i); }
            
            @Override
            public net.opengis.gml.TimePeriodType set(int i, net.opengis.gml.TimePeriodType o)
            {
                net.opengis.gml.TimePeriodType old = ExtentTypeImpl.this.getTemporalExtentArray(i);
                ExtentTypeImpl.this.setTemporalExtentArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.TimePeriodType o)
                { ExtentTypeImpl.this.insertNewTemporalExtent(i).set(o); }
            
            @Override
            public net.opengis.gml.TimePeriodType remove(int i)
            {
                net.opengis.gml.TimePeriodType old = ExtentTypeImpl.this.getTemporalExtentArray(i);
                ExtentTypeImpl.this.removeTemporalExtent(i);
                return old;
            }
            
            @Override
            public int size()
                { return ExtentTypeImpl.this.sizeOfTemporalExtentArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TemporalExtentList();
        }
    }
    
    /**
     * Gets array of all "temporalExtent" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.TimePeriodType[] getTemporalExtentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.TimePeriodType> targetList = new java.util.ArrayList<net.opengis.gml.TimePeriodType>();
            get_store().find_all_element_users(TEMPORALEXTENT$8, targetList);
            net.opengis.gml.TimePeriodType[] result = new net.opengis.gml.TimePeriodType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "temporalExtent" element
     */
    public net.opengis.gml.TimePeriodType getTemporalExtentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePeriodType target = null;
            target = (net.opengis.gml.TimePeriodType)get_store().find_element_user(TEMPORALEXTENT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "temporalExtent" element
     */
    public int sizeOfTemporalExtentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEMPORALEXTENT$8);
        }
    }
    
    /**
     * Sets array of all "temporalExtent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setTemporalExtentArray(net.opengis.gml.TimePeriodType[] temporalExtentArray)
    {
        check_orphaned();
        arraySetterHelper(temporalExtentArray, TEMPORALEXTENT$8);
    }
    
    /**
     * Sets ith "temporalExtent" element
     */
    @Inject(optional=true) public void setTemporalExtentArray(int i, net.opengis.gml.TimePeriodType temporalExtent)
    {
        generatedSetterHelperImpl(temporalExtent, TEMPORALEXTENT$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "temporalExtent" element
     */
    public net.opengis.gml.TimePeriodType insertNewTemporalExtent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePeriodType target = null;
            target = (net.opengis.gml.TimePeriodType)get_store().insert_element_user(TEMPORALEXTENT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "temporalExtent" element
     */
    public net.opengis.gml.TimePeriodType addNewTemporalExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePeriodType target = null;
            target = (net.opengis.gml.TimePeriodType)get_store().add_element_user(TEMPORALEXTENT$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "temporalExtent" element
     */
    public void removeTemporalExtent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEMPORALEXTENT$8, i);
        }
    }
}
