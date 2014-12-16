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

/**
 *
 * @author moosbusch
 */
public interface GmlModule extends Module {

    public TemporalDatumBaseType createGmlTemporalDatumBaseType();

    public PrimeMeridianBaseType createGmlPrimeMeridianBaseType();

    public OperationParameterGroupBaseType createGmlOperationParameterGroupBaseType();

    public OperationParameterBaseType createGmlOperationParameterBaseType();

    public BoundedFeatureType createGmlBoundedFeatureType();

    public CoordinateSystemAxisBaseType createGmlCoordinateSystemAxisBaseType();

    public OperationMethodBaseType createGmlOperationMethodBaseType();

    public EllipsoidBaseType createGmlEllipsoidBaseType();

    public AbsoluteExternalPositionalAccuracyDocument createGmlAbsoluteExternalPositionalAccuracyDocument();

    public AbsoluteExternalPositionalAccuracyType createGmlAbsoluteExternalPositionalAccuracyType();

    public AesheticCriteriaType createGmlAesheticCriteriaType();

    public AffinePlacementDocument createGmlAffinePlacementDocument();

    public AffinePlacementType createGmlAffinePlacementType();

    public AnchorPointDocument createGmlAnchorPointDocument();

    public AngleChoiceType createGmlAngleChoiceType();

    public AngleDocument createGmlAngleDocument();

    public AngleType createGmlAngleType();

    public ArcByBulgeDocument createGmlArcByBulgeDocument();

    public ArcByBulgeType createGmlArcByBulgeType();

    public ArcByCenterPointDocument createGmlArcByCenterPointDocument();

    public ArcByCenterPointType createGmlArcByCenterPointType();

    public ArcDocument createGmlArcDocument();

    public ArcMinutesType createGmlArcMinutesType();

    public ArcSecondsType createGmlArcSecondsType();

    public ArcStringByBulgeDocument createGmlArcStringByBulgeDocument();

    public ArcStringByBulgeType createGmlArcStringByBulgeType();

    public ArcStringDocument createGmlArcStringDocument();

    public ArcStringType createGmlArcStringType();

    public ArcType createGmlArcType();

    public AreaType createGmlAreaType();

    public ArrayAssociationType createGmlArrayAssociationType();

    public ArrayDocument createGmlArrayDocument();

    public ArrayType createGmlArrayType();

    public AssociationDocument createGmlAssociationDocument();

    public AssociationType createGmlAssociationType();

    public AxisAbbrevDocument createGmlAxisAbbrevDocument();

    public AxisDirectionDocument createGmlAxisDirectionDocument();

    public AxisIDDocument createGmlAxisIDDocument();

    public BagDocument createGmlBagDocument();

    public BagType createGmlBagType();

    public BaseCRSDocument createGmlBaseCRSDocument();

    public BaseCurveDocument createGmlBaseCurveDocument();

    public BaseStyleDescriptorType createGmlBaseStyleDescriptorType();

    public BaseSurfaceDocument createGmlBaseSurfaceDocument();

    public BaseUnitDocument createGmlBaseUnitDocument();

    public BaseUnitType createGmlBaseUnitType();

    public BezierDocument createGmlBezierDocument();

    public BezierType createGmlBezierType();

    public BooleanDocument createGmlBooleanDocument();

    public BooleanList createGmlBooleanList();

    public BooleanListDocument createGmlBooleanListDocument();

    public BooleanOrNull createGmlBooleanOrNull();

    public BooleanOrNullList createGmlBooleanOrNullList();

    public BooleanPropertyType createGmlBooleanPropertyType();

    public BooleanValueDocument createGmlBooleanValueDocument();

    public BoundedByDocument createGmlBoundedByDocument();

    public BoundingBoxDocument createGmlBoundingBoxDocument();

    public BoundingPolygonDocument createGmlBoundingPolygonDocument();

    public BoundingShapeType createGmlBoundingShapeType();

    public BSplineDocument createGmlBSplineDocument();

    public BSplineType createGmlBSplineType();

    public CalDate createGmlCalDate();

    public CartesianCSDocument createGmlCartesianCSDocument();

    public CartesianCSRefDocument createGmlCartesianCSRefDocument();

    public CartesianCSRefType createGmlCartesianCSRefType();

    public CartesianCSType createGmlCartesianCSType();

    public CatalogSymbolDocument createGmlCatalogSymbolDocument();

    public CategoryDocument createGmlCategoryDocument();

    public CategoryExtentDocument createGmlCategoryExtentDocument();

    public CategoryExtentType createGmlCategoryExtentType();

    public CategoryListDocument createGmlCategoryListDocument();

    public CategoryPropertyType createGmlCategoryPropertyType();

    public CenterLineOfDocument createGmlCenterLineOfDocument();

    public CenterOfDocument createGmlCenterOfDocument();

    public CircleByCenterPointDocument createGmlCircleByCenterPointDocument();

    public CircleByCenterPointType createGmlCircleByCenterPointType();

    public CircleDocument createGmlCircleDocument();

    public CircleType createGmlCircleType();

    public ClothoidDocument createGmlClothoidDocument();

    public ClothoidType createGmlClothoidType();

    public CodeListType createGmlCodeListType();

    public CodeOrNullListType createGmlCodeOrNullListType();

    public CodeType createGmlCodeType();

    public ColumnIndexDocument createGmlColumnIndexDocument();

    public CompassPointDocument createGmlCompassPointDocument();

    public CompassPointEnumeration createGmlCompassPointEnumeration();

    public CompositeCurveDocument createGmlCompositeCurveDocument();

    public CompositeCurvePropertyType createGmlCompositeCurvePropertyType();

    public CompositeCurveType createGmlCompositeCurveType();

    public CompositeSolidDocument createGmlCompositeSolidDocument();

    public CompositeSolidPropertyType createGmlCompositeSolidPropertyType();

    public CompositeSolidType createGmlCompositeSolidType();

    public CompositeSurfaceDocument createGmlCompositeSurfaceDocument();

    public CompositeSurfacePropertyType createGmlCompositeSurfacePropertyType();

    public CompositeSurfaceType createGmlCompositeSurfaceType();

    public CompositeValueDocument createGmlCompositeValueDocument();

    public CompositeValueType createGmlCompositeValueType();

    public CompoundCRSDocument createGmlCompoundCRSDocument();

    public CompoundCRSRefDocument createGmlCompoundCRSRefDocument();

    public CompoundCRSRefType createGmlCompoundCRSRefType();

    public CompoundCRSType createGmlCompoundCRSType();

    public ConcatenatedOperationDocument createGmlConcatenatedOperationDocument();

    public ConcatenatedOperationRefDocument createGmlConcatenatedOperationRefDocument();

    public ConcatenatedOperationRefType createGmlConcatenatedOperationRefType();

    public ConcatenatedOperationType createGmlConcatenatedOperationType();

    public ConeDocument createGmlConeDocument();

    public ConeType createGmlConeType();

    public ContainerDocument createGmlContainerDocument();

    public ContainerPropertyType createGmlContainerPropertyType();

    public ContinuousCoverageDocument createGmlContinuousCoverageDocument();

