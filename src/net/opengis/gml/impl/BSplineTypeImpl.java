/* 
 * Copyright 2013 Gunnar Kappei.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.opengis.gml.impl; 
/**
 * An XML BSplineType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class BSplineTypeImpl extends net.opengis.gml.impl.AbstractCurveSegmentTypeImpl implements net.opengis.gml.BSplineType
{
    private static final long serialVersionUID = 1L;
    
    public BSplineTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "pos");
    private static final javax.xml.namespace.QName POINTPROPERTY$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "pointProperty");
    private static final javax.xml.namespace.QName POINTREP$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "pointRep");
    private static final javax.xml.namespace.QName POSLIST$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "posList");
    private static final javax.xml.namespace.QName COORDINATES$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "coordinates");
    private static final javax.xml.namespace.QName DEGREE$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "degree");
    private static final javax.xml.namespace.QName KNOT$12 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "knot");
    private static final javax.xml.namespace.QName INTERPOLATION$14 = 
        new javax.xml.namespace.QName("", "interpolation");
    private static final javax.xml.namespace.QName ISPOLYNOMIAL$16 = 
        new javax.xml.namespace.QName("", "isPolynomial");
    private static final javax.xml.namespace.QName KNOTTYPE$18 = 
        new javax.xml.namespace.QName("", "knotType");
    
    
    /**
     * Gets a List of "pos" elements
     */
    public java.util.List<net.opengis.gml.DirectPositionType> getPositionList()
    {
        final class PosList extends java.util.AbstractList<net.opengis.gml.DirectPositionType>
        {
            @Override
            public net.opengis.gml.DirectPositionType get(int i)
                { return BSplineTypeImpl.this.getPosArray(i); }
            
            @Override
            public net.opengis.gml.DirectPositionType set(int i, net.opengis.gml.DirectPositionType o)
            {
                net.opengis.gml.DirectPositionType old = BSplineTypeImpl.this.getPosArray(i);
                BSplineTypeImpl.this.setPosArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.DirectPositionType o)
                { BSplineTypeImpl.this.insertNewPos(i).set(o); }
            
            @Override
            public net.opengis.gml.DirectPositionType remove(int i)
            {
                net.opengis.gml.DirectPositionType old = BSplineTypeImpl.this.getPosArray(i);
                BSplineTypeImpl.this.removePos(i);
                return old;
            }
            
            @Override
            public int size()
                { return BSplineTypeImpl.this.sizeOfPosArray(); }
            
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
            get_store().find_all_element_users(POS$0, targetList);
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
            target = (net.opengis.gml.DirectPositionType)get_store().find_element_user(POS$0, i);
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
            return get_store().count_elements(POS$0);
        }
    }
    
    /**
     * Sets array of all "pos" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setPosArray(net.opengis.gml.DirectPositionType[] posArray)
    {
        check_orphaned();
        arraySetterHelper(posArray, POS$0);
    }
    
    /**
     * Sets ith "pos" element
     */
     public void setPosArray(int i, net.opengis.gml.DirectPositionType pos)
    {
        generatedSetterHelperImpl(pos, POS$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
            target = (net.opengis.gml.DirectPositionType)get_store().insert_element_user(POS$0, i);
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
            target = (net.opengis.gml.DirectPositionType)get_store().add_element_user(POS$0);
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
            get_store().remove_element(POS$0, i);
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
                { return BSplineTypeImpl.this.getPointPropertyArray(i); }
            
            @Override
            public net.opengis.gml.PointPropertyType set(int i, net.opengis.gml.PointPropertyType o)
            {
                net.opengis.gml.PointPropertyType old = BSplineTypeImpl.this.getPointPropertyArray(i);
                BSplineTypeImpl.this.setPointPropertyArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.PointPropertyType o)
                { BSplineTypeImpl.this.insertNewPointProperty(i).set(o); }
            
            @Override
            public net.opengis.gml.PointPropertyType remove(int i)
            {
                net.opengis.gml.PointPropertyType old = BSplineTypeImpl.this.getPointPropertyArray(i);
                BSplineTypeImpl.this.removePointProperty(i);
                return old;
            }
            
            @Override
            public int size()
                { return BSplineTypeImpl.this.sizeOfPointPropertyArray(); }
            
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
            get_store().find_all_element_users(POINTPROPERTY$2, targetList);
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
            target = (net.opengis.gml.PointPropertyType)get_store().find_element_user(POINTPROPERTY$2, i);
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
            return get_store().count_elements(POINTPROPERTY$2);
        }
    }
    
    /**
     * Sets array of all "pointProperty" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setPointPropertyArray(net.opengis.gml.PointPropertyType[] pointPropertyArray)
    {
        check_orphaned();
        arraySetterHelper(pointPropertyArray, POINTPROPERTY$2);
    }
    
    /**
     * Sets ith "pointProperty" element
     */
     public void setPointPropertyArray(int i, net.opengis.gml.PointPropertyType pointProperty)
    {
        generatedSetterHelperImpl(pointProperty, POINTPROPERTY$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
            target = (net.opengis.gml.PointPropertyType)get_store().insert_element_user(POINTPROPERTY$2, i);
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
            target = (net.opengis.gml.PointPropertyType)get_store().add_element_user(POINTPROPERTY$2);
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
            get_store().remove_element(POINTPROPERTY$2, i);
        }
    }
    
    /**
     * Gets a List of "pointRep" elements
     */
    public java.util.List<net.opengis.gml.PointPropertyType> getPointRepList()
    {
        final class PointRepList extends java.util.AbstractList<net.opengis.gml.PointPropertyType>
        {
            @Override
            public net.opengis.gml.PointPropertyType get(int i)
                { return BSplineTypeImpl.this.getPointRepArray(i); }
            
            @Override
            public net.opengis.gml.PointPropertyType set(int i, net.opengis.gml.PointPropertyType o)
            {
                net.opengis.gml.PointPropertyType old = BSplineTypeImpl.this.getPointRepArray(i);
                BSplineTypeImpl.this.setPointRepArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.PointPropertyType o)
                { BSplineTypeImpl.this.insertNewPointRep(i).set(o); }
            
            @Override
            public net.opengis.gml.PointPropertyType remove(int i)
            {
                net.opengis.gml.PointPropertyType old = BSplineTypeImpl.this.getPointRepArray(i);
                BSplineTypeImpl.this.removePointRep(i);
                return old;
            }
            
            @Override
            public int size()
                { return BSplineTypeImpl.this.sizeOfPointRepArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PointRepList();
        }
    }
    
    /**
     * Gets array of all "pointRep" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.PointPropertyType[] getPointRepArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.PointPropertyType> targetList = new java.util.ArrayList<net.opengis.gml.PointPropertyType>();
            get_store().find_all_element_users(POINTREP$4, targetList);
            net.opengis.gml.PointPropertyType[] result = new net.opengis.gml.PointPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pointRep" element
     */
    public net.opengis.gml.PointPropertyType getPointRepArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointPropertyType target = null;
            target = (net.opengis.gml.PointPropertyType)get_store().find_element_user(POINTREP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pointRep" element
     */
    public int sizeOfPointRepArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POINTREP$4);
        }
    }
    
    /**
     * Sets array of all "pointRep" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setPointRepArray(net.opengis.gml.PointPropertyType[] pointRepArray)
    {
        check_orphaned();
        arraySetterHelper(pointRepArray, POINTREP$4);
    }
    
    /**
     * Sets ith "pointRep" element
     */
     public void setPointRepArray(int i, net.opengis.gml.PointPropertyType pointRep)
    {
        generatedSetterHelperImpl(pointRep, POINTREP$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pointRep" element
     */
    public net.opengis.gml.PointPropertyType insertNewPointRep(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointPropertyType target = null;
            target = (net.opengis.gml.PointPropertyType)get_store().insert_element_user(POINTREP$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pointRep" element
     */
    public net.opengis.gml.PointPropertyType addNewPointRep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointPropertyType target = null;
            target = (net.opengis.gml.PointPropertyType)get_store().add_element_user(POINTREP$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "pointRep" element
     */
    public void removePointRep(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POINTREP$4, i);
        }
    }
    
    /**
     * Gets the "posList" element
     */
    public net.opengis.gml.DirectPositionListType getPosList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionListType target = null;
            target = (net.opengis.gml.DirectPositionListType)get_store().find_element_user(POSLIST$6, 0);
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
            return get_store().count_elements(POSLIST$6) != 0;
        }
    }
    
    /**
     * Sets the "posList" element
     */
     public void setPosList(net.opengis.gml.DirectPositionListType posList)
    {
        generatedSetterHelperImpl(posList, POSLIST$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (net.opengis.gml.DirectPositionListType)get_store().add_element_user(POSLIST$6);
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
            get_store().remove_element(POSLIST$6, 0);
        }
    }
    
    /**
     * Gets the "coordinates" element
     */
    public net.opengis.gml.CoordinatesType getCoordinates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinatesType target = null;
            target = (net.opengis.gml.CoordinatesType)get_store().find_element_user(COORDINATES$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "coordinates" element
     */
    public boolean isSetCoordinates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COORDINATES$8) != 0;
        }
    }
    
    /**
     * Sets the "coordinates" element
     */
     public void setCoordinates(net.opengis.gml.CoordinatesType coordinates)
    {
        generatedSetterHelperImpl(coordinates, COORDINATES$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "coordinates" element
     */
    public net.opengis.gml.CoordinatesType addNewCoordinates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinatesType target = null;
            target = (net.opengis.gml.CoordinatesType)get_store().add_element_user(COORDINATES$8);
            return target;
        }
    }
    
    /**
     * Unsets the "coordinates" element
     */
    public void unsetCoordinates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COORDINATES$8, 0);
        }
    }
    
    /**
     * Gets the "degree" element
     */
    public java.math.BigInteger getDegree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEGREE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "degree" element
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetDegree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(DEGREE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "degree" element
     */
     public void setDegree(java.math.BigInteger degree)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEGREE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEGREE$10);
            }
            target.setBigIntegerValue(degree);
        }
    }
    
    /**
     * Sets (as xml) the "degree" element
     */
    public void xsetDegree(org.apache.xmlbeans.XmlNonNegativeInteger degree)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(DEGREE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(DEGREE$10);
            }
            target.set(degree);
        }
    }
    
    /**
     * Gets a List of "knot" elements
     */
    public java.util.List<net.opengis.gml.KnotPropertyType> getKnotList()
    {
        final class KnotList extends java.util.AbstractList<net.opengis.gml.KnotPropertyType>
        {
            @Override
            public net.opengis.gml.KnotPropertyType get(int i)
                { return BSplineTypeImpl.this.getKnotArray(i); }
            
            @Override
            public net.opengis.gml.KnotPropertyType set(int i, net.opengis.gml.KnotPropertyType o)
            {
                net.opengis.gml.KnotPropertyType old = BSplineTypeImpl.this.getKnotArray(i);
                BSplineTypeImpl.this.setKnotArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.KnotPropertyType o)
                { BSplineTypeImpl.this.insertNewKnot(i).set(o); }
            
            @Override
            public net.opengis.gml.KnotPropertyType remove(int i)
            {
                net.opengis.gml.KnotPropertyType old = BSplineTypeImpl.this.getKnotArray(i);
                BSplineTypeImpl.this.removeKnot(i);
                return old;
            }
            
            @Override
            public int size()
                { return BSplineTypeImpl.this.sizeOfKnotArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new KnotList();
        }
    }
    
    /**
     * Gets array of all "knot" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.KnotPropertyType[] getKnotArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.KnotPropertyType> targetList = new java.util.ArrayList<net.opengis.gml.KnotPropertyType>();
            get_store().find_all_element_users(KNOT$12, targetList);
            net.opengis.gml.KnotPropertyType[] result = new net.opengis.gml.KnotPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "knot" element
     */
    public net.opengis.gml.KnotPropertyType getKnotArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.KnotPropertyType target = null;
            target = (net.opengis.gml.KnotPropertyType)get_store().find_element_user(KNOT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "knot" element
     */
    public int sizeOfKnotArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KNOT$12);
        }
    }
    
    /**
     * Sets array of all "knot" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setKnotArray(net.opengis.gml.KnotPropertyType[] knotArray)
    {
        check_orphaned();
        arraySetterHelper(knotArray, KNOT$12);
    }
    
    /**
     * Sets ith "knot" element
     */
     public void setKnotArray(int i, net.opengis.gml.KnotPropertyType knot)
    {
        generatedSetterHelperImpl(knot, KNOT$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "knot" element
     */
    public net.opengis.gml.KnotPropertyType insertNewKnot(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.KnotPropertyType target = null;
            target = (net.opengis.gml.KnotPropertyType)get_store().insert_element_user(KNOT$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "knot" element
     */
    public net.opengis.gml.KnotPropertyType addNewKnot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.KnotPropertyType target = null;
            target = (net.opengis.gml.KnotPropertyType)get_store().add_element_user(KNOT$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "knot" element
     */
    public void removeKnot(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KNOT$12, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERPOLATION$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INTERPOLATION$14);
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
            target = (net.opengis.gml.CurveInterpolationType)get_store().find_attribute_user(INTERPOLATION$14);
            if (target == null)
            {
                target = (net.opengis.gml.CurveInterpolationType)get_default_attribute_value(INTERPOLATION$14);
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
            return get_store().find_attribute_user(INTERPOLATION$14) != null;
        }
    }
    
    /**
     * Sets the "interpolation" attribute
     */
     public void setInterpolation(net.opengis.gml.CurveInterpolationType.Enum interpolation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERPOLATION$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERPOLATION$14);
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
            target = (net.opengis.gml.CurveInterpolationType)get_store().find_attribute_user(INTERPOLATION$14);
            if (target == null)
            {
                target = (net.opengis.gml.CurveInterpolationType)get_store().add_attribute_user(INTERPOLATION$14);
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
            get_store().remove_attribute(INTERPOLATION$14);
        }
    }
    
    /**
     * Gets the "isPolynomial" attribute
     */
    public boolean getIsPolynomial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISPOLYNOMIAL$16);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isPolynomial" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsPolynomial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISPOLYNOMIAL$16);
            return target;
        }
    }
    
    /**
     * True if has "isPolynomial" attribute
     */
    public boolean isSetIsPolynomial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISPOLYNOMIAL$16) != null;
        }
    }
    
    /**
     * Sets the "isPolynomial" attribute
     */
     public void setIsPolynomial(boolean isPolynomial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISPOLYNOMIAL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISPOLYNOMIAL$16);
            }
            target.setBooleanValue(isPolynomial);
        }
    }
    
    /**
     * Sets (as xml) the "isPolynomial" attribute
     */
    public void xsetIsPolynomial(org.apache.xmlbeans.XmlBoolean isPolynomial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISPOLYNOMIAL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISPOLYNOMIAL$16);
            }
            target.set(isPolynomial);
        }
    }
    
    /**
     * Unsets the "isPolynomial" attribute
     */
    public void unsetIsPolynomial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISPOLYNOMIAL$16);
        }
    }
    
    /**
     * Gets the "knotType" attribute
     */
    public net.opengis.gml.KnotTypesType.Enum getKnotType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KNOTTYPE$18);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.KnotTypesType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "knotType" attribute
     */
    public net.opengis.gml.KnotTypesType xgetKnotType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.KnotTypesType target = null;
            target = (net.opengis.gml.KnotTypesType)get_store().find_attribute_user(KNOTTYPE$18);
            return target;
        }
    }
    
    /**
     * True if has "knotType" attribute
     */
    public boolean isSetKnotType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(KNOTTYPE$18) != null;
        }
    }
    
    /**
     * Sets the "knotType" attribute
     */
     public void setKnotType(net.opengis.gml.KnotTypesType.Enum knotType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KNOTTYPE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KNOTTYPE$18);
            }
            target.setEnumValue(knotType);
        }
    }
    
    /**
     * Sets (as xml) the "knotType" attribute
     */
    public void xsetKnotType(net.opengis.gml.KnotTypesType knotType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.KnotTypesType target = null;
            target = (net.opengis.gml.KnotTypesType)get_store().find_attribute_user(KNOTTYPE$18);
            if (target == null)
            {
                target = (net.opengis.gml.KnotTypesType)get_store().add_attribute_user(KNOTTYPE$18);
            }
            target.set(knotType);
        }
    }
    
    /**
     * Unsets the "knotType" attribute
     */
    public void unsetKnotType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(KNOTTYPE$18);
        }
    }
}
