package com.jdc;

public class Main {
    static void main() {
        BackendLayer backendLayer = new BackendLayer();
        MiddleLayer middleLayer = new MiddleLayer(backendLayer);
        FrontEnd frontEnd = new FrontEnd(middleLayer);
        frontEnd.help(3);
    }
}
