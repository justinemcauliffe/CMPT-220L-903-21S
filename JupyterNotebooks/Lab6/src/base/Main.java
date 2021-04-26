package base;
// We want to create our own object (lets call it listItem) that will hold a value and another instance of our object that we created.
// listItem (recommended basic configuration (feel free to change this if you think you need to))
// value = <Any Data Type> (value in the constructor)
// listItem = None (value in the constructor)
// Be able to chain our objects together
// Chain 4 instances of our list items together

public class Main {
    public Main(String emotion) {
        // This constructor has one parameter, name.
        System.out.println("I am " + emotion );
    }

    public static void main(String []args) {
        // Following statement would create an object myPuppy
        Main Emotion = new Main( "happy" );
    }
}