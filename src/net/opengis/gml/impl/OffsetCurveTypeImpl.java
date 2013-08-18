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
 * An XML OffsetCurveType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class OffsetCurveTypeImpl extends net.opengis.gml.impl.AbstractCurveSegmentTypeImpl implements net.opengis.gml.OffsetCurveType
{
    private static final long serialVersionUID = 1L;
    
    public OffsetCurveTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFSETBASE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "offsetBase");
    private static final javax.xml.namespace.QName DISTANCE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "distance");
    private static final javax.xml.namespace.QName REFDIRECTION$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "refDirection");
    
    
    /**
     * Gets the "offsetBase" element
     */
    public net.opengis.gml.CurvePropertyType getOffsetBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurvePropertyType target = null;
            target = (net.opengis.gml.CurvePropertyType)get_store().find_element_user(OFFSETBASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "offsetBase" element
     */
    @Inject(optional=true) public void setOffsetBase(net.opengis.gml.CurvePropertyType offsetBase)
    {
        generatedSetterHelperImpl(offsetBase, OFFSETBASE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "offsetBase" element
     */
    public net.opengis.gml.CurvePropertyType addNewOffsetBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurvePropertyType target = null;
            target = (net.opengis.gml.CurvePropertyType)get_store().add_element_user(OFFSETBASE$0);
            return target;
        }
    }
    
    /**
     * Gets the "distance" element
     */
    public net.opengis.gml.LengthType getDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LengthType target = null;
            target = (net.opengis.gml.LengthType)get_store().find_element_user(DISTANCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "distance" element
     */
    @Inject(optional=true) public void setDistance(net.opengis.gml.LengthType distance)
    {
        generatedSetterHelperImpl(distance, DISTANCE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "distance" element
     */
    public net.opengis.gml.LengthType addNewDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LengthType target = null;
            target = (net.opengis.gml.LengthType)get_store().add_element_user(DISTANCE$2);
            return target;
        }
    }
    
    /**
     * Gets the "refDirection" element
     */
    public net.opengis.gml.VectorType getRefDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VectorType target = null;
            target = (net.opengis.gml.VectorType)get_store().find_element_user(REFDIRECTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "refDirection" element
     */
    public boolean isSetRefDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFDIRECTION$4) != 0;
        }
    }
    
    /**
     * Sets the "refDirection" element
     */
    @Inject(optional=true) public void setRefDirection(net.opengis.gml.VectorType refDirection)
    {
        generatedSetterHelperImpl(refDirection, REFDIRECTION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "refDirection" element
     */
    public net.opengis.gml.VectorType addNewRefDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VectorType target = null;
            target = (net.opengis.gml.VectorType)get_store().add_element_user(REFDIRECTION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "refDirection" element
     */
    public void unsetRefDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFDIRECTION$4, 0);
        }
    }
}
