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
package org.moosbusch.museum.inject.lido.impl;

import com.google.inject.Provides;
import java.math.BigInteger;
import net.opengis.gml.AbsoluteExternalPositionalAccuracyDocument;
import net.opengis.gml.AbsoluteExternalPositionalAccuracyType;
import net.opengis.gml.AbstractGeneralOperationParameterRefDocument;
import net.opengis.gml.AbstractGeneralOperationParameterRefType;
import net.opengis.gml.AbstractGriddedSurfaceType;
import net.opengis.gml.AbstractParametricCurveSurfaceType;
import net.opengis.gml.AbstractRingPropertyType;
import net.opengis.gml.AbstractSolidType;
import net.opengis.gml.AbstractSurfaceType;
import net.opengis.gml.AesheticCriteriaType;
import net.opengis.gml.AffinePlacementDocument;
import net.opengis.gml.AffinePlacementType;
import net.opengis.gml.AnchorPointDocument;
import net.opengis.gml.AngleChoiceType;
import net.opengis.gml.AngleDocument;
import net.opengis.gml.AngleType;
import net.opengis.gml.ArcByBulgeDocument;
import net.opengis.gml.ArcByBulgeType;
import net.opengis.gml.ArcByCenterPointDocument;
import net.opengis.gml.ArcByCenterPointType;
import net.opengis.gml.ArcDocument;
import net.opengis.gml.ArcMinutesType;
import net.opengis.gml.ArcSecondsType;
import net.opengis.gml.ArcStringByBulgeDocument;
import net.opengis.gml.ArcStringByBulgeType;
import net.opengis.gml.ArcStringDocument;
import net.opengis.gml.ArcStringType;
import net.opengis.gml.ArcType;
import net.opengis.gml.AreaType;
import net.opengis.gml.ArrayAssociationType;
import net.opengis.gml.ArrayDocument;
import net.opengis.gml.ArrayType;
import net.opengis.gml.AssociationDocument;
import net.opengis.gml.AssociationType;
import net.opengis.gml.AxisAbbrevDocument;
import net.opengis.gml.AxisDirectionDocument;
import net.opengis.gml.AxisIDDocument;
import net.opengis.gml.BSplineDocument;
import net.opengis.gml.BSplineType;
import net.opengis.gml.BagDocument;
import net.opengis.gml.BagType;
import net.opengis.gml.BaseCRSDocument;
import net.opengis.gml.BaseCurveDocument;
import net.opengis.gml.BaseStyleDescriptorType;
import net.opengis.gml.BaseSurfaceDocument;
import net.opengis.gml.BaseUnitDocument;
import net.opengis.gml.BaseUnitType;
import net.opengis.gml.BezierDocument;
import net.opengis.gml.BezierType;
import net.opengis.gml.BooleanDocument;
import net.opengis.gml.BooleanList;
import net.opengis.gml.BooleanListDocument;
import net.opengis.gml.BooleanOrNull;
import net.opengis.gml.BooleanOrNullList;
import net.opengis.gml.BooleanPropertyType;
import net.opengis.gml.BooleanValueDocument;
import net.opengis.gml.BoundedByDocument;
import net.opengis.gml.BoundedFeatureType;
import net.opengis.gml.BoundingBoxDocument;
import net.opengis.gml.BoundingPolygonDocument;
import net.opengis.gml.BoundingShapeType;
import net.opengis.gml.CRSDocument;
import net.opengis.gml.CRSRefType;
import net.opengis.gml.CalDate;
import net.opengis.gml.CartesianCSDocument;
import net.opengis.gml.CartesianCSRefDocument;
import net.opengis.gml.CartesianCSRefType;
import net.opengis.gml.CartesianCSType;
import net.opengis.gml.CatalogSymbolDocument;
import net.opengis.gml.CategoryDocument;
import net.opengis.gml.CategoryExtentDocument;
import net.opengis.gml.CategoryExtentType;
import net.opengis.gml.CategoryListDocument;
import net.opengis.gml.CategoryPropertyType;
import net.opengis.gml.CenterLineOfDocument;
import net.opengis.gml.CenterOfDocument;
import net.opengis.gml.CircleByCenterPointDocument;
import net.opengis.gml.CircleByCenterPointType;
import net.opengis.gml.CircleDocument;
import net.opengis.gml.CircleType;
import net.opengis.gml.ClothoidDocument;
import net.opengis.gml.ClothoidType;
import net.opengis.gml.CodeListType;
import net.opengis.gml.CodeOrNullListType;
import net.opengis.gml.CodeType;
import net.opengis.gml.ColumnIndexDocument;
import net.opengis.gml.CompassPointDocument;
import net.opengis.gml.CompassPointEnumeration;
import net.opengis.gml.CompositeCurveDocument;
import net.opengis.gml.CompositeCurvePropertyType;
import net.opengis.gml.CompositeCurveType;
import net.opengis.gml.CompositeSolidDocument;
import net.opengis.gml.CompositeSolidPropertyType;
import net.opengis.gml.CompositeSolidType;
import net.opengis.gml.CompositeSurfaceDocument;
import net.opengis.gml.CompositeSurfacePropertyType;
import net.opengis.gml.CompositeSurfaceType;
import net.opengis.gml.CompositeValueDocument;
import net.opengis.gml.CompositeValueType;
import net.opengis.gml.CompoundCRSDocument;
import net.opengis.gml.CompoundCRSRefDocument;
import net.opengis.gml.CompoundCRSRefType;
import net.opengis.gml.CompoundCRSType;
import net.opengis.gml.ConcatenatedOperationDocument;
import net.opengis.gml.ConcatenatedOperationRefDocument;
import net.opengis.gml.ConcatenatedOperationRefType;
import net.opengis.gml.ConcatenatedOperationType;
import net.opengis.gml.ConeDocument;
import net.opengis.gml.ConeType;
import net.opengis.gml.ContainerDocument;
import net.opengis.gml.ContainerPropertyType;
import net.opengis.gml.ContinuousCoverageDocument;
import net.opengis.gml.ConventionalUnitDocument;
import net.opengis.gml.ConventionalUnitType;
import net.opengis.gml.ConversionDocument;
import net.opengis.gml.ConversionRefDocument;
import net.opengis.gml.ConversionRefType;
import net.opengis.gml.ConversionToPreferredUnitDocument;
import net.opengis.gml.ConversionToPreferredUnitType;
import net.opengis.gml.ConversionType;
import net.opengis.gml.CoordDocument;
import net.opengis.gml.CoordType;
import net.opengis.gml.CoordinateOperationDocument;
import net.opengis.gml.CoordinateOperationIDDocument;
import net.opengis.gml.CoordinateOperationNameDocument;
import net.opengis.gml.CoordinateOperationRefDocument;
import net.opengis.gml.CoordinateOperationRefType;
import net.opengis.gml.CoordinateReferenceSystemDocument;
import net.opengis.gml.CoordinateReferenceSystemRefDocument;
import net.opengis.gml.CoordinateReferenceSystemRefType;
import net.opengis.gml.CoordinateSystemAxisBaseType;
import net.opengis.gml.CoordinateSystemAxisDocument;
import net.opengis.gml.CoordinateSystemAxisRefDocument;
import net.opengis.gml.CoordinateSystemAxisRefType;
import net.opengis.gml.CoordinateSystemAxisType;
import net.opengis.gml.CoordinateSystemDocument;
import net.opengis.gml.CoordinateSystemRefDocument;
import net.opengis.gml.CoordinateSystemRefType;
import net.opengis.gml.CoordinatesDocument;
import net.opengis.gml.CoordinatesType;
import net.opengis.gml.CountDocument;
import net.opengis.gml.CountExtentDocument;
import net.opengis.gml.CountExtentType;
import net.opengis.gml.CountListDocument;
import net.opengis.gml.CountPropertyType;
import net.opengis.gml.CovarianceDocument;
import net.opengis.gml.CovarianceElementType;
import net.opengis.gml.CovarianceMatrixDocument;
import net.opengis.gml.CovarianceMatrixType;
import net.opengis.gml.CoverageDocument;
import net.opengis.gml.CoverageFunctionDocument;
import net.opengis.gml.CoverageFunctionType;
import net.opengis.gml.CrsRefDocument;
import net.opengis.gml.CsIDDocument;
import net.opengis.gml.CsNameDocument;
import net.opengis.gml.CubicSplineDocument;
import net.opengis.gml.CubicSplineType;
import net.opengis.gml.CurveArrayPropertyDocument;
import net.opengis.gml.CurveArrayPropertyType;
import net.opengis.gml.CurveDocument;
import net.opengis.gml.CurveInterpolationType;
import net.opengis.gml.CurveMemberDocument;
import net.opengis.gml.CurveMembersDocument;
import net.opengis.gml.CurvePropertyDocument;
import net.opengis.gml.CurvePropertyType;
import net.opengis.gml.CurveSegmentArrayPropertyType;
import net.opengis.gml.CurveSegmentDocument;
import net.opengis.gml.CurveType;
import net.opengis.gml.CylinderDocument;
import net.opengis.gml.CylinderType;
import net.opengis.gml.CylindricalCSDocument;
import net.opengis.gml.CylindricalCSRefDocument;
import net.opengis.gml.CylindricalCSRefType;
import net.opengis.gml.CylindricalCSType;
import net.opengis.gml.DMSAngleType;
import net.opengis.gml.DataBlockDocument;
import net.opengis.gml.DataBlockType;
import net.opengis.gml.DataSourceDocument;
import net.opengis.gml.DatumDocument;
import net.opengis.gml.DatumIDDocument;
import net.opengis.gml.DatumNameDocument;
import net.opengis.gml.DatumRefDocument;
import net.opengis.gml.DatumRefType;
import net.opengis.gml.DecimalMinutesDocument;
import net.opengis.gml.DecimalMinutesType;
import net.opengis.gml.DefaultStyleDocument;
import net.opengis.gml.DefaultStylePropertyType;
import net.opengis.gml.DefinedByConversionDocument;
import net.opengis.gml.DefinitionCollectionDocument;
import net.opengis.gml.DefinitionDocument;
import net.opengis.gml.DefinitionMemberDocument;
import net.opengis.gml.DefinitionProxyDocument;
import net.opengis.gml.DefinitionProxyType;
import net.opengis.gml.DefinitionRefDocument;
import net.opengis.gml.DefinitionType;
import net.opengis.gml.DegreeValueType;
import net.opengis.gml.DegreesDocument;
import net.opengis.gml.DegreesType;
import net.opengis.gml.DerivationUnitTermDocument;
import net.opengis.gml.DerivationUnitTermType;
import net.opengis.gml.DerivedCRSDocument;
import net.opengis.gml.DerivedCRSRefDocument;
import net.opengis.gml.DerivedCRSRefType;
import net.opengis.gml.DerivedCRSType;
import net.opengis.gml.DerivedCRSTypeDocument;
import net.opengis.gml.DerivedCRSTypeType;
import net.opengis.gml.DerivedUnitDocument;
import net.opengis.gml.DerivedUnitType;
import net.opengis.gml.DescriptionDocument;
import net.opengis.gml.DictionaryDocument;
import net.opengis.gml.DictionaryEntryDocument;
import net.opengis.gml.DictionaryEntryType;
import net.opengis.gml.DictionaryType;
import net.opengis.gml.DirectPositionListType;
import net.opengis.gml.DirectPositionType;
import net.opengis.gml.DirectedEdgeDocument;
import net.opengis.gml.DirectedEdgePropertyType;
import net.opengis.gml.DirectedFaceDocument;
import net.opengis.gml.DirectedFacePropertyType;
import net.opengis.gml.DirectedNodeDocument;
import net.opengis.gml.DirectedNodePropertyType;
import net.opengis.gml.DirectedObservationAtDistanceDocument;
import net.opengis.gml.DirectedObservationAtDistanceType;
import net.opengis.gml.DirectedObservationDocument;
import net.opengis.gml.DirectedObservationType;
import net.opengis.gml.DirectedTopoSolidDocument;
import net.opengis.gml.DirectedTopoSolidPropertyType;
import net.opengis.gml.DirectionDocument;
import net.opengis.gml.DirectionPropertyType;
import net.opengis.gml.DirectionVectorDocument;
import net.opengis.gml.DirectionVectorType;
import net.opengis.gml.DiscreteCoverageDocument;
import net.opengis.gml.DmsAngleDocument;
import net.opengis.gml.DmsAngleValueDocument;
import net.opengis.gml.DomainSetDocument;
import net.opengis.gml.DomainSetType;
import net.opengis.gml.DoubleList;
import net.opengis.gml.DoubleOrNull;
import net.opengis.gml.DoubleOrNullList;
import net.opengis.gml.DoubleOrNullTupleListDocument;
import net.opengis.gml.DrawingTypeType;
import net.opengis.gml.DurationDocument;
import net.opengis.gml.DynamicFeatureCollectionType;
import net.opengis.gml.DynamicFeatureType;
import net.opengis.gml.EdgeDocument;
import net.opengis.gml.EdgeOfDocument;
import net.opengis.gml.EdgeType;
import net.opengis.gml.EllipsoidBaseType;
import net.opengis.gml.EllipsoidDocument;
import net.opengis.gml.EllipsoidIDDocument;
import net.opengis.gml.EllipsoidNameDocument;
import net.opengis.gml.EllipsoidRefDocument;
import net.opengis.gml.EllipsoidRefType;
import net.opengis.gml.EllipsoidType;
import net.opengis.gml.EllipsoidalCSDocument;
import net.opengis.gml.EllipsoidalCSRefDocument;
import net.opengis.gml.EllipsoidalCSRefType;
import net.opengis.gml.EllipsoidalCSType;
import net.opengis.gml.EngineeringCRSDocument;
import net.opengis.gml.EngineeringCRSRefDocument;
import net.opengis.gml.EngineeringCRSRefType;
import net.opengis.gml.EngineeringCRSType;
import net.opengis.gml.EngineeringDatumDocument;
import net.opengis.gml.EngineeringDatumRefDocument;
import net.opengis.gml.EngineeringDatumRefType;
import net.opengis.gml.EngineeringDatumType;
import net.opengis.gml.EnvelopeDocument;
import net.opengis.gml.EnvelopeType;
import net.opengis.gml.EnvelopeWithTimePeriodDocument;
import net.opengis.gml.EnvelopeWithTimePeriodType;
import net.opengis.gml.ExtentOfDocument;
import net.opengis.gml.ExtentType;
import net.opengis.gml.ExteriorDocument;
import net.opengis.gml.FaceDocument;
import net.opengis.gml.FaceType;
import net.opengis.gml.FeatureArrayPropertyType;
import net.opengis.gml.FeatureCollectionDocument;
import net.opengis.gml.FeatureCollectionType;
import net.opengis.gml.FeatureDocument;
import net.opengis.gml.FeatureMemberDocument;
import net.opengis.gml.FeatureMembersDocument;
import net.opengis.gml.FeaturePropertyDocument;
import net.opengis.gml.FeaturePropertyType;
import net.opengis.gml.FeatureStyleDocument;
import net.opengis.gml.FeatureStylePropertyType;
import net.opengis.gml.FeatureStyleType;
import net.opengis.gml.FileDocument;
import net.opengis.gml.FileType;
import net.opengis.gml.FileValueModelType;
import net.opengis.gml.FormulaType;
import net.opengis.gml.GMLDocument;
import net.opengis.gml.GeneralConversionDocument;
import net.opengis.gml.GeneralConversionRefDocument;
import net.opengis.gml.GeneralConversionRefType;
import net.opengis.gml.GeneralDerivedCRSDocument;
import net.opengis.gml.GeneralOperationParameterDocument;
import net.opengis.gml.GeneralParameterValueDocument;
import net.opengis.gml.GeneralTransformationDocument;
import net.opengis.gml.GeneralTransformationRefDocument;
import net.opengis.gml.GeneralTransformationRefType;
import net.opengis.gml.GenericMetaDataDocument;
import net.opengis.gml.GenericMetaDataType;
import net.opengis.gml.GeocentricCRSDocument;
import net.opengis.gml.GeocentricCRSRefDocument;
import net.opengis.gml.GeocentricCRSRefType;
import net.opengis.gml.GeocentricCRSType;
import net.opengis.gml.GeodesicDocument;
import net.opengis.gml.GeodesicStringDocument;
import net.opengis.gml.GeodesicStringType;
import net.opengis.gml.GeodesicType;
import net.opengis.gml.GeodeticDatumDocument;
import net.opengis.gml.GeodeticDatumRefDocument;
import net.opengis.gml.GeodeticDatumRefType;
import net.opengis.gml.GeodeticDatumType;
import net.opengis.gml.GeographicCRSDocument;
import net.opengis.gml.GeographicCRSRefDocument;
import net.opengis.gml.GeographicCRSRefType;
import net.opengis.gml.GeographicCRSType;
import net.opengis.gml.GeometricAggregateDocument;
import net.opengis.gml.GeometricComplexDocument;
import net.opengis.gml.GeometricComplexPropertyType;
import net.opengis.gml.GeometricComplexType;
import net.opengis.gml.GeometricPrimitiveDocument;
import net.opengis.gml.GeometricPrimitivePropertyType;
import net.opengis.gml.GeometryArrayPropertyType;
import net.opengis.gml.GeometryDocument;
import net.opengis.gml.GeometryMemberDocument;
import net.opengis.gml.GeometryMembersDocument;
import net.opengis.gml.GeometryPropertyType;
import net.opengis.gml.GeometryStyleDocument;
import net.opengis.gml.GeometryStylePropertyType;
import net.opengis.gml.GeometryStyleType;
import net.opengis.gml.GraphStyleDocument;
import net.opengis.gml.GraphStylePropertyType;
import net.opengis.gml.GraphStyleType;
import net.opengis.gml.GraphTypeType;
import net.opengis.gml.GreenwichLongitudeDocument;
import net.opengis.gml.GridCoverageDocument;
import net.opengis.gml.GridCoverageType;
import net.opengis.gml.GridDocument;
import net.opengis.gml.GridDomainDocument;
import net.opengis.gml.GridDomainType;
import net.opengis.gml.GridEnvelopeType;
import net.opengis.gml.GridFunctionDocument;
import net.opengis.gml.GridFunctionType;
import net.opengis.gml.GridLengthType;
import net.opengis.gml.GridLimitsType;
import net.opengis.gml.GridType;
import net.opengis.gml.GriddedSurfaceDocument;
import net.opengis.gml.GroupIDDocument;
import net.opengis.gml.GroupNameDocument;
import net.opengis.gml.HistoryDocument;
import net.opengis.gml.HistoryPropertyType;
import net.opengis.gml.IdAttribute;
import net.opengis.gml.IdentifierType;
import net.opengis.gml.ImageCRSDocument;
import net.opengis.gml.ImageCRSRefDocument;
import net.opengis.gml.ImageCRSRefType;
import net.opengis.gml.ImageCRSType;
import net.opengis.gml.ImageDatumDocument;
import net.opengis.gml.ImageDatumRefDocument;
import net.opengis.gml.ImageDatumRefType;
import net.opengis.gml.ImageDatumType;
import net.opengis.gml.ImplicitGeometryDocument;
import net.opengis.gml.IncludesCRSDocument;
import net.opengis.gml.IncludesElementDocument;
import net.opengis.gml.IncludesParameterDocument;
import net.opengis.gml.IncludesValueDocument;
import net.opengis.gml.IncrementOrder;
import net.opengis.gml.IndexMapDocument;
import net.opengis.gml.IndexMapType;
import net.opengis.gml.IndirectEntryDocument;
import net.opengis.gml.IndirectEntryType;
import net.opengis.gml.InnerBoundaryIsDocument;
import net.opengis.gml.IntegerList;
import net.opengis.gml.IntegerOrNull;
import net.opengis.gml.IntegerOrNullList;
import net.opengis.gml.IntegerValueDocument;
import net.opengis.gml.IntegerValueListDocument;
import net.opengis.gml.InteriorDocument;
import net.opengis.gml.InverseFlatteningDocument;
import net.opengis.gml.IsSphereDocument;
import net.opengis.gml.IsolatedDocument;
import net.opengis.gml.IsolatedPropertyType;
import net.opengis.gml.KnotPropertyType;
import net.opengis.gml.KnotType;
import net.opengis.gml.KnotTypesType;
import net.opengis.gml.LabelStyleDocument;
import net.opengis.gml.LabelStylePropertyType;
import net.opengis.gml.LabelStyleType;
import net.opengis.gml.LabelType;
import net.opengis.gml.LengthType;
import net.opengis.gml.LineStringDocument;
import net.opengis.gml.LineStringMemberDocument;
import net.opengis.gml.LineStringPropertyDocument;
import net.opengis.gml.LineStringPropertyType;
import net.opengis.gml.LineStringSegmentArrayPropertyType;
import net.opengis.gml.LineStringSegmentDocument;
import net.opengis.gml.LineStringSegmentType;
import net.opengis.gml.LineStringType;
import net.opengis.gml.LineTypeType;
import net.opengis.gml.LinearCSDocument;
import net.opengis.gml.LinearCSRefDocument;
import net.opengis.gml.LinearCSRefType;
import net.opengis.gml.LinearCSType;
import net.opengis.gml.LinearRingDocument;
import net.opengis.gml.LinearRingPropertyType;
import net.opengis.gml.LinearRingType;
import net.opengis.gml.LocationDocument;
import net.opengis.gml.LocationKeyWordDocument;
import net.opengis.gml.LocationPropertyType;
import net.opengis.gml.LocationStringDocument;
import net.opengis.gml.MappingRuleDocument;
import net.opengis.gml.MaximalComplexDocument;
import net.opengis.gml.MaximumOccursDocument;
import net.opengis.gml.MeasureDescriptionDocument;
import net.opengis.gml.MeasureDocument;
import net.opengis.gml.MeasureListType;
import net.opengis.gml.MeasureOrNullListType;
import net.opengis.gml.MeasureType;
import net.opengis.gml.MemberDocument;
import net.opengis.gml.MembersDocument;
import net.opengis.gml.MeridianIDDocument;
import net.opengis.gml.MeridianNameDocument;
import net.opengis.gml.MetaDataDocument;
import net.opengis.gml.MetaDataPropertyDocument;
import net.opengis.gml.MetaDataPropertyType;
import net.opengis.gml.MethodFormulaDocument;
import net.opengis.gml.MethodIDDocument;
import net.opengis.gml.MethodNameDocument;
import net.opengis.gml.MinimumOccursDocument;
import net.opengis.gml.MinutesDocument;
import net.opengis.gml.ModifiedCoordinateDocument;
import net.opengis.gml.MovingObjectStatusDocument;
import net.opengis.gml.MovingObjectStatusType;
import net.opengis.gml.MultiCenterLineOfDocument;
import net.opengis.gml.MultiCenterOfDocument;
import net.opengis.gml.MultiCoverageDocument;
import net.opengis.gml.MultiCurveCoverageDocument;
import net.opengis.gml.MultiCurveCoverageType;
import net.opengis.gml.MultiCurveDocument;
import net.opengis.gml.MultiCurveDomainDocument;
import net.opengis.gml.MultiCurveDomainType;
import net.opengis.gml.MultiCurvePropertyDocument;
import net.opengis.gml.MultiCurvePropertyType;
import net.opengis.gml.MultiCurveType;
import net.opengis.gml.MultiEdgeOfDocument;
import net.opengis.gml.MultiExtentOfDocument;
import net.opengis.gml.MultiGeometryDocument;
import net.opengis.gml.MultiGeometryPropertyDocument;
import net.opengis.gml.MultiGeometryPropertyType;
import net.opengis.gml.MultiGeometryType;
import net.opengis.gml.MultiLineStringDocument;
import net.opengis.gml.MultiLineStringPropertyType;
import net.opengis.gml.MultiLineStringType;
import net.opengis.gml.MultiLocationDocument;
import net.opengis.gml.MultiPointCoverageDocument;
import net.opengis.gml.MultiPointCoverageType;
import net.opengis.gml.MultiPointDocument;
import net.opengis.gml.MultiPointDomainDocument;
import net.opengis.gml.MultiPointDomainType;
import net.opengis.gml.MultiPointPropertyDocument;
import net.opengis.gml.MultiPointPropertyType;
import net.opengis.gml.MultiPointType;
import net.opengis.gml.MultiPolygonDocument;
import net.opengis.gml.MultiPolygonPropertyType;
import net.opengis.gml.MultiPolygonType;
import net.opengis.gml.MultiPositionDocument;
import net.opengis.gml.MultiSolidCoverageDocument;
import net.opengis.gml.MultiSolidCoverageType;
import net.opengis.gml.MultiSolidDocument;
import net.opengis.gml.MultiSolidDomainDocument;
import net.opengis.gml.MultiSolidDomainType;
import net.opengis.gml.MultiSolidPropertyDocument;
import net.opengis.gml.MultiSolidPropertyType;
import net.opengis.gml.MultiSolidType;
import net.opengis.gml.MultiSurfaceCoverageDocument;
import net.opengis.gml.MultiSurfaceCoverageType;
import net.opengis.gml.MultiSurfaceDocument;
import net.opengis.gml.MultiSurfaceDomainDocument;
import net.opengis.gml.MultiSurfaceDomainType;
import net.opengis.gml.MultiSurfacePropertyDocument;
import net.opengis.gml.MultiSurfacePropertyType;
import net.opengis.gml.MultiSurfaceType;
import net.opengis.gml.NCNameList;
import net.opengis.gml.NameDocument;
import net.opengis.gml.NameList;
import net.opengis.gml.NameOrNull;
import net.opengis.gml.NameOrNullList;
import net.opengis.gml.NodeDocument;
import net.opengis.gml.NodeType;
import net.opengis.gml.NullDocument;
import net.opengis.gml.NullEnumeration;
import net.opengis.gml.NullType;
import net.opengis.gml.ObjectDocument;
import net.opengis.gml.ObliqueCartesianCSDocument;
import net.opengis.gml.ObliqueCartesianCSRefDocument;
import net.opengis.gml.ObliqueCartesianCSRefType;
import net.opengis.gml.ObliqueCartesianCSType;
import net.opengis.gml.ObservationDocument;
import net.opengis.gml.ObservationType;
import net.opengis.gml.OffsetCurveDocument;
import net.opengis.gml.OffsetCurveType;
import net.opengis.gml.OperationDocument;
import net.opengis.gml.OperationMethodBaseType;
import net.opengis.gml.OperationMethodDocument;
import net.opengis.gml.OperationMethodRefDocument;
import net.opengis.gml.OperationMethodRefType;
import net.opengis.gml.OperationMethodType;
import net.opengis.gml.OperationParameterBaseType;
import net.opengis.gml.OperationParameterDocument;
import net.opengis.gml.OperationParameterGroupBaseType;
import net.opengis.gml.OperationParameterGroupDocument;
import net.opengis.gml.OperationParameterGroupRefDocument;
import net.opengis.gml.OperationParameterGroupRefType;
import net.opengis.gml.OperationParameterGroupType;
import net.opengis.gml.OperationParameterRefDocument;
import net.opengis.gml.OperationParameterRefType;
import net.opengis.gml.OperationParameterType;
import net.opengis.gml.OperationRefDocument;
import net.opengis.gml.OperationRefType;
import net.opengis.gml.OperationVersionDocument;
import net.opengis.gml.OrientableCurveDocument;
import net.opengis.gml.OrientableCurveType;
import net.opengis.gml.OrientableSurfaceDocument;
import net.opengis.gml.OrientableSurfaceType;
import net.opengis.gml.OriginDocument;
import net.opengis.gml.OuterBoundaryIsDocument;
import net.opengis.gml.ParameterIDDocument;
import net.opengis.gml.ParameterNameDocument;
import net.opengis.gml.ParameterValueDocument;
import net.opengis.gml.ParameterValueGroupDocument;
import net.opengis.gml.ParameterValueGroupType;
import net.opengis.gml.ParameterValueType;
import net.opengis.gml.ParametricCurveSurfaceDocument;
import net.opengis.gml.PassThroughOperationDocument;
import net.opengis.gml.PassThroughOperationRefDocument;
import net.opengis.gml.PassThroughOperationRefType;
import net.opengis.gml.PassThroughOperationType;
import net.opengis.gml.PatchesDocument;
import net.opengis.gml.PixelInCellDocument;
import net.opengis.gml.PixelInCellType;
import net.opengis.gml.PointArrayPropertyDocument;
import net.opengis.gml.PointArrayPropertyType;
import net.opengis.gml.PointDocument;
import net.opengis.gml.PointMemberDocument;
import net.opengis.gml.PointMembersDocument;
import net.opengis.gml.PointPropertyDocument;
import net.opengis.gml.PointPropertyType;
import net.opengis.gml.PointRepDocument;
import net.opengis.gml.PointType;
import net.opengis.gml.PolarCSDocument;
import net.opengis.gml.PolarCSRefDocument;
import net.opengis.gml.PolarCSRefType;
import net.opengis.gml.PolarCSType;
import net.opengis.gml.PolygonDocument;
import net.opengis.gml.PolygonMemberDocument;
import net.opengis.gml.PolygonPatchArrayPropertyType;
import net.opengis.gml.PolygonPatchDocument;
import net.opengis.gml.PolygonPatchType;
import net.opengis.gml.PolygonPatchesDocument;
import net.opengis.gml.PolygonPropertyDocument;
import net.opengis.gml.PolygonPropertyType;
import net.opengis.gml.PolygonType;
import net.opengis.gml.PolyhedralSurfaceDocument;
import net.opengis.gml.PolyhedralSurfaceType;
import net.opengis.gml.PosDocument;
import net.opengis.gml.PosListDocument;
import net.opengis.gml.PositionDocument;
import net.opengis.gml.PositionalAccuracyDocument;
import net.opengis.gml.PrimeMeridianBaseType;
import net.opengis.gml.PrimeMeridianDocument;
import net.opengis.gml.PrimeMeridianRefDocument;
import net.opengis.gml.PrimeMeridianRefType;
import net.opengis.gml.PrimeMeridianType;
import net.opengis.gml.PriorityLocationDocument;
import net.opengis.gml.PriorityLocationPropertyType;
import net.opengis.gml.ProjectedCRSDocument;
import net.opengis.gml.ProjectedCRSRefDocument;
import net.opengis.gml.ProjectedCRSRefType;
import net.opengis.gml.ProjectedCRSType;
import net.opengis.gml.QNameList;
import net.opengis.gml.QuantityDocument;
import net.opengis.gml.QuantityExtentDocument;
import net.opengis.gml.QuantityExtentType;
import net.opengis.gml.QuantityListDocument;
import net.opengis.gml.QuantityPropertyType;
import net.opengis.gml.QuantityTypeDocument;
import net.opengis.gml.QueryGrammarEnumeration;
import net.opengis.gml.RangeParametersDocument;
import net.opengis.gml.RangeParametersType;
import net.opengis.gml.RangeSetDocument;
import net.opengis.gml.RangeSetType;
import net.opengis.gml.RealizationEpochDocument;
import net.opengis.gml.RectangleDocument;
import net.opengis.gml.RectangleType;
import net.opengis.gml.RectifiedGridCoverageDocument;
import net.opengis.gml.RectifiedGridCoverageType;
import net.opengis.gml.RectifiedGridDocument;
import net.opengis.gml.RectifiedGridDomainDocument;
import net.opengis.gml.RectifiedGridDomainType;
import net.opengis.gml.RectifiedGridType;
import net.opengis.gml.ReferenceDocument;
import net.opengis.gml.ReferenceSystemDocument;
import net.opengis.gml.ReferenceSystemRefDocument;
import net.opengis.gml.ReferenceSystemRefType;
import net.opengis.gml.ReferenceType;
import net.opengis.gml.RelatedTimeType;
import net.opengis.gml.RelativeInternalPositionalAccuracyDocument;
import net.opengis.gml.RelativeInternalPositionalAccuracyType;
import net.opengis.gml.RemarksDocument;
import net.opengis.gml.RemoteSchemaAttribute;
import net.opengis.gml.ResultDocument;
import net.opengis.gml.ResultOfDocument;
import net.opengis.gml.RingDocument;
import net.opengis.gml.RingPropertyType;
import net.opengis.gml.RingType;
import net.opengis.gml.RoughConversionToPreferredUnitDocument;
import net.opengis.gml.RowIndexDocument;
import net.opengis.gml.ScalarValuePropertyType;
import net.opengis.gml.ScaleType;
import net.opengis.gml.ScopeDocument;
import net.opengis.gml.SecondDefiningParameterDocument;
import net.opengis.gml.SecondDefiningParameterType;
import net.opengis.gml.SecondsDocument;
import net.opengis.gml.SegmentsDocument;
import net.opengis.gml.SemiMajorAxisDocument;
import net.opengis.gml.SemiMinorAxisDocument;
import net.opengis.gml.SequenceRuleNames;
import net.opengis.gml.SequenceRuleType;
import net.opengis.gml.SignType;
import net.opengis.gml.SingleOperationDocument;
import net.opengis.gml.SingleOperationRefDocument;
import net.opengis.gml.SingleOperationRefType;
import net.opengis.gml.SolidArrayPropertyDocument;
import net.opengis.gml.SolidArrayPropertyType;
import net.opengis.gml.SolidDocument;
import net.opengis.gml.SolidMemberDocument;
import net.opengis.gml.SolidMembersDocument;
import net.opengis.gml.SolidPropertyDocument;
import net.opengis.gml.SolidPropertyType;
import net.opengis.gml.SolidType;
import net.opengis.gml.SourceCRSDocument;
import net.opengis.gml.SourceDimensionsDocument;
import net.opengis.gml.SpeedType;
import net.opengis.gml.SphereDocument;
import net.opengis.gml.SphereType;
import net.opengis.gml.SphericalCSDocument;
import net.opengis.gml.SphericalCSRefDocument;
import net.opengis.gml.SphericalCSRefType;
import net.opengis.gml.SphericalCSType;
import net.opengis.gml.SrsIDDocument;
import net.opengis.gml.SrsNameDocument;
import net.opengis.gml.StatusDocument;
import net.opengis.gml.StrictAssociationDocument;
import net.opengis.gml.StringOrNull;
import net.opengis.gml.StringOrRefType;
import net.opengis.gml.StringValueDocument;
import net.opengis.gml.StyleDocument;
import net.opengis.gml.StyleType;
import net.opengis.gml.StyleVariationType;
import net.opengis.gml.SubComplexDocument;
import net.opengis.gml.SubjectDocument;
import net.opengis.gml.SuccessionType;
import net.opengis.gml.SuperComplexDocument;
import net.opengis.gml.SurfaceArrayPropertyDocument;
import net.opengis.gml.SurfaceArrayPropertyType;
import net.opengis.gml.SurfaceDocument;
import net.opengis.gml.SurfaceInterpolationType;
import net.opengis.gml.SurfaceMemberDocument;
import net.opengis.gml.SurfaceMembersDocument;
import net.opengis.gml.SurfacePatchArrayPropertyType;
import net.opengis.gml.SurfacePatchDocument;
import net.opengis.gml.SurfacePropertyDocument;
import net.opengis.gml.SurfacePropertyType;
import net.opengis.gml.SurfaceType;
import net.opengis.gml.SymbolDocument;
import net.opengis.gml.SymbolType;
import net.opengis.gml.SymbolTypeEnumeration;
import net.opengis.gml.TargetCRSDocument;
import net.opengis.gml.TargetDimensionsDocument;
import net.opengis.gml.TargetDocument;
import net.opengis.gml.TargetPropertyType;
import net.opengis.gml.TemporalCRSDocument;
import net.opengis.gml.TemporalCRSRefDocument;
import net.opengis.gml.TemporalCRSRefType;
import net.opengis.gml.TemporalCRSType;
import net.opengis.gml.TemporalCSDocument;
import net.opengis.gml.TemporalCSRefDocument;
import net.opengis.gml.TemporalCSRefType;
import net.opengis.gml.TemporalCSType;
import net.opengis.gml.TemporalDatumBaseType;
import net.opengis.gml.TemporalDatumDocument;
import net.opengis.gml.TemporalDatumRefDocument;
import net.opengis.gml.TemporalDatumRefType;
import net.opengis.gml.TemporalDatumType;
import net.opengis.gml.TemporalExtentDocument;
import net.opengis.gml.TimeCalendarDocument;
import net.opengis.gml.TimeCalendarEraDocument;
import net.opengis.gml.TimeCalendarEraPropertyType;
import net.opengis.gml.TimeCalendarEraType;
import net.opengis.gml.TimeCalendarPropertyType;
import net.opengis.gml.TimeCalendarType;
import net.opengis.gml.TimeClockDocument;
import net.opengis.gml.TimeClockPropertyType;
import net.opengis.gml.TimeClockType;
import net.opengis.gml.TimeComplexDocument;
import net.opengis.gml.TimeCoordinateSystemDocument;
import net.opengis.gml.TimeCoordinateSystemType;
import net.opengis.gml.TimeEdgeDocument;
import net.opengis.gml.TimeEdgePropertyType;
import net.opengis.gml.TimeEdgeType;
import net.opengis.gml.TimeGeometricPrimitiveDocument;
import net.opengis.gml.TimeGeometricPrimitivePropertyType;
import net.opengis.gml.TimeIndeterminateValueType;
import net.opengis.gml.TimeInstantDocument;
import net.opengis.gml.TimeInstantPropertyType;
import net.opengis.gml.TimeInstantType;
import net.opengis.gml.TimeIntervalDocument;
import net.opengis.gml.TimeIntervalLengthType;
import net.opengis.gml.TimeNodeDocument;
import net.opengis.gml.TimeNodePropertyType;
import net.opengis.gml.TimeNodeType;
import net.opengis.gml.TimeObjectDocument;
import net.opengis.gml.TimeOrdinalEraDocument;
import net.opengis.gml.TimeOrdinalEraPropertyType;
import net.opengis.gml.TimeOrdinalEraType;
import net.opengis.gml.TimeOrdinalReferenceSystemDocument;
import net.opengis.gml.TimeOrdinalReferenceSystemType;
import net.opengis.gml.TimePeriodDocument;
import net.opengis.gml.TimePeriodPropertyType;
import net.opengis.gml.TimePeriodType;
import net.opengis.gml.TimePositionDocument;
import net.opengis.gml.TimePositionType;
import net.opengis.gml.TimePositionUnion;
import net.opengis.gml.TimePrimitiveDocument;
import net.opengis.gml.TimePrimitivePropertyType;
import net.opengis.gml.TimeReferenceSystemDocument;
import net.opengis.gml.TimeSliceDocument;
import net.opengis.gml.TimeTopologyComplexDocument;
import net.opengis.gml.TimeTopologyComplexPropertyType;
import net.opengis.gml.TimeTopologyComplexType;
import net.opengis.gml.TimeTopologyPrimitiveDocument;
import net.opengis.gml.TimeTopologyPrimitivePropertyType;
import net.opengis.gml.TimeType;
import net.opengis.gml.TimeUnitType;
import net.opengis.gml.TinDocument;
import net.opengis.gml.TinType;
import net.opengis.gml.TopoComplexDocument;
import net.opengis.gml.TopoComplexMemberType;
import net.opengis.gml.TopoComplexPropertyDocument;
import net.opengis.gml.TopoComplexType;
import net.opengis.gml.TopoCurveDocument;
import net.opengis.gml.TopoCurvePropertyDocument;
import net.opengis.gml.TopoCurvePropertyType;
import net.opengis.gml.TopoCurveType;
import net.opengis.gml.TopoPointDocument;
import net.opengis.gml.TopoPointPropertyDocument;
import net.opengis.gml.TopoPointPropertyType;
import net.opengis.gml.TopoPointType;
import net.opengis.gml.TopoPrimitiveArrayAssociationType;
import net.opengis.gml.TopoPrimitiveDocument;
import net.opengis.gml.TopoPrimitiveMemberDocument;
import net.opengis.gml.TopoPrimitiveMemberType;
import net.opengis.gml.TopoPrimitiveMembersDocument;
import net.opengis.gml.TopoSolidDocument;
import net.opengis.gml.TopoSolidType;
import net.opengis.gml.TopoSurfaceDocument;
import net.opengis.gml.TopoSurfacePropertyDocument;
import net.opengis.gml.TopoSurfacePropertyType;
import net.opengis.gml.TopoSurfaceType;
import net.opengis.gml.TopoVolumeDocument;
import net.opengis.gml.TopoVolumePropertyDocument;
import net.opengis.gml.TopoVolumePropertyType;
import net.opengis.gml.TopoVolumeType;
import net.opengis.gml.TopologyDocument;
import net.opengis.gml.TopologyStyleDocument;
import net.opengis.gml.TopologyStylePropertyType;
import net.opengis.gml.TopologyStyleType;
import net.opengis.gml.TrackDocument;
import net.opengis.gml.TrackType;
import net.opengis.gml.TransformAttribute;
import net.opengis.gml.TransformationDocument;
import net.opengis.gml.TransformationRefDocument;
import net.opengis.gml.TransformationRefType;
import net.opengis.gml.TransformationType;
import net.opengis.gml.TriangleDocument;
import net.opengis.gml.TrianglePatchArrayPropertyType;
import net.opengis.gml.TrianglePatchesDocument;
import net.opengis.gml.TriangleType;
import net.opengis.gml.TriangulatedSurfaceDocument;
import net.opengis.gml.TriangulatedSurfaceType;
import net.opengis.gml.TupleListDocument;
import net.opengis.gml.UnitDefinitionDocument;
import net.opengis.gml.UnitDefinitionType;
import net.opengis.gml.UnitOfMeasureDocument;
import net.opengis.gml.UnitOfMeasureType;
import net.opengis.gml.UomAttribute;
import net.opengis.gml.UserDefinedCSDocument;
import net.opengis.gml.UserDefinedCSRefDocument;
import net.opengis.gml.UserDefinedCSRefType;
import net.opengis.gml.UserDefinedCSType;
import net.opengis.gml.UsesAxisDocument;
import net.opengis.gml.UsesCSDocument;
import net.opengis.gml.UsesCartesianCSDocument;
import net.opengis.gml.UsesEllipsoidDocument;
import net.opengis.gml.UsesEllipsoidalCSDocument;
import net.opengis.gml.UsesEngineeringDatumDocument;
import net.opengis.gml.UsesGeodeticDatumDocument;
import net.opengis.gml.UsesImageDatumDocument;
import net.opengis.gml.UsesMethodDocument;
import net.opengis.gml.UsesObliqueCartesianCSDocument;
import net.opengis.gml.UsesOperationDocument;
import net.opengis.gml.UsesParameterDocument;
import net.opengis.gml.UsesPrimeMeridianDocument;
import net.opengis.gml.UsesSingleOperationDocument;
import net.opengis.gml.UsesSphericalCSDocument;
import net.opengis.gml.UsesTemporalCSDocument;
import net.opengis.gml.UsesTemporalDatumDocument;
import net.opengis.gml.UsesValueDocument;
import net.opengis.gml.UsesVerticalCSDocument;
import net.opengis.gml.UsesVerticalDatumDocument;
import net.opengis.gml.UsingDocument;
import net.opengis.gml.ValidAreaDocument;
import net.opengis.gml.ValidTimeDocument;
import net.opengis.gml.ValueArrayDocument;
import net.opengis.gml.ValueArrayPropertyType;
import net.opengis.gml.ValueArrayType;
import net.opengis.gml.ValueComponentDocument;
import net.opengis.gml.ValueComponentsDocument;
import net.opengis.gml.ValueDocument;
import net.opengis.gml.ValueFileDocument;
import net.opengis.gml.ValueListDocument;
import net.opengis.gml.ValueOfParameterDocument;
import net.opengis.gml.ValuePropertyDocument;
import net.opengis.gml.ValuePropertyType;
import net.opengis.gml.ValuesOfGroupDocument;
import net.opengis.gml.VectorDocument;
import net.opengis.gml.VectorType;
import net.opengis.gml.VersionDocument;
import net.opengis.gml.VerticalCRSDocument;
import net.opengis.gml.VerticalCRSRefDocument;
import net.opengis.gml.VerticalCRSRefType;
import net.opengis.gml.VerticalCRSType;
import net.opengis.gml.VerticalCSDocument;
import net.opengis.gml.VerticalCSRefDocument;
import net.opengis.gml.VerticalCSRefType;
import net.opengis.gml.VerticalCSType;
import net.opengis.gml.VerticalDatumDocument;
import net.opengis.gml.VerticalDatumRefDocument;
import net.opengis.gml.VerticalDatumRefType;
import net.opengis.gml.VerticalDatumType;
import net.opengis.gml.VerticalDatumTypeDocument;
import net.opengis.gml.VerticalDatumTypeType;
import net.opengis.gml.VerticalExtentDocument;
import net.opengis.gml.VolumeType;
import net.opengis.gml.impl.BoundedFeatureTypeImpl;
import org.apache.xmlbeans.XmlObject;
import org.lidoSchema.ActorComplexType;
import org.lidoSchema.ActorInRoleComplexType;
import org.lidoSchema.ActorInRoleSetComplexType;
import org.lidoSchema.ActorSetComplexType;
import org.lidoSchema.AddedSearchTermAttribute;
import org.lidoSchema.AdministrativeMetadataComplexType;
import org.lidoSchema.AdministrativeMetadataDocument;
import org.lidoSchema.AppellationComplexType;
import org.lidoSchema.ClassificationWrapDocument;
import org.lidoSchema.ConceptComplexType;
import org.lidoSchema.DateComplexType;
import org.lidoSchema.DateSetComplexType;
import org.lidoSchema.DescriptiveMetadataComplexType;
import org.lidoSchema.DescriptiveMetadataDocument;
import org.lidoSchema.DescriptiveNoteComplexType;
import org.lidoSchema.DisplayStateEditionWrapDocument;
import org.lidoSchema.EncodinganalogAttribute;
import org.lidoSchema.EventComplexType;
import org.lidoSchema.EventSetComplexType;
import org.lidoSchema.EventWrapDocument;
import org.lidoSchema.GeographicalEntityAttribute;
import org.lidoSchema.GmlComplexType;
import org.lidoSchema.IdentifierComplexType;
import org.lidoSchema.InscriptionsWrapDocument;
import org.lidoSchema.LabelAttribute;
import org.lidoSchema.LegalBodyRefComplexType;
import org.lidoSchema.LidoComplexType;
import org.lidoSchema.LidoDocument;
import org.lidoSchema.LidoWrapDocument;
import org.lidoSchema.MaterialsTechComplexType;
import org.lidoSchema.MaterialsTechSetComplexType;
import org.lidoSchema.MeasurementsSetComplexType;
import org.lidoSchema.ObjectClassificationWrapDocument;
import org.lidoSchema.ObjectComplexType;
import org.lidoSchema.ObjectDescriptionWrapDocument;
import org.lidoSchema.ObjectIdentificationWrapDocument;
import org.lidoSchema.ObjectMeasurementsComplexType;
import org.lidoSchema.ObjectMeasurementsSetComplexType;
import org.lidoSchema.ObjectMeasurementsWrapDocument;
import org.lidoSchema.ObjectRelationWrapDocument;
import org.lidoSchema.ObjectSetComplexType;
import org.lidoSchema.ObjectWorkTypeWrapDocument;
import org.lidoSchema.PlaceComplexType;
import org.lidoSchema.PlaceSetComplexType;
import org.lidoSchema.PoliticalEntityAttribute;
import org.lidoSchema.PrefAttribute;
import org.lidoSchema.RecordInfoSetComplexType;
import org.lidoSchema.RecordWrapDocument;
import org.lidoSchema.RelatedEventSetComplexType;
import org.lidoSchema.RelatedWorkSetComplexType;
import org.lidoSchema.RelatedWorksWrapDocument;
import org.lidoSchema.RelatedencodingAttribute;
import org.lidoSchema.RepositorySetComplexType;
import org.lidoSchema.RepositoryWrapDocument;
import org.lidoSchema.ResourceSetComplexType;
import org.lidoSchema.ResourceWrapDocument;
import org.lidoSchema.RightsComplexType;
import org.lidoSchema.RightsWorkWrapDocument;
import org.lidoSchema.SortorderAttribute;
import org.lidoSchema.SourceAttribute;
import org.lidoSchema.SubjectComplexType;
import org.lidoSchema.SubjectSetComplexType;
import org.lidoSchema.SubjectWrapDocument;
import org.lidoSchema.TermComplexType;
import org.lidoSchema.TextComplexType;
import org.lidoSchema.TitleWrapDocument;
import org.lidoSchema.TypeAttribute;
import org.lidoSchema.WebResourceComplexType;
import org.moosbusch.museum.document.MuseumXmlDocument;
import org.moosbusch.museum.inject.MuseumXmlModule;
import org.moosbusch.museum.inject.MuseumXmlObjectFactory;
import org.moosbusch.museum.inject.annotation.Language;
import org.moosbusch.museum.inject.annotation.RelatedEncoding;
import org.moosbusch.museum.document.lido.LidoXmlDocument;
import org.moosbusch.museum.document.lido.impl.DefaultLidoXmlDocument;
import org.moosbusch.museum.inject.lido.annotation.SortOrder;
import org.moosbusch.museum.inject.lido.spi.AbstractLidoModule;
import org.w3.x1999.xlink.ActuateAttribute;
import org.w3.x1999.xlink.ActuateType;
import org.w3.x1999.xlink.ArcroleAttribute;
import org.w3.x1999.xlink.ArcroleType;
import org.w3.x1999.xlink.Extended;
import org.w3.x1999.xlink.FromAttribute;
import org.w3.x1999.xlink.FromType;
import org.w3.x1999.xlink.HrefAttribute;
import org.w3.x1999.xlink.HrefType;
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
import org.w3.x1999.xlink.TypeType;
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
import org.w3.x2001.smil20.language.AnimateMotionType;
import org.w3.x2001.smil20.language.AnimateType;
import org.w3.x2001.smil20.language.SetType;

