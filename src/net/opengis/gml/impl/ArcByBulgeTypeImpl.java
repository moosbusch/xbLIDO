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
 * An XML ArcByBulgeType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class ArcByBulgeTypeImpl extends net.opengis.gml.impl.ArcStringByBulgeTypeImpl implements net.opengis.gml.ArcByBulgeType
{
    private static final long serialVersionUID = 1L;
    
    public ArcByBulgeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "pos");
    private static final javax.xml.namespace.QName POINTPROPERTY$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "pointProperty");
    private static final javax.xml.namespace.QName POINTREP$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "pointRep");
    private static final javax.xml.namespace.QName BULGE$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "bulge");
    private static final javax.xml.namespace.QName NORMAL$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "normal");
    private static final javax.xml.namespace.QName NUMARC$10 = 
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
                { return ArcByBulgeTypeImpl.this.getPosArray(i); }
            
            @Override
            public net.opengis.gml.DirectPositionType set(int i, net.opengis.gml.DirectPositionType o)
            {
                net.opengis.gml.DirectPositionType old = ArcByBulgeTypeImpl.this.getPosArray(i);
                ArcByBulgeTypeImpl.this.setPosArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.DirectPositionType o)
                { ArcByBulgeTypeImpl.this.insertNewPos(i).set(o); }
            
            @Override
            public net.opengis.gml.DirectPositionType remove(int i)
            {
                net.opengis.gml.DirectPositionType old = ArcByBulgeTypeImpl.this.getPosArray(i);
                ArcByBulgeTypeImpl.this.removePos(i);
                return old;
            }
            
            @Override
            public int size()
                { return ArcByBulgeTypeImpl.this.sizeOfPosArray(); }
            
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
                { return ArcByBulgeTypeImpl.this.getPointPropertyArray(i); }
            
            @Override
            public net.opengis.gml.PointPropertyType set(int i, net.opengis.gml.PointPropertyType o)
            {
                net.opengis.gml.PointPropertyType old = ArcByBulgeTypeImpl.this.getPointPropertyArray(i);
                ArcByBulgeTypeImpl.this.setPointPropertyArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.PointPropertyType o)
                { ArcByBulgeTypeImpl.this.insertNewPointProperty(i).set(o); }
            
            @Override
            public net.opengis.gml.PointPropertyType remove(int i)
            {
                net.opengis.gml.PointPropertyType old = ArcByBulgeTypeImpl.this.getPointPropertyArray(i);
                ArcByBulgeTypeImpl.this.removePointProperty(i);
                return old;
            }
            
            @Override
            public int size()
                { return ArcByBulgeTypeImpl.this.sizeOfPointPropertyArray(); }
            
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
                { return ArcByBulgeTypeImpl.this.getPointRepArray(i); }
            
            @Override
            public net.opengis.gml.PointPropertyType set(int i, net.opengis.gml.PointPropertyType o)
            {
                net.opengis.gml.PointPropertyType old = ArcByBulgeTypeImpl.this.getPointRepArray(i);
                ArcByBulgeTypeImpl.this.setPointRepArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.PointPropertyType o)
                { ArcByBulgeTypeImpl.this.insertNewPointRep(i).set(o); }
            
            @Override
            public net.opengis.gml.PointPropertyType remove(int i)
            {
                net.opengis.gml.PointPropertyType old = ArcByBulgeTypeImpl.this.getPointRepArray(i);
                ArcByBulgeTypeImpl.this.removePointRep(i);
                return old;
            }
            
            @Override
            public int size()
                { return ArcByBulgeTypeImpl.this.sizeOfPointRepArray(); }
            
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
     * Gets a List of "bulge" elements
     */
    public java.util.List<java.lang.Double> getBulgeList()
    {
        final class BulgeList extends java.util.AbstractList<java.lang.Double>
        {
            @Override
            public java.lang.Double get(int i)
                { return ArcByBulgeTypeImpl.this.getBulgeArray(i); }
            
            @Override
            public java.lang.Double set(int i, java.lang.Double o)
            {
                java.lang.Double old = ArcByBulgeTypeImpl.this.getBulgeArray(i);
                ArcByBulgeTypeImpl.this.setBulgeArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.Double o)
                { ArcByBulgeTypeImpl.this.insertBulge(i, o); }
            
            @Override
            public java.lang.Double remove(int i)
            {
                java.lang.Double old = ArcByBulgeTypeImpl.this.getBulgeArray(i);
                ArcByBulgeTypeImpl.this.removeBulge(i);
                return old;
            }
            
            @Override
            public int size()
                { return ArcByBulgeTypeImpl.this.sizeOfBulgeArray(); }
            
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
            get_store().find_all_element_users(BULGE$6, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BULGE$6, i);
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
                { return ArcByBulgeTypeImpl.this.xgetBulgeArray(i); }
            
            @Override
            public org.apache.xmlbeans.XmlDouble set(int i, org.apache.xmlbeans.XmlDouble o)
            {
                org.apache.xmlbeans.XmlDouble old = ArcByBulgeTypeImpl.this.xgetBulgeArray(i);
                ArcByBulgeTypeImpl.this.xsetBulgeArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.apache.xmlbeans.XmlDouble o)
                { ArcByBulgeTypeImpl.this.insertNewBulge(i).set(o); }
            
            @Override
            public org.apache.xmlbeans.XmlDouble remove(int i)
            {
                org.apache.xmlbeans.XmlDouble old = ArcByBulgeTypeImpl.this.xgetBulgeArray(i);
                ArcByBulgeTypeImpl.this.removeBulge(i);
                return old;
            }
            
            @Override
            public int size()
                { return ArcByBulgeTypeImpl.this.sizeOfBulgeArray(); }
            
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
            get_store().find_all_element_users(BULGE$6, targetList);
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
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BULGE$6, i);
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
            return get_store().count_elements(BULGE$6);
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
            arraySetterHelper(bulgeArray, BULGE$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BULGE$6, i);
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
            arraySetterHelper(bulgeArray, BULGE$6);
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
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BULGE$6, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BULGE$6, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BULGE$6);
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
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(BULGE$6, i);
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
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(BULGE$6);
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
            get_store().remove_element(BULGE$6, i);
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
                { return ArcByBulgeTypeImpl.this.getNormalArray(i); }
            
            @Override
            public net.opengis.gml.VectorType set(int i, net.opengis.gml.VectorType o)
            {
                net.opengis.gml.VectorType old = ArcByBulgeTypeImpl.this.getNormalArray(i);
                ArcByBulgeTypeImpl.this.setNormalArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.VectorType o)
                { ArcByBulgeTypeImpl.this.insertNewNormal(i).set(o); }
            
            @Override
            public net.opengis.gml.VectorType remove(int i)
            {
                net.opengis.gml.VectorType old = ArcByBulgeTypeImpl.this.getNormalArray(i);
                ArcByBulgeTypeImpl.this.removeNormal(i);
                return old;
            }
            
            @Override
            public int size()
                { return ArcByBulgeTypeImpl.this.sizeOfNormalArray(); }
            
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
            get_store().find_all_element_users(NORMAL$8, targetList);
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
            target = (net.opengis.gml.VectorType)get_store().find_element_user(NORMAL$8, i);
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
            return get_store().count_elements(NORMAL$8);
        }
    }
    
    /**
     * Sets array of all "normal" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setNormalArray(net.opengis.gml.VectorType[] normalArray)
    {
        check_orphaned();
        arraySetterHelper(normalArray, NORMAL$8);
    }
    
    /**
     * Sets ith "normal" element
     */
    @Inject(optional=true) public void setNormalArray(int i, net.opengis.gml.VectorType normal)
    {
        generatedSetterHelperImpl(normal, NORMAL$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
            target = (net.opengis.gml.VectorType)get_store().insert_element_user(NORMAL$8, i);
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
            target = (net.opengis.gml.VectorType)get_store().add_element_user(NORMAL$8);
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
            get_store().remove_element(NORMAL$8, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMARC$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NUMARC$10);
            }
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NUMARC$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_default_attribute_value(NUMARC$10);
            }
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
            return get_store().find_attribute_user(NUMARC$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMARC$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMARC$10);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NUMARC$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(NUMARC$10);
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
            get_store().remove_attribute(NUMARC$10);
        }
    }
}