    public ConventionalUnitDocument createGmlConventionalUnitDocument();

    public ConventionalUnitType createGmlConventionalUnitType();

    public ConversionDocument createGmlConversionDocument();

    public ConversionRefDocument createGmlConversionRefDocument();

    public ConversionRefType createGmlConversionRefType();

    public ConversionToPreferredUnitDocument createGmlConversionToPreferredUnitDocument();

    public ConversionToPreferredUnitType createGmlConversionToPreferredUnitType();

    public ConversionType createGmlConversionType();

    public CoordDocument createGmlCoordDocument();

    public CoordinateOperationDocument createGmlCoordinateOperationDocument();

    public CoordinateOperationIDDocument createGmlCoordinateOperationIDDocument();

    public CoordinateOperationNameDocument createGmlCoordinateOperationNameDocument();

    public CoordinateOperationRefDocument createGmlCoordinateOperationRefDocument();

    public CoordinateOperationRefType createGmlCoordinateOperationRefType();

    public CoordinateReferenceSystemDocument createGmlCoordinateReferenceSystemDocument();

    public CoordinateReferenceSystemRefDocument createGmlCoordinateReferenceSystemRefDocument();

    public CoordinateReferenceSystemRefType createGmlCoordinateReferenceSystemRefType();

    public CoordinatesDocument createGmlCoordinatesDocument();

    public CoordinatesType createGmlCoordinatesType();

    public CoordinateSystemAxisDocument createGmlCoordinateSystemAxisDocument();

    public CoordinateSystemAxisRefDocument createGmlCoordinateSystemAxisRefDocument();

    public CoordinateSystemAxisRefType createGmlCoordinateSystemAxisRefType();

    public CoordinateSystemAxisType createGmlCoordinateSystemAxisType();

    public CoordinateSystemDocument createGmlCoordinateSystemDocument();

    public CoordinateSystemRefDocument createGmlCoordinateSystemRefDocument();

    public CoordinateSystemRefType createGmlCoordinateSystemRefType();

    public CoordType createGmlCoordType();

    public CountDocument createGmlCountDocument();

    public CountExtentDocument createGmlCountExtentDocument();

    public CountExtentType createGmlCountExtentType();

    public CountListDocument createGmlCountListDocument();

    public CountPropertyType createGmlCountPropertyType();

    public CovarianceDocument createGmlCovarianceDocument();

    public CovarianceElementType createGmlCovarianceElementType();

    public CovarianceMatrixDocument createGmlCovarianceMatrixDocument();

    public CovarianceMatrixType createGmlCovarianceMatrixType();

    public CoverageDocument createGmlCoverageDocument();

    public CoverageFunctionDocument createGmlCoverageFunctionDocument();

    public CoverageFunctionType createGmlCoverageFunctionType();

    public CRSDocument createGmlCRSDocument();

    public CrsRefDocument createGmlCrsRefDocument();

    public CRSRefType createGmlCRSRefType();

    public CsIDDocument createGmlCsIDDocument();

    public CsNameDocument createGmlCsNameDocument();

    public CubicSplineDocument createGmlCubicSplineDocument();

    public CubicSplineType createGmlCubicSplineType();

    public CurveArrayPropertyDocument createGmlCurveArrayPropertyDocument();

    public CurveArrayPropertyType createGmlCurveArrayPropertyType();

    public CurveDocument createGmlCurveDocument();

    public CurveInterpolationType createGmlCurveInterpolationType();

    public CurveMemberDocument createGmlCurveMemberDocument();

    public CurveMembersDocument createGmlCurveMembersDocument();

    public CurvePropertyDocument createGmlCurvePropertyDocument();

    public CurvePropertyType createGmlCurvePropertyType();

    public CurveSegmentArrayPropertyType createGmlCurveSegmentArrayPropertyType();

    public CurveSegmentDocument createGmlCurveSegmentDocument();

    public CurveType createGmlCurveType();

    public CylinderDocument createGmlCylinderDocument();

    public CylinderType createGmlCylinderType();

    public CylindricalCSDocument createGmlCylindricalCSDocument();

    public CylindricalCSRefDocument createGmlCylindricalCSRefDocument();

    public CylindricalCSRefType createGmlCylindricalCSRefType();

    public CylindricalCSType createGmlCylindricalCSType();

    public DataBlockDocument createGmlDataBlockDocument();

    public DataBlockType createGmlDataBlockType();

    public DataSourceDocument createGmlDataSourceDocument();

    public DatumDocument createGmlDatumDocument();

    public DatumIDDocument createGmlDatumIDDocument();

    public DatumNameDocument createGmlDatumNameDocument();

    public DatumRefDocument createGmlDatumRefDocument();

    public DatumRefType createGmlDatumRefType();

    public DecimalMinutesDocument createGmlDecimalMinutesDocument();

    public DecimalMinutesType createGmlDecimalMinutesType();

    public DefaultStyleDocument createGmlDefaultStyleDocument();

    public DefaultStylePropertyType createGmlDefaultStylePropertyType();

    public DefinedByConversionDocument createGmlDefinedByConversionDocument();

    public DefinitionCollectionDocument createGmlDefinitionCollectionDocument();

    public DefinitionDocument createGmlDefinitionDocument();

    public DefinitionMemberDocument createGmlDefinitionMemberDocument();

    public DefinitionProxyDocument createGmlDefinitionProxyDocument();

    public DefinitionProxyType createGmlDefinitionProxyType();

    public DefinitionRefDocument createGmlDefinitionRefDocument();

    public DefinitionType createGmlDefinitionType();

    public DegreesDocument createGmlDegreesDocument();

    public DegreesType createGmlDegreesType();

    public DegreeValueType createGmlDegreeValueType();

    public DerivationUnitTermDocument createGmlDerivationUnitTermDocument();

    public DerivationUnitTermType createGmlDerivationUnitTermType();

    public DerivedCRSDocument createGmlDerivedCRSDocument();

    public DerivedCRSRefDocument createGmlDerivedCRSRefDocument();

    public DerivedCRSRefType createGmlDerivedCRSRefType();

    public DerivedCRSType createGmlDerivedCRSType();

    public DerivedCRSTypeDocument createGmlDerivedCRSTypeDocument();

    public DerivedCRSTypeType createGmlDerivedCRSTypeType();

    public DerivedUnitDocument createGmlDerivedUnitDocument();

    public DerivedUnitType createGmlDerivedUnitType();

    public DescriptionDocument createGmlDescriptionDocument();

    public DictionaryDocument createGmlDictionaryDocument();

    public DictionaryEntryDocument createGmlDictionaryEntryDocument();

    public DictionaryEntryType createGmlDictionaryEntryType();

    public DictionaryType createGmlDictionaryType();

    public DirectedEdgeDocument createGmlDirectedEdgeDocument();

    public DirectedEdgePropertyType createGmlDirectedEdgePropertyType();

    public DirectedFaceDocument createGmlDirectedFaceDocument();

    public DirectedFacePropertyType createGmlDirectedFacePropertyType();

    public DirectedNodeDocument createGmlDirectedNodeDocument();

    public DirectedNodePropertyType createGmlDirectedNodePropertyType();

