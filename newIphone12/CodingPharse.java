package newIphone12;

public abstract class CodingPharse implements DesignPhrase, Rephrase {
    @Override
    public void gambling() {
        System.out.println("people can gamble.");
    }

    @Override
    public void colors() {
        System.out.println("We have different colors phone.");
    }

    @Override
    public void gaming() {
        System.out.println("we can include a lot of games.");
    }

    @Override
    public void call() {
        System.out.println("we can make a call.");
    }

    @Override
    public void tex() {
        System.out.println("we can also text.");
    }
    public void camera(){
        System.out.println("we can have a nice camera.");
    }
    public abstract void messenger();

    }

