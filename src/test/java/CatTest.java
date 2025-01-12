import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;



@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    Cat cat;

    @Before
    public void before() {
        cat = new Cat(feline);
    }

    @Mock
    Feline feline;

    @Test
    public void testGetFood() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals("Список еды не соответствует хищнику",
                List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }


    @Test
    public void testGetSound() {
        String expectedResult = "Мяу";
        String actualResult = cat.getSound();
        assertEquals("Кот издает другой звук",
                expectedResult, actualResult);
    }
}
