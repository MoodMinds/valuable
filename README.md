# Value holding and accessing abstractions

**Valuable** is an API that provides abstractions for holding and accessing values, making them modifiable
within Java Lambdas and other nested objects contexts.

## In a Nutshell

**Valuable** provides APIs for holding and accessing both object (`Valuable<V>`) and primitive types (`Valuable.Boolean`,
`Valuable.Char`, `Valuable.Byte`, `Valuable.Short`, `Valuable.Int`, `Valuable.Long`, `Valuable.Float`, `Valuable.Double`).
These APIs include the regular `Variable<V>` and the volatile `Volatile<V>` implementations for both object and primitive types,
following the same pattern.

## Brief overview

The main objectives of the **Valuable** API and its implementations are:

* To provide a shared value access logic, suitable for both single-threaded and multithreaded environments (with atomic operations for multithreaded use).
* To offer value holders that can be utilized in nested objects' executions, permitting write access to these holders.

In the context of the second objective, it's common practice to use final, single-element object or primitive arrays within
nested classes and Lambdas which capture outer variable values as their fields. `Valuable`, `Variable` and `Volatile` are introduced
to eliminate the need for this workaround.

**Let's examine the usage of the **Valuable** by examples**:

```java
import org.moodminds.valuable.Valuable;
import org.moodminds.valuable.Volatile;

import java.util.Random;
import java.util.function.IntSupplier;

import static org.moodminds.valuable.Variable.var;
import static org.moodminds.valuable.Volatile.vol;

public class Sample {

    void sample() {

        // define a condition.
        boolean sequential = new Random().nextBoolean();

        // define Variable or Volatile instance of Valuable depending on the condition.
        final Valuable<String> valuable = sequential ? var("sequential") : vol("parallel");

        // primitive Valuables can be defined in the same way.
        final Valuable.Boolean booleanValuable = sequential ? var(true) : vol(false);
        final Valuable.Char charValuable = sequential ? var('y') : vol('n');
        final Valuable.Byte byteValuable = sequential ? var((byte) 0) : vol((byte) 0);
        final Valuable.Short shortValuable = sequential ? var((short) 0) : vol((short) 0);
        final Valuable.Int intValuable = sequential ? var(0) : vol(0);
        final Valuable.Long longValuable = sequential ? var(0L) : vol(0L);
        final Valuable.Float floatValuable = sequential ? var(0.0f) : vol(0.0f);
        final Valuable.Double doubleValuable = sequential ? var(1.0d) : vol(0.0d);

        // operate the Valuables.

        // get previous and set possibly atomically (for Volatile).
        String stringPrevious = valuable.get("parallel");
        boolean booleanPrevious = booleanValuable.get(false);
        char charPrevious = charValuable.get('1');
        byte bytePrevious = byteValuable.get((byte) 1);
        short shortPrevious = shortValuable.get((short) 1);
        int intPrevious = intValuable.get(1);
        long longPrevious = longValuable.get(1L);
        float floatPrevious = floatValuable.get(1.0f);
        double doublePrevious = doubleValuable.get(1.0D);

        // compare and set possibly atomically (for Volatile).
        boolean valueChanged = valuable.set("sequential", "parallel");
        boolean booleanChanged = booleanValuable.set(true, false);
        boolean charChanged = charValuable.set('0', '1');
        boolean byteChanged = byteValuable.set((byte) 0, (byte) 1);
        boolean shortChanged = shortValuable.set((short) 0, (short) 1);
        boolean intChanged = intValuable.set(0, 1);
        boolean longChanged = longValuable.set(0L, 1L);
        boolean floatChanged = floatValuable.set(0.0f, 1.0f);
        boolean doubleChanged = doubleValuable.set(0.0D, 1.0D);

        // increment and decrement number Valuables (atomic in Volatile).
        IntSupplier intSupplier = intValuable::incr;
        intSupplier = intValuable::decr;


        // capture in nested structures and read to/write from the value field directly in a Variable or Volatile.
        final Volatile.Long longVolatile = vol(1L);
        ((Runnable) () -> {
            long l = longVolatile.get();
            longVolatile.num = l + 10; // access volatile field 'num' directly.
        }).run();
    }
}
```

## Getting Started

Include **Valuable** in your project by adding the dependency.

## Maven configuration

Artifacts can be found on [Maven Central](https://search.maven.org/) after publication.

```xml
<dependency>
    <groupId>org.moodminds.valuable</groupId>
    <artifactId>valuable</artifactId>
    <version>${version}</version>
</dependency>
```

## Building from Source

You may need to build from source to use **Valuable** (until it is in Maven Central) with Maven and JDK 9 at least.

## License
This project is going to be released under version 2.0 of the [Apache License][l].

[l]: https://www.apache.org/licenses/LICENSE-2.0