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
 * An XML PointType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class PointTypeImpl extends net.opengis.gml.impl.AbstractGeometricPrimitiveTypeImpl implements net.opengis.gml.PointType
{
    private static final long serialVersionUID = 1L;
    
    public PointTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "pos");
    private static final javax.xml.namespace.QName COORDINATES$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "coordinates");
    private static final javax.xml.namespace.QName COORD$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "coord");
    
    
    /**
     * Gets the "pos" element
     */
    public net.opengis.gml.DirectPositionType getPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionType target = null;
            target = (net.opengis.gml.DirectPositionType)get_store().find_element_user(POS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pos" element
     */
    public boolean isSetPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POS$0) != 0;
        }
    }
    
    /**
     * Sets the "pos" element
     */
    @Inject(optional=true) public void setPos(net.opengis.gml.DirectPositionType pos)
    {
        generatedSetterHelperImpl(pos, POS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "pos" element
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
     * Unsets the "pos" element
     */
    public void unsetPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POS$0, 0);
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
            target = (net.opengis.gml.CoordinatesType)get_store().find_element_user(COORDINATES$2, 0);
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
            return get_store().count_elements(COORDINATES$2) != 0;
        }
    }
    
    /**
     * Sets the "coordinates" element
     */
    @Inject(optional=true) public void setCoordinates(net.opengis.gml.CoordinatesType coordinates)
    {
        generatedSetterHelperImpl(coordinates, COORDINATES$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (net.opengis.gml.CoordinatesType)get_store().add_element_user(COORDINATES$2);
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
            get_store().remove_element(COORDINATES$2, 0);
        }
    }
    
    /**
     * Gets the "coord" element
     */
    public net.opengis.gml.CoordType getCoord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordType target = null;
            target = (net.opengis.gml.CoordType)get_store().find_element_user(COORD$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "coord" element
     */
    public boolean isSetCoord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COORD$4) != 0;
        }
    }
    
    /**
     * Sets the "coord" element
     */
    @Inject(optional=true) public void setCoord(net.opengis.gml.CoordType coord)
    {
        generatedSetterHelperImpl(coord, COORD$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "coord" element
     */
    public net.opengis.gml.CoordType addNewCoord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordType target = null;
            target = (net.opengis.gml.CoordType)get_store().add_element_user(COORD$4);
            return target;
        }
    }
    
    /**
     * Unsets the "coord" element
     */
    public void unsetCoord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COORD$4, 0);
        }
    }
}
