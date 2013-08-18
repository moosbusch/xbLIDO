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
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML ArcStringByBulgeType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class ArcStringByBulgeTypeImpl extends net.opengis.gml.impl.AbstractCurveSegmentTypeImpl implements net.opengis.gml.ArcStringByBulgeType
{
    private static final long serialVersionUID = 1L;
    
    public ArcStringByBulgeTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName BULGE$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "bulge");
    private static final javax.xml.namespace.QName NORMAL$12 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "normal");
    private static final javax.xml.namespace.QName INTERPOLATION$14 = 
        new javax.xml.namespace.QName("", "interpolation");
    private static final javax.xml.namespace.QName NUMARC$16 = 
        new javax.xml.namespace.QName("", "numArc");
    
    
    /**
     * Gets a List of "pos" elements
     */
    public java.util.List<net.opengis.gml.DirectPositionType> getPositionList()
    {
        final class PosList extends java.util.AbstractList<net.opengis.gml.DirectPositionType>
        {
            @Override
            public net.opengis.gml.DirectPositionType get(int i)
                { return ArcStringByBulgeTypeImpl.this.getPosArray(i); }
            
            @Override
            public net.opengis.gml.DirectPositionType set(int i, net.opengis.gml.DirectPositionType o)
            {
                net.opengis.gml.DirectPositionType old = ArcStringByBulgeTypeImpl.this.getPosArray(i);
                ArcStringByBulgeTypeImpl.this.setPosArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.DirectPositionType o)
                { ArcStringByBulgeTypeImpl.this.insertNewPos(i).set(o); }
            
            @Override
            public net.opengis.gml.DirectPositionType remove(int i)
            {
                net.opengis.gml.DirectPositionType old = ArcStringByBulgeTypeImpl.this.getPosArray(i);
                ArcStringByBulgeTypeImpl.this.removePos(i);
                return old;
            }
            
            @Override
            public int size()
                { return ArcStringByBulgeTypeImpl.this.sizeOfPosArray(); }
            
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
    @Inject(optional=true) public void setPosArray(net.opengis.gml.DirectPositionType[] posArray)
    {
        check_orphaned();
        arraySetterHelper(posArray, POS$0);
    }
    
    /**
     * Sets ith "pos" element
     */
    @Inject(optional=true) public void setPosArray(int i, net.opengis.gml.DirectPositionType pos)
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
                { return ArcStringByBulgeTypeImpl.this.getPointPropertyArray(i); }
            
            @Override
            public net.opengis.gml.PointPropertyType set(int i, net.opengis.gml.PointPropertyType o)
            {
                net.opengis.gml.PointPropertyType old = ArcStringByBulgeTypeImpl.this.getPointPropertyArray(i);
                ArcStringByBulgeTypeImpl.this.setPointPropertyArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.PointPropertyType o)
                { ArcStringByBulgeTypeImpl.this.insertNewPointProperty(i).set(o); }
            
            @Override
            public net.opengis.gml.PointPropertyType remove(int i)
            {
                net.opengis.gml.PointPropertyType old = ArcStringByBulgeTypeImpl.this.getPointPropertyArray(i);
                ArcStringByBulgeTypeImpl.this.removePointProperty(i);
                return old;
            }
            
            @Override
            public int size()
                { return ArcStringByBulgeTypeImpl.this.sizeOfPointPropertyArray(); }
            
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
    @Inject(optional=true) public void setPointPropertyArray(net.opengis.gml.PointPropertyType[] pointPropertyArray)
    {
        check_orphaned();
        arraySetterHelper(pointPropertyArray, POINTPROPERTY$2);
    }
    
    /**
     * Sets ith "pointProperty" element
     */
    @Inject(optional=true) public void setPointPropertyArray(int i, net.opengis.gml.PointPropertyType pointProperty)
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
                { return ArcStringByBulgeTypeImpl.this.getPointRepArray(i); }
            
            @Override
            public net.opengis.gml.PointPropertyType set(int i, net.opengis.gml.PointPropertyType o)
            {
                net.opengis.gml.PointPropertyType old = ArcStringByBulgeTypeImpl.this.getPointRepArray(i);
                ArcStringByBulgeTypeImpl.this.setPointRepArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.PointPropertyType o)
                { ArcStringByBulgeTypeImpl.this.insertNewPointRep(i).set(o); }
            
            @Override
            public net.opengis.gml.PointPropertyType remove(int i)
            {
                net.opengis.gml.PointPropertyType old = ArcStringByBulgeTypeImpl.this.getPointRepArray(i);
                ArcStringByBulgeTypeImpl.this.removePointRep(i);
                return old;
            }
            
            @Override
            public int size()
                { return ArcStringByBulgeTypeImpl.this.sizeOfPointRepArray(); }
            
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
    @Inject(optional=true) public void setPointRepArray(net.opengis.gml.PointPropertyType[] pointRepArray)
    {
        check_orphaned();
        arraySetterHelper(pointRepArray, POINTREP$4);
    }
    
    /**
     * Sets ith "pointRep" element
     */
    @Inject(optional=true) public void setPointRepArray(int i, net.opengis.gml.PointPropertyType pointRep)
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
    @Inject(optional=true) public void setPosList(net.opengis.gml.DirectPositionListType posList)
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
    @Inject(optional=true) public void setCoordinates(net.opengis.gml.CoordinatesType coordinates)
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
     * Gets a List of "bulge" elements
     */
    public java.util.List<java.lang.Double> getBulgeList()
    {
        final class BulgeList extends java.util.AbstractList<java.lang.Double>
        {
            @Override
            public java.lang.Double get(int i)
                { return ArcStringByBulgeTypeImpl.this.getBulgeArray(i); }
            
            @Override
            public java.lang.Double set(int i, java.lang.Double o)
            {
                java.lang.Double old = ArcStringByBulgeTypeImpl.this.getBulgeArray(i);
                ArcStringByBulgeTypeImpl.this.setBulgeArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.Double o)
                { ArcStringByBulgeTypeImpl.this.insertBulge(i, o); }
            
            @Override
            public java.lang.Double remove(int i)
            {
                java.lang.Double old = ArcStringByBulgeTypeImpl.this.getBulgeArray(i);
                ArcStringByBulgeTypeImpl.this.removeBulge(i);
                return old;
            }
            
            @Override
            public int size()
                { return ArcStringByBulgeTypeImpl.this.sizeOfBulgeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BulgeList();
        }
    }
    
    /**
     * Gets array of all "bulge" elements
     * @deprecated
     */
    @Deprecated
    public double[] getBulgeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlDouble> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlDouble>();
            get_store().find_all_element_users(BULGE$10, targetList);
            double[] result = new double[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
            return result;
        }
    }
    
    /**
     * Gets ith "bulge" element
     */
    public double getBulgeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BULGE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "bulge" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlDouble> xgetBulgeList()
    {
        final class BulgeList extends java.util.AbstractList<org.apache.xmlbeans.XmlDouble>
        {
            @Override
            public org.apache.xmlbeans.XmlDouble get(int i)
                { return ArcStringByBulgeTypeImpl.this.xgetBulgeArray(i); }
            
            @Override
            public org.apache.xmlbeans.XmlDouble set(int i, org.apache.xmlbeans.XmlDouble o)
            {
                org.apache.xmlbeans.XmlDouble old = ArcStringByBulgeTypeImpl.this.xgetBulgeArray(i);
                ArcStringByBulgeTypeImpl.this.xsetBulgeArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.apache.xmlbeans.XmlDouble o)
                { ArcStringByBulgeTypeImpl.this.insertNewBulge(i).set(o); }
            
            @Override
            public org.apache.xmlbeans.XmlDouble remove(int i)
            {
                org.apache.xmlbeans.XmlDouble old = ArcStringByBulgeTypeImpl.this.xgetBulgeArray(i);
                ArcStringByBulgeTypeImpl.this.removeBulge(i);
                return old;
            }
            
            @Override
            public int size()
                { return ArcStringByBulgeTypeImpl.this.sizeOfBulgeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BulgeList();
        }
    }
    
    /**
     * Gets array of all "bulge" elements
     * @deprecated
     */
    @Deprecated
    public org.apache.xmlbeans.XmlDouble[] xgetBulgeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlDouble> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlDouble>();
            get_store().find_all_element_users(BULGE$10, targetList);
            org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "bulge" element
     */
    public org.apache.xmlbeans.XmlDouble xgetBulgeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BULGE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "bulge" element
     */
    public int sizeOfBulgeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BULGE$10);
        }
    }
    
    /**
     * Sets array of all "bulge" element
     */
    @Inject(optional=true) public void setBulgeArray(double[] bulgeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bulgeArray, BULGE$10);
        }
    }
    
    /**
     * Sets ith "bulge" element
     */
    @Inject(optional=true) public void setBulgeArray(int i, double bulge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BULGE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setDoubleValue(bulge);
        }
    }
    
    /**
     * Sets (as xml) array of all "bulge" element
     */
    public void xsetBulgeArray(org.apache.xmlbeans.XmlDouble[]bulgeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bulgeArray, BULGE$10);
        }
    }
    
    /**
     * Sets (as xml) ith "bulge" element
     */
    public void xsetBulgeArray(int i, org.apache.xmlbeans.XmlDouble bulge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BULGE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bulge);
        }
    }
    
    /**
     * Inserts the value as the ith "bulge" element
     */
    public void insertBulge(int i, double bulge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BULGE$10, i);
            target.setDoubleValue(bulge);
        }
    }
    
    /**
     * Appends the value as the last "bulge" element
     */
    public void addBulge(double bulge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BULGE$10);
            target.setDoubleValue(bulge);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bulge" element
     */
    public org.apache.xmlbeans.XmlDouble insertNewBulge(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(BULGE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bulge" element
     */
    public org.apache.xmlbeans.XmlDouble addNewBulge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(BULGE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "bulge" element
     */
    public void removeBulge(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BULGE$10, i);
        }
    }
    
    /**
     * Gets a List of "normal" elements
     */
    public java.util.List<net.opengis.gml.VectorType> getNormalList()
    {
        final class NormalList extends java.util.AbstractList<net.opengis.gml.VectorType>
        {
            @Override
            public net.opengis.gml.VectorType get(int i)
                { return ArcStringByBulgeTypeImpl.this.getNormalArray(i); }
            
            @Override
            public net.opengis.gml.VectorType set(int i, net.opengis.gml.VectorType o)
            {
                net.opengis.gml.VectorType old = ArcStringByBulgeTypeImpl.this.getNormalArray(i);
                ArcStringByBulgeTypeImpl.this.setNormalArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.VectorType o)
                { ArcStringByBulgeTypeImpl.this.insertNewNormal(i).set(o); }
            
            @Override
            public net.opengis.gml.VectorType remove(int i)
            {
                net.opengis.gml.VectorType old = ArcStringByBulgeTypeImpl.this.getNormalArray(i);
                ArcStringByBulgeTypeImpl.this.removeNormal(i);
                return old;
            }
            
            @Override
            public int size()
                { return ArcStringByBulgeTypeImpl.this.sizeOfNormalArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new NormalList();
        }
    }
    
    /**
     * Gets array of all "normal" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.VectorType[] getNormalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.VectorType> targetList = new java.util.ArrayList<net.opengis.gml.VectorType>();
            get_store().find_all_element_users(NORMAL$12, targetList);
            net.opengis.gml.VectorType[] result = new net.opengis.gml.VectorType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "normal" element
     */
    public net.opengis.gml.VectorType getNormalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VectorType target = null;
            target = (net.opengis.gml.VectorType)get_store().find_element_user(NORMAL$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "normal" element
     */
    public int sizeOfNormalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NORMAL$12);
        }
    }
    
    /**
     * Sets array of all "normal" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setNormalArray(net.opengis.gml.VectorType[] normalArray)
    {
        check_orphaned();
        arraySetterHelper(normalArray, NORMAL$12);
    }
    
    /**
     * Sets ith "normal" element
     */
    @Inject(optional=true) public void setNormalArray(int i, net.opengis.gml.VectorType normal)
    {
        generatedSetterHelperImpl(normal, NORMAL$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "normal" element
     */
    public net.opengis.gml.VectorType insertNewNormal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VectorType target = null;
            target = (net.opengis.gml.VectorType)get_store().insert_element_user(NORMAL$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "normal" element
     */
    public net.opengis.gml.VectorType addNewNormal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VectorType target = null;
            target = (net.opengis.gml.VectorType)get_store().add_element_user(NORMAL$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "normal" element
     */
    public void removeNormal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NORMAL$12, i);
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
    @Inject(optional=true) public void setInterpolation(net.opengis.gml.CurveInterpolationType.Enum interpolation)
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
     * Gets the "numArc" attribute
     */
    public java.math.BigInteger getNumArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMARC$16);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "numArc" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetNumArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NUMARC$16);
            return target;
        }
    }
    
    /**
     * True if has "numArc" attribute
     */
    public boolean isSetNumArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NUMARC$16) != null;
        }
    }
    
    /**
     * Sets the "numArc" attribute
     */
    @Inject(optional=true) public void setNumArc(java.math.BigInteger numArc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMARC$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMARC$16);
            }
            target.setBigIntegerValue(numArc);
        }
    }
    
    /**
     * Sets (as xml) the "numArc" attribute
     */
    public void xsetNumArc(org.apache.xmlbeans.XmlInteger numArc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NUMARC$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(NUMARC$16);
            }
            target.set(numArc);
        }
    }
    
    /**
     * Unsets the "numArc" attribute
     */
    public void unsetNumArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NUMARC$16);
        }
    }
}
