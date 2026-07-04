package others;

public class SingletonPerson {
    private static volatile SingletonPerson SINGLETON_PERSON_INSTANCE;

    private SingletonPerson() {}

    public static SingletonPerson getSINGLETON_PERSON_INSTANCE() {
        if (SINGLETON_PERSON_INSTANCE == null) {
            synchronized (SingletonPerson.class) {
                if (SINGLETON_PERSON_INSTANCE == null) {
                    SINGLETON_PERSON_INSTANCE = new SingletonPerson();
                }
            }
        }
        return SINGLETON_PERSON_INSTANCE;
    }

}
