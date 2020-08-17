package dellComputer;

public abstract class CodingInterface implements DesignInterface, DellSuperComputer {
    @Override
    public void telecast() {
        System.out.println("Dell computer can telecast online program.");
    }

    @Override
    public void onlineActivity() {
        System.out.println("We can do a lot of online activity using the Dell computer. We can do our daily activities in online using many software.");
    }

    @Override
    public void onlineGaming() {
        System.out.println("Online gaming has becoming very popular these days. People spend their spare time playing games in home. ");

    }

    @Override
    public void watchingMovies() {
        System.out.println("In the most recent times, people spend most of their time watching online movies. Netflix doing a great business now. ");

    }
    public void transaction(){
        System.out.println("We can do online transaction using dell computer.");
    }

    public abstract void hangout();
}
