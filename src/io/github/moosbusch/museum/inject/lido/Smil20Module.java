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
package io.github.moosbusch.museum.inject.lido;

import com.google.inject.Module;
import org.w3.x2001.smil20.AnimateColorDocument;
import org.w3.x2001.smil20.AnimateColorPrototype;
import org.w3.x2001.smil20.AnimateDocument;
import org.w3.x2001.smil20.AnimateMotionDocument;
import org.w3.x2001.smil20.AnimateMotionPrototype;
import org.w3.x2001.smil20.AnimatePrototype;
import org.w3.x2001.smil20.FillDefaultType;
import org.w3.x2001.smil20.FillTimingAttrsType;
import org.w3.x2001.smil20.NonNegativeDecimalType;
import org.w3.x2001.smil20.RestartDefaultType;
import org.w3.x2001.smil20.RestartTimingType;
import org.w3.x2001.smil20.SetDocument;
import org.w3.x2001.smil20.SetPrototype;
import org.w3.x2001.smil20.SyncBehaviorDefaultType;
import org.w3.x2001.smil20.SyncBehaviorType;
import org.w3.x2001.smil20.language.AnimateColorType;
import org.w3.x2001.smil20.language.AnimateType;

/**
 *
 * @author moosbusch
 */
public interface Smil20Module extends Module {

    public org.w3.x2001.smil20.language.AnimateColorDocument createSmilLanguageAnimateColorDocument();

    public org.w3.x2001.smil20.language.AnimateDocument createSmilLanguageAnimateDocument();

    public org.w3.x2001.smil20.language.AnimateMotionDocument createSmilLanguageAnimateMotionDocument();

    public org.w3.x2001.smil20.language.SetDocument createSmilLanguageSetDocument();

    public AnimateType createSmilAnimateType();

    public AnimateColorType createSmilAnimateColorType();

    public AnimateColorDocument createSmilAnimateColorDocument();

    public AnimateColorPrototype createSmilAnimateColorPrototype();

    public AnimateDocument createSmilAnimateDocument();

    public AnimateMotionDocument createSmilAnimateMotionDocument();

    public AnimateMotionPrototype createSmilAnimateMotionPrototype();

    public AnimatePrototype createSmilAnimatePrototype();

    public FillDefaultType createSmilFillDefaultType();

    public FillTimingAttrsType createSmilFillTimingAttrsType();

    public NonNegativeDecimalType createSmilNonNegativeDecimalType();

    public RestartDefaultType createSmilRestartDefaultType();

    public RestartTimingType createSmilRestartTimingType();

    public SetDocument createSmilSetDocument();

    public SetPrototype createSmilSetPrototype();

    public SyncBehaviorDefaultType createSmilSyncBehaviorDefaultType();

    public SyncBehaviorType createSmilSyncBehaviorType();

    public org.w3.x2001.smil20.language.AnimateMotionType createSmilAnimateMotionType();

    public org.w3.x2001.smil20.language.SetType createSmilSetType();
}
