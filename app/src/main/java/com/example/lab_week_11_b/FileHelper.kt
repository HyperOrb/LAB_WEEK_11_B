/*
 * FileHelper.kt
 *
 * This class provides utility functions related to file operations, particularly for generating
 * URIs from files and retrieving standard Android media directories.
 *
 * Functions:
 * - `getUriFromFile(file: File)`: Converts a `File` object into a content `Uri` using `FileProvider`.
 *   This is essential for sharing file access with other apps securely.
 * - `getPicturesFolder()`: Returns the standard directory name for pictures (`Environment.DIRECTORY_PICTURES`).
 * - `getVideosFolder()`: Returns the standard directory name for videos (`Environment.DIRECTORY_MOVIES`).
 */
package com.example.lab_week_11_b
import android.content.Context
import android.net.Uri
import android.os.Environment
import androidx.core.content.FileProvider
import java.io.File

class FileHelper(private val context: Context) {
    fun getUriFromFile(file: File): Uri {
        return FileProvider.getUriForFile(
            context, "${context.packageName}.camera", file
        )
    }
    fun getPicturesFolder(): String = Environment.DIRECTORY_PICTURES
    fun getVideosFolder(): String = Environment.DIRECTORY_MOVIES
}