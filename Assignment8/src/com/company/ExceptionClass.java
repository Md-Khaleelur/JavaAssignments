package com.company;
class EmptyWeightException extends Exception{
    public EmptyWeightException(String s){
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
