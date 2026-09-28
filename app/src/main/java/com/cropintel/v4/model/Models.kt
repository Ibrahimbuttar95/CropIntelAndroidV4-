package com.cropintel.v4.model

data class CropItem(
    val id: String,
    val nameEn: String,
    val nameUr: String,
    val variety: String,
    val season: String,
    val durationDays: Int,
    val targetYieldMaundsPerAcre: Double
)

data class SoilConditionData(
    val ph: Double,
    val nitrogenPpm: Double,
    val phosphorusPpm: Double,
    val potassiumPpm: Double,
    val organicMatterPercent: Double,
    val electricalConductivity: Double,
    val moisturePercent: Double
)

data class PestDiseaseDiagnosis(
    val id: String,
    val diseaseNameEn: String,
    val diseaseNameUr: String,
    val targetCrop: String,
    val confidence: Double,
    val symptoms: List<String>,
    val chemicalControl: String,
    val biologicalControl: String
)
