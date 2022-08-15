import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.keyin.entity.Breed;
import com.keyin.entity.Health;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)

public class HealthTest {

    @Mock
    private Health healthUnderTest = Mockito.mock(Health.class);

    @Test
    public void testGetId(){
        Health healthUnderTest = new Health();
        healthUnderTest.setId(1);
        assertEquals(1, healthUnderTest.getId());


    }

    @Test
    public void testGetWeight(){
        Health healthUnderTest = new Health();
        healthUnderTest.setWeight(40);
        assertEquals(40, healthUnderTest.getWeight());


    }

    @Test
    public void getHeight(){
        Health healthUnderTest = new Health();
        healthUnderTest.setHeight(3);
        assertEquals(3,healthUnderTest.getHeight());
    }
}
