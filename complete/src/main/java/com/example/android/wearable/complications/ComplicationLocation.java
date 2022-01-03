package com.example.android.wearable.complications;

/**
 * Used by associated watch face ({@link ComplicationWatchFaceService}) to let this
 * configuration Activity know which complication locations are supported, their ids, and
 * supported complication data types.
 */
public enum ComplicationLocation {
    RIGHT,
    TOP_RIGHT,
    TOP,
    TOP_LEFT,
    LEFT,
    BOTTOM,
    CENTER,
    TOP_RIGHT_RANGED,
    BOTTOM_RIGHT_RANGED,
    BOTTOM_LEFT_RANGED,
    TOP_LEFT_RANGED
}