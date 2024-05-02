package org.jetbrains.qa.signatures.modifiers

import java.io.File
import javax.sql.DataSource

/**
 * Sealed interface
 */
sealed interface SealedError


/**
 * Sealed class that inherit sealed interface [SealedError]
 */
sealed class SealedIOError(): SealedError

/**
 * @suppress
 */
class FileReadError(val file: File): SealedIOError()

/**
 * @suppress
 */
class DatabaseError(val source: DataSource): SealedIOError()