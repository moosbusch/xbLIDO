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
 * An XML BaseStyleDescriptorType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class BaseStyleDescriptorTypeImpl extends net.opengis.gml.impl.AbstractGMLTypeImpl implements net.opengis.gml.BaseStyleDescriptorType
{
    private static final long serialVersionUID = 1L;
    
    public BaseStyleDescriptorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPATIALRESOLUTION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "spatialResolution");
    private static final javax.xml.namespace.QName STYLEVARIATION$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "styleVariation");
    private static final javax.xml.namespace.QName ANIMATE$4 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/SMIL20/", "animate");
    private static final javax.xml.namespace.QName ANIMATEMOTION$6 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/SMIL20/", "animateMotion");
    private static final javax.xml.namespace.QName ANIMATECOLOR$8 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/SMIL20/", "animateColor");
    private static final javax.xml.namespace.QName SET$10 = 
        new javax.xml.namespace.QName("http://www.w3.org/2001/SMIL20/", "set");
    
    
    /**
     * Gets the "spatialResolution" element
     */
    public net.opengis.gml.ScaleType getSpatialResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ScaleType target = null;
            target = (net.opengis.gml.ScaleType)get_store().find_element_user(SPATIALRESOLUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "spatialResolution" element
     */
    public boolean isSetSpatialResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPATIALRESOLUTION$0) != 0;
        }
    }
    
    /**
     * Sets the "spatialResolution" element
     */
    @Inject(optional=true) public void setSpatialResolution(net.opengis.gml.ScaleType spatialResolution)
    {
        generatedSetterHelperImpl(spatialResolution, SPATIALRESOLUTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "spatialResolution" element
     */
    public net.opengis.gml.ScaleType addNewSpatialResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ScaleType target = null;
            target = (net.opengis.gml.ScaleType)get_store().add_element_user(SPATIALRESOLUTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "spatialResolution" element
     */
    public void unsetSpatialResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPATIALRESOLUTION$0, 0);
        }
    }
    
    /**
     * Gets a List of "styleVariation" elements
     */
    public java.util.List<net.opengis.gml.StyleVariationType> getStyleVariationList()
    {
        final class StyleVariationList extends java.util.AbstractList<net.opengis.gml.StyleVariationType>
        {
            @Override
            public net.opengis.gml.StyleVariationType get(int i)
                { return BaseStyleDescriptorTypeImpl.this.getStyleVariationArray(i); }
            
            @Override
            public net.opengis.gml.StyleVariationType set(int i, net.opengis.gml.StyleVariationType o)
            {
                net.opengis.gml.StyleVariationType old = BaseStyleDescriptorTypeImpl.this.getStyleVariationArray(i);
                BaseStyleDescriptorTypeImpl.this.setStyleVariationArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.StyleVariationType o)
                { BaseStyleDescriptorTypeImpl.this.insertNewStyleVariation(i).set(o); }
            
            @Override
            public net.opengis.gml.StyleVariationType remove(int i)
            {
                net.opengis.gml.StyleVariationType old = BaseStyleDescriptorTypeImpl.this.getStyleVariationArray(i);
                BaseStyleDescriptorTypeImpl.this.removeStyleVariation(i);
                return old;
            }
            
            @Override
            public int size()
                { return BaseStyleDescriptorTypeImpl.this.sizeOfStyleVariationArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new StyleVariationList();
        }
    }
    
    /**
     * Gets array of all "styleVariation" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.StyleVariationType[] getStyleVariationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.StyleVariationType> targetList = new java.util.ArrayList<net.opengis.gml.StyleVariationType>();
            get_store().find_all_element_users(STYLEVARIATION$2, targetList);
            net.opengis.gml.StyleVariationType[] result = new net.opengis.gml.StyleVariationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "styleVariation" element
     */
    public net.opengis.gml.StyleVariationType getStyleVariationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StyleVariationType target = null;
            target = (net.opengis.gml.StyleVariationType)get_store().find_element_user(STYLEVARIATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "styleVariation" element
     */
    public int sizeOfStyleVariationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STYLEVARIATION$2);
        }
    }
    
    /**
     * Sets array of all "styleVariation" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setStyleVariationArray(net.opengis.gml.StyleVariationType[] styleVariationArray)
    {
        check_orphaned();
        arraySetterHelper(styleVariationArray, STYLEVARIATION$2);
    }
    
    /**
     * Sets ith "styleVariation" element
     */
    @Inject(optional=true) public void setStyleVariationArray(int i, net.opengis.gml.StyleVariationType styleVariation)
    {
        generatedSetterHelperImpl(styleVariation, STYLEVARIATION$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "styleVariation" element
     */
    public net.opengis.gml.StyleVariationType insertNewStyleVariation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StyleVariationType target = null;
            target = (net.opengis.gml.StyleVariationType)get_store().insert_element_user(STYLEVARIATION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "styleVariation" element
     */
    public net.opengis.gml.StyleVariationType addNewStyleVariation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StyleVariationType target = null;
            target = (net.opengis.gml.StyleVariationType)get_store().add_element_user(STYLEVARIATION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "styleVariation" element
     */
    public void removeStyleVariation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STYLEVARIATION$2, i);
        }
    }
    
    /**
     * Gets a List of "animate" elements
     */
    public java.util.List<org.w3.x2001.smil20.language.AnimateType> getAnimateList()
    {
        final class AnimateList extends java.util.AbstractList<org.w3.x2001.smil20.language.AnimateType>
        {
            @Override
            public org.w3.x2001.smil20.language.AnimateType get(int i)
                { return BaseStyleDescriptorTypeImpl.this.getAnimateArray(i); }
            
            @Override
            public org.w3.x2001.smil20.language.AnimateType set(int i, org.w3.x2001.smil20.language.AnimateType o)
            {
                org.w3.x2001.smil20.language.AnimateType old = BaseStyleDescriptorTypeImpl.this.getAnimateArray(i);
                BaseStyleDescriptorTypeImpl.this.setAnimateArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.w3.x2001.smil20.language.AnimateType o)
                { BaseStyleDescriptorTypeImpl.this.insertNewAnimate(i).set(o); }
            
            @Override
            public org.w3.x2001.smil20.language.AnimateType remove(int i)
            {
                org.w3.x2001.smil20.language.AnimateType old = BaseStyleDescriptorTypeImpl.this.getAnimateArray(i);
                BaseStyleDescriptorTypeImpl.this.removeAnimate(i);
                return old;
            }
            
            @Override
            public int size()
                { return BaseStyleDescriptorTypeImpl.this.sizeOfAnimateArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AnimateList();
        }
    }
    
    /**
     * Gets array of all "animate" elements
     * @deprecated
     */
    @Deprecated
    public org.w3.x2001.smil20.language.AnimateType[] getAnimateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.w3.x2001.smil20.language.AnimateType> targetList = new java.util.ArrayList<org.w3.x2001.smil20.language.AnimateType>();
            get_store().find_all_element_users(ANIMATE$4, targetList);
            org.w3.x2001.smil20.language.AnimateType[] result = new org.w3.x2001.smil20.language.AnimateType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "animate" element
     */
    public org.w3.x2001.smil20.language.AnimateType getAnimateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateType target = null;
            target = (org.w3.x2001.smil20.language.AnimateType)get_store().find_element_user(ANIMATE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "animate" element
     */
    public int sizeOfAnimateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANIMATE$4);
        }
    }
    
    /**
     * Sets array of all "animate" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setAnimateArray(org.w3.x2001.smil20.language.AnimateType[] animateArray)
    {
        check_orphaned();
        arraySetterHelper(animateArray, ANIMATE$4);
    }
    
    /**
     * Sets ith "animate" element
     */
    @Inject(optional=true) public void setAnimateArray(int i, org.w3.x2001.smil20.language.AnimateType animate)
    {
        generatedSetterHelperImpl(animate, ANIMATE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "animate" element
     */
    public org.w3.x2001.smil20.language.AnimateType insertNewAnimate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateType target = null;
            target = (org.w3.x2001.smil20.language.AnimateType)get_store().insert_element_user(ANIMATE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "animate" element
     */
    public org.w3.x2001.smil20.language.AnimateType addNewAnimate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateType target = null;
            target = (org.w3.x2001.smil20.language.AnimateType)get_store().add_element_user(ANIMATE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "animate" element
     */
    public void removeAnimate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANIMATE$4, i);
        }
    }
    
    /**
     * Gets a List of "animateMotion" elements
     */
    public java.util.List<org.w3.x2001.smil20.language.AnimateMotionType> getAnimateMotionList()
    {
        final class AnimateMotionList extends java.util.AbstractList<org.w3.x2001.smil20.language.AnimateMotionType>
        {
            @Override
            public org.w3.x2001.smil20.language.AnimateMotionType get(int i)
                { return BaseStyleDescriptorTypeImpl.this.getAnimateMotionArray(i); }
            
            @Override
            public org.w3.x2001.smil20.language.AnimateMotionType set(int i, org.w3.x2001.smil20.language.AnimateMotionType o)
            {
                org.w3.x2001.smil20.language.AnimateMotionType old = BaseStyleDescriptorTypeImpl.this.getAnimateMotionArray(i);
                BaseStyleDescriptorTypeImpl.this.setAnimateMotionArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.w3.x2001.smil20.language.AnimateMotionType o)
                { BaseStyleDescriptorTypeImpl.this.insertNewAnimateMotion(i).set(o); }
            
            @Override
            public org.w3.x2001.smil20.language.AnimateMotionType remove(int i)
            {
                org.w3.x2001.smil20.language.AnimateMotionType old = BaseStyleDescriptorTypeImpl.this.getAnimateMotionArray(i);
                BaseStyleDescriptorTypeImpl.this.removeAnimateMotion(i);
                return old;
            }
            
            @Override
            public int size()
                { return BaseStyleDescriptorTypeImpl.this.sizeOfAnimateMotionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AnimateMotionList();
        }
    }
    
    /**
     * Gets array of all "animateMotion" elements
     * @deprecated
     */
    @Deprecated
    public org.w3.x2001.smil20.language.AnimateMotionType[] getAnimateMotionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.w3.x2001.smil20.language.AnimateMotionType> targetList = new java.util.ArrayList<org.w3.x2001.smil20.language.AnimateMotionType>();
            get_store().find_all_element_users(ANIMATEMOTION$6, targetList);
            org.w3.x2001.smil20.language.AnimateMotionType[] result = new org.w3.x2001.smil20.language.AnimateMotionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "animateMotion" element
     */
    public org.w3.x2001.smil20.language.AnimateMotionType getAnimateMotionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateMotionType target = null;
            target = (org.w3.x2001.smil20.language.AnimateMotionType)get_store().find_element_user(ANIMATEMOTION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "animateMotion" element
     */
    public int sizeOfAnimateMotionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANIMATEMOTION$6);
        }
    }
    
    /**
     * Sets array of all "animateMotion" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setAnimateMotionArray(org.w3.x2001.smil20.language.AnimateMotionType[] animateMotionArray)
    {
        check_orphaned();
        arraySetterHelper(animateMotionArray, ANIMATEMOTION$6);
    }
    
    /**
     * Sets ith "animateMotion" element
     */
    @Inject(optional=true) public void setAnimateMotionArray(int i, org.w3.x2001.smil20.language.AnimateMotionType animateMotion)
    {
        generatedSetterHelperImpl(animateMotion, ANIMATEMOTION$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "animateMotion" element
     */
    public org.w3.x2001.smil20.language.AnimateMotionType insertNewAnimateMotion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateMotionType target = null;
            target = (org.w3.x2001.smil20.language.AnimateMotionType)get_store().insert_element_user(ANIMATEMOTION$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "animateMotion" element
     */
    public org.w3.x2001.smil20.language.AnimateMotionType addNewAnimateMotion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateMotionType target = null;
            target = (org.w3.x2001.smil20.language.AnimateMotionType)get_store().add_element_user(ANIMATEMOTION$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "animateMotion" element
     */
    public void removeAnimateMotion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANIMATEMOTION$6, i);
        }
    }
    
    /**
     * Gets a List of "animateColor" elements
     */
    public java.util.List<org.w3.x2001.smil20.language.AnimateColorType> getAnimateColorList()
    {
        final class AnimateColorList extends java.util.AbstractList<org.w3.x2001.smil20.language.AnimateColorType>
        {
            @Override
            public org.w3.x2001.smil20.language.AnimateColorType get(int i)
                { return BaseStyleDescriptorTypeImpl.this.getAnimateColorArray(i); }
            
            @Override
            public org.w3.x2001.smil20.language.AnimateColorType set(int i, org.w3.x2001.smil20.language.AnimateColorType o)
            {
                org.w3.x2001.smil20.language.AnimateColorType old = BaseStyleDescriptorTypeImpl.this.getAnimateColorArray(i);
                BaseStyleDescriptorTypeImpl.this.setAnimateColorArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.w3.x2001.smil20.language.AnimateColorType o)
                { BaseStyleDescriptorTypeImpl.this.insertNewAnimateColor(i).set(o); }
            
            @Override
            public org.w3.x2001.smil20.language.AnimateColorType remove(int i)
            {
                org.w3.x2001.smil20.language.AnimateColorType old = BaseStyleDescriptorTypeImpl.this.getAnimateColorArray(i);
                BaseStyleDescriptorTypeImpl.this.removeAnimateColor(i);
                return old;
            }
            
            @Override
            public int size()
                { return BaseStyleDescriptorTypeImpl.this.sizeOfAnimateColorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AnimateColorList();
        }
    }
    
    /**
     * Gets array of all "animateColor" elements
     * @deprecated
     */
    @Deprecated
    public org.w3.x2001.smil20.language.AnimateColorType[] getAnimateColorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.w3.x2001.smil20.language.AnimateColorType> targetList = new java.util.ArrayList<org.w3.x2001.smil20.language.AnimateColorType>();
            get_store().find_all_element_users(ANIMATECOLOR$8, targetList);
            org.w3.x2001.smil20.language.AnimateColorType[] result = new org.w3.x2001.smil20.language.AnimateColorType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "animateColor" element
     */
    public org.w3.x2001.smil20.language.AnimateColorType getAnimateColorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateColorType target = null;
            target = (org.w3.x2001.smil20.language.AnimateColorType)get_store().find_element_user(ANIMATECOLOR$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "animateColor" element
     */
    public int sizeOfAnimateColorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANIMATECOLOR$8);
        }
    }
    
    /**
     * Sets array of all "animateColor" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setAnimateColorArray(org.w3.x2001.smil20.language.AnimateColorType[] animateColorArray)
    {
        check_orphaned();
        arraySetterHelper(animateColorArray, ANIMATECOLOR$8);
    }
    
    /**
     * Sets ith "animateColor" element
     */
    @Inject(optional=true) public void setAnimateColorArray(int i, org.w3.x2001.smil20.language.AnimateColorType animateColor)
    {
        generatedSetterHelperImpl(animateColor, ANIMATECOLOR$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "animateColor" element
     */
    public org.w3.x2001.smil20.language.AnimateColorType insertNewAnimateColor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateColorType target = null;
            target = (org.w3.x2001.smil20.language.AnimateColorType)get_store().insert_element_user(ANIMATECOLOR$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "animateColor" element
     */
    public org.w3.x2001.smil20.language.AnimateColorType addNewAnimateColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateColorType target = null;
            target = (org.w3.x2001.smil20.language.AnimateColorType)get_store().add_element_user(ANIMATECOLOR$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "animateColor" element
     */
    public void removeAnimateColor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANIMATECOLOR$8, i);
        }
    }
    
    /**
     * Gets a List of "set" elements
     */
    public java.util.List<org.w3.x2001.smil20.language.SetType> getSetList()
    {
        final class SetList extends java.util.AbstractList<org.w3.x2001.smil20.language.SetType>
        {
            @Override
            public org.w3.x2001.smil20.language.SetType get(int i)
                { return BaseStyleDescriptorTypeImpl.this.getSetArray(i); }
            
            @Override
            public org.w3.x2001.smil20.language.SetType set(int i, org.w3.x2001.smil20.language.SetType o)
            {
                org.w3.x2001.smil20.language.SetType old = BaseStyleDescriptorTypeImpl.this.getSetArray(i);
                BaseStyleDescriptorTypeImpl.this.setSetArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.w3.x2001.smil20.language.SetType o)
                { BaseStyleDescriptorTypeImpl.this.insertNewSet(i).set(o); }
            
            @Override
            public org.w3.x2001.smil20.language.SetType remove(int i)
            {
                org.w3.x2001.smil20.language.SetType old = BaseStyleDescriptorTypeImpl.this.getSetArray(i);
                BaseStyleDescriptorTypeImpl.this.removeSet(i);
                return old;
            }
            
            @Override
            public int size()
                { return BaseStyleDescriptorTypeImpl.this.sizeOfSetArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SetList();
        }
    }
    
    /**
     * Gets array of all "set" elements
     * @deprecated
     */
    @Deprecated
    public org.w3.x2001.smil20.language.SetType[] getSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.w3.x2001.smil20.language.SetType> targetList = new java.util.ArrayList<org.w3.x2001.smil20.language.SetType>();
            get_store().find_all_element_users(SET$10, targetList);
            org.w3.x2001.smil20.language.SetType[] result = new org.w3.x2001.smil20.language.SetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "set" element
     */
    public org.w3.x2001.smil20.language.SetType getSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.SetType target = null;
            target = (org.w3.x2001.smil20.language.SetType)get_store().find_element_user(SET$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "set" element
     */
    public int sizeOfSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SET$10);
        }
    }
    
    /**
     * Sets array of all "set" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setSetArray(org.w3.x2001.smil20.language.SetType[] setArray)
    {
        check_orphaned();
        arraySetterHelper(setArray, SET$10);
    }
    
    /**
     * Sets ith "set" element
     */
    @Inject(optional=true) public void setSetArray(int i, org.w3.x2001.smil20.language.SetType set)
    {
        generatedSetterHelperImpl(set, SET$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "set" element
     */
    public org.w3.x2001.smil20.language.SetType insertNewSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.SetType target = null;
            target = (org.w3.x2001.smil20.language.SetType)get_store().insert_element_user(SET$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "set" element
     */
    public org.w3.x2001.smil20.language.SetType addNewSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.SetType target = null;
            target = (org.w3.x2001.smil20.language.SetType)get_store().add_element_user(SET$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "set" element
     */
    public void removeSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SET$10, i);
        }
    }
}
