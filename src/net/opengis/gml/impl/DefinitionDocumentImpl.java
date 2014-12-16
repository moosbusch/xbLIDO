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
 * A document containing one Definition(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DefinitionDocumentImpl extends net.opengis.gml.impl.GMLDocumentImpl implements net.opengis.gml.DefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Definition");
    private static final org.apache.xmlbeans.QNameSet DEFINITION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "UnitDefinition"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OperationParameterGroup"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Ellipsoid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeodeticDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ImageCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Conversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PassThroughOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "VerticalDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TemporalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeCoordinateSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TemporalDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralConversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeographicCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ConcatenatedOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ImageDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Datum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CylindricalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DefinitionCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OperationParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "EngineeringDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeocentricCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Transformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeClock"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CartesianCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LinearCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "SphericalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PrimeMeridian"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeCalendar"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ConventionalUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "VerticalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CoordinateSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeOrdinalReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "BaseUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "EngineeringCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ProjectedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PolarCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "EllipsoidalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ObliqueCartesianCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Definition"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralOperationParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DefinitionProxy"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TemporalCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Operation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CoordinateSystemAxis"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OperationMethod"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_ReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "UserDefinedCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeCalendarEra"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CoordinateOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CoordinateReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralTransformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompoundCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Dictionary"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_SingleOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "VerticalCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DerivedUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralDerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CRS"),
    });
    
    
    /**
     * Gets the "Definition" element
     */
    public net.opengis.gml.DefinitionType getDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DefinitionType target = null;
            target = (net.opengis.gml.DefinitionType)get_store().find_element_user(DEFINITION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Definition" element
     */
     public void setDefinition(net.opengis.gml.DefinitionType definition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DefinitionType target = null;
            target = (net.opengis.gml.DefinitionType)get_store().find_element_user(DEFINITION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.DefinitionType)get_store().add_element_user(DEFINITION$0);
            }
            target.set(definition);
        }
    }
    
    /**
     * Appends and returns a new empty "Definition" element
     */
    public net.opengis.gml.DefinitionType addNewDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DefinitionType target = null;
            target = (net.opengis.gml.DefinitionType)get_store().add_element_user(DEFINITION$0);
            return target;
        }
    }
}
