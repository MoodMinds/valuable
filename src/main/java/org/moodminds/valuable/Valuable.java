package org.moodminds.valuable;

/**
 * Mutable value accessor generally intended for usage in anonymous instances and lambdas.
 */
public interface Valuable<V> {

    /**
     * Return the value.
     *
     * @return the value
     */
    V get();

    /**
     * Set the given value.
     *
     * @param val the given value
     */
    void set(V val);

    /**
     * Get the previous value possible atomically for threadsafe and set the new value.
     *
     * @param val the new value to set
     * @return the previous value
     */
    V get(V val);

    /**
     * Set the given value possibly atomically for threadsafe if the current value {@code == state}.
     *
     * @param state the given expected current
     * @param val the given value
     * @return {@code true} if successfully set to the new value, or {@code false} otherwise
     */
    boolean set(V state, V val);


    /**
     * A boolean value accessor.
     */
    interface Boolean {

        /**
         * Return the value.
         *
         * @return the value
         */
        boolean get();

        /**
         * Set the given value.
         *
         * @param flg the given value
         */
        void set(boolean flg);

        /**
         * Get the previous value possible atomically for threadsafe and set the new value.
         *
         * @param flg the new value to set
         * @return the previous value
         */
        boolean get(boolean flg);

        /**
         * Set the given value possibly atomically for threadsafe if the current value {@code == state}.
         *
         * @param state the given expected current
         * @param flg the given value
         * @return {@code true} if successfully set to the new value, or {@code false} otherwise
         */
        boolean set(boolean state, boolean flg);
    }

    /**
     * A char value accessor.
     */
    interface Char {

        /**
         * Return the value.
         *
         * @return the value
         */
        char get();

        /**
         * Set the given value.
         *
         * @param chr the given value
         */
        void set(char chr);

        /**
         * Get the previous value possible atomically for threadsafe and set the new value.
         *
         * @param chr the new value to set
         * @return the previous value
         */
        char get(char chr);

        /**
         * Set the given value possibly atomically for threadsafe if the current value {@code == state}.
         *
         * @param state the given expected current
         * @param chr the given value
         * @return {@code true} if successfully set to the new value, or {@code false} otherwise
         */
        boolean set(char state, char chr);
    }

    /**
     * A byte value accessor.
     */
    interface Byte {

        /**
         * Return the value.
         *
         * @return the value
         */
        byte get();

        /**
         * Set the given value.
         *
         * @param num the given value
         */
        void set(byte num);

        /**
         * Get the previous value possible atomically for threadsafe and set the new value.
         *
         * @param num the new value to set
         * @return the previous value
         */
        byte get(byte num);

        /**
         * Set the given value possibly atomically for threadsafe if the current value {@code == state}.
         *
         * @param state the given expected current
         * @param num the given value
         * @return {@code true} if successfully set to the new value, or {@code false} otherwise
         */
        boolean set(byte state, byte num);

        /**
         * Increment value possibly atomically for threadsafe and return.
         *
         * @return incremented value
         */
        byte incr();

        /**
         * Decrement value possibly atomically for threadsafe and return.
         *
         * @return decremented value
         */
        byte decr();
    }

    /**
     * A short value accessor.
     */
    interface Short {

        /**
         * Return the value.
         *
         * @return the value
         */
        short get();

        /**
         * Set the given value.
         *
         * @param num the given value
         */
        void set(short num);

        /**
         * Get the previous value possible atomically for threadsafe and set the new value.
         *
         * @param num the new value to set
         * @return the previous value
         */
        short get(short num);

        /**
         * Set the given value possibly atomically for threadsafe if the current value {@code == state}.
         *
         * @param state the given expected current
         * @param num the given value
         * @return {@code true} if successfully set to the new value, or {@code false} otherwise
         */
        boolean set(short state, short num);

        /**
         * Increment value possibly atomically for threadsafe and return.
         *
         * @return incremented value
         */
        short incr();

        /**
         * Decrement value possibly atomically for threadsafe and return.
         *
         * @return decremented value
         */
        short decr();
    }

    /**
     * An int value accessor.
     */
    interface Int {

        /**
         * Return the value.
         *
         * @return the value
         */
        int get();

        /**
         * Set the given value.
         *
         * @param num the given value
         */
        void set(int num);

        /**
         * Get the previous value possible atomically for threadsafe and set the new value.
         *
         * @param num the new value to set
         * @return the previous value
         */
        int get(int num);

        /**
         * Set the given value possibly atomically for threadsafe if the current value {@code == state}.
         *
         * @param state the given expected current
         * @param num the given value
         * @return {@code true} if successfully set to the new value, or {@code false} otherwise
         */
        boolean set(int state, int num);

        /**
         * Increment value possibly atomically for threadsafe and return.
         *
         * @return incremented value
         */
        int incr();

        /**
         * Decrement value possibly atomically for threadsafe and return.
         *
         * @return decremented value
         */
        int decr();
    }

    /**
     * A long value accessor.
     */
    interface Long {

        /**
         * Return the value.
         *
         * @return the value
         */
        long get();

        /**
         * Set the given value.
         *
         * @param num the given value
         */
        void set(long num);

        /**
         * Get the previous value possible atomically for threadsafe and set the new value.
         *
         * @param num the new value to set
         * @return the previous value
         */
        long get(long num);

        /**
         * Set the given value possibly atomically for threadsafe if the current value {@code == state}.
         *
         * @param state the given expected current
         * @param num the given value
         * @return {@code true} if successfully set to the new value, or {@code false} otherwise
         */
        boolean set(long state, long num);

        /**
         * Increment value possibly atomically for threadsafe and return.
         *
         * @return incremented value
         */
        long incr();

        /**
         * Decrement value possibly atomically for threadsafe and return.
         *
         * @return decremented value
         */
        long decr();
    }

    /**
     * A float value accessor.
     */
    interface Float {

        /**
         * Return the value.
         *
         * @return the value
         */
        float get();

        /**
         * Set the given value.
         *
         * @param num the given value
         */
        void set(float num);

        /**
         * Get the previous value possible atomically for threadsafe and set the new value.
         *
         * @param num the new value to set
         * @return the previous value
         */
        float get(float num);

        /**
         * Set the given value possibly atomically for threadsafe if the current value {@code == state}.
         *
         * @param state the given expected current
         * @param num the given value
         * @return {@code true} if successfully set to the new value, or {@code false} otherwise
         */
        boolean set(float state, float num);
    }

    /**
     * A double value accessor.
     */
    interface Double {

        /**
         * Return the value.
         *
         * @return the value
         */
        double get();

        /**
         * Set the given value.
         *
         * @param num the given value
         */
        void set(double num);

        /**
         * Get the previous value possible atomically for threadsafe and set the new value.
         *
         * @param num the new value to set
         * @return the previous value
         */
        double get(double num);

        /**
         * Set the given value possibly atomically for threadsafe if the current value {@code == state}.
         *
         * @param state the given expected current
         * @param num the given value
         * @return {@code true} if successfully set to the new value, or {@code false} otherwise
         */
        boolean set(double state, double num);
    }
}
