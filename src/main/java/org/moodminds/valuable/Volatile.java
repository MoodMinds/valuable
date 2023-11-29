package org.moodminds.valuable;

import java.io.Serializable;
import java.lang.invoke.VarHandle;

import static java.lang.invoke.MethodHandles.lookup;

/**
 * Mutable volatile value {@link Valuable}. Ensures atomicity on value update methods.
 */
public class Volatile<V> implements Valuable<V>, Serializable {

    private static final long serialVersionUID = 1692774367194920934L;

    private static final VarHandle VAL;

    static {
        try { VAL = lookup().findVarHandle(Volatile.class, "val", Object.class); }
        catch (ReflectiveOperationException e) { throw new ExceptionInInitializerError(e); }
    }

    /**
     * The value-holding field.
     */
    public volatile V val;

    /**
     * Construct the object.
     */
    private Volatile() {}

    /**
     * Construct the object with the given initial value.
     *
     * @param val the given initial value
     */
    private Volatile(V val) {
        this.val = val;
    }

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    public V get() {
        return val;
    }

    /**
     * {@inheritDoc}
     *
     * @param val {@inheritDoc}
     */
    @Override
    public void set(V val) {
        this.val = val;
    }

    /**
     * Atomically get the previous value and set the new value.
     *
     * @param val {@inheritDoc}
     * @return {@inheritDoc}
     */
    @Override
    @SuppressWarnings("unchecked")
    public V get(V val) {
        return (V) VAL.getAndSet(this, val);
    }

    /**
     * Atomically set the given value if the current value {@code == state}.
     *
     * @param state {@inheritDoc}
     * @param val {@inheritDoc}
     * @return {@inheritDoc}
     */
    @Override
    public boolean set(V state, V val) {
        return VAL.compareAndSet(this, state, val);
    }

    /**
     * A boolean value holder.
     */
    public static class Boolean implements Valuable.Boolean, Serializable {

        private static final long serialVersionUID = -3798958395328930995L;

        private static final VarHandle FLG;

        static {
            try { FLG = lookup().findVarHandle(Boolean.class, "flg", boolean.class); }
            catch (ReflectiveOperationException e) { throw new ExceptionInInitializerError(e); }
        }

        /**
         * The value-holding field.
         */
        public volatile boolean flg;

        /**
         * Construct the object with the given initial value.
         *
         * @param flg the given initial value
         */
        private Boolean(boolean flg) {
            this.flg = flg;
        }

        /**
         * {@inheritDoc}
         *
         * @return {@inheritDoc}
         */
        @Override
        public boolean get() {
            return flg;
        }

        /**
         * {@inheritDoc}
         *
         * @param flg {@inheritDoc}
         */
        @Override
        public void set(boolean flg) {
            this.flg = flg;
        }

        /**
         * Atomically get the previous value and set the new value.
         *
         * @param flg {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public boolean get(boolean flg) {
            return (boolean) FLG.getAndSet(this, flg);
        }

        /**
         * Atomically set the given value if the current value {@code == state}.
         *
         * @param state {@inheritDoc}
         * @param flg {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public boolean set(boolean state, boolean flg) {
            return FLG.compareAndSet(this, state, flg);
        }
    }

    /**
     * A char value holder.
     */
    public static class Char implements Valuable.Char, Serializable {

        private static final long serialVersionUID = 7217695511703002285L;

        private static final VarHandle CHR;

        static {
            try { CHR = lookup().findVarHandle(Char.class, "chr", char.class); }
            catch (ReflectiveOperationException e) { throw new ExceptionInInitializerError(e); }
        }

        /**
         * The value-holding field.
         */
        public volatile char chr;

        /**
         * Construct the object with the given initial value.
         *
         * @param chr the given initial value
         */
        private Char(char chr) {
            this.chr = chr;
        }

        /**
         * {@inheritDoc}
         *
         * @return {@inheritDoc}
         */
        @Override
        public char get() {
            return chr;
        }

