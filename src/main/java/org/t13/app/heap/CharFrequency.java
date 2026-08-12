package org.t13.app.heap;

class CharFrequency{
    int freq;
    String str;

    public CharFrequency(int freq, String str) {
        this.freq = freq;
        this.str = str;
    }

    @Override
    public String toString() {
        return str + "|" + freq;
    }
}