    public DirectedObservationAtDistanceDocument createGmlDirectedObservationAtDistanceDocument();

    public DirectedObservationAtDistanceType createGmlDirectedObservationAtDistanceType();

    public DirectedObservationDocument createGmlDirectedObservationDocument();

    public DirectedObservationType createGmlDirectedObservationType();

    public DirectedTopoSolidDocument createGmlDirectedTopoSolidDocument();

    public DirectedTopoSolidPropertyType createGmlDirectedTopoSolidPropertyType();

    public DirectionDocument createGmlDirectionDocument();

    public DirectionPropertyType createGmlDirectionPropertyType();

    public DirectionVectorDocument createGmlDirectionVectorDocument();

    public DirectionVectorType createGmlDirectionVectorType();

    public DirectPositionListType createGmlDirectPositionListType();

    public DirectPositionType createGmlDirectPositionType();

    public DiscreteCoverageDocument createGmlDiscreteCoverageDocument();

    public DmsAngleDocument createGmlDmsAngleDocument();

    public DMSAngleType createGmlDMSAngleType();

    public DmsAngleValueDocument createGmlDmsAngleValueDocument();

    public DomainSetDocument createGmlDomainSetDocument();

    public DomainSetType createGmlDomainSetType();

    public DoubleList createGmlDoubleList();

    public DoubleOrNull createGmlDoubleOrNull();

    public DoubleOrNullList createGmlDoubleOrNullList();

    public DoubleOrNullTupleListDocument createGmlDoubleOrNullTupleListDocument();

    public DrawingTypeType createGmlDrawingTypeType();

    public DurationDocument createGmlDurationDocument();

    public DynamicFeatureCollectionType createGmlDynamicFeatureCollectionType();

    public DynamicFeatureType createGmlDynamicFeatureType();

    public EdgeDocument createGmlEdgeDocument();

    public EdgeOfDocument createGmlEdgeOfDocument();

    public EdgeType createGmlEdgeType();

    public EllipsoidalCSDocument createGmlEllipsoidalCSDocument();

    public EllipsoidalCSRefDocument createGmlEllipsoidalCSRefDocument();

    public EllipsoidalCSRefType createGmlEllipsoidalCSRefType();

    public EllipsoidalCSType createGmlEllipsoidalCSType();

    public EllipsoidDocument createGmlEllipsoidDocument();

    public EllipsoidIDDocument createGmlEllipsoidIDDocument();

    public EllipsoidNameDocument createGmlEllipsoidNameDocument();

    public EllipsoidRefDocument createGmlEllipsoidRefDocument();

    public EllipsoidRefType createGmlEllipsoidRefType();

    public EllipsoidType createGmlEllipsoidType();

    public EngineeringCRSDocument createGmlEngineeringCRSDocument();

    public EngineeringCRSRefDocument createGmlEngineeringCRSRefDocument();

    public EngineeringCRSRefType createGmlEngineeringCRSRefType();

    public EngineeringCRSType createGmlEngineeringCRSType();

    public EngineeringDatumDocument createGmlEngineeringDatumDocument();

    public EngineeringDatumRefDocument createGmlEngineeringDatumRefDocument();

    public EngineeringDatumRefType createGmlEngineeringDatumRefType();

    public EngineeringDatumType createGmlEngineeringDatumType();

    public EnvelopeDocument createGmlEnvelopeDocument();

    public EnvelopeType createGmlEnvelopeType();

    public EnvelopeWithTimePeriodDocument createGmlEnvelopeWithTimePeriodDocument();

    public EnvelopeWithTimePeriodType createGmlEnvelopeWithTimePeriodType();

    public ExtentOfDocument createGmlExtentOfDocument();

    public ExtentType createGmlExtentType();

    public ExteriorDocument createGmlExteriorDocument();

    public FaceDocument createGmlFaceDocument();

    public FaceType createGmlFaceType();

    public FeatureArrayPropertyType createGmlFeatureArrayPropertyType();

    public FeatureCollectionDocument createGmlFeatureCollectionDocument();

    public FeatureCollectionType createGmlFeatureCollectionType();

    public FeatureDocument createGmlFeatureDocument();

    public FeatureMemberDocument createGmlFeatureMemberDocument();

    public FeatureMembersDocument createGmlFeatureMembersDocument();

    public FeaturePropertyDocument createGmlFeaturePropertyDocument();

    public FeaturePropertyType createGmlFeaturePropertyType();

    public FeatureStyleDocument createGmlFeatureStyleDocument();

    public FeatureStylePropertyType createGmlFeatureStylePropertyType();

    public FeatureStyleType createGmlFeatureStyleType();

    public FileDocument createGmlFileDocument();

    public FileType createGmlFileType();

    public FileValueModelType createGmlFileValueModelType();

    public FormulaType createGmlFormulaType();

    public GeneralConversionDocument createGmlGeneralConversionDocument();

    public GeneralConversionRefDocument createGmlGeneralConversionRefDocument();

    public GeneralConversionRefType createGmlGeneralConversionRefType();

    public GeneralDerivedCRSDocument createGmlGeneralDerivedCRSDocument();

    public GeneralOperationParameterDocument createGmlGeneralOperationParameterDocument();

    public GeneralParameterValueDocument createGmlGeneralParameterValueDocument();

    public GeneralTransformationDocument createGmlGeneralTransformationDocument();

    public GeneralTransformationRefDocument createGmlGeneralTransformationRefDocument();

    public GeneralTransformationRefType createGmlGeneralTransformationRefType();

    public GenericMetaDataDocument createGmlGenericMetaDataDocument();

    public GenericMetaDataType createGmlGenericMetaDataType();

    public GeocentricCRSDocument createGmlGeocentricCRSDocument();

    public GeocentricCRSRefDocument createGmlGeocentricCRSRefDocument();

    public GeocentricCRSRefType createGmlGeocentricCRSRefType();

    public GeocentricCRSType createGmlGeocentricCRSType();

    public GeodesicDocument createGmlGeodesicDocument();

    public GeodesicStringDocument createGmlGeodesicStringDocument();

    public GeodesicStringType createGmlGeodesicStringType();

    public GeodesicType createGmlGeodesicType();

    public GeodeticDatumDocument createGmlGeodeticDatumDocument();

    public GeodeticDatumRefDocument createGmlGeodeticDatumRefDocument();

    public GeodeticDatumRefType createGmlGeodeticDatumRefType();

    public GeodeticDatumType createGmlGeodeticDatumType();

    public GeographicCRSDocument createGmlGeographicCRSDocument();

    public GeographicCRSRefDocument createGmlGeographicCRSRefDocument();

    public GeographicCRSRefType createGmlGeographicCRSRefType();

    public GeographicCRSType createGmlGeographicCRSType();

    public GeometricAggregateDocument createGmlGeometricAggregateDocument();

    public GeometricComplexDocument createGmlGeometricComplexDocument();

    public GeometricComplexPropertyType createGmlGeometricComplexPropertyType();

    public GeometricComplexType createGmlGeometricComplexType();

    public GeometricPrimitiveDocument createGmlGeometricPrimitiveDocument();

    public GeometricPrimitivePropertyType createGmlGeometricPrimitivePropertyType();

