/*
 * FileInfo.kt
 *
 * This data class represents information about a file, particularly for media capture.
 * It encapsulates all necessary details to manage and insert a file into the MediaStore.
 *
 * Properties:
 * - `uri`: The Uri of the file, typically obtained from a FileProvider.
 * - `file`: The actual `java.io.File` object.
 * - `name`: The display name of the file (e.g., "img_1678886400000.jpg").
 * - `relativePath`: The relative path within the external storage (e.g., "Pictures" or "Movies").
 * - `mimeType`: The MIME type of the file (e.g., "image/jpeg" or "video/mp4").
 */
package com.example.lab_week_11_b
import android.net.Uri
import java.io.File

data class FileInfo(
    val uri: Uri,
    val file: File,
    val name: String,
    val relativePath: String,
    val mimeType: String
)