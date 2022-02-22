import jdk.nashorn.internal.ir.annotations.Ignore;

import static org.junit.jupiter.api.Assertions.*;

class TestSingleton {

    @org.junit.jupiter.api.Test
    void getInstance() {
        assertNotNull(Singleton.getInstance());
    }

    @org.junit.jupiter.api.Test
    @Ignore
    void readResolve() {
    }

    @org.junit.jupiter.api.Test
    void getValue() {
       Singleton singleton = Singleton.getInstance();
       singleton.setValue(15);
       assertEquals(15,singleton.getValue());
    }

    @org.junit.jupiter.api.Test
    @Ignore
    void setValue(){
        Singleton singleton = Singleton.getInstance();
        singleton.setValue(15);
        assertEquals(15,singleton.getValue());

    }
}