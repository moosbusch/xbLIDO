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
 * An XML TinType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class TinTypeImpl extends net.opengis.gml.impl.TriangulatedSurfaceTypeImpl implements net.opengis.gml.TinType
{
    private static final long serialVersionUID = 1L;
    
    public TinTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STOPLINES$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "stopLines");
    private static final javax.xml.namespace.QName BREAKLINES$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "breakLines");
    private static final javax.xml.namespace.QName MAXLENGTH$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "maxLength");
    private static final javax.xml.namespace.QName CONTROLPOINT$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "controlPoint");
    
    
    /**
     * Gets a List of "stopLines" elements
     */
    public java.util.List<net.opengis.gml.LineStringSegmentArrayPropertyType> getStopLinesList()
    {
        final class StopLinesList extends java.util.AbstractList<net.opengis.gml.LineStringSegmentArrayPropertyType>
        {
            @Override
            public net.opengis.gml.LineStringSegmentArrayPropertyType get(int i)
                { return TinTypeImpl.this.getStopLinesArray(i); }
            
            @Override
            public net.opengis.gml.LineStringSegmentArrayPropertyType set(int i, net.opengis.gml.LineStringSegmentArrayPropertyType o)
            {
                net.opengis.gml.LineStringSegmentArrayPropertyType old = TinTypeImpl.this.getStopLinesArray(i);
                TinTypeImpl.this.setStopLinesArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.LineStringSegmentArrayPropertyType o)
                { TinTypeImpl.this.insertNewStopLines(i).set(o); }
            
            @Override
            public net.opengis.gml.LineStringSegmentArrayPropertyType remove(int i)
            {
                net.opengis.gml.LineStringSegmentArrayPropertyType old = TinTypeImpl.this.getStopLinesArray(i);
                TinTypeImpl.this.removeStopLines(i);
                return old;
            }
            
            @Override
            public int size()
                { return TinTypeImpl.this.sizeOfStopLinesArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new StopLinesList();
        }
    }
    
    /**
     * Gets array of all "stopLines" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.LineStringSegmentArrayPropertyType[] getStopLinesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.LineStringSegmentArrayPropertyType> targetList = new java.util.ArrayList<net.opengis.gml.LineStringSegmentArrayPropertyType>();
            get_store().find_all_element_users(STOPLINES$0, targetList);
            net.opengis.gml.LineStringSegmentArrayPropertyType[] result = new net.opengis.gml.LineStringSegmentArrayPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "stopLines" element
     */
    public net.opengis.gml.LineStringSegmentArrayPropertyType getStopLinesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringSegmentArrayPropertyType target = null;
            target = (net.opengis.gml.LineStringSegmentArrayPropertyType)get_store().find_element_user(STOPLINES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "stopLines" element
     */
    public int sizeOfStopLinesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STOPLINES$0);
        }
    }
    
    /**
     * Sets array of all "stopLines" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setStopLinesArray(net.opengis.gml.LineStringSegmentArrayPropertyType[] stopLinesArray)
    {
        check_orphaned();
        arraySetterHelper(stopLinesArray, STOPLINES$0);
    }
    
    /**
     * Sets ith "stopLines" element
     */
     public void setStopLinesArray(int i, net.opengis.gml.LineStringSegmentArrayPropertyType stopLines)
    {
        generatedSetterHelperImpl(stopLines, STOPLINES$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "stopLines" element
     */
    public net.opengis.gml.LineStringSegmentArrayPropertyType insertNewStopLines(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringSegmentArrayPropertyType target = null;
            target = (net.opengis.gml.LineStringSegmentArrayPropertyType)get_store().insert_element_user(STOPLINES$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "stopLines" element
     */
    public net.opengis.gml.LineStringSegmentArrayPropertyType addNewStopLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringSegmentArrayPropertyType target = null;
            target = (net.opengis.gml.LineStringSegmentArrayPropertyType)get_store().add_element_user(STOPLINES$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "stopLines" element
     */
    public void removeStopLines(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STOPLINES$0, i);
        }
    }
    
    /**
     * Gets a List of "breakLines" elements
     */
    public java.util.List<net.opengis.gml.LineStringSegmentArrayPropertyType> getBreakLinesList()
    {
        final class BreakLinesList extends java.util.AbstractList<net.opengis.gml.LineStringSegmentArrayPropertyType>
        {
            @Override
            public net.opengis.gml.LineStringSegmentArrayPropertyType get(int i)
                { return TinTypeImpl.this.getBreakLinesArray(i); }
            
            @Override
            public net.opengis.gml.LineStringSegmentArrayPropertyType set(int i, net.opengis.gml.LineStringSegmentArrayPropertyType o)
            {
                net.opengis.gml.LineStringSegmentArrayPropertyType old = TinTypeImpl.this.getBreakLinesArray(i);
                TinTypeImpl.this.setBreakLinesArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.LineStringSegmentArrayPropertyType o)
                { TinTypeImpl.this.insertNewBreakLines(i).set(o); }
            
            @Override
            public net.opengis.gml.LineStringSegmentArrayPropertyType remove(int i)
            {
                net.opengis.gml.LineStringSegmentArrayPropertyType old = TinTypeImpl.this.getBreakLinesArray(i);
                TinTypeImpl.this.removeBreakLines(i);
                return old;
            }
            
            @Override
            public int size()
                { return TinTypeImpl.this.sizeOfBreakLinesArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BreakLinesList();
        }
    }
    
    /**
     * Gets array of all "breakLines" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.LineStringSegmentArrayPropertyType[] getBreakLinesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.LineStringSegmentArrayPropertyType> targetList = new java.util.ArrayList<net.opengis.gml.LineStringSegmentArrayPropertyType>();
            get_store().find_all_element_users(BREAKLINES$2, targetList);
            net.opengis.gml.LineStringSegmentArrayPropertyType[] result = new net.opengis.gml.LineStringSegmentArrayPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "breakLines" element
     */
    public net.opengis.gml.LineStringSegmentArrayPropertyType getBreakLinesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringSegmentArrayPropertyType target = null;
            target = (net.opengis.gml.LineStringSegmentArrayPropertyType)get_store().find_element_user(BREAKLINES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "breakLines" element
     */
    public int sizeOfBreakLinesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BREAKLINES$2);
        }
    }
    
    /**
     * Sets array of all "breakLines" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setBreakLinesArray(net.opengis.gml.LineStringSegmentArrayPropertyType[] breakLinesArray)
    {
        check_orphaned();
        arraySetterHelper(breakLinesArray, BREAKLINES$2);
    }
    
    /**
     * Sets ith "breakLines" element
     */
     public void setBreakLinesArray(int i, net.opengis.gml.LineStringSegmentArrayPropertyType breakLines)
    {
        generatedSetterHelperImpl(breakLines, BREAKLINES$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "breakLines" element
     */
    public net.opengis.gml.LineStringSegmentArrayPropertyType insertNewBreakLines(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringSegmentArrayPropertyType target = null;
            target = (net.opengis.gml.LineStringSegmentArrayPropertyType)get_store().insert_element_user(BREAKLINES$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "breakLines" element
     */
    public net.opengis.gml.LineStringSegmentArrayPropertyType addNewBreakLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringSegmentArrayPropertyType target = null;
            target = (net.opengis.gml.LineStringSegmentArrayPropertyType)get_store().add_element_user(BREAKLINES$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "breakLines" element
     */
    public void removeBreakLines(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BREAKLINES$2, i);
        }
    }
    
    /**
     * Gets the "maxLength" element
     */
    public net.opengis.gml.LengthType getMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LengthType target = null;
            target = (net.opengis.gml.LengthType)get_store().find_element_user(MAXLENGTH$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "maxLength" element
     */
     public void setMaxLength(net.opengis.gml.LengthType maxLength)
    {
        generatedSetterHelperImpl(maxLength, MAXLENGTH$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "maxLength" element
     */
    public net.opengis.gml.LengthType addNewMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LengthType target = null;
            target = (net.opengis.gml.LengthType)get_store().add_element_user(MAXLENGTH$4);
            return target;
        }
    }
    
    /**
     * Gets the "controlPoint" element
     */
    public net.opengis.gml.TinType.ControlPoint getControlPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TinType.ControlPoint target = null;
            target = (net.opengis.gml.TinType.ControlPoint)get_store().find_element_user(CONTROLPOINT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "controlPoint" element
     */
     public void setControlPoint(net.opengis.gml.TinType.ControlPoint controlPoint)
    {
        generatedSetterHelperImpl(controlPoint, CONTROLPOINT$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "controlPoint" element
     */
    public net.opengis.gml.TinType.ControlPoint addNewControlPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TinType.ControlPoint target = null;
            target = (net.opengis.gml.TinType.ControlPoint)get_store().add_element_user(CONTROLPOINT$6);
            return target;
        }
    }
    /**
     * An XML controlPoint(@http://www.opengis.net/gml).
     *
     * This is a complex type.
     */
    public static class ControlPointImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TinType.ControlPoint
    {
        private static final long serialVersionUID = 1L;
        
        public ControlPointImpl(org.apache.xmlbeans.SchemaType sType)
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
         public void setPosList(net.opengis.gml.DirectPositionListType posList)
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
                    { return ControlPointImpl.this.getPosArray(i); }
                
                @Override
                public net.opengis.gml.DirectPositionType set(int i, net.opengis.gml.DirectPositionType o)
                {
                    net.opengis.gml.DirectPositionType old = ControlPointImpl.this.getPosArray(i);
                    ControlPointImpl.this.setPosArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, net.opengis.gml.DirectPositionType o)
                    { ControlPointImpl.this.insertNewPos(i).set(o); }
                
                @Override
                public net.opengis.gml.DirectPositionType remove(int i)
                {
                    net.opengis.gml.DirectPositionType old = ControlPointImpl.this.getPosArray(i);
                    ControlPointImpl.this.removePos(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ControlPointImpl.this.sizeOfPosArray(); }
                
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
         public void setPosArray(net.opengis.gml.DirectPositionType[] posArray)
        {
            check_orphaned();
            arraySetterHelper(posArray, POS$2);
        }
        
        /**
         * Sets ith "pos" element
         */
         public void setPosArray(int i, net.opengis.gml.DirectPositionType pos)
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
                    { return ControlPointImpl.this.getPointPropertyArray(i); }
                
                @Override
                public net.opengis.gml.PointPropertyType set(int i, net.opengis.gml.PointPropertyType o)
                {
                    net.opengis.gml.PointPropertyType old = ControlPointImpl.this.getPointPropertyArray(i);
                    ControlPointImpl.this.setPointPropertyArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, net.opengis.gml.PointPropertyType o)
                    { ControlPointImpl.this.insertNewPointProperty(i).set(o); }
                
                @Override
                public net.opengis.gml.PointPropertyType remove(int i)
                {
                    net.opengis.gml.PointPropertyType old = ControlPointImpl.this.getPointPropertyArray(i);
                    ControlPointImpl.this.removePointProperty(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ControlPointImpl.this.sizeOfPointPropertyArray(); }
                
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
         public void setPointPropertyArray(net.opengis.gml.PointPropertyType[] pointPropertyArray)
        {
            check_orphaned();
            arraySetterHelper(pointPropertyArray, POINTPROPERTY$4);
        }
        
        /**
         * Sets ith "pointProperty" element
         */
         public void setPointPropertyArray(int i, net.opengis.gml.PointPropertyType pointProperty)
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
