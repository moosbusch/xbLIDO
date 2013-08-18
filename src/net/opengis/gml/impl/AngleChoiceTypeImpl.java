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
 * An XML AngleChoiceType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class AngleChoiceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.AngleChoiceType
{
    private static final long serialVersionUID = 1L;
    
    public AngleChoiceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANGLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "angle");
    private static final javax.xml.namespace.QName DMSANGLE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "dmsAngle");
    
    
    /**
     * Gets the "angle" element
     */
    public net.opengis.gml.MeasureType getAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().find_element_user(ANGLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "angle" element
     */
    public boolean isSetAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANGLE$0) != 0;
        }
    }
    
    /**
     * Sets the "angle" element
     */
    @Inject(optional=true) public void setAngle(net.opengis.gml.MeasureType angle)
    {
        generatedSetterHelperImpl(angle, ANGLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "angle" element
     */
    public net.opengis.gml.MeasureType addNewAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().add_element_user(ANGLE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "angle" element
     */
    public void unsetAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANGLE$0, 0);
        }
    }
    
    /**
     * Gets the "dmsAngle" element
     */
    public net.opengis.gml.DMSAngleType getDmsAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DMSAngleType target = null;
            target = (net.opengis.gml.DMSAngleType)get_store().find_element_user(DMSANGLE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dmsAngle" element
     */
    public boolean isSetDmsAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DMSANGLE$2) != 0;
        }
    }
    
    /**
     * Sets the "dmsAngle" element
     */
    @Inject(optional=true) public void setDmsAngle(net.opengis.gml.DMSAngleType dmsAngle)
    {
        generatedSetterHelperImpl(dmsAngle, DMSANGLE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dmsAngle" element
     */
    public net.opengis.gml.DMSAngleType addNewDmsAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DMSAngleType target = null;
            target = (net.opengis.gml.DMSAngleType)get_store().add_element_user(DMSANGLE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "dmsAngle" element
     */
    public void unsetDmsAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DMSANGLE$2, 0);
        }
    }
}
