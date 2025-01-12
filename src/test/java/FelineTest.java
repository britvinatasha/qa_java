import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    Feline feline;

    @Before
    public void before() {
        feline = new Feline();
    }

    @Test
    public void testEatMeat() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        assertEquals("Список еды не соответствует хищнику",
                expectedResult, actualResult);
    }

    @Test
    public void testGetFamily()  {
        String expectedFamily = "Кошачьи";
        assertEquals("Должно вернуться семейство Кошачьих",
                expectedFamily, feline.getFamily());
    }

    @Test
    public void testGetKittens() {
        int expectedResult = 1;
        int actualResult = feline.getKittens();
        assertEquals("Должно вернуться значение 1",
                expectedResult, actualResult);
    }

    @Test
    public void testGetKittensWithParam() {
        int expectedResult = 1;
        int actualResult = feline.getKittens(1);
        assertEquals("Должно вернуться значение 1",
                expectedResult, actualResult);
    }
}