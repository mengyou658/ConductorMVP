package com.jshvarts.notedomain

/**
 * Represents Data model
 */
data class Note(
        val id: Long = 0,
        val noteText: String = "") {
    fun isValid(): Boolean = noteText.trim().length > 3
}