package de.hanbei.immutables;

import org.immutables.value.Value;

@Tuple
@Value.Immutable
public interface T_Point {
    int x();
    int y();
}