        /**
         * {@inheritDoc}
         *
         * @param chr {@inheritDoc}
         */
        @Override
        public void set(char chr) {
            this.chr = chr;
        }

        /**
         * Atomically get the previous value and set the new value.
         *
         * @param chr {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public char get(char chr) {
            return (char) CHR.getAndSet(this, chr);
        }

        /**
         * Atomically set the given value if the current value {@code == state}.
         *
         * @param state {@inheritDoc}
         * @param chr {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public boolean set(char state, char chr) {
            return CHR.compareAndSet(this, state, chr);
        }
    }

    /**
     * A byte value holder.
     */
    public static class Byte implements Valuable.Byte, Serializable {

        private static final long serialVersionUID = -2433091398651085611L;

        private static final VarHandle NUM;

        static {
            try { NUM = lookup().findVarHandle(Byte.class, "num", byte.class); }
            catch (ReflectiveOperationException e) { throw new ExceptionInInitializerError(e); }
        }

        /**
         * The value-holding field.
         */
        public volatile byte num;

        /**
         * Construct the object with the given initial value.
         *
         * @param num the given initial value
         */
        private Byte(byte num) {
            this.num = num;
        }

        /**
         * {@inheritDoc}
         *
         * @return {@inheritDoc}
         */
        @Override
        public byte get() {
            return num;
        }

        /**
         * {@inheritDoc}
         *
         * @param num {@inheritDoc}
         */
        @Override
        public void set(byte num) {
            this.num = num;
        }

        /**
         * Atomically set the given value and return previous value.
         *
         * @param num {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public byte get(byte num) {
            return (byte) NUM.getAndSet(this, num);
        }

        /**
         * Atomically get the previous value and set the new value.
         *
         * @param num {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public boolean set(byte state, byte num) {
            return NUM.compareAndSet(this, state, num);
        }

        /**
         * Atomically increment value and return.
         *
         * @return {@inheritDoc}
         */
        @Override
        public byte incr() {
            return (byte) ((byte) NUM.getAndAdd(this, (byte) 1) + 1);
        }

        /**
         * Atomically decrement value and return.
         *
         * @return {@inheritDoc}
         */
        @Override
        public byte decr() {
            return (byte) ((byte) NUM.getAndAdd(this, (byte) -1) - 1);
        }
    }

    /**
     * A short value holder.
     */
    public static class Short implements Valuable.Short, Serializable {

        private static final long serialVersionUID = 5833644974555983841L;

        private static final VarHandle NUM;

        static {
            try { NUM = lookup().findVarHandle(Short.class, "num", short.class); }
            catch (ReflectiveOperationException e) { throw new ExceptionInInitializerError(e); }
        }

        /**
         * The value-holding field.
         */
        public volatile short num;

        /**
         * Construct the object with the given initial value.
         *
         * @param num the given initial value
         */
        private Short(short num) {
            this.num = num;
        }

        /**
         * {@inheritDoc}
         *
         * @return {@inheritDoc}
         */
        @Override
        public short get() {
            return num;
        }

        /**
         * {@inheritDoc}
         *
         * @param num {@inheritDoc}
         */
        @Override
        public void set(short num) {
            this.num = num;
        }

        /**
         * Atomically get the previous value and set the new value.
         *
         * @param num {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public short get(short num) {
            return (short) NUM.getAndSet(this, num);
        }

        /**
         * Atomically set the given value if the current value {@code == state}.
         *
         * @param state {@inheritDoc}
         * @param num {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public boolean set(short state, short num) {
            return NUM.compareAndSet(this, state, num);
        }

        /**
         * Atomically increment value and return.
         *
         * @return {@inheritDoc}
         */
        @Override
        public short incr() {
            return (short) ((short) NUM.getAndAdd(this, (short) 1) + 1);
        }

        /**
         * Atomically decrement value and return.
         *
         * @return {@inheritDoc}
         */
        @Override
        public short decr() {
            return (short) ((short) NUM.getAndAdd(this, (short) -1) - 1);
        }
    }

    /**
     * An int value holder.
     */
    public static class Int implements Valuable.Int, Serializable {