    public GeometryArrayPropertyType createGmlGeometryArrayPropertyType();

    public GeometryDocument createGmlGeometryDocument();

    public GeometryMemberDocument createGmlGeometryMemberDocument();

    public GeometryMembersDocument createGmlGeometryMembersDocument();

    public GeometryPropertyType createGmlGeometryPropertyType();

    public GeometryStyleDocument createGmlGeometryStyleDocument();

    public GeometryStylePropertyType createGmlGeometryStylePropertyType();

    public GeometryStyleType createGmlGeometryStyleType();

    public GMLDocument createGmlGMLDocument();

    public GraphStyleDocument createGmlGraphStyleDocument();

    public GraphStylePropertyType createGmlGraphStylePropertyType();

    public GraphStyleType createGmlGraphStyleType();

    public GraphTypeType createGmlGraphTypeType();

    public GreenwichLongitudeDocument createGmlGreenwichLongitudeDocument();

    public GridCoverageDocument createGmlGridCoverageDocument();

    public GridCoverageType createGmlGridCoverageType();

    public GriddedSurfaceDocument createGmlGriddedSurfaceDocument();

    public GridDocument createGmlGridDocument();

    public GridDomainDocument createGmlGridDomainDocument();

    public GridDomainType createGmlGridDomainType();

    public GridEnvelopeType createGmlGridEnvelopeType();

    public GridFunctionDocument createGmlGridFunctionDocument();

    public GridFunctionType createGmlGridFunctionType();

    public GridLengthType createGmlGridLengthType();

    public GridLimitsType createGmlGridLimitsType();

    public GridType createGmlGridType();

    public GroupIDDocument createGmlGroupIDDocument();

    public GroupNameDocument createGmlGroupNameDocument();

    public HistoryDocument createGmlHistoryDocument();

    public HistoryPropertyType createGmlHistoryPropertyType();

    public IdAttribute createGmlIdAttribute();

    public IdentifierType createGmlIdentifierType();

    public ImageCRSDocument createGmlImageCRSDocument();

    public ImageCRSRefDocument createGmlImageCRSRefDocument();

    public ImageCRSRefType createGmlImageCRSRefType();

    public ImageCRSType createGmlImageCRSType();

    public ImageDatumDocument createGmlImageDatumDocument();

    public ImageDatumRefDocument createGmlImageDatumRefDocument();

    public ImageDatumRefType createGmlImageDatumRefType();

    public ImageDatumType createGmlImageDatumType();

    public ImplicitGeometryDocument createGmlImplicitGeometryDocument();

    public IncludesCRSDocument createGmlIncludesCRSDocument();

    public IncludesElementDocument createGmlIncludesElementDocument();

    public IncludesParameterDocument createGmlIncludesParameterDocument();

    public IncludesValueDocument createGmlIncludesValueDocument();

    public IncrementOrder createGmlIncrementOrder();

    public IndexMapDocument createGmlIndexMapDocument();

    public IndexMapType createGmlIndexMapType();

    public IndirectEntryDocument createGmlIndirectEntryDocument();

    public IndirectEntryType createGmlIndirectEntryType();

    public InnerBoundaryIsDocument createGmlInnerBoundaryIsDocument();

    public IntegerList createGmlIntegerList();

    public IntegerOrNull createGmlIntegerOrNull();

    public IntegerOrNullList createGmlIntegerOrNullList();

    public IntegerValueDocument createGmlIntegerValueDocument();

    public IntegerValueListDocument createGmlIntegerValueListDocument();

    public InteriorDocument createGmlInteriorDocument();

    public InverseFlatteningDocument createGmlInverseFlatteningDocument();

    public IsolatedDocument createGmlIsolatedDocument();

    public IsolatedPropertyType createGmlIsolatedPropertyType();

    public IsSphereDocument createGmlIsSphereDocument();

    public KnotPropertyType createGmlKnotPropertyType();

    public KnotType createGmlKnotType();

    public KnotTypesType createGmlKnotTypesType();

    public LabelStyleDocument createGmlLabelStyleDocument();

    public LabelStylePropertyType createGmlLabelStylePropertyType();

    public LabelStyleType createGmlLabelStyleType();

    public LabelType createGmlLabelType();

    public LengthType createGmlLengthType();

    public LinearCSDocument createGmlLinearCSDocument();

    public LinearCSRefDocument createGmlLinearCSRefDocument();

    public LinearCSRefType createGmlLinearCSRefType();

    public LinearCSType createGmlLinearCSType();

    public LinearRingDocument createGmlLinearRingDocument();

    public LinearRingPropertyType createGmlLinearRingPropertyType();

    public LinearRingType createGmlLinearRingType();

    public LineStringDocument createGmlLineStringDocument();

    public LineStringMemberDocument createGmlLineStringMemberDocument();

    public LineStringPropertyDocument createGmlLineStringPropertyDocument();

    public LineStringPropertyType createGmlLineStringPropertyType();

    public LineStringSegmentArrayPropertyType createGmlLineStringSegmentArrayPropertyType();

    public LineStringSegmentDocument createGmlLineStringSegmentDocument();

    public LineStringSegmentType createGmlLineStringSegmentType();

    public LineStringType createGmlLineStringType();

    public LineTypeType createGmlLineTypeType();

    public LocationDocument createGmlLocationDocument();

    public LocationKeyWordDocument createGmlLocationKeyWordDocument();

    public LocationPropertyType createGmlLocationPropertyType();

    public LocationStringDocument createGmlLocationStringDocument();

    public MappingRuleDocument createGmlMappingRuleDocument();

    public MaximalComplexDocument createGmlMaximalComplexDocument();

    public MaximumOccursDocument createGmlMaximumOccursDocument();

    public MeasureDescriptionDocument createGmlMeasureDescriptionDocument();

    public MeasureDocument createGmlMeasureDocument();

    public MeasureListType createGmlMeasureListType();

    public MeasureOrNullListType createGmlMeasureOrNullListType();

    public MeasureType createGmlMeasureType();

    public MemberDocument createGmlMemberDocument();

    public MembersDocument createGmlMembersDocument();

    public MeridianIDDocument createGmlMeridianIDDocument();

    public MeridianNameDocument createGmlMeridianNameDocument();

    public MetaDataDocument createGmlMetaDataDocument();

    public MetaDataPropertyDocument createGmlMetaDataPropertyDocument();

    public MetaDataPropertyType createGmlMetaDataPropertyType();

    public MethodFormulaDocument createGmlMethodFormulaDocument();

    public MethodIDDocument createGmlMethodIDDocument();

    public MethodNameDocument createGmlMethodNameDocument();

    public MinimumOccursDocument createGmlMinimumOccursDocument();

    public MinutesDocument createGmlMinutesDocument();

    public ModifiedCoordinateDocument createGmlModifiedCoordinateDocument();

    public MovingObjectStatusDocument createGmlMovingObjectStatusDocument();

    public MovingObjectStatusType createGmlMovingObjectStatusType();

    public MultiCenterLineOfDocument createGmlMultiCenterLineOfDocument();

    public MultiCenterOfDocument createGmlMultiCenterOfDocument();

    public MultiCoverageDocument createGmlMultiCoverageDocument();

