package immutables;

import org.immutables.value.Value;

import de.hanbei.immutables.Tuple;

@Tuple
@Value.Immutable
public interface T_Point {
    int x();
    int y();
}
