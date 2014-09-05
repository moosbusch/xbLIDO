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
package org.moosbusch.museum.inject.lido;

import com.google.inject.Module;
import org.w3.x1999.xlink.ActuateAttribute;
import org.w3.x1999.xlink.ActuateType;
import org.w3.x1999.xlink.ArcDocument;
import org.w3.x1999.xlink.ArcType;
import org.w3.x1999.xlink.ArcroleAttribute;
import org.w3.x1999.xlink.ArcroleType;
import org.w3.x1999.xlink.Extended;
import org.w3.x1999.xlink.FromAttribute;
import org.w3.x1999.xlink.FromType;
import org.w3.x1999.xlink.HrefAttribute;
import org.w3.x1999.xlink.HrefType;
import org.w3.x1999.xlink.LabelAttribute;
import org.w3.x1999.xlink.LabelType;
import org.w3.x1999.xlink.LocatorDocument;
import org.w3.x1999.xlink.LocatorType;
import org.w3.x1999.xlink.ResourceDocument;
import org.w3.x1999.xlink.ResourceType;
import org.w3.x1999.xlink.RoleAttribute;
import org.w3.x1999.xlink.RoleType;
import org.w3.x1999.xlink.ShowAttribute;
import org.w3.x1999.xlink.ShowType;
import org.w3.x1999.xlink.Simple;
import org.w3.x1999.xlink.TitleAttrType;
import org.w3.x1999.xlink.TitleAttribute;
import org.w3.x1999.xlink.TitleDocument;
import org.w3.x1999.xlink.TitleEltType;
import org.w3.x1999.xlink.ToAttribute;
import org.w3.x1999.xlink.ToType;
import org.w3.x1999.xlink.TypeAttribute;
import org.w3.x1999.xlink.TypeType;

/**
 *
 * @author moosbusch
 */
public interface XLinkModule extends Module {

    public ActuateAttribute createXLinkActuateAttribute();

    public ActuateType createXLinkActuateType();

    public ArcDocument createXLinkArcDocument();

    public ArcroleAttribute createXLinkArcroleAttribute();

    public ArcroleType createXLinkArcroleType();

    public ArcType createXLinkArcType();

    public Extended createXLinkExtended();

    public FromAttribute createXLinkFromAttribute();

    public FromType createXLinkFromType();

    public HrefAttribute createXLinkHrefAttribute();

    public HrefType createXLinkHrefType();

    public LabelAttribute createXLinkLabelAttribute();

    public LabelType createXLinkLabelType();

    public LocatorDocument createXLinkLocatorDocument();

    public LocatorType createXLinkLocatorType();

    public ResourceDocument createXLinkResourceDocument();

    public ResourceType createXLinkResourceType();

    public RoleAttribute createXLinkRoleAttribute();

    public RoleType createXLinkRoleType();

    public ShowAttribute createXLinkShowAttribute();

    public ShowType createXLinkShowType();

    public Simple createXLinkSimple();

    public TitleAttribute createXLinkTitleAttribute();

    public TitleAttrType createXLinkTitleAttrType();

    public TitleDocument createXLinkTitleDocument();

    public TitleEltType createXLinkTitleEltType();

    public ToAttribute createXLinkToAttribute();

    public ToType createXLinkToType();

    public TypeAttribute createXlinkTypeAttribute();

    public TypeType createXLinkTypeType();
}