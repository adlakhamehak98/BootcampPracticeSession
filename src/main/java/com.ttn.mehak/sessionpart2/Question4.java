package main.java.com.ttn.mehak.sessionpart2;

//WAP to create singleton class.
    class SingletonClass {

        private static SingletonClass singleton = new SingletonClass( );

        /* private Constructor so that no other class can instantiate*/
        private SingletonClass() { }

        /* Static 'instance' method */
        public static SingletonClass getInstance( ) {
            return singleton;
        }

        /* Extra method */
        protected static void demoMethod( ) {
            System.out.println("demoMethod for singleton");
        }
    }

public class Question4 {

    public static void main(String[] args) {
        SingletonClass tmp = SingletonClass.getInstance( );
        tmp.demoMethod( );
    }
}
