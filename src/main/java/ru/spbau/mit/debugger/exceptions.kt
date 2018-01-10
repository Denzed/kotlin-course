package ru.spbau.mit.debugger

abstract class DebugException(message: String) : Exception(message)

class DebugAlreadyRunningException : DebugException(
        "Debug is already running"
)

class DebugNotRunningException : DebugException(
        "Debug is not running"
)

class UnknownCommandException(command: String) : DebugException(
        "Unknown command type met: \"$command\""
)

class NoFileLoadedException : DebugException(
        "No file loaded"
)