/**
 *
 * @author moosbusch
 */
public class DefaultLidoModule extends AbstractLidoModule {

    public DefaultLidoModule(MuseumXmlObjectFactory<? extends MuseumXmlModule, ? extends XmlObject> objFactory) {
        super(objFactory);
    }

    @Override
    protected void configureImpl() {
        binder().bind(String.class).annotatedWith(Language.class).toInstance(
                getLanguage());
        binder().bind(String.class).annotatedWith(RelatedEncoding.class).toInstance(
                getRelatedEncoding());
        binder().bind(BigInteger.class).annotatedWith(SortOrder.class).toInstance(
                BigInteger.ZERO);
        binder().bind(BigInteger.class).toInstance(BigInteger.ZERO);
    }

    @Override
    protected String createRelatedEncoding() {
        return MuseumXmlDocument.DEFAULT_RELATED_ENCODING;
    }

    @Provides
    @Override
    public LidoXmlDocument<? extends DefaultLidoObjectFactory> createDocument() {
        return new DefaultLidoXmlDocument();
    }

    @Provides
    @Override
    public TemporalDatumBaseType createGmlTemporalDatumBaseType() {
        TemporalDatumBaseType result = TemporalDatumType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PrimeMeridianBaseType createGmlPrimeMeridianBaseType() {
        PrimeMeridianBaseType result = PrimeMeridianType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OperationParameterGroupBaseType createGmlOperationParameterGroupBaseType() {
        OperationParameterGroupBaseType result = OperationParameterGroupType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OperationParameterBaseType createGmlOperationParameterBaseType() {
        OperationParameterBaseType result = OperationParameterType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OperationMethodBaseType createGmlOperationMethodBaseType() {
        OperationMethodBaseType result = OperationMethodType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EllipsoidBaseType createGmlEllipsoidBaseType() {
        EllipsoidBaseType result = EllipsoidType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CoordinateSystemAxisBaseType createGmlCoordinateSystemAxisBaseType() {
        CoordinateSystemAxisBaseType result = CoordinateSystemAxisType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public BoundedFeatureType createGmlBoundedFeatureType() {
        BoundedFeatureType result = new BoundedFeatureTypeImpl(BoundedFeatureType.type);

        return result;
    }


    @Provides
    @Override
    public RepositorySetComplexType createLidoRepositorySetComplexType() {
        RepositorySetComplexType result = RepositorySetComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AnimateMotionType createSmilAnimateMotionType() {
        AnimateMotionType result = AnimateMotionType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AnimateColorDocument createSmilAnimateColorDocument() {
        AnimateColorDocument result = AnimateColorDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AnimateColorType createSmilAnimateColorType() {
        AnimateColorType result = AnimateColorType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AnimateDocument createSmilAnimateDocument() {
        AnimateDocument result = AnimateDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AnimateMotionDocument createSmilAnimateMotionDocument() {
        AnimateMotionDocument result = AnimateMotionDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AnimateType createSmilAnimateType() {
        AnimateType result = AnimateType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SetDocument createSmilSetDocument() {
        SetDocument result = SetDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SetType createSmilSetType() {
        SetType result = SetType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AnimateColorPrototype createSmilAnimateColorPrototype() {
        AnimateColorPrototype result = AnimateColorPrototype.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AnimateMotionPrototype createSmilAnimateMotionPrototype() {
        AnimateMotionPrototype result = AnimateMotionPrototype.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AnimatePrototype createSmilAnimatePrototype() {
        AnimatePrototype result = AnimatePrototype.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public FillDefaultType createSmilFillDefaultType() {
        FillDefaultType result = FillDefaultType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public FillTimingAttrsType createSmilFillTimingAttrsType() {
        FillTimingAttrsType result = FillTimingAttrsType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public NonNegativeDecimalType createSmilNonNegativeDecimalType() {
        NonNegativeDecimalType result = NonNegativeDecimalType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RestartDefaultType createSmilRestartDefaultType() {
        RestartDefaultType result = RestartDefaultType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RestartTimingType createSmilRestartTimingType() {
        RestartTimingType result = RestartTimingType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SetPrototype createSmilSetPrototype() {
        SetPrototype result = SetPrototype.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SyncBehaviorDefaultType createSmilSyncBehaviorDefaultType() {
        SyncBehaviorDefaultType result = SyncBehaviorDefaultType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SyncBehaviorType createSmilSyncBehaviorType() {
        SyncBehaviorType result = SyncBehaviorType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ActuateAttribute createXLinkActuateAttribute() {
        ActuateAttribute result = ActuateAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ActuateType createXLinkActuateType() {
        ActuateType result = ActuateType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ArcDocument createGmlArcDocument() {
        ArcDocument result = ArcDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ArcroleAttribute createXLinkArcroleAttribute() {
        ArcroleAttribute result = ArcroleAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ArcroleType createXLinkArcroleType() {
        ArcroleType result = ArcroleType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ArcType createGmlArcType() {
        ArcType result = ArcType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public Extended createXLinkExtended() {
        Extended result = Extended.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public FromAttribute createXLinkFromAttribute() {
        FromAttribute result = FromAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public FromType createXLinkFromType() {
        FromType result = FromType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public HrefAttribute createXLinkHrefAttribute() {
        HrefAttribute result = HrefAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public HrefType createXLinkHrefType() {
        HrefType result = HrefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LabelAttribute createLidoLabelAttribute() {
        LabelAttribute result = LabelAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LabelType createGmlLabelType() {
        LabelType result = LabelType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LocatorDocument createXLinkLocatorDocument() {
        LocatorDocument result = LocatorDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LocatorType createXLinkLocatorType() {
        LocatorType result = LocatorType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ResourceDocument createXLinkResourceDocument() {
        ResourceDocument result = ResourceDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ResourceType createXLinkResourceType() {
        ResourceType result = ResourceType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RoleAttribute createXLinkRoleAttribute() {
        RoleAttribute result = RoleAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RoleType createXLinkRoleType() {
        RoleType result = RoleType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ShowAttribute createXLinkShowAttribute() {
        ShowAttribute result = ShowAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ShowType createXLinkShowType() {
        ShowType result = ShowType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public Simple createXLinkSimple() {
        Simple result = Simple.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TitleAttribute createXLinkTitleAttribute() {
        TitleAttribute result = TitleAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TitleAttrType createXLinkTitleAttrType() {
        TitleAttrType result = TitleAttrType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TitleDocument createXLinkTitleDocument() {
        TitleDocument result = TitleDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TitleEltType createXLinkTitleEltType() {
        TitleEltType result = TitleEltType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ToAttribute createXLinkToAttribute() {
        ToAttribute result = ToAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ToType createXLinkToType() {
        ToType result = ToType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TypeAttribute createLidoTypeAttribute() {
        TypeAttribute result = TypeAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TypeType createXLinkTypeType() {
        TypeType result = TypeType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ActorComplexType createLidoActorComplexType() {
        ActorComplexType result = ActorComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ActorInRoleComplexType createLidoActorInRoleComplexType() {
        ActorInRoleComplexType result = ActorInRoleComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ActorInRoleSetComplexType createLidoActorInRoleSetComplexType() {
        ActorInRoleSetComplexType result = ActorInRoleSetComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ActorSetComplexType createLidoActorSetComplexType() {
        ActorSetComplexType result = ActorSetComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AddedSearchTermAttribute createLidoAddedSearchTermAttribute() {
        AddedSearchTermAttribute result = AddedSearchTermAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AdministrativeMetadataComplexType createLidoAdministrativeMetadataComplexType() {
        AdministrativeMetadataComplexType result = AdministrativeMetadataComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AdministrativeMetadataDocument createLidoAdministrativeMetadataDocument() {
        AdministrativeMetadataDocument result = AdministrativeMetadataDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AppellationComplexType createLidoAppellationComplexType() {
        AppellationComplexType result = AppellationComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ClassificationWrapDocument createLidoClassificationWrapDocument() {
        ClassificationWrapDocument result = ClassificationWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ConceptComplexType createLidoConceptComplexType() {
        ConceptComplexType result = ConceptComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DateComplexType createLidoDateComplexType() {
        DateComplexType result = DateComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DateSetComplexType createLidoDateSetComplexType() {
        DateSetComplexType result = DateSetComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DescriptiveMetadataComplexType createLidoDescriptiveMetadataComplexType() {
        DescriptiveMetadataComplexType result = DescriptiveMetadataComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DescriptiveMetadataDocument createLidoDescriptiveMetadataDocument() {
        DescriptiveMetadataDocument result = DescriptiveMetadataDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DescriptiveNoteComplexType createLidoDescriptiveNoteComplexType() {
        DescriptiveNoteComplexType result = DescriptiveNoteComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DisplayStateEditionWrapDocument createLidoDisplayStateEditionWrapDocument() {
        DisplayStateEditionWrapDocument result = DisplayStateEditionWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EncodinganalogAttribute createLidoEncodinganalogAttribute() {
        EncodinganalogAttribute result = EncodinganalogAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EventComplexType createLidoEventComplexType() {
        EventComplexType result = EventComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EventSetComplexType createLidoEventSetComplexType() {
        EventSetComplexType result = EventSetComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EventWrapDocument createLidoEventWrapDocument() {
        EventWrapDocument result = EventWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeographicalEntityAttribute createLidoGeographicalEntityAttribute() {
        GeographicalEntityAttribute result = GeographicalEntityAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GmlComplexType createLidoGmlComplexType() {
        GmlComplexType result = GmlComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IdentifierComplexType createLidoIdentifierComplexType() {
        IdentifierComplexType result = IdentifierComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public InscriptionsWrapDocument createLidoInscriptionsWrapDocument() {
        InscriptionsWrapDocument result = InscriptionsWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LegalBodyRefComplexType createLidoLegalBodyRefComplexType() {
        LegalBodyRefComplexType result = LegalBodyRefComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LidoComplexType createLidoComplexType() {
        LidoComplexType result = LidoComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LidoDocument createLidoDocument() {
        LidoDocument result = LidoDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LidoWrapDocument createLidoWrapDocument() {
        LidoWrapDocument result = LidoWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MaterialsTechComplexType createLidoMaterialsTechComplexType() {
        MaterialsTechComplexType result = MaterialsTechComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MaterialsTechSetComplexType createLidoMaterialsTechSetComplexType() {
        MaterialsTechSetComplexType result = MaterialsTechSetComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MeasurementsSetComplexType createLidoMeasurementsSetComplexType() {
        MeasurementsSetComplexType result = MeasurementsSetComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObjectClassificationWrapDocument createLidoObjectClassificationWrapDocument() {
        ObjectClassificationWrapDocument result = ObjectClassificationWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObjectComplexType createLidoObjectComplexType() {
        ObjectComplexType result = ObjectComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObjectDescriptionWrapDocument createLidoObjectDescriptionWrapDocument() {
        ObjectDescriptionWrapDocument result = ObjectDescriptionWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObjectIdentificationWrapDocument createLidoObjectIdentificationWrapDocument() {
        ObjectIdentificationWrapDocument result = ObjectIdentificationWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObjectMeasurementsComplexType createLidoObjectMeasurementsComplexType() {
        ObjectMeasurementsComplexType result = ObjectMeasurementsComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObjectMeasurementsSetComplexType createLidoObjectMeasurementsSetComplexType() {
        ObjectMeasurementsSetComplexType result = ObjectMeasurementsSetComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObjectMeasurementsWrapDocument createLidoObjectMeasurementsWrapDocument() {
        ObjectMeasurementsWrapDocument result = ObjectMeasurementsWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObjectRelationWrapDocument createLidoObjectRelationWrapDocument() {
        ObjectRelationWrapDocument result = ObjectRelationWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObjectSetComplexType createLidoObjectSetComplexType() {
        ObjectSetComplexType result = ObjectSetComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObjectWorkTypeWrapDocument createLidoObjectWorkTypeWrapDocument() {
        ObjectWorkTypeWrapDocument result = ObjectWorkTypeWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PlaceComplexType createLidoPlaceComplexType() {
        PlaceComplexType result = PlaceComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PlaceSetComplexType createLidoPlaceSetComplexType() {
        PlaceSetComplexType result = PlaceSetComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PoliticalEntityAttribute createLidoPoliticalEntityAttribute() {
        PoliticalEntityAttribute result = PoliticalEntityAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PrefAttribute createLidoPrefAttribute() {
        PrefAttribute result = PrefAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RecordInfoSetComplexType createLidoRecordInfoSetComplexType() {
        RecordInfoSetComplexType result = RecordInfoSetComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RecordWrapDocument createLidoRecordWrapDocument() {
        RecordWrapDocument result = RecordWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RelatedencodingAttribute createLidoRelatedencodingAttribute() {
        RelatedencodingAttribute result = RelatedencodingAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RelatedEventSetComplexType createLidoRelatedEventSetComplexType() {
        RelatedEventSetComplexType result = RelatedEventSetComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RelatedWorkSetComplexType createLidoRelatedWorkSetComplexType() {
        RelatedWorkSetComplexType result = RelatedWorkSetComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RelatedWorksWrapDocument createLidoRelatedWorksWrapDocument() {
        RelatedWorksWrapDocument result = RelatedWorksWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RepositoryWrapDocument createLidoRepositoryWrapDocument() {
        RepositoryWrapDocument result = RepositoryWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ResourceSetComplexType createLidoResourceSetComplexType() {
        ResourceSetComplexType result = ResourceSetComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ResourceWrapDocument createLidoResourceWrapDocument() {
        ResourceWrapDocument result = ResourceWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RightsComplexType createLidoRightsComplexType() {
        RightsComplexType result = RightsComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RightsWorkWrapDocument createLidoRightsWorkWrapDocument() {
        RightsWorkWrapDocument result = RightsWorkWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SortorderAttribute createLidoSortorderAttribute() {
        SortorderAttribute result = SortorderAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SourceAttribute createLidoSourceAttribute() {
        SourceAttribute result = SourceAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SubjectComplexType createLidoSubjectComplexType() {
        SubjectComplexType result = SubjectComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SubjectSetComplexType createLidoSubjectSetComplexType() {
        SubjectSetComplexType result = SubjectSetComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SubjectWrapDocument createLidoSubjectWrapDocument() {
        SubjectWrapDocument result = SubjectWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TermComplexType createLidoTermComplexType() {
        TermComplexType result = TermComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TextComplexType createLidoTextComplexType() {
        TextComplexType result = TextComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TitleWrapDocument createLidoTitleWrapDocument() {
        TitleWrapDocument result = TitleWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public WebResourceComplexType createLidoWebResourceComplexType() {
        WebResourceComplexType result = WebResourceComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AbsoluteExternalPositionalAccuracyDocument createGmlAbsoluteExternalPositionalAccuracyDocument() {
        AbsoluteExternalPositionalAccuracyDocument result
                = AbsoluteExternalPositionalAccuracyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AbsoluteExternalPositionalAccuracyType createGmlAbsoluteExternalPositionalAccuracyType() {
        AbsoluteExternalPositionalAccuracyType result = AbsoluteExternalPositionalAccuracyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AbstractGeneralOperationParameterRefDocument createGmlAbstractGeneralOperationParameterRefDocument() {
        AbstractGeneralOperationParameterRefDocument result
                = AbstractGeneralOperationParameterRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AbstractGeneralOperationParameterRefType createGmlAbstractGeneralOperationParameterRefType() {
        AbstractGeneralOperationParameterRefType result
                = AbstractGeneralOperationParameterRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AbstractGriddedSurfaceType createGmlAbstractGriddedSurfaceType() {
        AbstractGriddedSurfaceType result = AbstractGriddedSurfaceType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AbstractParametricCurveSurfaceType createGmlAbstractParametricCurveSurfaceType() {
        AbstractParametricCurveSurfaceType result = AbstractParametricCurveSurfaceType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AbstractRingPropertyType createGmlAbstractRingPropertyType() {
        AbstractRingPropertyType result = AbstractRingPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AbstractSolidType createGmlAbstractSolidType() {
        AbstractSolidType result = AbstractSolidType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AbstractSurfaceType createGmlAbstractSurfaceType() {
        AbstractSurfaceType result = AbstractSurfaceType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AesheticCriteriaType createGmlAesheticCriteriaType() {
        AesheticCriteriaType result = AesheticCriteriaType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AffinePlacementDocument createGmlAffinePlacementDocument() {
        AffinePlacementDocument result = AffinePlacementDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AffinePlacementType createGmlAffinePlacementType() {
        AffinePlacementType result = AffinePlacementType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AnchorPointDocument createGmlAnchorPointDocument() {
        AnchorPointDocument result = AnchorPointDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AngleChoiceType createGmlAngleChoiceType() {
        AngleChoiceType result = AngleChoiceType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AngleDocument createGmlAngleDocument() {
        AngleDocument result = AngleDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AngleType createGmlAngleType() {
        AngleType result = AngleType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ArcByBulgeDocument createGmlArcByBulgeDocument() {
        ArcByBulgeDocument result = ArcByBulgeDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ArcByBulgeType createGmlArcByBulgeType() {
        ArcByBulgeType result = ArcByBulgeType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ArcByCenterPointDocument createGmlArcByCenterPointDocument() {
        ArcByCenterPointDocument result = ArcByCenterPointDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ArcByCenterPointType createGmlArcByCenterPointType() {
        ArcByCenterPointType result = ArcByCenterPointType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ArcMinutesType createGmlArcMinutesType() {
        ArcMinutesType result = ArcMinutesType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ArcSecondsType createGmlArcSecondsType() {
        ArcSecondsType result = ArcSecondsType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ArcStringByBulgeDocument createGmlArcStringByBulgeDocument() {
        ArcStringByBulgeDocument result = ArcStringByBulgeDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ArcStringByBulgeType createGmlArcStringByBulgeType() {
        ArcStringByBulgeType result = ArcStringByBulgeType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ArcStringDocument createGmlArcStringDocument() {
        ArcStringDocument result = ArcStringDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ArcStringType createGmlArcStringType() {
        ArcStringType result = ArcStringType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AreaType createGmlAreaType() {
        AreaType result = AreaType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ArrayAssociationType createGmlArrayAssociationType() {
        ArrayAssociationType result = ArrayAssociationType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ArrayDocument createGmlArrayDocument() {
        ArrayDocument result = ArrayDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ArrayType createGmlArrayType() {
        ArrayType result = ArrayType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AssociationDocument createGmlAssociationDocument() {
        AssociationDocument result = AssociationDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AssociationType createGmlAssociationType() {
        AssociationType result = AssociationType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AxisAbbrevDocument createGmlAxisAbbrevDocument() {
        AxisAbbrevDocument result = AxisAbbrevDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AxisDirectionDocument createGmlAxisDirectionDocument() {
        AxisDirectionDocument result = AxisDirectionDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AxisIDDocument createGmlAxisIDDocument() {
        AxisIDDocument result = AxisIDDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public BagDocument createGmlBagDocument() {
        BagDocument result = BagDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public BagType createGmlBagType() {
        BagType result = BagType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public BaseCRSDocument createGmlBaseCRSDocument() {
        BaseCRSDocument result = BaseCRSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public BaseCurveDocument createGmlBaseCurveDocument() {
        BaseCurveDocument result = BaseCurveDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public BaseStyleDescriptorType createGmlBaseStyleDescriptorType() {
        BaseStyleDescriptorType result = BaseStyleDescriptorType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public BaseSurfaceDocument createGmlBaseSurfaceDocument() {
        BaseSurfaceDocument result = BaseSurfaceDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public BaseUnitDocument createGmlBaseUnitDocument() {
        BaseUnitDocument result = BaseUnitDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public BaseUnitType createGmlBaseUnitType() {
        BaseUnitType result = BaseUnitType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public BezierDocument createGmlBezierDocument() {
        BezierDocument result = BezierDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public BezierType createGmlBezierType() {
        BezierType result = BezierType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public BooleanDocument createGmlBooleanDocument() {
        BooleanDocument result = BooleanDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public BooleanList createGmlBooleanList() {
        BooleanList result = BooleanList.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public BooleanListDocument createGmlBooleanListDocument() {
        BooleanListDocument result = BooleanListDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public BooleanOrNull createGmlBooleanOrNull() {
        BooleanOrNull result = BooleanOrNull.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public BooleanOrNullList createGmlBooleanOrNullList() {
        BooleanOrNullList result = BooleanOrNullList.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public BooleanPropertyType createGmlBooleanPropertyType() {
        BooleanPropertyType result = BooleanPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public BooleanValueDocument createGmlBooleanValueDocument() {
        BooleanValueDocument result = BooleanValueDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public BoundedByDocument createGmlBoundedByDocument() {
        BoundedByDocument result = BoundedByDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public BoundingBoxDocument createGmlBoundingBoxDocument() {
        BoundingBoxDocument result = BoundingBoxDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public BoundingPolygonDocument createGmlBoundingPolygonDocument() {
        BoundingPolygonDocument result = BoundingPolygonDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public BoundingShapeType createGmlBoundingShapeType() {
        BoundingShapeType result = BoundingShapeType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public BSplineDocument createGmlBSplineDocument() {
        BSplineDocument result = BSplineDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public BSplineType createGmlBSplineType() {
        BSplineType result = BSplineType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CalDate createGmlCalDate() {
        CalDate result = CalDate.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CartesianCSDocument createGmlCartesianCSDocument() {
        CartesianCSDocument result = CartesianCSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CartesianCSRefDocument createGmlCartesianCSRefDocument() {
        CartesianCSRefDocument result = CartesianCSRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CartesianCSRefType createGmlCartesianCSRefType() {
        CartesianCSRefType result = CartesianCSRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CartesianCSType createGmlCartesianCSType() {
        CartesianCSType result = CartesianCSType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CatalogSymbolDocument createGmlCatalogSymbolDocument() {
        CatalogSymbolDocument result = CatalogSymbolDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CategoryDocument createGmlCategoryDocument() {
        CategoryDocument result = CategoryDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CategoryExtentDocument createGmlCategoryExtentDocument() {
        CategoryExtentDocument result = CategoryExtentDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CategoryExtentType createGmlCategoryExtentType() {
        CategoryExtentType result = CategoryExtentType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CategoryListDocument createGmlCategoryListDocument() {
        CategoryListDocument result = CategoryListDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CategoryPropertyType createGmlCategoryPropertyType() {
        CategoryPropertyType result = CategoryPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CenterLineOfDocument createGmlCenterLineOfDocument() {
        CenterLineOfDocument result = CenterLineOfDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CenterOfDocument createGmlCenterOfDocument() {
        CenterOfDocument result = CenterOfDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CircleByCenterPointDocument createGmlCircleByCenterPointDocument() {
        CircleByCenterPointDocument result = CircleByCenterPointDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CircleByCenterPointType createGmlCircleByCenterPointType() {
        CircleByCenterPointType result = CircleByCenterPointType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CircleDocument createGmlCircleDocument() {
        CircleDocument result = CircleDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CircleType createGmlCircleType() {
        CircleType result = CircleType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ClothoidDocument createGmlClothoidDocument() {
        ClothoidDocument result = ClothoidDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ClothoidType createGmlClothoidType() {
        ClothoidType result = ClothoidType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CodeListType createGmlCodeListType() {
        CodeListType result = CodeListType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CodeOrNullListType createGmlCodeOrNullListType() {
        CodeOrNullListType result = CodeOrNullListType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CodeType createGmlCodeType() {
        CodeType result = CodeType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ColumnIndexDocument createGmlColumnIndexDocument() {
        ColumnIndexDocument result = ColumnIndexDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CompassPointDocument createGmlCompassPointDocument() {
        CompassPointDocument result = CompassPointDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CompassPointEnumeration createGmlCompassPointEnumeration() {
        CompassPointEnumeration result = CompassPointEnumeration.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CompositeCurveDocument createGmlCompositeCurveDocument() {
        CompositeCurveDocument result = CompositeCurveDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CompositeCurvePropertyType createGmlCompositeCurvePropertyType() {
        CompositeCurvePropertyType result = CompositeCurvePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CompositeCurveType createGmlCompositeCurveType() {
        CompositeCurveType result = CompositeCurveType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CompositeSolidDocument createGmlCompositeSolidDocument() {
        CompositeSolidDocument result = CompositeSolidDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CompositeSolidPropertyType createGmlCompositeSolidPropertyType() {
        CompositeSolidPropertyType result = CompositeSolidPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CompositeSolidType createGmlCompositeSolidType() {
        CompositeSolidType result = CompositeSolidType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CompositeSurfaceDocument createGmlCompositeSurfaceDocument() {
        CompositeSurfaceDocument result = CompositeSurfaceDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CompositeSurfacePropertyType createGmlCompositeSurfacePropertyType() {
        CompositeSurfacePropertyType result = CompositeSurfacePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CompositeSurfaceType createGmlCompositeSurfaceType() {
        CompositeSurfaceType result = CompositeSurfaceType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CompositeValueDocument createGmlCompositeValueDocument() {
        CompositeValueDocument result = CompositeValueDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CompositeValueType createGmlCompositeValueType() {
        CompositeValueType result = CompositeValueType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CompoundCRSDocument createGmlCompoundCRSDocument() {
        CompoundCRSDocument result = CompoundCRSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CompoundCRSRefDocument createGmlCompoundCRSRefDocument() {
        CompoundCRSRefDocument result = CompoundCRSRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CompoundCRSRefType createGmlCompoundCRSRefType() {
        CompoundCRSRefType result = CompoundCRSRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CompoundCRSType createGmlCompoundCRSType() {
        CompoundCRSType result = CompoundCRSType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ConcatenatedOperationDocument createGmlConcatenatedOperationDocument() {
        ConcatenatedOperationDocument result = ConcatenatedOperationDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ConcatenatedOperationRefDocument createGmlConcatenatedOperationRefDocument() {
        ConcatenatedOperationRefDocument result = ConcatenatedOperationRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ConcatenatedOperationRefType createGmlConcatenatedOperationRefType() {
        ConcatenatedOperationRefType result = ConcatenatedOperationRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ConcatenatedOperationType createGmlConcatenatedOperationType() {
        ConcatenatedOperationType result = ConcatenatedOperationType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ConeDocument createGmlConeDocument() {
        ConeDocument result = ConeDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ConeType createGmlConeType() {
        ConeType result = ConeType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ContainerDocument createGmlContainerDocument() {
        ContainerDocument result = ContainerDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ContainerPropertyType createGmlContainerPropertyType() {
        ContainerPropertyType result = ContainerPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ContinuousCoverageDocument createGmlContinuousCoverageDocument() {
        ContinuousCoverageDocument result = ContinuousCoverageDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ConventionalUnitDocument createGmlConventionalUnitDocument() {
        ConventionalUnitDocument result = ConventionalUnitDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ConventionalUnitType createGmlConventionalUnitType() {
        ConventionalUnitType result = ConventionalUnitType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ConversionDocument createGmlConversionDocument() {
        ConversionDocument result = ConversionDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ConversionRefDocument createGmlConversionRefDocument() {
        ConversionRefDocument result = ConversionRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ConversionRefType createGmlConversionRefType() {
        ConversionRefType result = ConversionRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ConversionToPreferredUnitDocument createGmlConversionToPreferredUnitDocument() {
        ConversionToPreferredUnitDocument result = ConversionToPreferredUnitDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ConversionToPreferredUnitType createGmlConversionToPreferredUnitType() {
        ConversionToPreferredUnitType result = ConversionToPreferredUnitType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ConversionType createGmlConversionType() {
        ConversionType result = ConversionType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CoordDocument createGmlCoordDocument() {
        CoordDocument result = CoordDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CoordinateOperationDocument createGmlCoordinateOperationDocument() {
        CoordinateOperationDocument result = CoordinateOperationDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CoordinateOperationIDDocument createGmlCoordinateOperationIDDocument() {
        CoordinateOperationIDDocument result = CoordinateOperationIDDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CoordinateOperationNameDocument createGmlCoordinateOperationNameDocument() {
        CoordinateOperationNameDocument result = CoordinateOperationNameDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CoordinateOperationRefDocument createGmlCoordinateOperationRefDocument() {
        CoordinateOperationRefDocument result = CoordinateOperationRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CoordinateOperationRefType createGmlCoordinateOperationRefType() {
        CoordinateOperationRefType result = CoordinateOperationRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CoordinateReferenceSystemDocument createGmlCoordinateReferenceSystemDocument() {
        CoordinateReferenceSystemDocument result = CoordinateReferenceSystemDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CoordinateReferenceSystemRefDocument createGmlCoordinateReferenceSystemRefDocument() {
        CoordinateReferenceSystemRefDocument result = CoordinateReferenceSystemRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CoordinateReferenceSystemRefType createGmlCoordinateReferenceSystemRefType() {
        CoordinateReferenceSystemRefType result = CoordinateReferenceSystemRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CoordinatesDocument createGmlCoordinatesDocument() {
        CoordinatesDocument result = CoordinatesDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CoordinatesType createGmlCoordinatesType() {
        CoordinatesType result = CoordinatesType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CoordinateSystemAxisDocument createGmlCoordinateSystemAxisDocument() {
        CoordinateSystemAxisDocument result = CoordinateSystemAxisDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CoordinateSystemAxisRefDocument createGmlCoordinateSystemAxisRefDocument() {
        CoordinateSystemAxisRefDocument result = CoordinateSystemAxisRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CoordinateSystemAxisRefType createGmlCoordinateSystemAxisRefType() {
        CoordinateSystemAxisRefType result = CoordinateSystemAxisRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CoordinateSystemAxisType createGmlCoordinateSystemAxisType() {
        CoordinateSystemAxisType result = CoordinateSystemAxisType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CoordinateSystemDocument createGmlCoordinateSystemDocument() {
        CoordinateSystemDocument result = CoordinateSystemDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CoordinateSystemRefDocument createGmlCoordinateSystemRefDocument() {
        CoordinateSystemRefDocument result = CoordinateSystemRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CoordinateSystemRefType createGmlCoordinateSystemRefType() {
        CoordinateSystemRefType result = CoordinateSystemRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CoordType createGmlCoordType() {
        CoordType result = CoordType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CountDocument createGmlCountDocument() {
        CountDocument result = CountDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CountExtentDocument createGmlCountExtentDocument() {
        CountExtentDocument result = CountExtentDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CountExtentType createGmlCountExtentType() {
        CountExtentType result = CountExtentType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CountListDocument createGmlCountListDocument() {
        CountListDocument result = CountListDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CountPropertyType createGmlCountPropertyType() {
        CountPropertyType result = CountPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CovarianceDocument createGmlCovarianceDocument() {
        CovarianceDocument result = CovarianceDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CovarianceElementType createGmlCovarianceElementType() {
        CovarianceElementType result = CovarianceElementType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CovarianceMatrixDocument createGmlCovarianceMatrixDocument() {
        CovarianceMatrixDocument result = CovarianceMatrixDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CovarianceMatrixType createGmlCovarianceMatrixType() {
        CovarianceMatrixType result = CovarianceMatrixType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CoverageDocument createGmlCoverageDocument() {
        CoverageDocument result = CoverageDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CoverageFunctionDocument createGmlCoverageFunctionDocument() {
        CoverageFunctionDocument result = CoverageFunctionDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CoverageFunctionType createGmlCoverageFunctionType() {
        CoverageFunctionType result = CoverageFunctionType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CRSDocument createGmlCRSDocument() {
        CRSDocument result = CRSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CrsRefDocument createGmlCrsRefDocument() {
        CrsRefDocument result = CrsRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CRSRefType createGmlCRSRefType() {
        CRSRefType result = CRSRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CsIDDocument createGmlCsIDDocument() {
        CsIDDocument result = CsIDDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CsNameDocument createGmlCsNameDocument() {
        CsNameDocument result = CsNameDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CubicSplineDocument createGmlCubicSplineDocument() {
        CubicSplineDocument result = CubicSplineDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CubicSplineType createGmlCubicSplineType() {
        CubicSplineType result = CubicSplineType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CurveArrayPropertyDocument createGmlCurveArrayPropertyDocument() {
        CurveArrayPropertyDocument result = CurveArrayPropertyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CurveArrayPropertyType createGmlCurveArrayPropertyType() {
        CurveArrayPropertyType result = CurveArrayPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CurveDocument createGmlCurveDocument() {
        CurveDocument result = CurveDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CurveInterpolationType createGmlCurveInterpolationType() {
        CurveInterpolationType result = CurveInterpolationType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CurveMemberDocument createGmlCurveMemberDocument() {
        CurveMemberDocument result = CurveMemberDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CurvePropertyDocument createGmlCurvePropertyDocument() {
        CurvePropertyDocument result = CurvePropertyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CurvePropertyType createGmlCurvePropertyType() {
        CurvePropertyType result = CurvePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CurveSegmentArrayPropertyType createGmlCurveSegmentArrayPropertyType() {
        CurveSegmentArrayPropertyType result = CurveSegmentArrayPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CurveSegmentDocument createGmlCurveSegmentDocument() {
        CurveSegmentDocument result = CurveSegmentDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CurveType createGmlCurveType() {
        CurveType result = CurveType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CylinderDocument createGmlCylinderDocument() {
        CylinderDocument result = CylinderDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CylinderType createGmlCylinderType() {
        CylinderType result = CylinderType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CylindricalCSDocument createGmlCylindricalCSDocument() {
        CylindricalCSDocument result = CylindricalCSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CylindricalCSRefDocument createGmlCylindricalCSRefDocument() {
        CylindricalCSRefDocument result = CylindricalCSRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CylindricalCSRefType createGmlCylindricalCSRefType() {
        CylindricalCSRefType result = CylindricalCSRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CylindricalCSType createGmlCylindricalCSType() {
        CylindricalCSType result = CylindricalCSType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DataBlockDocument createGmlDataBlockDocument() {
        DataBlockDocument result = DataBlockDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DataBlockType createGmlDataBlockType() {
        DataBlockType result = DataBlockType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DataSourceDocument createGmlDataSourceDocument() {
        DataSourceDocument result = DataSourceDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DatumDocument createGmlDatumDocument() {
        DatumDocument result = DatumDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DatumIDDocument createGmlDatumIDDocument() {
        DatumIDDocument result = DatumIDDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DatumNameDocument createGmlDatumNameDocument() {
        DatumNameDocument result = DatumNameDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DatumRefDocument createGmlDatumRefDocument() {
        DatumRefDocument result = DatumRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DatumRefType createGmlDatumRefType() {
        DatumRefType result = DatumRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DecimalMinutesDocument createGmlDecimalMinutesDocument() {
        DecimalMinutesDocument result = DecimalMinutesDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DecimalMinutesType createGmlDecimalMinutesType() {
        DecimalMinutesType result = DecimalMinutesType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DefaultStyleDocument createGmlDefaultStyleDocument() {
        DefaultStyleDocument result = DefaultStyleDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DefaultStylePropertyType createGmlDefaultStylePropertyType() {
        DefaultStylePropertyType result = DefaultStylePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DefinedByConversionDocument createGmlDefinedByConversionDocument() {
        DefinedByConversionDocument result = DefinedByConversionDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DefinitionCollectionDocument createGmlDefinitionCollectionDocument() {
        DefinitionCollectionDocument result = DefinitionCollectionDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DefinitionDocument createGmlDefinitionDocument() {
        DefinitionDocument result = DefinitionDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DefinitionMemberDocument createGmlDefinitionMemberDocument() {
        DefinitionMemberDocument result = DefinitionMemberDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DefinitionProxyDocument createGmlDefinitionProxyDocument() {
        DefinitionProxyDocument result = DefinitionProxyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DefinitionProxyType createGmlDefinitionProxyType() {
        DefinitionProxyType result = DefinitionProxyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DefinitionRefDocument createGmlDefinitionRefDocument() {
        DefinitionRefDocument result = DefinitionRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DefinitionType createGmlDefinitionType() {
        DefinitionType result = DefinitionType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DegreesDocument createGmlDegreesDocument() {
        DegreesDocument result = DegreesDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DegreesType createGmlDegreesType() {
        DegreesType result = DegreesType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DegreeValueType createGmlDegreeValueType() {
        DegreeValueType result = DegreeValueType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DerivationUnitTermDocument createGmlDerivationUnitTermDocument() {
        DerivationUnitTermDocument result = DerivationUnitTermDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DerivationUnitTermType createGmlDerivationUnitTermType() {
        DerivationUnitTermType result = DerivationUnitTermType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DerivedCRSDocument createGmlDerivedCRSDocument() {
        DerivedCRSDocument result = DerivedCRSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DerivedCRSRefDocument createGmlDerivedCRSRefDocument() {
        DerivedCRSRefDocument result = DerivedCRSRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DerivedCRSRefType createGmlDerivedCRSRefType() {
        DerivedCRSRefType result = DerivedCRSRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DerivedCRSType createGmlDerivedCRSType() {
        DerivedCRSType result = DerivedCRSType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DerivedCRSTypeDocument createGmlDerivedCRSTypeDocument() {
        DerivedCRSTypeDocument result = DerivedCRSTypeDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DerivedCRSTypeType createGmlDerivedCRSTypeType() {
        DerivedCRSTypeType result = DerivedCRSTypeType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DerivedUnitDocument createGmlDerivedUnitDocument() {
        DerivedUnitDocument result = DerivedUnitDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DerivedUnitType createGmlDerivedUnitType() {
        DerivedUnitType result = DerivedUnitType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DescriptionDocument createGmlDescriptionDocument() {
        DescriptionDocument result = DescriptionDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DictionaryDocument createGmlDictionaryDocument() {
        DictionaryDocument result = DictionaryDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DictionaryEntryDocument createGmlDictionaryEntryDocument() {
        DictionaryEntryDocument result = DictionaryEntryDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DictionaryEntryType createGmlDictionaryEntryType() {
        DictionaryEntryType result = DictionaryEntryType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DictionaryType createGmlDictionaryType() {
        DictionaryType result = DictionaryType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DirectedEdgeDocument createGmlDirectedEdgeDocument() {
        DirectedEdgeDocument result = DirectedEdgeDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DirectedEdgePropertyType createGmlDirectedEdgePropertyType() {
        DirectedEdgePropertyType result = DirectedEdgePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DirectedFaceDocument createGmlDirectedFaceDocument() {
        DirectedFaceDocument result = DirectedFaceDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DirectedFacePropertyType createGmlDirectedFacePropertyType() {
        DirectedFacePropertyType result = DirectedFacePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DirectedNodeDocument createGmlDirectedNodeDocument() {
        DirectedNodeDocument result = DirectedNodeDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DirectedNodePropertyType createGmlDirectedNodePropertyType() {
        DirectedNodePropertyType result = DirectedNodePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DirectedObservationAtDistanceDocument createGmlDirectedObservationAtDistanceDocument() {
        DirectedObservationAtDistanceDocument result = DirectedObservationAtDistanceDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DirectedObservationAtDistanceType createGmlDirectedObservationAtDistanceType() {
        DirectedObservationAtDistanceType result = DirectedObservationAtDistanceType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DirectedObservationDocument createGmlDirectedObservationDocument() {
        DirectedObservationDocument result = DirectedObservationDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DirectedObservationType createGmlDirectedObservationType() {
        DirectedObservationType result = DirectedObservationType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DirectedTopoSolidDocument createGmlDirectedTopoSolidDocument() {
        DirectedTopoSolidDocument result = DirectedTopoSolidDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DirectedTopoSolidPropertyType createGmlDirectedTopoSolidPropertyType() {
        DirectedTopoSolidPropertyType result = DirectedTopoSolidPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DirectionDocument createGmlDirectionDocument() {
        DirectionDocument result = DirectionDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DirectionPropertyType createGmlDirectionPropertyType() {
        DirectionPropertyType result = DirectionPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DirectionVectorDocument createGmlDirectionVectorDocument() {
        DirectionVectorDocument result = DirectionVectorDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DirectionVectorType createGmlDirectionVectorType() {
        DirectionVectorType result = DirectionVectorType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DirectPositionListType createGmlDirectPositionListType() {
        DirectPositionListType result = DirectPositionListType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DirectPositionType createGmlDirectPositionType() {
        DirectPositionType result = DirectPositionType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DiscreteCoverageDocument createGmlDiscreteCoverageDocument() {
        DiscreteCoverageDocument result = DiscreteCoverageDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DmsAngleDocument createGmlDmsAngleDocument() {
        DmsAngleDocument result = DmsAngleDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DMSAngleType createGmlDMSAngleType() {
        DMSAngleType result = DMSAngleType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DmsAngleValueDocument createGmlDmsAngleValueDocument() {
        DmsAngleValueDocument result = DmsAngleValueDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DomainSetDocument createGmlDomainSetDocument() {
        DomainSetDocument result = DomainSetDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DomainSetType createGmlDomainSetType() {
        DomainSetType result = DomainSetType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DoubleList createGmlDoubleList() {
        DoubleList result = DoubleList.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DoubleOrNull createGmlDoubleOrNull() {
        DoubleOrNull result = DoubleOrNull.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DoubleOrNullList createGmlDoubleOrNullList() {
        DoubleOrNullList result = DoubleOrNullList.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DoubleOrNullTupleListDocument createGmlDoubleOrNullTupleListDocument() {
        DoubleOrNullTupleListDocument result = DoubleOrNullTupleListDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DrawingTypeType createGmlDrawingTypeType() {
        DrawingTypeType result = DrawingTypeType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DurationDocument createGmlDurationDocument() {
        DurationDocument result = DurationDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DynamicFeatureCollectionType createGmlDynamicFeatureCollectionType() {
        DynamicFeatureCollectionType result = DynamicFeatureCollectionType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DynamicFeatureType createGmlDynamicFeatureType() {
        DynamicFeatureType result = DynamicFeatureType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EdgeDocument createGmlEdgeDocument() {
        EdgeDocument result = EdgeDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EdgeOfDocument createGmlEdgeOfDocument() {
        EdgeOfDocument result = EdgeOfDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EdgeType createGmlEdgeType() {
        EdgeType result = EdgeType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EllipsoidalCSDocument createGmlEllipsoidalCSDocument() {
        EllipsoidalCSDocument result = EllipsoidalCSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EllipsoidalCSRefDocument createGmlEllipsoidalCSRefDocument() {
        EllipsoidalCSRefDocument result = EllipsoidalCSRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EllipsoidalCSRefType createGmlEllipsoidalCSRefType() {
        EllipsoidalCSRefType result = EllipsoidalCSRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EllipsoidalCSType createGmlEllipsoidalCSType() {
        EllipsoidalCSType result = EllipsoidalCSType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EllipsoidDocument createGmlEllipsoidDocument() {
        EllipsoidDocument result = EllipsoidDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EllipsoidIDDocument createGmlEllipsoidIDDocument() {
        EllipsoidIDDocument result = EllipsoidIDDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EllipsoidNameDocument createGmlEllipsoidNameDocument() {
        EllipsoidNameDocument result = EllipsoidNameDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EllipsoidRefDocument createGmlEllipsoidRefDocument() {
        EllipsoidRefDocument result = EllipsoidRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EllipsoidRefType createGmlEllipsoidRefType() {
        EllipsoidRefType result = EllipsoidRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EllipsoidType createGmlEllipsoidType() {
        EllipsoidType result = EllipsoidType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EngineeringCRSDocument createGmlEngineeringCRSDocument() {
        EngineeringCRSDocument result = EngineeringCRSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EngineeringCRSRefDocument createGmlEngineeringCRSRefDocument() {
        EngineeringCRSRefDocument result = EngineeringCRSRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EngineeringCRSRefType createGmlEngineeringCRSRefType() {
        EngineeringCRSRefType result = EngineeringCRSRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EngineeringCRSType createGmlEngineeringCRSType() {
        EngineeringCRSType result = EngineeringCRSType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EngineeringDatumDocument createGmlEngineeringDatumDocument() {
        EngineeringDatumDocument result = EngineeringDatumDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EngineeringDatumRefDocument createGmlEngineeringDatumRefDocument() {
        EngineeringDatumRefDocument result = EngineeringDatumRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EngineeringDatumRefType createGmlEngineeringDatumRefType() {
        EngineeringDatumRefType result = EngineeringDatumRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EngineeringDatumType createGmlEngineeringDatumType() {
        EngineeringDatumType result = EngineeringDatumType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EnvelopeDocument createGmlEnvelopeDocument() {
        EnvelopeDocument result = EnvelopeDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EnvelopeType createGmlEnvelopeType() {
        EnvelopeType result = EnvelopeType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EnvelopeWithTimePeriodDocument createGmlEnvelopeWithTimePeriodDocument() {
        EnvelopeWithTimePeriodDocument result = EnvelopeWithTimePeriodDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EnvelopeWithTimePeriodType createGmlEnvelopeWithTimePeriodType() {
        EnvelopeWithTimePeriodType result = EnvelopeWithTimePeriodType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ExtentOfDocument createGmlExtentOfDocument() {
        ExtentOfDocument result = ExtentOfDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ExtentType createGmlExtentType() {
        ExtentType result = ExtentType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ExteriorDocument createGmlExteriorDocument() {
        ExteriorDocument result = ExteriorDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public FaceDocument createGmlFaceDocument() {
        FaceDocument result = FaceDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public FaceType createGmlFaceType() {
        FaceType result = FaceType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public FeatureArrayPropertyType createGmlFeatureArrayPropertyType() {
        FeatureArrayPropertyType result = FeatureArrayPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public FeatureCollectionDocument createGmlFeatureCollectionDocument() {
        FeatureCollectionDocument result = FeatureCollectionDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public FeatureCollectionType createGmlFeatureCollectionType() {
        FeatureCollectionType result = FeatureCollectionType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public FeatureDocument createGmlFeatureDocument() {
        FeatureDocument result = FeatureDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public FeatureMemberDocument createGmlFeatureMemberDocument() {
        FeatureMemberDocument result = FeatureMemberDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public FeatureMembersDocument createGmlFeatureMembersDocument() {
        FeatureMembersDocument result = FeatureMembersDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public FeaturePropertyDocument createGmlFeaturePropertyDocument() {
        FeaturePropertyDocument result = FeaturePropertyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public FeaturePropertyType createGmlFeaturePropertyType() {
        FeaturePropertyType result = FeaturePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public FeatureStyleDocument createGmlFeatureStyleDocument() {
        FeatureStyleDocument result = FeatureStyleDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public FeatureStylePropertyType createGmlFeatureStylePropertyType() {
        FeatureStylePropertyType result = FeatureStylePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public FeatureStyleType createGmlFeatureStyleType() {
        FeatureStyleType result = FeatureStyleType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public FileDocument createGmlFileDocument() {
        FileDocument result = FileDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public FileType createGmlFileType() {
        FileType result = FileType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public FileValueModelType createGmlFileValueModelType() {
        FileValueModelType result = FileValueModelType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public FormulaType createGmlFormulaType() {
        FormulaType result = FormulaType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeneralConversionDocument createGmlGeneralConversionDocument() {
        GeneralConversionDocument result = GeneralConversionDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeneralConversionRefDocument createGmlGeneralConversionRefDocument() {
        GeneralConversionRefDocument result = GeneralConversionRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeneralConversionRefType createGmlGeneralConversionRefType() {
        GeneralConversionRefType result = GeneralConversionRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeneralDerivedCRSDocument createGmlGeneralDerivedCRSDocument() {
        GeneralDerivedCRSDocument result = GeneralDerivedCRSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeneralOperationParameterDocument createGmlGeneralOperationParameterDocument() {
        GeneralOperationParameterDocument result = GeneralOperationParameterDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeneralParameterValueDocument createGmlGeneralParameterValueDocument() {
        GeneralParameterValueDocument result = GeneralParameterValueDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeneralTransformationDocument createGmlGeneralTransformationDocument() {
        GeneralTransformationDocument result = GeneralTransformationDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeneralTransformationRefDocument createGmlGeneralTransformationRefDocument() {
        GeneralTransformationRefDocument result = GeneralTransformationRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeneralTransformationRefType createGmlGeneralTransformationRefType() {
        GeneralTransformationRefType result = GeneralTransformationRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GenericMetaDataDocument createGmlGenericMetaDataDocument() {
        GenericMetaDataDocument result = GenericMetaDataDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GenericMetaDataType createGmlGenericMetaDataType() {
        GenericMetaDataType result = GenericMetaDataType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeocentricCRSDocument createGmlGeocentricCRSDocument() {
        GeocentricCRSDocument result = GeocentricCRSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeocentricCRSRefDocument createGmlGeocentricCRSRefDocument() {
        GeocentricCRSRefDocument result = GeocentricCRSRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeocentricCRSRefType createGmlGeocentricCRSRefType() {
        GeocentricCRSRefType result = GeocentricCRSRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeocentricCRSType createGmlGeocentricCRSType() {
        GeocentricCRSType result = GeocentricCRSType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeodesicDocument createGmlGeodesicDocument() {
        GeodesicDocument result = GeodesicDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeodesicStringDocument createGmlGeodesicStringDocument() {
        GeodesicStringDocument result = GeodesicStringDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeodesicStringType createGmlGeodesicStringType() {
        GeodesicStringType result = GeodesicStringType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeodesicType createGmlGeodesicType() {
        GeodesicType result = GeodesicType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeodeticDatumDocument createGmlGeodeticDatumDocument() {
        GeodeticDatumDocument result = GeodeticDatumDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeodeticDatumRefDocument createGmlGeodeticDatumRefDocument() {
        GeodeticDatumRefDocument result = GeodeticDatumRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeodeticDatumRefType createGmlGeodeticDatumRefType() {
        GeodeticDatumRefType result = GeodeticDatumRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeodeticDatumType createGmlGeodeticDatumType() {
        GeodeticDatumType result = GeodeticDatumType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeographicCRSDocument createGmlGeographicCRSDocument() {
        GeographicCRSDocument result = GeographicCRSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeographicCRSRefDocument createGmlGeographicCRSRefDocument() {
        GeographicCRSRefDocument result = GeographicCRSRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeographicCRSRefType createGmlGeographicCRSRefType() {
        GeographicCRSRefType result = GeographicCRSRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeographicCRSType createGmlGeographicCRSType() {
        GeographicCRSType result = GeographicCRSType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeometricAggregateDocument createGmlGeometricAggregateDocument() {
        GeometricAggregateDocument result = GeometricAggregateDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeometricComplexDocument createGmlGeometricComplexDocument() {
        GeometricComplexDocument result = GeometricComplexDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeometricComplexPropertyType createGmlGeometricComplexPropertyType() {
        GeometricComplexPropertyType result = GeometricComplexPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeometricComplexType createGmlGeometricComplexType() {
        GeometricComplexType result = GeometricComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeometricPrimitiveDocument createGmlGeometricPrimitiveDocument() {
        GeometricPrimitiveDocument result = GeometricPrimitiveDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeometricPrimitivePropertyType createGmlGeometricPrimitivePropertyType() {
        GeometricPrimitivePropertyType result = GeometricPrimitivePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeometryArrayPropertyType createGmlGeometryArrayPropertyType() {
        GeometryArrayPropertyType result = GeometryArrayPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeometryDocument createGmlGeometryDocument() {
        GeometryDocument result = GeometryDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeometryMemberDocument createGmlGeometryMemberDocument() {
        GeometryMemberDocument result = GeometryMemberDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeometryMembersDocument createGmlGeometryMembersDocument() {
        GeometryMembersDocument result = GeometryMembersDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeometryPropertyType createGmlGeometryPropertyType() {
        GeometryPropertyType result = GeometryPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeometryStyleDocument createGmlGeometryStyleDocument() {
        GeometryStyleDocument result = GeometryStyleDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeometryStylePropertyType createGmlGeometryStylePropertyType() {
        GeometryStylePropertyType result = GeometryStylePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GeometryStyleType createGmlGeometryStyleType() {
        GeometryStyleType result = GeometryStyleType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GMLDocument createGmlGMLDocument() {
        GMLDocument result = GMLDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GraphStyleDocument createGmlGraphStyleDocument() {
        GraphStyleDocument result = GraphStyleDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GraphStylePropertyType createGmlGraphStylePropertyType() {
        GraphStylePropertyType result = GraphStylePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GraphStyleType createGmlGraphStyleType() {
        GraphStyleType result = GraphStyleType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GraphTypeType createGmlGraphTypeType() {
        GraphTypeType result = GraphTypeType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GreenwichLongitudeDocument createGmlGreenwichLongitudeDocument() {
        GreenwichLongitudeDocument result = GreenwichLongitudeDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GridCoverageDocument createGmlGridCoverageDocument() {
        GridCoverageDocument result = GridCoverageDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GridCoverageType createGmlGridCoverageType() {
        GridCoverageType result = GridCoverageType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GriddedSurfaceDocument createGmlGriddedSurfaceDocument() {
        GriddedSurfaceDocument result = GriddedSurfaceDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GridDocument createGmlGridDocument() {
        GridDocument result = GridDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GridDomainDocument createGmlGridDomainDocument() {
        GridDomainDocument result = GridDomainDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GridDomainType createGmlGridDomainType() {
        GridDomainType result = GridDomainType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GridEnvelopeType createGmlGridEnvelopeType() {
        GridEnvelopeType result = GridEnvelopeType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GridFunctionDocument createGmlGridFunctionDocument() {
        GridFunctionDocument result = GridFunctionDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GridFunctionType createGmlGridFunctionType() {
        GridFunctionType result = GridFunctionType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GridLengthType createGmlGridLengthType() {
        GridLengthType result = GridLengthType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GridLimitsType createGmlGridLimitsType() {
        GridLimitsType result = GridLimitsType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GridType createGmlGridType() {
        GridType result = GridType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GroupIDDocument createGmlGroupIDDocument() {
        GroupIDDocument result = GroupIDDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GroupNameDocument createGmlGroupNameDocument() {
        GroupNameDocument result = GroupNameDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public HistoryDocument createGmlHistoryDocument() {
        HistoryDocument result = HistoryDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public HistoryPropertyType createGmlHistoryPropertyType() {
        HistoryPropertyType result = HistoryPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IdAttribute createGmlIdAttribute() {
        IdAttribute result = IdAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IdentifierType createGmlIdentifierType() {
        IdentifierType result = IdentifierType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ImageCRSDocument createGmlImageCRSDocument() {
        ImageCRSDocument result = ImageCRSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ImageCRSRefDocument createGmlImageCRSRefDocument() {
        ImageCRSRefDocument result = ImageCRSRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ImageCRSRefType createGmlImageCRSRefType() {
        ImageCRSRefType result = ImageCRSRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ImageCRSType createGmlImageCRSType() {
        ImageCRSType result = ImageCRSType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ImageDatumDocument createGmlImageDatumDocument() {
        ImageDatumDocument result = ImageDatumDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ImageDatumRefDocument createGmlImageDatumRefDocument() {
        ImageDatumRefDocument result = ImageDatumRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ImageDatumRefType createGmlImageDatumRefType() {
        ImageDatumRefType result = ImageDatumRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ImageDatumType createGmlImageDatumType() {
        ImageDatumType result = ImageDatumType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ImplicitGeometryDocument createGmlImplicitGeometryDocument() {
        ImplicitGeometryDocument result = ImplicitGeometryDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IncludesCRSDocument createGmlIncludesCRSDocument() {
        IncludesCRSDocument result = IncludesCRSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IncludesElementDocument createGmlIncludesElementDocument() {
        IncludesElementDocument result = IncludesElementDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IncludesParameterDocument createGmlIncludesParameterDocument() {
        IncludesParameterDocument result = IncludesParameterDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IncludesValueDocument createGmlIncludesValueDocument() {
        IncludesValueDocument result = IncludesValueDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IncrementOrder createGmlIncrementOrder() {
        IncrementOrder result = IncrementOrder.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IndexMapDocument createGmlIndexMapDocument() {
        IndexMapDocument result = IndexMapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IndexMapType createGmlIndexMapType() {
        IndexMapType result = IndexMapType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IndirectEntryDocument createGmlIndirectEntryDocument() {
        IndirectEntryDocument result = IndirectEntryDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IndirectEntryType createGmlIndirectEntryType() {
        IndirectEntryType result = IndirectEntryType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public InnerBoundaryIsDocument createGmlInnerBoundaryIsDocument() {
        InnerBoundaryIsDocument result = InnerBoundaryIsDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IntegerList createGmlIntegerList() {
        IntegerList result = IntegerList.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IntegerOrNull createGmlIntegerOrNull() {
        IntegerOrNull result = IntegerOrNull.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IntegerOrNullList createGmlIntegerOrNullList() {
        IntegerOrNullList result = IntegerOrNullList.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IntegerValueDocument createGmlIntegerValueDocument() {
        IntegerValueDocument result = IntegerValueDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IntegerValueListDocument createGmlIntegerValueListDocument() {
        IntegerValueListDocument result = IntegerValueListDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public InteriorDocument createGmlInteriorDocument() {
        InteriorDocument result = InteriorDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public InverseFlatteningDocument createGmlInverseFlatteningDocument() {
        InverseFlatteningDocument result = InverseFlatteningDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IsolatedDocument createGmlIsolatedDocument() {
        IsolatedDocument result = IsolatedDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IsolatedPropertyType createGmlIsolatedPropertyType() {
        IsolatedPropertyType result = IsolatedPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IsSphereDocument createGmlIsSphereDocument() {
        IsSphereDocument result = IsSphereDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public KnotPropertyType createGmlKnotPropertyType() {
        KnotPropertyType result = KnotPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public KnotType createGmlKnotType() {
        KnotType result = KnotType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public KnotTypesType createGmlKnotTypesType() {
        KnotTypesType result = KnotTypesType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LabelStyleDocument createGmlLabelStyleDocument() {
        LabelStyleDocument result = LabelStyleDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LabelStylePropertyType createGmlLabelStylePropertyType() {
        LabelStylePropertyType result = LabelStylePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LabelStyleType createGmlLabelStyleType() {
        LabelStyleType result = LabelStyleType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LengthType createGmlLengthType() {
        LengthType result = LengthType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LinearCSDocument createGmlLinearCSDocument() {
        LinearCSDocument result = LinearCSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LinearCSRefDocument createGmlLinearCSRefDocument() {
        LinearCSRefDocument result = LinearCSRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LinearCSRefType createGmlLinearCSRefType() {
        LinearCSRefType result = LinearCSRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LinearCSType createGmlLinearCSType() {
        LinearCSType result = LinearCSType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LinearRingDocument createGmlLinearRingDocument() {
        LinearRingDocument result = LinearRingDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LinearRingPropertyType createGmlLinearRingPropertyType() {
        LinearRingPropertyType result = LinearRingPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LinearRingType createGmlLinearRingType() {
        LinearRingType result = LinearRingType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LineStringDocument createGmlLineStringDocument() {
        LineStringDocument result = LineStringDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LineStringMemberDocument createGmlLineStringMemberDocument() {
        LineStringMemberDocument result = LineStringMemberDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LineStringPropertyDocument createGmlLineStringPropertyDocument() {
        LineStringPropertyDocument result = LineStringPropertyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LineStringPropertyType createGmlLineStringPropertyType() {
        LineStringPropertyType result = LineStringPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LineStringSegmentArrayPropertyType createGmlLineStringSegmentArrayPropertyType() {
        LineStringSegmentArrayPropertyType result = LineStringSegmentArrayPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LineStringSegmentDocument createGmlLineStringSegmentDocument() {
        LineStringSegmentDocument result = LineStringSegmentDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LineStringSegmentType createGmlLineStringSegmentType() {
        LineStringSegmentType result = LineStringSegmentType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LineStringType createGmlLineStringType() {
        LineStringType result = LineStringType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LineTypeType createGmlLineTypeType() {
        LineTypeType result = LineTypeType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LocationDocument createGmlLocationDocument() {
        LocationDocument result = LocationDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LocationKeyWordDocument createGmlLocationKeyWordDocument() {
        LocationKeyWordDocument result = LocationKeyWordDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LocationPropertyType createGmlLocationPropertyType() {
        LocationPropertyType result = LocationPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LocationStringDocument createGmlLocationStringDocument() {
        LocationStringDocument result = LocationStringDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MappingRuleDocument createGmlMappingRuleDocument() {
        MappingRuleDocument result = MappingRuleDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MaximalComplexDocument createGmlMaximalComplexDocument() {
        MaximalComplexDocument result = MaximalComplexDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MaximumOccursDocument createGmlMaximumOccursDocument() {
        MaximumOccursDocument result = MaximumOccursDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MeasureDescriptionDocument createGmlMeasureDescriptionDocument() {
        MeasureDescriptionDocument result = MeasureDescriptionDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MeasureDocument createGmlMeasureDocument() {
        MeasureDocument result = MeasureDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MeasureListType createGmlMeasureListType() {
        MeasureListType result = MeasureListType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MeasureOrNullListType createGmlMeasureOrNullListType() {
        MeasureOrNullListType result = MeasureOrNullListType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MeasureType createGmlMeasureType() {
        MeasureType result = MeasureType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MemberDocument createGmlMemberDocument() {
        MemberDocument result = MemberDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MembersDocument createGmlMembersDocument() {
        MembersDocument result = MembersDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MeridianIDDocument createGmlMeridianIDDocument() {
        MeridianIDDocument result = MeridianIDDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MeridianNameDocument createGmlMeridianNameDocument() {
        MeridianNameDocument result = MeridianNameDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MetaDataDocument createGmlMetaDataDocument() {
        MetaDataDocument result = MetaDataDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MetaDataPropertyDocument createGmlMetaDataPropertyDocument() {
        MetaDataPropertyDocument result = MetaDataPropertyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MetaDataPropertyType createGmlMetaDataPropertyType() {
        MetaDataPropertyType result = MetaDataPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MethodFormulaDocument createGmlMethodFormulaDocument() {
        MethodFormulaDocument result = MethodFormulaDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MethodIDDocument createGmlMethodIDDocument() {
        MethodIDDocument result = MethodIDDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MethodNameDocument createGmlMethodNameDocument() {
        MethodNameDocument result = MethodNameDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MinimumOccursDocument createGmlMinimumOccursDocument() {
        MinimumOccursDocument result = MinimumOccursDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MinutesDocument createGmlMinutesDocument() {
        MinutesDocument result = MinutesDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ModifiedCoordinateDocument createGmlModifiedCoordinateDocument() {
        ModifiedCoordinateDocument result = ModifiedCoordinateDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MovingObjectStatusDocument createGmlMovingObjectStatusDocument() {
        MovingObjectStatusDocument result = MovingObjectStatusDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MovingObjectStatusType createGmlMovingObjectStatusType() {
        MovingObjectStatusType result = MovingObjectStatusType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiCenterLineOfDocument createGmlMultiCenterLineOfDocument() {
        MultiCenterLineOfDocument result = MultiCenterLineOfDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiCenterOfDocument createGmlMultiCenterOfDocument() {
        MultiCenterOfDocument result = MultiCenterOfDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiCoverageDocument createGmlMultiCoverageDocument() {
        MultiCoverageDocument result = MultiCoverageDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiCurveCoverageDocument createGmlMultiCurveCoverageDocument() {
        MultiCurveCoverageDocument result = MultiCurveCoverageDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiCurveCoverageType createGmlMultiCurveCoverageType() {
        MultiCurveCoverageType result = MultiCurveCoverageType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiCurveDocument createGmlMultiCurveDocument() {
        MultiCurveDocument result = MultiCurveDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiCurveDomainDocument createGmlMultiCurveDomainDocument() {
        MultiCurveDomainDocument result = MultiCurveDomainDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiCurveDomainType createGmlMultiCurveDomainType() {
        MultiCurveDomainType result = MultiCurveDomainType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiCurvePropertyDocument createGmlMultiCurvePropertyDocument() {
        MultiCurvePropertyDocument result = MultiCurvePropertyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiCurvePropertyType createGmlMultiCurvePropertyType() {
        MultiCurvePropertyType result = MultiCurvePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiCurveType createGmlMultiCurveType() {
        MultiCurveType result = MultiCurveType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiEdgeOfDocument createGmlMultiEdgeOfDocument() {
        MultiEdgeOfDocument result = MultiEdgeOfDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiExtentOfDocument createGmlMultiExtentOfDocument() {
        MultiExtentOfDocument result = MultiExtentOfDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiGeometryDocument createGmlMultiGeometryDocument() {
        MultiGeometryDocument result = MultiGeometryDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiGeometryPropertyDocument createGmlMultiGeometryPropertyDocument() {
        MultiGeometryPropertyDocument result = MultiGeometryPropertyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiGeometryPropertyType createGmlMultiGeometryPropertyType() {
        MultiGeometryPropertyType result = MultiGeometryPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiGeometryType createGmlMultiGeometryType() {
        MultiGeometryType result = MultiGeometryType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiLineStringDocument createGmlMultiLineStringDocument() {
        MultiLineStringDocument result = MultiLineStringDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiLineStringPropertyType createGmlMultiLineStringPropertyType() {
        MultiLineStringPropertyType result = MultiLineStringPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiLineStringType createGmlMultiLineStringType() {
        MultiLineStringType result = MultiLineStringType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiLocationDocument createGmlMultiLocationDocument() {
        MultiLocationDocument result = MultiLocationDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiPointCoverageDocument createGmlMultiPointCoverageDocument() {
        MultiPointCoverageDocument result = MultiPointCoverageDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiPointCoverageType createGmlMultiPointCoverageType() {
        MultiPointCoverageType result = MultiPointCoverageType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiPointDocument createGmlMultiPointDocument() {
        MultiPointDocument result = MultiPointDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiPointDomainDocument createGmlMultiPointDomainDocument() {
        MultiPointDomainDocument result = MultiPointDomainDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiPointDomainType createGmlMultiPointDomainType() {
        MultiPointDomainType result = MultiPointDomainType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiPointPropertyDocument createGmlMultiPointPropertyDocument() {
        MultiPointPropertyDocument result = MultiPointPropertyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiPointPropertyType createGmlMultiPointPropertyType() {
        MultiPointPropertyType result = MultiPointPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiPointType createGmlMultiPointType() {
        MultiPointType result = MultiPointType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiPolygonDocument createGmlMultiPolygonDocument() {
        MultiPolygonDocument result = MultiPolygonDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiPolygonPropertyType createGmlMultiPolygonPropertyType() {
        MultiPolygonPropertyType result = MultiPolygonPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiPolygonType createGmlMultiPolygonType() {
        MultiPolygonType result = MultiPolygonType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiPositionDocument createGmlMultiPositionDocument() {
        MultiPositionDocument result = MultiPositionDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiSolidCoverageDocument createGmlMultiSolidCoverageDocument() {
        MultiSolidCoverageDocument result = MultiSolidCoverageDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiSolidCoverageType createGmlMultiSolidCoverageType() {
        MultiSolidCoverageType result = MultiSolidCoverageType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiSolidDocument createGmlMultiSolidDocument() {
        MultiSolidDocument result = MultiSolidDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiSolidDomainDocument createGmlMultiSolidDomainDocument() {
        MultiSolidDomainDocument result = MultiSolidDomainDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiSolidDomainType createGmlMultiSolidDomainType() {
        MultiSolidDomainType result = MultiSolidDomainType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiSolidPropertyDocument createGmlMultiSolidPropertyDocument() {
        MultiSolidPropertyDocument result = MultiSolidPropertyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiSolidPropertyType createGmlMultiSolidPropertyType() {
        MultiSolidPropertyType result = MultiSolidPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiSolidType createGmlMultiSolidType() {
        MultiSolidType result = MultiSolidType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiSurfaceCoverageDocument createGmlMultiSurfaceCoverageDocument() {
        MultiSurfaceCoverageDocument result = MultiSurfaceCoverageDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiSurfaceCoverageType createGmlMultiSurfaceCoverageType() {
        MultiSurfaceCoverageType result = MultiSurfaceCoverageType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiSurfaceDocument createGmlMultiSurfaceDocument() {
        MultiSurfaceDocument result = MultiSurfaceDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiSurfaceDomainDocument createGmlMultiSurfaceDomainDocument() {
        MultiSurfaceDomainDocument result = MultiSurfaceDomainDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiSurfaceDomainType createGmlMultiSurfaceDomainType() {
        MultiSurfaceDomainType result = MultiSurfaceDomainType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiSurfacePropertyDocument createGmlMultiSurfacePropertyDocument() {
        MultiSurfacePropertyDocument result = MultiSurfacePropertyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiSurfacePropertyType createGmlMultiSurfacePropertyType() {
        MultiSurfacePropertyType result = MultiSurfacePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public MultiSurfaceType createGmlMultiSurfaceType() {
        MultiSurfaceType result = MultiSurfaceType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public NameDocument createGmlNameDocument() {
        NameDocument result = NameDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public NameList createGmlNameList() {
        NameList result = NameList.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public NameOrNull createGmlNameOrNull() {
        NameOrNull result = NameOrNull.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public NameOrNullList createGmlNameOrNullList() {
        NameOrNullList result = NameOrNullList.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public NCNameList createGmlNCNameList() {
        NCNameList result = NCNameList.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public NodeDocument createGmlNodeDocument() {
        NodeDocument result = NodeDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public NodeType createGmlNodeType() {
        NodeType result = NodeType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public NullDocument createGmlNullDocument() {
        NullDocument result = NullDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public NullEnumeration createGmlNullEnumeration() {
        NullEnumeration result = NullEnumeration.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public NullType createGmlNullType() {
        NullType result = NullType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObjectDocument createGmlObjectDocument() {
        ObjectDocument result = ObjectDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObliqueCartesianCSDocument createGmlObliqueCartesianCSDocument() {
        ObliqueCartesianCSDocument result = ObliqueCartesianCSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObliqueCartesianCSRefDocument createGmlObliqueCartesianCSRefDocument() {
        ObliqueCartesianCSRefDocument result = ObliqueCartesianCSRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObliqueCartesianCSRefType createGmlObliqueCartesianCSRefType() {
        ObliqueCartesianCSRefType result = ObliqueCartesianCSRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObliqueCartesianCSType createGmlObliqueCartesianCSType() {
        ObliqueCartesianCSType result = ObliqueCartesianCSType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObservationDocument createGmlObservationDocument() {
        ObservationDocument result = ObservationDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObservationType createGmlObservationType() {
        ObservationType result = ObservationType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OffsetCurveDocument createGmlOffsetCurveDocument() {
        OffsetCurveDocument result = OffsetCurveDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OffsetCurveType createGmlOffsetCurveType() {
        OffsetCurveType result = OffsetCurveType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OperationDocument createGmlOperationDocument() {
        OperationDocument result = OperationDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OperationMethodDocument createGmlOperationMethodDocument() {
        OperationMethodDocument result = OperationMethodDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OperationMethodRefDocument createGmlOperationMethodRefDocument() {
        OperationMethodRefDocument result = OperationMethodRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OperationMethodRefType createGmlOperationMethodRefType() {
        OperationMethodRefType result = OperationMethodRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OperationMethodType createGmlOperationMethodType() {
        OperationMethodType result = OperationMethodType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OperationParameterDocument createGmlOperationParameterDocument() {
        OperationParameterDocument result = OperationParameterDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OperationParameterGroupDocument createGmlOperationParameterGroupDocument() {
        OperationParameterGroupDocument result = OperationParameterGroupDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OperationParameterGroupRefDocument createGmlOperationParameterGroupRefDocument() {
        OperationParameterGroupRefDocument result = OperationParameterGroupRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OperationParameterGroupRefType createGmlOperationParameterGroupRefType() {
        OperationParameterGroupRefType result = OperationParameterGroupRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OperationParameterGroupType createGmlOperationParameterGroupType() {
        OperationParameterGroupType result = OperationParameterGroupType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OperationParameterRefDocument createGmlOperationParameterRefDocument() {
        OperationParameterRefDocument result = OperationParameterRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OperationParameterRefType createGmlOperationParameterRefType() {
        OperationParameterRefType result = OperationParameterRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OperationParameterType createGmlOperationParameterType() {
        OperationParameterType result = OperationParameterType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OperationRefDocument createGmlOperationRefDocument() {
        OperationRefDocument result = OperationRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OperationRefType createGmlOperationRefType() {
        OperationRefType result = OperationRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OperationVersionDocument createGmlOperationVersionDocument() {
        OperationVersionDocument result = OperationVersionDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OrientableCurveDocument createGmlOrientableCurveDocument() {
        OrientableCurveDocument result = OrientableCurveDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OrientableCurveType createGmlOrientableCurveType() {
        OrientableCurveType result = OrientableCurveType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OrientableSurfaceDocument createGmlOrientableSurfaceDocument() {
        OrientableSurfaceDocument result = OrientableSurfaceDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OrientableSurfaceType createGmlOrientableSurfaceType() {
        OrientableSurfaceType result = OrientableSurfaceType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OriginDocument createGmlOriginDocument() {
        OriginDocument result = OriginDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public OuterBoundaryIsDocument createGmlOuterBoundaryIsDocument() {
        OuterBoundaryIsDocument result = OuterBoundaryIsDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ParameterIDDocument createGmlParameterIDDocument() {
        ParameterIDDocument result = ParameterIDDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ParameterNameDocument createGmlParameterNameDocument() {
        ParameterNameDocument result = ParameterNameDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ParameterValueDocument createGmlParameterValueDocument() {
        ParameterValueDocument result = ParameterValueDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ParameterValueGroupDocument createGmlParameterValueGroupDocument() {
        ParameterValueGroupDocument result = ParameterValueGroupDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ParameterValueGroupType createGmlParameterValueGroupType() {
        ParameterValueGroupType result = ParameterValueGroupType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ParameterValueType createGmlParameterValueType() {
        ParameterValueType result = ParameterValueType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ParametricCurveSurfaceDocument createGmlParametricCurveSurfaceDocument() {
        ParametricCurveSurfaceDocument result = ParametricCurveSurfaceDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PassThroughOperationDocument createGmlPassThroughOperationDocument() {
        PassThroughOperationDocument result = PassThroughOperationDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PassThroughOperationRefDocument createGmlPassThroughOperationRefDocument() {
        PassThroughOperationRefDocument result = PassThroughOperationRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PassThroughOperationRefType createGmlPassThroughOperationRefType() {
        PassThroughOperationRefType result = PassThroughOperationRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PassThroughOperationType createGmlPassThroughOperationType() {
        PassThroughOperationType result = PassThroughOperationType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PatchesDocument createGmlPatchesDocument() {
        PatchesDocument result = PatchesDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PixelInCellDocument createGmlPixelInCellDocument() {
        PixelInCellDocument result = PixelInCellDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PixelInCellType createGmlPixelInCellType() {
        PixelInCellType result = PixelInCellType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PointArrayPropertyDocument createGmlPointArrayPropertyDocument() {
        PointArrayPropertyDocument result = PointArrayPropertyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PointArrayPropertyType createGmlPointArrayPropertyType() {
        PointArrayPropertyType result = PointArrayPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PointDocument createGmlPointDocument() {
        PointDocument result = PointDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PointMemberDocument createGmlPointMemberDocument() {
        PointMemberDocument result = PointMemberDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PointMembersDocument createGmlPointMembersDocument() {
        PointMembersDocument result = PointMembersDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PointPropertyDocument createGmlPointPropertyDocument() {
        PointPropertyDocument result = PointPropertyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PointPropertyType createGmlPointPropertyType() {
        PointPropertyType result = PointPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PointRepDocument createGmlPointRepDocument() {
        PointRepDocument result = PointRepDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PointType createGmlPointType() {
        PointType result = PointType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PolarCSDocument createGmlPolarCSDocument() {
        PolarCSDocument result = PolarCSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PolarCSRefDocument createGmlPolarCSRefDocument() {
        PolarCSRefDocument result = PolarCSRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PolarCSRefType createGmlPolarCSRefType() {
        PolarCSRefType result = PolarCSRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PolarCSType createGmlPolarCSType() {
        PolarCSType result = PolarCSType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PolygonDocument createGmlPolygonDocument() {
        PolygonDocument result = PolygonDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PolygonMemberDocument createGmlPolygonMemberDocument() {
        PolygonMemberDocument result = PolygonMemberDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PolygonPatchArrayPropertyType createGmlPolygonPatchArrayPropertyType() {
        PolygonPatchArrayPropertyType result = PolygonPatchArrayPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PolygonPatchDocument createGmlPolygonPatchDocument() {
        PolygonPatchDocument result = PolygonPatchDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PolygonPatchesDocument createGmlPolygonPatchesDocument() {
        PolygonPatchesDocument result = PolygonPatchesDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PolygonPatchType createGmlPolygonPatchType() {
        PolygonPatchType result = PolygonPatchType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PolygonPropertyDocument createGmlPolygonPropertyDocument() {
        PolygonPropertyDocument result = PolygonPropertyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PolygonPropertyType createGmlPolygonPropertyType() {
        PolygonPropertyType result = PolygonPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PolygonType createGmlPolygonType() {
        PolygonType result = PolygonType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PolyhedralSurfaceDocument createGmlPolyhedralSurfaceDocument() {
        PolyhedralSurfaceDocument result = PolyhedralSurfaceDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PolyhedralSurfaceType createGmlPolyhedralSurfaceType() {
        PolyhedralSurfaceType result = PolyhedralSurfaceType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PosDocument createGmlPosDocument() {
        PosDocument result = PosDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PositionalAccuracyDocument createGmlPositionalAccuracyDocument() {
        PositionalAccuracyDocument result = PositionalAccuracyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PositionDocument createGmlPositionDocument() {
        PositionDocument result = PositionDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PosListDocument createGmlPosListDocument() {
        PosListDocument result = PosListDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PrimeMeridianDocument createGmlPrimeMeridianDocument() {
        PrimeMeridianDocument result = PrimeMeridianDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PrimeMeridianRefDocument createGmlPrimeMeridianRefDocument() {
        PrimeMeridianRefDocument result = PrimeMeridianRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PrimeMeridianRefType createGmlPrimeMeridianRefType() {
        PrimeMeridianRefType result = PrimeMeridianRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PrimeMeridianType createGmlPrimeMeridianType() {
        PrimeMeridianType result = PrimeMeridianType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PriorityLocationDocument createGmlPriorityLocationDocument() {
        PriorityLocationDocument result = PriorityLocationDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public PriorityLocationPropertyType createGmlPriorityLocationPropertyType() {
        PriorityLocationPropertyType result = PriorityLocationPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ProjectedCRSDocument createGmlProjectedCRSDocument() {
        ProjectedCRSDocument result = ProjectedCRSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ProjectedCRSRefDocument createGmlProjectedCRSRefDocument() {
        ProjectedCRSRefDocument result = ProjectedCRSRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ProjectedCRSRefType createGmlProjectedCRSRefType() {
        ProjectedCRSRefType result = ProjectedCRSRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ProjectedCRSType createGmlProjectedCRSType() {
        ProjectedCRSType result = ProjectedCRSType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public QNameList createGmlQNameList() {
        QNameList result = QNameList.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public QuantityDocument createGmlQuantityDocument() {
        QuantityDocument result = QuantityDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public QuantityExtentDocument createGmlQuantityExtentDocument() {
        QuantityExtentDocument result = QuantityExtentDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public QuantityExtentType createGmlQuantityExtentType() {
        QuantityExtentType result = QuantityExtentType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public QuantityListDocument createGmlQuantityListDocument() {
        QuantityListDocument result = QuantityListDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public QuantityPropertyType createGmlQuantityPropertyType() {
        QuantityPropertyType result = QuantityPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public QuantityTypeDocument createGmlQuantityTypeDocument() {
        QuantityTypeDocument result = QuantityTypeDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public QueryGrammarEnumeration createGmlQueryGrammarEnumeration() {
        QueryGrammarEnumeration result = QueryGrammarEnumeration.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RangeParametersDocument createGmlRangeParametersDocument() {
        RangeParametersDocument result = RangeParametersDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RangeParametersType createGmlRangeParametersType() {
        RangeParametersType result = RangeParametersType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RangeSetDocument createGmlRangeSetDocument() {
        RangeSetDocument result = RangeSetDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RangeSetType createGmlRangeSetType() {
        RangeSetType result = RangeSetType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RealizationEpochDocument createGmlRealizationEpochDocument() {
        RealizationEpochDocument result = RealizationEpochDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RectangleDocument createGmlRectangleDocument() {
        RectangleDocument result = RectangleDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RectangleType createGmlRectangleType() {
        RectangleType result = RectangleType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RectifiedGridCoverageDocument createGmlRectifiedGridCoverageDocument() {
        RectifiedGridCoverageDocument result = RectifiedGridCoverageDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RectifiedGridCoverageType createGmlRectifiedGridCoverageType() {
        RectifiedGridCoverageType result = RectifiedGridCoverageType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RectifiedGridDocument createGmlRectifiedGridDocument() {
        RectifiedGridDocument result = RectifiedGridDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RectifiedGridDomainDocument createGmlRectifiedGridDomainDocument() {
        RectifiedGridDomainDocument result = RectifiedGridDomainDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RectifiedGridDomainType createGmlRectifiedGridDomainType() {
        RectifiedGridDomainType result = RectifiedGridDomainType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RectifiedGridType createGmlRectifiedGridType() {
        RectifiedGridType result = RectifiedGridType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ReferenceDocument createGmlReferenceDocument() {
        ReferenceDocument result = ReferenceDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ReferenceSystemDocument createGmlReferenceSystemDocument() {
        ReferenceSystemDocument result = ReferenceSystemDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ReferenceSystemRefDocument createGmlReferenceSystemRefDocument() {
        ReferenceSystemRefDocument result = ReferenceSystemRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ReferenceSystemRefType createGmlReferenceSystemRefType() {
        ReferenceSystemRefType result = ReferenceSystemRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ReferenceType createGmlReferenceType() {
        ReferenceType result = ReferenceType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RelatedTimeType createGmlRelatedTimeType() {
        RelatedTimeType result = RelatedTimeType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RelativeInternalPositionalAccuracyDocument createGmlRelativeInternalPositionalAccuracyDocument() {
        RelativeInternalPositionalAccuracyDocument result
                = RelativeInternalPositionalAccuracyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RelativeInternalPositionalAccuracyType createGmlRelativeInternalPositionalAccuracyType() {
        RelativeInternalPositionalAccuracyType result
                = RelativeInternalPositionalAccuracyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RemarksDocument createGmlRemarksDocument() {
        RemarksDocument result = RemarksDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RemoteSchemaAttribute createGmlRemoteSchemaAttribute() {
        RemoteSchemaAttribute result = RemoteSchemaAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ResultDocument createGmlResultDocument() {
        ResultDocument result = ResultDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ResultOfDocument createGmlResultOfDocument() {
        ResultOfDocument result = ResultOfDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RingDocument createGmlRingDocument() {
        RingDocument result = RingDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RingPropertyType createGmlRingPropertyType() {
        RingPropertyType result = RingPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RingType createGmlRingType() {
        RingType result = RingType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RoughConversionToPreferredUnitDocument createGmlRoughConversionToPreferredUnitDocument() {
        RoughConversionToPreferredUnitDocument result = RoughConversionToPreferredUnitDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RowIndexDocument createGmlRowIndexDocument() {
        RowIndexDocument result = RowIndexDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ScalarValuePropertyType createGmlScalarValuePropertyType() {
        ScalarValuePropertyType result = ScalarValuePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ScaleType createGmlScaleType() {
        ScaleType result = ScaleType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ScopeDocument createGmlScopeDocument() {
        ScopeDocument result = ScopeDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SecondDefiningParameterDocument createGmlSecondDefiningParameterDocument() {
        SecondDefiningParameterDocument result = SecondDefiningParameterDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SecondDefiningParameterType createGmlSecondDefiningParameterType() {
        SecondDefiningParameterType result = SecondDefiningParameterType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SecondsDocument createGmlSecondsDocument() {
        SecondsDocument result = SecondsDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SegmentsDocument createGmlSegmentsDocument() {
        SegmentsDocument result = SegmentsDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SemiMajorAxisDocument createGmlSemiMajorAxisDocument() {
        SemiMajorAxisDocument result = SemiMajorAxisDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SemiMinorAxisDocument createGmlSemiMinorAxisDocument() {
        SemiMinorAxisDocument result = SemiMinorAxisDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SequenceRuleNames createGmlSequenceRuleNames() {
        SequenceRuleNames result = SequenceRuleNames.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SequenceRuleType createGmlSequenceRuleType() {
        SequenceRuleType result = SequenceRuleType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SignType createGmlSignType() {
        SignType result = SignType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SingleOperationDocument createGmlSingleOperationDocument() {
        SingleOperationDocument result = SingleOperationDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SingleOperationRefDocument createGmlSingleOperationRefDocument() {
        SingleOperationRefDocument result = SingleOperationRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SingleOperationRefType createGmlSingleOperationRefType() {
        SingleOperationRefType result = SingleOperationRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SolidArrayPropertyDocument createGmlSolidArrayPropertyDocument() {
        SolidArrayPropertyDocument result = SolidArrayPropertyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SolidArrayPropertyType createGmlSolidArrayPropertyType() {
        SolidArrayPropertyType result = SolidArrayPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SolidDocument createGmlSolidDocument() {
        SolidDocument result = SolidDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SolidMemberDocument createGmlSolidMemberDocument() {
        SolidMemberDocument result = SolidMemberDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SolidMembersDocument createGmlSolidMembersDocument() {
        SolidMembersDocument result = SolidMembersDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SolidPropertyDocument createGmlSolidPropertyDocument() {
        SolidPropertyDocument result = SolidPropertyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SolidPropertyType createGmlSolidPropertyType() {
        SolidPropertyType result = SolidPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SolidType createGmlSolidType() {
        SolidType result = SolidType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SourceCRSDocument createGmlSourceCRSDocument() {
        SourceCRSDocument result = SourceCRSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SourceDimensionsDocument createGmlSourceDimensionsDocument() {
        SourceDimensionsDocument result = SourceDimensionsDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SpeedType createGmlSpeedType() {
        SpeedType result = SpeedType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SphereDocument createGmlSphereDocument() {
        SphereDocument result = SphereDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SphereType createGmlSphereType() {
        SphereType result = SphereType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SphericalCSDocument createGmlSphericalCSDocument() {
        SphericalCSDocument result = SphericalCSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SphericalCSRefDocument createGmlSphericalCSRefDocument() {
        SphericalCSRefDocument result = SphericalCSRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SphericalCSRefType createGmlSphericalCSRefType() {
        SphericalCSRefType result = SphericalCSRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SphericalCSType createGmlSphericalCSType() {
        SphericalCSType result = SphericalCSType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SrsIDDocument createGmlSrsIDDocument() {
        SrsIDDocument result = SrsIDDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SrsNameDocument createGmlSrsNameDocument() {
        SrsNameDocument result = SrsNameDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public StatusDocument createGmlStatusDocument() {
        StatusDocument result = StatusDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public StrictAssociationDocument createGmlStrictAssociationDocument() {
        StrictAssociationDocument result = StrictAssociationDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public StringOrNull createGmlStringOrNull() {
        StringOrNull result = StringOrNull.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public StringOrRefType createGmlStringOrRefType() {
        StringOrRefType result = StringOrRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public StringValueDocument createGmlStringValueDocument() {
        StringValueDocument result = StringValueDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public StyleDocument createGmlStyleDocument() {
        StyleDocument result = StyleDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public StyleType createGmlStyleType() {
        StyleType result = StyleType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public StyleVariationType createGmlStyleVariationType() {
        StyleVariationType result = StyleVariationType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SubComplexDocument createGmlSubComplexDocument() {
        SubComplexDocument result = SubComplexDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SubjectDocument createGmlSubjectDocument() {
        SubjectDocument result = SubjectDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SuccessionType createGmlSuccessionType() {
        SuccessionType result = SuccessionType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SuperComplexDocument createGmlSuperComplexDocument() {
        SuperComplexDocument result = SuperComplexDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SurfaceArrayPropertyDocument createGmlSurfaceArrayPropertyDocument() {
        SurfaceArrayPropertyDocument result = SurfaceArrayPropertyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SurfaceArrayPropertyType createGmlSurfaceArrayPropertyType() {
        SurfaceArrayPropertyType result = SurfaceArrayPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SurfaceDocument createGmlSurfaceDocument() {
        SurfaceDocument result = SurfaceDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SurfaceInterpolationType createGmlSurfaceInterpolationType() {
        SurfaceInterpolationType result = SurfaceInterpolationType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SurfaceMemberDocument createGmlSurfaceMemberDocument() {
        SurfaceMemberDocument result = SurfaceMemberDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SurfaceMembersDocument createGmlSurfaceMembersDocument() {
        SurfaceMembersDocument result = SurfaceMembersDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SurfacePatchArrayPropertyType createGmlSurfacePatchArrayPropertyType() {
        SurfacePatchArrayPropertyType result = SurfacePatchArrayPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SurfacePatchDocument createGmlSurfacePatchDocument() {
        SurfacePatchDocument result = SurfacePatchDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SurfacePropertyDocument createGmlSurfacePropertyDocument() {
        SurfacePropertyDocument result = SurfacePropertyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SurfacePropertyType createGmlSurfacePropertyType() {
        SurfacePropertyType result = SurfacePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SurfaceType createGmlSurfaceType() {
        SurfaceType result = SurfaceType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SymbolDocument createGmlSymbolDocument() {
        SymbolDocument result = SymbolDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SymbolType createGmlSymbolType() {
        SymbolType result = SymbolType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SymbolTypeEnumeration createGmlSymbolTypeEnumeration() {
        SymbolTypeEnumeration result = SymbolTypeEnumeration.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TargetCRSDocument createGmlTargetCRSDocument() {
        TargetCRSDocument result = TargetCRSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TargetDimensionsDocument createGmlTargetDimensionsDocument() {
        TargetDimensionsDocument result = TargetDimensionsDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TargetDocument createGmlTargetDocument() {
        TargetDocument result = TargetDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TargetPropertyType createGmlTargetPropertyType() {
        TargetPropertyType result = TargetPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TemporalCRSDocument createGmlTemporalCRSDocument() {
        TemporalCRSDocument result = TemporalCRSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TemporalCRSRefDocument createGmlTemporalCRSRefDocument() {
        TemporalCRSRefDocument result = TemporalCRSRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TemporalCRSRefType createGmlTemporalCRSRefType() {
        TemporalCRSRefType result = TemporalCRSRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TemporalCRSType createGmlTemporalCRSType() {
        TemporalCRSType result = TemporalCRSType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TemporalCSDocument createGmlTemporalCSDocument() {
        TemporalCSDocument result = TemporalCSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TemporalCSRefDocument createGmlTemporalCSRefDocument() {
        TemporalCSRefDocument result = TemporalCSRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TemporalCSRefType createGmlTemporalCSRefType() {
        TemporalCSRefType result = TemporalCSRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TemporalCSType createGmlTemporalCSType() {
        TemporalCSType result = TemporalCSType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TemporalDatumDocument createGmlTemporalDatumDocument() {
        TemporalDatumDocument result = TemporalDatumDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TemporalDatumRefDocument createGmlTemporalDatumRefDocument() {
        TemporalDatumRefDocument result = TemporalDatumRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TemporalDatumRefType createGmlTemporalDatumRefType() {
        TemporalDatumRefType result = TemporalDatumRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TemporalDatumType createGmlTemporalDatumType() {
        TemporalDatumType result = TemporalDatumType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TemporalExtentDocument createGmlTemporalExtentDocument() {
        TemporalExtentDocument result = TemporalExtentDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeCalendarDocument createGmlTimeCalendarDocument() {
        TimeCalendarDocument result = TimeCalendarDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeCalendarEraDocument createGmlTimeCalendarEraDocument() {
        TimeCalendarEraDocument result = TimeCalendarEraDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeCalendarEraPropertyType createGmlTimeCalendarEraPropertyType() {
        TimeCalendarEraPropertyType result = TimeCalendarEraPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeCalendarEraType createGmlTimeCalendarEraType() {
        TimeCalendarEraType result = TimeCalendarEraType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeCalendarPropertyType createGmlTimeCalendarPropertyType() {
        TimeCalendarPropertyType result = TimeCalendarPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeCalendarType createGmlTimeCalendarType() {
        TimeCalendarType result = TimeCalendarType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeClockDocument createGmlTimeClockDocument() {
        TimeClockDocument result = TimeClockDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeClockPropertyType createGmlTimeClockPropertyType() {
        TimeClockPropertyType result = TimeClockPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeClockType createGmlTimeClockType() {
        TimeClockType result = TimeClockType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeComplexDocument createGmlTimeComplexDocument() {
        TimeComplexDocument result = TimeComplexDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeCoordinateSystemDocument createGmlTimeCoordinateSystemDocument() {
        TimeCoordinateSystemDocument result = TimeCoordinateSystemDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeCoordinateSystemType createGmlTimeCoordinateSystemType() {
        TimeCoordinateSystemType result = TimeCoordinateSystemType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeEdgeDocument createGmlTimeEdgeDocument() {
        TimeEdgeDocument result = TimeEdgeDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeEdgePropertyType createGmlTimeEdgePropertyType() {
        TimeEdgePropertyType result = TimeEdgePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeEdgeType createGmlTimeEdgeType() {
        TimeEdgeType result = TimeEdgeType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeGeometricPrimitiveDocument createGmlTimeGeometricPrimitiveDocument() {
        TimeGeometricPrimitiveDocument result = TimeGeometricPrimitiveDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeGeometricPrimitivePropertyType createGmlTimeGeometricPrimitivePropertyType() {
        TimeGeometricPrimitivePropertyType result = TimeGeometricPrimitivePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeIndeterminateValueType createGmlTimeIndeterminateValueType() {
        TimeIndeterminateValueType result = TimeIndeterminateValueType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeInstantDocument createGmlTimeInstantDocument() {
        TimeInstantDocument result = TimeInstantDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeInstantPropertyType createGmlTimeInstantPropertyType() {
        TimeInstantPropertyType result = TimeInstantPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeInstantType createGmlTimeInstantType() {
        TimeInstantType result = TimeInstantType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeIntervalDocument createGmlTimeIntervalDocument() {
        TimeIntervalDocument result = TimeIntervalDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeIntervalLengthType createGmlTimeIntervalLengthType() {
        TimeIntervalLengthType result = TimeIntervalLengthType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeNodeDocument createGmlTimeNodeDocument() {
        TimeNodeDocument result = TimeNodeDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeNodePropertyType createGmlTimeNodePropertyType() {
        TimeNodePropertyType result = TimeNodePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeNodeType createGmlTimeNodeType() {
        TimeNodeType result = TimeNodeType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeObjectDocument createGmlTimeObjectDocument() {
        TimeObjectDocument result = TimeObjectDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeOrdinalEraDocument createGmlTimeOrdinalEraDocument() {
        TimeOrdinalEraDocument result = TimeOrdinalEraDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeOrdinalEraPropertyType createGmlTimeOrdinalEraPropertyType() {
        TimeOrdinalEraPropertyType result = TimeOrdinalEraPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeOrdinalEraType createGmlTimeOrdinalEraType() {
        TimeOrdinalEraType result = TimeOrdinalEraType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeOrdinalReferenceSystemDocument createGmlTimeOrdinalReferenceSystemDocument() {
        TimeOrdinalReferenceSystemDocument result = TimeOrdinalReferenceSystemDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeOrdinalReferenceSystemType createGmlTimeOrdinalReferenceSystemType() {
        TimeOrdinalReferenceSystemType result = TimeOrdinalReferenceSystemType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimePeriodDocument createGmlTimePeriodDocument() {
        TimePeriodDocument result = TimePeriodDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimePeriodPropertyType createGmlTimePeriodPropertyType() {
        TimePeriodPropertyType result = TimePeriodPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimePeriodType createGmlTimePeriodType() {
        TimePeriodType result = TimePeriodType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimePositionDocument createGmlTimePositionDocument() {
        TimePositionDocument result = TimePositionDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimePositionType createGmlTimePositionType() {
        TimePositionType result = TimePositionType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimePositionUnion createGmlTimePositionUnion() {
        TimePositionUnion result = TimePositionUnion.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimePrimitiveDocument createGmlTimePrimitiveDocument() {
        TimePrimitiveDocument result = TimePrimitiveDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimePrimitivePropertyType createGmlTimePrimitivePropertyType() {
        TimePrimitivePropertyType result = TimePrimitivePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeReferenceSystemDocument createGmlTimeReferenceSystemDocument() {
        TimeReferenceSystemDocument result = TimeReferenceSystemDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeSliceDocument createGmlTimeSliceDocument() {
        TimeSliceDocument result = TimeSliceDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeTopologyComplexDocument createGmlTimeTopologyComplexDocument() {
        TimeTopologyComplexDocument result = TimeTopologyComplexDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeTopologyComplexPropertyType createGmlTimeTopologyComplexPropertyType() {
        TimeTopologyComplexPropertyType result = TimeTopologyComplexPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeTopologyComplexType createGmlTimeTopologyComplexType() {
        TimeTopologyComplexType result = TimeTopologyComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeTopologyPrimitiveDocument createGmlTimeTopologyPrimitiveDocument() {
        TimeTopologyPrimitiveDocument result = TimeTopologyPrimitiveDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeTopologyPrimitivePropertyType createGmlTimeTopologyPrimitivePropertyType() {
        TimeTopologyPrimitivePropertyType result = TimeTopologyPrimitivePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeType createGmlTimeType() {
        TimeType result = TimeType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TimeUnitType createGmlTimeUnitType() {
        TimeUnitType result = TimeUnitType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TinDocument createGmlTinDocument() {
        TinDocument result = TinDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TinType createGmlTinType() {
        TinType result = TinType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoComplexDocument createGmlTopoComplexDocument() {
        TopoComplexDocument result = TopoComplexDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoComplexMemberType createGmlTopoComplexMemberType() {
        TopoComplexMemberType result = TopoComplexMemberType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoComplexPropertyDocument createGmlTopoComplexPropertyDocument() {
        TopoComplexPropertyDocument result = TopoComplexPropertyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoComplexType createGmlTopoComplexType() {
        TopoComplexType result = TopoComplexType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoCurveDocument createGmlTopoCurveDocument() {
        TopoCurveDocument result = TopoCurveDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoCurvePropertyDocument createGmlTopoCurvePropertyDocument() {
        TopoCurvePropertyDocument result = TopoCurvePropertyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoCurvePropertyType createGmlTopoCurvePropertyType() {
        TopoCurvePropertyType result = TopoCurvePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoCurveType createGmlTopoCurveType() {
        TopoCurveType result = TopoCurveType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopologyDocument createGmlTopologyDocument() {
        TopologyDocument result = TopologyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopologyStyleDocument createGmlTopologyStyleDocument() {
        TopologyStyleDocument result = TopologyStyleDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopologyStylePropertyType createGmlTopologyStylePropertyType() {
        TopologyStylePropertyType result = TopologyStylePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopologyStyleType createGmlTopologyStyleType() {
        TopologyStyleType result = TopologyStyleType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoPointDocument createGmlTopoPointDocument() {
        TopoPointDocument result = TopoPointDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoPointPropertyDocument createGmlTopoPointPropertyDocument() {
        TopoPointPropertyDocument result = TopoPointPropertyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoPointPropertyType createGmlTopoPointPropertyType() {
        TopoPointPropertyType result = TopoPointPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoPointType createGmlTopoPointType() {
        TopoPointType result = TopoPointType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoPrimitiveArrayAssociationType createGmlTopoPrimitiveArrayAssociationType() {
        TopoPrimitiveArrayAssociationType result = TopoPrimitiveArrayAssociationType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoPrimitiveDocument createGmlTopoPrimitiveDocument() {
        TopoPrimitiveDocument result = TopoPrimitiveDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoPrimitiveMemberDocument createGmlTopoPrimitiveMemberDocument() {
        TopoPrimitiveMemberDocument result = TopoPrimitiveMemberDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoPrimitiveMembersDocument createGmlTopoPrimitiveMembersDocument() {
        TopoPrimitiveMembersDocument result = TopoPrimitiveMembersDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoPrimitiveMemberType createGmlTopoPrimitiveMemberType() {
        TopoPrimitiveMemberType result = TopoPrimitiveMemberType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoSolidDocument createGmlTopoSolidDocument() {
        TopoSolidDocument result = TopoSolidDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoSolidType createGmlTopoSolidType() {
        TopoSolidType result = TopoSolidType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoSurfaceDocument createGmlTopoSurfaceDocument() {
        TopoSurfaceDocument result = TopoSurfaceDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoSurfacePropertyDocument createGmlTopoSurfacePropertyDocument() {
        TopoSurfacePropertyDocument result = TopoSurfacePropertyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoSurfacePropertyType createGmlTopoSurfacePropertyType() {
        TopoSurfacePropertyType result = TopoSurfacePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoSurfaceType createGmlTopoSurfaceType() {
        TopoSurfaceType result = TopoSurfaceType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoVolumeDocument createGmlTopoVolumeDocument() {
        TopoVolumeDocument result = TopoVolumeDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoVolumePropertyDocument createGmlTopoVolumePropertyDocument() {
        TopoVolumePropertyDocument result = TopoVolumePropertyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoVolumePropertyType createGmlTopoVolumePropertyType() {
        TopoVolumePropertyType result = TopoVolumePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TopoVolumeType createGmlTopoVolumeType() {
        TopoVolumeType result = TopoVolumeType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TrackDocument createGmlTrackDocument() {
        TrackDocument result = TrackDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TrackType createGmlTrackType() {
        TrackType result = TrackType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TransformationDocument createGmlTransformationDocument() {
        TransformationDocument result = TransformationDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TransformationRefDocument createGmlTransformationRefDocument() {
        TransformationRefDocument result = TransformationRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TransformationRefType createGmlTransformationRefType() {
        TransformationRefType result = TransformationRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TransformationType createGmlTransformationType() {
        TransformationType result = TransformationType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TransformAttribute createGmlTransformAttribute() {
        TransformAttribute result = TransformAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TriangleDocument createGmlTriangleDocument() {
        TriangleDocument result = TriangleDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TrianglePatchArrayPropertyType createGmlTrianglePatchArrayPropertyType() {
        TrianglePatchArrayPropertyType result = TrianglePatchArrayPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TrianglePatchesDocument createGmlTrianglePatchesDocument() {
        TrianglePatchesDocument result = TrianglePatchesDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TriangleType createGmlTriangleType() {
        TriangleType result = TriangleType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TriangulatedSurfaceDocument createGmlTriangulatedSurfaceDocument() {
        TriangulatedSurfaceDocument result = TriangulatedSurfaceDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TriangulatedSurfaceType createGmlTriangulatedSurfaceType() {
        TriangulatedSurfaceType result = TriangulatedSurfaceType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TupleListDocument createGmlTupleListDocument() {
        TupleListDocument result = TupleListDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UnitDefinitionDocument createGmlUnitDefinitionDocument() {
        UnitDefinitionDocument result = UnitDefinitionDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UnitDefinitionType createGmlUnitDefinitionType() {
        UnitDefinitionType result = UnitDefinitionType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UnitOfMeasureDocument createGmlUnitOfMeasureDocument() {
        UnitOfMeasureDocument result = UnitOfMeasureDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UnitOfMeasureType createGmlUnitOfMeasureType() {
        UnitOfMeasureType result = UnitOfMeasureType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UomAttribute createGmlUomAttribute() {
        UomAttribute result = UomAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UserDefinedCSDocument createGmlUserDefinedCSDocument() {
        UserDefinedCSDocument result = UserDefinedCSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UserDefinedCSRefDocument createGmlUserDefinedCSRefDocument() {
        UserDefinedCSRefDocument result = UserDefinedCSRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UserDefinedCSRefType createGmlUserDefinedCSRefType() {
        UserDefinedCSRefType result = UserDefinedCSRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UserDefinedCSType createGmlUserDefinedCSType() {
        UserDefinedCSType result = UserDefinedCSType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UsesAxisDocument createGmlUsesAxisDocument() {
        UsesAxisDocument result = UsesAxisDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UsesCartesianCSDocument createGmlUsesCartesianCSDocument() {
        UsesCartesianCSDocument result = UsesCartesianCSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UsesCSDocument createGmlUsesCSDocument() {
        UsesCSDocument result = UsesCSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UsesEllipsoidalCSDocument createGmlUsesEllipsoidalCSDocument() {
        UsesEllipsoidalCSDocument result = UsesEllipsoidalCSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UsesEllipsoidDocument createGmlUsesEllipsoidDocument() {
        UsesEllipsoidDocument result = UsesEllipsoidDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UsesEngineeringDatumDocument createGmlUsesEngineeringDatumDocument() {
        UsesEngineeringDatumDocument result = UsesEngineeringDatumDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UsesGeodeticDatumDocument createGmlUsesGeodeticDatumDocument() {
        UsesGeodeticDatumDocument result = UsesGeodeticDatumDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UsesImageDatumDocument createGmlUsesImageDatumDocument() {
        UsesImageDatumDocument result = UsesImageDatumDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UsesMethodDocument createGmlUsesMethodDocument() {
        UsesMethodDocument result = UsesMethodDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UsesObliqueCartesianCSDocument createGmlUsesObliqueCartesianCSDocument() {
        UsesObliqueCartesianCSDocument result = UsesObliqueCartesianCSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UsesOperationDocument createGmlUsesOperationDocument() {
        UsesOperationDocument result = UsesOperationDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UsesParameterDocument createGmlUsesParameterDocument() {
        UsesParameterDocument result = UsesParameterDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UsesPrimeMeridianDocument createGmlUsesPrimeMeridianDocument() {
        UsesPrimeMeridianDocument result = UsesPrimeMeridianDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UsesSingleOperationDocument createGmlUsesSingleOperationDocument() {
        UsesSingleOperationDocument result = UsesSingleOperationDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UsesSphericalCSDocument createGmlUsesSphericalCSDocument() {
        UsesSphericalCSDocument result = UsesSphericalCSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UsesTemporalCSDocument createGmlUsesTemporalCSDocument() {
        UsesTemporalCSDocument result = UsesTemporalCSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UsesTemporalDatumDocument createGmlUsesTemporalDatumDocument() {
        UsesTemporalDatumDocument result = UsesTemporalDatumDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UsesValueDocument createGmlUsesValueDocument() {
        UsesValueDocument result = UsesValueDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UsesVerticalCSDocument createGmlUsesVerticalCSDocument() {
        UsesVerticalCSDocument result = UsesVerticalCSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UsesVerticalDatumDocument createGmlUsesVerticalDatumDocument() {
        UsesVerticalDatumDocument result = UsesVerticalDatumDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public UsingDocument createGmlUsingDocument() {
        UsingDocument result = UsingDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ValidAreaDocument createGmlValidAreaDocument() {
        ValidAreaDocument result = ValidAreaDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ValidTimeDocument createGmlValidTimeDocument() {
        ValidTimeDocument result = ValidTimeDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ValueArrayDocument createGmlValueArrayDocument() {
        ValueArrayDocument result = ValueArrayDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ValueArrayPropertyType createGmlValueArrayPropertyType() {
        ValueArrayPropertyType result = ValueArrayPropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ValueArrayType createGmlValueArrayType() {
        ValueArrayType result = ValueArrayType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ValueComponentDocument createGmlValueComponentDocument() {
        ValueComponentDocument result = ValueComponentDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ValueComponentsDocument createGmlValueComponentsDocument() {
        ValueComponentsDocument result = ValueComponentsDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ValueDocument createGmlValueDocument() {
        ValueDocument result = ValueDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ValueFileDocument createGmlValueFileDocument() {
        ValueFileDocument result = ValueFileDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ValueListDocument createGmlValueListDocument() {
        ValueListDocument result = ValueListDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ValueOfParameterDocument createGmlValueOfParameterDocument() {
        ValueOfParameterDocument result = ValueOfParameterDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ValuePropertyDocument createGmlValuePropertyDocument() {
        ValuePropertyDocument result = ValuePropertyDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ValuePropertyType createGmlValuePropertyType() {
        ValuePropertyType result = ValuePropertyType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ValuesOfGroupDocument createGmlValuesOfGroupDocument() {
        ValuesOfGroupDocument result = ValuesOfGroupDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public VectorDocument createGmlVectorDocument() {
        VectorDocument result = VectorDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public VectorType createGmlVectorType() {
        VectorType result = VectorType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public VersionDocument createGmlVersionDocument() {
        VersionDocument result = VersionDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public VerticalCRSDocument createGmlVerticalCRSDocument() {
        VerticalCRSDocument result = VerticalCRSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public VerticalCRSRefDocument createGmlVerticalCRSRefDocument() {
        VerticalCRSRefDocument result = VerticalCRSRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public VerticalCRSRefType createGmlVerticalCRSRefType() {
        VerticalCRSRefType result = VerticalCRSRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public VerticalCRSType createGmlVerticalCRSType() {
        VerticalCRSType result = VerticalCRSType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public VerticalCSDocument createGmlVerticalCSDocument() {
        VerticalCSDocument result = VerticalCSDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public VerticalCSRefDocument createGmlVerticalCSRefDocument() {
        VerticalCSRefDocument result = VerticalCSRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public VerticalCSRefType createGmlVerticalCSRefType() {
        VerticalCSRefType result = VerticalCSRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public VerticalCSType createGmlVerticalCSType() {
        VerticalCSType result = VerticalCSType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public VerticalDatumDocument createGmlVerticalDatumDocument() {
        VerticalDatumDocument result = VerticalDatumDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public VerticalDatumRefDocument createGmlVerticalDatumRefDocument() {
        VerticalDatumRefDocument result = VerticalDatumRefDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public VerticalDatumRefType createGmlVerticalDatumRefType() {
        VerticalDatumRefType result = VerticalDatumRefType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public VerticalDatumType createGmlVerticalDatumType() {
        VerticalDatumType result = VerticalDatumType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public VerticalDatumTypeDocument createGmlVerticalDatumTypeDocument() {
        VerticalDatumTypeDocument result = VerticalDatumTypeDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public VerticalDatumTypeType createGmlVerticalDatumTypeType() {
        VerticalDatumTypeType result = VerticalDatumTypeType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public VerticalExtentDocument createGmlVerticalExtentDocument() {
        VerticalExtentDocument result = VerticalExtentDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public VolumeType createGmlVolumeType() {
        VolumeType result = VolumeType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ClassificationWrapDocument.ClassificationWrap createLidoClassificationWrap() {
        ClassificationWrapDocument.ClassificationWrap result = ClassificationWrapDocument.ClassificationWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ClassificationWrapDocument.ClassificationWrap.Classification createLidoClassification() {
        ClassificationWrapDocument.ClassificationWrap.Classification result = ClassificationWrapDocument.ClassificationWrap.Classification.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DisplayStateEditionWrapDocument.DisplayStateEditionWrap createLidoDisplayStateEditionWrap() {
        DisplayStateEditionWrapDocument.DisplayStateEditionWrap result = DisplayStateEditionWrapDocument.DisplayStateEditionWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EventWrapDocument.EventWrap createLidoEventWrap() {
        EventWrapDocument.EventWrap result = EventWrapDocument.EventWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EventWrapDocument.EventWrap.EventSet createLidoEvent() {
        EventWrapDocument.EventWrap.EventSet result = EventWrapDocument.EventWrap.EventSet.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public InscriptionsWrapDocument.InscriptionsWrap createLidoInscriptionsWrap() {
        InscriptionsWrapDocument.InscriptionsWrap result = InscriptionsWrapDocument.InscriptionsWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public InscriptionsWrapDocument.InscriptionsWrap.Inscriptions createLidoInscriptions() {
        InscriptionsWrapDocument.InscriptionsWrap.Inscriptions result
                = InscriptionsWrapDocument.InscriptionsWrap.Inscriptions.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObjectClassificationWrapDocument.ObjectClassificationWrap createLidoObjectClassificationWrap() {
        ObjectClassificationWrapDocument.ObjectClassificationWrap result = ObjectClassificationWrapDocument.ObjectClassificationWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObjectDescriptionWrapDocument.ObjectDescriptionWrap createLidoObjectDescriptionWrap() {
        ObjectDescriptionWrapDocument.ObjectDescriptionWrap result = ObjectDescriptionWrapDocument.ObjectDescriptionWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObjectIdentificationWrapDocument.ObjectIdentificationWrap createLidoObjectIdentificationWrap() {
        ObjectIdentificationWrapDocument.ObjectIdentificationWrap result
                = ObjectIdentificationWrapDocument.ObjectIdentificationWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap createLidoObjectMeasurementsWrap() {
        ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap result = ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet createLidoObjectMeasurements() {
        ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet result
                = ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LidoWrapDocument.LidoWrap createLidoWrap() {
        return LidoWrapDocument.LidoWrap.Factory.newInstance();
    }


    @Provides
    @Override
    public LidoWrapDocument.LidoWrap.Lido createLido() {
        return LidoWrapDocument.LidoWrap.Lido.Factory.newInstance();
    }


    @Provides
    @Override
    public RepositorySetComplexType createLidoRepository() {
        return RepositorySetComplexType.Factory.newInstance();
    }


    @Provides
    @Override
    public ObjectRelationWrapDocument.ObjectRelationWrap createLidoObjectRelationWrap() {
        ObjectRelationWrapDocument.ObjectRelationWrap result
                = ObjectRelationWrapDocument.ObjectRelationWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap createLidoObjectWorkTypeWrap() {
        ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap result
                = ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType createLidoObjectWorkType() {
        ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType result
                = ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RecordWrapDocument.RecordWrap createLidoRecordWrap() {
        RecordWrapDocument.RecordWrap result = RecordWrapDocument.RecordWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RelatedWorksWrapDocument.RelatedWorksWrap createLidoRelatedWorksWrap() {
        RelatedWorksWrapDocument.RelatedWorksWrap result
                = RelatedWorksWrapDocument.RelatedWorksWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet createLidoRelatedWorks() {
        RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet result
                = RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RepositoryWrapDocument.RepositoryWrap createLidoRepositoryWrap() {
        RepositoryWrapDocument.RepositoryWrap result = RepositoryWrapDocument.RepositoryWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ResourceWrapDocument.ResourceWrap createLidoResourceWrap() {
        ResourceWrapDocument.ResourceWrap result = ResourceWrapDocument.ResourceWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ResourceWrapDocument.ResourceWrap.ResourceSet createLidoResource() {
        ResourceWrapDocument.ResourceWrap.ResourceSet result = ResourceWrapDocument.ResourceWrap.ResourceSet.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RightsWorkWrapDocument.RightsWorkWrap createLidoRightsWorkWrap() {
        RightsWorkWrapDocument.RightsWorkWrap result = RightsWorkWrapDocument.RightsWorkWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet createLidoRightsWork() {
        RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet result = RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SubjectWrapDocument.SubjectWrap createLidoSubjectWrap() {
        SubjectWrapDocument.SubjectWrap result = SubjectWrapDocument.SubjectWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SubjectWrapDocument.SubjectWrap.SubjectSet createLidoSubject() {
        SubjectWrapDocument.SubjectWrap.SubjectSet result = SubjectWrapDocument.SubjectWrap.SubjectSet.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TitleWrapDocument.TitleWrap createLidoTitleWrap() {
        TitleWrapDocument.TitleWrap result = TitleWrapDocument.TitleWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TitleWrapDocument.TitleWrap.TitleSet createLidoTitle() {
        TitleWrapDocument.TitleWrap.TitleSet result = TitleWrapDocument.TitleWrap.TitleSet.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CurveMembersDocument createGmlCurveMembersDocument() {
        CurveMembersDocument result = CurveMembersDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public org.w3.x2001.smil20.language.AnimateColorDocument createSmilLanguageAnimateColorDocument() {
        org.w3.x2001.smil20.language.AnimateColorDocument result =
                org.w3.x2001.smil20.language.AnimateColorDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public org.w3.x2001.smil20.language.AnimateDocument createSmilLanguageAnimateDocument() {
        org.w3.x2001.smil20.language.AnimateDocument result = org.w3.x2001.smil20.language.AnimateDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public org.w3.x2001.smil20.language.AnimateMotionDocument createSmilLanguageAnimateMotionDocument() {
        org.w3.x2001.smil20.language.AnimateMotionDocument result = org.w3.x2001.smil20.language.AnimateMotionDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public org.w3.x2001.smil20.language.SetDocument createSmilLanguageSetDocument() {
        org.w3.x2001.smil20.language.SetDocument result = org.w3.x2001.smil20.language.SetDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public org.w3.x1999.xlink.ArcDocument createXLinkArcDocument() {
        org.w3.x1999.xlink.ArcDocument result = org.w3.x1999.xlink.ArcDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public org.w3.x1999.xlink.ArcType createXLinkArcType() {
        org.w3.x1999.xlink.ArcType result = org.w3.x1999.xlink.ArcType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public org.w3.x1999.xlink.LabelAttribute createXLinkLabelAttribute() {
        return org.w3.x1999.xlink.LabelAttribute.Factory.newInstance();
    }


    @Provides
    @Override
    public org.w3.x1999.xlink.LabelType createXLinkLabelType() {
        return org.w3.x1999.xlink.LabelType.Factory.newInstance();
    }


    @Provides
    @Override
    public org.w3.x1999.xlink.TypeAttribute createXlinkTypeAttribute() {
        org.w3.x1999.xlink.TypeAttribute result = org.w3.x1999.xlink.TypeAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AppellationComplexType.AppellationValue createLidoAppellationValue() {
        return AppellationComplexType.AppellationValue.Factory.newInstance();
    }


    @Provides
    @Override
    public RecordWrapDocument.RecordWrap.RecordSource createLidoRecordSource() {
        return RecordWrapDocument.RecordWrap.RecordSource.Factory.newInstance();
    }
}
