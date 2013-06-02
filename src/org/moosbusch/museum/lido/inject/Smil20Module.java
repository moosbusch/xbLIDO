/*
 * 
 *
 */
package org.moosbusch.museum.lido.inject;

import com.google.inject.Module;
import com.google.inject.Provides;
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

    public org.w3.x2001.smil20.language.AnimateColorDocument createLanguageAnimateColorDocument();

    @Provides
    public org.w3.x2001.smil20.language.AnimateDocument createLanguageAnimateDocument();

    @Provides
    public org.w3.x2001.smil20.language.AnimateMotionDocument createLanguageAnimateMotionDocument();

    @Provides
    public org.w3.x2001.smil20.language.SetDocument createLanguageSetDocument();

    @Provides
    public AnimateType createAnimateType();

    @Provides
    public AnimateColorType createAnimateColorType();

    @Provides
    public AnimateColorDocument createAnimateColorDocument();

    @Provides
    public AnimateColorPrototype createAnimateColorPrototype();

    @Provides
    public AnimateDocument createAnimateDocument();

    @Provides
    public AnimateMotionDocument createAnimateMotionDocument();

    @Provides
    public AnimateMotionPrototype createAnimateMotionPrototype();

    @Provides
    public AnimatePrototype createAnimatePrototype();

    @Provides
    public FillDefaultType createFillDefaultType();

    @Provides
    public FillTimingAttrsType createFillTimingAttrsType();

    @Provides
    public NonNegativeDecimalType createNonNegativeDecimalType();

    @Provides
    public RestartDefaultType createRestartDefaultType();

    @Provides
    public RestartTimingType createRestartTimingType();

    @Provides
    public SetDocument createSetDocument();

    @Provides
    public SetPrototype createSetPrototype();

    @Provides
    public SyncBehaviorDefaultType createSyncBehaviorDefaultType();

    @Provides
    public SyncBehaviorType createSyncBehaviorType();

    @Provides
    public org.w3.x2001.smil20.language.AnimateMotionType createAnimateMotionType();

    @Provides
    public org.w3.x2001.smil20.language.SetType createSetType();
}
