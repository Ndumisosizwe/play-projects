package roman.test;

import org.junit.Test;

import junit.framework.TestCase;
import roman.DecimalToRoman;
import roman.RomanToDecimal;

public class RomanTest extends TestCase {

  @Test
  public void testShouldReturnRomanNotation() {
    assertEquals( "I", DecimalToRoman.toRoman( 1 ) );
    assertEquals( "LVI", DecimalToRoman.toRoman( 56 ) );
    assertEquals( "MII", DecimalToRoman.toRoman( 1002 ) );
    assertEquals( "DXL", DecimalToRoman.toRoman( 540 ) );
  }

  @Test
  public void testShouldReturnDecimalFromGivenRoman() {
    assertEquals( 1002, RomanToDecimal.toDecimal( "MII" ) );
    assertEquals( 56, RomanToDecimal.toDecimal( "LVI" ) );
    assertEquals( 1, RomanToDecimal.toDecimal( "I" ) );
    assertEquals( 2, RomanToDecimal.toDecimal( "II" ) );
    assertEquals( 365, RomanToDecimal.toDecimal( "CCCLXV" ) );
    assertEquals( 10_000, RomanToDecimal.toDecimal( "MMMMMMMMMM" ) );
    assertEquals( 540, RomanToDecimal.toDecimal( "DXL" ) );
    assertEquals( 15784, RomanToDecimal.toDecimal( "MMMMMMMMMMMMMMMDCCLXXXIV" ) );
    assertEquals( 788, RomanToDecimal.toDecimal( "DCCLXXXVIII" ) );
    assertEquals( 478, RomanToDecimal.toDecimal( "CDLXXVIII" ) );
  }
}
