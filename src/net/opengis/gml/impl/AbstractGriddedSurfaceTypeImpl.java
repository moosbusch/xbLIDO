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
 * An XML AbstractGriddedSurfaceType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class AbstractGriddedSurfaceTypeImpl extends net.opengis.gml.impl.AbstractParametricCurveSurfaceTypeImpl implements net.opengis.gml.AbstractGriddedSurfaceType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractGriddedSurfaceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROW$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "row");
    private static final javax.xml.namespace.QName ROWS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "rows");
    private static final javax.xml.namespace.QName COLUMNS$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "columns");
    
    
    /**
     * Gets a List of "row" elements
     */
    public java.util.List<net.opengis.gml.AbstractGriddedSurfaceType.Row> getRowList()
    {
        final class RowList extends java.util.AbstractList<net.opengis.gml.AbstractGriddedSurfaceType.Row>
        {
            @Override
            public net.opengis.gml.AbstractGriddedSurfaceType.Row get(int i)
                { return AbstractGriddedSurfaceTypeImpl.this.getRowArray(i); }
            
            @Override
            public net.opengis.gml.AbstractGriddedSurfaceType.Row set(int i, net.opengis.gml.AbstractGriddedSurfaceType.Row o)
            {
                net.opengis.gml.AbstractGriddedSurfaceType.Row old = AbstractGriddedSurfaceTypeImpl.this.getRowArray(i);
                AbstractGriddedSurfaceTypeImpl.this.setRowArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.AbstractGriddedSurfaceType.Row o)
                { AbstractGriddedSurfaceTypeImpl.this.insertNewRow(i).set(o); }
            
            @Override
            public net.opengis.gml.AbstractGriddedSurfaceType.Row remove(int i)
            {
                net.opengis.gml.AbstractGriddedSurfaceType.Row old = AbstractGriddedSurfaceTypeImpl.this.getRowArray(i);
                AbstractGriddedSurfaceTypeImpl.this.removeRow(i);
                return old;
            }
            
            @Override
            public int size()
                { return AbstractGriddedSurfaceTypeImpl.this.sizeOfRowArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RowList();
        }
    }
    
    /**
     * Gets array of all "row" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.AbstractGriddedSurfaceType.Row[] getRowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.AbstractGriddedSurfaceType.Row> targetList = new java.util.ArrayList<net.opengis.gml.AbstractGriddedSurfaceType.Row>();
            get_store().find_all_element_users(ROW$0, targetList);
            net.opengis.gml.AbstractGriddedSurfaceType.Row[] result = new net.opengis.gml.AbstractGriddedSurfaceType.Row[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "row" element
     */
    public net.opengis.gml.AbstractGriddedSurfaceType.Row getRowArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGriddedSurfaceType.Row target = null;
            target = (net.opengis.gml.AbstractGriddedSurfaceType.Row)get_store().find_element_user(ROW$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "row" element
     */
    public int sizeOfRowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROW$0);
        }
    }
    
    /**
     * Sets array of all "row" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setRowArray(net.opengis.gml.AbstractGriddedSurfaceType.Row[] rowArray)
    {
        check_orphaned();
        arraySetterHelper(rowArray, ROW$0);
    }
    
    /**
     * Sets ith "row" element
     */
    @Inject(optional=true) public void setRowArray(int i, net.opengis.gml.AbstractGriddedSurfaceType.Row row)
    {
        generatedSetterHelperImpl(row, ROW$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "row" element
     */
    public net.opengis.gml.AbstractGriddedSurfaceType.Row insertNewRow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGriddedSurfaceType.Row target = null;
            target = (net.opengis.gml.AbstractGriddedSurfaceType.Row)get_store().insert_element_user(ROW$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "row" element
     */
    public net.opengis.gml.AbstractGriddedSurfaceType.Row addNewRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGriddedSurfaceType.Row target = null;
            target = (net.opengis.gml.AbstractGriddedSurfaceType.Row)get_store().add_element_user(ROW$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "row" element
     */
    public void removeRow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROW$0, i);
        }
    }
    
    /**
     * Gets the "rows" element
     */
    public java.math.BigInteger getRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROWS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "rows" element
     */
    public org.apache.xmlbeans.XmlInteger xgetRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ROWS$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "rows" element
     */
    public boolean isSetRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROWS$2) != 0;
        }
    }
    
    /**
     * Sets the "rows" element
     */
    @Inject(optional=true) public void setRows(java.math.BigInteger rows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROWS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROWS$2);
            }
            target.setBigIntegerValue(rows);
        }
    }
    
    /**
     * Sets (as xml) the "rows" element
     */
    public void xsetRows(org.apache.xmlbeans.XmlInteger rows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ROWS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ROWS$2);
            }
            target.set(rows);
        }
    }
    
    /**
     * Unsets the "rows" element
     */
    public void unsetRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROWS$2, 0);
        }
    }
    
    /**
     * Gets the "columns" element
     */
    public java.math.BigInteger getColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "columns" element
     */
    public org.apache.xmlbeans.XmlInteger xgetColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(COLUMNS$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "columns" element
     */
    public boolean isSetColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLUMNS$4) != 0;
        }
    }
    
    /**
     * Sets the "columns" element
     */
    @Inject(optional=true) public void setColumns(java.math.BigInteger columns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLUMNS$4);
            }
            target.setBigIntegerValue(columns);
        }
    }
    
    /**
     * Sets (as xml) the "columns" element
     */
    public void xsetColumns(org.apache.xmlbeans.XmlInteger columns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(COLUMNS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(COLUMNS$4);
            }
            target.set(columns);
        }
    }
    
    /**
     * Unsets the "columns" element
     */
    public void unsetColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLUMNS$4, 0);
        }
    }
    /**
     * An XML row(@http://www.opengis.net/gml).
     *
     * This is a complex type.
     */
    public static class RowImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.AbstractGriddedSurfaceType.Row
    {
        private static final long serialVersionUID = 1L;
        
        public RowImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName POSLIST$0 = 
            new javax.xml.namespace.QName("http://www.opengis.net/gml", "posList");
        private static final javax.xml.namespace.QName POS$2 = 
            new javax.xml.namespace.QName("http://www.opengis.net/gml", "pos");
        private static final javax.xml.namespace.QName POINTPROPERTY$4 = 
            new javax.xml.namespace.QName("http://www.opengis.net/gml", "pointProperty");
        
        
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
                    { return RowImpl.this.getPosArray(i); }
                
                @Override
                public net.opengis.gml.DirectPositionType set(int i, net.opengis.gml.DirectPositionType o)
                {
                    net.opengis.gml.DirectPositionType old = RowImpl.this.getPosArray(i);
                    RowImpl.this.setPosArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, net.opengis.gml.DirectPositionType o)
                    { RowImpl.this.insertNewPos(i).set(o); }
                
                @Override
                public net.opengis.gml.DirectPositionType remove(int i)
                {
                    net.opengis.gml.DirectPositionType old = RowImpl.this.getPosArray(i);
                    RowImpl.this.removePos(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RowImpl.this.sizeOfPosArray(); }
                
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
                    { return RowImpl.this.getPointPropertyArray(i); }
                
                @Override
                public net.opengis.gml.PointPropertyType set(int i, net.opengis.gml.PointPropertyType o)
                {
                    net.opengis.gml.PointPropertyType old = RowImpl.this.getPointPropertyArray(i);
                    RowImpl.this.setPointPropertyArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, net.opengis.gml.PointPropertyType o)
                    { RowImpl.this.insertNewPointProperty(i).set(o); }
                
                @Override
                public net.opengis.gml.PointPropertyType remove(int i)
                {
                    net.opengis.gml.PointPropertyType old = RowImpl.this.getPointPropertyArray(i);
                    RowImpl.this.removePointProperty(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RowImpl.this.sizeOfPointPropertyArray(); }
                
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
    }
}
