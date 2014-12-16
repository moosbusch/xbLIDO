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
package io.github.moosbusch.museum.inject.lido.impl;

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
import io.github.moosbusch.museum.document.lido.LidoXmlDocument;
import io.github.moosbusch.museum.document.lido.impl.DefaultLidoObjectFactory;
import io.github.moosbusch.museum.document.lido.impl.DefaultLidoXmlDocument;
import io.github.moosbusch.museum.inject.lido.LidoModule;
import io.github.moosbusch.museum.inject.spi.AbstractMuseumXmlModule;
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
public class DefaultLidoModule extends AbstractMuseumXmlModule implements LidoModule {

    @Override
    protected void configureImpl() {
        binder().bind(BigInteger.class).toInstance(BigInteger.ZERO);
    }

    @Provides
    @Override
    public LidoXmlDocument<? extends DefaultLidoObjectFactory> createDocument() {
        return new DefaultLidoXmlDocument();
    }

    @Provides
    @Override
    public TemporalDatumBaseType createGmlTemporalDatumBaseType() {
        return TemporalDatumType.Factory.newInstance();
    }

    @Provides
    @Override
    public PrimeMeridianBaseType createGmlPrimeMeridianBaseType() {
        return PrimeMeridianType.Factory.newInstance();
    }

    @Provides
    @Override
    public OperationParameterGroupBaseType createGmlOperationParameterGroupBaseType() {
        return OperationParameterGroupType.Factory.newInstance();
    }

    @Provides
    @Override
    public OperationParameterBaseType createGmlOperationParameterBaseType() {
        return OperationParameterType.Factory.newInstance();
    }

    @Provides
    @Override
    public OperationMethodBaseType createGmlOperationMethodBaseType() {
        return OperationMethodType.Factory.newInstance();
    }

    @Provides
    @Override
    public EllipsoidBaseType createGmlEllipsoidBaseType() {
        return EllipsoidType.Factory.newInstance();
    }

    @Provides
    @Override
    public CoordinateSystemAxisBaseType createGmlCoordinateSystemAxisBaseType() {
        return CoordinateSystemAxisType.Factory.newInstance();
    }

    @Provides
    @Override
    public BoundedFeatureType createGmlBoundedFeatureType() {
        return new BoundedFeatureTypeImpl(BoundedFeatureType.type);
    }

    @Provides
    @Override
    public AnimateMotionType createSmilAnimateMotionType() {
        return AnimateMotionType.Factory.newInstance();
    }