    public MultiCurveCoverageDocument createGmlMultiCurveCoverageDocument();

    public MultiCurveCoverageType createGmlMultiCurveCoverageType();

    public MultiCurveDocument createGmlMultiCurveDocument();

    public MultiCurveDomainDocument createGmlMultiCurveDomainDocument();

    public MultiCurveDomainType createGmlMultiCurveDomainType();

    public MultiCurvePropertyDocument createGmlMultiCurvePropertyDocument();

    public MultiCurvePropertyType createGmlMultiCurvePropertyType();

    public MultiCurveType createGmlMultiCurveType();

    public MultiEdgeOfDocument createGmlMultiEdgeOfDocument();

    public MultiExtentOfDocument createGmlMultiExtentOfDocument();

    public MultiGeometryDocument createGmlMultiGeometryDocument();

    public MultiGeometryPropertyDocument createGmlMultiGeometryPropertyDocument();

    public MultiGeometryPropertyType createGmlMultiGeometryPropertyType();

    public MultiGeometryType createGmlMultiGeometryType();

    public MultiLineStringDocument createGmlMultiLineStringDocument();

    public MultiLineStringPropertyType createGmlMultiLineStringPropertyType();

    public MultiLineStringType createGmlMultiLineStringType();

    public MultiLocationDocument createGmlMultiLocationDocument();

    public MultiPointCoverageDocument createGmlMultiPointCoverageDocument();

    public MultiPointCoverageType createGmlMultiPointCoverageType();

    public MultiPointDocument createGmlMultiPointDocument();

    public MultiPointDomainDocument createGmlMultiPointDomainDocument();

    public MultiPointDomainType createGmlMultiPointDomainType();

    public MultiPointPropertyDocument createGmlMultiPointPropertyDocument();

    public MultiPointPropertyType createGmlMultiPointPropertyType();

    public MultiPointType createGmlMultiPointType();

    public MultiPolygonDocument createGmlMultiPolygonDocument();

    public MultiPolygonPropertyType createGmlMultiPolygonPropertyType();

    public MultiPolygonType createGmlMultiPolygonType();

    public MultiPositionDocument createGmlMultiPositionDocument();

    public MultiSolidCoverageDocument createGmlMultiSolidCoverageDocument();

    public MultiSolidCoverageType createGmlMultiSolidCoverageType();

    public MultiSolidDocument createGmlMultiSolidDocument();

    public MultiSolidDomainDocument createGmlMultiSolidDomainDocument();

    public MultiSolidDomainType createGmlMultiSolidDomainType();

    public MultiSolidPropertyDocument createGmlMultiSolidPropertyDocument();

    public MultiSolidPropertyType createGmlMultiSolidPropertyType();

    public MultiSolidType createGmlMultiSolidType();

    public MultiSurfaceCoverageDocument createGmlMultiSurfaceCoverageDocument();

    public MultiSurfaceCoverageType createGmlMultiSurfaceCoverageType();

    public MultiSurfaceDocument createGmlMultiSurfaceDocument();

    public MultiSurfaceDomainDocument createGmlMultiSurfaceDomainDocument();

    public MultiSurfaceDomainType createGmlMultiSurfaceDomainType();

    public MultiSurfacePropertyDocument createGmlMultiSurfacePropertyDocument();

    public MultiSurfacePropertyType createGmlMultiSurfacePropertyType();

    public MultiSurfaceType createGmlMultiSurfaceType();

    public NameDocument createGmlNameDocument();

    public NameList createGmlNameList();

    public NameOrNull createGmlNameOrNull();

    public NameOrNullList createGmlNameOrNullList();

    public NCNameList createGmlNCNameList();

    public NodeDocument createGmlNodeDocument();

    public NodeType createGmlNodeType();

    public NullDocument createGmlNullDocument();

    public NullEnumeration createGmlNullEnumeration();

    public NullType createGmlNullType();

    public ObjectDocument createGmlObjectDocument();

    public ObliqueCartesianCSDocument createGmlObliqueCartesianCSDocument();

    public ObliqueCartesianCSRefDocument createGmlObliqueCartesianCSRefDocument();

    public ObliqueCartesianCSRefType createGmlObliqueCartesianCSRefType();

    public ObliqueCartesianCSType createGmlObliqueCartesianCSType();

    public ObservationDocument createGmlObservationDocument();

    public ObservationType createGmlObservationType();

    public OffsetCurveDocument createGmlOffsetCurveDocument();

    public OffsetCurveType createGmlOffsetCurveType();

    public OperationDocument createGmlOperationDocument();

    public OperationMethodDocument createGmlOperationMethodDocument();

    public OperationMethodRefDocument createGmlOperationMethodRefDocument();

    public OperationMethodRefType createGmlOperationMethodRefType();

    public OperationMethodType createGmlOperationMethodType();

    public OperationParameterDocument createGmlOperationParameterDocument();

    public OperationParameterGroupDocument createGmlOperationParameterGroupDocument();

    public OperationParameterGroupRefDocument createGmlOperationParameterGroupRefDocument();

    public OperationParameterGroupRefType createGmlOperationParameterGroupRefType();

    public OperationParameterGroupType createGmlOperationParameterGroupType();

    public OperationParameterRefDocument createGmlOperationParameterRefDocument();

    public OperationParameterRefType createGmlOperationParameterRefType();

    public OperationParameterType createGmlOperationParameterType();

    public OperationRefDocument createGmlOperationRefDocument();

    public OperationRefType createGmlOperationRefType();

    public OperationVersionDocument createGmlOperationVersionDocument();

    public OrientableCurveDocument createGmlOrientableCurveDocument();

    public OrientableCurveType createGmlOrientableCurveType();

    public OrientableSurfaceDocument createGmlOrientableSurfaceDocument();

    public OrientableSurfaceType createGmlOrientableSurfaceType();

    public OriginDocument createGmlOriginDocument();

    public OuterBoundaryIsDocument createGmlOuterBoundaryIsDocument();

    public ParameterIDDocument createGmlParameterIDDocument();

    public ParameterNameDocument createGmlParameterNameDocument();

    public ParameterValueDocument createGmlParameterValueDocument();

    public ParameterValueGroupDocument createGmlParameterValueGroupDocument();

    public ParameterValueGroupType createGmlParameterValueGroupType();

    public ParameterValueType createGmlParameterValueType();

    public ParametricCurveSurfaceDocument createGmlParametricCurveSurfaceDocument();

    public PassThroughOperationDocument createGmlPassThroughOperationDocument();

    public PassThroughOperationRefDocument createGmlPassThroughOperationRefDocument();

    public PassThroughOperationRefType createGmlPassThroughOperationRefType();

    public PassThroughOperationType createGmlPassThroughOperationType();

    public PatchesDocument createGmlPatchesDocument();

    public PixelInCellDocument createGmlPixelInCellDocument();

    public PixelInCellType createGmlPixelInCellType();

    public PointArrayPropertyDocument createGmlPointArrayPropertyDocument();

    public PointArrayPropertyType createGmlPointArrayPropertyType();

    public PointDocument createGmlPointDocument();

    public PointMemberDocument createGmlPointMemberDocument();

