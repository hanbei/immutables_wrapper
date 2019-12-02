package de.hanbei.immutables;

import org.immutables.value.Value;

@Value.Style(
    typeAbstract = "T_*",
    // Generate construction method using all attributes as parameters
    allParameters = true,
    // Changing generated name just for fun
    typeImmutable = "*",
    // We may also disable builder
    defaults = @Value.Immutable(builder = false))
public @interface Tuple {
}