    @Provides
    @Override
    public AnimateColorDocument createSmilAnimateColorDocument() {
        return AnimateColorDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public AnimateColorType createSmilAnimateColorType() {
        return AnimateColorType.Factory.newInstance();
    }

    @Provides
    @Override
    public AnimateDocument createSmilAnimateDocument() {
        return AnimateDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public AnimateMotionDocument createSmilAnimateMotionDocument() {
        return AnimateMotionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public AnimateType createSmilAnimateType() {
        return AnimateType.Factory.newInstance();
    }

    @Provides
    @Override
    public SetDocument createSmilSetDocument() {
        return SetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SetType createSmilSetType() {
        return SetType.Factory.newInstance();
    }

    @Provides
    @Override
    public AnimateColorPrototype createSmilAnimateColorPrototype() {
        return AnimateColorPrototype.Factory.newInstance();
    }

    @Provides
    @Override
    public AnimateMotionPrototype createSmilAnimateMotionPrototype() {
        return AnimateMotionPrototype.Factory.newInstance();
    }

    @Provides
    @Override
    public AnimatePrototype createSmilAnimatePrototype() {
        return AnimatePrototype.Factory.newInstance();
    }

    @Provides
    @Override
    public FillDefaultType createSmilFillDefaultType() {
        return FillDefaultType.Factory.newInstance();
    }

    @Provides
    @Override
    public FillTimingAttrsType createSmilFillTimingAttrsType() {
        return FillTimingAttrsType.Factory.newInstance();
    }

    @Provides
    @Override
    public NonNegativeDecimalType createSmilNonNegativeDecimalType() {
        return NonNegativeDecimalType.Factory.newInstance();
    }

    @Provides
    @Override
    public RestartDefaultType createSmilRestartDefaultType() {
        return RestartDefaultType.Factory.newInstance();
    }

    @Provides
    @Override
    public RestartTimingType createSmilRestartTimingType() {
        return RestartTimingType.Factory.newInstance();
    }

    @Provides
    @Override
    public SetPrototype createSmilSetPrototype() {
        return SetPrototype.Factory.newInstance();
    }

    @Provides
    @Override
    public SyncBehaviorDefaultType createSmilSyncBehaviorDefaultType() {
        return SyncBehaviorDefaultType.Factory.newInstance();
    }

    @Provides
    @Override
    public SyncBehaviorType createSmilSyncBehaviorType() {
        return SyncBehaviorType.Factory.newInstance();
    }

    @Provides
    @Override
    public ActuateAttribute createXLinkActuateAttribute() {
        return ActuateAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public ActuateType createXLinkActuateType() {
        return ActuateType.Factory.newInstance();
    }

    @Provides
    @Override
    public ArcDocument createGmlArcDocument() {
        return ArcDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ArcroleAttribute createXLinkArcroleAttribute() {
        return ArcroleAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public ArcroleType createXLinkArcroleType() {
        return ArcroleType.Factory.newInstance();
    }

    @Provides
    @Override
    public ArcType createGmlArcType() {
        return ArcType.Factory.newInstance();
    }

    @Provides
    @Override
    public Extended createXLinkExtended() {
        return Extended.Factory.newInstance();
    }

    @Provides
    @Override
    public FromAttribute createXLinkFromAttribute() {
        return FromAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public FromType createXLinkFromType() {
        return FromType.Factory.newInstance();
    }

    @Provides
    @Override
    public HrefAttribute createXLinkHrefAttribute() {
        return HrefAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public HrefType createXLinkHrefType() {
        return HrefType.Factory.newInstance();
    }

    @Provides
    @Override
    public LabelAttribute createLidoLabelAttribute() {
        return LabelAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public LabelType createGmlLabelType() {
        return LabelType.Factory.newInstance();
    }

    @Provides
    @Override
    public LocatorDocument createXLinkLocatorDocument() {
        return LocatorDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LocatorType createXLinkLocatorType() {
        return LocatorType.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceDocument createXLinkResourceDocument() {
        return ResourceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceType createXLinkResourceType() {
        return ResourceType.Factory.newInstance();
    }

    @Provides
    @Override
    public RoleAttribute createXLinkRoleAttribute() {
        return RoleAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public RoleType createXLinkRoleType() {
        return RoleType.Factory.newInstance();
    }

    @Provides
    @Override
    public ShowAttribute createXLinkShowAttribute() {
        return ShowAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public ShowType createXLinkShowType() {
        return ShowType.Factory.newInstance();
    }

    @Provides
    @Override
    public Simple createXLinkSimple() {
        return Simple.Factory.newInstance();
    }

    @Provides
    @Override
    public TitleAttribute createXLinkTitleAttribute() {
        return TitleAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public TitleAttrType createXLinkTitleAttrType() {
        return TitleAttrType.Factory.newInstance();
    }

    @Provides
    @Override
    public TitleDocument createXLinkTitleDocument() {
        return TitleDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TitleEltType createXLinkTitleEltType() {
        return TitleEltType.Factory.newInstance();
    }

    @Provides
    @Override
    public ToAttribute createXLinkToAttribute() {
        return ToAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public ToType createXLinkToType() {
        return ToType.Factory.newInstance();
    }

    @Provides
    @Override
    public TypeAttribute createLidoTypeAttribute() {
        return TypeAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public TypeType createXLinkTypeType() {
        return TypeType.Factory.newInstance();
    }

    @Provides
    @Override
    public ActorComplexType createLidoActorComplexType() {
        return ActorComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public ActorInRoleComplexType createLidoActorInRoleComplexType() {
        return ActorInRoleComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public ActorInRoleSetComplexType createLidoActorInRoleSetComplexType() {
        return ActorInRoleSetComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public ActorSetComplexType createLidoActorSetComplexType() {
        return ActorSetComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public AddedSearchTermAttribute createLidoAddedSearchTermAttribute() {
        return AddedSearchTermAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public AdministrativeMetadataComplexType createLidoAdministrativeMetadataComplexType() {
        return AdministrativeMetadataComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public AdministrativeMetadataDocument createLidoAdministrativeMetadataDocument() {
        return AdministrativeMetadataDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public AppellationComplexType createLidoAppellationComplexType() {
        return AppellationComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public ClassificationWrapDocument createLidoClassificationWrapDocument() {
        return ClassificationWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ConceptComplexType createLidoConceptComplexType() {
        return ConceptComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public DateComplexType createLidoDateComplexType() {
        return DateComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public DateSetComplexType createLidoDateSetComplexType() {
        return DateSetComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public DescriptiveMetadataComplexType createLidoDescriptiveMetadataComplexType() {
        return DescriptiveMetadataComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public DescriptiveMetadataDocument createLidoDescriptiveMetadataDocument() {
        return DescriptiveMetadataDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DescriptiveNoteComplexType createLidoDescriptiveNoteComplexType() {
        return DescriptiveNoteComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayStateEditionWrapDocument createLidoDisplayStateEditionWrapDocument() {
        return DisplayStateEditionWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public EncodinganalogAttribute createLidoEncodinganalogAttribute() {
        return EncodinganalogAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public EventComplexType createLidoEventComplexType() {
        return EventComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public EventSetComplexType createLidoEventSetComplexType() {
        return EventSetComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public EventWrapDocument createLidoEventWrapDocument() {
        return EventWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GeographicalEntityAttribute createLidoGeographicalEntityAttribute() {
        return GeographicalEntityAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public GmlComplexType createLidoGmlComplexType() {
        return GmlComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public IdentifierComplexType createLidoIdentifierComplexType() {
        return IdentifierComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public InscriptionsWrapDocument createLidoInscriptionsWrapDocument() {
        return InscriptionsWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LegalBodyRefComplexType createLidoLegalBodyRefComplexType() {
        return LegalBodyRefComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public LidoComplexType createLidoLidoComplexType() {
        return LidoComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public LidoDocument createLidoLidoDocument() {
        return LidoDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LidoWrapDocument createLidoLidoWrapDocument() {
        return LidoWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MaterialsTechComplexType createLidoMaterialsTechComplexType() {
        return MaterialsTechComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public MaterialsTechSetComplexType createLidoMaterialsTechSetComplexType() {
        return MaterialsTechSetComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public MeasurementsSetComplexType createLidoMeasurementsSetComplexType() {
        return MeasurementsSetComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectClassificationWrapDocument createLidoObjectClassificationWrapDocument() {
        return ObjectClassificationWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectComplexType createLidoObjectComplexType() {
        return ObjectComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectDescriptionWrapDocument createLidoObjectDescriptionWrapDocument() {
        return ObjectDescriptionWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectIdentificationWrapDocument createLidoObjectIdentificationWrapDocument() {
        return ObjectIdentificationWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectMeasurementsComplexType createLidoObjectMeasurementsComplexType() {
        return ObjectMeasurementsComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectMeasurementsSetComplexType createLidoObjectMeasurementsSetComplexType() {
        return ObjectMeasurementsSetComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectMeasurementsWrapDocument createLidoObjectMeasurementsWrapDocument() {
        return ObjectMeasurementsWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectRelationWrapDocument createLidoObjectRelationWrapDocument() {
        return ObjectRelationWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectSetComplexType createLidoObjectSetComplexType() {
        return ObjectSetComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectWorkTypeWrapDocument createLidoObjectWorkTypeWrapDocument() {
        return ObjectWorkTypeWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PlaceComplexType createLidoPlaceComplexType() {
        return PlaceComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public PlaceSetComplexType createLidoPlaceSetComplexType() {
        return PlaceSetComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public PoliticalEntityAttribute createLidoPoliticalEntityAttribute() {
        return PoliticalEntityAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public PrefAttribute createLidoPrefAttribute() {
        return PrefAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordInfoSetComplexType createLidoRecordInfoSetComplexType() {
        return RecordInfoSetComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordWrapDocument createLidoRecordWrapDocument() {
        return RecordWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RelatedencodingAttribute createLidoRelatedencodingAttribute() {
        return RelatedencodingAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public RelatedEventSetComplexType createLidoRelatedEventSetComplexType() {
        return RelatedEventSetComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public RelatedWorkSetComplexType createLidoRelatedWorkSetComplexType() {
        return RelatedWorkSetComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public RelatedWorksWrapDocument createLidoRelatedWorksWrapDocument() {
        return RelatedWorksWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RepositoryWrapDocument createLidoRepositoryWrapDocument() {
        return RepositoryWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceSetComplexType createLidoResourceSetComplexType() {
        return ResourceSetComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceWrapDocument createLidoResourceWrapDocument() {
        return ResourceWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RightsComplexType createLidoRightsComplexType() {
        return RightsComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public RightsWorkWrapDocument createLidoRightsWorkWrapDocument() {
        return RightsWorkWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SortorderAttribute createLidoSortorderAttribute() {
        return SortorderAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public SourceAttribute createLidoSourceAttribute() {
        return SourceAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public SubjectComplexType createLidoSubjectComplexType() {
        return SubjectComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public SubjectSetComplexType createLidoSubjectSetComplexType() {
        return SubjectSetComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public SubjectWrapDocument createLidoSubjectWrapDocument() {
        return SubjectWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TermComplexType createLidoTermComplexType() {
        return TermComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public TextComplexType createLidoTextComplexType() {
        return TextComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public TitleWrapDocument createLidoTitleWrapDocument() {
        return TitleWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public WebResourceComplexType createLidoWebResourceComplexType() {
        return WebResourceComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public AbsoluteExternalPositionalAccuracyDocument createGmlAbsoluteExternalPositionalAccuracyDocument() {
        return AbsoluteExternalPositionalAccuracyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public AbsoluteExternalPositionalAccuracyType createGmlAbsoluteExternalPositionalAccuracyType() {
        return AbsoluteExternalPositionalAccuracyType.Factory.newInstance();
    }

    @Provides
    @Override
    public AbstractGeneralOperationParameterRefDocument createGmlAbstractGeneralOperationParameterRefDocument() {
        return AbstractGeneralOperationParameterRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public AbstractGeneralOperationParameterRefType createGmlAbstractGeneralOperationParameterRefType() {
        return AbstractGeneralOperationParameterRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public AbstractGriddedSurfaceType createGmlAbstractGriddedSurfaceType() {
        return AbstractGriddedSurfaceType.Factory.newInstance();
    }

    @Provides
    @Override
    public AbstractParametricCurveSurfaceType createGmlAbstractParametricCurveSurfaceType() {
        return AbstractParametricCurveSurfaceType.Factory.newInstance();
    }

    @Provides
    @Override
    public AbstractRingPropertyType createGmlAbstractRingPropertyType() {
        return AbstractRingPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public AbstractSolidType createGmlAbstractSolidType() {
        return AbstractSolidType.Factory.newInstance();
    }

    @Provides
    @Override
    public AbstractSurfaceType createGmlAbstractSurfaceType() {
        return AbstractSurfaceType.Factory.newInstance();
    }

    @Provides
    @Override
    public AesheticCriteriaType createGmlAesheticCriteriaType() {
        return AesheticCriteriaType.Factory.newInstance();
    }

    @Provides
    @Override
    public AffinePlacementDocument createGmlAffinePlacementDocument() {
        return AffinePlacementDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public AffinePlacementType createGmlAffinePlacementType() {
        return AffinePlacementType.Factory.newInstance();
    }

    @Provides
    @Override
    public AnchorPointDocument createGmlAnchorPointDocument() {
        return AnchorPointDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public AngleChoiceType createGmlAngleChoiceType() {
        return AngleChoiceType.Factory.newInstance();
    }

    @Provides
    @Override
    public AngleDocument createGmlAngleDocument() {
        return AngleDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public AngleType createGmlAngleType() {
        return AngleType.Factory.newInstance();
    }

    @Provides
    @Override
    public ArcByBulgeDocument createGmlArcByBulgeDocument() {
        return ArcByBulgeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ArcByBulgeType createGmlArcByBulgeType() {
        return ArcByBulgeType.Factory.newInstance();
    }

    @Provides
    @Override
    public ArcByCenterPointDocument createGmlArcByCenterPointDocument() {
        return ArcByCenterPointDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ArcByCenterPointType createGmlArcByCenterPointType() {
        return ArcByCenterPointType.Factory.newInstance();
    }

    @Provides
    @Override
    public ArcMinutesType createGmlArcMinutesType() {
        return ArcMinutesType.Factory.newInstance();
    }

    @Provides
    @Override
    public ArcSecondsType createGmlArcSecondsType() {
        return ArcSecondsType.Factory.newInstance();
    }

    @Provides
    @Override
    public ArcStringByBulgeDocument createGmlArcStringByBulgeDocument() {
        return ArcStringByBulgeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ArcStringByBulgeType createGmlArcStringByBulgeType() {
        return ArcStringByBulgeType.Factory.newInstance();
    }

    @Provides
    @Override
    public ArcStringDocument createGmlArcStringDocument() {
        return ArcStringDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ArcStringType createGmlArcStringType() {
        return ArcStringType.Factory.newInstance();
    }

    @Provides
    @Override
    public AreaType createGmlAreaType() {
        return AreaType.Factory.newInstance();
    }

    @Provides
    @Override
    public ArrayAssociationType createGmlArrayAssociationType() {
        return ArrayAssociationType.Factory.newInstance();
    }

    @Provides
    @Override
    public ArrayDocument createGmlArrayDocument() {
        return ArrayDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ArrayType createGmlArrayType() {
        return ArrayType.Factory.newInstance();
    }

    @Provides
    @Override
    public AssociationDocument createGmlAssociationDocument() {
        return AssociationDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public AssociationType createGmlAssociationType() {
        return AssociationType.Factory.newInstance();
    }

    @Provides
    @Override
    public AxisAbbrevDocument createGmlAxisAbbrevDocument() {
        return AxisAbbrevDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public AxisDirectionDocument createGmlAxisDirectionDocument() {
        return AxisDirectionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public AxisIDDocument createGmlAxisIDDocument() {
        return AxisIDDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public BagDocument createGmlBagDocument() {
        return BagDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public BagType createGmlBagType() {
        return BagType.Factory.newInstance();
    }

    @Provides
    @Override
    public BaseCRSDocument createGmlBaseCRSDocument() {
        return BaseCRSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public BaseCurveDocument createGmlBaseCurveDocument() {
        return BaseCurveDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public BaseStyleDescriptorType createGmlBaseStyleDescriptorType() {
        return BaseStyleDescriptorType.Factory.newInstance();
    }

    @Provides
    @Override
    public BaseSurfaceDocument createGmlBaseSurfaceDocument() {
        return BaseSurfaceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public BaseUnitDocument createGmlBaseUnitDocument() {
        return BaseUnitDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public BaseUnitType createGmlBaseUnitType() {
        return BaseUnitType.Factory.newInstance();
    }

    @Provides
    @Override
    public BezierDocument createGmlBezierDocument() {
        return BezierDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public BezierType createGmlBezierType() {
        return BezierType.Factory.newInstance();
    }

    @Provides
    @Override
    public BooleanDocument createGmlBooleanDocument() {
        return BooleanDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public BooleanList createGmlBooleanList() {
        return BooleanList.Factory.newInstance();
    }

    @Provides
    @Override
    public BooleanListDocument createGmlBooleanListDocument() {
        return BooleanListDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public BooleanOrNull createGmlBooleanOrNull() {
        return BooleanOrNull.Factory.newInstance();
    }

    @Provides
    @Override
    public BooleanOrNullList createGmlBooleanOrNullList() {
        return BooleanOrNullList.Factory.newInstance();
    }

    @Provides
    @Override
    public BooleanPropertyType createGmlBooleanPropertyType() {
        return BooleanPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public BooleanValueDocument createGmlBooleanValueDocument() {
        return BooleanValueDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public BoundedByDocument createGmlBoundedByDocument() {
        return BoundedByDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public BoundingBoxDocument createGmlBoundingBoxDocument() {
        return BoundingBoxDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public BoundingPolygonDocument createGmlBoundingPolygonDocument() {
        return BoundingPolygonDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public BoundingShapeType createGmlBoundingShapeType() {
        return BoundingShapeType.Factory.newInstance();
    }

    @Provides
    @Override
    public BSplineDocument createGmlBSplineDocument() {
        return BSplineDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public BSplineType createGmlBSplineType() {
        return BSplineType.Factory.newInstance();
    }

    @Provides
    @Override
    public CalDate createGmlCalDate() {
        return CalDate.Factory.newInstance();
    }

    @Provides
    @Override
    public CartesianCSDocument createGmlCartesianCSDocument() {
        return CartesianCSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CartesianCSRefDocument createGmlCartesianCSRefDocument() {
        return CartesianCSRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CartesianCSRefType createGmlCartesianCSRefType() {
        return CartesianCSRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public CartesianCSType createGmlCartesianCSType() {
        return CartesianCSType.Factory.newInstance();
    }

    @Provides
    @Override
    public CatalogSymbolDocument createGmlCatalogSymbolDocument() {
        return CatalogSymbolDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CategoryDocument createGmlCategoryDocument() {
        return CategoryDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CategoryExtentDocument createGmlCategoryExtentDocument() {
        return CategoryExtentDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CategoryExtentType createGmlCategoryExtentType() {
        return CategoryExtentType.Factory.newInstance();
    }

    @Provides
    @Override
    public CategoryListDocument createGmlCategoryListDocument() {
        return CategoryListDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CategoryPropertyType createGmlCategoryPropertyType() {
        return CategoryPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public CenterLineOfDocument createGmlCenterLineOfDocument() {
        return CenterLineOfDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CenterOfDocument createGmlCenterOfDocument() {
        return CenterOfDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CircleByCenterPointDocument createGmlCircleByCenterPointDocument() {
        return CircleByCenterPointDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CircleByCenterPointType createGmlCircleByCenterPointType() {
        return CircleByCenterPointType.Factory.newInstance();
    }

    @Provides
    @Override
    public CircleDocument createGmlCircleDocument() {
        return CircleDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CircleType createGmlCircleType() {
        return CircleType.Factory.newInstance();
    }

    @Provides
    @Override
    public ClothoidDocument createGmlClothoidDocument() {
        return ClothoidDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ClothoidType createGmlClothoidType() {
        return ClothoidType.Factory.newInstance();
    }

    @Provides
    @Override
    public CodeListType createGmlCodeListType() {
        return CodeListType.Factory.newInstance();
    }

    @Provides
    @Override
    public CodeOrNullListType createGmlCodeOrNullListType() {
        return CodeOrNullListType.Factory.newInstance();
    }

    @Provides
    @Override
    public CodeType createGmlCodeType() {
        return CodeType.Factory.newInstance();
    }

    @Provides
    @Override
    public ColumnIndexDocument createGmlColumnIndexDocument() {
        return ColumnIndexDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CompassPointDocument createGmlCompassPointDocument() {
        return CompassPointDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CompassPointEnumeration createGmlCompassPointEnumeration() {
        return CompassPointEnumeration.Factory.newInstance();
    }

    @Provides
    @Override
    public CompositeCurveDocument createGmlCompositeCurveDocument() {
        return CompositeCurveDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CompositeCurvePropertyType createGmlCompositeCurvePropertyType() {
        return CompositeCurvePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public CompositeCurveType createGmlCompositeCurveType() {
        return CompositeCurveType.Factory.newInstance();
    }

    @Provides
    @Override
    public CompositeSolidDocument createGmlCompositeSolidDocument() {
        return CompositeSolidDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CompositeSolidPropertyType createGmlCompositeSolidPropertyType() {
        return CompositeSolidPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public CompositeSolidType createGmlCompositeSolidType() {
        return CompositeSolidType.Factory.newInstance();
    }

    @Provides
    @Override
    public CompositeSurfaceDocument createGmlCompositeSurfaceDocument() {
        return CompositeSurfaceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CompositeSurfacePropertyType createGmlCompositeSurfacePropertyType() {
        return CompositeSurfacePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public CompositeSurfaceType createGmlCompositeSurfaceType() {
        return CompositeSurfaceType.Factory.newInstance();
    }

    @Provides
    @Override
    public CompositeValueDocument createGmlCompositeValueDocument() {
        return CompositeValueDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CompositeValueType createGmlCompositeValueType() {
        return CompositeValueType.Factory.newInstance();
    }

    @Provides
    @Override
    public CompoundCRSDocument createGmlCompoundCRSDocument() {
        return CompoundCRSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CompoundCRSRefDocument createGmlCompoundCRSRefDocument() {
        return CompoundCRSRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CompoundCRSRefType createGmlCompoundCRSRefType() {
        return CompoundCRSRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public CompoundCRSType createGmlCompoundCRSType() {
        return CompoundCRSType.Factory.newInstance();
    }

    @Provides
    @Override
    public ConcatenatedOperationDocument createGmlConcatenatedOperationDocument() {
        return ConcatenatedOperationDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ConcatenatedOperationRefDocument createGmlConcatenatedOperationRefDocument() {
        return ConcatenatedOperationRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ConcatenatedOperationRefType createGmlConcatenatedOperationRefType() {
        return ConcatenatedOperationRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public ConcatenatedOperationType createGmlConcatenatedOperationType() {
        return ConcatenatedOperationType.Factory.newInstance();
    }

    @Provides
    @Override
    public ConeDocument createGmlConeDocument() {
        return ConeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ConeType createGmlConeType() {
        return ConeType.Factory.newInstance();
    }

    @Provides
    @Override
    public ContainerDocument createGmlContainerDocument() {
        return ContainerDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ContainerPropertyType createGmlContainerPropertyType() {
        return ContainerPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public ContinuousCoverageDocument createGmlContinuousCoverageDocument() {
        return ContinuousCoverageDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ConventionalUnitDocument createGmlConventionalUnitDocument() {
        return ConventionalUnitDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ConventionalUnitType createGmlConventionalUnitType() {
        return ConventionalUnitType.Factory.newInstance();
    }

    @Provides
    @Override
    public ConversionDocument createGmlConversionDocument() {
        return ConversionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ConversionRefDocument createGmlConversionRefDocument() {
        return ConversionRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ConversionRefType createGmlConversionRefType() {
        return ConversionRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public ConversionToPreferredUnitDocument createGmlConversionToPreferredUnitDocument() {
        return ConversionToPreferredUnitDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ConversionToPreferredUnitType createGmlConversionToPreferredUnitType() {
        return ConversionToPreferredUnitType.Factory.newInstance();
    }

    @Provides
    @Override
    public ConversionType createGmlConversionType() {
        return ConversionType.Factory.newInstance();
    }

    @Provides
    @Override
    public CoordDocument createGmlCoordDocument() {
        return CoordDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CoordinateOperationDocument createGmlCoordinateOperationDocument() {
        return CoordinateOperationDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CoordinateOperationIDDocument createGmlCoordinateOperationIDDocument() {
        return CoordinateOperationIDDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CoordinateOperationNameDocument createGmlCoordinateOperationNameDocument() {
        return CoordinateOperationNameDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CoordinateOperationRefDocument createGmlCoordinateOperationRefDocument() {
        return CoordinateOperationRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CoordinateOperationRefType createGmlCoordinateOperationRefType() {
        return CoordinateOperationRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public CoordinateReferenceSystemDocument createGmlCoordinateReferenceSystemDocument() {
        return CoordinateReferenceSystemDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CoordinateReferenceSystemRefDocument createGmlCoordinateReferenceSystemRefDocument() {
        return CoordinateReferenceSystemRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CoordinateReferenceSystemRefType createGmlCoordinateReferenceSystemRefType() {
        return CoordinateReferenceSystemRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public CoordinatesDocument createGmlCoordinatesDocument() {
        return CoordinatesDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CoordinatesType createGmlCoordinatesType() {
        return CoordinatesType.Factory.newInstance();
    }

    @Provides
    @Override
    public CoordinateSystemAxisDocument createGmlCoordinateSystemAxisDocument() {
        return CoordinateSystemAxisDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CoordinateSystemAxisRefDocument createGmlCoordinateSystemAxisRefDocument() {
        return CoordinateSystemAxisRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CoordinateSystemAxisRefType createGmlCoordinateSystemAxisRefType() {
        return CoordinateSystemAxisRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public CoordinateSystemAxisType createGmlCoordinateSystemAxisType() {
        return CoordinateSystemAxisType.Factory.newInstance();
    }

    @Provides
    @Override
    public CoordinateSystemDocument createGmlCoordinateSystemDocument() {
        return CoordinateSystemDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CoordinateSystemRefDocument createGmlCoordinateSystemRefDocument() {
        return CoordinateSystemRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CoordinateSystemRefType createGmlCoordinateSystemRefType() {
        return CoordinateSystemRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public CoordType createGmlCoordType() {
        return CoordType.Factory.newInstance();
    }

    @Provides
    @Override
    public CountDocument createGmlCountDocument() {
        return CountDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CountExtentDocument createGmlCountExtentDocument() {
        return CountExtentDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CountExtentType createGmlCountExtentType() {
        return CountExtentType.Factory.newInstance();
    }

    @Provides
    @Override
    public CountListDocument createGmlCountListDocument() {
        return CountListDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CountPropertyType createGmlCountPropertyType() {
        return CountPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public CovarianceDocument createGmlCovarianceDocument() {
        return CovarianceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CovarianceElementType createGmlCovarianceElementType() {
        return CovarianceElementType.Factory.newInstance();
    }

    @Provides
    @Override
    public CovarianceMatrixDocument createGmlCovarianceMatrixDocument() {
        return CovarianceMatrixDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CovarianceMatrixType createGmlCovarianceMatrixType() {
        return CovarianceMatrixType.Factory.newInstance();
    }

    @Provides
    @Override
    public CoverageDocument createGmlCoverageDocument() {
        return CoverageDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CoverageFunctionDocument createGmlCoverageFunctionDocument() {
        return CoverageFunctionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CoverageFunctionType createGmlCoverageFunctionType() {
        return CoverageFunctionType.Factory.newInstance();
    }

    @Provides
    @Override
    public CRSDocument createGmlCRSDocument() {
        return CRSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CrsRefDocument createGmlCrsRefDocument() {
        return CrsRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CRSRefType createGmlCRSRefType() {
        return CRSRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public CsIDDocument createGmlCsIDDocument() {
        return CsIDDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CsNameDocument createGmlCsNameDocument() {
        return CsNameDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CubicSplineDocument createGmlCubicSplineDocument() {
        return CubicSplineDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CubicSplineType createGmlCubicSplineType() {
        return CubicSplineType.Factory.newInstance();
    }

    @Provides
    @Override
    public CurveArrayPropertyDocument createGmlCurveArrayPropertyDocument() {
        return CurveArrayPropertyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CurveArrayPropertyType createGmlCurveArrayPropertyType() {
        return CurveArrayPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public CurveDocument createGmlCurveDocument() {
        return CurveDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CurveInterpolationType createGmlCurveInterpolationType() {
        return CurveInterpolationType.Factory.newInstance();
    }

    @Provides
    @Override
    public CurveMemberDocument createGmlCurveMemberDocument() {
        return CurveMemberDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CurvePropertyDocument createGmlCurvePropertyDocument() {
        return CurvePropertyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CurvePropertyType createGmlCurvePropertyType() {
        return CurvePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public CurveSegmentArrayPropertyType createGmlCurveSegmentArrayPropertyType() {
        return CurveSegmentArrayPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public CurveSegmentDocument createGmlCurveSegmentDocument() {
        return CurveSegmentDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CurveType createGmlCurveType() {
        return CurveType.Factory.newInstance();
    }

    @Provides
    @Override
    public CylinderDocument createGmlCylinderDocument() {
        return CylinderDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CylinderType createGmlCylinderType() {
        return CylinderType.Factory.newInstance();
    }

    @Provides
    @Override
    public CylindricalCSDocument createGmlCylindricalCSDocument() {
        return CylindricalCSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CylindricalCSRefDocument createGmlCylindricalCSRefDocument() {
        return CylindricalCSRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CylindricalCSRefType createGmlCylindricalCSRefType() {
        return CylindricalCSRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public CylindricalCSType createGmlCylindricalCSType() {
        return CylindricalCSType.Factory.newInstance();
    }

    @Provides
    @Override
    public DataBlockDocument createGmlDataBlockDocument() {
        return DataBlockDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DataBlockType createGmlDataBlockType() {
        return DataBlockType.Factory.newInstance();
    }

    @Provides
    @Override
    public DataSourceDocument createGmlDataSourceDocument() {
        return DataSourceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DatumDocument createGmlDatumDocument() {
        return DatumDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DatumIDDocument createGmlDatumIDDocument() {
        return DatumIDDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DatumNameDocument createGmlDatumNameDocument() {
        return DatumNameDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DatumRefDocument createGmlDatumRefDocument() {
        return DatumRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DatumRefType createGmlDatumRefType() {
        return DatumRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public DecimalMinutesDocument createGmlDecimalMinutesDocument() {
        return DecimalMinutesDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DecimalMinutesType createGmlDecimalMinutesType() {
        return DecimalMinutesType.Factory.newInstance();
    }

    @Provides
    @Override
    public DefaultStyleDocument createGmlDefaultStyleDocument() {
        return DefaultStyleDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DefaultStylePropertyType createGmlDefaultStylePropertyType() {
        return DefaultStylePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public DefinedByConversionDocument createGmlDefinedByConversionDocument() {
        return DefinedByConversionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DefinitionCollectionDocument createGmlDefinitionCollectionDocument() {
        return DefinitionCollectionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DefinitionDocument createGmlDefinitionDocument() {
        return DefinitionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DefinitionMemberDocument createGmlDefinitionMemberDocument() {
        return DefinitionMemberDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DefinitionProxyDocument createGmlDefinitionProxyDocument() {
        return DefinitionProxyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DefinitionProxyType createGmlDefinitionProxyType() {
        return DefinitionProxyType.Factory.newInstance();
    }

    @Provides
    @Override
    public DefinitionRefDocument createGmlDefinitionRefDocument() {
        return DefinitionRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DefinitionType createGmlDefinitionType() {
        return DefinitionType.Factory.newInstance();
    }

    @Provides
    @Override
    public DegreesDocument createGmlDegreesDocument() {
        return DegreesDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DegreesType createGmlDegreesType() {
        return DegreesType.Factory.newInstance();
    }

    @Provides
    @Override
    public DegreeValueType createGmlDegreeValueType() {
        return DegreeValueType.Factory.newInstance();
    }

    @Provides
    @Override
    public DerivationUnitTermDocument createGmlDerivationUnitTermDocument() {
        return DerivationUnitTermDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DerivationUnitTermType createGmlDerivationUnitTermType() {
        return DerivationUnitTermType.Factory.newInstance();
    }

    @Provides
    @Override
    public DerivedCRSDocument createGmlDerivedCRSDocument() {
        return DerivedCRSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DerivedCRSRefDocument createGmlDerivedCRSRefDocument() {
        return DerivedCRSRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DerivedCRSRefType createGmlDerivedCRSRefType() {
        return DerivedCRSRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public DerivedCRSType createGmlDerivedCRSType() {
        return DerivedCRSType.Factory.newInstance();
    }

    @Provides
    @Override
    public DerivedCRSTypeDocument createGmlDerivedCRSTypeDocument() {
        return DerivedCRSTypeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DerivedCRSTypeType createGmlDerivedCRSTypeType() {
        return DerivedCRSTypeType.Factory.newInstance();
    }

    @Provides
    @Override
    public DerivedUnitDocument createGmlDerivedUnitDocument() {
        return DerivedUnitDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DerivedUnitType createGmlDerivedUnitType() {
        return DerivedUnitType.Factory.newInstance();
    }

    @Provides
    @Override
    public DescriptionDocument createGmlDescriptionDocument() {
        return DescriptionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DictionaryDocument createGmlDictionaryDocument() {
        return DictionaryDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DictionaryEntryDocument createGmlDictionaryEntryDocument() {
        return DictionaryEntryDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DictionaryEntryType createGmlDictionaryEntryType() {
        return DictionaryEntryType.Factory.newInstance();
    }

    @Provides
    @Override
    public DictionaryType createGmlDictionaryType() {
        return DictionaryType.Factory.newInstance();
    }

    @Provides
    @Override
    public DirectedEdgeDocument createGmlDirectedEdgeDocument() {
        return DirectedEdgeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DirectedEdgePropertyType createGmlDirectedEdgePropertyType() {
        return DirectedEdgePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public DirectedFaceDocument createGmlDirectedFaceDocument() {
        return DirectedFaceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DirectedFacePropertyType createGmlDirectedFacePropertyType() {
        return DirectedFacePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public DirectedNodeDocument createGmlDirectedNodeDocument() {
        return DirectedNodeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DirectedNodePropertyType createGmlDirectedNodePropertyType() {
        return DirectedNodePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public DirectedObservationAtDistanceDocument createGmlDirectedObservationAtDistanceDocument() {
        return DirectedObservationAtDistanceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DirectedObservationAtDistanceType createGmlDirectedObservationAtDistanceType() {
        return DirectedObservationAtDistanceType.Factory.newInstance();
    }

    @Provides
    @Override
    public DirectedObservationDocument createGmlDirectedObservationDocument() {
        return DirectedObservationDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DirectedObservationType createGmlDirectedObservationType() {
        return DirectedObservationType.Factory.newInstance();
    }

    @Provides
    @Override
    public DirectedTopoSolidDocument createGmlDirectedTopoSolidDocument() {
        return DirectedTopoSolidDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DirectedTopoSolidPropertyType createGmlDirectedTopoSolidPropertyType() {
        return DirectedTopoSolidPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public DirectionDocument createGmlDirectionDocument() {
        return DirectionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DirectionPropertyType createGmlDirectionPropertyType() {
        return DirectionPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public DirectionVectorDocument createGmlDirectionVectorDocument() {
        return DirectionVectorDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DirectionVectorType createGmlDirectionVectorType() {
        return DirectionVectorType.Factory.newInstance();
    }

    @Provides
    @Override
    public DirectPositionListType createGmlDirectPositionListType() {
        return DirectPositionListType.Factory.newInstance();
    }

    @Provides
    @Override
    public DirectPositionType createGmlDirectPositionType() {
        return DirectPositionType.Factory.newInstance();
    }

    @Provides
    @Override
    public DiscreteCoverageDocument createGmlDiscreteCoverageDocument() {
        return DiscreteCoverageDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DmsAngleDocument createGmlDmsAngleDocument() {
        return DmsAngleDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DMSAngleType createGmlDMSAngleType() {
        return DMSAngleType.Factory.newInstance();
    }

    @Provides
    @Override
    public DmsAngleValueDocument createGmlDmsAngleValueDocument() {
        return DmsAngleValueDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DomainSetDocument createGmlDomainSetDocument() {
        return DomainSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DomainSetType createGmlDomainSetType() {
        return DomainSetType.Factory.newInstance();
    }

    @Provides
    @Override
    public DoubleList createGmlDoubleList() {
        return DoubleList.Factory.newInstance();
    }

    @Provides
    @Override
    public DoubleOrNull createGmlDoubleOrNull() {
        return DoubleOrNull.Factory.newInstance();
    }

    @Provides
    @Override
    public DoubleOrNullList createGmlDoubleOrNullList() {
        return DoubleOrNullList.Factory.newInstance();
    }

    @Provides
    @Override
    public DoubleOrNullTupleListDocument createGmlDoubleOrNullTupleListDocument() {
        return DoubleOrNullTupleListDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DrawingTypeType createGmlDrawingTypeType() {
        return DrawingTypeType.Factory.newInstance();
    }

    @Provides
    @Override
    public DurationDocument createGmlDurationDocument() {
        return DurationDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DynamicFeatureCollectionType createGmlDynamicFeatureCollectionType() {
        return DynamicFeatureCollectionType.Factory.newInstance();
    }

    @Provides
    @Override
    public DynamicFeatureType createGmlDynamicFeatureType() {
        return DynamicFeatureType.Factory.newInstance();
    }

    @Provides
    @Override
    public EdgeDocument createGmlEdgeDocument() {
        return EdgeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public EdgeOfDocument createGmlEdgeOfDocument() {
        return EdgeOfDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public EdgeType createGmlEdgeType() {
        return EdgeType.Factory.newInstance();
    }

    @Provides
    @Override
    public EllipsoidalCSDocument createGmlEllipsoidalCSDocument() {
        return EllipsoidalCSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public EllipsoidalCSRefDocument createGmlEllipsoidalCSRefDocument() {
        return EllipsoidalCSRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public EllipsoidalCSRefType createGmlEllipsoidalCSRefType() {
        return EllipsoidalCSRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public EllipsoidalCSType createGmlEllipsoidalCSType() {
        return EllipsoidalCSType.Factory.newInstance();
    }

    @Provides
    @Override
    public EllipsoidDocument createGmlEllipsoidDocument() {
        return EllipsoidDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public EllipsoidIDDocument createGmlEllipsoidIDDocument() {
        return EllipsoidIDDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public EllipsoidNameDocument createGmlEllipsoidNameDocument() {
        return EllipsoidNameDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public EllipsoidRefDocument createGmlEllipsoidRefDocument() {
        return EllipsoidRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public EllipsoidRefType createGmlEllipsoidRefType() {
        return EllipsoidRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public EllipsoidType createGmlEllipsoidType() {
        return EllipsoidType.Factory.newInstance();
    }

    @Provides
    @Override
    public EngineeringCRSDocument createGmlEngineeringCRSDocument() {
        return EngineeringCRSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public EngineeringCRSRefDocument createGmlEngineeringCRSRefDocument() {
        return EngineeringCRSRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public EngineeringCRSRefType createGmlEngineeringCRSRefType() {
        return EngineeringCRSRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public EngineeringCRSType createGmlEngineeringCRSType() {
        return EngineeringCRSType.Factory.newInstance();
    }

    @Provides
    @Override
    public EngineeringDatumDocument createGmlEngineeringDatumDocument() {
        return EngineeringDatumDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public EngineeringDatumRefDocument createGmlEngineeringDatumRefDocument() {
        return EngineeringDatumRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public EngineeringDatumRefType createGmlEngineeringDatumRefType() {
        return EngineeringDatumRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public EngineeringDatumType createGmlEngineeringDatumType() {
        return EngineeringDatumType.Factory.newInstance();
    }

    @Provides
    @Override
    public EnvelopeDocument createGmlEnvelopeDocument() {
        return EnvelopeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public EnvelopeType createGmlEnvelopeType() {
        return EnvelopeType.Factory.newInstance();
    }

    @Provides
    @Override
    public EnvelopeWithTimePeriodDocument createGmlEnvelopeWithTimePeriodDocument() {
        return EnvelopeWithTimePeriodDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public EnvelopeWithTimePeriodType createGmlEnvelopeWithTimePeriodType() {
        return EnvelopeWithTimePeriodType.Factory.newInstance();
    }

    @Provides
    @Override
    public ExtentOfDocument createGmlExtentOfDocument() {
        return ExtentOfDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ExtentType createGmlExtentType() {
        return ExtentType.Factory.newInstance();
    }

    @Provides
    @Override
    public ExteriorDocument createGmlExteriorDocument() {
        return ExteriorDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public FaceDocument createGmlFaceDocument() {
        return FaceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public FaceType createGmlFaceType() {
        return FaceType.Factory.newInstance();
    }

    @Provides
    @Override
    public FeatureArrayPropertyType createGmlFeatureArrayPropertyType() {
        return FeatureArrayPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public FeatureCollectionDocument createGmlFeatureCollectionDocument() {
        return FeatureCollectionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public FeatureCollectionType createGmlFeatureCollectionType() {
        return FeatureCollectionType.Factory.newInstance();
    }

    @Provides
    @Override
    public FeatureDocument createGmlFeatureDocument() {
        return FeatureDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public FeatureMemberDocument createGmlFeatureMemberDocument() {
        return FeatureMemberDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public FeatureMembersDocument createGmlFeatureMembersDocument() {
        return FeatureMembersDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public FeaturePropertyDocument createGmlFeaturePropertyDocument() {
        return FeaturePropertyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public FeaturePropertyType createGmlFeaturePropertyType() {
        return FeaturePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public FeatureStyleDocument createGmlFeatureStyleDocument() {
        return FeatureStyleDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public FeatureStylePropertyType createGmlFeatureStylePropertyType() {
        return FeatureStylePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public FeatureStyleType createGmlFeatureStyleType() {
        return FeatureStyleType.Factory.newInstance();
    }

    @Provides
    @Override
    public FileDocument createGmlFileDocument() {
        return FileDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public FileType createGmlFileType() {
        return FileType.Factory.newInstance();
    }

    @Provides
    @Override
    public FileValueModelType createGmlFileValueModelType() {
        return FileValueModelType.Factory.newInstance();
    }

    @Provides
    @Override
    public FormulaType createGmlFormulaType() {
        return FormulaType.Factory.newInstance();
    }

    @Provides
    @Override
    public GeneralConversionDocument createGmlGeneralConversionDocument() {
        return GeneralConversionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GeneralConversionRefDocument createGmlGeneralConversionRefDocument() {
        return GeneralConversionRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GeneralConversionRefType createGmlGeneralConversionRefType() {
        return GeneralConversionRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public GeneralDerivedCRSDocument createGmlGeneralDerivedCRSDocument() {
        return GeneralDerivedCRSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GeneralOperationParameterDocument createGmlGeneralOperationParameterDocument() {
        return GeneralOperationParameterDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GeneralParameterValueDocument createGmlGeneralParameterValueDocument() {
        return GeneralParameterValueDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GeneralTransformationDocument createGmlGeneralTransformationDocument() {
        return GeneralTransformationDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GeneralTransformationRefDocument createGmlGeneralTransformationRefDocument() {
        return GeneralTransformationRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GeneralTransformationRefType createGmlGeneralTransformationRefType() {
        return GeneralTransformationRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public GenericMetaDataDocument createGmlGenericMetaDataDocument() {
        return GenericMetaDataDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GenericMetaDataType createGmlGenericMetaDataType() {
        return GenericMetaDataType.Factory.newInstance();
    }

    @Provides
    @Override
    public GeocentricCRSDocument createGmlGeocentricCRSDocument() {
        return GeocentricCRSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GeocentricCRSRefDocument createGmlGeocentricCRSRefDocument() {
        return GeocentricCRSRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GeocentricCRSRefType createGmlGeocentricCRSRefType() {
        return GeocentricCRSRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public GeocentricCRSType createGmlGeocentricCRSType() {
        return GeocentricCRSType.Factory.newInstance();
    }

    @Provides
    @Override
    public GeodesicDocument createGmlGeodesicDocument() {
        return GeodesicDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GeodesicStringDocument createGmlGeodesicStringDocument() {
        return GeodesicStringDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GeodesicStringType createGmlGeodesicStringType() {
        return GeodesicStringType.Factory.newInstance();
    }

    @Provides
    @Override
    public GeodesicType createGmlGeodesicType() {
        return GeodesicType.Factory.newInstance();
    }

    @Provides
    @Override
    public GeodeticDatumDocument createGmlGeodeticDatumDocument() {
        return GeodeticDatumDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GeodeticDatumRefDocument createGmlGeodeticDatumRefDocument() {
        return GeodeticDatumRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GeodeticDatumRefType createGmlGeodeticDatumRefType() {
        return GeodeticDatumRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public GeodeticDatumType createGmlGeodeticDatumType() {
        return GeodeticDatumType.Factory.newInstance();
    }

    @Provides
    @Override
    public GeographicCRSDocument createGmlGeographicCRSDocument() {
        return GeographicCRSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GeographicCRSRefDocument createGmlGeographicCRSRefDocument() {
        return GeographicCRSRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GeographicCRSRefType createGmlGeographicCRSRefType() {
        return GeographicCRSRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public GeographicCRSType createGmlGeographicCRSType() {
        return GeographicCRSType.Factory.newInstance();
    }

    @Provides
    @Override
    public GeometricAggregateDocument createGmlGeometricAggregateDocument() {
        return GeometricAggregateDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GeometricComplexDocument createGmlGeometricComplexDocument() {
        return GeometricComplexDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GeometricComplexPropertyType createGmlGeometricComplexPropertyType() {
        return GeometricComplexPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public GeometricComplexType createGmlGeometricComplexType() {
        return GeometricComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public GeometricPrimitiveDocument createGmlGeometricPrimitiveDocument() {
        return GeometricPrimitiveDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GeometricPrimitivePropertyType createGmlGeometricPrimitivePropertyType() {
        return GeometricPrimitivePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public GeometryArrayPropertyType createGmlGeometryArrayPropertyType() {
        return GeometryArrayPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public GeometryDocument createGmlGeometryDocument() {
        return GeometryDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GeometryMemberDocument createGmlGeometryMemberDocument() {
        return GeometryMemberDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GeometryMembersDocument createGmlGeometryMembersDocument() {
        return GeometryMembersDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GeometryPropertyType createGmlGeometryPropertyType() {
        return GeometryPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public GeometryStyleDocument createGmlGeometryStyleDocument() {
        return GeometryStyleDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GeometryStylePropertyType createGmlGeometryStylePropertyType() {
        return GeometryStylePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public GeometryStyleType createGmlGeometryStyleType() {
        return GeometryStyleType.Factory.newInstance();
    }

    @Provides
    @Override
    public GMLDocument createGmlGMLDocument() {
        return GMLDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GraphStyleDocument createGmlGraphStyleDocument() {
        return GraphStyleDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GraphStylePropertyType createGmlGraphStylePropertyType() {
        return GraphStylePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public GraphStyleType createGmlGraphStyleType() {
        return GraphStyleType.Factory.newInstance();
    }

    @Provides
    @Override
    public GraphTypeType createGmlGraphTypeType() {
        return GraphTypeType.Factory.newInstance();
    }

    @Provides
    @Override
    public GreenwichLongitudeDocument createGmlGreenwichLongitudeDocument() {
        return GreenwichLongitudeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GridCoverageDocument createGmlGridCoverageDocument() {
        return GridCoverageDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GridCoverageType createGmlGridCoverageType() {
        return GridCoverageType.Factory.newInstance();
    }

    @Provides
    @Override
    public GriddedSurfaceDocument createGmlGriddedSurfaceDocument() {
        return GriddedSurfaceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GridDocument createGmlGridDocument() {
        return GridDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GridDomainDocument createGmlGridDomainDocument() {
        return GridDomainDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GridDomainType createGmlGridDomainType() {
        return GridDomainType.Factory.newInstance();
    }

    @Provides
    @Override
    public GridEnvelopeType createGmlGridEnvelopeType() {
        return GridEnvelopeType.Factory.newInstance();
    }

    @Provides
    @Override
    public GridFunctionDocument createGmlGridFunctionDocument() {
        return GridFunctionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GridFunctionType createGmlGridFunctionType() {
        return GridFunctionType.Factory.newInstance();
    }

    @Provides
    @Override
    public GridLengthType createGmlGridLengthType() {
        return GridLengthType.Factory.newInstance();
    }

    @Provides
    @Override
    public GridLimitsType createGmlGridLimitsType() {
        return GridLimitsType.Factory.newInstance();
    }

    @Provides
    @Override
    public GridType createGmlGridType() {
        return GridType.Factory.newInstance();
    }

    @Provides
    @Override
    public GroupIDDocument createGmlGroupIDDocument() {
        return GroupIDDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GroupNameDocument createGmlGroupNameDocument() {
        return GroupNameDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public HistoryDocument createGmlHistoryDocument() {
        return HistoryDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public HistoryPropertyType createGmlHistoryPropertyType() {
        return HistoryPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public IdAttribute createGmlIdAttribute() {
        return IdAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public IdentifierType createGmlIdentifierType() {
        return IdentifierType.Factory.newInstance();
    }

    @Provides
    @Override
    public ImageCRSDocument createGmlImageCRSDocument() {
        return ImageCRSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ImageCRSRefDocument createGmlImageCRSRefDocument() {
        return ImageCRSRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ImageCRSRefType createGmlImageCRSRefType() {
        return ImageCRSRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public ImageCRSType createGmlImageCRSType() {
        return ImageCRSType.Factory.newInstance();
    }

    @Provides
    @Override
    public ImageDatumDocument createGmlImageDatumDocument() {
        return ImageDatumDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ImageDatumRefDocument createGmlImageDatumRefDocument() {
        return ImageDatumRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ImageDatumRefType createGmlImageDatumRefType() {
        return ImageDatumRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public ImageDatumType createGmlImageDatumType() {
        return ImageDatumType.Factory.newInstance();
    }

    @Provides
    @Override
    public ImplicitGeometryDocument createGmlImplicitGeometryDocument() {
        return ImplicitGeometryDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IncludesCRSDocument createGmlIncludesCRSDocument() {
        return IncludesCRSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IncludesElementDocument createGmlIncludesElementDocument() {
        return IncludesElementDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IncludesParameterDocument createGmlIncludesParameterDocument() {
        return IncludesParameterDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IncludesValueDocument createGmlIncludesValueDocument() {
        return IncludesValueDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IncrementOrder createGmlIncrementOrder() {
        return IncrementOrder.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexMapDocument createGmlIndexMapDocument() {
        return IndexMapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexMapType createGmlIndexMapType() {
        return IndexMapType.Factory.newInstance();
    }

    @Provides
    @Override
    public IndirectEntryDocument createGmlIndirectEntryDocument() {
        return IndirectEntryDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IndirectEntryType createGmlIndirectEntryType() {
        return IndirectEntryType.Factory.newInstance();
    }

    @Provides
    @Override
    public InnerBoundaryIsDocument createGmlInnerBoundaryIsDocument() {
        return InnerBoundaryIsDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IntegerList createGmlIntegerList() {
        return IntegerList.Factory.newInstance();
    }

    @Provides
    @Override
    public IntegerOrNull createGmlIntegerOrNull() {
        return IntegerOrNull.Factory.newInstance();
    }

    @Provides
    @Override
    public IntegerOrNullList createGmlIntegerOrNullList() {
        return IntegerOrNullList.Factory.newInstance();
    }

    @Provides
    @Override
    public IntegerValueDocument createGmlIntegerValueDocument() {
        return IntegerValueDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IntegerValueListDocument createGmlIntegerValueListDocument() {
        return IntegerValueListDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public InteriorDocument createGmlInteriorDocument() {
        return InteriorDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public InverseFlatteningDocument createGmlInverseFlatteningDocument() {
        return InverseFlatteningDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IsolatedDocument createGmlIsolatedDocument() {
        return IsolatedDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IsolatedPropertyType createGmlIsolatedPropertyType() {
        return IsolatedPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public IsSphereDocument createGmlIsSphereDocument() {
        return IsSphereDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public KnotPropertyType createGmlKnotPropertyType() {
        return KnotPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public KnotType createGmlKnotType() {
        return KnotType.Factory.newInstance();
    }

    @Provides
    @Override
    public KnotTypesType createGmlKnotTypesType() {
        return KnotTypesType.Factory.newInstance();
    }

    @Provides
    @Override
    public LabelStyleDocument createGmlLabelStyleDocument() {
        return LabelStyleDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LabelStylePropertyType createGmlLabelStylePropertyType() {
        return LabelStylePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public LabelStyleType createGmlLabelStyleType() {
        return LabelStyleType.Factory.newInstance();
    }

    @Provides
    @Override
    public LengthType createGmlLengthType() {
        return LengthType.Factory.newInstance();
    }

    @Provides
    @Override
    public LinearCSDocument createGmlLinearCSDocument() {
        return LinearCSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LinearCSRefDocument createGmlLinearCSRefDocument() {
        return LinearCSRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LinearCSRefType createGmlLinearCSRefType() {
        return LinearCSRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public LinearCSType createGmlLinearCSType() {
        return LinearCSType.Factory.newInstance();
    }

    @Provides
    @Override
    public LinearRingDocument createGmlLinearRingDocument() {
        return LinearRingDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LinearRingPropertyType createGmlLinearRingPropertyType() {
        return LinearRingPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public LinearRingType createGmlLinearRingType() {
        return LinearRingType.Factory.newInstance();
    }

    @Provides
    @Override
    public LineStringDocument createGmlLineStringDocument() {
        return LineStringDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LineStringMemberDocument createGmlLineStringMemberDocument() {
        return LineStringMemberDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LineStringPropertyDocument createGmlLineStringPropertyDocument() {
        return LineStringPropertyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LineStringPropertyType createGmlLineStringPropertyType() {
        return LineStringPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public LineStringSegmentArrayPropertyType createGmlLineStringSegmentArrayPropertyType() {
        return LineStringSegmentArrayPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public LineStringSegmentDocument createGmlLineStringSegmentDocument() {
        return LineStringSegmentDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LineStringSegmentType createGmlLineStringSegmentType() {
        return LineStringSegmentType.Factory.newInstance();
    }

    @Provides
    @Override
    public LineStringType createGmlLineStringType() {
        return LineStringType.Factory.newInstance();
    }

    @Provides
    @Override
    public LineTypeType createGmlLineTypeType() {
        return LineTypeType.Factory.newInstance();
    }

    @Provides
    @Override
    public LocationDocument createGmlLocationDocument() {
        return LocationDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LocationKeyWordDocument createGmlLocationKeyWordDocument() {
        return LocationKeyWordDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LocationPropertyType createGmlLocationPropertyType() {
        return LocationPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public LocationStringDocument createGmlLocationStringDocument() {
        return LocationStringDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MappingRuleDocument createGmlMappingRuleDocument() {
        return MappingRuleDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MaximalComplexDocument createGmlMaximalComplexDocument() {
        return MaximalComplexDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MaximumOccursDocument createGmlMaximumOccursDocument() {
        return MaximumOccursDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MeasureDescriptionDocument createGmlMeasureDescriptionDocument() {
        return MeasureDescriptionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MeasureDocument createGmlMeasureDocument() {
        return MeasureDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MeasureListType createGmlMeasureListType() {
        return MeasureListType.Factory.newInstance();
    }

    @Provides
    @Override
    public MeasureOrNullListType createGmlMeasureOrNullListType() {
        return MeasureOrNullListType.Factory.newInstance();
    }

    @Provides
    @Override
    public MeasureType createGmlMeasureType() {
        return MeasureType.Factory.newInstance();
    }

    @Provides
    @Override
    public MemberDocument createGmlMemberDocument() {
        return MemberDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MembersDocument createGmlMembersDocument() {
        return MembersDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MeridianIDDocument createGmlMeridianIDDocument() {
        return MeridianIDDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MeridianNameDocument createGmlMeridianNameDocument() {
        return MeridianNameDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MetaDataDocument createGmlMetaDataDocument() {
        return MetaDataDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MetaDataPropertyDocument createGmlMetaDataPropertyDocument() {
        return MetaDataPropertyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MetaDataPropertyType createGmlMetaDataPropertyType() {
        return MetaDataPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public MethodFormulaDocument createGmlMethodFormulaDocument() {
        return MethodFormulaDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MethodIDDocument createGmlMethodIDDocument() {
        return MethodIDDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MethodNameDocument createGmlMethodNameDocument() {
        return MethodNameDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MinimumOccursDocument createGmlMinimumOccursDocument() {
        return MinimumOccursDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MinutesDocument createGmlMinutesDocument() {
        return MinutesDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ModifiedCoordinateDocument createGmlModifiedCoordinateDocument() {
        return ModifiedCoordinateDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MovingObjectStatusDocument createGmlMovingObjectStatusDocument() {
        return MovingObjectStatusDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MovingObjectStatusType createGmlMovingObjectStatusType() {
        return MovingObjectStatusType.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiCenterLineOfDocument createGmlMultiCenterLineOfDocument() {
        return MultiCenterLineOfDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiCenterOfDocument createGmlMultiCenterOfDocument() {
        return MultiCenterOfDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiCoverageDocument createGmlMultiCoverageDocument() {
        return MultiCoverageDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiCurveCoverageDocument createGmlMultiCurveCoverageDocument() {
        return MultiCurveCoverageDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiCurveCoverageType createGmlMultiCurveCoverageType() {
        return MultiCurveCoverageType.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiCurveDocument createGmlMultiCurveDocument() {
        return MultiCurveDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiCurveDomainDocument createGmlMultiCurveDomainDocument() {
        return MultiCurveDomainDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiCurveDomainType createGmlMultiCurveDomainType() {
        return MultiCurveDomainType.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiCurvePropertyDocument createGmlMultiCurvePropertyDocument() {
        return MultiCurvePropertyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiCurvePropertyType createGmlMultiCurvePropertyType() {
        return MultiCurvePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiCurveType createGmlMultiCurveType() {
        return MultiCurveType.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiEdgeOfDocument createGmlMultiEdgeOfDocument() {
        return MultiEdgeOfDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiExtentOfDocument createGmlMultiExtentOfDocument() {
        return MultiExtentOfDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiGeometryDocument createGmlMultiGeometryDocument() {
        return MultiGeometryDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiGeometryPropertyDocument createGmlMultiGeometryPropertyDocument() {
        return MultiGeometryPropertyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiGeometryPropertyType createGmlMultiGeometryPropertyType() {
        return MultiGeometryPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiGeometryType createGmlMultiGeometryType() {
        return MultiGeometryType.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiLineStringDocument createGmlMultiLineStringDocument() {
        return MultiLineStringDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiLineStringPropertyType createGmlMultiLineStringPropertyType() {
        return MultiLineStringPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiLineStringType createGmlMultiLineStringType() {
        return MultiLineStringType.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiLocationDocument createGmlMultiLocationDocument() {
        return MultiLocationDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiPointCoverageDocument createGmlMultiPointCoverageDocument() {
        return MultiPointCoverageDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiPointCoverageType createGmlMultiPointCoverageType() {
        return MultiPointCoverageType.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiPointDocument createGmlMultiPointDocument() {
        return MultiPointDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiPointDomainDocument createGmlMultiPointDomainDocument() {
        return MultiPointDomainDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiPointDomainType createGmlMultiPointDomainType() {
        return MultiPointDomainType.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiPointPropertyDocument createGmlMultiPointPropertyDocument() {
        return MultiPointPropertyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiPointPropertyType createGmlMultiPointPropertyType() {
        return MultiPointPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiPointType createGmlMultiPointType() {
        return MultiPointType.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiPolygonDocument createGmlMultiPolygonDocument() {
        return MultiPolygonDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiPolygonPropertyType createGmlMultiPolygonPropertyType() {
        return MultiPolygonPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiPolygonType createGmlMultiPolygonType() {
        return MultiPolygonType.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiPositionDocument createGmlMultiPositionDocument() {
        return MultiPositionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiSolidCoverageDocument createGmlMultiSolidCoverageDocument() {
        return MultiSolidCoverageDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiSolidCoverageType createGmlMultiSolidCoverageType() {
        return MultiSolidCoverageType.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiSolidDocument createGmlMultiSolidDocument() {
        return MultiSolidDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiSolidDomainDocument createGmlMultiSolidDomainDocument() {
        return MultiSolidDomainDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiSolidDomainType createGmlMultiSolidDomainType() {
        return MultiSolidDomainType.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiSolidPropertyDocument createGmlMultiSolidPropertyDocument() {
        return MultiSolidPropertyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiSolidPropertyType createGmlMultiSolidPropertyType() {
        return MultiSolidPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiSolidType createGmlMultiSolidType() {
        return MultiSolidType.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiSurfaceCoverageDocument createGmlMultiSurfaceCoverageDocument() {
        return MultiSurfaceCoverageDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiSurfaceCoverageType createGmlMultiSurfaceCoverageType() {
        return MultiSurfaceCoverageType.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiSurfaceDocument createGmlMultiSurfaceDocument() {
        return MultiSurfaceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiSurfaceDomainDocument createGmlMultiSurfaceDomainDocument() {
        return MultiSurfaceDomainDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiSurfaceDomainType createGmlMultiSurfaceDomainType() {
        return MultiSurfaceDomainType.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiSurfacePropertyDocument createGmlMultiSurfacePropertyDocument() {
        return MultiSurfacePropertyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiSurfacePropertyType createGmlMultiSurfacePropertyType() {
        return MultiSurfacePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public MultiSurfaceType createGmlMultiSurfaceType() {
        return MultiSurfaceType.Factory.newInstance();
    }

    @Provides
    @Override
    public NameDocument createGmlNameDocument() {
        return NameDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public NameList createGmlNameList() {
        return NameList.Factory.newInstance();
    }

    @Provides
    @Override
    public NameOrNull createGmlNameOrNull() {
        return NameOrNull.Factory.newInstance();
    }

    @Provides
    @Override
    public NameOrNullList createGmlNameOrNullList() {
        return NameOrNullList.Factory.newInstance();
    }

    @Provides
    @Override
    public NCNameList createGmlNCNameList() {
        return NCNameList.Factory.newInstance();
    }

    @Provides
    @Override
    public NodeDocument createGmlNodeDocument() {
        return NodeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public NodeType createGmlNodeType() {
        return NodeType.Factory.newInstance();
    }

    @Provides
    @Override
    public NullDocument createGmlNullDocument() {
        return NullDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public NullEnumeration createGmlNullEnumeration() {
        return NullEnumeration.Factory.newInstance();
    }

    @Provides
    @Override
    public NullType createGmlNullType() {
        return NullType.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectDocument createGmlObjectDocument() {
        return ObjectDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ObliqueCartesianCSDocument createGmlObliqueCartesianCSDocument() {
        return ObliqueCartesianCSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ObliqueCartesianCSRefDocument createGmlObliqueCartesianCSRefDocument() {
        return ObliqueCartesianCSRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ObliqueCartesianCSRefType createGmlObliqueCartesianCSRefType() {
        return ObliqueCartesianCSRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public ObliqueCartesianCSType createGmlObliqueCartesianCSType() {
        return ObliqueCartesianCSType.Factory.newInstance();
    }

    @Provides
    @Override
    public ObservationDocument createGmlObservationDocument() {
        return ObservationDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ObservationType createGmlObservationType() {
        return ObservationType.Factory.newInstance();
    }

    @Provides
    @Override
    public OffsetCurveDocument createGmlOffsetCurveDocument() {
        return OffsetCurveDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public OffsetCurveType createGmlOffsetCurveType() {
        return OffsetCurveType.Factory.newInstance();
    }

    @Provides
    @Override
    public OperationDocument createGmlOperationDocument() {
        return OperationDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public OperationMethodDocument createGmlOperationMethodDocument() {
        return OperationMethodDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public OperationMethodRefDocument createGmlOperationMethodRefDocument() {
        return OperationMethodRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public OperationMethodRefType createGmlOperationMethodRefType() {
        return OperationMethodRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public OperationMethodType createGmlOperationMethodType() {
        return OperationMethodType.Factory.newInstance();
    }

    @Provides
    @Override
    public OperationParameterDocument createGmlOperationParameterDocument() {
        return OperationParameterDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public OperationParameterGroupDocument createGmlOperationParameterGroupDocument() {
        return OperationParameterGroupDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public OperationParameterGroupRefDocument createGmlOperationParameterGroupRefDocument() {
        return OperationParameterGroupRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public OperationParameterGroupRefType createGmlOperationParameterGroupRefType() {
        return OperationParameterGroupRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public OperationParameterGroupType createGmlOperationParameterGroupType() {
        return OperationParameterGroupType.Factory.newInstance();
    }

    @Provides
    @Override
    public OperationParameterRefDocument createGmlOperationParameterRefDocument() {
        return OperationParameterRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public OperationParameterRefType createGmlOperationParameterRefType() {
        return OperationParameterRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public OperationParameterType createGmlOperationParameterType() {
        return OperationParameterType.Factory.newInstance();
    }

    @Provides
    @Override
    public OperationRefDocument createGmlOperationRefDocument() {
        return OperationRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public OperationRefType createGmlOperationRefType() {
        return OperationRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public OperationVersionDocument createGmlOperationVersionDocument() {
        return OperationVersionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public OrientableCurveDocument createGmlOrientableCurveDocument() {
        return OrientableCurveDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public OrientableCurveType createGmlOrientableCurveType() {
        return OrientableCurveType.Factory.newInstance();
    }

    @Provides
    @Override
    public OrientableSurfaceDocument createGmlOrientableSurfaceDocument() {
        return OrientableSurfaceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public OrientableSurfaceType createGmlOrientableSurfaceType() {
        return OrientableSurfaceType.Factory.newInstance();
    }

    @Provides
    @Override
    public OriginDocument createGmlOriginDocument() {
        return OriginDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public OuterBoundaryIsDocument createGmlOuterBoundaryIsDocument() {
        return OuterBoundaryIsDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ParameterIDDocument createGmlParameterIDDocument() {
        return ParameterIDDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ParameterNameDocument createGmlParameterNameDocument() {
        return ParameterNameDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ParameterValueDocument createGmlParameterValueDocument() {
        return ParameterValueDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ParameterValueGroupDocument createGmlParameterValueGroupDocument() {
        return ParameterValueGroupDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ParameterValueGroupType createGmlParameterValueGroupType() {
        return ParameterValueGroupType.Factory.newInstance();
    }

    @Provides
    @Override
    public ParameterValueType createGmlParameterValueType() {
        return ParameterValueType.Factory.newInstance();
    }

    @Provides
    @Override
    public ParametricCurveSurfaceDocument createGmlParametricCurveSurfaceDocument() {
        return ParametricCurveSurfaceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PassThroughOperationDocument createGmlPassThroughOperationDocument() {
        return PassThroughOperationDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PassThroughOperationRefDocument createGmlPassThroughOperationRefDocument() {
        return PassThroughOperationRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PassThroughOperationRefType createGmlPassThroughOperationRefType() {
        return PassThroughOperationRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public PassThroughOperationType createGmlPassThroughOperationType() {
        return PassThroughOperationType.Factory.newInstance();
    }

    @Provides
    @Override
    public PatchesDocument createGmlPatchesDocument() {
        return PatchesDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PixelInCellDocument createGmlPixelInCellDocument() {
        return PixelInCellDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PixelInCellType createGmlPixelInCellType() {
        return PixelInCellType.Factory.newInstance();
    }

    @Provides
    @Override
    public PointArrayPropertyDocument createGmlPointArrayPropertyDocument() {
        return PointArrayPropertyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PointArrayPropertyType createGmlPointArrayPropertyType() {
        return PointArrayPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public PointDocument createGmlPointDocument() {
        return PointDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PointMemberDocument createGmlPointMemberDocument() {
        return PointMemberDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PointMembersDocument createGmlPointMembersDocument() {
        return PointMembersDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PointPropertyDocument createGmlPointPropertyDocument() {
        return PointPropertyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PointPropertyType createGmlPointPropertyType() {
        return PointPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public PointRepDocument createGmlPointRepDocument() {
        return PointRepDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PointType createGmlPointType() {
        return PointType.Factory.newInstance();
    }

    @Provides
    @Override
    public PolarCSDocument createGmlPolarCSDocument() {
        return PolarCSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PolarCSRefDocument createGmlPolarCSRefDocument() {
        return PolarCSRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PolarCSRefType createGmlPolarCSRefType() {
        return PolarCSRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public PolarCSType createGmlPolarCSType() {
        return PolarCSType.Factory.newInstance();
    }

    @Provides
    @Override
    public PolygonDocument createGmlPolygonDocument() {
        return PolygonDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PolygonMemberDocument createGmlPolygonMemberDocument() {
        return PolygonMemberDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PolygonPatchArrayPropertyType createGmlPolygonPatchArrayPropertyType() {
        return PolygonPatchArrayPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public PolygonPatchDocument createGmlPolygonPatchDocument() {
        return PolygonPatchDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PolygonPatchesDocument createGmlPolygonPatchesDocument() {
        return PolygonPatchesDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PolygonPatchType createGmlPolygonPatchType() {
        return PolygonPatchType.Factory.newInstance();
    }

    @Provides
    @Override
    public PolygonPropertyDocument createGmlPolygonPropertyDocument() {
        return PolygonPropertyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PolygonPropertyType createGmlPolygonPropertyType() {
        return PolygonPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public PolygonType createGmlPolygonType() {
        return PolygonType.Factory.newInstance();
    }

    @Provides
    @Override
    public PolyhedralSurfaceDocument createGmlPolyhedralSurfaceDocument() {
        return PolyhedralSurfaceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PolyhedralSurfaceType createGmlPolyhedralSurfaceType() {
        return PolyhedralSurfaceType.Factory.newInstance();
    }

    @Provides
    @Override
    public PosDocument createGmlPosDocument() {
        return PosDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PositionalAccuracyDocument createGmlPositionalAccuracyDocument() {
        return PositionalAccuracyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PositionDocument createGmlPositionDocument() {
        return PositionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PosListDocument createGmlPosListDocument() {
        return PosListDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PrimeMeridianDocument createGmlPrimeMeridianDocument() {
        return PrimeMeridianDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PrimeMeridianRefDocument createGmlPrimeMeridianRefDocument() {
        return PrimeMeridianRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PrimeMeridianRefType createGmlPrimeMeridianRefType() {
        return PrimeMeridianRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public PrimeMeridianType createGmlPrimeMeridianType() {
        return PrimeMeridianType.Factory.newInstance();
    }

    @Provides
    @Override
    public PriorityLocationDocument createGmlPriorityLocationDocument() {
        return PriorityLocationDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PriorityLocationPropertyType createGmlPriorityLocationPropertyType() {
        return PriorityLocationPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public ProjectedCRSDocument createGmlProjectedCRSDocument() {
        return ProjectedCRSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ProjectedCRSRefDocument createGmlProjectedCRSRefDocument() {
        return ProjectedCRSRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ProjectedCRSRefType createGmlProjectedCRSRefType() {
        return ProjectedCRSRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public ProjectedCRSType createGmlProjectedCRSType() {
        return ProjectedCRSType.Factory.newInstance();
    }

    @Provides
    @Override
    public QNameList createGmlQNameList() {
        return QNameList.Factory.newInstance();
    }

    @Provides
    @Override
    public QuantityDocument createGmlQuantityDocument() {
        return QuantityDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public QuantityExtentDocument createGmlQuantityExtentDocument() {
        return QuantityExtentDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public QuantityExtentType createGmlQuantityExtentType() {
        return QuantityExtentType.Factory.newInstance();
    }

    @Provides
    @Override
    public QuantityListDocument createGmlQuantityListDocument() {
        return QuantityListDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public QuantityPropertyType createGmlQuantityPropertyType() {
        return QuantityPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public QuantityTypeDocument createGmlQuantityTypeDocument() {
        return QuantityTypeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public QueryGrammarEnumeration createGmlQueryGrammarEnumeration() {
        return QueryGrammarEnumeration.Factory.newInstance();
    }

    @Provides
    @Override
    public RangeParametersDocument createGmlRangeParametersDocument() {
        return RangeParametersDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RangeParametersType createGmlRangeParametersType() {
        return RangeParametersType.Factory.newInstance();
    }

    @Provides
    @Override
    public RangeSetDocument createGmlRangeSetDocument() {
        return RangeSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RangeSetType createGmlRangeSetType() {
        return RangeSetType.Factory.newInstance();
    }

    @Provides
    @Override
    public RealizationEpochDocument createGmlRealizationEpochDocument() {
        return RealizationEpochDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RectangleDocument createGmlRectangleDocument() {
        return RectangleDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RectangleType createGmlRectangleType() {
        return RectangleType.Factory.newInstance();
    }

    @Provides
    @Override
    public RectifiedGridCoverageDocument createGmlRectifiedGridCoverageDocument() {
        return RectifiedGridCoverageDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RectifiedGridCoverageType createGmlRectifiedGridCoverageType() {
        return RectifiedGridCoverageType.Factory.newInstance();
    }

    @Provides
    @Override
    public RectifiedGridDocument createGmlRectifiedGridDocument() {
        return RectifiedGridDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RectifiedGridDomainDocument createGmlRectifiedGridDomainDocument() {
        return RectifiedGridDomainDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RectifiedGridDomainType createGmlRectifiedGridDomainType() {
        return RectifiedGridDomainType.Factory.newInstance();
    }

    @Provides
    @Override
    public RectifiedGridType createGmlRectifiedGridType() {
        return RectifiedGridType.Factory.newInstance();
    }

    @Provides
    @Override
    public ReferenceDocument createGmlReferenceDocument() {
        return ReferenceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ReferenceSystemDocument createGmlReferenceSystemDocument() {
        return ReferenceSystemDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ReferenceSystemRefDocument createGmlReferenceSystemRefDocument() {
        return ReferenceSystemRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ReferenceSystemRefType createGmlReferenceSystemRefType() {
        return ReferenceSystemRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public ReferenceType createGmlReferenceType() {
        return ReferenceType.Factory.newInstance();
    }

    @Provides
    @Override
    public RelatedTimeType createGmlRelatedTimeType() {
        return RelatedTimeType.Factory.newInstance();
    }

    @Provides
    @Override
    public RelativeInternalPositionalAccuracyDocument createGmlRelativeInternalPositionalAccuracyDocument() {
        return RelativeInternalPositionalAccuracyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RelativeInternalPositionalAccuracyType createGmlRelativeInternalPositionalAccuracyType() {
        return RelativeInternalPositionalAccuracyType.Factory.newInstance();
    }

    @Provides
    @Override
    public RemarksDocument createGmlRemarksDocument() {
        return RemarksDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RemoteSchemaAttribute createGmlRemoteSchemaAttribute() {
        return RemoteSchemaAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public ResultDocument createGmlResultDocument() {
        return ResultDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ResultOfDocument createGmlResultOfDocument() {
        return ResultOfDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RingDocument createGmlRingDocument() {
        return RingDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RingPropertyType createGmlRingPropertyType() {
        return RingPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public RingType createGmlRingType() {
        return RingType.Factory.newInstance();
    }

    @Provides
    @Override
    public RoughConversionToPreferredUnitDocument createGmlRoughConversionToPreferredUnitDocument() {
        return RoughConversionToPreferredUnitDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RowIndexDocument createGmlRowIndexDocument() {
        return RowIndexDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ScalarValuePropertyType createGmlScalarValuePropertyType() {
        return ScalarValuePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public ScaleType createGmlScaleType() {
        return ScaleType.Factory.newInstance();
    }

    @Provides
    @Override
    public ScopeDocument createGmlScopeDocument() {
        return ScopeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SecondDefiningParameterDocument createGmlSecondDefiningParameterDocument() {
        return SecondDefiningParameterDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SecondDefiningParameterType createGmlSecondDefiningParameterType() {
        return SecondDefiningParameterType.Factory.newInstance();
    }

    @Provides
    @Override
    public SecondsDocument createGmlSecondsDocument() {
        return SecondsDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SegmentsDocument createGmlSegmentsDocument() {
        return SegmentsDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SemiMajorAxisDocument createGmlSemiMajorAxisDocument() {
        return SemiMajorAxisDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SemiMinorAxisDocument createGmlSemiMinorAxisDocument() {
        return SemiMinorAxisDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SequenceRuleNames createGmlSequenceRuleNames() {
        return SequenceRuleNames.Factory.newInstance();
    }

    @Provides
    @Override
    public SequenceRuleType createGmlSequenceRuleType() {
        return SequenceRuleType.Factory.newInstance();
    }

    @Provides
    @Override
    public SignType createGmlSignType() {
        return SignType.Factory.newInstance();
    }

    @Provides
    @Override
    public SingleOperationDocument createGmlSingleOperationDocument() {
        return SingleOperationDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SingleOperationRefDocument createGmlSingleOperationRefDocument() {
        return SingleOperationRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SingleOperationRefType createGmlSingleOperationRefType() {
        return SingleOperationRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public SolidArrayPropertyDocument createGmlSolidArrayPropertyDocument() {
        return SolidArrayPropertyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SolidArrayPropertyType createGmlSolidArrayPropertyType() {
        return SolidArrayPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public SolidDocument createGmlSolidDocument() {
        return SolidDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SolidMemberDocument createGmlSolidMemberDocument() {
        return SolidMemberDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SolidMembersDocument createGmlSolidMembersDocument() {
        return SolidMembersDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SolidPropertyDocument createGmlSolidPropertyDocument() {
        return SolidPropertyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SolidPropertyType createGmlSolidPropertyType() {
        return SolidPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public SolidType createGmlSolidType() {
        return SolidType.Factory.newInstance();
    }

    @Provides
    @Override
    public SourceCRSDocument createGmlSourceCRSDocument() {
        return SourceCRSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SourceDimensionsDocument createGmlSourceDimensionsDocument() {
        return SourceDimensionsDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SpeedType createGmlSpeedType() {
        return SpeedType.Factory.newInstance();
    }

    @Provides
    @Override
    public SphereDocument createGmlSphereDocument() {
        return SphereDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SphereType createGmlSphereType() {
        return SphereType.Factory.newInstance();
    }

    @Provides
    @Override
    public SphericalCSDocument createGmlSphericalCSDocument() {
        return SphericalCSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SphericalCSRefDocument createGmlSphericalCSRefDocument() {
        return SphericalCSRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SphericalCSRefType createGmlSphericalCSRefType() {
        return SphericalCSRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public SphericalCSType createGmlSphericalCSType() {
        return SphericalCSType.Factory.newInstance();
    }

    @Provides
    @Override
    public SrsIDDocument createGmlSrsIDDocument() {
        return SrsIDDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SrsNameDocument createGmlSrsNameDocument() {
        return SrsNameDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public StatusDocument createGmlStatusDocument() {
        return StatusDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public StrictAssociationDocument createGmlStrictAssociationDocument() {
        return StrictAssociationDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public StringOrNull createGmlStringOrNull() {
        return StringOrNull.Factory.newInstance();
    }

    @Provides
    @Override
    public StringOrRefType createGmlStringOrRefType() {
        return StringOrRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public StringValueDocument createGmlStringValueDocument() {
        return StringValueDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public StyleDocument createGmlStyleDocument() {
        return StyleDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public StyleType createGmlStyleType() {
        return StyleType.Factory.newInstance();
    }

    @Provides
    @Override
    public StyleVariationType createGmlStyleVariationType() {
        return StyleVariationType.Factory.newInstance();
    }

    @Provides
    @Override
    public SubComplexDocument createGmlSubComplexDocument() {
        return SubComplexDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SubjectDocument createGmlSubjectDocument() {
        return SubjectDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SuccessionType createGmlSuccessionType() {
        return SuccessionType.Factory.newInstance();
    }

    @Provides
    @Override
    public SuperComplexDocument createGmlSuperComplexDocument() {
        return SuperComplexDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SurfaceArrayPropertyDocument createGmlSurfaceArrayPropertyDocument() {
        return SurfaceArrayPropertyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SurfaceArrayPropertyType createGmlSurfaceArrayPropertyType() {
        return SurfaceArrayPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public SurfaceDocument createGmlSurfaceDocument() {
        return SurfaceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SurfaceInterpolationType createGmlSurfaceInterpolationType() {
        return SurfaceInterpolationType.Factory.newInstance();
    }

    @Provides
    @Override
    public SurfaceMemberDocument createGmlSurfaceMemberDocument() {
        return SurfaceMemberDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SurfaceMembersDocument createGmlSurfaceMembersDocument() {
        return SurfaceMembersDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SurfacePatchArrayPropertyType createGmlSurfacePatchArrayPropertyType() {
        return SurfacePatchArrayPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public SurfacePatchDocument createGmlSurfacePatchDocument() {
        return SurfacePatchDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SurfacePropertyDocument createGmlSurfacePropertyDocument() {
        return SurfacePropertyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SurfacePropertyType createGmlSurfacePropertyType() {
        return SurfacePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public SurfaceType createGmlSurfaceType() {
        return SurfaceType.Factory.newInstance();
    }

    @Provides
    @Override
    public SymbolDocument createGmlSymbolDocument() {
        return SymbolDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SymbolType createGmlSymbolType() {
        return SymbolType.Factory.newInstance();
    }

    @Provides
    @Override
    public SymbolTypeEnumeration createGmlSymbolTypeEnumeration() {
        return SymbolTypeEnumeration.Factory.newInstance();
    }

    @Provides
    @Override
    public TargetCRSDocument createGmlTargetCRSDocument() {
        return TargetCRSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TargetDimensionsDocument createGmlTargetDimensionsDocument() {
        return TargetDimensionsDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TargetDocument createGmlTargetDocument() {
        return TargetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TargetPropertyType createGmlTargetPropertyType() {
        return TargetPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public TemporalCRSDocument createGmlTemporalCRSDocument() {
        return TemporalCRSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TemporalCRSRefDocument createGmlTemporalCRSRefDocument() {
        return TemporalCRSRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TemporalCRSRefType createGmlTemporalCRSRefType() {
        return TemporalCRSRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public TemporalCRSType createGmlTemporalCRSType() {
        return TemporalCRSType.Factory.newInstance();
    }

    @Provides
    @Override
    public TemporalCSDocument createGmlTemporalCSDocument() {
        return TemporalCSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TemporalCSRefDocument createGmlTemporalCSRefDocument() {
        return TemporalCSRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TemporalCSRefType createGmlTemporalCSRefType() {
        return TemporalCSRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public TemporalCSType createGmlTemporalCSType() {
        return TemporalCSType.Factory.newInstance();
    }

    @Provides
    @Override
    public TemporalDatumDocument createGmlTemporalDatumDocument() {
        return TemporalDatumDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TemporalDatumRefDocument createGmlTemporalDatumRefDocument() {
        return TemporalDatumRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TemporalDatumRefType createGmlTemporalDatumRefType() {
        return TemporalDatumRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public TemporalDatumType createGmlTemporalDatumType() {
        return TemporalDatumType.Factory.newInstance();
    }

    @Provides
    @Override
    public TemporalExtentDocument createGmlTemporalExtentDocument() {
        return TemporalExtentDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeCalendarDocument createGmlTimeCalendarDocument() {
        return TimeCalendarDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeCalendarEraDocument createGmlTimeCalendarEraDocument() {
        return TimeCalendarEraDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeCalendarEraPropertyType createGmlTimeCalendarEraPropertyType() {
        return TimeCalendarEraPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeCalendarEraType createGmlTimeCalendarEraType() {
        return TimeCalendarEraType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeCalendarPropertyType createGmlTimeCalendarPropertyType() {
        return TimeCalendarPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeCalendarType createGmlTimeCalendarType() {
        return TimeCalendarType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeClockDocument createGmlTimeClockDocument() {
        return TimeClockDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeClockPropertyType createGmlTimeClockPropertyType() {
        return TimeClockPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeClockType createGmlTimeClockType() {
        return TimeClockType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeComplexDocument createGmlTimeComplexDocument() {
        return TimeComplexDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeCoordinateSystemDocument createGmlTimeCoordinateSystemDocument() {
        return TimeCoordinateSystemDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeCoordinateSystemType createGmlTimeCoordinateSystemType() {
        return TimeCoordinateSystemType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeEdgeDocument createGmlTimeEdgeDocument() {
        return TimeEdgeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeEdgePropertyType createGmlTimeEdgePropertyType() {
        return TimeEdgePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeEdgeType createGmlTimeEdgeType() {
        return TimeEdgeType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeGeometricPrimitiveDocument createGmlTimeGeometricPrimitiveDocument() {
        return TimeGeometricPrimitiveDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeGeometricPrimitivePropertyType createGmlTimeGeometricPrimitivePropertyType() {
        return TimeGeometricPrimitivePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeIndeterminateValueType createGmlTimeIndeterminateValueType() {
        return TimeIndeterminateValueType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeInstantDocument createGmlTimeInstantDocument() {
        return TimeInstantDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeInstantPropertyType createGmlTimeInstantPropertyType() {
        return TimeInstantPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeInstantType createGmlTimeInstantType() {
        return TimeInstantType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeIntervalDocument createGmlTimeIntervalDocument() {
        return TimeIntervalDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeIntervalLengthType createGmlTimeIntervalLengthType() {
        return TimeIntervalLengthType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeNodeDocument createGmlTimeNodeDocument() {
        return TimeNodeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeNodePropertyType createGmlTimeNodePropertyType() {
        return TimeNodePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeNodeType createGmlTimeNodeType() {
        return TimeNodeType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeObjectDocument createGmlTimeObjectDocument() {
        return TimeObjectDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeOrdinalEraDocument createGmlTimeOrdinalEraDocument() {
        return TimeOrdinalEraDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeOrdinalEraPropertyType createGmlTimeOrdinalEraPropertyType() {
        return TimeOrdinalEraPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeOrdinalEraType createGmlTimeOrdinalEraType() {
        return TimeOrdinalEraType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeOrdinalReferenceSystemDocument createGmlTimeOrdinalReferenceSystemDocument() {
        return TimeOrdinalReferenceSystemDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeOrdinalReferenceSystemType createGmlTimeOrdinalReferenceSystemType() {
        return TimeOrdinalReferenceSystemType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimePeriodDocument createGmlTimePeriodDocument() {
        return TimePeriodDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TimePeriodPropertyType createGmlTimePeriodPropertyType() {
        return TimePeriodPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimePeriodType createGmlTimePeriodType() {
        return TimePeriodType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimePositionDocument createGmlTimePositionDocument() {
        return TimePositionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TimePositionType createGmlTimePositionType() {
        return TimePositionType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimePositionUnion createGmlTimePositionUnion() {
        return TimePositionUnion.Factory.newInstance();
    }

    @Provides
    @Override
    public TimePrimitiveDocument createGmlTimePrimitiveDocument() {
        return TimePrimitiveDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TimePrimitivePropertyType createGmlTimePrimitivePropertyType() {
        return TimePrimitivePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeReferenceSystemDocument createGmlTimeReferenceSystemDocument() {
        return TimeReferenceSystemDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeSliceDocument createGmlTimeSliceDocument() {
        return TimeSliceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeTopologyComplexDocument createGmlTimeTopologyComplexDocument() {
        return TimeTopologyComplexDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeTopologyComplexPropertyType createGmlTimeTopologyComplexPropertyType() {
        return TimeTopologyComplexPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeTopologyComplexType createGmlTimeTopologyComplexType() {
        return TimeTopologyComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeTopologyPrimitiveDocument createGmlTimeTopologyPrimitiveDocument() {
        return TimeTopologyPrimitiveDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeTopologyPrimitivePropertyType createGmlTimeTopologyPrimitivePropertyType() {
        return TimeTopologyPrimitivePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeType createGmlTimeType() {
        return TimeType.Factory.newInstance();
    }

    @Provides
    @Override
    public TimeUnitType createGmlTimeUnitType() {
        return TimeUnitType.Factory.newInstance();
    }

    @Provides
    @Override
    public TinDocument createGmlTinDocument() {
        return TinDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TinType createGmlTinType() {
        return TinType.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoComplexDocument createGmlTopoComplexDocument() {
        return TopoComplexDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoComplexMemberType createGmlTopoComplexMemberType() {
        return TopoComplexMemberType.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoComplexPropertyDocument createGmlTopoComplexPropertyDocument() {
        return TopoComplexPropertyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoComplexType createGmlTopoComplexType() {
        return TopoComplexType.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoCurveDocument createGmlTopoCurveDocument() {
        return TopoCurveDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoCurvePropertyDocument createGmlTopoCurvePropertyDocument() {
        return TopoCurvePropertyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoCurvePropertyType createGmlTopoCurvePropertyType() {
        return TopoCurvePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoCurveType createGmlTopoCurveType() {
        return TopoCurveType.Factory.newInstance();
    }

    @Provides
    @Override
    public TopologyDocument createGmlTopologyDocument() {
        return TopologyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TopologyStyleDocument createGmlTopologyStyleDocument() {
        return TopologyStyleDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TopologyStylePropertyType createGmlTopologyStylePropertyType() {
        return TopologyStylePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public TopologyStyleType createGmlTopologyStyleType() {
        return TopologyStyleType.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoPointDocument createGmlTopoPointDocument() {
        return TopoPointDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoPointPropertyDocument createGmlTopoPointPropertyDocument() {
        return TopoPointPropertyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoPointPropertyType createGmlTopoPointPropertyType() {
        return TopoPointPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoPointType createGmlTopoPointType() {
        return TopoPointType.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoPrimitiveArrayAssociationType createGmlTopoPrimitiveArrayAssociationType() {
        return TopoPrimitiveArrayAssociationType.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoPrimitiveDocument createGmlTopoPrimitiveDocument() {
        return TopoPrimitiveDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoPrimitiveMemberDocument createGmlTopoPrimitiveMemberDocument() {
        return TopoPrimitiveMemberDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoPrimitiveMembersDocument createGmlTopoPrimitiveMembersDocument() {
        return TopoPrimitiveMembersDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoPrimitiveMemberType createGmlTopoPrimitiveMemberType() {
        return TopoPrimitiveMemberType.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoSolidDocument createGmlTopoSolidDocument() {
        return TopoSolidDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoSolidType createGmlTopoSolidType() {
        return TopoSolidType.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoSurfaceDocument createGmlTopoSurfaceDocument() {
        return TopoSurfaceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoSurfacePropertyDocument createGmlTopoSurfacePropertyDocument() {
        return TopoSurfacePropertyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoSurfacePropertyType createGmlTopoSurfacePropertyType() {
        return TopoSurfacePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoSurfaceType createGmlTopoSurfaceType() {
        return TopoSurfaceType.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoVolumeDocument createGmlTopoVolumeDocument() {
        return TopoVolumeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoVolumePropertyDocument createGmlTopoVolumePropertyDocument() {
        return TopoVolumePropertyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoVolumePropertyType createGmlTopoVolumePropertyType() {
        return TopoVolumePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public TopoVolumeType createGmlTopoVolumeType() {
        return TopoVolumeType.Factory.newInstance();
    }

    @Provides
    @Override
    public TrackDocument createGmlTrackDocument() {
        return TrackDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TrackType createGmlTrackType() {
        return TrackType.Factory.newInstance();
    }

    @Provides
    @Override
    public TransformationDocument createGmlTransformationDocument() {
        return TransformationDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TransformationRefDocument createGmlTransformationRefDocument() {
        return TransformationRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TransformationRefType createGmlTransformationRefType() {
        return TransformationRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public TransformationType createGmlTransformationType() {
        return TransformationType.Factory.newInstance();
    }

    @Provides
    @Override
    public TransformAttribute createGmlTransformAttribute() {
        return TransformAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public TriangleDocument createGmlTriangleDocument() {
        return TriangleDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TrianglePatchArrayPropertyType createGmlTrianglePatchArrayPropertyType() {
        return TrianglePatchArrayPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public TrianglePatchesDocument createGmlTrianglePatchesDocument() {
        return TrianglePatchesDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TriangleType createGmlTriangleType() {
        return TriangleType.Factory.newInstance();
    }

    @Provides
    @Override
    public TriangulatedSurfaceDocument createGmlTriangulatedSurfaceDocument() {
        return TriangulatedSurfaceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TriangulatedSurfaceType createGmlTriangulatedSurfaceType() {
        return TriangulatedSurfaceType.Factory.newInstance();
    }

    @Provides
    @Override
    public TupleListDocument createGmlTupleListDocument() {
        return TupleListDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public UnitDefinitionDocument createGmlUnitDefinitionDocument() {
        return UnitDefinitionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public UnitDefinitionType createGmlUnitDefinitionType() {
        return UnitDefinitionType.Factory.newInstance();
    }

    @Provides
    @Override
    public UnitOfMeasureDocument createGmlUnitOfMeasureDocument() {
        return UnitOfMeasureDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public UnitOfMeasureType createGmlUnitOfMeasureType() {
        return UnitOfMeasureType.Factory.newInstance();
    }

    @Provides
    @Override
    public UomAttribute createGmlUomAttribute() {
        return UomAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public UserDefinedCSDocument createGmlUserDefinedCSDocument() {
        return UserDefinedCSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public UserDefinedCSRefDocument createGmlUserDefinedCSRefDocument() {
        return UserDefinedCSRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public UserDefinedCSRefType createGmlUserDefinedCSRefType() {
        return UserDefinedCSRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public UserDefinedCSType createGmlUserDefinedCSType() {
        return UserDefinedCSType.Factory.newInstance();
    }

    @Provides
    @Override
    public UsesAxisDocument createGmlUsesAxisDocument() {
        return UsesAxisDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public UsesCartesianCSDocument createGmlUsesCartesianCSDocument() {
        return UsesCartesianCSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public UsesCSDocument createGmlUsesCSDocument() {
        return UsesCSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public UsesEllipsoidalCSDocument createGmlUsesEllipsoidalCSDocument() {
        return UsesEllipsoidalCSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public UsesEllipsoidDocument createGmlUsesEllipsoidDocument() {
        return UsesEllipsoidDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public UsesEngineeringDatumDocument createGmlUsesEngineeringDatumDocument() {
        return UsesEngineeringDatumDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public UsesGeodeticDatumDocument createGmlUsesGeodeticDatumDocument() {
        return UsesGeodeticDatumDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public UsesImageDatumDocument createGmlUsesImageDatumDocument() {
        return UsesImageDatumDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public UsesMethodDocument createGmlUsesMethodDocument() {
        return UsesMethodDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public UsesObliqueCartesianCSDocument createGmlUsesObliqueCartesianCSDocument() {
        return UsesObliqueCartesianCSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public UsesOperationDocument createGmlUsesOperationDocument() {
        return UsesOperationDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public UsesParameterDocument createGmlUsesParameterDocument() {
        return UsesParameterDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public UsesPrimeMeridianDocument createGmlUsesPrimeMeridianDocument() {
        return UsesPrimeMeridianDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public UsesSingleOperationDocument createGmlUsesSingleOperationDocument() {
        return UsesSingleOperationDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public UsesSphericalCSDocument createGmlUsesSphericalCSDocument() {
        return UsesSphericalCSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public UsesTemporalCSDocument createGmlUsesTemporalCSDocument() {
        return UsesTemporalCSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public UsesTemporalDatumDocument createGmlUsesTemporalDatumDocument() {
        return UsesTemporalDatumDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public UsesValueDocument createGmlUsesValueDocument() {
        return UsesValueDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public UsesVerticalCSDocument createGmlUsesVerticalCSDocument() {
        return UsesVerticalCSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public UsesVerticalDatumDocument createGmlUsesVerticalDatumDocument() {
        return UsesVerticalDatumDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public UsingDocument createGmlUsingDocument() {
        return UsingDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ValidAreaDocument createGmlValidAreaDocument() {
        return ValidAreaDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ValidTimeDocument createGmlValidTimeDocument() {
        return ValidTimeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ValueArrayDocument createGmlValueArrayDocument() {
        return ValueArrayDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ValueArrayPropertyType createGmlValueArrayPropertyType() {
        return ValueArrayPropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public ValueArrayType createGmlValueArrayType() {
        return ValueArrayType.Factory.newInstance();
    }

    @Provides
    @Override
    public ValueComponentDocument createGmlValueComponentDocument() {
        return ValueComponentDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ValueComponentsDocument createGmlValueComponentsDocument() {
        return ValueComponentsDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ValueDocument createGmlValueDocument() {
        return ValueDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ValueFileDocument createGmlValueFileDocument() {
        return ValueFileDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ValueListDocument createGmlValueListDocument() {
        return ValueListDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ValueOfParameterDocument createGmlValueOfParameterDocument() {
        return ValueOfParameterDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ValuePropertyDocument createGmlValuePropertyDocument() {
        return ValuePropertyDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ValuePropertyType createGmlValuePropertyType() {
        return ValuePropertyType.Factory.newInstance();
    }

    @Provides
    @Override
    public ValuesOfGroupDocument createGmlValuesOfGroupDocument() {
        return ValuesOfGroupDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public VectorDocument createGmlVectorDocument() {
        return VectorDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public VectorType createGmlVectorType() {
        return VectorType.Factory.newInstance();
    }

    @Provides
    @Override
    public VersionDocument createGmlVersionDocument() {
        return VersionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public VerticalCRSDocument createGmlVerticalCRSDocument() {
        return VerticalCRSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public VerticalCRSRefDocument createGmlVerticalCRSRefDocument() {
        return VerticalCRSRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public VerticalCRSRefType createGmlVerticalCRSRefType() {
        return VerticalCRSRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public VerticalCRSType createGmlVerticalCRSType() {
        return VerticalCRSType.Factory.newInstance();
    }

    @Provides
    @Override
    public VerticalCSDocument createGmlVerticalCSDocument() {
        return VerticalCSDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public VerticalCSRefDocument createGmlVerticalCSRefDocument() {
        return VerticalCSRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public VerticalCSRefType createGmlVerticalCSRefType() {
        return VerticalCSRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public VerticalCSType createGmlVerticalCSType() {
        return VerticalCSType.Factory.newInstance();
    }

    @Provides
    @Override
    public VerticalDatumDocument createGmlVerticalDatumDocument() {
        return VerticalDatumDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public VerticalDatumRefDocument createGmlVerticalDatumRefDocument() {
        return VerticalDatumRefDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public VerticalDatumRefType createGmlVerticalDatumRefType() {
        return VerticalDatumRefType.Factory.newInstance();
    }

    @Provides
    @Override
    public VerticalDatumType createGmlVerticalDatumType() {
        return VerticalDatumType.Factory.newInstance();
    }

    @Provides
    @Override
    public VerticalDatumTypeDocument createGmlVerticalDatumTypeDocument() {
        return VerticalDatumTypeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public VerticalDatumTypeType createGmlVerticalDatumTypeType() {
        return VerticalDatumTypeType.Factory.newInstance();
    }

    @Provides
    @Override
    public VerticalExtentDocument createGmlVerticalExtentDocument() {
        return VerticalExtentDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public VolumeType createGmlVolumeType() {
        return VolumeType.Factory.newInstance();
    }

    @Provides
    @Override
    public ClassificationWrapDocument.ClassificationWrap createLidoClassificationWrap() {
        return ClassificationWrapDocument.ClassificationWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public ClassificationWrapDocument.ClassificationWrap.Classification createLidoClassification() {
        return ClassificationWrapDocument.ClassificationWrap.Classification.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayStateEditionWrapDocument.DisplayStateEditionWrap createLidoDisplayStateEditionWrap() {
        return DisplayStateEditionWrapDocument.DisplayStateEditionWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public EventWrapDocument.EventWrap createLidoEventWrap() {
        return EventWrapDocument.EventWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public EventWrapDocument.EventWrap.EventSet createLidoEvent() {
        return EventWrapDocument.EventWrap.EventSet.Factory.newInstance();
    }

    @Provides
    @Override
    public InscriptionsWrapDocument.InscriptionsWrap createLidoInscriptionsWrap() {
        return InscriptionsWrapDocument.InscriptionsWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public InscriptionsWrapDocument.InscriptionsWrap.Inscriptions createLidoInscriptions() {
        return InscriptionsWrapDocument.InscriptionsWrap.Inscriptions.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectClassificationWrapDocument.ObjectClassificationWrap createLidoObjectClassificationWrap() {
        return ObjectClassificationWrapDocument.ObjectClassificationWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectDescriptionWrapDocument.ObjectDescriptionWrap createLidoObjectDescriptionWrap() {
        return ObjectDescriptionWrapDocument.ObjectDescriptionWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectIdentificationWrapDocument.ObjectIdentificationWrap createLidoObjectIdentificationWrap() {
        return ObjectIdentificationWrapDocument.ObjectIdentificationWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap createLidoObjectMeasurementsWrap() {
        return ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet createLidoObjectMeasurements() {
        return ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet.Factory.newInstance();
    }

    @Provides
    @Override
    public LidoWrapDocument.LidoWrap createLidoLidoWrap() {
        return LidoWrapDocument.LidoWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public LidoWrapDocument.LidoWrap.Lido createLidoLido() {
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
        return ObjectRelationWrapDocument.ObjectRelationWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap createLidoObjectWorkTypeWrap() {
        return ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType createLidoObjectWorkType() {
        return ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordWrapDocument.RecordWrap createLidoRecordWrap() {
        return RecordWrapDocument.RecordWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public RelatedWorksWrapDocument.RelatedWorksWrap createLidoRelatedWorksWrap() {
        return RelatedWorksWrapDocument.RelatedWorksWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet createLidoRelatedWorks() {
        return RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet.Factory.newInstance();
    }

    @Provides
    @Override
    public RepositoryWrapDocument.RepositoryWrap createLidoRepositoryWrap() {
        return RepositoryWrapDocument.RepositoryWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceWrapDocument.ResourceWrap createLidoResourceWrap() {
        return ResourceWrapDocument.ResourceWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceWrapDocument.ResourceWrap.ResourceSet createLidoResource() {
        return ResourceWrapDocument.ResourceWrap.ResourceSet.Factory.newInstance();
    }

    @Provides
    @Override
    public RightsWorkWrapDocument.RightsWorkWrap createLidoRightsWorkWrap() {
        return RightsWorkWrapDocument.RightsWorkWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet createLidoRightsWork() {
        return RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet.Factory.newInstance();
    }

    @Provides
    @Override
    public SubjectWrapDocument.SubjectWrap createLidoSubjectWrap() {
        return SubjectWrapDocument.SubjectWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public SubjectWrapDocument.SubjectWrap.SubjectSet createLidoSubject() {
        return SubjectWrapDocument.SubjectWrap.SubjectSet.Factory.newInstance();
    }

    @Provides
    @Override
    public TitleWrapDocument.TitleWrap createLidoTitleWrap() {
        return TitleWrapDocument.TitleWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public TitleWrapDocument.TitleWrap.TitleSet createLidoTitle() {
        return TitleWrapDocument.TitleWrap.TitleSet.Factory.newInstance();
    }

    @Provides
    @Override
    public CurveMembersDocument createGmlCurveMembersDocument() {
        return CurveMembersDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public org.w3.x2001.smil20.language.AnimateColorDocument createSmilLanguageAnimateColorDocument() {
        return org.w3.x2001.smil20.language.AnimateColorDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public org.w3.x2001.smil20.language.AnimateDocument createSmilLanguageAnimateDocument() {
        return org.w3.x2001.smil20.language.AnimateDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public org.w3.x2001.smil20.language.AnimateMotionDocument createSmilLanguageAnimateMotionDocument() {
        return org.w3.x2001.smil20.language.AnimateMotionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public org.w3.x2001.smil20.language.SetDocument createSmilLanguageSetDocument() {
        return org.w3.x2001.smil20.language.SetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public org.w3.x1999.xlink.ArcDocument createXLinkArcDocument() {
        return org.w3.x1999.xlink.ArcDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public org.w3.x1999.xlink.ArcType createXLinkArcType() {
        return org.w3.x1999.xlink.ArcType.Factory.newInstance();
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
        return org.w3.x1999.xlink.TypeAttribute.Factory.newInstance();
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
