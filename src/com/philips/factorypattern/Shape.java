package com.philips.factorypattern;

// we create object without exposing the creation logic to the client and refer to newly created object using a
// common interface
public interface Shape {
    void draw();
}