        private static final long serialVersionUID = -8941060148306291215L;

        private static final VarHandle NUM;

        static {
            try { NUM = lookup().findVarHandle(Int.class, "num", int.class); }
            catch (ReflectiveOperationException e) { throw new ExceptionInInitializerError(e); }
        }

        /**
         * The value-holding field.
         */
        public volatile int num;

        /**
         * Construct the object with the given initial value.
         *
         * @param num the given initial value
         */
        private Int(int num) {
            this.num = num;
        }

        /**
         * {@inheritDoc}
         *
         * @return {@inheritDoc}
         */
        @Override
        public int get() {
            return num;
        }

        /**
         * {@inheritDoc}
         *
         * @param num {@inheritDoc}
         */
        @Override
        public void set(int num) {
            this.num = num;
        }

        /**
         * Atomically get the previous value and set the new value.
         *
         * @param num {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public int get(int num) {
            return (int) NUM.getAndSet(this, num);
        }

        /**
         * Atomically set the given value if the current value {@code == state}.
         *
         * @param state {@inheritDoc}
         * @param num {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public boolean set(int state, int num) {
            return NUM.compareAndSet(this, state, num);
        }

        /**
         * Atomically increment value and return.
         *
         * @return {@inheritDoc}
         */
        @Override
        public int incr() {
            return (int) NUM.getAndAdd(this, 1) + 1;
        }

        /**
         * Atomically decrement value and return.
         *
         * @return {@inheritDoc}
         */
        @Override
        public int decr() {
            return (int) NUM.getAndAdd(this, -1) - 1;
        }
    }

    /**
     * A long value holder.
     */
    public static class Long implements Valuable.Long, Serializable {

        private static final long serialVersionUID = 263425725729433268L;

        private static final VarHandle NUM;

        static {
            try { NUM = lookup().findVarHandle(Long.class, "num", long.class); }
            catch (ReflectiveOperationException e) { throw new ExceptionInInitializerError(e); }
        }

        /**
         * The value-holding field.
         */
        public volatile long num;

        /**
         * Construct the object with the given initial value.
         *
         * @param num the given initial value
         */
        private Long(long num) {
            this.num = num;
        }

        /**
         * {@inheritDoc}
         *
         * @return {@inheritDoc}
         */
        @Override
        public long get() {
            return num;
        }

        /**
         * {@inheritDoc}
         *
         * @param num {@inheritDoc}
         */
        @Override
        public void set(long num) {
            this.num = num;
        }

        /**
         * Atomically get the previous value and set the new value.
         *
         * @param num {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public long get(long num) {
            return (long) NUM.getAndSet(this, num);
        }

        /**
         * Atomically set the given value if the current value {@code == state}.
         *
         * @param state {@inheritDoc}
         * @param num {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public boolean set(long state, long num) {
            return NUM.compareAndSet(this, state, num);
        }

        /**
         * Atomically increment value and return.
         *
         * @return {@inheritDoc}
         */
        @Override
        public long incr() {
            return (long) NUM.getAndAdd(this, 1L) + 1L;
        }

        /**
         * Atomically decrement value and return.
         *
         * @return {@inheritDoc}
         */
        @Override
        public long decr() {
            return (long) NUM.getAndAdd(this, -1L) - 1L;
        }
    }

    /**
     * A float value holder.
     */
    public static class Float implements Valuable.Float, Serializable {

        private static final long serialVersionUID = -2943769441212943707L;

        private static final VarHandle NUM;

        static {
            try { NUM = lookup().findVarHandle(Float.class, "num", float.class); }
            catch (ReflectiveOperationException e) { throw new ExceptionInInitializerError(e); }
        }

        /**
         * The value-holding field.
         */
        public volatile float num;

        /**
         * Construct the object with the given initial value.
         *
         * @param num the given initial value
         */
        private Float(float num) {
            this.num = num;
        }

        /**
         * {@inheritDoc}
         *
         * @return {@inheritDoc}
         */
        @Override
        public float get() {
            return num;
        }

