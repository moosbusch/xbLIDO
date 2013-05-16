/*
 * XML Type:  GeodesicStringType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GeodesicStringType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML GeodesicStringType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class GeodesicStringTypeImpl extends net.opengis.gml.impl.AbstractCurveSegmentTypeImpl implements net.opengis.gml.GeodesicStringType
{
    private static final long serialVersionUID = 1L;
    
    public GeodesicStringTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSLIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "posList");
    private static final javax.xml.namespace.QName POS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "pos");
    private static final javax.xml.namespace.QName POINTPROPERTY$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "pointProperty");
    private static final javax.xml.namespace.QName INTERPOLATION$6 = 
        new javax.xml.namespace.QName("", "interpolation");
    
    
    /**
     * Gets the "posList" element
     */
    public net.opengis.gml.DirectPositionListType getPosList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionListType target = null;
            target = (net.opengis.gml.DirectPositionListType)get_store().find_element_user(POSLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "posList" element
     */
    public boolean isSetPosList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "posList" element
     */
    @Inject(optional=true) public void setPosList(net.opengis.gml.DirectPositionListType posList)
    {
        generatedSetterHelperImpl(posList, POSLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "posList" element
     */
    public net.opengis.gml.DirectPositionListType addNewPosList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionListType target = null;
            target = (net.opengis.gml.DirectPositionListType)get_store().add_element_user(POSLIST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "posList" element
     */
    public void unsetPosList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSLIST$0, 0);
        }
    }
    
    /**
     * Gets a List of "pos" elements
     */
    public java.util.List<net.opengis.gml.DirectPositionType> getPositionList()
    {
        final class PosList extends java.util.AbstractList<net.opengis.gml.DirectPositionType>
        {
            @Override
            public net.opengis.gml.DirectPositionType get(int i)
                { return GeodesicStringTypeImpl.this.getPosArray(i); }
            
            @Override
            public net.opengis.gml.DirectPositionType set(int i, net.opengis.gml.DirectPositionType o)
            {
                net.opengis.gml.DirectPositionType old = GeodesicStringTypeImpl.this.getPosArray(i);
                GeodesicStringTypeImpl.this.setPosArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.DirectPositionType o)
                { GeodesicStringTypeImpl.this.insertNewPos(i).set(o); }
            
            @Override
            public net.opengis.gml.DirectPositionType remove(int i)
            {
                net.opengis.gml.DirectPositionType old = GeodesicStringTypeImpl.this.getPosArray(i);
                GeodesicStringTypeImpl.this.removePos(i);
                return old;
            }
            
            @Override
            public int size()
                { return GeodesicStringTypeImpl.this.sizeOfPosArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PosList();
        }
    }
    
    /**
     * Gets array of all "pos" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.DirectPositionType[] getPosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.DirectPositionType> targetList = new java.util.ArrayList<net.opengis.gml.DirectPositionType>();
            get_store().find_all_element_users(POS$2, targetList);
            net.opengis.gml.DirectPositionType[] result = new net.opengis.gml.DirectPositionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pos" element
     */
    public net.opengis.gml.DirectPositionType getPosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionType target = null;
            target = (net.opengis.gml.DirectPositionType)get_store().find_element_user(POS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pos" element
     */
    public int sizeOfPosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POS$2);
        }
    }
    
    /**
     * Sets array of all "pos" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setPosArray(net.opengis.gml.DirectPositionType[] posArray)
    {
        check_orphaned();
        arraySetterHelper(posArray, POS$2);
    }
    
    /**
     * Sets ith "pos" element
     */
    @Inject(optional=true) public void setPosArray(int i, net.opengis.gml.DirectPositionType pos)
    {
        generatedSetterHelperImpl(pos, POS$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pos" element
     */
    public net.opengis.gml.DirectPositionType insertNewPos(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionType target = null;
            target = (net.opengis.gml.DirectPositionType)get_store().insert_element_user(POS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pos" element
     */
    public net.opengis.gml.DirectPositionType addNewPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionType target = null;
            target = (net.opengis.gml.DirectPositionType)get_store().add_element_user(POS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "pos" element
     */
    public void removePos(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POS$2, i);
        }
    }
    
    /**
     * Gets a List of "pointProperty" elements
     */
    public java.util.List<net.opengis.gml.PointPropertyType> getPointPropertyList()
    {
        final class PointPropertyList extends java.util.AbstractList<net.opengis.gml.PointPropertyType>
        {
            @Override
            public net.opengis.gml.PointPropertyType get(int i)
                { return GeodesicStringTypeImpl.this.getPointPropertyArray(i); }
            
            @Override
            public net.opengis.gml.PointPropertyType set(int i, net.opengis.gml.PointPropertyType o)
            {
                net.opengis.gml.PointPropertyType old = GeodesicStringTypeImpl.this.getPointPropertyArray(i);
                GeodesicStringTypeImpl.this.setPointPropertyArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.PointPropertyType o)
                { GeodesicStringTypeImpl.this.insertNewPointProperty(i).set(o); }
            
            @Override
            public net.opengis.gml.PointPropertyType remove(int i)
            {
                net.opengis.gml.PointPropertyType old = GeodesicStringTypeImpl.this.getPointPropertyArray(i);
                GeodesicStringTypeImpl.this.removePointProperty(i);
                return old;
            }
            
            @Override
            public int size()
                { return GeodesicStringTypeImpl.this.sizeOfPointPropertyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PointPropertyList();
        }
    }
    
    /**
     * Gets array of all "pointProperty" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.PointPropertyType[] getPointPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.PointPropertyType> targetList = new java.util.ArrayList<net.opengis.gml.PointPropertyType>();
            get_store().find_all_element_users(POINTPROPERTY$4, targetList);
            net.opengis.gml.PointPropertyType[] result = new net.opengis.gml.PointPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pointProperty" element
     */
    public net.opengis.gml.PointPropertyType getPointPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointPropertyType target = null;
            target = (net.opengis.gml.PointPropertyType)get_store().find_element_user(POINTPROPERTY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pointProperty" element
     */
    public int sizeOfPointPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POINTPROPERTY$4);
        }
    }
    
    /**
     * Sets array of all "pointProperty" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setPointPropertyArray(net.opengis.gml.PointPropertyType[] pointPropertyArray)
    {
        check_orphaned();
        arraySetterHelper(pointPropertyArray, POINTPROPERTY$4);
    }
    
    /**
     * Sets ith "pointProperty" element
     */
    @Inject(optional=true) public void setPointPropertyArray(int i, net.opengis.gml.PointPropertyType pointProperty)
    {
        generatedSetterHelperImpl(pointProperty, POINTPROPERTY$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pointProperty" element
     */
    public net.opengis.gml.PointPropertyType insertNewPointProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointPropertyType target = null;
            target = (net.opengis.gml.PointPropertyType)get_store().insert_element_user(POINTPROPERTY$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pointProperty" element
     */
    public net.opengis.gml.PointPropertyType addNewPointProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointPropertyType target = null;
            target = (net.opengis.gml.PointPropertyType)get_store().add_element_user(POINTPROPERTY$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "pointProperty" element
     */
    public void removePointProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POINTPROPERTY$4, i);
        }
    }
    
    /**
     * Gets the "interpolation" attribute
     */
    public net.opengis.gml.CurveInterpolationType.Enum getInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERPOLATION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INTERPOLATION$6);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.CurveInterpolationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "interpolation" attribute
     */
    public net.opengis.gml.CurveInterpolationType xgetInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurveInterpolationType target = null;
            target = (net.opengis.gml.CurveInterpolationType)get_store().find_attribute_user(INTERPOLATION$6);
            if (target == null)
            {
                target = (net.opengis.gml.CurveInterpolationType)get_default_attribute_value(INTERPOLATION$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "interpolation" attribute
     */
    public boolean isSetInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INTERPOLATION$6) != null;
        }
    }
    
    /**
     * Sets the "interpolation" attribute
     */
    @Inject(optional=true) public void setInterpolation(net.opengis.gml.CurveInterpolationType.Enum interpolation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERPOLATION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERPOLATION$6);
            }
            target.setEnumValue(interpolation);
        }
    }
    
    /**
     * Sets (as xml) the "interpolation" attribute
     */
    public void xsetInterpolation(net.opengis.gml.CurveInterpolationType interpolation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurveInterpolationType target = null;
            target = (net.opengis.gml.CurveInterpolationType)get_store().find_attribute_user(INTERPOLATION$6);
            if (target == null)
            {
                target = (net.opengis.gml.CurveInterpolationType)get_store().add_attribute_user(INTERPOLATION$6);
            }
            target.set(interpolation);
        }
    }
    
    /**
     * Unsets the "interpolation" attribute
     */
    public void unsetInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INTERPOLATION$6);
        }
    }
}