    public PointMembersDocument createGmlPointMembersDocument();

    public PointPropertyDocument createGmlPointPropertyDocument();

    public PointPropertyType createGmlPointPropertyType();

    public PointRepDocument createGmlPointRepDocument();

    public PointType createGmlPointType();

    public PolarCSDocument createGmlPolarCSDocument();

    public PolarCSRefDocument createGmlPolarCSRefDocument();

    public PolarCSRefType createGmlPolarCSRefType();

    public PolarCSType createGmlPolarCSType();

    public PolygonDocument createGmlPolygonDocument();

    public PolygonMemberDocument createGmlPolygonMemberDocument();

    public PolygonPatchArrayPropertyType createGmlPolygonPatchArrayPropertyType();

    public PolygonPatchDocument createGmlPolygonPatchDocument();

    public PolygonPatchesDocument createGmlPolygonPatchesDocument();

    public PolygonPatchType createGmlPolygonPatchType();

    public PolygonPropertyDocument createGmlPolygonPropertyDocument();

    public PolygonPropertyType createGmlPolygonPropertyType();

    public PolygonType createGmlPolygonType();

    public PolyhedralSurfaceDocument createGmlPolyhedralSurfaceDocument();

    public PolyhedralSurfaceType createGmlPolyhedralSurfaceType();

    public PosDocument createGmlPosDocument();

    public PositionalAccuracyDocument createGmlPositionalAccuracyDocument();

    public PositionDocument createGmlPositionDocument();

    public PosListDocument createGmlPosListDocument();

    public PrimeMeridianDocument createGmlPrimeMeridianDocument();

    public PrimeMeridianRefDocument createGmlPrimeMeridianRefDocument();

    public PrimeMeridianRefType createGmlPrimeMeridianRefType();

    public PrimeMeridianType createGmlPrimeMeridianType();

    public PriorityLocationDocument createGmlPriorityLocationDocument();

    public PriorityLocationPropertyType createGmlPriorityLocationPropertyType();

    public ProjectedCRSDocument createGmlProjectedCRSDocument();

    public ProjectedCRSRefDocument createGmlProjectedCRSRefDocument();

    public ProjectedCRSRefType createGmlProjectedCRSRefType();

    public ProjectedCRSType createGmlProjectedCRSType();

    public QNameList createGmlQNameList();

    public QuantityDocument createGmlQuantityDocument();

    public QuantityExtentDocument createGmlQuantityExtentDocument();

    public QuantityExtentType createGmlQuantityExtentType();

    public QuantityListDocument createGmlQuantityListDocument();

    public QuantityPropertyType createGmlQuantityPropertyType();

    public QuantityTypeDocument createGmlQuantityTypeDocument();

    public QueryGrammarEnumeration createGmlQueryGrammarEnumeration();

    public RangeParametersDocument createGmlRangeParametersDocument();

    public RangeParametersType createGmlRangeParametersType();

    public RangeSetDocument createGmlRangeSetDocument();

    public RangeSetType createGmlRangeSetType();

    public RealizationEpochDocument createGmlRealizationEpochDocument();

    public RectangleDocument createGmlRectangleDocument();

    public RectangleType createGmlRectangleType();

    public RectifiedGridCoverageDocument createGmlRectifiedGridCoverageDocument();

    public RectifiedGridCoverageType createGmlRectifiedGridCoverageType();

    public RectifiedGridDocument createGmlRectifiedGridDocument();

    public RectifiedGridDomainDocument createGmlRectifiedGridDomainDocument();

    public RectifiedGridDomainType createGmlRectifiedGridDomainType();

    public RectifiedGridType createGmlRectifiedGridType();

    public ReferenceDocument createGmlReferenceDocument();

    public ReferenceSystemDocument createGmlReferenceSystemDocument();

    public ReferenceSystemRefDocument createGmlReferenceSystemRefDocument();

    public ReferenceSystemRefType createGmlReferenceSystemRefType();

    public ReferenceType createGmlReferenceType();

    public RelatedTimeType createGmlRelatedTimeType();

    public RelativeInternalPositionalAccuracyDocument createGmlRelativeInternalPositionalAccuracyDocument();

    public RelativeInternalPositionalAccuracyType createGmlRelativeInternalPositionalAccuracyType();

    public RemarksDocument createGmlRemarksDocument();

    public RemoteSchemaAttribute createGmlRemoteSchemaAttribute();

    public ResultDocument createGmlResultDocument();

    public ResultOfDocument createGmlResultOfDocument();

    public RingDocument createGmlRingDocument();

    public RingPropertyType createGmlRingPropertyType();

    public RingType createGmlRingType();

    public RoughConversionToPreferredUnitDocument createGmlRoughConversionToPreferredUnitDocument();

    public RowIndexDocument createGmlRowIndexDocument();

    public ScalarValuePropertyType createGmlScalarValuePropertyType();

    public ScaleType createGmlScaleType();

    public ScopeDocument createGmlScopeDocument();

    public SecondDefiningParameterDocument createGmlSecondDefiningParameterDocument();

    public SecondDefiningParameterType createGmlSecondDefiningParameterType();

    public SecondsDocument createGmlSecondsDocument();

    public SegmentsDocument createGmlSegmentsDocument();

    public SemiMajorAxisDocument createGmlSemiMajorAxisDocument();

    public SemiMinorAxisDocument createGmlSemiMinorAxisDocument();

    public SequenceRuleNames createGmlSequenceRuleNames();

    public SequenceRuleType createGmlSequenceRuleType();

    public SignType createGmlSignType();

    public SingleOperationDocument createGmlSingleOperationDocument();

    public SingleOperationRefDocument createGmlSingleOperationRefDocument();

    public SingleOperationRefType createGmlSingleOperationRefType();

    public SolidArrayPropertyDocument createGmlSolidArrayPropertyDocument();

    public SolidArrayPropertyType createGmlSolidArrayPropertyType();

    public SolidDocument createGmlSolidDocument();

    public SolidMemberDocument createGmlSolidMemberDocument();

    public SolidMembersDocument createGmlSolidMembersDocument();

    public SolidPropertyDocument createGmlSolidPropertyDocument();

    public SolidPropertyType createGmlSolidPropertyType();

    public SolidType createGmlSolidType();

    public SourceCRSDocument createGmlSourceCRSDocument();

    public SourceDimensionsDocument createGmlSourceDimensionsDocument();

    public SpeedType createGmlSpeedType();

    public SphereDocument createGmlSphereDocument();

    public SphereType createGmlSphereType();

    public SphericalCSDocument createGmlSphericalCSDocument();

    public SphericalCSRefDocument createGmlSphericalCSRefDocument();

    public SphericalCSRefType createGmlSphericalCSRefType();

    public SphericalCSType createGmlSphericalCSType();

    public SrsIDDocument createGmlSrsIDDocument();

    public SrsNameDocument createGmlSrsNameDocument();

    public StatusDocument createGmlStatusDocument();

    public StrictAssociationDocument createGmlStrictAssociationDocument();

    public StringOrNull createGmlStringOrNull();

    public StringOrRefType createGmlStringOrRefType();

    public StringValueDocument createGmlStringValueDocument();

