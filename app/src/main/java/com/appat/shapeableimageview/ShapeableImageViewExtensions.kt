package com.appat.shapeableimageview

import android.content.res.Resources
import androidx.annotation.DimenRes
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.shape.CornerFamily


fun ShapeableImageView.setAllCorners(@CornerFamily cornerFamily: Int, @DimenRes dimen: Int)
{
    val radius = resources.getDimension(dimen)
    setAllCorners(cornerFamily, radius)
}

fun ShapeableImageView.setAllCorners(@CornerFamily cornerFamily: Int, dimen: Float)
{
    shapeAppearanceModel = shapeAppearanceModel
        .toBuilder()
        .setAllCorners(cornerFamily, dimen.toPx)
        .build()
}

fun ShapeableImageView.setTopRightCorner(@CornerFamily cornerFamily: Int, @DimenRes dimen: Int)
{
    val radius = resources.getDimension(dimen)
    setTopRightCorner(cornerFamily, radius)
}

fun ShapeableImageView.setTopRightCorner(@CornerFamily cornerFamily: Int, dimen: Float)
{
    setAllCorners(cornerFamily, 0f)
    shapeAppearanceModel = shapeAppearanceModel
        .toBuilder()
        .setTopRightCorner(cornerFamily, dimen.toPx)
        .build()
}

fun ShapeableImageView.setTopLeftCorner(@CornerFamily cornerFamily: Int, @DimenRes dimen: Int)
{
    val radius = resources.getDimension(dimen)
    setTopLeftCorner(cornerFamily, radius)
}

fun ShapeableImageView.setTopLeftCorner(@CornerFamily cornerFamily: Int, dimen: Float)
{
    setAllCorners(cornerFamily, 0f)
    shapeAppearanceModel = shapeAppearanceModel
        .toBuilder()
        .setTopLeftCorner(cornerFamily, dimen.toPx)
        .build()
}

fun ShapeableImageView.setBottomRightCorner(@CornerFamily cornerFamily: Int, @DimenRes dimen: Int)
{
    val radius = resources.getDimension(dimen)
    setBottomRightCorner(cornerFamily, radius)
}

fun ShapeableImageView.setBottomRightCorner(@CornerFamily cornerFamily: Int, dimen: Float)
{
    setAllCorners(cornerFamily, 0f)
    shapeAppearanceModel = shapeAppearanceModel
        .toBuilder()
        .setBottomRightCorner(cornerFamily, dimen.toPx)
        .build()
}

fun ShapeableImageView.setBottomLeftCorner(@CornerFamily cornerFamily: Int, @DimenRes dimen: Int)
{
    val radius = resources.getDimension(dimen)
    setBottomLeftCorner(cornerFamily, radius)
}

fun ShapeableImageView.setBottomLeftCorner(@CornerFamily cornerFamily: Int, dimen: Float)
{
    setAllCorners(cornerFamily, 0f)
    shapeAppearanceModel = shapeAppearanceModel
        .toBuilder()
        .setBottomLeftCorner(cornerFamily, dimen.toPx)
        .build()
}

val Float.toPx: Float
    get() = (this * Resources.getSystem().displayMetrics.density)