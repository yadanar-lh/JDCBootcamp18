package com.jdc;

public class Main {
    static void main() {
        TwoStringClass tw = new TwoStringClass();
        new MyThreadClass("Hello!", "Coders...",tw);
        new MyThreadClass("How are you doing?","CountryMen...",tw);
        new MyThreadClass("Hey Blue!", "Happy Coding!",tw);
    }
}