    public StyleDocument createGmlStyleDocument();

    public StyleType createGmlStyleType();

    public StyleVariationType createGmlStyleVariationType();

    public SubComplexDocument createGmlSubComplexDocument();

    public SubjectDocument createGmlSubjectDocument();

    public SuccessionType createGmlSuccessionType();

    public SuperComplexDocument createGmlSuperComplexDocument();

    public SurfaceArrayPropertyDocument createGmlSurfaceArrayPropertyDocument();

    public SurfaceArrayPropertyType createGmlSurfaceArrayPropertyType();

    public SurfaceDocument createGmlSurfaceDocument();

    public SurfaceInterpolationType createGmlSurfaceInterpolationType();

    public SurfaceMemberDocument createGmlSurfaceMemberDocument();

    public SurfaceMembersDocument createGmlSurfaceMembersDocument();

    public SurfacePatchArrayPropertyType createGmlSurfacePatchArrayPropertyType();

    public SurfacePatchDocument createGmlSurfacePatchDocument();

    public SurfacePropertyDocument createGmlSurfacePropertyDocument();

    public SurfacePropertyType createGmlSurfacePropertyType();

    public SurfaceType createGmlSurfaceType();

    public SymbolDocument createGmlSymbolDocument();

    public SymbolType createGmlSymbolType();

    public SymbolTypeEnumeration createGmlSymbolTypeEnumeration();

    public TargetCRSDocument createGmlTargetCRSDocument();

    public TargetDimensionsDocument createGmlTargetDimensionsDocument();

    public TargetDocument createGmlTargetDocument();

    public TargetPropertyType createGmlTargetPropertyType();

    public TemporalCRSDocument createGmlTemporalCRSDocument();

    public TemporalCRSRefDocument createGmlTemporalCRSRefDocument();

    public TemporalCRSRefType createGmlTemporalCRSRefType();

    public TemporalCRSType createGmlTemporalCRSType();

    public TemporalCSDocument createGmlTemporalCSDocument();

    public TemporalCSRefDocument createGmlTemporalCSRefDocument();

    public TemporalCSRefType createGmlTemporalCSRefType();

    public TemporalCSType createGmlTemporalCSType();

    public TemporalDatumDocument createGmlTemporalDatumDocument();

    public TemporalDatumRefDocument createGmlTemporalDatumRefDocument();

    public TemporalDatumRefType createGmlTemporalDatumRefType();

    public TemporalDatumType createGmlTemporalDatumType();

    public TemporalExtentDocument createGmlTemporalExtentDocument();

    public TimeCalendarDocument createGmlTimeCalendarDocument();

    public TimeCalendarEraDocument createGmlTimeCalendarEraDocument();

    public TimeCalendarEraPropertyType createGmlTimeCalendarEraPropertyType();

    public TimeCalendarEraType createGmlTimeCalendarEraType();

    public TimeCalendarPropertyType createGmlTimeCalendarPropertyType();

    public TimeCalendarType createGmlTimeCalendarType();

    public TimeClockDocument createGmlTimeClockDocument();

    public TimeClockPropertyType createGmlTimeClockPropertyType();

    public TimeClockType createGmlTimeClockType();

    public TimeComplexDocument createGmlTimeComplexDocument();

    public TimeCoordinateSystemDocument createGmlTimeCoordinateSystemDocument();

    public TimeCoordinateSystemType createGmlTimeCoordinateSystemType();

    public TimeEdgeDocument createGmlTimeEdgeDocument();

    public TimeEdgePropertyType createGmlTimeEdgePropertyType();

    public TimeEdgeType createGmlTimeEdgeType();

    public TimeGeometricPrimitiveDocument createGmlTimeGeometricPrimitiveDocument();

    public TimeGeometricPrimitivePropertyType createGmlTimeGeometricPrimitivePropertyType();

    public TimeIndeterminateValueType createGmlTimeIndeterminateValueType();

    public TimeInstantDocument createGmlTimeInstantDocument();

    public TimeInstantPropertyType createGmlTimeInstantPropertyType();

    public TimeInstantType createGmlTimeInstantType();

    public TimeIntervalDocument createGmlTimeIntervalDocument();

    public TimeIntervalLengthType createGmlTimeIntervalLengthType();

    public TimeNodeDocument createGmlTimeNodeDocument();

    public TimeNodePropertyType createGmlTimeNodePropertyType();

    public TimeNodeType createGmlTimeNodeType();

    public TimeObjectDocument createGmlTimeObjectDocument();

    public TimeOrdinalEraDocument createGmlTimeOrdinalEraDocument();

    public TimeOrdinalEraPropertyType createGmlTimeOrdinalEraPropertyType();

    public TimeOrdinalEraType createGmlTimeOrdinalEraType();

    public TimeOrdinalReferenceSystemDocument createGmlTimeOrdinalReferenceSystemDocument();

    public TimeOrdinalReferenceSystemType createGmlTimeOrdinalReferenceSystemType();

    public TimePeriodDocument createGmlTimePeriodDocument();

    public TimePeriodPropertyType createGmlTimePeriodPropertyType();

    public TimePeriodType createGmlTimePeriodType();

    public TimePositionDocument createGmlTimePositionDocument();

    public TimePositionType createGmlTimePositionType();

    public TimePositionUnion createGmlTimePositionUnion();

    public TimePrimitiveDocument createGmlTimePrimitiveDocument();

    public TimePrimitivePropertyType createGmlTimePrimitivePropertyType();

    public TimeReferenceSystemDocument createGmlTimeReferenceSystemDocument();

    public TimeSliceDocument createGmlTimeSliceDocument();

    public TimeTopologyComplexDocument createGmlTimeTopologyComplexDocument();

    public TimeTopologyComplexPropertyType createGmlTimeTopologyComplexPropertyType();

    public TimeTopologyComplexType createGmlTimeTopologyComplexType();

    public TimeTopologyPrimitiveDocument createGmlTimeTopologyPrimitiveDocument();

    public TimeTopologyPrimitivePropertyType createGmlTimeTopologyPrimitivePropertyType();

    public TimeType createGmlTimeType();

    public TimeUnitType createGmlTimeUnitType();

    public TinDocument createGmlTinDocument();

    public TinType createGmlTinType();

    public TopoComplexDocument createGmlTopoComplexDocument();

    public TopoComplexMemberType createGmlTopoComplexMemberType();

    public TopoComplexPropertyDocument createGmlTopoComplexPropertyDocument();

    public TopoComplexType createGmlTopoComplexType();

    public TopoCurveDocument createGmlTopoCurveDocument();

    public TopoCurvePropertyDocument createGmlTopoCurvePropertyDocument();

    public TopoCurvePropertyType createGmlTopoCurvePropertyType();

    public TopoCurveType createGmlTopoCurveType();

    public TopologyDocument createGmlTopologyDocument();

    public TopologyStyleDocument createGmlTopologyStyleDocument();

    public TopologyStylePropertyType createGmlTopologyStylePropertyType();

    public TopologyStyleType createGmlTopologyStyleType();

    public TopoPointDocument createGmlTopoPointDocument();

    public TopoPointPropertyDocument createGmlTopoPointPropertyDocument();

