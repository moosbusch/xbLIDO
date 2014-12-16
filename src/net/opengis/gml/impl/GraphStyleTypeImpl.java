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
 * An XML GraphStyleType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class GraphStyleTypeImpl extends net.opengis.gml.impl.BaseStyleDescriptorTypeImpl implements net.opengis.gml.GraphStyleType
{
    private static final long serialVersionUID = 1L;
    
    public GraphStyleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PLANAR$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "planar");
    private static final javax.xml.namespace.QName DIRECTED$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "directed");
    private static final javax.xml.namespace.QName GRID$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "grid");
    private static final javax.xml.namespace.QName MINDISTANCE$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "minDistance");
    private static final javax.xml.namespace.QName MINANGLE$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "minAngle");
    private static final javax.xml.namespace.QName GRAPHTYPE$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "graphType");
    private static final javax.xml.namespace.QName DRAWINGTYPE$12 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "drawingType");
    private static final javax.xml.namespace.QName LINETYPE$14 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "lineType");
    private static final javax.xml.namespace.QName AESTHETICCRITERIA$16 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "aestheticCriteria");
    
    
    /**
     * Gets the "planar" element
     */
    public boolean getPlanar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLANAR$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "planar" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPlanar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PLANAR$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "planar" element
     */
    public boolean isSetPlanar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLANAR$0) != 0;
        }
    }
    
    /**
     * Sets the "planar" element
     */
     public void setPlanar(boolean planar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLANAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLANAR$0);
            }
            target.setBooleanValue(planar);
        }
    }
    
    /**
     * Sets (as xml) the "planar" element
     */
    public void xsetPlanar(org.apache.xmlbeans.XmlBoolean planar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PLANAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PLANAR$0);
            }
            target.set(planar);
        }
    }
    
    /**
     * Unsets the "planar" element
     */
    public void unsetPlanar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLANAR$0, 0);
        }
    }
    
    /**
     * Gets the "directed" element
     */
    public boolean getDirected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTED$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "directed" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetDirected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DIRECTED$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "directed" element
     */
    public boolean isSetDirected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTED$2) != 0;
        }
    }
    
    /**
     * Sets the "directed" element
     */
     public void setDirected(boolean directed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRECTED$2);
            }
            target.setBooleanValue(directed);
        }
    }
    
    /**
     * Sets (as xml) the "directed" element
     */
    public void xsetDirected(org.apache.xmlbeans.XmlBoolean directed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DIRECTED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DIRECTED$2);
            }
            target.set(directed);
        }
    }
    
    /**
     * Unsets the "directed" element
     */
    public void unsetDirected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTED$2, 0);
        }
    }
    
    /**
     * Gets the "grid" element
     */
    public boolean getGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GRID$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "grid" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(GRID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "grid" element
     */
    public boolean isSetGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRID$4) != 0;
        }
    }
    
    /**
     * Sets the "grid" element
     */
     public void setGrid(boolean grid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GRID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GRID$4);
            }
            target.setBooleanValue(grid);
        }
    }
    
    /**
     * Sets (as xml) the "grid" element
     */
    public void xsetGrid(org.apache.xmlbeans.XmlBoolean grid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(GRID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(GRID$4);
            }
            target.set(grid);
        }
    }
    
    /**
     * Unsets the "grid" element
     */
    public void unsetGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRID$4, 0);
        }
    }
    
    /**
     * Gets the "minDistance" element
     */
    public double getMinDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINDISTANCE$6, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "minDistance" element
     */
    public org.apache.xmlbeans.XmlDouble xgetMinDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MINDISTANCE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "minDistance" element
     */
    public boolean isSetMinDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINDISTANCE$6) != 0;
        }
    }
    
    /**
     * Sets the "minDistance" element
     */
     public void setMinDistance(double minDistance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINDISTANCE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINDISTANCE$6);
            }
            target.setDoubleValue(minDistance);
        }
    }
    
    /**
     * Sets (as xml) the "minDistance" element
     */
    public void xsetMinDistance(org.apache.xmlbeans.XmlDouble minDistance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MINDISTANCE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MINDISTANCE$6);
            }
            target.set(minDistance);
        }
    }
    
    /**
     * Unsets the "minDistance" element
     */
    public void unsetMinDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINDISTANCE$6, 0);
        }
    }
    
    /**
     * Gets the "minAngle" element
     */
    public double getMinAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINANGLE$8, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "minAngle" element
     */
    public org.apache.xmlbeans.XmlDouble xgetMinAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MINANGLE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "minAngle" element
     */
    public boolean isSetMinAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINANGLE$8) != 0;
        }
    }
    
    /**
     * Sets the "minAngle" element
     */
     public void setMinAngle(double minAngle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINANGLE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINANGLE$8);
            }
            target.setDoubleValue(minAngle);
        }
    }
    
    /**
     * Sets (as xml) the "minAngle" element
     */
    public void xsetMinAngle(org.apache.xmlbeans.XmlDouble minAngle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MINANGLE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MINANGLE$8);
            }
            target.set(minAngle);
        }
    }
    
    /**
     * Unsets the "minAngle" element
     */
    public void unsetMinAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINANGLE$8, 0);
        }
    }
    
    /**
     * Gets the "graphType" element
     */
    public net.opengis.gml.GraphTypeType.Enum getGraphType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GRAPHTYPE$10, 0);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.GraphTypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "graphType" element
     */
    public net.opengis.gml.GraphTypeType xgetGraphType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GraphTypeType target = null;
            target = (net.opengis.gml.GraphTypeType)get_store().find_element_user(GRAPHTYPE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "graphType" element
     */
    public boolean isSetGraphType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRAPHTYPE$10) != 0;
        }
    }
    
    /**
     * Sets the "graphType" element
     */
     public void setGraphType(net.opengis.gml.GraphTypeType.Enum graphType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GRAPHTYPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GRAPHTYPE$10);
            }
            target.setEnumValue(graphType);
        }
    }
    
    /**
     * Sets (as xml) the "graphType" element
     */
    public void xsetGraphType(net.opengis.gml.GraphTypeType graphType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GraphTypeType target = null;
            target = (net.opengis.gml.GraphTypeType)get_store().find_element_user(GRAPHTYPE$10, 0);
            if (target == null)
            {
                target = (net.opengis.gml.GraphTypeType)get_store().add_element_user(GRAPHTYPE$10);
            }
            target.set(graphType);
        }
    }
    
    /**
     * Unsets the "graphType" element
     */
    public void unsetGraphType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRAPHTYPE$10, 0);
        }
    }
    
    /**
     * Gets the "drawingType" element
     */
    public net.opengis.gml.DrawingTypeType.Enum getDrawingType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DRAWINGTYPE$12, 0);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.DrawingTypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "drawingType" element
     */
    public net.opengis.gml.DrawingTypeType xgetDrawingType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DrawingTypeType target = null;
            target = (net.opengis.gml.DrawingTypeType)get_store().find_element_user(DRAWINGTYPE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "drawingType" element
     */
    public boolean isSetDrawingType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DRAWINGTYPE$12) != 0;
        }
    }
    
    /**
     * Sets the "drawingType" element
     */
     public void setDrawingType(net.opengis.gml.DrawingTypeType.Enum drawingType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DRAWINGTYPE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DRAWINGTYPE$12);
            }
            target.setEnumValue(drawingType);
        }
    }
    
    /**
     * Sets (as xml) the "drawingType" element
     */
    public void xsetDrawingType(net.opengis.gml.DrawingTypeType drawingType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DrawingTypeType target = null;
            target = (net.opengis.gml.DrawingTypeType)get_store().find_element_user(DRAWINGTYPE$12, 0);
            if (target == null)
            {
                target = (net.opengis.gml.DrawingTypeType)get_store().add_element_user(DRAWINGTYPE$12);
            }
            target.set(drawingType);
        }
    }
    
    /**
     * Unsets the "drawingType" element
     */
    public void unsetDrawingType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DRAWINGTYPE$12, 0);
        }
    }
    
    /**
     * Gets the "lineType" element
     */
    public net.opengis.gml.LineTypeType.Enum getLineType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINETYPE$14, 0);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.LineTypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "lineType" element
     */
    public net.opengis.gml.LineTypeType xgetLineType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineTypeType target = null;
            target = (net.opengis.gml.LineTypeType)get_store().find_element_user(LINETYPE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "lineType" element
     */
    public boolean isSetLineType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINETYPE$14) != 0;
        }
    }
    
    /**
     * Sets the "lineType" element
     */
     public void setLineType(net.opengis.gml.LineTypeType.Enum lineType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINETYPE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINETYPE$14);
            }
            target.setEnumValue(lineType);
        }
    }
    
    /**
     * Sets (as xml) the "lineType" element
     */
    public void xsetLineType(net.opengis.gml.LineTypeType lineType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineTypeType target = null;
            target = (net.opengis.gml.LineTypeType)get_store().find_element_user(LINETYPE$14, 0);
            if (target == null)
            {
                target = (net.opengis.gml.LineTypeType)get_store().add_element_user(LINETYPE$14);
            }
            target.set(lineType);
        }
    }
    
    /**
     * Unsets the "lineType" element
     */
    public void unsetLineType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINETYPE$14, 0);
        }
    }
    
    /**
     * Gets a List of "aestheticCriteria" elements
     */
    public java.util.List<net.opengis.gml.AesheticCriteriaType.Enum> getAestheticCriteriaList()
    {
        final class AestheticCriteriaList extends java.util.AbstractList<net.opengis.gml.AesheticCriteriaType.Enum>
        {
            @Override
            public net.opengis.gml.AesheticCriteriaType.Enum get(int i)
                { return GraphStyleTypeImpl.this.getAestheticCriteriaArray(i); }
            
            @Override
            public net.opengis.gml.AesheticCriteriaType.Enum set(int i, net.opengis.gml.AesheticCriteriaType.Enum o)
            {
                net.opengis.gml.AesheticCriteriaType.Enum old = GraphStyleTypeImpl.this.getAestheticCriteriaArray(i);
                GraphStyleTypeImpl.this.setAestheticCriteriaArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.AesheticCriteriaType.Enum o)
                { GraphStyleTypeImpl.this.insertAestheticCriteria(i, o); }
            
            @Override
            public net.opengis.gml.AesheticCriteriaType.Enum remove(int i)
            {
                net.opengis.gml.AesheticCriteriaType.Enum old = GraphStyleTypeImpl.this.getAestheticCriteriaArray(i);
                GraphStyleTypeImpl.this.removeAestheticCriteria(i);
                return old;
            }
            
            @Override
            public int size()
                { return GraphStyleTypeImpl.this.sizeOfAestheticCriteriaArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AestheticCriteriaList();
        }
    }
    
    /**
     * Gets array of all "aestheticCriteria" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.AesheticCriteriaType.Enum[] getAestheticCriteriaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.AesheticCriteriaType> targetList = new java.util.ArrayList<net.opengis.gml.AesheticCriteriaType>();
            get_store().find_all_element_users(AESTHETICCRITERIA$16, targetList);
            net.opengis.gml.AesheticCriteriaType.Enum[] result = new net.opengis.gml.AesheticCriteriaType.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (net.opengis.gml.AesheticCriteriaType.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "aestheticCriteria" element
     */
    public net.opengis.gml.AesheticCriteriaType.Enum getAestheticCriteriaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AESTHETICCRITERIA$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (net.opengis.gml.AesheticCriteriaType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "aestheticCriteria" elements
     */
    public java.util.List<net.opengis.gml.AesheticCriteriaType> xgetAestheticCriteriaList()
    {
        final class AestheticCriteriaList extends java.util.AbstractList<net.opengis.gml.AesheticCriteriaType>
        {
            @Override
            public net.opengis.gml.AesheticCriteriaType get(int i)
                { return GraphStyleTypeImpl.this.xgetAestheticCriteriaArray(i); }
            
            @Override
            public net.opengis.gml.AesheticCriteriaType set(int i, net.opengis.gml.AesheticCriteriaType o)
            {
                net.opengis.gml.AesheticCriteriaType old = GraphStyleTypeImpl.this.xgetAestheticCriteriaArray(i);
                GraphStyleTypeImpl.this.xsetAestheticCriteriaArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.AesheticCriteriaType o)
                { GraphStyleTypeImpl.this.insertNewAestheticCriteria(i).set(o); }
            
            @Override
            public net.opengis.gml.AesheticCriteriaType remove(int i)
            {
                net.opengis.gml.AesheticCriteriaType old = GraphStyleTypeImpl.this.xgetAestheticCriteriaArray(i);
                GraphStyleTypeImpl.this.removeAestheticCriteria(i);
                return old;
            }
            
            @Override
            public int size()
                { return GraphStyleTypeImpl.this.sizeOfAestheticCriteriaArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AestheticCriteriaList();
        }
    }
    
    /**
     * Gets array of all "aestheticCriteria" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.AesheticCriteriaType[] xgetAestheticCriteriaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.AesheticCriteriaType> targetList = new java.util.ArrayList<net.opengis.gml.AesheticCriteriaType>();
            get_store().find_all_element_users(AESTHETICCRITERIA$16, targetList);
            net.opengis.gml.AesheticCriteriaType[] result = new net.opengis.gml.AesheticCriteriaType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "aestheticCriteria" element
     */
    public net.opengis.gml.AesheticCriteriaType xgetAestheticCriteriaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AesheticCriteriaType target = null;
            target = (net.opengis.gml.AesheticCriteriaType)get_store().find_element_user(AESTHETICCRITERIA$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "aestheticCriteria" element
     */
    public int sizeOfAestheticCriteriaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AESTHETICCRITERIA$16);
        }
    }
    
    /**
     * Sets array of all "aestheticCriteria" element
     */
     public void setAestheticCriteriaArray(net.opengis.gml.AesheticCriteriaType.Enum[] aestheticCriteriaArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(aestheticCriteriaArray, AESTHETICCRITERIA$16);
        }
    }
    
    /**
     * Sets ith "aestheticCriteria" element
     */
     public void setAestheticCriteriaArray(int i, net.opengis.gml.AesheticCriteriaType.Enum aestheticCriteria)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AESTHETICCRITERIA$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(aestheticCriteria);
        }
    }
    
    /**
     * Sets (as xml) array of all "aestheticCriteria" element
     */
    public void xsetAestheticCriteriaArray(net.opengis.gml.AesheticCriteriaType[]aestheticCriteriaArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(aestheticCriteriaArray, AESTHETICCRITERIA$16);
        }
    }
    
    /**
     * Sets (as xml) ith "aestheticCriteria" element
     */
    public void xsetAestheticCriteriaArray(int i, net.opengis.gml.AesheticCriteriaType aestheticCriteria)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AesheticCriteriaType target = null;
            target = (net.opengis.gml.AesheticCriteriaType)get_store().find_element_user(AESTHETICCRITERIA$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(aestheticCriteria);
        }
    }
    
    /**
     * Inserts the value as the ith "aestheticCriteria" element
     */
    public void insertAestheticCriteria(int i, net.opengis.gml.AesheticCriteriaType.Enum aestheticCriteria)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(AESTHETICCRITERIA$16, i);
            target.setEnumValue(aestheticCriteria);
        }
    }
    
    /**
     * Appends the value as the last "aestheticCriteria" element
     */
    public void addAestheticCriteria(net.opengis.gml.AesheticCriteriaType.Enum aestheticCriteria)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AESTHETICCRITERIA$16);
            target.setEnumValue(aestheticCriteria);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "aestheticCriteria" element
     */
    public net.opengis.gml.AesheticCriteriaType insertNewAestheticCriteria(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AesheticCriteriaType target = null;
            target = (net.opengis.gml.AesheticCriteriaType)get_store().insert_element_user(AESTHETICCRITERIA$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "aestheticCriteria" element
     */
    public net.opengis.gml.AesheticCriteriaType addNewAestheticCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AesheticCriteriaType target = null;
            target = (net.opengis.gml.AesheticCriteriaType)get_store().add_element_user(AESTHETICCRITERIA$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "aestheticCriteria" element
     */
    public void removeAestheticCriteria(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AESTHETICCRITERIA$16, i);
        }
    }
}
