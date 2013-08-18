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
 * An XML DirectionVectorType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class DirectionVectorTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DirectionVectorType
{
    private static final long serialVersionUID = 1L;
    
    public DirectionVectorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VECTOR$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "vector");
    private static final javax.xml.namespace.QName HORIZONTALANGLE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "horizontalAngle");
    private static final javax.xml.namespace.QName VERTICALANGLE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "verticalAngle");
    
    
    /**
     * Gets the "vector" element
     */
    public net.opengis.gml.VectorType getVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VectorType target = null;
            target = (net.opengis.gml.VectorType)get_store().find_element_user(VECTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "vector" element
     */
    public boolean isSetVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VECTOR$0) != 0;
        }
    }
    
    /**
     * Sets the "vector" element
     */
    @Inject(optional=true) public void setVector(net.opengis.gml.VectorType vector)
    {
        generatedSetterHelperImpl(vector, VECTOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "vector" element
     */
    public net.opengis.gml.VectorType addNewVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VectorType target = null;
            target = (net.opengis.gml.VectorType)get_store().add_element_user(VECTOR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "vector" element
     */
    public void unsetVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VECTOR$0, 0);
        }
    }
    
    /**
     * Gets the "horizontalAngle" element
     */
    public net.opengis.gml.AngleType getHorizontalAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AngleType target = null;
            target = (net.opengis.gml.AngleType)get_store().find_element_user(HORIZONTALANGLE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "horizontalAngle" element
     */
    public boolean isSetHorizontalAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HORIZONTALANGLE$2) != 0;
        }
    }
    
    /**
     * Sets the "horizontalAngle" element
     */
    @Inject(optional=true) public void setHorizontalAngle(net.opengis.gml.AngleType horizontalAngle)
    {
        generatedSetterHelperImpl(horizontalAngle, HORIZONTALANGLE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "horizontalAngle" element
     */
    public net.opengis.gml.AngleType addNewHorizontalAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AngleType target = null;
            target = (net.opengis.gml.AngleType)get_store().add_element_user(HORIZONTALANGLE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "horizontalAngle" element
     */
    public void unsetHorizontalAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HORIZONTALANGLE$2, 0);
        }
    }
    
    /**
     * Gets the "verticalAngle" element
     */
    public net.opengis.gml.AngleType getVerticalAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AngleType target = null;
            target = (net.opengis.gml.AngleType)get_store().find_element_user(VERTICALANGLE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "verticalAngle" element
     */
    public boolean isSetVerticalAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERTICALANGLE$4) != 0;
        }
    }
    
    /**
     * Sets the "verticalAngle" element
     */
    @Inject(optional=true) public void setVerticalAngle(net.opengis.gml.AngleType verticalAngle)
    {
        generatedSetterHelperImpl(verticalAngle, VERTICALANGLE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "verticalAngle" element
     */
    public net.opengis.gml.AngleType addNewVerticalAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AngleType target = null;
            target = (net.opengis.gml.AngleType)get_store().add_element_user(VERTICALANGLE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "verticalAngle" element
     */
    public void unsetVerticalAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERTICALANGLE$4, 0);
        }
    }
}
