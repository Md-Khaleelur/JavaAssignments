package com.company;
class InvalidWeightException extends Exception{
    public InvalidWeightException(String s){
        super(s);
    }
}

class LessWeightException extends Exception{
    public LessWeightException(String s){
        super(s);
    }
}

class OverWeightException extends Exception{
    public OverWeightException(String s){
        super(s);
    }
}
