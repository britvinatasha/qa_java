import com.example.FelineInterface;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private FelineInterface felineInterface;

    private Lion lion;

    @Before
    public void before() throws Exception {
        lion = new Lion(felineInterface, "Самец");
    }


    @Test(expected = Exception.class)
    public void testLionException() throws Exception {
        new Lion(felineInterface, "Лев");
    }

    @Test
    public void testGetKittens() {
        Mockito.when(felineInterface.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
        Mockito.verify(felineInterface, Mockito.times(1)).getKittens();
    }

    @Test
    public void testGetFood() throws Exception {
        Mockito.when(felineInterface.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
