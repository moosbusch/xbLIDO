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
 * An XML EnvelopeType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class EnvelopeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.EnvelopeType
{
    private static final long serialVersionUID = 1L;

    public EnvelopeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName LOWERCORNER$0 =
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "lowerCorner");
    private static final javax.xml.namespace.QName UPPERCORNER$2 =
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "upperCorner");
    private static final javax.xml.namespace.QName COORD$4 =
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "coord");
    private static final javax.xml.namespace.QName POS$6 =
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "pos");
    private static final javax.xml.namespace.QName COORDINATES$8 =
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "coordinates");
    private static final javax.xml.namespace.QName SRSNAME$10 =
        new javax.xml.namespace.QName("", "srsName");
    private static final javax.xml.namespace.QName SRSDIMENSION$12 =
        new javax.xml.namespace.QName("", "srsDimension");
    private static final javax.xml.namespace.QName AXISLABELS$14 =
        new javax.xml.namespace.QName("", "axisLabels");
    private static final javax.xml.namespace.QName UOMLABELS$16 =
        new javax.xml.namespace.QName("", "uomLabels");


    /**
     * Gets the "lowerCorner" element
     */
    public net.opengis.gml.DirectPositionType getLowerCorner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionType target = null;
            target = (net.opengis.gml.DirectPositionType)get_store().find_element_user(LOWERCORNER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * True if has "lowerCorner" element
     */
    public boolean isSetLowerCorner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOWERCORNER$0) != 0;
        }
    }

    /**
     * Sets the "lowerCorner" element
     */
    @Inject(optional=true) public void setLowerCorner(net.opengis.gml.DirectPositionType lowerCorner)
    {
        generatedSetterHelperImpl(lowerCorner, LOWERCORNER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "lowerCorner" element
     */
    public net.opengis.gml.DirectPositionType addNewLowerCorner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionType target = null;
            target = (net.opengis.gml.DirectPositionType)get_store().add_element_user(LOWERCORNER$0);
            return target;
        }
    }

    /**
     * Unsets the "lowerCorner" element
     */
    public void unsetLowerCorner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOWERCORNER$0, 0);
        }
    }

    /**
     * Gets the "upperCorner" element
     */
    public net.opengis.gml.DirectPositionType getUpperCorner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionType target = null;
            target = (net.opengis.gml.DirectPositionType)get_store().find_element_user(UPPERCORNER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * True if has "upperCorner" element
     */
    public boolean isSetUpperCorner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPPERCORNER$2) != 0;
        }
    }

    /**
     * Sets the "upperCorner" element
     */
    @Inject(optional=true) public void setUpperCorner(net.opengis.gml.DirectPositionType upperCorner)
    {
        generatedSetterHelperImpl(upperCorner, UPPERCORNER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "upperCorner" element
     */
    public net.opengis.gml.DirectPositionType addNewUpperCorner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionType target = null;
            target = (net.opengis.gml.DirectPositionType)get_store().add_element_user(UPPERCORNER$2);
            return target;
        }
    }

    /**
     * Unsets the "upperCorner" element
     */
    public void unsetUpperCorner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPPERCORNER$2, 0);
        }
    }

    /**
     * Gets a List of "coord" elements
     */
    public java.util.List<net.opengis.gml.CoordType> getCoordList()
    {
        final class CoordList extends java.util.AbstractList<net.opengis.gml.CoordType>
        {
            @Override
            public net.opengis.gml.CoordType get(int i)
                { return EnvelopeTypeImpl.this.getCoordArray(i); }

            @Override
            public net.opengis.gml.CoordType set(int i, net.opengis.gml.CoordType o)
            {
                net.opengis.gml.CoordType old = EnvelopeTypeImpl.this.getCoordArray(i);
                EnvelopeTypeImpl.this.setCoordArray(i, o);
                return old;
            }

            @Override
            public void add(int i, net.opengis.gml.CoordType o)
                { EnvelopeTypeImpl.this.insertNewCoord(i).set(o); }

            @Override
            public net.opengis.gml.CoordType remove(int i)
            {
                net.opengis.gml.CoordType old = EnvelopeTypeImpl.this.getCoordArray(i);
                EnvelopeTypeImpl.this.removeCoord(i);
                return old;
            }

            @Override
            public int size()
                { return EnvelopeTypeImpl.this.sizeOfCoordArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new CoordList();
        }
    }

    /**
     * Gets array of all "coord" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.CoordType[] getCoordArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.CoordType> targetList = new java.util.ArrayList<net.opengis.gml.CoordType>();
            get_store().find_all_element_users(COORD$4, targetList);
            net.opengis.gml.CoordType[] result = new net.opengis.gml.CoordType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "coord" element
     */
    public net.opengis.gml.CoordType getCoordArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordType target = null;
            target = (net.opengis.gml.CoordType)get_store().find_element_user(COORD$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "coord" element
     */
    public int sizeOfCoordArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COORD$4);
        }
    }

    /**
     * Sets array of all "coord" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setCoordArray(net.opengis.gml.CoordType[] coordArray)
    {
        check_orphaned();
        arraySetterHelper(coordArray, COORD$4);
    }

    /**
     * Sets ith "coord" element
     */
    @Inject(optional=true) public void setCoordArray(int i, net.opengis.gml.CoordType coord)
    {
        generatedSetterHelperImpl(coord, COORD$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "coord" element
     */
    public net.opengis.gml.CoordType insertNewCoord(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordType target = null;
            target = (net.opengis.gml.CoordType)get_store().insert_element_user(COORD$4, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "coord" element
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
     * Removes the ith "coord" element
     */
    public void removeCoord(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COORD$4, i);
        }
    }

    /**
     * Gets a List of "pos" elements
     */
    public java.util.List<net.opengis.gml.DirectPositionType> getPosList()
    {
        final class PosList extends java.util.AbstractList<net.opengis.gml.DirectPositionType>
        {
            @Override
            public net.opengis.gml.DirectPositionType get(int i)
                { return EnvelopeTypeImpl.this.getPosArray(i); }

            @Override
            public net.opengis.gml.DirectPositionType set(int i, net.opengis.gml.DirectPositionType o)
            {
                net.opengis.gml.DirectPositionType old = EnvelopeTypeImpl.this.getPosArray(i);
                EnvelopeTypeImpl.this.setPosArray(i, o);
                return old;
            }

            @Override
            public void add(int i, net.opengis.gml.DirectPositionType o)
                { EnvelopeTypeImpl.this.insertNewPos(i).set(o); }

            @Override
            public net.opengis.gml.DirectPositionType remove(int i)
            {
                net.opengis.gml.DirectPositionType old = EnvelopeTypeImpl.this.getPosArray(i);
                EnvelopeTypeImpl.this.removePos(i);
                return old;
            }

            @Override
            public int size()
                { return EnvelopeTypeImpl.this.sizeOfPosArray(); }

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
            get_store().find_all_element_users(POS$6, targetList);
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
            target = (net.opengis.gml.DirectPositionType)get_store().find_element_user(POS$6, i);
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
            return get_store().count_elements(POS$6);
        }
    }

    /**
     * Sets array of all "pos" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setPosArray(net.opengis.gml.DirectPositionType[] posArray)
    {
        check_orphaned();
        arraySetterHelper(posArray, POS$6);
    }

    /**
     * Sets ith "pos" element
     */
    @Inject(optional=true) public void setPosArray(int i, net.opengis.gml.DirectPositionType pos)
    {
        generatedSetterHelperImpl(pos, POS$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
            target = (net.opengis.gml.DirectPositionType)get_store().insert_element_user(POS$6, i);
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
            target = (net.opengis.gml.DirectPositionType)get_store().add_element_user(POS$6);
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
            get_store().remove_element(POS$6, i);
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
     * Gets the "srsName" attribute
     */
    public java.lang.String getSrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRSNAME$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "srsName" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetSrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SRSNAME$10);
            return target;
        }
    }

    /**
     * True if has "srsName" attribute
     */
    public boolean isSetSrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SRSNAME$10) != null;
        }
    }

    /**
     * Sets the "srsName" attribute
     */
    @Inject(optional=true) public void setSrsName(java.lang.String srsName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRSNAME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SRSNAME$10);
            }
            target.setStringValue(srsName);
        }
    }

    /**
     * Sets (as xml) the "srsName" attribute
     */
    public void xsetSrsName(org.apache.xmlbeans.XmlAnyURI srsName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SRSNAME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(SRSNAME$10);
            }
            target.set(srsName);
        }
    }

    /**
     * Unsets the "srsName" attribute
     */
    public void unsetSrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SRSNAME$10);
        }
    }

    /**
     * Gets the "srsDimension" attribute
     */
    public java.math.BigInteger getSrsDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRSDIMENSION$12);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "srsDimension" attribute
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetSrsDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(SRSDIMENSION$12);
            return target;
        }
    }

    /**
     * True if has "srsDimension" attribute
     */
    public boolean isSetSrsDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SRSDIMENSION$12) != null;
        }
    }

    /**
     * Sets the "srsDimension" attribute
     */
    @Inject(optional=true) public void setSrsDimension(java.math.BigInteger srsDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRSDIMENSION$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SRSDIMENSION$12);
            }
            target.setBigIntegerValue(srsDimension);
        }
    }

    /**
     * Sets (as xml) the "srsDimension" attribute
     */
    public void xsetSrsDimension(org.apache.xmlbeans.XmlPositiveInteger srsDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(SRSDIMENSION$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(SRSDIMENSION$12);
            }
            target.set(srsDimension);
        }
    }

    /**
     * Unsets the "srsDimension" attribute
     */
    public void unsetSrsDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SRSDIMENSION$12);
        }
    }

    /**
     * Gets the "axisLabels" attribute
     */
    public java.util.List getAxisLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AXISLABELS$14);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }

    /**
     * Gets (as xml) the "axisLabels" attribute
     */
    public net.opengis.gml.NCNameList xgetAxisLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.NCNameList target = null;
            target = (net.opengis.gml.NCNameList)get_store().find_attribute_user(AXISLABELS$14);
            return target;
        }
    }

    /**
     * True if has "axisLabels" attribute
     */
    public boolean isSetAxisLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AXISLABELS$14) != null;
        }
    }

    /**
     * Sets the "axisLabels" attribute
     */
    @Inject(optional=true) public void setAxisLabels(java.util.List axisLabels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AXISLABELS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AXISLABELS$14);
            }
            target.setListValue(axisLabels);
        }
    }

    /**
     * Sets (as xml) the "axisLabels" attribute
     */
    public void xsetAxisLabels(net.opengis.gml.NCNameList axisLabels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.NCNameList target = null;
            target = (net.opengis.gml.NCNameList)get_store().find_attribute_user(AXISLABELS$14);
            if (target == null)
            {
                target = (net.opengis.gml.NCNameList)get_store().add_attribute_user(AXISLABELS$14);
            }
            target.set(axisLabels);
        }
    }

    /**
     * Unsets the "axisLabels" attribute
     */
    public void unsetAxisLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AXISLABELS$14);
        }
    }

    /**
     * Gets the "uomLabels" attribute
     */
    public java.util.List getUomLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UOMLABELS$16);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }

    /**
     * Gets (as xml) the "uomLabels" attribute
     */
    public net.opengis.gml.NCNameList xgetUomLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.NCNameList target = null;
            target = (net.opengis.gml.NCNameList)get_store().find_attribute_user(UOMLABELS$16);
            return target;
        }
    }

    /**
     * True if has "uomLabels" attribute
     */
    public boolean isSetUomLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UOMLABELS$16) != null;
        }
    }

    /**
     * Sets the "uomLabels" attribute
     */
    @Inject(optional=true) public void setUomLabels(java.util.List uomLabels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UOMLABELS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UOMLABELS$16);
            }
            target.setListValue(uomLabels);
        }
    }

    /**
     * Sets (as xml) the "uomLabels" attribute
     */
    public void xsetUomLabels(net.opengis.gml.NCNameList uomLabels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.NCNameList target = null;
            target = (net.opengis.gml.NCNameList)get_store().find_attribute_user(UOMLABELS$16);
            if (target == null)
            {
                target = (net.opengis.gml.NCNameList)get_store().add_attribute_user(UOMLABELS$16);
            }
            target.set(uomLabels);
        }
    }

    /**
     * Unsets the "uomLabels" attribute
     */
    public void unsetUomLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UOMLABELS$16);
        }
    }
}
