package net.novate.calculator.sharedui.base

internal inline fun noLocalProvidedFor(name: String): Nothing {
    error("CompositionLocal $name not present")
}