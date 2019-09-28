package org.mql.Jenkins.example1.p01_Jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DimensionTest 
{
	  @Test
	  void verifierAttributs()
	  {
	    Dimension dim = new Dimension(800, 600);
	    Assertions.assertAll("Dimensions non conformes",
	      () -> Assertions.assertTrue(dim.getWidth() == 800, "Valeur de width erronee"),
	      () -> Assertions.assertTrue(dim.getHeight() == 600, "Valeur de height erronee"));
	  }
}

