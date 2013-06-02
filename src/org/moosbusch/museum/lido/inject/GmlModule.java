/*
 * 
 *
 */
package org.moosbusch.museum.lido.inject;

import com.google.inject.Module;
import com.google.inject.Provides;
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

    @Provides
    public TemporalDatumBaseType createTemporalDatumBaseType();

    @Provides
    public PrimeMeridianBaseType createPrimeMeridianBaseType();

    @Provides
    public OperationParameterGroupBaseType createOperationParameterGroupBaseType();

    @Provides
    public OperationParameterBaseType createOperationParameterBaseType();

    @Provides
    public BoundedFeatureType createBoundedFeatureType();

    @Provides
    public CoordinateSystemAxisBaseType createCoordinateSystemAxisBaseType();

    @Provides
    public OperationMethodBaseType createOperationMethodBaseType();

    @Provides
    public EllipsoidBaseType createEllipsoidBaseType();

    @Provides
    public AbsoluteExternalPositionalAccuracyDocument createAbsoluteExternalPositionalAccuracyDocument();

    @Provides
    public AbsoluteExternalPositionalAccuracyType createAbsoluteExternalPositionalAccuracyType();

    @Provides
    public AesheticCriteriaType createAesheticCriteriaType();

    @Provides
    public AffinePlacementDocument createAffinePlacementDocument();

    @Provides
    public AffinePlacementType createAffinePlacementType();

    @Provides
    public AnchorPointDocument createAnchorPointDocument();

    @Provides
    public AngleChoiceType createAngleChoiceType();

    @Provides
    public AngleDocument createAngleDocument();

    @Provides
    public AngleType createAngleType();

    @Provides
    public ArcByBulgeDocument createArcByBulgeDocument();

    @Provides
    public ArcByBulgeType createArcByBulgeType();

    @Provides
    public ArcByCenterPointDocument createArcByCenterPointDocument();

    @Provides
    public ArcByCenterPointType createArcByCenterPointType();

    @Provides
    public ArcDocument createArcDocument();

    @Provides
    public ArcMinutesType createArcMinutesType();

    @Provides
    public ArcSecondsType createArcSecondsType();

    @Provides
    public ArcStringByBulgeDocument createArcStringByBulgeDocument();

    @Provides
    public ArcStringByBulgeType createArcStringByBulgeType();

    @Provides
    public ArcStringDocument createArcStringDocument();

    @Provides
    public ArcStringType createArcStringType();

    @Provides
    public ArcType createArcType();

    @Provides
    public AreaType createAreaType();

    @Provides
    public ArrayAssociationType createArrayAssociationType();

    @Provides
    public ArrayDocument createArrayDocument();

    @Provides
    public ArrayType createArrayType();

    @Provides
    public AssociationDocument createAssociationDocument();

    @Provides
    public AssociationType createAssociationType();

    @Provides
    public AxisAbbrevDocument createAxisAbbrevDocument();

    @Provides
    public AxisDirectionDocument createAxisDirectionDocument();

    @Provides
    public AxisIDDocument createAxisIDDocument();

    @Provides
    public BagDocument createBagDocument();

    @Provides
    public BagType createBagType();

    @Provides
    public BaseCRSDocument createBaseCRSDocument();

    @Provides
    public BaseCurveDocument createBaseCurveDocument();

    @Provides
    public BaseStyleDescriptorType createBaseStyleDescriptorType();

    @Provides
    public BaseSurfaceDocument createBaseSurfaceDocument();

    @Provides
    public BaseUnitDocument createBaseUnitDocument();

    @Provides
    public BaseUnitType createBaseUnitType();

    @Provides
    public BezierDocument createBezierDocument();

    @Provides
    public BezierType createBezierType();

    @Provides
    public BooleanDocument createBooleanDocument();

    @Provides
    public BooleanList createBooleanList();

    @Provides
    public BooleanListDocument createBooleanListDocument();

    @Provides
    public BooleanOrNull createBooleanOrNull();

    @Provides
    public BooleanOrNullList createBooleanOrNullList();

    @Provides
    public BooleanPropertyType createBooleanPropertyType();

    @Provides
    public BooleanValueDocument createBooleanValueDocument();

    @Provides
    public BoundedByDocument createBoundedByDocument();

    @Provides
    public BoundingBoxDocument createBoundingBoxDocument();

    @Provides
    public BoundingPolygonDocument createBoundingPolygonDocument();

    @Provides
    public BoundingShapeType createBoundingShapeType();

    @Provides
    public BSplineDocument createBSplineDocument();

    @Provides
    public BSplineType createBSplineType();

    @Provides
    public CalDate createCalDate();

    @Provides
    public CartesianCSDocument createCartesianCSDocument();

    @Provides
    public CartesianCSRefDocument createCartesianCSRefDocument();

    @Provides
    public CartesianCSRefType createCartesianCSRefType();

    @Provides
    public CartesianCSType createCartesianCSType();

    @Provides
    public CatalogSymbolDocument createCatalogSymbolDocument();

    @Provides
    public CategoryDocument createCategoryDocument();

    @Provides
    public CategoryExtentDocument createCategoryExtentDocument();

    @Provides
    public CategoryExtentType createCategoryExtentType();

    @Provides
    public CategoryListDocument createCategoryListDocument();

    @Provides
    public CategoryPropertyType createCategoryPropertyType();

    @Provides
    public CenterLineOfDocument createCenterLineOfDocument();

    @Provides
    public CenterOfDocument createCenterOfDocument();

    @Provides
    public CircleByCenterPointDocument createCircleByCenterPointDocument();

    @Provides
    public CircleByCenterPointType createCircleByCenterPointType();

    @Provides
    public CircleDocument createCircleDocument();

    @Provides
    public CircleType createCircleType();

    @Provides
    public ClothoidDocument createClothoidDocument();

    @Provides
    public ClothoidType createClothoidType();

    @Provides
    public CodeListType createCodeListType();

    @Provides
    public CodeOrNullListType createCodeOrNullListType();

    @Provides
    public CodeType createCodeType();

    @Provides
    public ColumnIndexDocument createColumnIndexDocument();

    @Provides
    public CompassPointDocument createCompassPointDocument();

    @Provides
    public CompassPointEnumeration createCompassPointEnumeration();

    @Provides
    public CompositeCurveDocument createCompositeCurveDocument();

    @Provides
    public CompositeCurvePropertyType createCompositeCurvePropertyType();

    @Provides
    public CompositeCurveType createCompositeCurveType();

    @Provides
    public CompositeSolidDocument createCompositeSolidDocument();

    @Provides
    public CompositeSolidPropertyType createCompositeSolidPropertyType();

    @Provides
    public CompositeSolidType createCompositeSolidType();

    @Provides
    public CompositeSurfaceDocument createCompositeSurfaceDocument();

    @Provides
    public CompositeSurfacePropertyType createCompositeSurfacePropertyType();

    @Provides
    public CompositeSurfaceType createCompositeSurfaceType();

    @Provides
    public CompositeValueDocument createCompositeValueDocument();

    @Provides
    public CompositeValueType createCompositeValueType();

    @Provides
    public CompoundCRSDocument createCompoundCRSDocument();

    @Provides
    public CompoundCRSRefDocument createCompoundCRSRefDocument();

    @Provides
    public CompoundCRSRefType createCompoundCRSRefType();

    @Provides
    public CompoundCRSType createCompoundCRSType();

    @Provides
    public ConcatenatedOperationDocument createConcatenatedOperationDocument();

    @Provides
    public ConcatenatedOperationRefDocument createConcatenatedOperationRefDocument();

    @Provides
    public ConcatenatedOperationRefType createConcatenatedOperationRefType();

    @Provides
    public ConcatenatedOperationType createConcatenatedOperationType();

    @Provides
    public ConeDocument createConeDocument();

    @Provides
    public ConeType createConeType();

    @Provides
    public ContainerDocument createContainerDocument();

    @Provides
    public ContainerPropertyType createContainerPropertyType();

    @Provides
    public ContinuousCoverageDocument createContinuousCoverageDocument();

    @Provides
    public ConventionalUnitDocument createConventionalUnitDocument();

    @Provides
    public ConventionalUnitType createConventionalUnitType();

    @Provides
    public ConversionDocument createConversionDocument();

    @Provides
    public ConversionRefDocument createConversionRefDocument();

    @Provides
    public ConversionRefType createConversionRefType();

    @Provides
    public ConversionToPreferredUnitDocument createConversionToPreferredUnitDocument();

    @Provides
    public ConversionToPreferredUnitType createConversionToPreferredUnitType();

    @Provides
    public ConversionType createConversionType();

    @Provides
    public CoordDocument createCoordDocument();

    @Provides
    public CoordinateOperationDocument createCoordinateOperationDocument();

    @Provides
    public CoordinateOperationIDDocument createCoordinateOperationIDDocument();

    @Provides
    public CoordinateOperationNameDocument createCoordinateOperationNameDocument();

    @Provides
    public CoordinateOperationRefDocument createCoordinateOperationRefDocument();

    @Provides
    public CoordinateOperationRefType createCoordinateOperationRefType();

    @Provides
    public CoordinateReferenceSystemDocument createCoordinateReferenceSystemDocument();

    @Provides
    public CoordinateReferenceSystemRefDocument createCoordinateReferenceSystemRefDocument();

    @Provides
    public CoordinateReferenceSystemRefType createCoordinateReferenceSystemRefType();

    @Provides
    public CoordinatesDocument createCoordinatesDocument();

    @Provides
    public CoordinatesType createCoordinatesType();

    @Provides
    public CoordinateSystemAxisDocument createCoordinateSystemAxisDocument();

    @Provides
    public CoordinateSystemAxisRefDocument createCoordinateSystemAxisRefDocument();

    @Provides
    public CoordinateSystemAxisRefType createCoordinateSystemAxisRefType();

    @Provides
    public CoordinateSystemAxisType createCoordinateSystemAxisType();

    @Provides
    public CoordinateSystemDocument createCoordinateSystemDocument();

    @Provides
    public CoordinateSystemRefDocument createCoordinateSystemRefDocument();

    @Provides
    public CoordinateSystemRefType createCoordinateSystemRefType();

    @Provides
    public CoordType createCoordType();

    @Provides
    public CountDocument createCountDocument();

    @Provides
    public CountExtentDocument createCountExtentDocument();

    @Provides
    public CountExtentType createCountExtentType();

    @Provides
    public CountListDocument createCountListDocument();

    @Provides
    public CountPropertyType createCountPropertyType();

    @Provides
    public CovarianceDocument createCovarianceDocument();

    @Provides
    public CovarianceElementType createCovarianceElementType();

    @Provides
    public CovarianceMatrixDocument createCovarianceMatrixDocument();

    @Provides
    public CovarianceMatrixType createCovarianceMatrixType();

    @Provides
    public CoverageDocument createCoverageDocument();

    @Provides
    public CoverageFunctionDocument createCoverageFunctionDocument();

    @Provides
    public CoverageFunctionType createCoverageFunctionType();

    @Provides
    public CRSDocument createCRSDocument();

    @Provides
    public CrsRefDocument createCrsRefDocument();

    @Provides
    public CRSRefType createCRSRefType();

    @Provides
    public CsIDDocument createCsIDDocument();

    @Provides
    public CsNameDocument createCsNameDocument();

    @Provides
    public CubicSplineDocument createCubicSplineDocument();

    @Provides
    public CubicSplineType createCubicSplineType();

    @Provides
    public CurveArrayPropertyDocument createCurveArrayPropertyDocument();

    @Provides
    public CurveArrayPropertyType createCurveArrayPropertyType();

    @Provides
    public CurveDocument createCurveDocument();

    @Provides
    public CurveInterpolationType createCurveInterpolationType();

    @Provides
    public CurveMemberDocument createCurveMemberDocument();

    @Provides
    public CurveMembersDocument createCurveMembersDocument();

    @Provides
    public CurvePropertyDocument createCurvePropertyDocument();

    @Provides
    public CurvePropertyType createCurvePropertyType();

    @Provides
    public CurveSegmentArrayPropertyType createCurveSegmentArrayPropertyType();

    @Provides
    public CurveSegmentDocument createCurveSegmentDocument();

    @Provides
    public CurveType createCurveType();

    @Provides
    public CylinderDocument createCylinderDocument();

    @Provides
    public CylinderType createCylinderType();

    @Provides
    public CylindricalCSDocument createCylindricalCSDocument();

    @Provides
    public CylindricalCSRefDocument createCylindricalCSRefDocument();

    @Provides
    public CylindricalCSRefType createCylindricalCSRefType();

    @Provides
    public CylindricalCSType createCylindricalCSType();

    @Provides
    public DataBlockDocument createDataBlockDocument();

    @Provides
    public DataBlockType createDataBlockType();

    @Provides
    public DataSourceDocument createDataSourceDocument();

    @Provides
    public DatumDocument createDatumDocument();

    @Provides
    public DatumIDDocument createDatumIDDocument();

    @Provides
    public DatumNameDocument createDatumNameDocument();

    @Provides
    public DatumRefDocument createDatumRefDocument();

    @Provides
    public DatumRefType createDatumRefType();

    @Provides
    public DecimalMinutesDocument createDecimalMinutesDocument();

    @Provides
    public DecimalMinutesType createDecimalMinutesType();

    @Provides
    public DefaultStyleDocument createDefaultStyleDocument();

    @Provides
    public DefaultStylePropertyType createDefaultStylePropertyType();

    @Provides
    public DefinedByConversionDocument createDefinedByConversionDocument();

    @Provides
    public DefinitionCollectionDocument createDefinitionCollectionDocument();

    @Provides
    public DefinitionDocument createDefinitionDocument();

    @Provides
    public DefinitionMemberDocument createDefinitionMemberDocument();

    @Provides
    public DefinitionProxyDocument createDefinitionProxyDocument();

    @Provides
    public DefinitionProxyType createDefinitionProxyType();

    @Provides
    public DefinitionRefDocument createDefinitionRefDocument();

    @Provides
    public DefinitionType createDefinitionType();

    @Provides
    public DegreesDocument createDegreesDocument();

    @Provides
    public DegreesType createDegreesType();

    @Provides
    public DegreeValueType createDegreeValueType();

    @Provides
    public DerivationUnitTermDocument createDerivationUnitTermDocument();

    @Provides
    public DerivationUnitTermType createDerivationUnitTermType();

    @Provides
    public DerivedCRSDocument createDerivedCRSDocument();

    @Provides
    public DerivedCRSRefDocument createDerivedCRSRefDocument();

    @Provides
    public DerivedCRSRefType createDerivedCRSRefType();

    @Provides
    public DerivedCRSType createDerivedCRSType();

    @Provides
    public DerivedCRSTypeDocument createDerivedCRSTypeDocument();

    @Provides
    public DerivedCRSTypeType createDerivedCRSTypeType();

    @Provides
    public DerivedUnitDocument createDerivedUnitDocument();

    @Provides
    public DerivedUnitType createDerivedUnitType();

    @Provides
    public DescriptionDocument createDescriptionDocument();

    @Provides
    public DictionaryDocument createDictionaryDocument();

    @Provides
    public DictionaryEntryDocument createDictionaryEntryDocument();

    @Provides
    public DictionaryEntryType createDictionaryEntryType();

    @Provides
    public DictionaryType createDictionaryType();

    @Provides
    public DirectedEdgeDocument createDirectedEdgeDocument();

    @Provides
    public DirectedEdgePropertyType createDirectedEdgePropertyType();

    @Provides
    public DirectedFaceDocument createDirectedFaceDocument();

    @Provides
    public DirectedFacePropertyType createDirectedFacePropertyType();

    @Provides
    public DirectedNodeDocument createDirectedNodeDocument();

    @Provides
    public DirectedNodePropertyType createDirectedNodePropertyType();

    @Provides
    public DirectedObservationAtDistanceDocument createDirectedObservationAtDistanceDocument();

    @Provides
    public DirectedObservationAtDistanceType createDirectedObservationAtDistanceType();

    @Provides
    public DirectedObservationDocument createDirectedObservationDocument();

    @Provides
    public DirectedObservationType createDirectedObservationType();

    @Provides
    public DirectedTopoSolidDocument createDirectedTopoSolidDocument();

    @Provides
    public DirectedTopoSolidPropertyType createDirectedTopoSolidPropertyType();

    @Provides
    public DirectionDocument createDirectionDocument();

    @Provides
    public DirectionPropertyType createDirectionPropertyType();

    @Provides
    public DirectionVectorDocument createDirectionVectorDocument();

    @Provides
    public DirectionVectorType createDirectionVectorType();

    @Provides
    public DirectPositionListType createDirectPositionListType();

    @Provides
    public DirectPositionType createDirectPositionType();

    @Provides
    public DiscreteCoverageDocument createDiscreteCoverageDocument();

    @Provides
    public DmsAngleDocument createDmsAngleDocument();

    @Provides
    public DMSAngleType createDMSAngleType();

    @Provides
    public DmsAngleValueDocument createDmsAngleValueDocument();

    @Provides
    public DomainSetDocument createDomainSetDocument();

    @Provides
    public DomainSetType createDomainSetType();

    @Provides
    public DoubleList createDoubleList();

    @Provides
    public DoubleOrNull createDoubleOrNull();

    @Provides
    public DoubleOrNullList createDoubleOrNullList();

    @Provides
    public DoubleOrNullTupleListDocument createDoubleOrNullTupleListDocument();

    @Provides
    public DrawingTypeType createDrawingTypeType();

    @Provides
    public DurationDocument createDurationDocument();

    @Provides
    public DynamicFeatureCollectionType createDynamicFeatureCollectionType();

    @Provides
    public DynamicFeatureType createDynamicFeatureType();

    @Provides
    public EdgeDocument createEdgeDocument();

    @Provides
    public EdgeOfDocument createEdgeOfDocument();

    @Provides
    public EdgeType createEdgeType();

    @Provides
    public EllipsoidalCSDocument createEllipsoidalCSDocument();

    @Provides
    public EllipsoidalCSRefDocument createEllipsoidalCSRefDocument();

    @Provides
    public EllipsoidalCSRefType createEllipsoidalCSRefType();

    @Provides
    public EllipsoidalCSType createEllipsoidalCSType();

    @Provides
    public EllipsoidDocument createEllipsoidDocument();

    @Provides
    public EllipsoidIDDocument createEllipsoidIDDocument();

    @Provides
    public EllipsoidNameDocument createEllipsoidNameDocument();

    @Provides
    public EllipsoidRefDocument createEllipsoidRefDocument();

    @Provides
    public EllipsoidRefType createEllipsoidRefType();

    @Provides
    public EllipsoidType createEllipsoidType();

    @Provides
    public EngineeringCRSDocument createEngineeringCRSDocument();

    @Provides
    public EngineeringCRSRefDocument createEngineeringCRSRefDocument();

    @Provides
    public EngineeringCRSRefType createEngineeringCRSRefType();

    @Provides
    public EngineeringCRSType createEngineeringCRSType();

    @Provides
    public EngineeringDatumDocument createEngineeringDatumDocument();

    @Provides
    public EngineeringDatumRefDocument createEngineeringDatumRefDocument();

    @Provides
    public EngineeringDatumRefType createEngineeringDatumRefType();

    @Provides
    public EngineeringDatumType createEngineeringDatumType();

    @Provides
    public EnvelopeDocument createEnvelopeDocument();

    @Provides
    public EnvelopeType createEnvelopeType();

    @Provides
    public EnvelopeWithTimePeriodDocument createEnvelopeWithTimePeriodDocument();

    @Provides
    public EnvelopeWithTimePeriodType createEnvelopeWithTimePeriodType();

    @Provides
    public ExtentOfDocument createExtentOfDocument();

    @Provides
    public ExtentType createExtentType();

    @Provides
    public ExteriorDocument createExteriorDocument();

    @Provides
    public FaceDocument createFaceDocument();

    @Provides
    public FaceType createFaceType();

    @Provides
    public FeatureArrayPropertyType createFeatureArrayPropertyType();

    @Provides
    public FeatureCollectionDocument createFeatureCollectionDocument();

    @Provides
    public FeatureCollectionType createFeatureCollectionType();

    @Provides
    public FeatureDocument createFeatureDocument();

    @Provides
    public FeatureMemberDocument createFeatureMemberDocument();

    @Provides
    public FeatureMembersDocument createFeatureMembersDocument();

    @Provides
    public FeaturePropertyDocument createFeaturePropertyDocument();

    @Provides
    public FeaturePropertyType createFeaturePropertyType();

    @Provides
    public FeatureStyleDocument createFeatureStyleDocument();

    @Provides
    public FeatureStylePropertyType createFeatureStylePropertyType();

    @Provides
    public FeatureStyleType createFeatureStyleType();

    @Provides
    public FileDocument createFileDocument();

    @Provides
    public FileType createFileType();

    @Provides
    public FileValueModelType createFileValueModelType();

    @Provides
    public FormulaType createFormulaType();

    @Provides
    public GeneralConversionDocument createGeneralConversionDocument();

    @Provides
    public GeneralConversionRefDocument createGeneralConversionRefDocument();

    @Provides
    public GeneralConversionRefType createGeneralConversionRefType();

    @Provides
    public GeneralDerivedCRSDocument createGeneralDerivedCRSDocument();

    @Provides
    public GeneralOperationParameterDocument createGeneralOperationParameterDocument();

    @Provides
    public GeneralParameterValueDocument createGeneralParameterValueDocument();

    @Provides
    public GeneralTransformationDocument createGeneralTransformationDocument();

    @Provides
    public GeneralTransformationRefDocument createGeneralTransformationRefDocument();

    @Provides
    public GeneralTransformationRefType createGeneralTransformationRefType();

    @Provides
    public GenericMetaDataDocument createGenericMetaDataDocument();

    @Provides
    public GenericMetaDataType createGenericMetaDataType();

    @Provides
    public GeocentricCRSDocument createGeocentricCRSDocument();

    @Provides
    public GeocentricCRSRefDocument createGeocentricCRSRefDocument();

    @Provides
    public GeocentricCRSRefType createGeocentricCRSRefType();

    @Provides
    public GeocentricCRSType createGeocentricCRSType();

    @Provides
    public GeodesicDocument createGeodesicDocument();

    @Provides
    public GeodesicStringDocument createGeodesicStringDocument();

    @Provides
    public GeodesicStringType createGeodesicStringType();

    @Provides
    public GeodesicType createGeodesicType();

    @Provides
    public GeodeticDatumDocument createGeodeticDatumDocument();

    @Provides
    public GeodeticDatumRefDocument createGeodeticDatumRefDocument();

    @Provides
    public GeodeticDatumRefType createGeodeticDatumRefType();

    @Provides
    public GeodeticDatumType createGeodeticDatumType();

    @Provides
    public GeographicCRSDocument createGeographicCRSDocument();

    @Provides
    public GeographicCRSRefDocument createGeographicCRSRefDocument();

    @Provides
    public GeographicCRSRefType createGeographicCRSRefType();

    @Provides
    public GeographicCRSType createGeographicCRSType();

    @Provides
    public GeometricAggregateDocument createGeometricAggregateDocument();

    @Provides
    public GeometricComplexDocument createGeometricComplexDocument();

    @Provides
    public GeometricComplexPropertyType createGeometricComplexPropertyType();

    @Provides
    public GeometricComplexType createGeometricComplexType();

    @Provides
    public GeometricPrimitiveDocument createGeometricPrimitiveDocument();

    @Provides
    public GeometricPrimitivePropertyType createGeometricPrimitivePropertyType();

    @Provides
    public GeometryArrayPropertyType createGeometryArrayPropertyType();

    @Provides
    public GeometryDocument createGeometryDocument();

    @Provides
    public GeometryMemberDocument createGeometryMemberDocument();

    @Provides
    public GeometryMembersDocument createGeometryMembersDocument();

    @Provides
    public GeometryPropertyType createGeometryPropertyType();

    @Provides
    public GeometryStyleDocument createGeometryStyleDocument();

    @Provides
    public GeometryStylePropertyType createGeometryStylePropertyType();

    @Provides
    public GeometryStyleType createGeometryStyleType();

    @Provides
    public GMLDocument createGMLDocument();

    @Provides
    public GraphStyleDocument createGraphStyleDocument();

    @Provides
    public GraphStylePropertyType createGraphStylePropertyType();

    @Provides
    public GraphStyleType createGraphStyleType();

    @Provides
    public GraphTypeType createGraphTypeType();

    @Provides
    public GreenwichLongitudeDocument createGreenwichLongitudeDocument();

    @Provides
    public GridCoverageDocument createGridCoverageDocument();

    @Provides
    public GridCoverageType createGridCoverageType();

    @Provides
    public GriddedSurfaceDocument createGriddedSurfaceDocument();

    @Provides
    public GridDocument createGridDocument();

    @Provides
    public GridDomainDocument createGridDomainDocument();

    @Provides
    public GridDomainType createGridDomainType();

    @Provides
    public GridEnvelopeType createGridEnvelopeType();

    @Provides
    public GridFunctionDocument createGridFunctionDocument();

    @Provides
    public GridFunctionType createGridFunctionType();

    @Provides
    public GridLengthType createGridLengthType();

    @Provides
    public GridLimitsType createGridLimitsType();

    @Provides
    public GridType createGridType();

    @Provides
    public GroupIDDocument createGroupIDDocument();

    @Provides
    public GroupNameDocument createGroupNameDocument();

    @Provides
    public HistoryDocument createHistoryDocument();

    @Provides
    public HistoryPropertyType createHistoryPropertyType();

    @Provides
    public IdAttribute createIdAttribute();

    @Provides
    public IdentifierType createIdentifierType();

    @Provides
    public ImageCRSDocument createImageCRSDocument();

    @Provides
    public ImageCRSRefDocument createImageCRSRefDocument();

    @Provides
    public ImageCRSRefType createImageCRSRefType();

    @Provides
    public ImageCRSType createImageCRSType();

    @Provides
    public ImageDatumDocument createImageDatumDocument();

    @Provides
    public ImageDatumRefDocument createImageDatumRefDocument();

    @Provides
    public ImageDatumRefType createImageDatumRefType();

    @Provides
    public ImageDatumType createImageDatumType();

    @Provides
    public ImplicitGeometryDocument createImplicitGeometryDocument();

    @Provides
    public IncludesCRSDocument createIncludesCRSDocument();

    @Provides
    public IncludesElementDocument createIncludesElementDocument();

    @Provides
    public IncludesParameterDocument createIncludesParameterDocument();

    @Provides
    public IncludesValueDocument createIncludesValueDocument();

    @Provides
    public IncrementOrder createIncrementOrder();

    @Provides
    public IndexMapDocument createIndexMapDocument();

    @Provides
    public IndexMapType createIndexMapType();

    @Provides
    public IndirectEntryDocument createIndirectEntryDocument();

    @Provides
    public IndirectEntryType createIndirectEntryType();

    @Provides
    public InnerBoundaryIsDocument createInnerBoundaryIsDocument();

    @Provides
    public IntegerList createIntegerList();

    @Provides
    public IntegerOrNull createIntegerOrNull();

    @Provides
    public IntegerOrNullList createIntegerOrNullList();

    @Provides
    public IntegerValueDocument createIntegerValueDocument();

    @Provides
    public IntegerValueListDocument createIntegerValueListDocument();

    @Provides
    public InteriorDocument createInteriorDocument();

    @Provides
    public InverseFlatteningDocument createInverseFlatteningDocument();

    @Provides
    public IsolatedDocument createIsolatedDocument();

    @Provides
    public IsolatedPropertyType createIsolatedPropertyType();

    @Provides
    public IsSphereDocument createIsSphereDocument();

    @Provides
    public KnotPropertyType createKnotPropertyType();

    @Provides
    public KnotType createKnotType();

    @Provides
    public KnotTypesType createKnotTypesType();

    @Provides
    public LabelStyleDocument createLabelStyleDocument();

    @Provides
    public LabelStylePropertyType createLabelStylePropertyType();

    @Provides
    public LabelStyleType createLabelStyleType();

    @Provides
    public LabelType createLabelType();

    @Provides
    public LengthType createLengthType();

    @Provides
    public LinearCSDocument createLinearCSDocument();

    @Provides
    public LinearCSRefDocument createLinearCSRefDocument();

    @Provides
    public LinearCSRefType createLinearCSRefType();

    @Provides
    public LinearCSType createLinearCSType();

    @Provides
    public LinearRingDocument createLinearRingDocument();

    @Provides
    public LinearRingPropertyType createLinearRingPropertyType();

    @Provides
    public LinearRingType createLinearRingType();

    @Provides
    public LineStringDocument createLineStringDocument();

    @Provides
    public LineStringMemberDocument createLineStringMemberDocument();

    @Provides
    public LineStringPropertyDocument createLineStringPropertyDocument();

    @Provides
    public LineStringPropertyType createLineStringPropertyType();

    @Provides
    public LineStringSegmentArrayPropertyType createLineStringSegmentArrayPropertyType();

    @Provides
    public LineStringSegmentDocument createLineStringSegmentDocument();

    @Provides
    public LineStringSegmentType createLineStringSegmentType();

    @Provides
    public LineStringType createLineStringType();

    @Provides
    public LineTypeType createLineTypeType();

    @Provides
    public LocationDocument createLocationDocument();

    @Provides
    public LocationKeyWordDocument createLocationKeyWordDocument();

    @Provides
    public LocationPropertyType createLocationPropertyType();

    @Provides
    public LocationStringDocument createLocationStringDocument();

    @Provides
    public MappingRuleDocument createMappingRuleDocument();

    @Provides
    public MaximalComplexDocument createMaximalComplexDocument();

    @Provides
    public MaximumOccursDocument createMaximumOccursDocument();

    @Provides
    public MeasureDescriptionDocument createMeasureDescriptionDocument();

    @Provides
    public MeasureDocument createMeasureDocument();

    @Provides
    public MeasureListType createMeasureListType();

    @Provides
    public MeasureOrNullListType createMeasureOrNullListType();

    @Provides
    public MeasureType createMeasureType();

    @Provides
    public MemberDocument createMemberDocument();

    @Provides
    public MembersDocument createMembersDocument();

    @Provides
    public MeridianIDDocument createMeridianIDDocument();

    @Provides
    public MeridianNameDocument createMeridianNameDocument();

    @Provides
    public MetaDataDocument createMetaDataDocument();

    @Provides
    public MetaDataPropertyDocument createMetaDataPropertyDocument();

    @Provides
    public MetaDataPropertyType createMetaDataPropertyType();

    @Provides
    public MethodFormulaDocument createMethodFormulaDocument();

    @Provides
    public MethodIDDocument createMethodIDDocument();

    @Provides
    public MethodNameDocument createMethodNameDocument();

    @Provides
    public MinimumOccursDocument createMinimumOccursDocument();

    @Provides
    public MinutesDocument createMinutesDocument();

    @Provides
    public ModifiedCoordinateDocument createModifiedCoordinateDocument();

    @Provides
    public MovingObjectStatusDocument createMovingObjectStatusDocument();

    @Provides
    public MovingObjectStatusType createMovingObjectStatusType();

    @Provides
    public MultiCenterLineOfDocument createMultiCenterLineOfDocument();

    @Provides
    public MultiCenterOfDocument createMultiCenterOfDocument();

    @Provides
    public MultiCoverageDocument createMultiCoverageDocument();

    @Provides
    public MultiCurveCoverageDocument createMultiCurveCoverageDocument();

    @Provides
    public MultiCurveCoverageType createMultiCurveCoverageType();

    @Provides
    public MultiCurveDocument createMultiCurveDocument();

    @Provides
    public MultiCurveDomainDocument createMultiCurveDomainDocument();

    @Provides
    public MultiCurveDomainType createMultiCurveDomainType();

    @Provides
    public MultiCurvePropertyDocument createMultiCurvePropertyDocument();

    @Provides
    public MultiCurvePropertyType createMultiCurvePropertyType();

    @Provides
    public MultiCurveType createMultiCurveType();

    @Provides
    public MultiEdgeOfDocument createMultiEdgeOfDocument();

    @Provides
    public MultiExtentOfDocument createMultiExtentOfDocument();

    @Provides
    public MultiGeometryDocument createMultiGeometryDocument();

    @Provides
    public MultiGeometryPropertyDocument createMultiGeometryPropertyDocument();

    @Provides
    public MultiGeometryPropertyType createMultiGeometryPropertyType();

    @Provides
    public MultiGeometryType createMultiGeometryType();

    @Provides
    public MultiLineStringDocument createMultiLineStringDocument();

    @Provides
    public MultiLineStringPropertyType createMultiLineStringPropertyType();

    @Provides
    public MultiLineStringType createMultiLineStringType();

    @Provides
    public MultiLocationDocument createMultiLocationDocument();

    @Provides
    public MultiPointCoverageDocument createMultiPointCoverageDocument();

    @Provides
    public MultiPointCoverageType createMultiPointCoverageType();

    @Provides
    public MultiPointDocument createMultiPointDocument();

    @Provides
    public MultiPointDomainDocument createMultiPointDomainDocument();

    @Provides
    public MultiPointDomainType createMultiPointDomainType();

    @Provides
    public MultiPointPropertyDocument createMultiPointPropertyDocument();

    @Provides
    public MultiPointPropertyType createMultiPointPropertyType();

    @Provides
    public MultiPointType createMultiPointType();

    @Provides
    public MultiPolygonDocument createMultiPolygonDocument();

    @Provides
    public MultiPolygonPropertyType createMultiPolygonPropertyType();

    @Provides
    public MultiPolygonType createMultiPolygonType();

    @Provides
    public MultiPositionDocument createMultiPositionDocument();

    @Provides
    public MultiSolidCoverageDocument createMultiSolidCoverageDocument();

    @Provides
    public MultiSolidCoverageType createMultiSolidCoverageType();

    @Provides
    public MultiSolidDocument createMultiSolidDocument();

    @Provides
    public MultiSolidDomainDocument createMultiSolidDomainDocument();

    @Provides
    public MultiSolidDomainType createMultiSolidDomainType();

    @Provides
    public MultiSolidPropertyDocument createMultiSolidPropertyDocument();

    @Provides
    public MultiSolidPropertyType createMultiSolidPropertyType();

    @Provides
    public MultiSolidType createMultiSolidType();

    @Provides
    public MultiSurfaceCoverageDocument createMultiSurfaceCoverageDocument();

    @Provides
    public MultiSurfaceCoverageType createMultiSurfaceCoverageType();

    @Provides
    public MultiSurfaceDocument createMultiSurfaceDocument();

    @Provides
    public MultiSurfaceDomainDocument createMultiSurfaceDomainDocument();

    @Provides
    public MultiSurfaceDomainType createMultiSurfaceDomainType();

    @Provides
    public MultiSurfacePropertyDocument createMultiSurfacePropertyDocument();

    @Provides
    public MultiSurfacePropertyType createMultiSurfacePropertyType();

    @Provides
    public MultiSurfaceType createMultiSurfaceType();

    @Provides
    public NameDocument createNameDocument();

    @Provides
    public NameList createNameList();

    @Provides
    public NameOrNull createNameOrNull();

    @Provides
    public NameOrNullList createNameOrNullList();

    @Provides
    public NCNameList createNCNameList();

    @Provides
    public NodeDocument createNodeDocument();

    @Provides
    public NodeType createNodeType();

    @Provides
    public NullDocument createNullDocument();

    @Provides
    public NullEnumeration createNullEnumeration();

    @Provides
    public NullType createNullType();

    @Provides
    public ObjectDocument createObjectDocument();

    @Provides
    public ObliqueCartesianCSDocument createObliqueCartesianCSDocument();

    @Provides
    public ObliqueCartesianCSRefDocument createObliqueCartesianCSRefDocument();

    @Provides
    public ObliqueCartesianCSRefType createObliqueCartesianCSRefType();

    @Provides
    public ObliqueCartesianCSType createObliqueCartesianCSType();

    @Provides
    public ObservationDocument createObservationDocument();

    @Provides
    public ObservationType createObservationType();

    @Provides
    public OffsetCurveDocument createOffsetCurveDocument();

    @Provides
    public OffsetCurveType createOffsetCurveType();

    @Provides
    public OperationDocument createOperationDocument();

    @Provides
    public OperationMethodDocument createOperationMethodDocument();

    @Provides
    public OperationMethodRefDocument createOperationMethodRefDocument();

    @Provides
    public OperationMethodRefType createOperationMethodRefType();

    @Provides
    public OperationMethodType createOperationMethodType();

    @Provides
    public OperationParameterDocument createOperationParameterDocument();

    @Provides
    public OperationParameterGroupDocument createOperationParameterGroupDocument();

    @Provides
    public OperationParameterGroupRefDocument createOperationParameterGroupRefDocument();

    @Provides
    public OperationParameterGroupRefType createOperationParameterGroupRefType();

    @Provides
    public OperationParameterGroupType createOperationParameterGroupType();

    @Provides
    public OperationParameterRefDocument createOperationParameterRefDocument();

    @Provides
    public OperationParameterRefType createOperationParameterRefType();

    @Provides
    public OperationParameterType createOperationParameterType();

    @Provides
    public OperationRefDocument createOperationRefDocument();

    @Provides
    public OperationRefType createOperationRefType();

    @Provides
    public OperationVersionDocument createOperationVersionDocument();

    @Provides
    public OrientableCurveDocument createOrientableCurveDocument();

    @Provides
    public OrientableCurveType createOrientableCurveType();

    @Provides
    public OrientableSurfaceDocument createOrientableSurfaceDocument();

    @Provides
    public OrientableSurfaceType createOrientableSurfaceType();

    @Provides
    public OriginDocument createOriginDocument();

    @Provides
    public OuterBoundaryIsDocument createOuterBoundaryIsDocument();

    @Provides
    public ParameterIDDocument createParameterIDDocument();

    @Provides
    public ParameterNameDocument createParameterNameDocument();

    @Provides
    public ParameterValueDocument createParameterValueDocument();

    @Provides
    public ParameterValueGroupDocument createParameterValueGroupDocument();

    @Provides
    public ParameterValueGroupType createParameterValueGroupType();

    @Provides
    public ParameterValueType createParameterValueType();

    @Provides
    public ParametricCurveSurfaceDocument createParametricCurveSurfaceDocument();

    @Provides
    public PassThroughOperationDocument createPassThroughOperationDocument();

    @Provides
    public PassThroughOperationRefDocument createPassThroughOperationRefDocument();

    @Provides
    public PassThroughOperationRefType createPassThroughOperationRefType();

    @Provides
    public PassThroughOperationType createPassThroughOperationType();

    @Provides
    public PatchesDocument createPatchesDocument();

    @Provides
    public PixelInCellDocument createPixelInCellDocument();

    @Provides
    public PixelInCellType createPixelInCellType();

    @Provides
    public PointArrayPropertyDocument createPointArrayPropertyDocument();

    @Provides
    public PointArrayPropertyType createPointArrayPropertyType();

    @Provides
    public PointDocument createPointDocument();

    @Provides
    public PointMemberDocument createPointMemberDocument();

    @Provides
    public PointMembersDocument createPointMembersDocument();

    @Provides
    public PointPropertyDocument createPointPropertyDocument();

    @Provides
    public PointPropertyType createPointPropertyType();

    @Provides
    public PointRepDocument createPointRepDocument();

    @Provides
    public PointType createPointType();

    @Provides
    public PolarCSDocument createPolarCSDocument();

    @Provides
    public PolarCSRefDocument createPolarCSRefDocument();

    @Provides
    public PolarCSRefType createPolarCSRefType();

    @Provides
    public PolarCSType createPolarCSType();

    @Provides
    public PolygonDocument createPolygonDocument();

    @Provides
    public PolygonMemberDocument createPolygonMemberDocument();

    @Provides
    public PolygonPatchArrayPropertyType createPolygonPatchArrayPropertyType();

    @Provides
    public PolygonPatchDocument createPolygonPatchDocument();

    @Provides
    public PolygonPatchesDocument createPolygonPatchesDocument();

    @Provides
    public PolygonPatchType createPolygonPatchType();

    @Provides
    public PolygonPropertyDocument createPolygonPropertyDocument();

    @Provides
    public PolygonPropertyType createPolygonPropertyType();

    @Provides
    public PolygonType createPolygonType();

    @Provides
    public PolyhedralSurfaceDocument createPolyhedralSurfaceDocument();

    @Provides
    public PolyhedralSurfaceType createPolyhedralSurfaceType();

    @Provides
    public PosDocument createPosDocument();

    @Provides
    public PositionalAccuracyDocument createPositionalAccuracyDocument();

    @Provides
    public PositionDocument createPositionDocument();

    @Provides
    public PosListDocument createPosListDocument();

    @Provides
    public PrimeMeridianDocument createPrimeMeridianDocument();

    @Provides
    public PrimeMeridianRefDocument createPrimeMeridianRefDocument();

    @Provides
    public PrimeMeridianRefType createPrimeMeridianRefType();

    @Provides
    public PrimeMeridianType createPrimeMeridianType();

    @Provides
    public PriorityLocationDocument createPriorityLocationDocument();

    @Provides
    public PriorityLocationPropertyType createPriorityLocationPropertyType();

    @Provides
    public ProjectedCRSDocument createProjectedCRSDocument();

    @Provides
    public ProjectedCRSRefDocument createProjectedCRSRefDocument();

    @Provides
    public ProjectedCRSRefType createProjectedCRSRefType();

    @Provides
    public ProjectedCRSType createProjectedCRSType();

    @Provides
    public QNameList createQNameList();

    @Provides
    public QuantityDocument createQuantityDocument();

    @Provides
    public QuantityExtentDocument createQuantityExtentDocument();

    @Provides
    public QuantityExtentType createQuantityExtentType();

    @Provides
    public QuantityListDocument createQuantityListDocument();

    @Provides
    public QuantityPropertyType createQuantityPropertyType();

    @Provides
    public QuantityTypeDocument createQuantityTypeDocument();

    @Provides
    public QueryGrammarEnumeration createQueryGrammarEnumeration();

    @Provides
    public RangeParametersDocument createRangeParametersDocument();

    @Provides
    public RangeParametersType createRangeParametersType();

    @Provides
    public RangeSetDocument createRangeSetDocument();

    @Provides
    public RangeSetType createRangeSetType();

    @Provides
    public RealizationEpochDocument createRealizationEpochDocument();

    @Provides
    public RectangleDocument createRectangleDocument();

    @Provides
    public RectangleType createRectangleType();

    @Provides
    public RectifiedGridCoverageDocument createRectifiedGridCoverageDocument();

    @Provides
    public RectifiedGridCoverageType createRectifiedGridCoverageType();

    @Provides
    public RectifiedGridDocument createRectifiedGridDocument();

    @Provides
    public RectifiedGridDomainDocument createRectifiedGridDomainDocument();

    @Provides
    public RectifiedGridDomainType createRectifiedGridDomainType();

    @Provides
    public RectifiedGridType createRectifiedGridType();

    @Provides
    public ReferenceDocument createReferenceDocument();

    @Provides
    public ReferenceSystemDocument createReferenceSystemDocument();

    @Provides
    public ReferenceSystemRefDocument createReferenceSystemRefDocument();

    @Provides
    public ReferenceSystemRefType createReferenceSystemRefType();

    @Provides
    public ReferenceType createReferenceType();

    @Provides
    public RelatedTimeType createRelatedTimeType();

    @Provides
    public RelativeInternalPositionalAccuracyDocument createRelativeInternalPositionalAccuracyDocument();

    @Provides
    public RelativeInternalPositionalAccuracyType createRelativeInternalPositionalAccuracyType();

    @Provides
    public RemarksDocument createRemarksDocument();

    @Provides
    public RemoteSchemaAttribute createRemoteSchemaAttribute();

    @Provides
    public ResultDocument createResultDocument();

    @Provides
    public ResultOfDocument createResultOfDocument();

    @Provides
    public RingDocument createRingDocument();

    @Provides
    public RingPropertyType createRingPropertyType();

    @Provides
    public RingType createRingType();

    @Provides
    public RoughConversionToPreferredUnitDocument createRoughConversionToPreferredUnitDocument();

    @Provides
    public RowIndexDocument createRowIndexDocument();

    @Provides
    public ScalarValuePropertyType createScalarValuePropertyType();

    @Provides
    public ScaleType createScaleType();

    @Provides
    public ScopeDocument createScopeDocument();

    @Provides
    public SecondDefiningParameterDocument createSecondDefiningParameterDocument();

    @Provides
    public SecondDefiningParameterType createSecondDefiningParameterType();

    @Provides
    public SecondsDocument createSecondsDocument();

    @Provides
    public SegmentsDocument createSegmentsDocument();

    @Provides
    public SemiMajorAxisDocument createSemiMajorAxisDocument();

    @Provides
    public SemiMinorAxisDocument createSemiMinorAxisDocument();

    @Provides
    public SequenceRuleNames createSequenceRuleNames();

    @Provides
    public SequenceRuleType createSequenceRuleType();

    @Provides
    public SignType createSignType();

    @Provides
    public SingleOperationDocument createSingleOperationDocument();

    @Provides
    public SingleOperationRefDocument createSingleOperationRefDocument();

    @Provides
    public SingleOperationRefType createSingleOperationRefType();

    @Provides
    public SolidArrayPropertyDocument createSolidArrayPropertyDocument();

    @Provides
    public SolidArrayPropertyType createSolidArrayPropertyType();

    @Provides
    public SolidDocument createSolidDocument();

    @Provides
    public SolidMemberDocument createSolidMemberDocument();

    @Provides
    public SolidMembersDocument createSolidMembersDocument();

    @Provides
    public SolidPropertyDocument createSolidPropertyDocument();

    @Provides
    public SolidPropertyType createSolidPropertyType();

    @Provides
    public SolidType createSolidType();

    @Provides
    public SourceCRSDocument createSourceCRSDocument();

    @Provides
    public SourceDimensionsDocument createSourceDimensionsDocument();

    @Provides
    public SpeedType createSpeedType();

    @Provides
    public SphereDocument createSphereDocument();

    @Provides
    public SphereType createSphereType();

    @Provides
    public SphericalCSDocument createSphericalCSDocument();

    @Provides
    public SphericalCSRefDocument createSphericalCSRefDocument();

    @Provides
    public SphericalCSRefType createSphericalCSRefType();

    @Provides
    public SphericalCSType createSphericalCSType();

    @Provides
    public SrsIDDocument createSrsIDDocument();

    @Provides
    public SrsNameDocument createSrsNameDocument();

    @Provides
    public StatusDocument createStatusDocument();

    @Provides
    public StrictAssociationDocument createStrictAssociationDocument();

    @Provides
    public StringOrNull createStringOrNull();

    @Provides
    public StringOrRefType createStringOrRefType();

    @Provides
    public StringValueDocument createStringValueDocument();

    @Provides
    public StyleDocument createStyleDocument();

    @Provides
    public StyleType createStyleType();

    @Provides
    public StyleVariationType createStyleVariationType();

    @Provides
    public SubComplexDocument createSubComplexDocument();

    @Provides
    public SubjectDocument createSubjectDocument();

    @Provides
    public SuccessionType createSuccessionType();

    @Provides
    public SuperComplexDocument createSuperComplexDocument();

    @Provides
    public SurfaceArrayPropertyDocument createSurfaceArrayPropertyDocument();

    @Provides
    public SurfaceArrayPropertyType createSurfaceArrayPropertyType();

    @Provides
    public SurfaceDocument createSurfaceDocument();

    @Provides
    public SurfaceInterpolationType createSurfaceInterpolationType();

    @Provides
    public SurfaceMemberDocument createSurfaceMemberDocument();

    @Provides
    public SurfaceMembersDocument createSurfaceMembersDocument();

    @Provides
    public SurfacePatchArrayPropertyType createSurfacePatchArrayPropertyType();

    @Provides
    public SurfacePatchDocument createSurfacePatchDocument();

    @Provides
    public SurfacePropertyDocument createSurfacePropertyDocument();

    @Provides
    public SurfacePropertyType createSurfacePropertyType();

    @Provides
    public SurfaceType createSurfaceType();

    @Provides
    public SymbolDocument createSymbolDocument();

    @Provides
    public SymbolType createSymbolType();

    @Provides
    public SymbolTypeEnumeration createSymbolTypeEnumeration();

    @Provides
    public TargetCRSDocument createTargetCRSDocument();

    @Provides
    public TargetDimensionsDocument createTargetDimensionsDocument();

    @Provides
    public TargetDocument createTargetDocument();

    @Provides
    public TargetPropertyType createTargetPropertyType();

    @Provides
    public TemporalCRSDocument createTemporalCRSDocument();

    @Provides
    public TemporalCRSRefDocument createTemporalCRSRefDocument();

    @Provides
    public TemporalCRSRefType createTemporalCRSRefType();

    @Provides
    public TemporalCRSType createTemporalCRSType();

    @Provides
    public TemporalCSDocument createTemporalCSDocument();

    @Provides
    public TemporalCSRefDocument createTemporalCSRefDocument();

    @Provides
    public TemporalCSRefType createTemporalCSRefType();

    @Provides
    public TemporalCSType createTemporalCSType();

    @Provides
    public TemporalDatumDocument createTemporalDatumDocument();

    @Provides
    public TemporalDatumRefDocument createTemporalDatumRefDocument();

    @Provides
    public TemporalDatumRefType createTemporalDatumRefType();

    @Provides
    public TemporalDatumType createTemporalDatumType();

    @Provides
    public TemporalExtentDocument createTemporalExtentDocument();

    @Provides
    public TimeCalendarDocument createTimeCalendarDocument();

    @Provides
    public TimeCalendarEraDocument createTimeCalendarEraDocument();

    @Provides
    public TimeCalendarEraPropertyType createTimeCalendarEraPropertyType();

    @Provides
    public TimeCalendarEraType createTimeCalendarEraType();

    @Provides
    public TimeCalendarPropertyType createTimeCalendarPropertyType();

    @Provides
    public TimeCalendarType createTimeCalendarType();

    @Provides
    public TimeClockDocument createTimeClockDocument();

    @Provides
    public TimeClockPropertyType createTimeClockPropertyType();

    @Provides
    public TimeClockType createTimeClockType();

    @Provides
    public TimeComplexDocument createTimeComplexDocument();

    @Provides
    public TimeCoordinateSystemDocument createTimeCoordinateSystemDocument();

    @Provides
    public TimeCoordinateSystemType createTimeCoordinateSystemType();

    @Provides
    public TimeEdgeDocument createTimeEdgeDocument();

    @Provides
    public TimeEdgePropertyType createTimeEdgePropertyType();

    @Provides
    public TimeEdgeType createTimeEdgeType();

    @Provides
    public TimeGeometricPrimitiveDocument createTimeGeometricPrimitiveDocument();

    @Provides
    public TimeGeometricPrimitivePropertyType createTimeGeometricPrimitivePropertyType();

    @Provides
    public TimeIndeterminateValueType createTimeIndeterminateValueType();

    @Provides
    public TimeInstantDocument createTimeInstantDocument();

    @Provides
    public TimeInstantPropertyType createTimeInstantPropertyType();

    @Provides
    public TimeInstantType createTimeInstantType();

    @Provides
    public TimeIntervalDocument createTimeIntervalDocument();

    @Provides
    public TimeIntervalLengthType createTimeIntervalLengthType();

    @Provides
    public TimeNodeDocument createTimeNodeDocument();

    @Provides
    public TimeNodePropertyType createTimeNodePropertyType();

    @Provides
    public TimeNodeType createTimeNodeType();

    @Provides
    public TimeObjectDocument createTimeObjectDocument();

    @Provides
    public TimeOrdinalEraDocument createTimeOrdinalEraDocument();

    @Provides
    public TimeOrdinalEraPropertyType createTimeOrdinalEraPropertyType();

    @Provides
    public TimeOrdinalEraType createTimeOrdinalEraType();

    @Provides
    public TimeOrdinalReferenceSystemDocument createTimeOrdinalReferenceSystemDocument();

    @Provides
    public TimeOrdinalReferenceSystemType createTimeOrdinalReferenceSystemType();

    @Provides
    public TimePeriodDocument createTimePeriodDocument();

    @Provides
    public TimePeriodPropertyType createTimePeriodPropertyType();

    @Provides
    public TimePeriodType createTimePeriodType();

    @Provides
    public TimePositionDocument createTimePositionDocument();

    @Provides
    public TimePositionType createTimePositionType();

    @Provides
    public TimePositionUnion createTimePositionUnion();

    @Provides
    public TimePrimitiveDocument createTimePrimitiveDocument();

    @Provides
    public TimePrimitivePropertyType createTimePrimitivePropertyType();

    @Provides
    public TimeReferenceSystemDocument createTimeReferenceSystemDocument();

    @Provides
    public TimeSliceDocument createTimeSliceDocument();

    @Provides
    public TimeTopologyComplexDocument createTimeTopologyComplexDocument();

    @Provides
    public TimeTopologyComplexPropertyType createTimeTopologyComplexPropertyType();

    @Provides
    public TimeTopologyComplexType createTimeTopologyComplexType();

    @Provides
    public TimeTopologyPrimitiveDocument createTimeTopologyPrimitiveDocument();

    @Provides
    public TimeTopologyPrimitivePropertyType createTimeTopologyPrimitivePropertyType();

    @Provides
    public TimeType createTimeType();

    @Provides
    public TimeUnitType createTimeUnitType();

    @Provides
    public TinDocument createTinDocument();

    @Provides
    public TinType createTinType();

    @Provides
    public TopoComplexDocument createTopoComplexDocument();

    @Provides
    public TopoComplexMemberType createTopoComplexMemberType();

    @Provides
    public TopoComplexPropertyDocument createTopoComplexPropertyDocument();

    @Provides
    public TopoComplexType createTopoComplexType();

    @Provides
    public TopoCurveDocument createTopoCurveDocument();

    @Provides
    public TopoCurvePropertyDocument createTopoCurvePropertyDocument();

    @Provides
    public TopoCurvePropertyType createTopoCurvePropertyType();

    @Provides
    public TopoCurveType createTopoCurveType();

    @Provides
    public TopologyDocument createTopologyDocument();

    @Provides
    public TopologyStyleDocument createTopologyStyleDocument();

    @Provides
    public TopologyStylePropertyType createTopologyStylePropertyType();

    @Provides
    public TopologyStyleType createTopologyStyleType();

    @Provides
    public TopoPointDocument createTopoPointDocument();

    @Provides
    public TopoPointPropertyDocument createTopoPointPropertyDocument();

    @Provides
    public TopoPointPropertyType createTopoPointPropertyType();

    @Provides
    public TopoPointType createTopoPointType();

    @Provides
    public TopoPrimitiveArrayAssociationType createTopoPrimitiveArrayAssociationType();

    @Provides
    public TopoPrimitiveDocument createTopoPrimitiveDocument();

    @Provides
    public TopoPrimitiveMemberDocument createTopoPrimitiveMemberDocument();

    @Provides
    public TopoPrimitiveMembersDocument createTopoPrimitiveMembersDocument();

    @Provides
    public TopoPrimitiveMemberType createTopoPrimitiveMemberType();

    @Provides
    public TopoSolidDocument createTopoSolidDocument();

    @Provides
    public TopoSolidType createTopoSolidType();

    @Provides
    public TopoSurfaceDocument createTopoSurfaceDocument();

    @Provides
    public TopoSurfacePropertyDocument createTopoSurfacePropertyDocument();

    @Provides
    public TopoSurfacePropertyType createTopoSurfacePropertyType();

    @Provides
    public TopoSurfaceType createTopoSurfaceType();

    @Provides
    public TopoVolumeDocument createTopoVolumeDocument();

    @Provides
    public TopoVolumePropertyDocument createTopoVolumePropertyDocument();

    @Provides
    public TopoVolumePropertyType createTopoVolumePropertyType();

    @Provides
    public TopoVolumeType createTopoVolumeType();

    @Provides
    public TrackDocument createTrackDocument();

    @Provides
    public TrackType createTrackType();

    @Provides
    public TransformationDocument createTransformationDocument();

    @Provides
    public TransformationRefDocument createTransformationRefDocument();

    @Provides
    public TransformationRefType createTransformationRefType();

    @Provides
    public TransformationType createTransformationType();

    @Provides
    public TransformAttribute createTransformAttribute();

    @Provides
    public TriangleDocument createTriangleDocument();

    @Provides
    public TrianglePatchArrayPropertyType createTrianglePatchArrayPropertyType();

    @Provides
    public TrianglePatchesDocument createTrianglePatchesDocument();

    @Provides
    public TriangleType createTriangleType();

    @Provides
    public TriangulatedSurfaceDocument createTriangulatedSurfaceDocument();

    @Provides
    public TriangulatedSurfaceType createTriangulatedSurfaceType();

    @Provides
    public TupleListDocument createTupleListDocument();

    @Provides
    public UnitDefinitionDocument createUnitDefinitionDocument();

    @Provides
    public UnitDefinitionType createUnitDefinitionType();

    @Provides
    public UnitOfMeasureDocument createUnitOfMeasureDocument();

    @Provides
    public UnitOfMeasureType createUnitOfMeasureType();

    @Provides
    public UomAttribute createUomAttribute();

    @Provides
    public UserDefinedCSDocument createUserDefinedCSDocument();

    @Provides
    public UserDefinedCSRefDocument createUserDefinedCSRefDocument();

    @Provides
    public UserDefinedCSRefType createUserDefinedCSRefType();

    @Provides
    public UserDefinedCSType createUserDefinedCSType();

    @Provides
    public UsesAxisDocument createUsesAxisDocument();

    @Provides
    public UsesCartesianCSDocument createUsesCartesianCSDocument();

    @Provides
    public UsesCSDocument createUsesCSDocument();

    @Provides
    public UsesEllipsoidalCSDocument createUsesEllipsoidalCSDocument();

    @Provides
    public UsesEllipsoidDocument createUsesEllipsoidDocument();

    @Provides
    public UsesEngineeringDatumDocument createUsesEngineeringDatumDocument();

    @Provides
    public UsesGeodeticDatumDocument createUsesGeodeticDatumDocument();

    @Provides
    public UsesImageDatumDocument createUsesImageDatumDocument();

    @Provides
    public UsesMethodDocument createUsesMethodDocument();

    @Provides
    public UsesObliqueCartesianCSDocument createUsesObliqueCartesianCSDocument();

    @Provides
    public UsesOperationDocument createUsesOperationDocument();

    @Provides
    public UsesParameterDocument createUsesParameterDocument();

    @Provides
    public UsesPrimeMeridianDocument createUsesPrimeMeridianDocument();

    @Provides
    public UsesSingleOperationDocument createUsesSingleOperationDocument();

    @Provides
    public UsesSphericalCSDocument createUsesSphericalCSDocument();

    @Provides
    public UsesTemporalCSDocument createUsesTemporalCSDocument();

    @Provides
    public UsesTemporalDatumDocument createUsesTemporalDatumDocument();

    @Provides
    public UsesValueDocument createUsesValueDocument();

    @Provides
    public UsesVerticalCSDocument createUsesVerticalCSDocument();

    @Provides
    public UsesVerticalDatumDocument createUsesVerticalDatumDocument();

    @Provides
    public UsingDocument createUsingDocument();

    @Provides
    public ValidAreaDocument createValidAreaDocument();

    @Provides
    public ValidTimeDocument createValidTimeDocument();

    @Provides
    public ValueArrayDocument createValueArrayDocument();

    @Provides
    public ValueArrayPropertyType createValueArrayPropertyType();

    @Provides
    public ValueArrayType createValueArrayType();

    @Provides
    public ValueComponentDocument createValueComponentDocument();

    @Provides
    public ValueComponentsDocument createValueComponentsDocument();

    @Provides
    public ValueDocument createValueDocument();

    @Provides
    public ValueFileDocument createValueFileDocument();

    @Provides
    public ValueListDocument createValueListDocument();

    @Provides
    public ValueOfParameterDocument createValueOfParameterDocument();

    @Provides
    public ValuePropertyDocument createValuePropertyDocument();

    @Provides
    public ValuePropertyType createValuePropertyType();

    @Provides
    public ValuesOfGroupDocument createValuesOfGroupDocument();

    @Provides
    public VectorDocument createVectorDocument();

    @Provides
    public VectorType createVectorType();

    @Provides
    public VersionDocument createVersionDocument();

    @Provides
    public VerticalCRSDocument createVerticalCRSDocument();

    @Provides
    public VerticalCRSRefDocument createVerticalCRSRefDocument();

    @Provides
    public VerticalCRSRefType createVerticalCRSRefType();

    @Provides
    public VerticalCRSType createVerticalCRSType();

    @Provides
    public VerticalCSDocument createVerticalCSDocument();

    @Provides
    public VerticalCSRefDocument createVerticalCSRefDocument();

    @Provides
    public VerticalCSRefType createVerticalCSRefType();

    @Provides
    public VerticalCSType createVerticalCSType();

    @Provides
    public VerticalDatumDocument createVerticalDatumDocument();

    @Provides
    public VerticalDatumRefDocument createVerticalDatumRefDocument();

    @Provides
    public VerticalDatumRefType createVerticalDatumRefType();

    @Provides
    public VerticalDatumType createVerticalDatumType();

    @Provides
    public VerticalDatumTypeDocument createVerticalDatumTypeDocument();

    @Provides
    public VerticalDatumTypeType createVerticalDatumTypeType();

    @Provides
    public VerticalExtentDocument createVerticalExtentDocument();

    @Provides
    public VolumeType createVolumeType();

    @Provides
    public AbstractGeneralOperationParameterRefDocument createAbstractGeneralOperationParameterRefDocument();

    @Provides
    public AbstractGeneralOperationParameterRefType createAbstractGeneralOperationParameterRefType();

    @Provides
    public AbstractGriddedSurfaceType createAbstractGriddedSurfaceType();

    @Provides
    public AbstractParametricCurveSurfaceType createAbstractParametricCurveSurfaceType();

    @Provides
    public AbstractRingPropertyType createAbstractRingPropertyType();

    @Provides
    public AbstractSolidType createAbstractSolidType();

    @Provides
    public AbstractSurfaceType createAbstractSurfaceType();
}