        /**
         * {@inheritDoc}
         *
         * @param num {@inheritDoc}
         */
        @Override
        public void set(float num) {
            this.num = num;
        }

        /**
         * Atomically get the previous value and set the new value.
         *
         * @param num {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public float get(float num) {
            return (float) NUM.getAndSet(this, num);
        }

        /**
         * Atomically set the given value if the current value {@code == state}.
         *
         * @param state {@inheritDoc}
         * @param num {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public boolean set(float state, float num) {
            return NUM.compareAndSet(this, state, num);
        }
    }

    /**
     * A double value holder.
     */
    public static class Double implements Valuable.Double, Serializable {

        private static final long serialVersionUID = 192590681509865067L;

        private static final VarHandle NUM;

        static {
            try { NUM = lookup().findVarHandle(Double.class, "num", double.class); }
            catch (ReflectiveOperationException e) { throw new ExceptionInInitializerError(e); }
        }

        /**
         * The value-holding field.
         */
        public volatile double num;

        /**
         * Construct the object with the given initial value.
         *
         * @param num the given initial value
         */
        private Double(double num) {
            this.num = num;
        }

        /**
         * {@inheritDoc}
         *
         * @return {@inheritDoc}
         */
        @Override
        public double get() {
            return num;
        }

        /**
         * {@inheritDoc}
         *
         * @param num {@inheritDoc}
         */
        @Override
        public void set(double num) {
            this.num = num;
        }

        /**
         * Atomically get the previous value and set the new value.
         *
         * @param num {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public double get(double num) {
            return (double) NUM.getAndSet(this, num);
        }

        /**
         * Atomically set the given value if the current value {@code == state}.
         *
         * @param state {@inheritDoc}
         * @param num {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public boolean set(double state, double num) {
            return NUM.compareAndSet(this, state, num);
        }
    }


    /**
     * Return the empty volatile object reference value holder.
     *
     * @param <V> the type of the value
     * @return the empty volatile object reference value holder
     */
    public static <V> Volatile<V> vol() {
        return new Volatile<>();
    }

    /**
     * Return the volatile object reference value holder by the given value.
     *
     * @param value the given initial value
     * @param <V> the type of the value
     * @return the volatile object reference value holder by the given value
     */
    public static <V> Volatile<V> vol(V value) {
        return new Volatile<>(value);
    }

    /**
     * Return the volatile boolean value holder by the given value.
     *
     * @param value the given initial value
     * @return the volatile boolean value holder by the given value
     */
    public static Boolean vol(boolean value) {
        return new Boolean(value);
    }

    /**
     * Return the volatile char value holder by the given value.
     *
     * @param value the given initial value
     * @return the volatile char value holder by the given value
     */
    public static Char vol(char value) {
        return new Char(value);
    }

    /**
     * Return the volatile byte value holder by the given value.
     *
     * @param value the given initial value
     * @return the volatile byte value holder by the given value
     */
    public static Byte vol(byte value) {
        return new Byte(value);
    }

    /**
     * Return the volatile short value holder by the given value.
     *
     * @param value the given initial value
     * @return the volatile short value holder by the given value
     */
    public static Short vol(short value) {
        return new Short(value);
    }

    /**
     * Return the volatile int value holder by the given value.
     *
     * @param value the given initial value
     * @return the volatile int value holder by the given value
     */
    public static Int vol(int value) {
        return new Int(value);
    }

    /**
     * Return the volatile long value holder by the given value.
     *
     * @param value the given initial value
     * @return the volatile long value holder by the given value
     */
    public static Long vol(long value) {
        return new Long(value);
    }

    /**
     * Return the volatile float value holder by the given value.
     *
     * @param value the given initial value
     * @return the volatile float value holder by the given value
     */
    public static Float vol(float value) {
        return new Float(value);
    }

    /**
     * Return the volatile double value holder by the given value.
     *
     * @param value the given initial value
     * @return the volatile double value holder by the given value
     */
    public static Double vol(double value) {
        return new Double(value);
    }
}
