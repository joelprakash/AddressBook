package hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by joelprakash on 2/9/2017.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class RepositoryTest {

    @Test
    public void testApp(){
        assertEquals(1,1);
    }
}
