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
 * An XML CubicSplineType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class CubicSplineTypeImpl extends net.opengis.gml.impl.AbstractCurveSegmentTypeImpl implements net.opengis.gml.CubicSplineType
{
    private static final long serialVersionUID = 1L;
    
    public CubicSplineTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName VECTORATSTART$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "vectorAtStart");
    private static final javax.xml.namespace.QName VECTORATEND$12 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "vectorAtEnd");
    private static final javax.xml.namespace.QName INTERPOLATION$14 = 
        new javax.xml.namespace.QName("", "interpolation");
    private static final javax.xml.namespace.QName DEGREE$16 = 
        new javax.xml.namespace.QName("", "degree");
    
    
    /**
     * Gets a List of "pos" elements
     */
    public java.util.List<net.opengis.gml.DirectPositionType> getPositionList()
    {
        final class PosList extends java.util.AbstractList<net.opengis.gml.DirectPositionType>
        {
            @Override
            public net.opengis.gml.DirectPositionType get(int i)
                { return CubicSplineTypeImpl.this.getPosArray(i); }
            
            @Override
            public net.opengis.gml.DirectPositionType set(int i, net.opengis.gml.DirectPositionType o)
            {
                net.opengis.gml.DirectPositionType old = CubicSplineTypeImpl.this.getPosArray(i);
                CubicSplineTypeImpl.this.setPosArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.DirectPositionType o)
                { CubicSplineTypeImpl.this.insertNewPos(i).set(o); }
            
            @Override
            public net.opengis.gml.DirectPositionType remove(int i)
            {
                net.opengis.gml.DirectPositionType old = CubicSplineTypeImpl.this.getPosArray(i);
                CubicSplineTypeImpl.this.removePos(i);
                return old;
            }
            
            @Override
            public int size()
                { return CubicSplineTypeImpl.this.sizeOfPosArray(); }
            
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
                { return CubicSplineTypeImpl.this.getPointPropertyArray(i); }
            
            @Override
            public net.opengis.gml.PointPropertyType set(int i, net.opengis.gml.PointPropertyType o)
            {
                net.opengis.gml.PointPropertyType old = CubicSplineTypeImpl.this.getPointPropertyArray(i);
                CubicSplineTypeImpl.this.setPointPropertyArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.PointPropertyType o)
                { CubicSplineTypeImpl.this.insertNewPointProperty(i).set(o); }
            
            @Override
            public net.opengis.gml.PointPropertyType remove(int i)
            {
                net.opengis.gml.PointPropertyType old = CubicSplineTypeImpl.this.getPointPropertyArray(i);
                CubicSplineTypeImpl.this.removePointProperty(i);
                return old;
            }
            
            @Override
            public int size()
                { return CubicSplineTypeImpl.this.sizeOfPointPropertyArray(); }
            
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
                { return CubicSplineTypeImpl.this.getPointRepArray(i); }
            
            @Override
            public net.opengis.gml.PointPropertyType set(int i, net.opengis.gml.PointPropertyType o)
            {
                net.opengis.gml.PointPropertyType old = CubicSplineTypeImpl.this.getPointRepArray(i);
                CubicSplineTypeImpl.this.setPointRepArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.PointPropertyType o)
                { CubicSplineTypeImpl.this.insertNewPointRep(i).set(o); }
            
            @Override
            public net.opengis.gml.PointPropertyType remove(int i)
            {
                net.opengis.gml.PointPropertyType old = CubicSplineTypeImpl.this.getPointRepArray(i);
                CubicSplineTypeImpl.this.removePointRep(i);
                return old;
            }
            
            @Override
            public int size()
                { return CubicSplineTypeImpl.this.sizeOfPointRepArray(); }
            
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
     * Gets the "vectorAtStart" element
     */
    public net.opengis.gml.VectorType getVectorAtStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VectorType target = null;
            target = (net.opengis.gml.VectorType)get_store().find_element_user(VECTORATSTART$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "vectorAtStart" element
     */
     public void setVectorAtStart(net.opengis.gml.VectorType vectorAtStart)
    {
        generatedSetterHelperImpl(vectorAtStart, VECTORATSTART$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "vectorAtStart" element
     */
    public net.opengis.gml.VectorType addNewVectorAtStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VectorType target = null;
            target = (net.opengis.gml.VectorType)get_store().add_element_user(VECTORATSTART$10);
            return target;
        }
    }
    
    /**
     * Gets the "vectorAtEnd" element
     */
    public net.opengis.gml.VectorType getVectorAtEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VectorType target = null;
            target = (net.opengis.gml.VectorType)get_store().find_element_user(VECTORATEND$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "vectorAtEnd" element
     */
     public void setVectorAtEnd(net.opengis.gml.VectorType vectorAtEnd)
    {
        generatedSetterHelperImpl(vectorAtEnd, VECTORATEND$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "vectorAtEnd" element
     */
    public net.opengis.gml.VectorType addNewVectorAtEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VectorType target = null;
            target = (net.opengis.gml.VectorType)get_store().add_element_user(VECTORATEND$12);
            return target;
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
     * Gets the "degree" attribute
     */
    public java.math.BigInteger getDegree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEGREE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DEGREE$16);
            }
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "degree" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetDegree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DEGREE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_default_attribute_value(DEGREE$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "degree" attribute
     */
    public boolean isSetDegree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEGREE$16) != null;
        }
    }
    
    /**
     * Sets the "degree" attribute
     */
     public void setDegree(java.math.BigInteger degree)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEGREE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEGREE$16);
            }
            target.setBigIntegerValue(degree);
        }
    }
    
    /**
     * Sets (as xml) the "degree" attribute
     */
    public void xsetDegree(org.apache.xmlbeans.XmlInteger degree)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DEGREE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DEGREE$16);
            }
            target.set(degree);
        }
    }
    
    /**
     * Unsets the "degree" attribute
     */
    public void unsetDegree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEGREE$16);
        }
    }
}
