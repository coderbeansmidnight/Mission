package space;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class MissionTest {
    Mission a;
    Mission b;
    Mission c;
    Mission d;

	@Before
	public void setUp() throws Exception {
		a = new Mission("Mars", 3421.3f);
		b = new Mission("Jupiter", 3421.3f);
		c = new Mission("Mars", 3421.3f);
		d = new Mission("Venus", 19483f);
		
		
		
	}

    @Test
    public void equalsTrue()
    {
        assertTrue(a.equals(c));
    }

    @Test
    public void equalsFalse()
    {
        assertFalse(a.equals(d));
    }

    @Test
    public void compareToEqual()
    {
        assertTrue(a.compareTo(c) ==0);
    }

    @Test
    public void compareToLessThan()
    {
        assertTrue(a.compareTo(d)<0);
    }

    @Test
    public void compareToGreaterThan()
    {
        assertTrue(a.compareTo(b)>0);
    }

    @Test
    public void hashCodesWork()
    {
        assertTrue(a.hashCode() == c.hashCode());
    }
}
