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
 * An XML ValuePropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class ValuePropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ValuePropertyType
{
    private static final long serialVersionUID = 1L;
    
    public ValuePropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOOLEAN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Boolean");
    private static final javax.xml.namespace.QName CATEGORY$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Category");
    private static final javax.xml.namespace.QName QUANTITY$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Quantity");
    private static final javax.xml.namespace.QName COUNT$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Count");
    private static final javax.xml.namespace.QName BOOLEANLIST$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "BooleanList");
    private static final javax.xml.namespace.QName CATEGORYLIST$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CategoryList");
    private static final javax.xml.namespace.QName QUANTITYLIST$12 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "QuantityList");
    private static final javax.xml.namespace.QName COUNTLIST$14 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CountList");
    private static final javax.xml.namespace.QName CATEGORYEXTENT$16 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CategoryExtent");
    private static final javax.xml.namespace.QName QUANTITYEXTENT$18 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "QuantityExtent");
    private static final javax.xml.namespace.QName COUNTEXTENT$20 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CountExtent");
    private static final javax.xml.namespace.QName COMPOSITEVALUE$22 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeValue");
    private static final org.apache.xmlbeans.QNameSet COMPOSITEVALUE$23 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeValue"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ValueArray"),
    });
    private static final javax.xml.namespace.QName OBJECT$24 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Object");
    private static final org.apache.xmlbeans.QNameSet OBJECT$25 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "UnitDefinition"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OperationParameterGroup"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiLineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSolidCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeodeticDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeometricAggregate"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Conversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GraphStyle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_FeatureCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GridCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralConversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectedObservation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Style"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TriangulatedSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LinearRing"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ConcatenatedOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DefinitionCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Datum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CylindricalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "RectifiedGridCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "FeatureCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimePrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PrimeMeridian"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeCalendar"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "RectifiedGrid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ConventionalUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "FeatureStyle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeometricComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TopoPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "VerticalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CoordinateSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeTopologyComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_MetaData"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Solid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Feature"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "EngineeringCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "EllipsoidalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PolarCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeObject"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Topology"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Ring"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OrientableCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TemporalCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Geometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OperationMethod"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPolygon"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Solid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_ReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Bag"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeCalendarEra"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CoordinateOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiCurveCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CoordinateReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TopoComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiGeometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompoundCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSurfaceCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_ContinuousCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_SingleOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PolyhedralSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralDerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MovingObjectStatus"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimePeriod"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Edge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Coverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Ellipsoid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Curve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPointCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeSlice"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ImageCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PassThroughOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GML"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "VerticalDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeTopologyPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeCoordinateSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TemporalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectedObservationAtDistance"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TopologyStyle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TemporalDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeEdge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeNode"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Curve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeographicCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Node"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Array"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ImageDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_ImplicitGeometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OperationParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeocentricCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "EngineeringDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Transformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeClock"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CartesianCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LinearCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GenericMetaData"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "SphericalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Surface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Point"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TopoSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Style"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Observation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeOrdinalReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "BaseUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OrientableSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Object"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ProjectedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Tin"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeometryStyle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_DiscreteCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Definition"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ObliqueCartesianCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Face"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Surface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralOperationParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Polygon"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DefinitionProxy"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LabelStyle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeGeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Operation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CoordinateSystemAxis"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "UserDefinedCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Ring"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralTransformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Dictionary"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "VerticalCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DerivedUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Grid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeInstant"),
    });
    private static final javax.xml.namespace.QName NULL$26 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Null");
    private static final javax.xml.namespace.QName TYPE$28 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "type");
    private static final javax.xml.namespace.QName HREF$30 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "href");
    private static final javax.xml.namespace.QName ROLE$32 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "role");
    private static final javax.xml.namespace.QName ARCROLE$34 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "arcrole");
    private static final javax.xml.namespace.QName TITLE$36 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "title");
    private static final javax.xml.namespace.QName SHOW$38 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "show");
    private static final javax.xml.namespace.QName ACTUATE$40 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "actuate");
    private static final javax.xml.namespace.QName REMOTESCHEMA$42 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "remoteSchema");
    
    
    /**
     * Gets the "Boolean" element
     */
    public boolean getBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEAN$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Boolean" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOLEAN$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Boolean" element
     */
    public boolean isSetBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOOLEAN$0) != 0;
        }
    }
    
    /**
     * Sets the "Boolean" element
     */
     public void setBoolean(boolean xboolean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEAN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOOLEAN$0);
            }
            target.setBooleanValue(xboolean);
        }
    }
    
    /**
     * Sets (as xml) the "Boolean" element
     */
    public void xsetBoolean(org.apache.xmlbeans.XmlBoolean xboolean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOLEAN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(BOOLEAN$0);
            }
            target.set(xboolean);
        }
    }
    
    /**
     * Unsets the "Boolean" element
     */
    public void unsetBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOOLEAN$0, 0);
        }
    }
    
    /**
     * Gets the "Category" element
     */
    public net.opengis.gml.CodeType getCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(CATEGORY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Category" element
     */
    public boolean isSetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORY$2) != 0;
        }
    }
    
    /**
     * Sets the "Category" element
     */
     public void setCategory(net.opengis.gml.CodeType category)
    {
        generatedSetterHelperImpl(category, CATEGORY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Category" element
     */
    public net.opengis.gml.CodeType addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(CATEGORY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Category" element
     */
    public void unsetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORY$2, 0);
        }
    }
    
    /**
     * Gets the "Quantity" element
     */
    public net.opengis.gml.MeasureType getQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().find_element_user(QUANTITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Quantity" element
     */
    public boolean isSetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITY$4) != 0;
        }
    }
    
    /**
     * Sets the "Quantity" element
     */
     public void setQuantity(net.opengis.gml.MeasureType quantity)
    {
        generatedSetterHelperImpl(quantity, QUANTITY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Quantity" element
     */
    public net.opengis.gml.MeasureType addNewQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().add_element_user(QUANTITY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Quantity" element
     */
    public void unsetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITY$4, 0);
        }
    }
    
    /**
     * Gets the "Count" element
     */
    public java.math.BigInteger getCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Count" element
     */
    public org.apache.xmlbeans.XmlInteger xgetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(COUNT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Count" element
     */
    public boolean isSetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNT$6) != 0;
        }
    }
    
    /**
     * Sets the "Count" element
     */
     public void setCount(java.math.BigInteger count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNT$6);
            }
            target.setBigIntegerValue(count);
        }
    }
    
    /**
     * Sets (as xml) the "Count" element
     */
    public void xsetCount(org.apache.xmlbeans.XmlInteger count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(COUNT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(COUNT$6);
            }
            target.set(count);
        }
    }
    
    /**
     * Unsets the "Count" element
     */
    public void unsetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNT$6, 0);
        }
    }
    
    /**
     * Gets the "BooleanList" element
     */
    public java.util.List getBooleanList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEANLIST$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "BooleanList" element
     */
    public net.opengis.gml.BooleanOrNullList xgetBooleanList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BooleanOrNullList target = null;
            target = (net.opengis.gml.BooleanOrNullList)get_store().find_element_user(BOOLEANLIST$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "BooleanList" element
     */
    public boolean isSetBooleanList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOOLEANLIST$8) != 0;
        }
    }
    
    /**
     * Sets the "BooleanList" element
     */
     public void setBooleanList(java.util.List booleanList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEANLIST$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOOLEANLIST$8);
            }
            target.setListValue(booleanList);
        }
    }
    
    /**
     * Sets (as xml) the "BooleanList" element
     */
    public void xsetBooleanList(net.opengis.gml.BooleanOrNullList booleanList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BooleanOrNullList target = null;
            target = (net.opengis.gml.BooleanOrNullList)get_store().find_element_user(BOOLEANLIST$8, 0);
            if (target == null)
            {
                target = (net.opengis.gml.BooleanOrNullList)get_store().add_element_user(BOOLEANLIST$8);
            }
            target.set(booleanList);
        }
    }
    
    /**
     * Unsets the "BooleanList" element
     */
    public void unsetBooleanList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOOLEANLIST$8, 0);
        }
    }
    
    /**
     * Gets the "CategoryList" element
     */
    public net.opengis.gml.CodeOrNullListType getCategoryList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeOrNullListType target = null;
            target = (net.opengis.gml.CodeOrNullListType)get_store().find_element_user(CATEGORYLIST$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CategoryList" element
     */
    public boolean isSetCategoryList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYLIST$10) != 0;
        }
    }
    
    /**
     * Sets the "CategoryList" element
     */
     public void setCategoryList(net.opengis.gml.CodeOrNullListType categoryList)
    {
        generatedSetterHelperImpl(categoryList, CATEGORYLIST$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CategoryList" element
     */
    public net.opengis.gml.CodeOrNullListType addNewCategoryList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeOrNullListType target = null;
            target = (net.opengis.gml.CodeOrNullListType)get_store().add_element_user(CATEGORYLIST$10);
            return target;
        }
    }
    
    /**
     * Unsets the "CategoryList" element
     */
    public void unsetCategoryList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYLIST$10, 0);
        }
    }
    
    /**
     * Gets the "QuantityList" element
     */
    public net.opengis.gml.MeasureOrNullListType getQuantityList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureOrNullListType target = null;
            target = (net.opengis.gml.MeasureOrNullListType)get_store().find_element_user(QUANTITYLIST$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "QuantityList" element
     */
    public boolean isSetQuantityList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITYLIST$12) != 0;
        }
    }
    
    /**
     * Sets the "QuantityList" element
     */
     public void setQuantityList(net.opengis.gml.MeasureOrNullListType quantityList)
    {
        generatedSetterHelperImpl(quantityList, QUANTITYLIST$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "QuantityList" element
     */
    public net.opengis.gml.MeasureOrNullListType addNewQuantityList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureOrNullListType target = null;
            target = (net.opengis.gml.MeasureOrNullListType)get_store().add_element_user(QUANTITYLIST$12);
            return target;
        }
    }
    
    /**
     * Unsets the "QuantityList" element
     */
    public void unsetQuantityList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITYLIST$12, 0);
        }
    }
    
    /**
     * Gets the "CountList" element
     */
    public java.util.List getCountList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTLIST$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "CountList" element
     */
    public net.opengis.gml.IntegerOrNullList xgetCountList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IntegerOrNullList target = null;
            target = (net.opengis.gml.IntegerOrNullList)get_store().find_element_user(COUNTLIST$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "CountList" element
     */
    public boolean isSetCountList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTLIST$14) != 0;
        }
    }
    
    /**
     * Sets the "CountList" element
     */
     public void setCountList(java.util.List countList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTLIST$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTLIST$14);
            }
            target.setListValue(countList);
        }
    }
    
    /**
     * Sets (as xml) the "CountList" element
     */
    public void xsetCountList(net.opengis.gml.IntegerOrNullList countList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IntegerOrNullList target = null;
            target = (net.opengis.gml.IntegerOrNullList)get_store().find_element_user(COUNTLIST$14, 0);
            if (target == null)
            {
                target = (net.opengis.gml.IntegerOrNullList)get_store().add_element_user(COUNTLIST$14);
            }
            target.set(countList);
        }
    }
    
    /**
     * Unsets the "CountList" element
     */
    public void unsetCountList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTLIST$14, 0);
        }
    }
    
    /**
     * Gets the "CategoryExtent" element
     */
    public net.opengis.gml.CategoryExtentType getCategoryExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CategoryExtentType target = null;
            target = (net.opengis.gml.CategoryExtentType)get_store().find_element_user(CATEGORYEXTENT$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CategoryExtent" element
     */
    public boolean isSetCategoryExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYEXTENT$16) != 0;
        }
    }
    
    /**
     * Sets the "CategoryExtent" element
     */
     public void setCategoryExtent(net.opengis.gml.CategoryExtentType categoryExtent)
    {
        generatedSetterHelperImpl(categoryExtent, CATEGORYEXTENT$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CategoryExtent" element
     */
    public net.opengis.gml.CategoryExtentType addNewCategoryExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CategoryExtentType target = null;
            target = (net.opengis.gml.CategoryExtentType)get_store().add_element_user(CATEGORYEXTENT$16);
            return target;
        }
    }
    
    /**
     * Unsets the "CategoryExtent" element
     */
    public void unsetCategoryExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYEXTENT$16, 0);
        }
    }
    
    /**
     * Gets the "QuantityExtent" element
     */
    public net.opengis.gml.QuantityExtentType getQuantityExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.QuantityExtentType target = null;
            target = (net.opengis.gml.QuantityExtentType)get_store().find_element_user(QUANTITYEXTENT$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "QuantityExtent" element
     */
    public boolean isSetQuantityExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITYEXTENT$18) != 0;
        }
    }
    
    /**
     * Sets the "QuantityExtent" element
     */
     public void setQuantityExtent(net.opengis.gml.QuantityExtentType quantityExtent)
    {
        generatedSetterHelperImpl(quantityExtent, QUANTITYEXTENT$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "QuantityExtent" element
     */
    public net.opengis.gml.QuantityExtentType addNewQuantityExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.QuantityExtentType target = null;
            target = (net.opengis.gml.QuantityExtentType)get_store().add_element_user(QUANTITYEXTENT$18);
            return target;
        }
    }
    
    /**
     * Unsets the "QuantityExtent" element
     */
    public void unsetQuantityExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITYEXTENT$18, 0);
        }
    }
    
    /**
     * Gets the "CountExtent" element
     */
    public java.util.List getCountExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTEXTENT$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "CountExtent" element
     */
    public net.opengis.gml.CountExtentType xgetCountExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CountExtentType target = null;
            target = (net.opengis.gml.CountExtentType)get_store().find_element_user(COUNTEXTENT$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "CountExtent" element
     */
    public boolean isSetCountExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTEXTENT$20) != 0;
        }
    }
    
    /**
     * Sets the "CountExtent" element
     */
     public void setCountExtent(java.util.List countExtent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTEXTENT$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTEXTENT$20);
            }
            target.setListValue(countExtent);
        }
    }
    
    /**
     * Sets (as xml) the "CountExtent" element
     */
    public void xsetCountExtent(net.opengis.gml.CountExtentType countExtent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CountExtentType target = null;
            target = (net.opengis.gml.CountExtentType)get_store().find_element_user(COUNTEXTENT$20, 0);
            if (target == null)
            {
                target = (net.opengis.gml.CountExtentType)get_store().add_element_user(COUNTEXTENT$20);
            }
            target.set(countExtent);
        }
    }
    
    /**
     * Unsets the "CountExtent" element
     */
    public void unsetCountExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTEXTENT$20, 0);
        }
    }
    
    /**
     * Gets the "CompositeValue" element
     */
    public net.opengis.gml.CompositeValueType getCompositeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompositeValueType target = null;
            target = (net.opengis.gml.CompositeValueType)get_store().find_element_user(COMPOSITEVALUE$23, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CompositeValue" element
     */
    public boolean isSetCompositeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPOSITEVALUE$23) != 0;
        }
    }
    
    /**
     * Sets the "CompositeValue" element
     */
     public void setCompositeValue(net.opengis.gml.CompositeValueType compositeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompositeValueType target = null;
            target = (net.opengis.gml.CompositeValueType)get_store().find_element_user(COMPOSITEVALUE$23, 0);
            if (target == null)
            {
                target = (net.opengis.gml.CompositeValueType)get_store().add_element_user(COMPOSITEVALUE$22);
            }
            target.set(compositeValue);
        }
    }
    
    /**
     * Appends and returns a new empty "CompositeValue" element
     */
    public net.opengis.gml.CompositeValueType addNewCompositeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompositeValueType target = null;
            target = (net.opengis.gml.CompositeValueType)get_store().add_element_user(COMPOSITEVALUE$22);
            return target;
        }
    }
    
    /**
     * Unsets the "CompositeValue" element
     */
    public void unsetCompositeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPOSITEVALUE$23, 0);
        }
    }
    
    /**
     * Gets the "_Object" element
     */
    public org.apache.xmlbeans.XmlObject getObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(OBJECT$25, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "_Object" element
     */
    public boolean isSetObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECT$25) != 0;
        }
    }
    
    /**
     * Sets the "_Object" element
     */
     public void setObject(org.apache.xmlbeans.XmlObject object)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(OBJECT$25, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(OBJECT$24);
            }
            target.set(object);
        }
    }
    
    /**
     * Appends and returns a new empty "_Object" element
     */
    public org.apache.xmlbeans.XmlObject addNewObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(OBJECT$24);
            return target;
        }
    }
    
    /**
     * Unsets the "_Object" element
     */
    public void unsetObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECT$25, 0);
        }
    }
    
    /**
     * Gets the "Null" element
     */
    public java.lang.Object getNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NULL$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "Null" element
     */
    public net.opengis.gml.NullType xgetNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.NullType target = null;
            target = (net.opengis.gml.NullType)get_store().find_element_user(NULL$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "Null" element
     */
    public boolean isSetNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NULL$26) != 0;
        }
    }
    
    /**
     * Sets the "Null" element
     */
     public void setNull(java.lang.Object xnull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NULL$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NULL$26);
            }
            target.setObjectValue(xnull);
        }
    }
    
    /**
     * Sets (as xml) the "Null" element
     */
    public void xsetNull(net.opengis.gml.NullType xnull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.NullType target = null;
            target = (net.opengis.gml.NullType)get_store().find_element_user(NULL$26, 0);
            if (target == null)
            {
                target = (net.opengis.gml.NullType)get_store().add_element_user(NULL$26);
            }
            target.set(xnull);
        }
    }
    
    /**
     * Unsets the "Null" element
     */
    public void unsetNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NULL$26, 0);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.w3.x1999.xlink.TypeType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$28);
            }
            if (target == null)
            {
                return null;
            }
            return (org.w3.x1999.xlink.TypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.w3.x1999.xlink.TypeType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TypeType target = null;
            target = (org.w3.x1999.xlink.TypeType)get_store().find_attribute_user(TYPE$28);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.TypeType)get_default_attribute_value(TYPE$28);
            }
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$28) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
     public void setType(org.w3.x1999.xlink.TypeType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$28);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.w3.x1999.xlink.TypeType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TypeType target = null;
            target = (org.w3.x1999.xlink.TypeType)get_store().find_attribute_user(TYPE$28);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.TypeType)get_store().add_attribute_user(TYPE$28);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$28);
        }
    }
    
    /**
     * Gets the "href" attribute
     */
    public java.lang.String getHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$30);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "href" attribute
     */
    public org.w3.x1999.xlink.HrefType xgetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.HrefType target = null;
            target = (org.w3.x1999.xlink.HrefType)get_store().find_attribute_user(HREF$30);
            return target;
        }
    }
    
    /**
     * True if has "href" attribute
     */
    public boolean isSetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HREF$30) != null;
        }
    }
    
    /**
     * Sets the "href" attribute
     */
     public void setHref(java.lang.String href)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$30);
            }
            target.setStringValue(href);
        }
    }
    
    /**
     * Sets (as xml) the "href" attribute
     */
    public void xsetHref(org.w3.x1999.xlink.HrefType href)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.HrefType target = null;
            target = (org.w3.x1999.xlink.HrefType)get_store().find_attribute_user(HREF$30);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.HrefType)get_store().add_attribute_user(HREF$30);
            }
            target.set(href);
        }
    }
    
    /**
     * Unsets the "href" attribute
     */
    public void unsetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HREF$30);
        }
    }
    
    /**
     * Gets the "role" attribute
     */
    public java.lang.String getRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$32);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "role" attribute
     */
    public org.w3.x1999.xlink.RoleType xgetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.RoleType target = null;
            target = (org.w3.x1999.xlink.RoleType)get_store().find_attribute_user(ROLE$32);
            return target;
        }
    }
    
    /**
     * True if has "role" attribute
     */
    public boolean isSetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROLE$32) != null;
        }
    }
    
    /**
     * Sets the "role" attribute
     */
     public void setRole(java.lang.String role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROLE$32);
            }
            target.setStringValue(role);
        }
    }
    
    /**
     * Sets (as xml) the "role" attribute
     */
    public void xsetRole(org.w3.x1999.xlink.RoleType role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.RoleType target = null;
            target = (org.w3.x1999.xlink.RoleType)get_store().find_attribute_user(ROLE$32);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.RoleType)get_store().add_attribute_user(ROLE$32);
            }
            target.set(role);
        }
    }
    
    /**
     * Unsets the "role" attribute
     */
    public void unsetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROLE$32);
        }
    }
    
    /**
     * Gets the "arcrole" attribute
     */
    public java.lang.String getArcrole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARCROLE$34);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "arcrole" attribute
     */
    public org.w3.x1999.xlink.ArcroleType xgetArcrole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ArcroleType target = null;
            target = (org.w3.x1999.xlink.ArcroleType)get_store().find_attribute_user(ARCROLE$34);
            return target;
        }
    }
    
    /**
     * True if has "arcrole" attribute
     */
    public boolean isSetArcrole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ARCROLE$34) != null;
        }
    }
    
    /**
     * Sets the "arcrole" attribute
     */
     public void setArcrole(java.lang.String arcrole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARCROLE$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ARCROLE$34);
            }
            target.setStringValue(arcrole);
        }
    }
    
    /**
     * Sets (as xml) the "arcrole" attribute
     */
    public void xsetArcrole(org.w3.x1999.xlink.ArcroleType arcrole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ArcroleType target = null;
            target = (org.w3.x1999.xlink.ArcroleType)get_store().find_attribute_user(ARCROLE$34);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.ArcroleType)get_store().add_attribute_user(ARCROLE$34);
            }
            target.set(arcrole);
        }
    }
    
    /**
     * Unsets the "arcrole" attribute
     */
    public void unsetArcrole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ARCROLE$34);
        }
    }
    
    /**
     * Gets the "title" attribute
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$36);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" attribute
     */
    public org.w3.x1999.xlink.TitleAttrType xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TitleAttrType target = null;
            target = (org.w3.x1999.xlink.TitleAttrType)get_store().find_attribute_user(TITLE$36);
            return target;
        }
    }
    
    /**
     * True if has "title" attribute
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TITLE$36) != null;
        }
    }
    
    /**
     * Sets the "title" attribute
     */
     public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$36);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "title" attribute
     */
    public void xsetTitle(org.w3.x1999.xlink.TitleAttrType title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TitleAttrType target = null;
            target = (org.w3.x1999.xlink.TitleAttrType)get_store().find_attribute_user(TITLE$36);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.TitleAttrType)get_store().add_attribute_user(TITLE$36);
            }
            target.set(title);
        }
    }
    
    /**
     * Unsets the "title" attribute
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TITLE$36);
        }
    }
    
    /**
     * Gets the "show" attribute
     */
    public org.w3.x1999.xlink.ShowType.Enum getShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOW$38);
            if (target == null)
            {
                return null;
            }
            return (org.w3.x1999.xlink.ShowType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "show" attribute
     */
    public org.w3.x1999.xlink.ShowType xgetShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ShowType target = null;
            target = (org.w3.x1999.xlink.ShowType)get_store().find_attribute_user(SHOW$38);
            return target;
        }
    }
    
    /**
     * True if has "show" attribute
     */
    public boolean isSetShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOW$38) != null;
        }
    }
    
    /**
     * Sets the "show" attribute
     */
     public void setShow(org.w3.x1999.xlink.ShowType.Enum show)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOW$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOW$38);
            }
            target.setEnumValue(show);
        }
    }
    
    /**
     * Sets (as xml) the "show" attribute
     */
    public void xsetShow(org.w3.x1999.xlink.ShowType show)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ShowType target = null;
            target = (org.w3.x1999.xlink.ShowType)get_store().find_attribute_user(SHOW$38);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.ShowType)get_store().add_attribute_user(SHOW$38);
            }
            target.set(show);
        }
    }
    
    /**
     * Unsets the "show" attribute
     */
    public void unsetShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOW$38);
        }
    }
    
    /**
     * Gets the "actuate" attribute
     */
    public org.w3.x1999.xlink.ActuateType.Enum getActuate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTUATE$40);
            if (target == null)
            {
                return null;
            }
            return (org.w3.x1999.xlink.ActuateType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "actuate" attribute
     */
    public org.w3.x1999.xlink.ActuateType xgetActuate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ActuateType target = null;
            target = (org.w3.x1999.xlink.ActuateType)get_store().find_attribute_user(ACTUATE$40);
            return target;
        }
    }
    
    /**
     * True if has "actuate" attribute
     */
    public boolean isSetActuate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTUATE$40) != null;
        }
    }
    
    /**
     * Sets the "actuate" attribute
     */
     public void setActuate(org.w3.x1999.xlink.ActuateType.Enum actuate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTUATE$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTUATE$40);
            }
            target.setEnumValue(actuate);
        }
    }
    
    /**
     * Sets (as xml) the "actuate" attribute
     */
    public void xsetActuate(org.w3.x1999.xlink.ActuateType actuate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ActuateType target = null;
            target = (org.w3.x1999.xlink.ActuateType)get_store().find_attribute_user(ACTUATE$40);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.ActuateType)get_store().add_attribute_user(ACTUATE$40);
            }
            target.set(actuate);
        }
    }
    
    /**
     * Unsets the "actuate" attribute
     */
    public void unsetActuate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTUATE$40);
        }
    }
    
    /**
     * Gets the "remoteSchema" attribute
     */
    public java.lang.String getRemoteSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REMOTESCHEMA$42);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "remoteSchema" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetRemoteSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(REMOTESCHEMA$42);
            return target;
        }
    }
    
    /**
     * True if has "remoteSchema" attribute
     */
    public boolean isSetRemoteSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REMOTESCHEMA$42) != null;
        }
    }
    
    /**
     * Sets the "remoteSchema" attribute
     */
     public void setRemoteSchema(java.lang.String remoteSchema)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REMOTESCHEMA$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REMOTESCHEMA$42);
            }
            target.setStringValue(remoteSchema);
        }
    }
    
    /**
     * Sets (as xml) the "remoteSchema" attribute
     */
    public void xsetRemoteSchema(org.apache.xmlbeans.XmlAnyURI remoteSchema)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(REMOTESCHEMA$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(REMOTESCHEMA$42);
            }
            target.set(remoteSchema);
        }
    }
    
    /**
     * Unsets the "remoteSchema" attribute
     */
    public void unsetRemoteSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REMOTESCHEMA$42);
        }
    }
}
