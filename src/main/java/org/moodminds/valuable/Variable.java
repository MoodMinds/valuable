package org.moodminds.valuable;

import java.io.Serializable;
import java.util.Objects;

/**
 * Mutable value {@link Valuable}.
 */
public class Variable<V> implements Valuable<V>, Serializable {

    private static final long serialVersionUID = -4998039340505017253L;
    /**
     * The value-holding field.
     */
    public V val;

    /**
     * Construct the object.
     */
    private Variable() {}

    /**
     * Construct the object with the given initial value.
     *
     * @param val the given initial value
     */
    private Variable(V val) {
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
    public void put(V val) {
        this.val = val;
    }

    /**
     * Get the previous value and set the new value.
     *
     * @param val {@inheritDoc}
     * @return {@inheritDoc}
     */
    @Override
    public V set(V val) {
        V prev = this.val; this.val = val; return prev;
    }

    /**
     * Set the given value if the current value {@code == state}.
     *
     * @param state {@inheritDoc}
     * @param val {@inheritDoc}
     * @return {@inheritDoc}
     */
    @Override
    public boolean let(V state, V val) {
        if (!Objects.equals(this.val, state))
            return false;
        this.val = val; return true;
    }

    /**
     * A boolean value holder.
     */
    public static class Boolean implements Valuable.Boolean, Serializable {

        private static final long serialVersionUID = 8154916911421237558L;
        /**
         * The value-holding field.
         */
        public boolean flg;

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
        public void put(boolean flg) {
            this.flg = flg;
        }

        /**
         * Get the previous value and set the new value.
         *
         * @param flg {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public boolean set(boolean flg) {
            boolean prev = this.flg; this.flg = flg; return prev;
        }

        /**
         * Set the given value if the current value {@code == state}.
         *
         * @param state {@inheritDoc}
         * @param flg {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public boolean let(boolean state, boolean flg) {
            if (this.flg != state)
                return false;
            this.flg = flg; return true;
        }
    }

    /**
     * A char value holder.
     */
    public static class Char implements Valuable.Char, Serializable {

        private static final long serialVersionUID = -6112621508719673839L;
        /**
         * The value-holding field.
         */
        public char chr;

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
        public void put(char chr) {
            this.chr = chr;
        }

        /**
         * Get the previous value and set the new value.
         *
         * @param chr {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public char set(char chr) {
            char prev = this.chr; this.chr = chr; return prev;
        }

        /**
         * Set the given value if the current value {@code == state}.
         *
         * @param state {@inheritDoc}
         * @param chr {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public boolean let(char state, char chr) {
            if (this.chr != state)
                return false;
            this.chr = chr; return true;
        }
    }

    /**
     * A byte value holder.
     */
    public static class Byte implements Valuable.Byte, Serializable {

        private static final long serialVersionUID = -1555378567477342869L;
        /**
         * The value-holding field.
         */
        public byte num;

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
        public void put(byte num) {
            this.num = num;
        }

        /**
         * Get the previous value and set the new value.
         *
         * @param num {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public byte set(byte num) {
            byte prev = this.num; this.num = num; return prev;
        }

        /**
         * Set the given value if the current value {@code == state}.
         *
         * @param state {@inheritDoc}
         * @param num {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public boolean let(byte state, byte num) {
            if (this.num != state)
                return false;
            this.num = num; return true;
        }

        /**
         * Increment value and return.
         *
         * @return {@inheritDoc}
         */
        @Override
        public byte incr() {
            return ++num;
        }

        /**
         * Decrement value and return.
         *
         * @return {@inheritDoc}
         */
        @Override
        public byte decr() {
            return --num;
        }
    }

    /**
     * A short value holder.
     */
    public static class Short implements Valuable.Short, Serializable {

        private static final long serialVersionUID = 863898576153497365L;
        /**
         * The value-holding field.
         */
        public short num;

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
        public void put(short num) {
            this.num = num;
        }

        /**
         * Get the previous value and set the new value.
         *
         * @param num {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public short set(short num) {
            short prev = this.num; this.num = num; return prev;
        }

        /**
         * Set the given value if the current value {@code == state}.
         *
         * @param state {@inheritDoc}
         * @param num {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public boolean let(short state, short num) {
            if (this.num != state)
                return false;
            this.num = num; return true;
        }

        /**
         * Increment value and return.
         *
         * @return {@inheritDoc}
         */
        @Override
        public short incr() {
            return ++num;
        }

        /**
         * Decrement value and return.
         *
         * @return {@inheritDoc}
         */
        @Override
        public short decr() {
            return --num;
        }
    }

    /**
     * An int value holder.
     */
    public static class Int implements Valuable.Int, Serializable {

        private static final long serialVersionUID = -319312783368353880L;
        /**
         * The value-holding field.
         */
        public int num;

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
        public void put(int num) {
            this.num = num;
        }

        /**
         * Get the previous value and set the new value.
         *
         * @param num {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public int set(int num) {
            int prev = this.num; this.num = num; return prev;
        }

        /**
         * Set the given value if the current value {@code == state}.
         *
         * @param state {@inheritDoc}
         * @param num {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public boolean let(int state, int num) {
            if (this.num != state)
                return false;
            this.num = num; return true;
        }

        /**
         * Increment value and return.
         *
         * @return {@inheritDoc}
         */
        @Override
        public int incr() {
            return ++num;
        }

        /**
         * Decrement value and return.
         *
         * @return {@inheritDoc}
         */
        @Override
        public int decr() {
            return --num;
        }
    }

    /**
     * A long value holder.
     */
    public static class Long implements Valuable.Long, Serializable {

        private static final long serialVersionUID = 3770217909650296220L;
        /**
         * The value-holding field.
         */
        public long num;

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
        public void put(long num) {
            this.num = num;
        }

        /**
         * Get the previous value and set the new value.
         *
         * @param num {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public long set(long num) {
            long prev = this.num; this.num = num; return prev;
        }

        /**
         * Set the given value if the current value {@code == state}.
         *
         * @param state {@inheritDoc}
         * @param num {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public boolean let(long state, long num) {
            if (this.num != state)
                return false;
            this.num = num; return true;
        }

        /**
         * Increment value and return.
         *
         * @return {@inheritDoc}
         */
        @Override
        public long incr() {
            return ++num;
        }

        /**
         * Decrement value and return.
         *
         * @return {@inheritDoc}
         */
        @Override
        public long decr() {
            return --num;
        }
    }

    /**
     * A float value holder.
     */
    public static class Float implements Valuable.Float, Serializable {

        private static final long serialVersionUID = 7087947176071305036L;
        /**
         * The value-holding field.
         */
        public float num;

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
        public void put(float num) {
            this.num = num;
        }

        /**
         * Get the previous value and set the new value.
         *
         * @param num {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public float set(float num) {
            float prev = this.num; this.num = num; return prev;
        }

        /**
         * Set the given value if the current value {@code == state}.
         *
         * @param state {@inheritDoc}
         * @param num {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public boolean let(float state, float num) {
            if (java.lang.Float.compare(this.num, state) != 0)
                return false;
            this.num = num; return true;
        }
    }

    /**
     * A double value holder.
     */
    public static class Double implements Valuable.Double, Serializable {

        private static final long serialVersionUID = -6533516047811045664L;
        /**
         * The value-holding field.
         */
        public double num;

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
        public void put(double num) {
            this.num = num;
        }

        /**
         * Get the previous value and set the new value.
         *
         * @param num {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public double set(double num) {
            double prev = this.num; this.num = num; return prev;
        }

        /**
         * Set the given value if the current value {@code == state}.
         *
         * @param state {@inheritDoc}
         * @param num {@inheritDoc}
         * @return {@inheritDoc}
         */
        @Override
        public boolean let(double state, double num) {
            if (java.lang.Double.compare(this.num, state) != 0)
                return false;
            this.num = num; return true;
        }
    }


    /**
     * Return the empty object reference value holder.
     *
     * @param <V> the type of the value
     * @return the empty object reference value holder
     */
    public static <V> Variable<V> var() {
        return new Variable<>();
    }

    /**
     * Return the object reference value holder by the given value.
     *
     * @param value the given initial value
     * @param <V> the type of the value
     * @return the object reference value holder by the given value
     */
    public static <V> Variable<V> var(V value) {
        return new Variable<>(value);
    }

    /**
     * Return the boolean value holder by the given value.
     *
     * @param value the given initial value
     * @return the boolean value holder by the given value
     */
    public static Boolean var(boolean value) {
        return new Boolean(value);
    }

    /**
     * Return the char value holder by the given value.
     *
     * @param value the given initial value
     * @return the char value holder by the given value
     */
    public static Char var(char value) {
        return new Char(value);
    }

    /**
     * Return the byte value holder by the given value.
     *
     * @param value the given initial value
     * @return the byte value holder by the given value
     */
    public static Byte var(byte value) {
        return new Byte(value);
    }

    /**
     * Return the short value holder by the given value.
     *
     * @param value the given initial value
     * @return the short value holder by the given value
     */
    public static Short var(short value) {
        return new Short(value);
    }

    /**
     * Return the int value holder by the given value.
     *
     * @param value the given initial value
     * @return the int value holder by the given value
     */
    public static Int var(int value) {
        return new Int(value);
    }

    /**
     * Return the long value holder by the given value.
     *
     * @param value the given initial value
     * @return the long value holder by the given value
     */
    public static Long var(long value) {
        return new Long(value);
    }

    /**
     * Return the float value holder by the given value.
     *
     * @param value the given initial value
     * @return the float value holder by the given value
     */
    public static Float var(float value) {
        return new Float(value);
    }

    /**
     * Return the double value holder by the given value.
     *
     * @param value the given initial value
     * @return the double value holder by the given value
     */
    public static Double var(double value) {
        return new Double(value);
    }
}
