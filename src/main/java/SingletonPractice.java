public class SingletonPractice {

    private static SingletonPractice instance;
    private SingletonPractice(){}

    public static SingletonPractice getInstance(){
        if( instance == null){
            return instance = new SingletonPractice();
        }
        else{
            return instance;
        }

    }

}