    public TopoPointPropertyType createGmlTopoPointPropertyType();

    public TopoPointType createGmlTopoPointType();

    public TopoPrimitiveArrayAssociationType createGmlTopoPrimitiveArrayAssociationType();

    public TopoPrimitiveDocument createGmlTopoPrimitiveDocument();

    public TopoPrimitiveMemberDocument createGmlTopoPrimitiveMemberDocument();

    public TopoPrimitiveMembersDocument createGmlTopoPrimitiveMembersDocument();

    public TopoPrimitiveMemberType createGmlTopoPrimitiveMemberType();

    public TopoSolidDocument createGmlTopoSolidDocument();

    public TopoSolidType createGmlTopoSolidType();

    public TopoSurfaceDocument createGmlTopoSurfaceDocument();

    public TopoSurfacePropertyDocument createGmlTopoSurfacePropertyDocument();

    public TopoSurfacePropertyType createGmlTopoSurfacePropertyType();

    public TopoSurfaceType createGmlTopoSurfaceType();

    public TopoVolumeDocument createGmlTopoVolumeDocument();

    public TopoVolumePropertyDocument createGmlTopoVolumePropertyDocument();

    public TopoVolumePropertyType createGmlTopoVolumePropertyType();

    public TopoVolumeType createGmlTopoVolumeType();

    public TrackDocument createGmlTrackDocument();

    public TrackType createGmlTrackType();

    public TransformationDocument createGmlTransformationDocument();

    public TransformationRefDocument createGmlTransformationRefDocument();

    public TransformationRefType createGmlTransformationRefType();

    public TransformationType createGmlTransformationType();

    public TransformAttribute createGmlTransformAttribute();

    public TriangleDocument createGmlTriangleDocument();

    public TrianglePatchArrayPropertyType createGmlTrianglePatchArrayPropertyType();

    public TrianglePatchesDocument createGmlTrianglePatchesDocument();

    public TriangleType createGmlTriangleType();

    public TriangulatedSurfaceDocument createGmlTriangulatedSurfaceDocument();

    public TriangulatedSurfaceType createGmlTriangulatedSurfaceType();

    public TupleListDocument createGmlTupleListDocument();

    public UnitDefinitionDocument createGmlUnitDefinitionDocument();

    public UnitDefinitionType createGmlUnitDefinitionType();

    public UnitOfMeasureDocument createGmlUnitOfMeasureDocument();

    public UnitOfMeasureType createGmlUnitOfMeasureType();

    public UomAttribute createGmlUomAttribute();

    public UserDefinedCSDocument createGmlUserDefinedCSDocument();

    public UserDefinedCSRefDocument createGmlUserDefinedCSRefDocument();

    public UserDefinedCSRefType createGmlUserDefinedCSRefType();

    public UserDefinedCSType createGmlUserDefinedCSType();

    public UsesAxisDocument createGmlUsesAxisDocument();

    public UsesCartesianCSDocument createGmlUsesCartesianCSDocument();

    public UsesCSDocument createGmlUsesCSDocument();

    public UsesEllipsoidalCSDocument createGmlUsesEllipsoidalCSDocument();

    public UsesEllipsoidDocument createGmlUsesEllipsoidDocument();

    public UsesEngineeringDatumDocument createGmlUsesEngineeringDatumDocument();

    public UsesGeodeticDatumDocument createGmlUsesGeodeticDatumDocument();

    public UsesImageDatumDocument createGmlUsesImageDatumDocument();

    public UsesMethodDocument createGmlUsesMethodDocument();

    public UsesObliqueCartesianCSDocument createGmlUsesObliqueCartesianCSDocument();

    public UsesOperationDocument createGmlUsesOperationDocument();

    public UsesParameterDocument createGmlUsesParameterDocument();

    public UsesPrimeMeridianDocument createGmlUsesPrimeMeridianDocument();

    public UsesSingleOperationDocument createGmlUsesSingleOperationDocument();

    public UsesSphericalCSDocument createGmlUsesSphericalCSDocument();

    public UsesTemporalCSDocument createGmlUsesTemporalCSDocument();

    public UsesTemporalDatumDocument createGmlUsesTemporalDatumDocument();

    public UsesValueDocument createGmlUsesValueDocument();

    public UsesVerticalCSDocument createGmlUsesVerticalCSDocument();

    public UsesVerticalDatumDocument createGmlUsesVerticalDatumDocument();

    public UsingDocument createGmlUsingDocument();

    public ValidAreaDocument createGmlValidAreaDocument();

    public ValidTimeDocument createGmlValidTimeDocument();

    public ValueArrayDocument createGmlValueArrayDocument();

    public ValueArrayPropertyType createGmlValueArrayPropertyType();

    public ValueArrayType createGmlValueArrayType();

    public ValueComponentDocument createGmlValueComponentDocument();

    public ValueComponentsDocument createGmlValueComponentsDocument();

    public ValueDocument createGmlValueDocument();

    public ValueFileDocument createGmlValueFileDocument();

    public ValueListDocument createGmlValueListDocument();

    public ValueOfParameterDocument createGmlValueOfParameterDocument();

    public ValuePropertyDocument createGmlValuePropertyDocument();

    public ValuePropertyType createGmlValuePropertyType();

    public ValuesOfGroupDocument createGmlValuesOfGroupDocument();

    public VectorDocument createGmlVectorDocument();

    public VectorType createGmlVectorType();

    public VersionDocument createGmlVersionDocument();

    public VerticalCRSDocument createGmlVerticalCRSDocument();

    public VerticalCRSRefDocument createGmlVerticalCRSRefDocument();

    public VerticalCRSRefType createGmlVerticalCRSRefType();

    public VerticalCRSType createGmlVerticalCRSType();

    public VerticalCSDocument createGmlVerticalCSDocument();

    public VerticalCSRefDocument createGmlVerticalCSRefDocument();

    public VerticalCSRefType createGmlVerticalCSRefType();

    public VerticalCSType createGmlVerticalCSType();

    public VerticalDatumDocument createGmlVerticalDatumDocument();

    public VerticalDatumRefDocument createGmlVerticalDatumRefDocument();

    public VerticalDatumRefType createGmlVerticalDatumRefType();

    public VerticalDatumType createGmlVerticalDatumType();

    public VerticalDatumTypeDocument createGmlVerticalDatumTypeDocument();

    public VerticalDatumTypeType createGmlVerticalDatumTypeType();

    public VerticalExtentDocument createGmlVerticalExtentDocument();

    public VolumeType createGmlVolumeType();

    public AbstractGeneralOperationParameterRefDocument createGmlAbstractGeneralOperationParameterRefDocument();

    public AbstractGeneralOperationParameterRefType createGmlAbstractGeneralOperationParameterRefType();

    public AbstractGriddedSurfaceType createGmlAbstractGriddedSurfaceType();

    public AbstractParametricCurveSurfaceType createGmlAbstractParametricCurveSurfaceType();

    public AbstractRingPropertyType createGmlAbstractRingPropertyType();

    public AbstractSolidType createGmlAbstractSolidType();

    public AbstractSurfaceType createGmlAbstractSurfaceType();
}
